package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bld extends bkr implements bln {

    /* JADX INFO: renamed from: c */
    private static final bld f8367c = new bld();

    private bld() {
    }

    /* JADX INFO: renamed from: j */
    public static bld m9605j() {
        return f8367c;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9560a(bfa bfaVar) {
        return this;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9561a(bfa bfaVar, bln blnVar) {
        if (bfaVar.m9162h()) {
            return blnVar;
        }
        bkp bkpVarM9158d = bfaVar.m9158d();
        if (this == null) {
            throw null;
        }
        return mo9562a(bkpVarM9158d, mo9561a(bfaVar.m9159e(), blnVar));
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9562a(bkp bkpVar, bln blnVar) {
        return (blnVar.mo9568b() || bkpVar.m9555e()) ? this : new bkr().mo9562a(bkpVar, blnVar);
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ bln mo9544a(bln blnVar) {
        if (this == null) {
            throw null;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return null;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9563a(boolean z) {
        return null;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        return "";
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final boolean mo9565a(bkp bkpVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.bkr
    /* JADX INFO: renamed from: b */
    public final int compareTo(bln blnVar) {
        return blnVar.mo9568b() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public final bkp mo9567b(bkp bkpVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public final boolean mo9568b() {
        return true;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public final int mo9569c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public final bln mo9570c(bkp bkpVar) {
        return this;
    }

    @Override // com.google.android.gms.internal.bkr, java.lang.Comparable
    public final /* synthetic */ int compareTo(bln blnVar) {
        return compareTo(blnVar);
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: d */
    public final String mo9571d() {
        return "";
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: e */
    public final boolean mo9572e() {
        return false;
    }

    @Override // com.google.android.gms.internal.bkr
    public final boolean equals(Object obj) {
        if (obj instanceof bld) {
            return true;
        }
        if ((obj instanceof bln) && ((bln) obj).mo9568b()) {
            if (this == null) {
                throw null;
            }
            if (equals(((bln) obj).mo9573f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: f */
    public final bln mo9573f() {
        return this;
    }

    @Override // com.google.android.gms.internal.bkr
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.internal.bkr, com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: i */
    public final Iterator<blm> mo9576i() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.bkr, java.lang.Iterable
    public final Iterator<blm> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.bkr
    public final String toString() {
        return "<Empty Node>";
    }
}
