package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aar {

    /* JADX INFO: renamed from: a */
    private final String f6168a;

    /* JADX INFO: renamed from: b */
    private final long f6169b;

    /* JADX INFO: renamed from: c */
    private boolean f6170c;

    /* JADX INFO: renamed from: d */
    private long f6171d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ aan f6172e;

    public aar(aan aanVar, String str, long j) {
        this.f6172e = aanVar;
        C1221aj.m7067a(str);
        this.f6168a = str;
        this.f6169b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m7442a() {
        if (!this.f6170c) {
            this.f6170c = true;
            this.f6171d = this.f6172e.m7424D().getLong(this.f6168a, this.f6169b);
        }
        return this.f6171d;
    }

    /* JADX INFO: renamed from: a */
    public final void m7443a(long j) {
        SharedPreferences.Editor editorEdit = this.f6172e.m7424D().edit();
        editorEdit.putLong(this.f6168a, j);
        editorEdit.apply();
        this.f6171d = j;
    }
}
