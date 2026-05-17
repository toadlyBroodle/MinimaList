package android.support.p005c;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: android.support.c.d */
/* JADX INFO: loaded from: classes.dex */
final class C0024d {

    /* JADX INFO: renamed from: android.support.c.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f141a;

        /* JADX INFO: renamed from: b */
        long f142b;

        a() {
        }
    }

    /* JADX INFO: renamed from: a */
    static long m148a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m149a(randomAccessFile, m150a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX INFO: renamed from: a */
    static long m149a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f142b;
        randomAccessFile.seek(aVar.f141a);
        byte[] bArr = new byte[16384];
        int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (i != -1) {
            crc32.update(bArr, 0, i);
            j -= (long) i;
            if (j == 0) {
                break;
            }
            i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    /* JADX INFO: renamed from: a */
    static a m150a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        long j3 = length;
        do {
            randomAccessFile.seek(j3);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f142b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f141a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j3--;
        } while (j3 >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
