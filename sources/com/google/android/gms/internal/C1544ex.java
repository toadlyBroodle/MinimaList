package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ex */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C1544ex {

    /* JADX INFO: renamed from: a */
    private long f10582a = -1;

    /* JADX INFO: renamed from: b */
    private long f10583b = -1;

    /* JADX INFO: renamed from: a */
    public final long m11266a() {
        return this.f10583b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11267b() {
        this.f10583b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c */
    public final void m11268c() {
        this.f10582a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m11269d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f10582a);
        bundle.putLong("tclose", this.f10583b);
        return bundle;
    }
}
