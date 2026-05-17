package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blc extends blh<blc> {

    /* JADX INFO: renamed from: c */
    private final Double f8366c;

    public blc(Double d, bln blnVar) {
        super(blnVar);
        this.f8366c = d;
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ int mo9543a(blh blhVar) {
        return this.f8366c.compareTo(((blc) blhVar).f8366c);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bln mo9544a(bln blnVar) {
        return new blc(this.f8366c, blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return this.f8366c;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        String strValueOf = String.valueOf(String.valueOf(m9623b(blpVar)).concat("number:"));
        String strValueOf2 = String.valueOf(bne.m9695a(this.f8366c.doubleValue()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof blc)) {
            return false;
        }
        blc blcVar = (blc) obj;
        return this.f8366c.equals(blcVar.f8366c) && this.f8373a.equals(blcVar.f8373a);
    }

    public final int hashCode() {
        return this.f8366c.hashCode() + this.f8373a.hashCode();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: n_ */
    protected final blk mo9547n_() {
        return blk.Number;
    }
}
