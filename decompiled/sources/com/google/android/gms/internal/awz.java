package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
final class awz {

    /* JADX INFO: renamed from: a */
    private awv f7514a;

    /* JADX INFO: renamed from: b */
    private int[] f7515b;

    /* JADX INFO: renamed from: c */
    private int[] f7516c;

    /* JADX INFO: renamed from: d */
    private int[] f7517d = new int[16];

    /* JADX INFO: renamed from: e */
    private int f7518e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f7519f = false;

    awz(awv awvVar, byte[] bArr, int i) {
        this.f7514a = awvVar;
        this.f7515b = awvVar.mo8648a(bArr, i);
        this.f7516c = awvVar.m8649a(this.f7515b);
    }

    /* JADX INFO: renamed from: a */
    final byte[] m8658a(int i) {
        if (this.f7519f) {
            throw new IllegalStateException("first can only be called once and before next().");
        }
        this.f7519f = true;
        this.f7518e = 8;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(this.f7516c, 0, 8);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: a */
    final int[] m8659a() {
        this.f7519f = true;
        System.arraycopy(this.f7516c, this.f7518e, this.f7517d, 0, 16 - this.f7518e);
        this.f7514a.mo8652c(this.f7515b);
        this.f7516c = this.f7514a.m8649a(this.f7515b);
        System.arraycopy(this.f7516c, 0, this.f7517d, 16 - this.f7518e, this.f7518e);
        return this.f7517d;
    }
}
