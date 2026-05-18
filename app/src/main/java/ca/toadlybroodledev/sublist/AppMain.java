package ca.toadlybroodledev.sublist;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

// Ported from decompiled AppMain. Application subclass.
// Phase 3.2/3.5: analytics fields, analytics-log wrapper, and license-key fragment removed.
// Phase 4.5: MultiDex.install() removed — minSdk 21 has native multidex support.
public class AppMain extends Application {

    public static final String CHANNEL_REMINDERS = "reminders";

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
    }
}
