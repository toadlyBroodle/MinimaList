package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1834pq;
import com.google.android.gms.internal.C1863qs;
import com.google.android.gms.internal.C1882rk;
import com.google.android.gms.internal.C1897rz;

/* JADX INFO: renamed from: com.google.android.gms.analytics.a */
/* JADX INFO: loaded from: classes.dex */
public class C0883a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static Boolean f4908a;

    /* JADX INFO: renamed from: a */
    public static boolean m5930a(Context context) {
        C1221aj.m7065a(context);
        if (f4908a != null) {
            return f4908a.booleanValue();
        }
        boolean zM12292a = C1897rz.m12292a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f4908a = Boolean.valueOf(zM12292a);
        return zM12292a;
    }

    /* JADX INFO: renamed from: a */
    protected void m5931a(Context context, String str) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C1834pq c1834pqM12054a = C1834pq.m12054a(context);
        C1882rk c1882rkM12060e = c1834pqM12054a.m12060e();
        if (intent == null) {
            c1882rkM12060e.m12033e("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        c1882rkM12060e.m12020a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            c1882rkM12060e.m12033e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        m5931a(context, stringExtra);
        int iM12171c = C1863qs.m12171c();
        if (stringExtra.length() > iM12171c) {
            c1882rkM12060e.m12029c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(iM12171c));
            stringExtra = stringExtra.substring(0, iM12171c);
        }
        c1834pqM12054a.m12063h().m12009a(stringExtra, (Runnable) new RunnableC0896k(this, goAsync()));
    }
}
