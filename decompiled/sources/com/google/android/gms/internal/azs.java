package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.auth.C2204r;

/* JADX INFO: loaded from: classes.dex */
final class azs extends azg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ azo f7637a;

    private azs(azo azoVar) {
        this.f7637a = azoVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m8749a(azy azyVar) {
        this.f7637a.f7622j.execute(new azx(this, azyVar));
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8717a() {
        C1221aj.m7071a(this.f7637a.f7613a == 5, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8718a(Status status) {
        if (this.f7637a.f7613a != 8) {
            this.f7637a.m8740b(status);
            this.f7637a.m8746a(status);
        } else {
            azo.m8739a(this.f7637a, true);
            this.f7637a.f7631s = false;
            m8749a(new azw(this, status));
        }
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8719a(Status status, C2204r c2204r) {
        if (this.f7637a.f7623k == null) {
            mo8718a(status);
        } else {
            azo.m8739a(this.f7637a, true);
            this.f7637a.f7623k.m8748a(status, c2204r);
        }
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8720a(baa baaVar) {
        C1221aj.m7071a(this.f7637a.f7613a == 3, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7626n = baaVar;
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8721a(bae baeVar) {
        C1221aj.m7071a(this.f7637a.f7613a == 1, new StringBuilder(37).append("Unexpected response type: ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7624l = baeVar;
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8722a(bae baeVar, bac bacVar) {
        C1221aj.m7071a(this.f7637a.f7613a == 2, new StringBuilder(37).append("Unexpected response type: ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7624l = baeVar;
        this.f7637a.f7625m = bacVar;
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8723a(bak bakVar) {
        C1221aj.m7071a(this.f7637a.f7613a == 4, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7627o = bakVar;
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8724a(C2204r c2204r) {
        C1221aj.m7071a(this.f7637a.f7613a == 8, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        azo.m8739a(this.f7637a, true);
        this.f7637a.f7631s = true;
        m8749a(new azu(this, c2204r));
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: a */
    public final void mo8725a(String str) {
        C1221aj.m7071a(this.f7637a.f7613a == 7, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7628p = str;
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: b */
    public final void mo8726b() {
        C1221aj.m7071a(this.f7637a.f7613a == 6, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: b */
    public final void mo8727b(String str) {
        C1221aj.m7071a(this.f7637a.f7613a == 8, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7629q = str;
        m8749a(new azt(this, str));
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: c */
    public final void mo8728c() {
        C1221aj.m7071a(this.f7637a.f7613a == 9, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.m8741c();
    }

    @Override // com.google.android.gms.internal.azf
    /* JADX INFO: renamed from: c */
    public final void mo8729c(String str) {
        C1221aj.m7071a(this.f7637a.f7613a == 8, new StringBuilder(36).append("Unexpected response type ").append(this.f7637a.f7613a).toString());
        this.f7637a.f7629q = str;
        azo.m8739a(this.f7637a, true);
        this.f7637a.f7631s = true;
        m8749a(new azv(this, str));
    }
}
