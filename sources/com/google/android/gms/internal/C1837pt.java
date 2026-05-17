package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.pt */
/* JADX INFO: loaded from: classes.dex */
public final class C1837pt {

    /* JADX INFO: renamed from: a */
    private final long f11323a;

    /* JADX INFO: renamed from: b */
    private final String f11324b;

    /* JADX INFO: renamed from: c */
    private final String f11325c;

    /* JADX INFO: renamed from: d */
    private final boolean f11326d;

    /* JADX INFO: renamed from: e */
    private long f11327e;

    /* JADX INFO: renamed from: f */
    private final Map<String, String> f11328f;

    public C1837pt(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        this.f11323a = 0L;
        this.f11324b = str;
        this.f11325c = str2;
        this.f11326d = z;
        this.f11327e = j2;
        if (map != null) {
            this.f11328f = new HashMap(map);
        } else {
            this.f11328f = Collections.emptyMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m12075a() {
        return this.f11323a;
    }

    /* JADX INFO: renamed from: a */
    public final void m12076a(long j) {
        this.f11327e = j;
    }

    /* JADX INFO: renamed from: b */
    public final String m12077b() {
        return this.f11324b;
    }

    /* JADX INFO: renamed from: c */
    public final String m12078c() {
        return this.f11325c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12079d() {
        return this.f11326d;
    }

    /* JADX INFO: renamed from: e */
    public final long m12080e() {
        return this.f11327e;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m12081f() {
        return this.f11328f;
    }
}
