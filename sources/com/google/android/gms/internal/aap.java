package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aap {

    /* JADX INFO: renamed from: a */
    private final String f6162a;

    /* JADX INFO: renamed from: b */
    private final boolean f6163b;

    /* JADX INFO: renamed from: c */
    private boolean f6164c;

    /* JADX INFO: renamed from: d */
    private boolean f6165d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ aan f6166e;

    public aap(aan aanVar, String str, boolean z) {
        this.f6166e = aanVar;
        C1221aj.m7067a(str);
        this.f6162a = str;
        this.f6163b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m7439a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f6166e.m7424D().edit();
        editorEdit.putBoolean(this.f6162a, z);
        editorEdit.apply();
        this.f6165d = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7440a() {
        if (!this.f6164c) {
            this.f6164c = true;
            this.f6165d = this.f6166e.m7424D().getBoolean(this.f6162a, this.f6163b);
        }
        return this.f6165d;
    }
}
