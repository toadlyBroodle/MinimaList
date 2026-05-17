package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bek extends Reader {

    /* JADX INFO: renamed from: a */
    private List<String> f7947a;

    /* JADX INFO: renamed from: b */
    private boolean f7948b = false;

    /* JADX INFO: renamed from: c */
    private int f7949c;

    /* JADX INFO: renamed from: e */
    private int f7951e = this.f7949c;

    /* JADX INFO: renamed from: d */
    private int f7950d;

    /* JADX INFO: renamed from: f */
    private int f7952f = this.f7950d;

    /* JADX INFO: renamed from: g */
    private boolean f7953g = false;

    public bek() {
        this.f7947a = null;
        this.f7947a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private final long m9085a(long j) {
        long j2 = 0;
        while (this.f7950d < this.f7947a.size() && j2 < j) {
            int iM9087c = m9087c();
            long j3 = j - j2;
            if (j3 < iM9087c) {
                this.f7949c = (int) (((long) this.f7949c) + j3);
                j2 += j3;
            } else {
                j2 += (long) iM9087c;
                this.f7949c = 0;
                this.f7950d++;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: b */
    private final String m9086b() {
        if (this.f7950d < this.f7947a.size()) {
            return this.f7947a.get(this.f7950d);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final int m9087c() {
        String strM9086b = m9086b();
        if (strM9086b == null) {
            return 0;
        }
        return strM9086b.length() - this.f7949c;
    }

    /* JADX INFO: renamed from: d */
    private final void m9088d() throws IOException {
        if (this.f7948b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f7953g) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9089a() {
        if (this.f7953g) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.f7953g = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m9090a(String str) {
        if (this.f7953g) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.f7947a.add(str);
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m9088d();
        this.f7948b = true;
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        m9088d();
        this.f7951e = this.f7949c;
        this.f7952f = this.f7950d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        m9088d();
        String strM9086b = m9086b();
        if (strM9086b == null) {
            return -1;
        }
        char cCharAt = strM9086b.charAt(this.f7949c);
        m9085a(1L);
        return cCharAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws IOException {
        m9088d();
        int iRemaining = charBuffer.remaining();
        int i = 0;
        String strM9086b = m9086b();
        while (iRemaining > 0 && strM9086b != null) {
            int iMin = Math.min(strM9086b.length() - this.f7949c, iRemaining);
            charBuffer.put(this.f7947a.get(this.f7950d), this.f7949c, this.f7949c + iMin);
            iRemaining -= iMin;
            i += iMin;
            m9085a(iMin);
            strM9086b = m9086b();
        }
        if (i > 0 || strM9086b != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        m9088d();
        int i3 = 0;
        String strM9086b = m9086b();
        while (strM9086b != null && i3 < i2) {
            int iMin = Math.min(m9087c(), i2 - i3);
            strM9086b.getChars(this.f7949c, this.f7949c + iMin, cArr, i + i3);
            m9085a(iMin);
            i3 += iMin;
            strM9086b = m9086b();
        }
        if (i3 > 0 || strM9086b != null) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        m9088d();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f7949c = this.f7951e;
        this.f7950d = this.f7952f;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        m9088d();
        return m9085a(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f7947a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
