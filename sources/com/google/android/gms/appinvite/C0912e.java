package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.appinvite.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C0912e {
    /* JADX INFO: renamed from: a */
    public static boolean m6096a(Intent intent) {
        return (intent == null || intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE") == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m6097b(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE")) == null) {
            return null;
        }
        return bundleExtra.getString("com.google.android.gms.appinvite.DEEP_LINK");
    }
}
