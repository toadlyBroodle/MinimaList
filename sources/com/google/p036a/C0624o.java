package com.google.p036a;

import com.google.p036a.p038b.C0581a;
import com.google.p036a.p038b.C0601f;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0624o extends AbstractC0619j {

    /* JADX INFO: renamed from: a */
    private static final Class<?>[] f4279a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* JADX INFO: renamed from: b */
    private Object f4280b;

    public C0624o(Boolean bool) {
        m5293a(bool);
    }

    public C0624o(Number number) {
        m5293a(number);
    }

    public C0624o(String str) {
        m5293a(str);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5291a(C0624o c0624o) {
        if (!(c0624o.f4280b instanceof Number)) {
            return false;
        }
        Number number = (Number) c0624o.f4280b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m5292b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f4279a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: a */
    public Number mo5273a() {
        return this.f4280b instanceof String ? new C0601f((String) this.f4280b) : (Number) this.f4280b;
    }

    /* JADX INFO: renamed from: a */
    void m5293a(Object obj) {
        if (obj instanceof Character) {
            this.f4280b = String.valueOf(((Character) obj).charValue());
        } else {
            C0581a.m5038a((obj instanceof Number) || m5292b(obj));
            this.f4280b = obj;
        }
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: b */
    public String mo5275b() {
        return m5295p() ? mo5273a().toString() : m5294o() ? mo5288n().toString() : (String) this.f4280b;
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: c */
    public double mo5276c() {
        return m5295p() ? mo5273a().doubleValue() : Double.parseDouble(mo5275b());
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: d */
    public long mo5277d() {
        return m5295p() ? mo5273a().longValue() : Long.parseLong(mo5275b());
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: e */
    public int mo5278e() {
        return m5295p() ? mo5273a().intValue() : Integer.parseInt(mo5275b());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0624o c0624o = (C0624o) obj;
        if (this.f4280b == null) {
            return c0624o.f4280b == null;
        }
        if (m5291a(this) && m5291a(c0624o)) {
            return mo5273a().longValue() == c0624o.mo5273a().longValue();
        }
        if (!(this.f4280b instanceof Number) || !(c0624o.f4280b instanceof Number)) {
            return this.f4280b.equals(c0624o.f4280b);
        }
        double dDoubleValue = mo5273a().doubleValue();
        double dDoubleValue2 = c0624o.mo5273a().doubleValue();
        if (dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2))) {
            z = true;
        }
        return z;
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: f */
    public boolean mo5279f() {
        return m5294o() ? mo5288n().booleanValue() : Boolean.parseBoolean(mo5275b());
    }

    public int hashCode() {
        if (this.f4280b == null) {
            return 31;
        }
        if (m5291a(this)) {
            long jLongValue = mo5273a().longValue();
            return (int) (jLongValue ^ (jLongValue >>> 32));
        }
        if (!(this.f4280b instanceof Number)) {
            return this.f4280b.hashCode();
        }
        long jDoubleToLongBits = Double.doubleToLongBits(mo5273a().doubleValue());
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // com.google.p036a.AbstractC0619j
    /* JADX INFO: renamed from: n */
    Boolean mo5288n() {
        return (Boolean) this.f4280b;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5294o() {
        return this.f4280b instanceof Boolean;
    }

    /* JADX INFO: renamed from: p */
    public boolean m5295p() {
        return this.f4280b instanceof Number;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5296q() {
        return this.f4280b instanceof String;
    }
}
