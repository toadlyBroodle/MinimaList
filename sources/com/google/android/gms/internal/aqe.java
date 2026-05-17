package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqe {

    /* JADX INFO: renamed from: a */
    private final byte[] f7066a;

    /* JADX INFO: renamed from: b */
    private final long f7067b;

    /* JADX INFO: renamed from: c */
    private final app f7068c;

    /* JADX INFO: renamed from: d */
    private final aqs f7069d;

    public aqe(app appVar, byte[] bArr, aqs aqsVar, long j) {
        this.f7068c = appVar;
        this.f7066a = bArr;
        this.f7069d = aqsVar;
        this.f7067b = j;
    }

    public aqe(aqs aqsVar) {
        this(null, null, aqsVar, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m8144a() {
        return this.f7066a;
    }

    /* JADX INFO: renamed from: b */
    public final app m8145b() {
        return this.f7068c;
    }

    /* JADX INFO: renamed from: c */
    public final aqs m8146c() {
        return this.f7069d;
    }

    /* JADX INFO: renamed from: d */
    public final long m8147d() {
        return this.f7067b;
    }
}
