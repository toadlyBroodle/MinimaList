package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.p046c.C0677a;

/* JADX INFO: renamed from: com.google.android.gms.internal.er */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1538er implements InterfaceC1540et {
    @Override // com.google.android.gms.internal.InterfaceC1540et
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<C0677a.a> mo11253a(Context context) {
        C1700kr c1700kr = new C1700kr();
        bxm.m10404a();
        if (C1657jb.m11579f(context)) {
            C1590gp.m11370a(new RunnableC1539es(this, context, c1700kr));
        }
        return c1700kr;
    }

    @Override // com.google.android.gms.internal.InterfaceC1540et
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<String> mo11254a(String str, PackageInfo packageInfo) {
        return C1678jw.m11618a(str);
    }
}
