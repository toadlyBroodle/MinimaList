package com.google.p036a.p038b.p039a;

import com.google.p036a.C0616g;
import com.google.p036a.C0621l;
import com.google.p036a.C0622m;
import com.google.p036a.C0624o;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.EnumC0611b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.a.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0587e extends C0610a {

    /* JADX INFO: renamed from: b */
    private static final Reader f4010b = new Reader() { // from class: com.google.a.b.a.e.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: c */
    private static final Object f4011c = new Object();

    /* JADX INFO: renamed from: d */
    private Object[] f4012d;

    /* JADX INFO: renamed from: e */
    private int f4013e;

    /* JADX INFO: renamed from: f */
    private String[] f4014f;

    /* JADX INFO: renamed from: g */
    private int[] f4015g;

    /* JADX INFO: renamed from: a */
    private void m5051a(EnumC0611b enumC0611b) {
        if (mo5061f() != enumC0611b) {
            throw new IllegalStateException("Expected " + enumC0611b + " but was " + mo5061f() + m5055u());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5052a(Object obj) {
        if (this.f4013e == this.f4012d.length) {
            Object[] objArr = new Object[this.f4013e * 2];
            int[] iArr = new int[this.f4013e * 2];
            String[] strArr = new String[this.f4013e * 2];
            System.arraycopy(this.f4012d, 0, objArr, 0, this.f4013e);
            System.arraycopy(this.f4015g, 0, iArr, 0, this.f4013e);
            System.arraycopy(this.f4014f, 0, strArr, 0, this.f4013e);
            this.f4012d = objArr;
            this.f4015g = iArr;
            this.f4014f = strArr;
        }
        Object[] objArr2 = this.f4012d;
        int i = this.f4013e;
        this.f4013e = i + 1;
        objArr2[i] = obj;
    }

    /* JADX INFO: renamed from: s */
    private Object m5053s() {
        return this.f4012d[this.f4013e - 1];
    }

    /* JADX INFO: renamed from: t */
    private Object m5054t() {
        Object[] objArr = this.f4012d;
        int i = this.f4013e - 1;
        this.f4013e = i;
        Object obj = objArr[i];
        this.f4012d[this.f4013e] = null;
        return obj;
    }

    /* JADX INFO: renamed from: u */
    private String m5055u() {
        return " at path " + mo5071p();
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: a */
    public void mo5056a() {
        m5051a(EnumC0611b.BEGIN_ARRAY);
        m5052a(((C0616g) m5053s()).iterator());
        this.f4015g[this.f4013e - 1] = 0;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: b */
    public void mo5057b() {
        m5051a(EnumC0611b.END_ARRAY);
        m5054t();
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: c */
    public void mo5058c() {
        m5051a(EnumC0611b.BEGIN_OBJECT);
        m5052a(((C0622m) m5053s()).m5290o().iterator());
    }

    @Override // com.google.p036a.p042d.C0610a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4012d = new Object[]{f4011c};
        this.f4013e = 1;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: d */
    public void mo5059d() {
        m5051a(EnumC0611b.END_OBJECT);
        m5054t();
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: e */
    public boolean mo5060e() {
        EnumC0611b enumC0611bMo5061f = mo5061f();
        return (enumC0611bMo5061f == EnumC0611b.END_OBJECT || enumC0611bMo5061f == EnumC0611b.END_ARRAY) ? false : true;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: f */
    public EnumC0611b mo5061f() {
        if (this.f4013e == 0) {
            return EnumC0611b.END_DOCUMENT;
        }
        Object objM5053s = m5053s();
        if (objM5053s instanceof Iterator) {
            boolean z = this.f4012d[this.f4013e - 2] instanceof C0622m;
            Iterator it = (Iterator) objM5053s;
            if (!it.hasNext()) {
                return z ? EnumC0611b.END_OBJECT : EnumC0611b.END_ARRAY;
            }
            if (z) {
                return EnumC0611b.NAME;
            }
            m5052a(it.next());
            return mo5061f();
        }
        if (objM5053s instanceof C0622m) {
            return EnumC0611b.BEGIN_OBJECT;
        }
        if (objM5053s instanceof C0616g) {
            return EnumC0611b.BEGIN_ARRAY;
        }
        if (!(objM5053s instanceof C0624o)) {
            if (objM5053s instanceof C0621l) {
                return EnumC0611b.NULL;
            }
            if (objM5053s == f4011c) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C0624o c0624o = (C0624o) objM5053s;
        if (c0624o.m5296q()) {
            return EnumC0611b.STRING;
        }
        if (c0624o.m5294o()) {
            return EnumC0611b.BOOLEAN;
        }
        if (c0624o.m5295p()) {
            return EnumC0611b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: g */
    public String mo5062g() {
        m5051a(EnumC0611b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m5053s()).next();
        String str = (String) entry.getKey();
        this.f4014f[this.f4013e - 1] = str;
        m5052a(entry.getValue());
        return str;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: h */
    public String mo5063h() {
        EnumC0611b enumC0611bMo5061f = mo5061f();
        if (enumC0611bMo5061f != EnumC0611b.STRING && enumC0611bMo5061f != EnumC0611b.NUMBER) {
            throw new IllegalStateException("Expected " + EnumC0611b.STRING + " but was " + enumC0611bMo5061f + m5055u());
        }
        String strMo5275b = ((C0624o) m5054t()).mo5275b();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return strMo5275b;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: i */
    public boolean mo5064i() {
        m5051a(EnumC0611b.BOOLEAN);
        boolean zMo5279f = ((C0624o) m5054t()).mo5279f();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return zMo5279f;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: j */
    public void mo5065j() {
        m5051a(EnumC0611b.NULL);
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: k */
    public double mo5066k() {
        EnumC0611b enumC0611bMo5061f = mo5061f();
        if (enumC0611bMo5061f != EnumC0611b.NUMBER && enumC0611bMo5061f != EnumC0611b.STRING) {
            throw new IllegalStateException("Expected " + EnumC0611b.NUMBER + " but was " + enumC0611bMo5061f + m5055u());
        }
        double dMo5276c = ((C0624o) m5053s()).mo5276c();
        if (!m5225q() && (Double.isNaN(dMo5276c) || Double.isInfinite(dMo5276c))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dMo5276c);
        }
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return dMo5276c;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: l */
    public long mo5067l() {
        EnumC0611b enumC0611bMo5061f = mo5061f();
        if (enumC0611bMo5061f != EnumC0611b.NUMBER && enumC0611bMo5061f != EnumC0611b.STRING) {
            throw new IllegalStateException("Expected " + EnumC0611b.NUMBER + " but was " + enumC0611bMo5061f + m5055u());
        }
        long jMo5277d = ((C0624o) m5053s()).mo5277d();
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return jMo5277d;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: m */
    public int mo5068m() {
        EnumC0611b enumC0611bMo5061f = mo5061f();
        if (enumC0611bMo5061f != EnumC0611b.NUMBER && enumC0611bMo5061f != EnumC0611b.STRING) {
            throw new IllegalStateException("Expected " + EnumC0611b.NUMBER + " but was " + enumC0611bMo5061f + m5055u());
        }
        int iMo5278e = ((C0624o) m5053s()).mo5278e();
        m5054t();
        if (this.f4013e > 0) {
            int[] iArr = this.f4015g;
            int i = this.f4013e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return iMo5278e;
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: n */
    public void mo5069n() {
        if (mo5061f() == EnumC0611b.NAME) {
            mo5062g();
            this.f4014f[this.f4013e - 2] = "null";
        } else {
            m5054t();
            this.f4014f[this.f4013e - 1] = "null";
        }
        int[] iArr = this.f4015g;
        int i = this.f4013e - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: o */
    public void m5070o() {
        m5051a(EnumC0611b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m5053s()).next();
        m5052a(entry.getValue());
        m5052a(new C0624o((String) entry.getKey()));
    }

    @Override // com.google.p036a.p042d.C0610a
    /* JADX INFO: renamed from: p */
    public String mo5071p() {
        StringBuilder sbAppend = new StringBuilder().append('$');
        int i = 0;
        while (i < this.f4013e) {
            if (this.f4012d[i] instanceof C0616g) {
                i++;
                if (this.f4012d[i] instanceof Iterator) {
                    sbAppend.append('[').append(this.f4015g[i]).append(']');
                }
            } else if (this.f4012d[i] instanceof C0622m) {
                i++;
                if (this.f4012d[i] instanceof Iterator) {
                    sbAppend.append('.');
                    if (this.f4014f[i] != null) {
                        sbAppend.append(this.f4014f[i]);
                    }
                }
            }
            i++;
        }
        return sbAppend.toString();
    }

    @Override // com.google.p036a.p042d.C0610a
    public String toString() {
        return getClass().getSimpleName();
    }
}
