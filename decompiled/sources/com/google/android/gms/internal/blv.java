package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blv extends blh<blv> {

    /* JADX INFO: renamed from: c */
    private final String f8395c;

    public blv(String str, bln blnVar) {
        super(blnVar);
        this.f8395c = str;
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ int mo9543a(blh blhVar) {
        return this.f8395c.compareTo(((blv) blhVar).f8395c);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bln mo9544a(bln blnVar) {
        return new blv(this.f8395c, blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return this.f8395c;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        switch (blw.f8396a[blpVar.ordinal()]) {
            case 1:
                String strM9623b = m9623b(blpVar);
                String str = this.f8395c;
                return new StringBuilder(String.valueOf(strM9623b).length() + 7 + String.valueOf(str).length()).append(strM9623b).append("string:").append(str).toString();
            case 2:
                String strM9623b2 = m9623b(blpVar);
                String strM9699c = bne.m9699c(this.f8395c);
                return new StringBuilder(String.valueOf(strM9623b2).length() + 7 + String.valueOf(strM9699c).length()).append(strM9623b2).append("string:").append(strM9699c).toString();
            default:
                String strValueOf = String.valueOf(blpVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 38).append("Invalid hash version for string node: ").append(strValueOf).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof blv)) {
            return false;
        }
        blv blvVar = (blv) obj;
        return this.f8395c.equals(blvVar.f8395c) && this.f8373a.equals(blvVar.f8373a);
    }

    public final int hashCode() {
        return this.f8395c.hashCode() + this.f8373a.hashCode();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: n_ */
    protected final blk mo9547n_() {
        return blk.String;
    }
}
