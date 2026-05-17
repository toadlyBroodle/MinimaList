package com.google.p036a.p042d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.google.a.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C0612c implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    private static final String[] f4247a = new String[128];

    /* JADX INFO: renamed from: b */
    private static final String[] f4248b;

    /* JADX INFO: renamed from: c */
    private final Writer f4249c;

    /* JADX INFO: renamed from: d */
    private int[] f4250d = new int[32];

    /* JADX INFO: renamed from: e */
    private int f4251e = 0;

    /* JADX INFO: renamed from: f */
    private String f4252f;

    /* JADX INFO: renamed from: g */
    private String f4253g;

    /* JADX INFO: renamed from: h */
    private boolean f4254h;

    /* JADX INFO: renamed from: i */
    private boolean f4255i;

    /* JADX INFO: renamed from: j */
    private String f4256j;

    /* JADX INFO: renamed from: k */
    private boolean f4257k;

    static {
        for (int i = 0; i <= 31; i++) {
            f4247a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        f4247a[34] = "\\\"";
        f4247a[92] = "\\\\";
        f4247a[9] = "\\t";
        f4247a[8] = "\\b";
        f4247a[10] = "\\n";
        f4247a[13] = "\\r";
        f4247a[12] = "\\f";
        f4248b = (String[]) f4247a.clone();
        f4248b[60] = "\\u003c";
        f4248b[62] = "\\u003e";
        f4248b[38] = "\\u0026";
        f4248b[61] = "\\u003d";
        f4248b[39] = "\\u0027";
    }

    public C0612c(Writer writer) {
        m5230a(6);
        this.f4253g = ":";
        this.f4257k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f4249c = writer;
    }

    /* JADX INFO: renamed from: a */
    private int m5227a() {
        if (this.f4251e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f4250d[this.f4251e - 1];
    }

    /* JADX INFO: renamed from: a */
    private C0612c m5228a(int i, int i2, String str) throws IOException {
        int iM5227a = m5227a();
        if (iM5227a != i2 && iM5227a != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4256j != null) {
            throw new IllegalStateException("Dangling name: " + this.f4256j);
        }
        this.f4251e--;
        if (iM5227a == i2) {
            m5234k();
        }
        this.f4249c.write(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C0612c m5229a(int i, String str) throws IOException {
        m5236m();
        m5230a(i);
        this.f4249c.write(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private void m5230a(int i) {
        if (this.f4251e == this.f4250d.length) {
            int[] iArr = new int[this.f4251e * 2];
            System.arraycopy(this.f4250d, 0, iArr, 0, this.f4251e);
            this.f4250d = iArr;
        }
        int[] iArr2 = this.f4250d;
        int i2 = this.f4251e;
        this.f4251e = i2 + 1;
        iArr2[i2] = i;
    }

    /* JADX INFO: renamed from: b */
    private void m5231b(int i) {
        this.f4250d[this.f4251e - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5232d(String str) throws IOException {
        String str2;
        int i = 0;
        String[] strArr = this.f4255i ? f4248b : f4247a;
        this.f4249c.write("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.f4249c.write(str, i, i2 - i);
                    }
                    this.f4249c.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.f4249c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f4249c.write(str, i, length - i);
        }
        this.f4249c.write("\"");
    }

    /* JADX INFO: renamed from: j */
    private void m5233j() throws IOException {
        if (this.f4256j != null) {
            m5235l();
            m5232d(this.f4256j);
            this.f4256j = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m5234k() throws IOException {
        if (this.f4252f == null) {
            return;
        }
        this.f4249c.write("\n");
        int i = this.f4251e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f4249c.write(this.f4252f);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m5235l() throws IOException {
        int iM5227a = m5227a();
        if (iM5227a == 5) {
            this.f4249c.write(44);
        } else if (iM5227a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m5234k();
        m5231b(4);
    }

    /* JADX INFO: renamed from: m */
    private void m5236m() throws IOException {
        switch (m5227a()) {
            case 1:
                m5231b(2);
                m5234k();
                return;
            case 2:
                this.f4249c.append(',');
                m5234k();
                return;
            case 3:
            case 5:
            default:
                throw new IllegalStateException("Nesting problem.");
            case 4:
                this.f4249c.append((CharSequence) this.f4253g);
                m5231b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f4254h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
        }
        m5231b(7);
    }

    /* JADX INFO: renamed from: a */
    public C0612c mo5074a(long j) throws IOException {
        m5233j();
        m5236m();
        this.f4249c.write(Long.toString(j));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0612c mo5075a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo5085f();
        }
        m5233j();
        m5236m();
        this.f4249c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0612c mo5076a(Number number) throws IOException {
        if (number == null) {
            return mo5085f();
        }
        m5233j();
        String string = number.toString();
        if (!this.f4254h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m5236m();
        this.f4249c.append((CharSequence) string);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0612c mo5077a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f4256j != null) {
            throw new IllegalStateException();
        }
        if (this.f4251e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4256j = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0612c mo5078a(boolean z) throws IOException {
        m5233j();
        m5236m();
        this.f4249c.write(z ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0612c mo5080b() throws IOException {
        m5233j();
        return m5229a(1, "[");
    }

    /* JADX INFO: renamed from: b */
    public C0612c mo5081b(String str) throws IOException {
        if (str == null) {
            return mo5085f();
        }
        m5233j();
        m5236m();
        m5232d(str);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m5237b(boolean z) {
        this.f4254h = z;
    }

    /* JADX INFO: renamed from: c */
    public C0612c mo5082c() {
        return m5228a(1, 2, "]");
    }

    /* JADX INFO: renamed from: c */
    public final void m5238c(String str) {
        if (str.length() == 0) {
            this.f4252f = null;
            this.f4253g = ":";
        } else {
            this.f4252f = str;
            this.f4253g = ": ";
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5239c(boolean z) {
        this.f4255i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4249c.close();
        int i = this.f4251e;
        if (i > 1 || (i == 1 && this.f4250d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4251e = 0;
    }

    /* JADX INFO: renamed from: d */
    public C0612c mo5083d() throws IOException {
        m5233j();
        return m5229a(3, "{");
    }

    /* JADX INFO: renamed from: d */
    public final void m5240d(boolean z) {
        this.f4257k = z;
    }

    /* JADX INFO: renamed from: e */
    public C0612c mo5084e() {
        return m5228a(3, 5, "}");
    }

    /* JADX INFO: renamed from: f */
    public C0612c mo5085f() throws IOException {
        if (this.f4256j == null) {
            m5236m();
            this.f4249c.write("null");
        } else if (this.f4257k) {
            m5233j();
            m5236m();
            this.f4249c.write("null");
        } else {
            this.f4256j = null;
        }
        return this;
    }

    public void flush() throws IOException {
        if (this.f4251e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4249c.flush();
    }

    /* JADX INFO: renamed from: g */
    public boolean m5241g() {
        return this.f4254h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5242h() {
        return this.f4255i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5243i() {
        return this.f4257k;
    }
}
