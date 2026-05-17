package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bzo extends bxw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bzm f9372a;

    private bzo(bzm bzmVar) {
        this.f9372a = bzmVar;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final String mo5707a() {
        return null;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5708a(bwx bwxVar) {
        mo5709a(bwxVar, 1);
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5709a(bwx bwxVar, int i) {
        C1668jm.m11612c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C1657jb.f10832a.post(new bzp(this));
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: b */
    public final String mo5710b() {
        return null;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: c */
    public final boolean mo5711c() {
        return false;
    }
}
