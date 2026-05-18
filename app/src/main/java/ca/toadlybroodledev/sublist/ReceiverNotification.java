package ca.toadlybroodledev.sublist;

import android.Manifest;
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

// Ported from decompiled ReceiverNotification. Fires a local notification for set reminders.
public class ReceiverNotification extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
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
}
