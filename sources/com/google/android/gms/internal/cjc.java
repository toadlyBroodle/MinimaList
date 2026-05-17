package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.InterfaceC0860a;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjc implements InterfaceC0860a {

    /* JADX INFO: renamed from: a */
    private final Date f10144a;

    /* JADX INFO: renamed from: b */
    private final int f10145b;

    /* JADX INFO: renamed from: c */
    private final Set<String> f10146c;

    /* JADX INFO: renamed from: d */
    private final boolean f10147d;

    /* JADX INFO: renamed from: e */
    private final Location f10148e;

    /* JADX INFO: renamed from: f */
    private final int f10149f;

    /* JADX INFO: renamed from: g */
    private final boolean f10150g;

    public cjc(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f10144a = date;
        this.f10145b = i;
        this.f10146c = set;
        this.f10148e = location;
        this.f10147d = z;
        this.f10149f = i2;
        this.f10150g = z2;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: a */
    public final Date mo5833a() {
        return this.f10144a;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: b */
    public final int mo5834b() {
        return this.f10145b;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: c */
    public final Set<String> mo5835c() {
        return this.f10146c;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: d */
    public final Location mo5836d() {
        return this.f10148e;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: e */
    public final int mo5837e() {
        return this.f10149f;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: f */
    public final boolean mo5838f() {
        return this.f10147d;
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0860a
    /* JADX INFO: renamed from: g */
    public final boolean mo5839g() {
        return this.f10150g;
    }
}
