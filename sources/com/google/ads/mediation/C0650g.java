package com.google.ads.mediation;

import com.google.android.gms.ads.C0687h;
import com.google.android.gms.ads.reward.InterfaceC0880a;
import com.google.android.gms.ads.reward.InterfaceC0881b;

/* JADX INFO: renamed from: com.google.ads.mediation.g */
/* JADX INFO: loaded from: classes.dex */
final class C0650g implements InterfaceC0881b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractAdViewAdapter f4326a;

    C0650g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f4326a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: a */
    public final void mo5321a() {
        this.f4326a.zzgy.mo5921b(this.f4326a);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: a */
    public final void mo5322a(int i) {
        this.f4326a.zzgy.mo5919a(this.f4326a, i);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: a */
    public final void mo5323a(InterfaceC0880a interfaceC0880a) {
        this.f4326a.zzgy.mo5920a(this.f4326a, interfaceC0880a);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: b */
    public final void mo5324b() {
        this.f4326a.zzgy.mo5922c(this.f4326a);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: c */
    public final void mo5325c() {
        this.f4326a.zzgy.mo5923d(this.f4326a);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: d */
    public final void mo5326d() {
        this.f4326a.zzgy.mo5924e(this.f4326a);
        AbstractAdViewAdapter.zza(this.f4326a, (C0687h) null);
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0881b
    /* JADX INFO: renamed from: e */
    public final void mo5327e() {
        this.f4326a.zzgy.mo5925f(this.f4326a);
    }
}
