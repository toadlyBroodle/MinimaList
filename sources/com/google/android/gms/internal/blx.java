package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blx extends ble {

    /* JADX INFO: renamed from: a */
    private static final blx f8397a = new blx();

    private blx() {
    }

    /* JADX INFO: renamed from: c */
    public static blx m9634c() {
        return f8397a;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9607a() {
        return new blm(bkp.m9550b(), bln.f8386b);
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9608a(bkp bkpVar, bln blnVar) {
        return new blm(bkpVar, blnVar);
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final boolean mo9609a(bln blnVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: b */
    public final String mo9610b() {
        return ".value";
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(blm blmVar, blm blmVar2) {
        blm blmVar3 = blmVar;
        blm blmVar4 = blmVar2;
        int iCompareTo = blmVar3.m9627d().compareTo(blmVar4.m9627d());
        return iCompareTo == 0 ? blmVar3.m9626c().compareTo(blmVar4.m9626c()) : iCompareTo;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof blx;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return "ValueIndex";
    }
}
