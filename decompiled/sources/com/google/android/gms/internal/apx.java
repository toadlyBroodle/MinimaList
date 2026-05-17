package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class apx<T> {

    /* JADX INFO: renamed from: a */
    private Status f7056a;

    /* JADX INFO: renamed from: b */
    private T f7057b;

    /* JADX INFO: renamed from: c */
    private long f7058c;

    public apx(Status status, T t, long j) {
        this.f7056a = status;
        this.f7057b = t;
        this.f7058c = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m8132a() {
        return this.f7058c;
    }

    /* JADX INFO: renamed from: a */
    public final void m8133a(long j) {
        this.f7058c = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m8134a(Status status) {
        this.f7056a = status;
    }

    /* JADX INFO: renamed from: a */
    public final void m8135a(T t) {
        this.f7057b = t;
    }
}
