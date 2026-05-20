package ca.toadlybroodle.minimalist;

import android.Manifest;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;

import ca.toadlybroodle.minimalist.db.OutlineRepository;
import ca.toadlybroodle.minimalist.db.entity.OutlineRowEntity;

import java.util.List;

// Ported from decompiled ReceiverNotification. Fires a local notification for set reminders.
// Phase 8.2: handles BOOT_COMPLETED to reschedule reminder alarms lost on device restart.
public class ReceiverNotification extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            rescheduleAlarmsAfterBoot(context);
            return;
        }
        try {
            CharSequence text = intent.hasExtra("notification")
                    ? intent.getExtras().getCharSequence("notification") : "";
            TaskStackBuilder stack = TaskStackBuilder.create(context);
            stack.addParentStack(MainActivity.class);
            stack.addNextIntent(new Intent(context, MainActivity.class));
            PendingIntent pi = stack.getPendingIntent(0,
                    PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(
                    context, AppMain.CHANNEL_REMINDERS)
                    .setSmallIcon(R.drawable.minimalist_nav_drawer_logo)
                    .setContentTitle(context.getString(R.string.reminder_notification_title))
                    .setContentText(text)
                    .setContentIntent(pi);
            NotificationManager nm = (NotificationManager) context.getSystemService(
                    Context.NOTIFICATION_SERVICE);
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
                    || ContextCompat.checkSelfPermission(context,
                            Manifest.permission.POST_NOTIFICATIONS)
                            == PackageManager.PERMISSION_GRANTED) {
                nm.notify(text.hashCode(), builder.build());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void rescheduleAlarmsAfterBoot(Context context) {
        OutlineRepository repo = AppMain.repository();
        if (repo == null) return;
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        if (am == null) return;
        // goAsync() extends the BroadcastReceiver's deadline so the Room query (which Room
        // forbids on the main thread) can run on the IO executor without triggering
        // IllegalStateException or the 10-second ANR watchdog.
        final PendingResult pendingResult = goAsync();
        long now = System.currentTimeMillis();
        AppMain.io().execute(() -> {
            try {
                List<OutlineRowEntity> rows = repo.getRowsWithFutureReminders(now);
                for (OutlineRowEntity row : rows) {
                    Intent alarmIntent = new Intent(context, ReceiverNotification.class);
                    alarmIntent.putExtra("notification", row.text != null ? row.text : "");
                    PendingIntent pi = PendingIntent.getBroadcast(context, (int) row.id, alarmIntent,
                            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
                    am.set(AlarmManager.RTC_WAKEUP, row.reminder, pi);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (pendingResult != null) pendingResult.finish();
            }
        });
    }
}
