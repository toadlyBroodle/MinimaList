package com.google.firebase.database;

import com.google.android.gms.internal.bfa;
import com.google.android.gms.internal.bgi;
import com.google.android.gms.internal.bhk;
import com.google.android.gms.internal.bkp;
import com.google.android.gms.internal.bln;

/* JADX INFO: renamed from: com.google.firebase.database.i */
/* JADX INFO: loaded from: classes.dex */
public class C2271i {

    /* JADX INFO: renamed from: a */
    private final bgi f12949a;

    /* JADX INFO: renamed from: b */
    private final bfa f12950b;

    private C2271i(bgi bgiVar, bfa bfaVar) {
        this.f12949a = bgiVar;
        this.f12950b = bfaVar;
        bhk.m9317a(this.f12950b, m13006b());
    }

    C2271i(bln blnVar) {
        this(new bgi(blnVar), new bfa(""));
    }

    /* JADX INFO: renamed from: a */
    final bln m13005a() {
        return this.f12949a.m9240a(this.f12950b);
    }

    /* JADX INFO: renamed from: b */
    public Object m13006b() {
        return m13005a().mo9545a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2271i) && this.f12949a.equals(((C2271i) obj).f12949a) && this.f12950b.equals(((C2271i) obj).f12950b);
    }

    public String toString() {
        bkp bkpVarM9158d = this.f12950b.m9158d();
        String strM9554d = bkpVarM9158d != null ? bkpVarM9158d.m9554d() : "<none>";
        String strValueOf = String.valueOf(this.f12949a.m9239a().mo9563a(true));
        return new StringBuilder(String.valueOf(strM9554d).length() + 32 + String.valueOf(strValueOf).length()).append("MutableData { key = ").append(strM9554d).append(", value = ").append(strValueOf).append(" }").toString();
    }
}
