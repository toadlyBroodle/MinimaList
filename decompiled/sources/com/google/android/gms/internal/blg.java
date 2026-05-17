package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blg extends ble {

    /* JADX INFO: renamed from: a */
    private static final blg f8372a = new blg();

    private blg() {
    }

    /* JADX INFO: renamed from: c */
    public static blg m9621c() {
        return f8372a;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9607a() {
        return blm.m9625b();
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9608a(bkp bkpVar, bln blnVar) {
        return new blm(bkp.m9549a((String) blnVar.mo9545a()), bld.m9605j());
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final boolean mo9609a(bln blnVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: b */
    public final String mo9610b() {
        return ".key";
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(blm blmVar, blm blmVar2) {
        return blmVar.m9626c().compareTo(blmVar2.m9626c());
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof blg;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
