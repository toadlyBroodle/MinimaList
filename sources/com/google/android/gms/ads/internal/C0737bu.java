package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.InterfaceC1768ne;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bu */
/* JADX INFO: loaded from: classes.dex */
final class C0737bu implements InterfaceC1768ne {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1541eu f4587a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Runnable f4588b;

    C0737bu(ViewTreeObserverOnGlobalLayoutListenerC0735bs viewTreeObserverOnGlobalLayoutListenerC0735bs, C1541eu c1541eu, Runnable runnable) {
        this.f4587a = c1541eu;
        this.f4588b = runnable;
    }

    @Override // com.google.android.gms.internal.InterfaceC1768ne
    /* JADX INFO: renamed from: a */
    public final void mo5648a() {
        if (this.f4587a.f10545l) {
            return;
        }
        C0710au.m5569e();
        C1596gv.m11412b(this.f4588b);
    }
}
