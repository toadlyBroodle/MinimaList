package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bwy {

    /* JADX INFO: renamed from: a */
    private long f9225a;

    /* JADX INFO: renamed from: b */
    private Bundle f9226b;

    /* JADX INFO: renamed from: c */
    private int f9227c;

    /* JADX INFO: renamed from: d */
    private List<String> f9228d;

    /* JADX INFO: renamed from: e */
    private boolean f9229e;

    /* JADX INFO: renamed from: f */
    private int f9230f;

    /* JADX INFO: renamed from: g */
    private boolean f9231g;

    /* JADX INFO: renamed from: h */
    private String f9232h;

    /* JADX INFO: renamed from: i */
    private bzs f9233i;

    /* JADX INFO: renamed from: j */
    private Location f9234j;

    /* JADX INFO: renamed from: k */
    private String f9235k;

    /* JADX INFO: renamed from: l */
    private Bundle f9236l;

    /* JADX INFO: renamed from: m */
    private Bundle f9237m;

    /* JADX INFO: renamed from: n */
    private List<String> f9238n;

    /* JADX INFO: renamed from: o */
    private String f9239o;

    /* JADX INFO: renamed from: p */
    private String f9240p;

    /* JADX INFO: renamed from: q */
    private boolean f9241q;

    public bwy() {
        this.f9225a = -1L;
        this.f9226b = new Bundle();
        this.f9227c = -1;
        this.f9228d = new ArrayList();
        this.f9229e = false;
        this.f9230f = -1;
        this.f9231g = false;
        this.f9232h = null;
        this.f9233i = null;
        this.f9234j = null;
        this.f9235k = null;
        this.f9236l = new Bundle();
        this.f9237m = new Bundle();
        this.f9238n = new ArrayList();
        this.f9239o = null;
        this.f9240p = null;
        this.f9241q = false;
    }

    public bwy(bwx bwxVar) {
        this.f9225a = bwxVar.f9208b;
        this.f9226b = bwxVar.f9209c;
        this.f9227c = bwxVar.f9210d;
        this.f9228d = bwxVar.f9211e;
        this.f9229e = bwxVar.f9212f;
        this.f9230f = bwxVar.f9213g;
        this.f9231g = bwxVar.f9214h;
        this.f9232h = bwxVar.f9215i;
        this.f9233i = bwxVar.f9216j;
        this.f9234j = bwxVar.f9217k;
        this.f9235k = bwxVar.f9218l;
        this.f9236l = bwxVar.f9219m;
        this.f9237m = bwxVar.f9220n;
        this.f9238n = bwxVar.f9221o;
        this.f9239o = bwxVar.f9222p;
        this.f9240p = bwxVar.f9223q;
    }

    /* JADX INFO: renamed from: a */
    public final bwx m10374a() {
        return new bwx(7, this.f9225a, this.f9226b, this.f9227c, this.f9228d, this.f9229e, this.f9230f, this.f9231g, this.f9232h, this.f9233i, this.f9234j, this.f9235k, this.f9236l, this.f9237m, this.f9238n, this.f9239o, this.f9240p, false);
    }

    /* JADX INFO: renamed from: a */
    public final bwy m10375a(Location location) {
        this.f9234j = null;
        return this;
    }
}
