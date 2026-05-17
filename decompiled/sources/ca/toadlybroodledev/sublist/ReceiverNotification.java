package ca.toadlybroodledev.sublist;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p006a.C0136ab;
import android.support.v4.p006a.C0145ak;

/* JADX INFO: loaded from: classes.dex */
public class ReceiverNotification extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            String charSequence = intent.hasExtra("notification") ? intent.getExtras().getCharSequence("notification") : "";
            C0136ab.c cVarM788b = new C0136ab.c(context).m778a(R.drawable.minimalist_nav_drawer_logo).m783a((CharSequence) context.getString(R.string.reminder_notification_title)).m788b(charSequence);
            Intent intent2 = new Intent(context, (Class<?>) ActMain.class);
            C0145ak c0145akM818a = C0145ak.m818a(context);
            c0145akM818a.m824a(ActMain.class);
            c0145akM818a.m823a(intent2);
            cVarM788b.m780a(c0145akM818a.m819a(0, 134217728));
            ((NotificationManager) context.getSystemService("notification")).notify(charSequence.hashCode(), cVarM788b.m777a());
        } catch (Exception e) {
            e.printStackTrace();
            AppMain.m4792a("RemindNotifSent_false", "reminder_notif_fail");
        }
        AppMain.m4792a("RemindNotifSent_true", "reminder_notif_sent");
    }
}
