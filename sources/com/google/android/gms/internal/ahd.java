package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ahd {

    /* JADX INFO: renamed from: a */
    private final long f6765a;

    /* JADX INFO: renamed from: b */
    private final long f6766b;

    /* JADX INFO: renamed from: c */
    private final long f6767c;

    /* JADX INFO: renamed from: d */
    private String f6768d;

    /* JADX INFO: renamed from: e */
    private String f6769e;

    /* JADX INFO: renamed from: f */
    private Map<String, String> f6770f;

    /* JADX INFO: renamed from: g */
    private String f6771g;

    ahd(long j, long j2, long j3) {
        this.f6765a = j;
        this.f6766b = j2;
        this.f6767c = j3;
    }

    /* JADX INFO: renamed from: a */
    final long m7911a() {
        return this.f6765a;
    }

    /* JADX INFO: renamed from: a */
    final void m7912a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.f6768d = str;
    }

    /* JADX INFO: renamed from: a */
    final void m7913a(Map<String, String> map) {
        this.f6770f = map;
    }

    /* JADX INFO: renamed from: b */
    final long m7914b() {
        return this.f6767c;
    }

    /* JADX INFO: renamed from: b */
    final void m7915b(String str) {
        this.f6769e = str;
    }

    /* JADX INFO: renamed from: c */
    final String m7916c() {
        return this.f6768d;
    }

    /* JADX INFO: renamed from: c */
    final void m7917c(String str) {
        this.f6771g = str;
    }

    /* JADX INFO: renamed from: d */
    final String m7918d() {
        return this.f6769e;
    }

    /* JADX INFO: renamed from: e */
    final Map<String, String> m7919e() {
        return this.f6770f;
    }

    /* JADX INFO: renamed from: f */
    final String m7920f() {
        return this.f6771g;
    }
}
