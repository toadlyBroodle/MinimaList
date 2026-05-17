package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.xk */
/* JADX INFO: loaded from: classes.dex */
final class C2044xk {

    /* JADX INFO: renamed from: b */
    private static boolean f12300b = false;

    /* JADX INFO: renamed from: c */
    private static MessageDigest f12301c = null;

    /* JADX INFO: renamed from: d */
    private static final Object f12302d = new Object();

    /* JADX INFO: renamed from: e */
    private static final Object f12303e = new Object();

    /* JADX INFO: renamed from: a */
    static CountDownLatch f12299a = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    private static C1937tl m12567a(long j) {
        C1937tl c1937tl = new C1937tl();
        c1937tl.f11593k = 4096L;
        return c1937tl;
    }

    /* JADX INFO: renamed from: a */
    static String m12568a(C1937tl c1937tl, String str) throws GeneralSecurityException {
        byte[] bArrM12573a;
        byte[] bArrM10164a = bsc.m10164a(c1937tl);
        if (((Boolean) bxm.m10409f().m10546a(can.f9531by)).booleanValue()) {
            bArrM12573a = m12573a(bArrM10164a, str);
        } else {
            if (C2047xn.f12304a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrMo8269a = C2047xn.f12304a.mo8269a(bArrM10164a, str != null ? str.getBytes() : new byte[0]);
            C2004vy c2004vy = new C2004vy();
            c2004vy.f11843a = new byte[][]{bArrMo8269a};
            c2004vy.f11845c = 2;
            bArrM12573a = bsc.m10164a(c2004vy);
        }
        return C2042xi.m12565a(bArrM12573a, true);
    }

    /* JADX INFO: renamed from: a */
    private static Vector<byte[]> m12570a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    /* JADX INFO: renamed from: a */
    static void m12571a() {
        synchronized (f12303e) {
            if (!f12300b) {
                f12300b = true;
                new Thread(new RunnableC2046xm()).start();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12572a(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (f12302d) {
            MessageDigest messageDigestM12575b = m12575b();
            if (messageDigestM12575b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigestM12575b.reset();
            messageDigestM12575b.update(bArr);
            bArrDigest = f12301c.digest();
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m12573a(byte[] bArr, String str) {
        Vector<byte[]> vectorM12570a = m12570a(bArr, 255);
        if (vectorM12570a == null || vectorM12570a.size() == 0) {
            return m12574a(bsc.m10164a(m12567a(4096L)), str, true);
        }
        C2004vy c2004vy = new C2004vy();
        c2004vy.f11843a = new byte[vectorM12570a.size()][];
        Iterator<byte[]> it = vectorM12570a.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2004vy.f11843a[i] = m12574a(it.next(), str, false);
            i++;
        }
        c2004vy.f11844b = m12572a(bArr);
        return bsc.m10164a(c2004vy);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m12574a(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = bsc.m10164a(m12567a(4096L));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[i - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m12572a(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        new C2049xp().m12578a(bArrArray, bArr3);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new bnv(str.getBytes("UTF-8")).m9746a(bArr3);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    private static MessageDigest m12575b() {
        m12571a();
        boolean zAwait = false;
        try {
            zAwait = f12299a.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        if (zAwait && f12301c != null) {
            return f12301c;
        }
        return null;
    }
}
