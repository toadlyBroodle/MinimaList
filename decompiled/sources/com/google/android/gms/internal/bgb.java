package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bgb {

    /* JADX INFO: renamed from: a */
    public String f8074a;

    /* JADX INFO: renamed from: b */
    public boolean f8075b;

    /* JADX INFO: renamed from: c */
    public String f8076c;

    /* JADX INFO: renamed from: d */
    public String f8077d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgb bgbVar = (bgb) obj;
        if (this.f8075b == bgbVar.f8075b && this.f8074a.equals(bgbVar.f8074a)) {
            return this.f8076c.equals(bgbVar.f8076c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f8075b ? 1 : 0) + (this.f8074a.hashCode() * 31)) * 31) + this.f8076c.hashCode();
    }

    public final String toString() {
        String str = this.f8075b ? "s" : "";
        String str2 = this.f8074a;
        return new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length()).append("http").append(str).append("://").append(str2).toString();
    }
}
