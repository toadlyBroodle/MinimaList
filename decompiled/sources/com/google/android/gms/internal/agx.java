package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class agx implements aht {

    /* JADX INFO: renamed from: a */
    private boolean f6750a = true;

    /* JADX INFO: renamed from: b */
    private int f6751b = 5;

    /* JADX INFO: renamed from: a */
    private final boolean m7889a(int i) {
        return (this.f6750a && Log.isLoggable("GoogleTagManager", i)) || (!this.f6750a && this.f6751b <= i);
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: a */
    public final void mo7890a(String str) {
        if (m7889a(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: a */
    public final void mo7891a(String str, Throwable th) {
        if (m7889a(6)) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: b */
    public final void mo7892b(String str) {
        if (m7889a(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: b */
    public final void mo7893b(String str, Throwable th) {
        if (m7889a(5)) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: c */
    public final void mo7894c(String str) {
        if (m7889a(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.aht
    /* JADX INFO: renamed from: d */
    public final void mo7895d(String str) {
        if (m7889a(2)) {
            Log.v("GoogleTagManager", str);
        }
    }
}
