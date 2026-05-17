package com.google.android.gms.internal;

import com.google.android.gms.internal.blh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class blh<T extends blh> implements bln {

    /* JADX INFO: renamed from: a */
    protected final bln f8373a;

    /* JADX INFO: renamed from: c */
    private String f8374c;

    blh(bln blnVar) {
        this.f8373a = blnVar;
    }

    /* JADX INFO: renamed from: a */
    private static int m9622a(bll bllVar, blc blcVar) {
        return Double.valueOf(((Long) bllVar.mo9545a()).longValue()).compareTo((Double) blcVar.mo9545a());
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo9543a(T t);

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9560a(bfa bfaVar) {
        return bfaVar.m9162h() ? this : bfaVar.m9158d().m9555e() ? this.f8373a : bld.m9605j();
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9561a(bfa bfaVar, bln blnVar) {
        bkp bkpVarM9158d = bfaVar.m9158d();
        return bkpVarM9158d == null ? blnVar : (!blnVar.mo9568b() || bkpVarM9158d.m9555e()) ? mo9562a(bkpVarM9158d, bld.m9605j().mo9561a(bfaVar.m9159e(), blnVar)) : this;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final bln mo9562a(bkp bkpVar, bln blnVar) {
        return bkpVar.m9555e() ? mo9544a(blnVar) : !blnVar.mo9568b() ? bld.m9605j().mo9562a(bkpVar, blnVar).mo9544a(this.f8373a) : this;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9563a(boolean z) {
        if (!z || this.f8373a.mo9568b()) {
            return mo9545a();
        }
        HashMap map = new HashMap();
        map.put(".value", mo9545a());
        map.put(".priority", this.f8373a.mo9545a());
        return map;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final boolean mo9565a(bkp bkpVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public final bkp mo9567b(bkp bkpVar) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected final String m9623b(blp blpVar) {
        switch (bli.f8375a[blpVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f8373a.mo9568b()) {
                    return "";
                }
                String strMo9546a = this.f8373a.mo9546a(blpVar);
                return new StringBuilder(String.valueOf(strMo9546a).length() + 10).append("priority:").append(strMo9546a).append(":").toString();
            default:
                String strValueOf = String.valueOf(blpVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Unknown hash version: ").append(strValueOf).toString());
        }
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public final boolean mo9568b() {
        return false;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public final int mo9569c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public final bln mo9570c(bkp bkpVar) {
        return bkpVar.m9555e() ? this.f8373a : bld.m9605j();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(bln blnVar) {
        bln blnVar2 = blnVar;
        if (blnVar2.mo9568b()) {
            return 1;
        }
        if (blnVar2 instanceof bkr) {
            return -1;
        }
        if ((this instanceof bll) && (blnVar2 instanceof blc)) {
            return m9622a((bll) this, (blc) blnVar2);
        }
        if ((this instanceof blc) && (blnVar2 instanceof bll)) {
            return m9622a((bll) blnVar2, (blc) this) * (-1);
        }
        blh blhVar = (blh) blnVar2;
        blk blkVarMo9547n_ = mo9547n_();
        blk blkVarMo9547n_2 = blhVar.mo9547n_();
        return blkVarMo9547n_.equals(blkVarMo9547n_2) ? mo9543a(blhVar) : blkVarMo9547n_.compareTo(blkVarMo9547n_2);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: d */
    public final String mo9571d() {
        if (this.f8374c == null) {
            this.f8374c = bne.m9698b(mo9546a(blp.V1));
        }
        return this.f8374c;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: e */
    public final boolean mo9572e() {
        return true;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: f */
    public final bln mo9573f() {
        return this.f8373a;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: i */
    public final Iterator<blm> mo9576i() {
        return Collections.emptyList().iterator();
    }

    @Override // java.lang.Iterable
    public Iterator<blm> iterator() {
        return Collections.emptyList().iterator();
    }

    /* JADX INFO: renamed from: n_ */
    protected abstract blk mo9547n_();

    public String toString() {
        String string = mo9563a(true).toString();
        return string.length() <= 100 ? string : String.valueOf(string.substring(0, 100)).concat("...");
    }
}
