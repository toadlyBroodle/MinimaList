package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.mn */
/* JADX INFO: loaded from: classes.dex */
final class C1750mn extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final long f11054a;

    /* JADX INFO: renamed from: b */
    private long f11055b;

    C1750mn(InputStream inputStream, long j) {
        super(inputStream);
        this.f11054a = j;
    }

    /* JADX INFO: renamed from: a */
    final long m11786a() {
        return this.f11054a - this.f11055b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f11055b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f11055b += (long) i3;
        }
        return i3;
    }
}
