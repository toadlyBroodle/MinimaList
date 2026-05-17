package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class air implements aiq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ail f6876a;

    /* JADX INFO: renamed from: b */
    private Handler f6877b;

    private air(ail ailVar) {
        this.f6876a = ailVar;
        this.f6877b = new Handler(this.f6876a.f6851b.getMainLooper(), new ais(this));
    }

    /* synthetic */ air(ail ailVar, aim aimVar) {
        this(ailVar);
    }

    /* JADX INFO: renamed from: c */
    private final Message m8028c() {
        return this.f6877b.obtainMessage(1, ail.f6849a);
    }

    @Override // com.google.android.gms.internal.aiq
    /* JADX INFO: renamed from: a */
    public final void mo8025a() {
        this.f6877b.removeMessages(1, ail.f6849a);
        this.f6877b.sendMessage(m8028c());
    }

    @Override // com.google.android.gms.internal.aiq
    /* JADX INFO: renamed from: a */
    public final void mo8026a(long j) {
        this.f6877b.removeMessages(1, ail.f6849a);
        this.f6877b.sendMessageDelayed(m8028c(), j);
    }

    @Override // com.google.android.gms.internal.aiq
    /* JADX INFO: renamed from: b */
    public final void mo8027b() {
        this.f6877b.removeMessages(1, ail.f6849a);
    }
}
