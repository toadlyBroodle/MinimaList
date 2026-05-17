package com.google.android.gms.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.kl */
/* JADX INFO: loaded from: classes.dex */
public final class C1694kl implements InterfaceC1957ue {

    /* JADX INFO: renamed from: a */
    private final Map<String, C1722lm> f10889a;

    /* JADX INFO: renamed from: b */
    private long f10890b;

    /* JADX INFO: renamed from: c */
    private final File f10891c;

    /* JADX INFO: renamed from: d */
    private final int f10892d;

    public C1694kl(File file) {
        this(file, 5242880);
    }

    private C1694kl(File file, int i) {
        this.f10889a = new LinkedHashMap(16, 0.75f, true);
        this.f10890b = 0L;
        this.f10891c = file;
        this.f10892d = 5242880;
    }

    /* JADX INFO: renamed from: a */
    static int m11634a(InputStream inputStream) {
        return m11645c(inputStream) | 0 | (m11645c(inputStream) << 8) | (m11645c(inputStream) << 16) | (m11645c(inputStream) << 24);
    }

    /* JADX INFO: renamed from: a */
    private static InputStream m11635a(File file) {
        return new FileInputStream(file);
    }

    /* JADX INFO: renamed from: a */
    static String m11636a(C1750mn c1750mn) {
        return new String(m11641a(c1750mn, m11642b((InputStream) c1750mn)), "UTF-8");
    }

    /* JADX INFO: renamed from: a */
    static void m11637a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    static void m11638a(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: renamed from: a */
    static void m11639a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m11638a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: a */
    private final void m11640a(String str, C1722lm c1722lm) {
        if (this.f10889a.containsKey(str)) {
            this.f10890b = (c1722lm.f10943a - this.f10889a.get(str).f10943a) + this.f10890b;
        } else {
            this.f10890b += c1722lm.f10943a;
        }
        this.f10889a.put(str, c1722lm);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m11641a(C1750mn c1750mn, long j) throws IOException {
        long jM11786a = c1750mn.m11786a();
        if (j < 0 || j > jM11786a || ((int) j) != j) {
            throw new IOException(new StringBuilder(73).append("streamToBytes length=").append(j).append(", maxLength=").append(jM11786a).toString());
        }
        byte[] bArr = new byte[(int) j];
        new DataInputStream(c1750mn).readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    static long m11642b(InputStream inputStream) {
        return 0 | (((long) m11645c(inputStream)) & 255) | ((((long) m11645c(inputStream)) & 255) << 8) | ((((long) m11645c(inputStream)) & 255) << 16) | ((((long) m11645c(inputStream)) & 255) << 24) | ((((long) m11645c(inputStream)) & 255) << 32) | ((((long) m11645c(inputStream)) & 255) << 40) | ((((long) m11645c(inputStream)) & 255) << 48) | ((((long) m11645c(inputStream)) & 255) << 56);
    }

    /* JADX INFO: renamed from: b */
    static List<byl> m11643b(C1750mn c1750mn) {
        int iM11634a = m11634a((InputStream) c1750mn);
        List<byl> listEmptyList = iM11634a == 0 ? Collections.emptyList() : new ArrayList<>(iM11634a);
        for (int i = 0; i < iM11634a; i++) {
            listEmptyList.add(new byl(m11636a(c1750mn).intern(), m11636a(c1750mn).intern()));
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m11644b(String str) {
        boolean zDelete = m11647d(str).delete();
        m11648e(str);
        if (!zDelete) {
            C1498de.m11170b("Could not delete cache entry for key=%s, filename=%s", str, m11646c(str));
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m11645c(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    private static String m11646c(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: d */
    private final File m11647d(String str) {
        return new File(this.f10891c, m11646c(str));
    }

    /* JADX INFO: renamed from: e */
    private final void m11648e(String str) {
        C1722lm c1722lmRemove = this.f10889a.remove(str);
        if (c1722lmRemove != null) {
            this.f10890b -= c1722lmRemove.f10943a;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1957ue
    /* JADX INFO: renamed from: a */
    public final synchronized C2048xo mo11649a(String str) {
        C2048xo c2048xo;
        C1722lm c1722lm = this.f10889a.get(str);
        if (c1722lm == null) {
            c2048xo = null;
        } else {
            File fileM11647d = m11647d(str);
            try {
                C1750mn c1750mn = new C1750mn(new BufferedInputStream(m11635a(fileM11647d)), fileM11647d.length());
                try {
                    C1722lm c1722lmM11687a = C1722lm.m11687a(c1750mn);
                    if (TextUtils.equals(str, c1722lmM11687a.f10944b)) {
                        byte[] bArrM11641a = m11641a(c1750mn, c1750mn.m11786a());
                        C2048xo c2048xo2 = new C2048xo();
                        c2048xo2.f12305a = bArrM11641a;
                        c2048xo2.f12306b = c1722lm.f10945c;
                        c2048xo2.f12307c = c1722lm.f10946d;
                        c2048xo2.f12308d = c1722lm.f10947e;
                        c2048xo2.f12309e = c1722lm.f10948f;
                        c2048xo2.f12310f = c1722lm.f10949g;
                        c2048xo2.f12311g = C1778no.m11905a(c1722lm.f10950h);
                        c2048xo2.f12312h = Collections.unmodifiableList(c1722lm.f10950h);
                        c1750mn.close();
                        c2048xo = c2048xo2;
                    } else {
                        C1498de.m11170b("%s: key=%s, found=%s", fileM11647d.getAbsolutePath(), str, c1722lmM11687a.f10944b);
                        m11648e(str);
                        c2048xo = null;
                    }
                } finally {
                }
            } catch (IOException e) {
                C1498de.m11170b("%s: %s", fileM11647d.getAbsolutePath(), e.toString());
                m11644b(str);
                c2048xo = null;
            }
        }
        return c2048xo;
    }

    @Override // com.google.android.gms.internal.InterfaceC1957ue
    /* JADX INFO: renamed from: a */
    public final synchronized void mo11650a() {
        if (this.f10891c.exists()) {
            File[] fileArrListFiles = this.f10891c.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        C1750mn c1750mn = new C1750mn(new BufferedInputStream(m11635a(file)), length);
                        try {
                            C1722lm c1722lmM11687a = C1722lm.m11687a(c1750mn);
                            c1722lmM11687a.f10943a = length;
                            m11640a(c1722lmM11687a.f10944b, c1722lmM11687a);
                            c1750mn.close();
                        } catch (Throwable th) {
                            c1750mn.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        file.delete();
                    }
                }
            }
        } else if (!this.f10891c.mkdirs()) {
            C1498de.m11171c("Unable to create cache dir %s", this.f10891c.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1957ue
    /* JADX INFO: renamed from: a */
    public final synchronized void mo11651a(String str, C2048xo c2048xo) {
        BufferedOutputStream bufferedOutputStream;
        C1722lm c1722lm;
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.f10890b + ((long) c2048xo.f12305a.length) >= this.f10892d) {
                if (C1498de.f10438a) {
                    C1498de.m11168a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f10890b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Map.Entry<String, C1722lm>> it = this.f10889a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        break;
                    }
                    C1722lm value = it.next().getValue();
                    if (m11647d(value.f10944b).delete()) {
                        this.f10890b -= value.f10943a;
                    } else {
                        C1498de.m11170b("Could not delete cache entry for key=%s, filename=%s", value.f10944b, m11646c(value.f10944b));
                    }
                    it.remove();
                    i = i2 + 1;
                    if (this.f10890b + ((long) r2) < this.f10892d * 0.9f) {
                        break;
                    } else {
                        i2 = i;
                    }
                }
                if (C1498de.f10438a) {
                    C1498de.m11168a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f10890b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            }
            File fileM11647d = m11647d(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM11647d));
                c1722lm = new C1722lm(str, c2048xo);
            } catch (IOException e) {
                if (!fileM11647d.delete()) {
                    C1498de.m11170b("Could not clean up file %s", fileM11647d.getAbsolutePath());
                }
            }
            if (!c1722lm.m11688a(bufferedOutputStream)) {
                bufferedOutputStream.close();
                C1498de.m11170b("Failed to write header for %s", fileM11647d.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(c2048xo.f12305a);
            bufferedOutputStream.close();
            m11640a(str, c1722lm);
        }
    }
}
