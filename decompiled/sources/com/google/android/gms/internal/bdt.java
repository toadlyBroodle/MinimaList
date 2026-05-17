package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bdt {

    /* JADX INFO: renamed from: a */
    private final bdw f7884a;

    /* JADX INFO: renamed from: b */
    private final bdq f7885b;

    /* JADX INFO: renamed from: c */
    private final bdc f7886c;

    /* JADX INFO: renamed from: d */
    private final Long f7887d;

    private bdt(bdw bdwVar, bdq bdqVar, Long l, bdc bdcVar) {
        this.f7884a = bdwVar;
        this.f7885b = bdqVar;
        this.f7886c = bdcVar;
        this.f7887d = l;
    }

    /* synthetic */ bdt(bdw bdwVar, bdq bdqVar, Long l, bdc bdcVar, bdg bdgVar) {
        this(bdwVar, bdqVar, l, bdcVar);
    }

    /* JADX INFO: renamed from: a */
    public final bdq m9034a() {
        return this.f7885b;
    }

    /* JADX INFO: renamed from: b */
    public final Long m9035b() {
        return this.f7887d;
    }

    /* JADX INFO: renamed from: c */
    public final bdc m9036c() {
        return this.f7886c;
    }

    public final String toString() {
        String string = this.f7885b.toString();
        String strValueOf = String.valueOf(this.f7887d);
        return new StringBuilder(String.valueOf(string).length() + 8 + String.valueOf(strValueOf).length()).append(string).append(" (Tag: ").append(strValueOf).append(")").toString();
    }
}
