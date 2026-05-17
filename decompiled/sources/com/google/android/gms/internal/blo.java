package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class blo extends bkr {
    blo() {
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final boolean mo9565a(bkp bkpVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.bkr
    /* JADX INFO: renamed from: b */
    public final int compareTo(bln blnVar) {
        return blnVar == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public final boolean mo9568b() {
        return false;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public final bln mo9570c(bkp bkpVar) {
        if (!bkpVar.m9555e()) {
            return bld.m9605j();
        }
        if (this == null) {
            throw null;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.bkr, java.lang.Comparable
    public final /* synthetic */ int compareTo(bln blnVar) {
        return compareTo(blnVar);
    }

    @Override // com.google.android.gms.internal.bkr
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: f */
    public final bln mo9573f() {
        return this;
    }

    @Override // com.google.android.gms.internal.bkr
    public final String toString() {
        return "<Max Node>";
    }
}
