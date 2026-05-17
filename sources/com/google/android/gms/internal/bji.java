package com.google.android.gms.internal;

import com.google.firebase.database.C2225a;

/* JADX INFO: loaded from: classes.dex */
public final class bji implements bjj {

    /* JADX INFO: renamed from: a */
    private final bjk f8257a;

    /* JADX INFO: renamed from: b */
    private final bex f8258b;

    /* JADX INFO: renamed from: c */
    private final C2225a f8259c;

    /* JADX INFO: renamed from: d */
    private final String f8260d;

    public bji(bjk bjkVar, bex bexVar, C2225a c2225a, String str) {
        this.f8257a = bjkVar;
        this.f8258b = bexVar;
        this.f8259c = c2225a;
        this.f8260d = str;
    }

    /* JADX INFO: renamed from: c */
    private final bfa m9456c() {
        bfa bfaVarM13012e = this.f8259c.m12958a().m13012e();
        return this.f8257a == bjk.VALUE ? bfaVarM13012e : bfaVarM13012e.m9160f();
    }

    @Override // com.google.android.gms.internal.bjj
    /* JADX INFO: renamed from: a */
    public final void mo9442a() {
        this.f8258b.mo9134a(this);
    }

    /* JADX INFO: renamed from: b */
    public final C2225a m9457b() {
        return this.f8259c;
    }

    @Override // com.google.android.gms.internal.bjj
    public final String toString() {
        if (this.f8257a == bjk.VALUE) {
            String strValueOf = String.valueOf(m9456c());
            String strValueOf2 = String.valueOf(this.f8257a);
            String strValueOf3 = String.valueOf(this.f8259c.m12961a(true));
            return new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append(strValueOf).append(": ").append(strValueOf2).append(": ").append(strValueOf3).toString();
        }
        String strValueOf4 = String.valueOf(m9456c());
        String strValueOf5 = String.valueOf(this.f8257a);
        String strM12962b = this.f8259c.m12962b();
        String strValueOf6 = String.valueOf(this.f8259c.m12961a(true));
        return new StringBuilder(String.valueOf(strValueOf4).length() + 10 + String.valueOf(strValueOf5).length() + String.valueOf(strM12962b).length() + String.valueOf(strValueOf6).length()).append(strValueOf4).append(": ").append(strValueOf5).append(": { ").append(strM12962b).append(": ").append(strValueOf6).append(" }").toString();
    }
}
