package com.google.android.gms.internal;

import android.support.design.C0025a;

/* JADX INFO: loaded from: classes.dex */
public final class bil {

    /* JADX INFO: renamed from: a */
    public final long f8217a;

    /* JADX INFO: renamed from: b */
    public final bjs f8218b;

    /* JADX INFO: renamed from: c */
    public final long f8219c;

    /* JADX INFO: renamed from: d */
    public final boolean f8220d;

    /* JADX INFO: renamed from: e */
    public final boolean f8221e;

    public bil(long j, bjs bjsVar, long j2, boolean z, boolean z2) {
        this.f8217a = j;
        if (bjsVar.m9486e() && !bjsVar.m9485d()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f8218b = bjsVar;
        this.f8219c = j2;
        this.f8220d = z;
        this.f8221e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final bil m9384a() {
        return new bil(this.f8217a, this.f8218b, this.f8219c, true, this.f8221e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        bil bilVar = (bil) obj;
        return this.f8217a == bilVar.f8217a && this.f8218b.equals(bilVar.f8218b) && this.f8219c == bilVar.f8219c && this.f8220d == bilVar.f8220d && this.f8221e == bilVar.f8221e;
    }

    public final int hashCode() {
        return (((((((Long.valueOf(this.f8217a).hashCode() * 31) + this.f8218b.hashCode()) * 31) + Long.valueOf(this.f8219c).hashCode()) * 31) + Boolean.valueOf(this.f8220d).hashCode()) * 31) + Boolean.valueOf(this.f8221e).hashCode();
    }

    public final String toString() {
        long j = this.f8217a;
        String strValueOf = String.valueOf(this.f8218b);
        long j2 = this.f8219c;
        boolean z = this.f8220d;
        return new StringBuilder(String.valueOf(strValueOf).length() + C0025a.j.AppCompatTheme_windowActionBar).append("TrackedQuery{id=").append(j).append(", querySpec=").append(strValueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.f8221e).append("}").toString();
    }
}
