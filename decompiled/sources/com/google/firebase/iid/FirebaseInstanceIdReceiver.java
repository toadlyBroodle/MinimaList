package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.p007b.AbstractC0179f;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC0179f {

    /* JADX INFO: renamed from: a */
    private static boolean f12982a = false;

    /* JADX INFO: renamed from: b */
    private static ServiceConnectionC2298j f12983b;

    /* JADX INFO: renamed from: c */
    private static ServiceConnectionC2298j f12984c;

    /* JADX INFO: renamed from: a */
    private static synchronized ServiceConnectionC2298j m13045a(Context context, String str) {
        ServiceConnectionC2298j serviceConnectionC2298j;
        if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
            if (f12984c == null) {
                f12984c = new ServiceConnectionC2298j(context, str);
            }
            serviceConnectionC2298j = f12984c;
        } else {
            if (f12983b == null) {
                f12983b = new ServiceConnectionC2298j(context, str);
            }
            serviceConnectionC2298j = f12983b;
        }
        return serviceConnectionC2298j;
    }

    /* JADX INFO: renamed from: a */
    private final void m13046a(Context context, Intent intent, String str) {
        String str2 = null;
        boolean z = false;
        int iM13121a = -1;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        if (str2 != null) {
            if (C1310n.m7286i() && context.getApplicationInfo().targetSdkVersion >= 26) {
                z = true;
            }
            if (z) {
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
                m13045a(context, str2).m13080a(intent, goAsync());
            } else {
                iM13121a = C2314z.m13120a().m13121a(context, str2, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(iM13121a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            m13046a(context, (Intent) parcelableExtra, intent.getAction());
        } else {
            m13046a(context, intent, intent.getAction());
        }
    }
}
