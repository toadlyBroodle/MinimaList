package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1218ag;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ic */
/* JADX INFO: loaded from: classes.dex */
public final class C1631ic {

    /* JADX INFO: renamed from: a */
    public final String f10771a;

    /* JADX INFO: renamed from: b */
    public final double f10772b;

    /* JADX INFO: renamed from: c */
    public final int f10773c;

    /* JADX INFO: renamed from: d */
    private double f10774d;

    /* JADX INFO: renamed from: e */
    private double f10775e;

    public C1631ic(String str, double d, double d2, double d3, int i) {
        this.f10771a = str;
        this.f10775e = d;
        this.f10774d = d2;
        this.f10772b = d3;
        this.f10773c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1631ic)) {
            return false;
        }
        C1631ic c1631ic = (C1631ic) obj;
        return C1218ag.m7063a(this.f10771a, c1631ic.f10771a) && this.f10774d == c1631ic.f10774d && this.f10775e == c1631ic.f10775e && this.f10773c == c1631ic.f10773c && Double.compare(this.f10772b, c1631ic.f10772b) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10771a, Double.valueOf(this.f10774d), Double.valueOf(this.f10775e), Double.valueOf(this.f10772b), Integer.valueOf(this.f10773c)});
    }

    public final String toString() {
        return C1218ag.m7062a(this).m7064a("name", this.f10771a).m7064a("minBound", Double.valueOf(this.f10775e)).m7064a("maxBound", Double.valueOf(this.f10774d)).m7064a("percent", Double.valueOf(this.f10772b)).m7064a("count", Integer.valueOf(this.f10773c)).toString();
    }
}
