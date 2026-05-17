package com.google.android.gms.internal;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bkh extends bkj {
    public bkh(bkn bknVar, List<String> list) {
        super(bknVar, list);
    }

    @Override // com.google.android.gms.internal.bkj
    /* JADX INFO: renamed from: a */
    protected final String mo9529a(bkn bknVar, String str, String str2, long j) {
        return str2;
    }

    @Override // com.google.android.gms.internal.bkj
    /* JADX INFO: renamed from: a */
    protected final void mo9530a(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.android.gms.internal.bkj
    /* JADX INFO: renamed from: b */
    protected final void mo9531b(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.google.android.gms.internal.bkj
    /* JADX INFO: renamed from: c */
    protected final void mo9532c(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.android.gms.internal.bkj
    /* JADX INFO: renamed from: d */
    protected final void mo9533d(String str, String str2) {
        Log.d(str, str2);
    }
}
