package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bll extends blh<bll> {

    /* JADX INFO: renamed from: c */
    private final long f8381c;

    public bll(Long l, bln blnVar) {
        super(blnVar);
        this.f8381c = l.longValue();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ int mo9543a(blh blhVar) {
        return bne.m9692a(this.f8381c, ((bll) blhVar).f8381c);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bln mo9544a(bln blnVar) {
        return new bll(Long.valueOf(this.f8381c), blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return Long.valueOf(this.f8381c);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        String strValueOf = String.valueOf(String.valueOf(m9623b(blpVar)).concat("number:"));
        String strValueOf2 = String.valueOf(bne.m9695a(this.f8381c));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bll)) {
            return false;
        }
        bll bllVar = (bll) obj;
        return this.f8381c == bllVar.f8381c && this.f8373a.equals(bllVar.f8373a);
    }

    public final int hashCode() {
        return ((int) (this.f8381c ^ (this.f8381c >>> 32))) + this.f8373a.hashCode();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: n_ */
    protected final blk mo9547n_() {
        return blk.Number;
    }
}
