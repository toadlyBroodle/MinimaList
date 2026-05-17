package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.l */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0837l {
    /* JADX INFO: renamed from: a */
    public static void m5804a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f4789k == 4 && adOverlayInfoParcel.f4781c == null) {
            if (adOverlayInfoParcel.f4780b != null) {
                adOverlayInfoParcel.f4780b.mo5308e();
            }
            C0710au.m5566b();
            C0826a.m5774a(context, adOverlayInfoParcel.f4779a, adOverlayInfoParcel.f4787i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f4791m.f10858d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m5772a(intent, adOverlayInfoParcel);
        if (!C1310n.m7284g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C0710au.m5569e();
        C1596gv.m11390a(context, intent);
    }
}
