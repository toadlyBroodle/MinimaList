package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class bhu {

    /* JADX INFO: renamed from: a */
    protected final bhw f8183a;

    /* JADX INFO: renamed from: b */
    protected final bfa f8184b;

    /* JADX INFO: renamed from: c */
    private bhv f8185c;

    protected bhu(bhv bhvVar, bhw bhwVar, bfa bfaVar) {
        this.f8185c = bhvVar;
        this.f8183a = bhwVar;
        this.f8184b = bfaVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract bhu mo9344a(bkp bkpVar);

    /* JADX INFO: renamed from: c */
    public final bfa m9348c() {
        return this.f8184b;
    }

    /* JADX INFO: renamed from: d */
    public final bhw m9349d() {
        return this.f8183a;
    }

    /* JADX INFO: renamed from: e */
    public final bhv m9350e() {
        return this.f8185c;
    }
}
