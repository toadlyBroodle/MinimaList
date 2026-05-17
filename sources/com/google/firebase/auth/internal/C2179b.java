package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.bao;
import com.google.firebase.auth.AbstractC2158a;
import com.google.firebase.auth.C2170c;
import com.google.firebase.auth.C2201o;
import com.google.firebase.auth.C2202p;
import com.google.firebase.auth.C2206t;
import com.google.firebase.auth.C2207u;
import com.google.firebase.auth.C2210x;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2179b {
    /* JADX INFO: renamed from: a */
    public static bao m12855a(AbstractC2158a abstractC2158a) {
        C1221aj.m7065a(abstractC2158a);
        if (C2202p.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2202p.m12903a((C2202p) abstractC2158a);
        }
        if (C2170c.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2170c.m12850a((C2170c) abstractC2158a);
        }
        if (C2207u.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2207u.m12913a((C2207u) abstractC2158a);
        }
        if (C2201o.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2201o.m12902a((C2201o) abstractC2158a);
        }
        if (C2206t.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2206t.m12912a((C2206t) abstractC2158a);
        }
        if (C2210x.class.isAssignableFrom(abstractC2158a.getClass())) {
            return C2210x.m12914a((C2210x) abstractC2158a);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
