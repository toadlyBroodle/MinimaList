package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.sb */
/* JADX INFO: loaded from: classes.dex */
public final class C1900sb extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    private final C1638ij f11509a;

    public C1900sb(C1638ij c1638ij, int i) {
        this.f11509a = c1638ij;
        this.buf = this.f11509a.m11534a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: a */
    private final void m12302a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] bArrM11534a = this.f11509a.m11534a((this.count + i) << 1);
        System.arraycopy(this.buf, 0, bArrM11534a, 0, this.count);
        this.f11509a.m11533a(this.buf);
        this.buf = bArrM11534a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11509a.m11533a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f11509a.m11533a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m12302a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m12302a(i2);
        super.write(bArr, i, i2);
    }
}
