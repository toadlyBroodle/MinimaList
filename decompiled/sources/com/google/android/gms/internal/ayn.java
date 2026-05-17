package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.internal.InterfaceC1133bu;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ayo;
import com.google.android.gms.p051b.AbstractC0964e;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ayn<O extends ayo> {

    /* JADX INFO: renamed from: a */
    private static C2032wz f7578a = new C2032wz("BiChannelGoogleApi", "FirebaseAuth: ");

    /* JADX INFO: renamed from: b */
    private C1078e<O> f7579b;

    /* JADX INFO: renamed from: c */
    private C1078e<O> f7580c;

    /* JADX INFO: renamed from: d */
    private ayq f7581d;

    /* JADX INFO: renamed from: e */
    private O f7582e;

    /* JADX INFO: renamed from: f */
    private Integer f7583f;

    /* JADX INFO: renamed from: g */
    private Integer f7584g;

    /* JADX INFO: renamed from: h */
    private ayu f7585h;

    private ayn(Context context, C1074a<O> c1074a, O o, InterfaceC1133bu interfaceC1133bu) {
        this.f7582e = o;
        this.f7584g = Integer.valueOf(DynamiteModule.m7332b(context, "com.google.android.gms.firebase_auth"));
        this.f7583f = Integer.valueOf(DynamiteModule.m7325a(context, "com.google.firebase.auth"));
        if (this.f7584g.intValue() != 0) {
            ayo ayoVar = (ayo) this.f7582e.clone();
            ayoVar.f7586a = false;
            this.f7579b = new ayr(context, c1074a, ayoVar, interfaceC1133bu);
        } else {
            f7578a.m12551c("No Gms module; NOT initializing GMS implementation", new Object[0]);
            this.f7579b = null;
        }
        if (this.f7583f.intValue() != 0) {
            this.f7581d = new ayq(this, context, c1074a, interfaceC1133bu);
        } else {
            f7578a.m12551c("No Fallback module; NOT setting up for lazy initialization", new Object[0]);
        }
    }

    public ayn(Context context, C1074a<O> c1074a, O o, InterfaceC1133bu interfaceC1133bu, int i, int i2, Map<String, Integer> map) {
        this(context, c1074a, o, interfaceC1133bu);
        this.f7585h = new ayp(i, i2, map, this.f7584g.intValue() != 0);
    }

    /* JADX INFO: renamed from: c */
    private final C1078e m8692c(ayt aytVar) {
        if (!this.f7585h.mo8696a(aytVar)) {
            f7578a.m12552d("getGoogleApiForMethod() returned Gms", new Object[0]);
            return this.f7579b;
        }
        f7578a.m12552d("getGoogleApiForMethod() returned Fallback", new Object[0]);
        if (this.f7580c == null && this.f7581d != null) {
            ayq ayqVar = this.f7581d;
            ayo ayoVar = (ayo) this.f7582e.clone();
            ayoVar.f7586a = true;
            this.f7580c = ayqVar.m8697a(ayoVar);
        }
        return this.f7580c;
    }

    /* JADX INFO: renamed from: a */
    public final <TResult, A extends C1074a.c> AbstractC0964e<TResult> m8693a(ayt<A, TResult> aytVar) {
        return m8692c(aytVar).m6653a(aytVar);
    }

    /* JADX INFO: renamed from: b */
    public final <TResult, A extends C1074a.c> AbstractC0964e<TResult> m8694b(ayt<A, TResult> aytVar) {
        return m8692c(aytVar).m6658b(aytVar);
    }
}
