package com.google.p036a.p038b;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.google.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0601f extends Number {

    /* JADX INFO: renamed from: a */
    private final String f4175a;

    public C0601f(String str) {
        this.f4175a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f4175a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0601f)) {
            return false;
        }
        C0601f c0601f = (C0601f) obj;
        return this.f4175a == c0601f.f4175a || this.f4175a.equals(c0601f.f4175a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f4175a);
    }

    public int hashCode() {
        return this.f4175a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            return Integer.parseInt(this.f4175a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.f4175a);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.f4175a).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f4175a);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.f4175a).longValue();
        }
    }

    public String toString() {
        return this.f4175a;
    }
}
