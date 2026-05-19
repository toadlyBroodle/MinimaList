package ca.toadlybroodledev.minimalist;

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

import ca.toadlybroodledev.minimalist.db.OutlineRepository;
import ca.toadlybroodledev.minimalist.db.OutlineRepositoryImpl;
import ca.toadlybroodledev.minimalist.db.MinimaListDatabase;
import ca.toadlybroodledev.minimalist.model.OutlineRow;

// Ported from decompiled AppMain. Application subclass.
// Phase 3.2/3.5: analytics fields, analytics-log wrapper, and license-key fragment removed.
// Phase 4.5: MultiDex.install() removed — minSdk 21 has native multidex support.
// Phase 9.2a: owns MinimaListDatabase + OutlineRepository singletons + a single-thread IO executor;
//             runs a one-shot legacy-Gson → Room migration on first launch.
// Phase 10.2: applicationId moved from ca.toadlybroodledev.sublist → ca.toadlybroodledev.minimalist.
//             The new package gets a fresh /data/data/ sandbox, so the legacy-Gson reader in
//             readLegacyCollection() only catches in-place upgrades. A separate cross-package
//             hook (migrateLegacyPackage) names the old applicationId so a future shared-UID or
//             adb-pull workflow has a single, named call site to wire data movement through.
public class AppMain extends Application {

    public static final String CHANNEL_REMINDERS = "reminders";

    /** Phase 10.2: legacy applicationId. The Phase 9.2a legacy-Gson reader runs against the
     *  new package's sandbox; cross-package recovery from the old install lives under this
     *  /data/data/&lt;legacy&gt;/files/ path and is best-effort under standard Android sandboxing. */
    public static final String LEGACY_PACKAGE = "ca.toadlybroodledev.sublist";
    static final String LEGACY_DATA_DIR = "/data/data/" + LEGACY_PACKAGE + "/files";

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

        MinimaListDatabase db = MinimaListDatabase.getInstance(this);
        REPOSITORY = new OutlineRepositoryImpl(db);
        EXECUTOR = Executors.newSingleThreadExecutor();

        EXECUTOR.execute(() -> migrateLegacyIfNeeded(getApplicationContext()));
        EXECUTOR.execute(() -> migrateLegacyPackage(getApplicationContext()));
    }

    /**
     * Phase 10.2 stub: best-effort recovery of an outline collection from the legacy
     * {@code ca.toadlybroodledev.sublist} install. Standard Android sandboxing blocks
     * direct cross-package filesDir reads, so on a stock install this is a no-op log.
     * The named entry point keeps a single, discoverable call site for a future shared-UID
     * manifest declaration, a {@code BackupAgentHelper}, or an {@code adb pull / push}-driven
     * recovery workflow without having to reshape callers.
     */
    static void migrateLegacyPackage(android.content.Context ctx) {
        File legacy = new File(LEGACY_DATA_DIR, "sublist_collection");
        if (legacy.canRead()) {
            Log.d(TAG, "legacy-package data readable at " + legacy.getAbsolutePath()
                    + "; cross-package import not yet wired");
        } else {
            Log.d(TAG, "legacy-package " + LEGACY_PACKAGE
                    + " data not readable from new sandbox (expected on stock Android)");
        }
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
