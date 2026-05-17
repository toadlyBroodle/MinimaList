package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.rd */
/* JADX INFO: loaded from: classes.dex */
final class C1875rd implements InterfaceC1862qr<C1876re> {

    /* JADX INFO: renamed from: a */
    private final C1834pq f11445a;

    /* JADX INFO: renamed from: b */
    private final C1876re f11446b = new C1876re();

    public C1875rd(C1834pq c1834pq) {
        this.f11445a = c1834pq;
    }

    @Override // com.google.android.gms.internal.InterfaceC1862qr
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1860qp mo12165a() {
        return this.f11446b;
    }

    @Override // com.google.android.gms.internal.InterfaceC1862qr
    /* JADX INFO: renamed from: a */
    public final void mo12166a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f11446b.f11450d = i;
        } else {
            this.f11445a.m12060e().m12031d("Int xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1862qr
    /* JADX INFO: renamed from: a */
    public final void mo12167a(String str, String str2) {
    }

    @Override // com.google.android.gms.internal.InterfaceC1862qr
    /* JADX INFO: renamed from: a */
    public final void mo12168a(String str, boolean z) {
        if (!"ga_dryRun".equals(str)) {
            this.f11445a.m12060e().m12031d("Bool xml configuration name not recognized", str);
        } else {
            this.f11446b.f11451e = z ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1862qr
    /* JADX INFO: renamed from: b */
    public final void mo12169b(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f11446b.f11447a = str2;
            return;
        }
        if ("ga_appVersion".equals(str)) {
            this.f11446b.f11448b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f11446b.f11449c = str2;
        } else {
            this.f11445a.m12060e().m12031d("String xml configuration name not recognized", str);
        }
    }
}
