package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.ff */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1553ff {

    /* JADX INFO: renamed from: a */
    private final Object f10641a;

    /* JADX INFO: renamed from: b */
    private int f10642b;

    /* JADX INFO: renamed from: c */
    private int f10643c;

    /* JADX INFO: renamed from: d */
    private final C1546ez f10644d;

    /* JADX INFO: renamed from: e */
    private final String f10645e;

    private C1553ff(C1546ez c1546ez, String str) {
        this.f10641a = new Object();
        this.f10644d = c1546ez;
        this.f10645e = str;
    }

    public C1553ff(String str) {
        this(C0710au.m5573i(), str);
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m11335a() {
        Bundle bundle;
        synchronized (this.f10641a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f10642b);
            bundle.putInt("pmnll", this.f10643c);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public final void m11336a(int i, int i2) {
        synchronized (this.f10641a) {
            this.f10642b = i;
            this.f10643c = i2;
            this.f10644d.m11291a(this.f10645e, this);
        }
    }
}
