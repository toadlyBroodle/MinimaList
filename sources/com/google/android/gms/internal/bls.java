package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bls extends ble {

    /* JADX INFO: renamed from: a */
    private static final bls f8391a = new bls();

    private bls() {
    }

    /* JADX INFO: renamed from: c */
    public static bls m9629c() {
        return f8391a;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9607a() {
        return mo9608a(bkp.m9550b(), bln.f8386b);
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9608a(bkp bkpVar, bln blnVar) {
        return new blm(bkpVar, new blv("[PRIORITY-POST]", blnVar));
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final boolean mo9609a(bln blnVar) {
        return !blnVar.mo9573f().mo9568b();
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: b */
    public final String mo9610b() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(blm blmVar, blm blmVar2) {
        blm blmVar3 = blmVar;
        blm blmVar4 = blmVar2;
        bln blnVarMo9573f = blmVar3.m9627d().mo9573f();
        bln blnVarMo9573f2 = blmVar4.m9627d().mo9573f();
        bkp bkpVarM9626c = blmVar3.m9626c();
        bkp bkpVarM9626c2 = blmVar4.m9626c();
        int iCompareTo = blnVarMo9573f.compareTo(blnVarMo9573f2);
        return iCompareTo != 0 ? iCompareTo : bkpVarM9626c.compareTo(bkpVarM9626c2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof bls;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
