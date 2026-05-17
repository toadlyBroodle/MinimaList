package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ahw implements aiv {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ahv f6806a;

    ahw(ahv ahvVar) {
        this.f6806a = ahvVar;
    }

    @Override // com.google.android.gms.internal.aiv
    /* JADX INFO: renamed from: a */
    public final void mo7966a(ahd ahdVar) {
        this.f6806a.m7952a(ahdVar.m7911a());
    }

    @Override // com.google.android.gms.internal.aiv
    /* JADX INFO: renamed from: b */
    public final void mo7967b(ahd ahdVar) {
        this.f6806a.m7952a(ahdVar.m7911a());
        ahs.m7947d(new StringBuilder(57).append("Permanent failure dispatching hitId: ").append(ahdVar.m7911a()).toString());
    }

    @Override // com.google.android.gms.internal.aiv
    /* JADX INFO: renamed from: c */
    public final void mo7968c(ahd ahdVar) {
        long jM7914b = ahdVar.m7914b();
        if (jM7914b == 0) {
            this.f6806a.m7953a(ahdVar.m7911a(), this.f6806a.f6804k.mo7252a());
        } else if (jM7914b + 14400000 < this.f6806a.f6804k.mo7252a()) {
            this.f6806a.m7952a(ahdVar.m7911a());
            ahs.m7947d(new StringBuilder(47).append("Giving up on failed hitId: ").append(ahdVar.m7911a()).toString());
        }
    }
}
