package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bjg {

    /* JADX INFO: renamed from: a */
    private final bjk f8252a;

    /* JADX INFO: renamed from: b */
    private final blf f8253b;

    /* JADX INFO: renamed from: c */
    private final blf f8254c;

    /* JADX INFO: renamed from: d */
    private final bkp f8255d;

    /* JADX INFO: renamed from: e */
    private final bkp f8256e;

    private bjg(bjk bjkVar, blf blfVar, bkp bkpVar, bkp bkpVar2, blf blfVar2) {
        this.f8252a = bjkVar;
        this.f8253b = blfVar;
        this.f8255d = bkpVar;
        this.f8256e = bkpVar2;
        this.f8254c = blfVar2;
    }

    /* JADX INFO: renamed from: a */
    public static bjg m9443a(bkp bkpVar, blf blfVar) {
        return new bjg(bjk.CHILD_ADDED, blfVar, bkpVar, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static bjg m9444a(bkp bkpVar, blf blfVar, blf blfVar2) {
        return new bjg(bjk.CHILD_CHANGED, blfVar, bkpVar, null, blfVar2);
    }

    /* JADX INFO: renamed from: a */
    public static bjg m9445a(bkp bkpVar, bln blnVar) {
        return m9443a(bkpVar, blf.m9611a(blnVar));
    }

    /* JADX INFO: renamed from: a */
    public static bjg m9446a(bkp bkpVar, bln blnVar, bln blnVar2) {
        return m9444a(bkpVar, blf.m9611a(blnVar), blf.m9611a(blnVar2));
    }

    /* JADX INFO: renamed from: a */
    public static bjg m9447a(blf blfVar) {
        return new bjg(bjk.VALUE, blfVar, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static bjg m9448b(bkp bkpVar, blf blfVar) {
        return new bjg(bjk.CHILD_REMOVED, blfVar, bkpVar, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static bjg m9449b(bkp bkpVar, bln blnVar) {
        return m9448b(bkpVar, blf.m9611a(blnVar));
    }

    /* JADX INFO: renamed from: c */
    public static bjg m9450c(bkp bkpVar, blf blfVar) {
        return new bjg(bjk.CHILD_MOVED, blfVar, bkpVar, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final bjg m9451a(bkp bkpVar) {
        return new bjg(this.f8252a, this.f8253b, this.f8255d, bkpVar, this.f8254c);
    }

    /* JADX INFO: renamed from: a */
    public final bkp m9452a() {
        return this.f8255d;
    }

    /* JADX INFO: renamed from: b */
    public final bjk m9453b() {
        return this.f8252a;
    }

    /* JADX INFO: renamed from: c */
    public final blf m9454c() {
        return this.f8253b;
    }

    /* JADX INFO: renamed from: d */
    public final blf m9455d() {
        return this.f8254c;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8252a);
        String strValueOf2 = String.valueOf(this.f8255d);
        return new StringBuilder(String.valueOf(strValueOf).length() + 9 + String.valueOf(strValueOf2).length()).append("Change: ").append(strValueOf).append(" ").append(strValueOf2).toString();
    }
}
