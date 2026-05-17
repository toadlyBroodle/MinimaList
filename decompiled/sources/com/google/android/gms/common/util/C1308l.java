package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.common.util.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1308l {
    /* JADX INFO: renamed from: a */
    public static long m7273a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m7274a(inputStream, outputStream, z, 1024);
    }

    /* JADX INFO: renamed from: a */
    public static long m7274a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, bArr.length);
                if (i2 == -1) {
                    break;
                }
                j += (long) i2;
                outputStream.write(bArr, 0, i2);
            } finally {
                if (z) {
                    m7275a(inputStream);
                    m7275a(outputStream);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static void m7275a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7276a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m7273a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
