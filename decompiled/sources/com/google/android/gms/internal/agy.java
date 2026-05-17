package com.google.android.gms.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class agy implements ahe {

    /* JADX INFO: renamed from: a */
    private static agy f6752a;

    /* JADX INFO: renamed from: b */
    private static final Object f6753b = new Object();

    /* JADX INFO: renamed from: e */
    private static final Set<String> f6754e = new HashSet(Arrays.asList("GET", "HEAD", "POST", "PUT"));

    /* JADX INFO: renamed from: c */
    private aib f6755c;

    /* JADX INFO: renamed from: d */
    private ahf f6756d;

    private agy(Context context) {
        this(ahg.m7923a(context), new aij());
    }

    private agy(ahf ahfVar, aib aibVar) {
        this.f6756d = ahfVar;
        this.f6755c = aibVar;
    }

    /* JADX INFO: renamed from: a */
    public static ahe m7896a(Context context) {
        agy agyVar;
        synchronized (f6753b) {
            if (f6752a == null) {
                f6752a = new agy(context);
            }
            agyVar = f6752a;
        }
        return agyVar;
    }

    @Override // com.google.android.gms.internal.ahe
    /* JADX INFO: renamed from: a */
    public final void mo7897a() {
        ail.m8010b().m8020d();
    }

    @Override // com.google.android.gms.internal.ahe
    /* JADX INFO: renamed from: a */
    public final boolean mo7898a(String str) {
        return mo7900a(str, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ahe
    /* JADX INFO: renamed from: a */
    public final boolean mo7899a(String str, String str2) {
        return mo7900a(str, null, str2, null, null);
    }

    @Override // com.google.android.gms.internal.ahe
    /* JADX INFO: renamed from: a */
    public final boolean mo7900a(String str, String str2, String str3, Map<String, String> map, String str4) {
        if (str2 != null && !f6754e.contains(str2)) {
            ahs.m7944b(String.format("Unsupport http method %s. Drop the hit.", str2));
            return false;
        }
        if (aia.m7973a().m7976b() || this.f6755c.mo7979a()) {
            this.f6756d.mo7922a(str, str2, str3, map, str4);
            return true;
        }
        ahs.m7944b("Too many hits sent too quickly (rate throttled).");
        return false;
    }
}
