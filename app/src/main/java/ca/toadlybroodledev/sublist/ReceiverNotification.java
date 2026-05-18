package ca.toadlybroodledev.sublist;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

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
            PendingIntent pi = stack.getPendingIntent(0, 134217728);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(
                    context, AppMain.CHANNEL_REMINDERS)
                    .setSmallIcon(R.drawable.minimalist_nav_drawer_logo)
                    .setContentTitle(context.getString(R.string.reminder_notification_title))
                    .setContentText(text)
                    .setContentIntent(pi);
            ((NotificationManager) context.getSystemService("notification"))
                    .notify(text.hashCode(), builder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
