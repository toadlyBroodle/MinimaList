package ca.toadlybroodledev.sublist;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ca.toadlybroodledev.sublist.db.OutlineRepository;
import ca.toadlybroodledev.sublist.db.OutlineRepositoryImpl;
import ca.toadlybroodledev.sublist.db.SublistDatabase;
import ca.toadlybroodledev.sublist.model.OutlineRow;

// Ported from decompiled AppMain. Application subclass.
// Phase 3.2/3.5: analytics fields, analytics-log wrapper, and license-key fragment removed.
// Phase 4.5: MultiDex.install() removed — minSdk 21 has native multidex support.
// Phase 9.2a: owns SublistDatabase + OutlineRepository singletons + a single-thread IO executor;
//             runs a one-shot legacy-Gson → Room migration on first launch.
public class AppMain extends Application {

    public static final String CHANNEL_REMINDERS = "reminders";

    private static final String TAG = "fucknAppMain";
    private static final String MIGRATED_FLAG = "repo_migrated_v1";

    private static volatile OutlineRepository REPOSITORY;
    private static volatile ExecutorService EXECUTOR;

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_REMINDERS,
                    getString(R.string.reminder_notification_title),
                    NotificationManager.IMPORTANCE_DEFAULT);
            ((NotificationManager) getSystemService(NOTIFICATION_SERVICE))
                    .createNotificationChannel(channel);
        }

        SublistDatabase db = SublistDatabase.getInstance(this);
        REPOSITORY = new OutlineRepositoryImpl(db);
        EXECUTOR = Executors.newSingleThreadExecutor();

        EXECUTOR.execute(() -> migrateLegacyIfNeeded(getApplicationContext()));
    }

    public static OutlineRepository repository() {
        return REPOSITORY;
    }

    public static Executor io() {
        return EXECUTOR;
    }

    private void migrateLegacyIfNeeded(android.content.Context ctx) {
        SharedPreferences prefs = ctx.getSharedPreferences("SublistPrefsFile", 0);
        if (prefs.getBoolean(MIGRATED_FLAG, false)) {
            return;
        }
        HashMap<String, ArrayList<OutlineRow>> legacy = readLegacyCollection(ctx);
        if (legacy != null && !legacy.isEmpty()) {
            REPOSITORY.importLegacy(legacy);
            Log.d(TAG, "imported " + legacy.size() + " legacy sublist(s) into Room");
        } else {
            Log.d(TAG, "no legacy outline collection found; nothing to import");
        }
        prefs.edit().putBoolean("repo_migrated_v1", true).apply();
    }

    private HashMap<String, ArrayList<OutlineRow>> readLegacyCollection(android.content.Context ctx) {
        File file = new File(ctx.getFilesDir(), "sublist_collection");
        if (!file.exists()) return null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            String json = (String) ois.readObject();
            return new Gson().fromJson(json,
                    new TypeToken<HashMap<String, ArrayList<OutlineRow>>>() {}.getType());
        } catch (Exception e) {
            Log.w(TAG, "legacy outline collection read failed: " + e.getMessage());
            return null;
        }
    }
}
