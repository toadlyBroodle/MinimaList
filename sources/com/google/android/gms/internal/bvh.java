package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvh extends bvc {

    /* JADX INFO: renamed from: b */
    private MessageDigest f9116b;

    @Override // com.google.android.gms.internal.bvc
    /* JADX INFO: renamed from: a */
    public final byte[] mo10316a(String str) {
        byte[] bArrArray;
        byte[] bArr;
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iM10320a = bvg.m10320a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM10320a);
            bArrArray = byteBufferAllocate.array();
        } else if (strArrSplit.length < 5) {
            byte[] bArr2 = new byte[strArrSplit.length << 1];
            for (int i = 0; i < strArrSplit.length; i++) {
                int iM10320a2 = bvg.m10320a(strArrSplit[i]);
                int i2 = (iM10320a2 >> 16) ^ (65535 & iM10320a2);
                byte[] bArr3 = {(byte) i2, (byte) (i2 >> 8)};
                bArr2[i << 1] = bArr3[0];
                bArr2[(i << 1) + 1] = bArr3[1];
            }
            bArrArray = bArr2;
        } else {
            bArrArray = new byte[strArrSplit.length];
            for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                int iM10320a3 = bvg.m10320a(strArrSplit[i3]);
                bArrArray[i3] = (byte) ((iM10320a3 >> 24) ^ (((iM10320a3 & 255) ^ ((iM10320a3 >> 8) & 255)) ^ ((iM10320a3 >> 16) & 255)));
            }
        }
        this.f9116b = m10315a();
        synchronized (this.f9109a) {
            if (this.f9116b == null) {
                bArr = new byte[0];
            } else {
                this.f9116b.reset();
                this.f9116b.update(bArrArray);
                byte[] bArrDigest = this.f9116b.digest();
                bArr = new byte[bArrDigest.length > 4 ? 4 : bArrDigest.length];
                System.arraycopy(bArrDigest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }
}
