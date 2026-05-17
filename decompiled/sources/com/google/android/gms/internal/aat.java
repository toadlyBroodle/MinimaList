package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aat {

    /* JADX INFO: renamed from: a */
    private final String f6178a;

    /* JADX INFO: renamed from: b */
    private final String f6179b;

    /* JADX INFO: renamed from: c */
    private boolean f6180c;

    /* JADX INFO: renamed from: d */
    private String f6181d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ aan f6182e;

    public aat(aan aanVar, String str, String str2) {
        this.f6182e = aanVar;
        C1221aj.m7067a(str);
        this.f6178a = str;
        this.f6179b = null;
    }

    /* JADX INFO: renamed from: a */
    public final String m7448a() {
        if (!this.f6180c) {
            this.f6180c = true;
            this.f6181d = this.f6182e.m7424D().getString(this.f6178a, null);
        }
        return this.f6181d;
    }

    /* JADX INFO: renamed from: a */
    public final void m7449a(String str) {
        if (aek.m7725a(str, this.f6181d)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f6182e.m7424D().edit();
        editorEdit.putString(this.f6178a, str);
        editorEdit.apply();
        this.f6181d = str;
    }
}
