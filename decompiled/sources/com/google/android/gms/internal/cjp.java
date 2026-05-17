package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.InterfaceC0839n;

/* JADX INFO: loaded from: classes.dex */
final class cjp implements InterfaceC0839n {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ zzwl f10181a;

    cjp(zzwl zzwlVar) {
        this.f10181a = zzwlVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: b */
    public final void mo5618b() {
        C1668jm.m11610b("AdMobCustomTabsAdapter overlay is closed.");
        this.f10181a.f12751b.mo5857c(this.f10181a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: c */
    public final void mo5620c() {
        C1668jm.m11610b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: d */
    public final void mo5621d() {
        C1668jm.m11610b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: f */
    public final void mo5622f() {
        C1668jm.m11610b("Opening AdMobCustomTabsAdapter overlay.");
        this.f10181a.f12751b.mo5856b(this.f10181a);
    }
}
