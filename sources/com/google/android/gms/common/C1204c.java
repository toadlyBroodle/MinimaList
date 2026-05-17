package com.google.android.gms.common;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.p006a.ActivityC0155k;
import android.support.v4.p006a.C0136ab;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1110ay;
import com.google.android.gms.common.api.internal.C1109ax;
import com.google.android.gms.common.api.internal.InterfaceC1117be;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC1252bn;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1251bm;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: renamed from: com.google.android.gms.common.c */
/* JADX INFO: loaded from: classes.dex */
public class C1204c extends C1283m {

    /* JADX INFO: renamed from: e */
    private String f5829e;

    /* JADX INFO: renamed from: c */
    private static final Object f5827c = new Object();

    /* JADX INFO: renamed from: d */
    private static final C1204c f5828d = new C1204c();

    /* JADX INFO: renamed from: a */
    public static final int f5826a = C1283m.f5983b;

    /* JADX INFO: renamed from: com.google.android.gms.common.c$a */
    @SuppressLint({"HandlerLeak"})
    class a extends Handler {

        /* JADX INFO: renamed from: a */
        private final Context f5830a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f5830a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    int iMo7040a = C1204c.this.mo7040a(this.f5830a);
                    if (C1204c.this.mo7045a(iMo7040a)) {
                        C1204c.this.m7044a(this.f5830a, iMo7040a);
                    }
                    break;
                default:
                    Log.w("GoogleApiAvailability", new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what).toString());
                    break;
            }
        }
    }

    C1204c() {
    }

    /* JADX INFO: renamed from: a */
    public static Dialog m7032a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C1251bm.m7169c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        m7037a(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    /* JADX INFO: renamed from: a */
    static Dialog m7033a(Context context, int i, AbstractDialogInterfaceOnClickListenerC1252bn abstractDialogInterfaceOnClickListenerC1252bn, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1251bm.m7169c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strM7171e = C1251bm.m7171e(context, i);
        if (strM7171e != null) {
            builder.setPositiveButton(strM7171e, abstractDialogInterfaceOnClickListenerC1252bn);
        }
        String strM7164a = C1251bm.m7164a(context, i);
        if (strM7164a != null) {
            builder.setTitle(strM7164a);
        }
        return builder.create();
    }

    /* JADX INFO: renamed from: a */
    public static C1109ax m7034a(Context context, AbstractC1110ay abstractC1110ay) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1109ax c1109ax = new C1109ax(abstractC1110ay);
        context.registerReceiver(c1109ax, intentFilter);
        c1109ax.m6846a(context);
        if (C1319w.m7309a(context, "com.google.android.gms")) {
            return c1109ax;
        }
        abstractC1110ay.mo6748a();
        c1109ax.m6845a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C1204c m7035a() {
        return f5828d;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private final String m7036a(Context context, NotificationManager notificationManager) {
        C1221aj.m7070a(C1310n.m7286i());
        String strM7039c = m7039c();
        if (strM7039c == null) {
            strM7039c = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String strM7163a = C1251bm.m7163a(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strM7163a, 4));
            } else if (!strM7163a.equals(notificationChannel.getName())) {
                notificationChannel.setName(strM7163a);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        return strM7039c;
    }

    /* JADX INFO: renamed from: a */
    static void m7037a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0155k) {
            C1208g.m7052a(dialog, onCancelListener).mo870a(((ActivityC0155k) activity).m1012f(), str);
        } else {
            DialogFragmentC1203b.m7031a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    /* JADX INFO: renamed from: a */
    private final void m7038a(Context context, int i, String str, PendingIntent pendingIntent) {
        Notification notificationM777a;
        int i2;
        if (i == 18) {
            m7049b(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM7168b = C1251bm.m7168b(context, i);
        String strM7170d = C1251bm.m7170d(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (C1304h.m7265b(context)) {
            C1221aj.m7070a(C1310n.m7283f());
            Notification.Builder builderAddAction = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(strM7168b).setStyle(new Notification.BigTextStyle().bigText(strM7170d)).addAction(C0651a.b.common_full_open_on_phone, resources.getString(C0651a.d.common_open_on_phone), pendingIntent);
            if (C1310n.m7286i() && C1310n.m7286i()) {
                builderAddAction.setChannelId(m7036a(context, notificationManager));
            }
            notificationM777a = builderAddAction.build();
        } else {
            C0136ab.c cVarM782a = new C0136ab.c(context).m778a(R.drawable.stat_sys_warning).m790c(resources.getString(C0651a.d.common_google_play_services_notification_ticker)).m779a(System.currentTimeMillis()).m785a(true).m780a(pendingIntent).m783a((CharSequence) strM7168b).m788b(strM7170d).m789b(true).m782a(new C0136ab.b().m773a(strM7170d));
            if (C1310n.m7286i() && C1310n.m7286i()) {
                cVarM782a.m784a(m7036a(context, notificationManager));
            }
            notificationM777a = cVarM782a.m777a();
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                i2 = 10436;
                C1319w.f6056c.set(false);
                break;
            default:
                i2 = 39789;
                break;
        }
        notificationManager.notify(i2, notificationM777a);
    }

    /* JADX INFO: renamed from: c */
    private final String m7039c() {
        String str;
        synchronized (f5827c) {
            str = this.f5829e;
        }
        return str;
    }

    @Override // com.google.android.gms.common.C1283m
    /* JADX INFO: renamed from: a */
    public int mo7040a(Context context) {
        return super.mo7040a(context);
    }

    /* JADX INFO: renamed from: a */
    public Dialog m7041a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m7033a(activity, i, AbstractDialogInterfaceOnClickListenerC1252bn.m7172a(activity, C1283m.m7220a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // com.google.android.gms.common.C1283m
    /* JADX INFO: renamed from: a */
    public PendingIntent mo7042a(Context context, int i, int i2) {
        return super.mo7042a(context, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent m7043a(Context context, C1071a c1071a) {
        return c1071a.m6611a() ? c1071a.m6614d() : mo7042a(context, c1071a.m6613c(), 0);
    }

    /* JADX INFO: renamed from: a */
    public void m7044a(Context context, int i) {
        m7038a(context, i, (String) null, m7226a(context, i, 0, "n"));
    }

    @Override // com.google.android.gms.common.C1283m
    /* JADX INFO: renamed from: a */
    public final boolean mo7045a(int i) {
        return super.mo7045a(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7046a(Activity activity, InterfaceC1117be interfaceC1117be, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM7033a = m7033a(activity, i, AbstractDialogInterfaceOnClickListenerC1252bn.m7173a(interfaceC1117be, C1283m.m7220a(activity, i, "d"), 2), onCancelListener);
        if (dialogM7033a == null) {
            return false;
        }
        m7037a(activity, dialogM7033a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7047a(Context context, C1071a c1071a, int i) {
        PendingIntent pendingIntentM7043a = m7043a(context, c1071a);
        if (pendingIntentM7043a == null) {
            return false;
        }
        m7038a(context, c1071a.m6613c(), (String) null, GoogleApiActivity.m6621a(context, pendingIntentM7043a, i));
        return true;
    }

    @Override // com.google.android.gms.common.C1283m
    /* JADX INFO: renamed from: b */
    public final String mo7048b(int i) {
        return super.mo7048b(i);
    }

    /* JADX INFO: renamed from: b */
    final void m7049b(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7050b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM7041a = m7041a(activity, i, i2, onCancelListener);
        if (dialogM7041a == null) {
            return false;
        }
        m7037a(activity, dialogM7041a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
