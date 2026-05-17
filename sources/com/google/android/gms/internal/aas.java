package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aas {

    /* JADX INFO: renamed from: a */
    private String f6173a;

    /* JADX INFO: renamed from: b */
    private final String f6174b;

    /* JADX INFO: renamed from: c */
    private final String f6175c;

    /* JADX INFO: renamed from: d */
    private final long f6176d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ aan f6177e;

    private aas(aan aanVar, String str, long j) {
        this.f6177e = aanVar;
        C1221aj.m7067a(str);
        C1221aj.m7074b(j > 0);
        this.f6173a = String.valueOf(str).concat(":start");
        this.f6174b = String.valueOf(str).concat(":count");
        this.f6175c = String.valueOf(str).concat(":value");
        this.f6176d = j;
    }

    /* JADX INFO: renamed from: b */
    private final void m7444b() {
        this.f6177e.mo7376c();
        long jMo7252a = this.f6177e.mo7384k().mo7252a();
        SharedPreferences.Editor editorEdit = this.f6177e.m7424D().edit();
        editorEdit.remove(this.f6174b);
        editorEdit.remove(this.f6175c);
        editorEdit.putLong(this.f6173a, jMo7252a);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    private final long m7445c() {
        return this.f6177e.m7424D().getLong(this.f6173a, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final Pair<String, Long> m7446a() {
        long jAbs;
        this.f6177e.mo7376c();
        this.f6177e.mo7376c();
        long jM7445c = m7445c();
        if (jM7445c == 0) {
            m7444b();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM7445c - this.f6177e.mo7384k().mo7252a());
        }
        if (jAbs < this.f6176d) {
            return null;
        }
        if (jAbs > (this.f6176d << 1)) {
            m7444b();
            return null;
        }
        String string = this.f6177e.m7424D().getString(this.f6175c, null);
        long j = this.f6177e.m7424D().getLong(this.f6174b, 0L);
        m7444b();
        return (string == null || j <= 0) ? aan.f6140a : new Pair<>(string, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m7447a(String str, long j) {
        this.f6177e.mo7376c();
        if (m7445c() == 0) {
            m7444b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f6177e.m7424D().getLong(this.f6174b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.f6177e.m7424D().edit();
            editorEdit.putString(this.f6175c, str);
            editorEdit.putLong(this.f6174b, 1L);
            editorEdit.apply();
            return;
        }
        boolean z = (this.f6177e.mo7389p().m7773z().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / (j2 + 1);
        SharedPreferences.Editor editorEdit2 = this.f6177e.m7424D().edit();
        if (z) {
            editorEdit2.putString(this.f6175c, str);
        }
        editorEdit2.putLong(this.f6174b, j2 + 1);
        editorEdit2.apply();
    }
}
