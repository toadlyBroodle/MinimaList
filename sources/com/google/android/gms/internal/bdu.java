package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bdu {

    /* JADX INFO: renamed from: a */
    private String f7888a;

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f7889b;

    /* JADX INFO: renamed from: c */
    private bdw f7890c;

    /* JADX INFO: renamed from: d */
    private boolean f7891d;

    private bdu(String str, Map<String, Object> map, bdw bdwVar) {
        this.f7888a = str;
        this.f7889b = map;
        this.f7890c = bdwVar;
    }

    /* synthetic */ bdu(String str, Map map, bdw bdwVar, bdg bdgVar) {
        this(str, map, bdwVar);
    }

    /* JADX INFO: renamed from: a */
    public final String m9038a() {
        return this.f7888a;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m9039b() {
        return this.f7889b;
    }

    /* JADX INFO: renamed from: c */
    public final bdw m9040c() {
        return this.f7890c;
    }

    /* JADX INFO: renamed from: d */
    public final void m9041d() {
        this.f7891d = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9042e() {
        return this.f7891d;
    }
}
