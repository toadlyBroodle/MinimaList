package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvl extends bvc {

    /* JADX INFO: renamed from: b */
    private MessageDigest f9120b;

    /* JADX INFO: renamed from: c */
    private final int f9121c;

    /* JADX INFO: renamed from: d */
    private final int f9122d;

    public bvl(int i) {
        int i2 = i / 8;
        this.f9121c = i % 8 > 0 ? i2 + 1 : i2;
        this.f9122d = i;
    }

    @Override // com.google.android.gms.internal.bvc
    /* JADX INFO: renamed from: a */
    public final byte[] mo10316a(String str) {
        byte[] bArr;
        synchronized (this.f9109a) {
            this.f9120b = m10315a();
            if (this.f9120b == null) {
                bArr = new byte[0];
            } else {
                this.f9120b.reset();
                this.f9120b.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f9120b.digest();
                bArr = new byte[bArrDigest.length > this.f9121c ? this.f9121c : bArrDigest.length];
                System.arraycopy(bArrDigest, 0, bArr, 0, bArr.length);
                if (this.f9122d % 8 > 0) {
                    long j = 0;
                    for (int i = 0; i < bArr.length; i++) {
                        if (i > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i] & 255);
                    }
                    long j2 = j >>> (8 - (this.f9122d % 8));
                    for (int i2 = this.f9121c - 1; i2 >= 0; i2--) {
                        bArr[i2] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
            }
        }
        return bArr;
    }
}
