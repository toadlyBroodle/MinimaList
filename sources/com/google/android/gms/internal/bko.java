package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bko extends blh<bko> {

    /* JADX INFO: renamed from: c */
    private final boolean f8330c;

    public bko(Boolean bool, bln blnVar) {
        super(blnVar);
        this.f8330c = bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ int mo9543a(blh blhVar) {
        if (this.f8330c == ((bko) blhVar).f8330c) {
            return 0;
        }
        return this.f8330c ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bln mo9544a(bln blnVar) {
        return new bko(Boolean.valueOf(this.f8330c), blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return Boolean.valueOf(this.f8330c);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        String strM9623b = m9623b(blpVar);
        return new StringBuilder(String.valueOf(strM9623b).length() + 13).append(strM9623b).append("boolean:").append(this.f8330c).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bko)) {
            return false;
        }
        bko bkoVar = (bko) obj;
        return this.f8330c == bkoVar.f8330c && this.f8373a.equals(bkoVar.f8373a);
    }

    public final int hashCode() {
        return (this.f8330c ? 1 : 0) + this.f8373a.hashCode();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: n_ */
    protected final blk mo9547n_() {
        return blk.Boolean;
    }
}
