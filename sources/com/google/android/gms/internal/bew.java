package com.google.android.gms.internal;

import com.google.firebase.C2213b;

/* JADX INFO: loaded from: classes.dex */
public final class bew extends bet {
    /* JADX INFO: renamed from: a */
    public final synchronized void m9128a(C2213b c2213b) {
        this.f7970h = c2213b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m9129c(String str) {
        m9121c();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f7966d = str;
    }
}
