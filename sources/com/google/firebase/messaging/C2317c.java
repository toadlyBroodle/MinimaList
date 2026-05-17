package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.p006a.C0136ab;
import android.support.v4.p007b.C0175b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.util.C1310n;
import com.google.firebase.iid.C2314z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.c */
/* JADX INFO: loaded from: classes.dex */
final class C2317c {

    /* JADX INFO: renamed from: a */
    private static C2317c f13064a;

    /* JADX INFO: renamed from: b */
    private final Context f13065b;

    /* JADX INFO: renamed from: c */
    private Bundle f13066c;

    /* JADX INFO: renamed from: d */
    private Method f13067d;

    /* JADX INFO: renamed from: e */
    private Method f13068e;

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f13069f = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private C2317c(Context context) {
        this.f13065b = context.getApplicationContext();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private final Notification m13129a(CharSequence charSequence, String str, int i, Integer num, Uri uri, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str2) {
        Notification.Builder smallIcon = new Notification.Builder(this.f13065b).setAutoCancel(true).setSmallIcon(i);
        if (!TextUtils.isEmpty(charSequence)) {
            smallIcon.setContentTitle(charSequence);
        }
        if (!TextUtils.isEmpty(str)) {
            smallIcon.setContentText(str);
            smallIcon.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        if (num != null) {
            smallIcon.setColor(num.intValue());
        }
        if (uri != null) {
            smallIcon.setSound(uri);
        }
        if (pendingIntent != null) {
            smallIcon.setContentIntent(pendingIntent);
        }
        if (pendingIntent2 != null) {
            smallIcon.setDeleteIntent(pendingIntent2);
        }
        if (str2 != null) {
            if (this.f13067d == null) {
                this.f13067d = m13133a("setChannelId");
            }
            if (this.f13067d == null) {
                this.f13067d = m13133a("setChannel");
            }
            if (this.f13067d == null) {
                Log.e("FirebaseMessaging", "Error while setting the notification channel");
            } else {
                try {
                    this.f13067d.invoke(smallIcon, str2);
                } catch (IllegalAccessException e) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e);
                } catch (IllegalArgumentException e2) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e2);
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e3);
                } catch (InvocationTargetException e4) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e4);
                }
            }
        }
        return smallIcon.build();
    }

    /* JADX INFO: renamed from: a */
    private final Bundle m13130a() {
        if (this.f13066c != null) {
            return this.f13066c;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.f13065b.getPackageManager().getApplicationInfo(this.f13065b.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return Bundle.EMPTY;
        }
        this.f13066c = applicationInfo.metaData;
        return this.f13066c;
    }

    /* JADX INFO: renamed from: a */
    static synchronized C2317c m13131a(Context context) {
        if (f13064a == null) {
            f13064a = new C2317c(context);
        }
        return f13064a;
    }

    /* JADX INFO: renamed from: a */
    static String m13132a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static Method m13133a(String str) {
        try {
            return Notification.Builder.class.getMethod(str, String.class);
        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m13134a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private final boolean m13135a(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            Drawable drawable = this.f13065b.getResources().getDrawable(i, null);
            if (drawable.getBounds().height() != 0 && drawable.getBounds().width() != 0) {
                return true;
            }
            Log.e("FirebaseMessaging", new StringBuilder(72).append("Icon with id: ").append(i).append(" uses an invalid gradient. Using fallback icon.").toString());
            return false;
        } catch (Resources.NotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m13136a(Bundle bundle) {
        return "1".equals(m13132a(bundle, "gcm.n.e")) || m13132a(bundle, "gcm.n.icon") != null;
    }

    /* JADX INFO: renamed from: b */
    static Uri m13137b(Bundle bundle) {
        String strM13132a = m13132a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(strM13132a)) {
            strM13132a = m13132a(bundle, "gcm.n.link");
        }
        if (TextUtils.isEmpty(strM13132a)) {
            return null;
        }
        return Uri.parse(strM13132a);
    }

    /* JADX INFO: renamed from: b */
    private final Integer m13138b(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 54).append("Color ").append(str).append(" not valid. Notification will use default color.").toString());
            }
        }
        int i = m13130a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C0175b.m1341c(this.f13065b, i));
        } catch (Resources.NotFoundException e2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static String m13139b(Bundle bundle, String str) {
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf("_loc_key");
        return m13132a(bundle, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: c */
    private final String m13140c(String str) {
        if (!C1310n.m7286i()) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.f13065b.getSystemService(NotificationManager.class);
        try {
            if (this.f13068e == null) {
                this.f13068e = notificationManager.getClass().getMethod("getNotificationChannel", String.class);
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f13068e.invoke(notificationManager, str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 122).append("Notification Channel requested (").append(str).append(") has not been created by the app. Manifest configuration, or default, value will be used.").toString());
            }
            String string = m13130a().getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (this.f13068e.invoke(notificationManager, string) != null) {
                    return string;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (this.f13068e.invoke(notificationManager, "fcm_fallback_notification_channel") == null) {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance("fcm_fallback_notification_channel", this.f13065b.getString(C0651a.d.fcm_fallback_notification_channel_label), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (ClassNotFoundException e) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e3);
            return null;
        } catch (InstantiationException e4) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e4);
            return null;
        } catch (LinkageError e5) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e6);
            return null;
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e8);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static Object[] m13141c(Bundle bundle, String str) {
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf("_loc_args");
        String strM13132a = m13132a(bundle, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        if (TextUtils.isEmpty(strM13132a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM13132a);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException e) {
            String strValueOf3 = String.valueOf(str);
            String strValueOf4 = String.valueOf("_loc_args");
            String strSubstring = (strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3)).substring(6);
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(strSubstring).length() + 41 + String.valueOf(strM13132a).length()).append("Malformed ").append(strSubstring).append(": ").append(strM13132a).append("  Default value will be used.").toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    static String m13142d(Bundle bundle) {
        String strM13132a = m13132a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(strM13132a) ? m13132a(bundle, "gcm.n.sound") : strM13132a;
    }

    /* JADX INFO: renamed from: d */
    private final String m13143d(Bundle bundle, String str) {
        String strM13132a = m13132a(bundle, str);
        if (!TextUtils.isEmpty(strM13132a)) {
            return strM13132a;
        }
        String strM13139b = m13139b(bundle, str);
        if (TextUtils.isEmpty(strM13139b)) {
            return null;
        }
        Resources resources = this.f13065b.getResources();
        int identifier = resources.getIdentifier(strM13139b, "string", this.f13065b.getPackageName());
        if (identifier == 0) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf("_loc_key");
            String strSubstring = (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).substring(6);
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(strSubstring).length() + 49 + String.valueOf(strM13139b).length()).append(strSubstring).append(" resource not found: ").append(strM13139b).append(" Default value will be used.").toString());
            return null;
        }
        Object[] objArrM13141c = m13141c(bundle, str);
        if (objArrM13141c == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM13141c);
        } catch (MissingFormatArgumentException e) {
            String string = Arrays.toString(objArrM13141c);
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(strM13139b).length() + 58 + String.valueOf(string).length()).append("Missing format argument for ").append(strM13139b).append(": ").append(string).append(" Default value will be used.").toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final PendingIntent m13144e(Bundle bundle) {
        Intent intent;
        String strM13132a = m13132a(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(strM13132a)) {
            Uri uriM13137b = m13137b(bundle);
            if (uriM13137b != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f13065b.getPackageName());
                intent2.setData(uriM13137b);
                intent = intent2;
            } else {
                Intent launchIntentForPackage = this.f13065b.getPackageManager().getLaunchIntentForPackage(this.f13065b.getPackageName());
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
                intent = launchIntentForPackage;
            }
        } else {
            Intent intent3 = new Intent(strM13132a);
            intent3.setPackage(this.f13065b.getPackageName());
            intent3.setFlags(268435456);
            intent = intent3;
        }
        if (intent == null) {
            return null;
        }
        intent.addFlags(67108864);
        Bundle bundle2 = new Bundle(bundle);
        FirebaseMessagingService.m13123a(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f13065b, this.f13069f.incrementAndGet(), intent, 1073741824);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean m13145c(Bundle bundle) {
        boolean z;
        int i;
        int identifier;
        Uri defaultUri;
        PendingIntent pendingIntentM13119a;
        PendingIntent pendingIntentM13119a2;
        Notification notificationM777a;
        if ("1".equals(m13132a(bundle, "gcm.n.noui"))) {
            return true;
        }
        if (((KeyguardManager) this.f13065b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            z = false;
        } else {
            if (!C1310n.m7284g()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f13065b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        z = runningAppProcessInfo.importance == 100;
                    }
                }
                z = false;
            }
        }
        if (z) {
            return false;
        }
        CharSequence charSequenceM13143d = m13143d(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(charSequenceM13143d)) {
            charSequenceM13143d = this.f13065b.getApplicationInfo().loadLabel(this.f13065b.getPackageManager());
        }
        String strM13143d = m13143d(bundle, "gcm.n.body");
        String strM13132a = m13132a(bundle, "gcm.n.icon");
        if (TextUtils.isEmpty(strM13132a)) {
            i = m13130a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0 || !m13135a(i)) {
                i = this.f13065b.getApplicationInfo().icon;
            }
            if (i != 0 || !m13135a(i)) {
                i = R.drawable.sym_def_app_icon;
            }
            identifier = i;
        } else {
            Resources resources = this.f13065b.getResources();
            identifier = resources.getIdentifier(strM13132a, "drawable", this.f13065b.getPackageName());
            if ((identifier == 0 || !m13135a(identifier)) && ((identifier = resources.getIdentifier(strM13132a, "mipmap", this.f13065b.getPackageName())) == 0 || !m13135a(identifier))) {
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(strM13132a).length() + 61).append("Icon resource ").append(strM13132a).append(" not found. Notification will use default icon.").toString());
                i = m13130a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i != 0) {
                    i = this.f13065b.getApplicationInfo().icon;
                    if (i != 0) {
                        i = R.drawable.sym_def_app_icon;
                        identifier = i;
                    }
                }
            }
        }
        Integer numM13138b = m13138b(m13132a(bundle, "gcm.n.color"));
        String strM13142d = m13142d(bundle);
        if (TextUtils.isEmpty(strM13142d)) {
            defaultUri = null;
        } else if ("default".equals(strM13142d) || this.f13065b.getResources().getIdentifier(strM13142d, "raw", this.f13065b.getPackageName()) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            String packageName = this.f13065b.getPackageName();
            defaultUri = Uri.parse(new StringBuilder(String.valueOf("android.resource://").length() + 5 + String.valueOf(packageName).length() + String.valueOf(strM13142d).length()).append("android.resource://").append(packageName).append("/raw/").append(strM13142d).toString());
        }
        PendingIntent pendingIntentM13144e = m13144e(bundle);
        if (FirebaseMessagingService.m13124b(bundle)) {
            Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
            m13134a(intent, bundle);
            intent.putExtra("pending_intent", pendingIntentM13144e);
            pendingIntentM13119a2 = C2314z.m13119a(this.f13065b, this.f13069f.incrementAndGet(), intent, 1073741824);
            Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            m13134a(intent2, bundle);
            pendingIntentM13119a = C2314z.m13119a(this.f13065b, this.f13069f.incrementAndGet(), intent2, 1073741824);
        } else {
            pendingIntentM13119a = null;
            pendingIntentM13119a2 = pendingIntentM13144e;
        }
        if (!C1310n.m7286i() || this.f13065b.getApplicationInfo().targetSdkVersion <= 25) {
            C0136ab.c cVarM778a = new C0136ab.c(this.f13065b).m785a(true).m778a(identifier);
            if (!TextUtils.isEmpty(charSequenceM13143d)) {
                cVarM778a.m783a(charSequenceM13143d);
            }
            if (!TextUtils.isEmpty(strM13143d)) {
                cVarM778a.m788b(strM13143d);
                cVarM778a.m782a(new C0136ab.b().m773a(strM13143d));
            }
            if (numM13138b != null) {
                cVarM778a.m786b(numM13138b.intValue());
            }
            if (defaultUri != null) {
                cVarM778a.m781a(defaultUri);
            }
            if (pendingIntentM13119a2 != null) {
                cVarM778a.m780a(pendingIntentM13119a2);
            }
            if (pendingIntentM13119a != null) {
                cVarM778a.m787b(pendingIntentM13119a);
            }
            notificationM777a = cVarM778a.m777a();
        } else {
            notificationM777a = m13129a(charSequenceM13143d, strM13143d, identifier, numM13138b, defaultUri, pendingIntentM13119a2, pendingIntentM13119a, m13140c(m13132a(bundle, "gcm.n.android_channel_id")));
        }
        String strM13132a2 = m13132a(bundle, "gcm.n.tag");
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager = (NotificationManager) this.f13065b.getSystemService("notification");
        if (TextUtils.isEmpty(strM13132a2)) {
            strM13132a2 = new StringBuilder(37).append("FCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        notificationManager.notify(strM13132a2, 0, notificationM777a);
        return true;
    }
}
