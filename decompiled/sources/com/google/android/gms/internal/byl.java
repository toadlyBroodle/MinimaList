package com.google.android.gms.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class byl {

    /* JADX INFO: renamed from: a */
    private final String f9305a;

    /* JADX INFO: renamed from: b */
    private final String f9306b;

    public byl(String str, String str2) {
        this.f9305a = str;
        this.f9306b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m10418a() {
        return this.f9305a;
    }

    /* JADX INFO: renamed from: b */
    public final String m10419b() {
        return this.f9306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        byl bylVar = (byl) obj;
        return TextUtils.equals(this.f9305a, bylVar.f9305a) && TextUtils.equals(this.f9306b, bylVar.f9306b);
    }

    public final int hashCode() {
        return (this.f9305a.hashCode() * 31) + this.f9306b.hashCode();
    }

    public final String toString() {
        String str = this.f9305a;
        String str2 = this.f9306b;
        return new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length()).append("Header[name=").append(str).append(",value=").append(str2).append("]").toString();
    }
}
