package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.op */
/* JADX INFO: loaded from: classes.dex */
public final class C1806op {

    /* JADX INFO: renamed from: a */
    private final int f11216a;

    /* JADX INFO: renamed from: b */
    private final List<byl> f11217b;

    /* JADX INFO: renamed from: c */
    private final int f11218c;

    /* JADX INFO: renamed from: d */
    private final InputStream f11219d;

    public C1806op(int i, List<byl> list) {
        this(i, list, -1, null);
    }

    public C1806op(int i, List<byl> list, int i2, InputStream inputStream) {
        this.f11216a = i;
        this.f11217b = list;
        this.f11218c = i2;
        this.f11219d = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m11921a() {
        return this.f11216a;
    }

    /* JADX INFO: renamed from: b */
    public final List<byl> m11922b() {
        return Collections.unmodifiableList(this.f11217b);
    }

    /* JADX INFO: renamed from: c */
    public final int m11923c() {
        return this.f11218c;
    }

    /* JADX INFO: renamed from: d */
    public final InputStream m11924d() {
        return this.f11219d;
    }
}
