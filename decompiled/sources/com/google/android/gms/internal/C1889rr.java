package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C1221aj;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.rr */
/* JADX INFO: loaded from: classes.dex */
public final class C1889rr {

    /* JADX INFO: renamed from: a */
    private final String f11482a;

    /* JADX INFO: renamed from: b */
    private final long f11483b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1886ro f11484c;

    private C1889rr(C1886ro c1886ro, String str, long j) {
        this.f11484c = c1886ro;
        C1221aj.m7067a(str);
        C1221aj.m7074b(j > 0);
        this.f11482a = str;
        this.f11483b = j;
    }

    /* JADX INFO: renamed from: b */
    private final void m12262b() {
        long jMo7252a = this.f11484c.m12037i().mo7252a();
        SharedPreferences.Editor editorEdit = this.f11484c.f11478a.edit();
        editorEdit.remove(m12265e());
        editorEdit.remove(m12266f());
        editorEdit.putLong(m12264d(), jMo7252a);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: c */
    private final long m12263c() {
        return this.f11484c.f11478a.getLong(m12264d(), 0L);
    }

    /* JADX INFO: renamed from: d */
    private final String m12264d() {
        return String.valueOf(this.f11482a).concat(":start");
    }

    /* JADX INFO: renamed from: e */
    private final String m12265e() {
        return String.valueOf(this.f11482a).concat(":count");
    }

    /* JADX INFO: renamed from: f */
    private final String m12266f() {
        return String.valueOf(this.f11482a).concat(":value");
    }

    /* JADX INFO: renamed from: a */
    public final Pair<String, Long> m12267a() {
        long jM12263c = m12263c();
        long jAbs = jM12263c == 0 ? 0L : Math.abs(jM12263c - this.f11484c.m12037i().mo7252a());
        if (jAbs < this.f11483b) {
            return null;
        }
        if (jAbs > (this.f11483b << 1)) {
            m12262b();
            return null;
        }
        String string = this.f11484c.f11478a.getString(m12266f(), null);
        long j = this.f11484c.f11478a.getLong(m12265e(), 0L);
        m12262b();
        if (string == null || j <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m12268a(String str) {
        if (m12263c() == 0) {
            m12262b();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.f11484c.f11478a.getLong(m12265e(), 0L);
            if (j <= 0) {
                SharedPreferences.Editor editorEdit = this.f11484c.f11478a.edit();
                editorEdit.putString(m12266f(), str);
                editorEdit.putLong(m12265e(), 1L);
                editorEdit.apply();
                return;
            }
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1);
            SharedPreferences.Editor editorEdit2 = this.f11484c.f11478a.edit();
            if (z) {
                editorEdit2.putString(m12266f(), str);
            }
            editorEdit2.putLong(m12265e(), j + 1);
            editorEdit2.apply();
        }
    }
}
