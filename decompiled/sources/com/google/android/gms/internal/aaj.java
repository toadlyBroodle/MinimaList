package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class aaj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final aai f6122a;

    /* JADX INFO: renamed from: b */
    private final int f6123b;

    /* JADX INFO: renamed from: c */
    private final Throwable f6124c;

    /* JADX INFO: renamed from: d */
    private final byte[] f6125d;

    /* JADX INFO: renamed from: e */
    private final String f6126e;

    /* JADX INFO: renamed from: f */
    private final Map<String, List<String>> f6127f;

    private aaj(String str, aai aaiVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C1221aj.m7065a(aaiVar);
        this.f6122a = aaiVar;
        this.f6123b = i;
        this.f6124c = th;
        this.f6125d = bArr;
        this.f6126e = str;
        this.f6127f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6122a.mo7420a(this.f6126e, this.f6123b, this.f6124c, this.f6125d, this.f6127f);
    }
}
