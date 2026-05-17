package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class blb extends blh<blb> {

    /* JADX INFO: renamed from: c */
    private Map<Object, Object> f8365c;

    public blb(Map<Object, Object> map, bln blnVar) {
        super(blnVar);
        this.f8365c = map;
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ int mo9543a(blh blhVar) {
        return 0;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bln mo9544a(bln blnVar) {
        return new blb(this.f8365c, blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final Object mo9545a() {
        return this.f8365c;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public final String mo9546a(blp blpVar) {
        String strM9623b = m9623b(blpVar);
        String strValueOf = String.valueOf(this.f8365c);
        return new StringBuilder(String.valueOf(strM9623b).length() + 14 + String.valueOf(strValueOf).length()).append(strM9623b).append("deferredValue:").append(strValueOf).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof blb)) {
            return false;
        }
        blb blbVar = (blb) obj;
        return this.f8365c.equals(blbVar.f8365c) && this.f8373a.equals(blbVar.f8373a);
    }

    public final int hashCode() {
        return this.f8365c.hashCode() + this.f8373a.hashCode();
    }

    @Override // com.google.android.gms.internal.blh
    /* JADX INFO: renamed from: n_ */
    protected final blk mo9547n_() {
        return blk.DeferredValue;
    }
}
