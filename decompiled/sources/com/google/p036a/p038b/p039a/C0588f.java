package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0619j;
import com.google.p036a.C0616g;
import com.google.p036a.C0621l;
import com.google.p036a.C0622m;
import com.google.p036a.C0624o;
import com.google.p036a.p042d.C0612c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.a.b.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0588f extends C0612c {

    /* JADX INFO: renamed from: a */
    private static final Writer f4016a = new Writer() { // from class: com.google.a.b.a.f.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: b */
    private static final C0624o f4017b = new C0624o("closed");

    /* JADX INFO: renamed from: c */
    private final List<AbstractC0619j> f4018c;

    /* JADX INFO: renamed from: d */
    private String f4019d;

    /* JADX INFO: renamed from: e */
    private AbstractC0619j f4020e;

    public C0588f() {
        super(f4016a);
        this.f4018c = new ArrayList();
        this.f4020e = C0621l.f4277a;
    }

    /* JADX INFO: renamed from: a */
    private void m5072a(AbstractC0619j abstractC0619j) {
        if (this.f4019d != null) {
            if (!abstractC0619j.m5284j() || m5243i()) {
                ((C0622m) m5073j()).m5289a(this.f4019d, abstractC0619j);
            }
            this.f4019d = null;
            return;
        }
        if (this.f4018c.isEmpty()) {
            this.f4020e = abstractC0619j;
            return;
        }
        AbstractC0619j abstractC0619jM5073j = m5073j();
        if (!(abstractC0619jM5073j instanceof C0616g)) {
            throw new IllegalStateException();
        }
        ((C0616g) abstractC0619jM5073j).m5274a(abstractC0619j);
    }

    /* JADX INFO: renamed from: j */
    private AbstractC0619j m5073j() {
        return this.f4018c.get(this.f4018c.size() - 1);
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: a */
    public C0612c mo5074a(long j) {
        m5072a(new C0624o(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: a */
    public C0612c mo5075a(Boolean bool) {
        if (bool == null) {
            return mo5085f();
        }
        m5072a(new C0624o(bool));
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: a */
    public C0612c mo5076a(Number number) {
        if (number == null) {
            return mo5085f();
        }
        if (!m5241g()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m5072a(new C0624o(number));
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: a */
    public C0612c mo5077a(String str) {
        if (this.f4018c.isEmpty() || this.f4019d != null) {
            throw new IllegalStateException();
        }
        if (!(m5073j() instanceof C0622m)) {
            throw new IllegalStateException();
        }
        this.f4019d = str;
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: a */
    public C0612c mo5078a(boolean z) {
        m5072a(new C0624o(Boolean.valueOf(z)));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0619j m5079a() {
        if (this.f4018c.isEmpty()) {
            return this.f4020e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f4018c);
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: b */
    public C0612c mo5080b() {
        C0616g c0616g = new C0616g();
        m5072a(c0616g);
        this.f4018c.add(c0616g);
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: b */
    public C0612c mo5081b(String str) {
        if (str == null) {
            return mo5085f();
        }
        m5072a(new C0624o(str));
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: c */
    public C0612c mo5082c() {
        if (this.f4018c.isEmpty() || this.f4019d != null) {
            throw new IllegalStateException();
        }
        if (!(m5073j() instanceof C0616g)) {
            throw new IllegalStateException();
        }
        this.f4018c.remove(this.f4018c.size() - 1);
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f4018c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f4018c.add(f4017b);
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: d */
    public C0612c mo5083d() {
        C0622m c0622m = new C0622m();
        m5072a(c0622m);
        this.f4018c.add(c0622m);
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: e */
    public C0612c mo5084e() {
        if (this.f4018c.isEmpty() || this.f4019d != null) {
            throw new IllegalStateException();
        }
        if (!(m5073j() instanceof C0622m)) {
            throw new IllegalStateException();
        }
        this.f4018c.remove(this.f4018c.size() - 1);
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c
    /* JADX INFO: renamed from: f */
    public C0612c mo5085f() {
        m5072a(C0621l.f4277a);
        return this;
    }

    @Override // com.google.p036a.p042d.C0612c, java.io.Flushable
    public void flush() {
    }
}
