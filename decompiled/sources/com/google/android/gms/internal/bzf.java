package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.ads.p047d.C0682a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzf {

    /* JADX INFO: renamed from: a */
    private final Date f9308a;

    /* JADX INFO: renamed from: b */
    private final String f9309b;

    /* JADX INFO: renamed from: c */
    private final int f9310c;

    /* JADX INFO: renamed from: d */
    private final Set<String> f9311d;

    /* JADX INFO: renamed from: e */
    private final Location f9312e;

    /* JADX INFO: renamed from: f */
    private final boolean f9313f;

    /* JADX INFO: renamed from: g */
    private final Bundle f9314g;

    /* JADX INFO: renamed from: h */
    private final Map<Class<? extends Object>, Object> f9315h;

    /* JADX INFO: renamed from: i */
    private final String f9316i;

    /* JADX INFO: renamed from: j */
    private final String f9317j;

    /* JADX INFO: renamed from: k */
    private final C0682a f9318k;

    /* JADX INFO: renamed from: l */
    private final int f9319l;

    /* JADX INFO: renamed from: m */
    private final Set<String> f9320m;

    /* JADX INFO: renamed from: n */
    private final Bundle f9321n;

    /* JADX INFO: renamed from: o */
    private final Set<String> f9322o;

    /* JADX INFO: renamed from: p */
    private final boolean f9323p;

    public bzf(bzg bzgVar) {
        this(bzgVar, null);
    }

    public bzf(bzg bzgVar, C0682a c0682a) {
        this.f9308a = bzgVar.f9330g;
        this.f9309b = bzgVar.f9331h;
        this.f9310c = bzgVar.f9332i;
        this.f9311d = Collections.unmodifiableSet(bzgVar.f9324a);
        this.f9312e = bzgVar.f9333j;
        this.f9313f = bzgVar.f9334k;
        this.f9314g = bzgVar.f9325b;
        this.f9315h = Collections.unmodifiableMap(bzgVar.f9326c);
        this.f9316i = bzgVar.f9335l;
        this.f9317j = bzgVar.f9336m;
        this.f9318k = c0682a;
        this.f9319l = bzgVar.f9337n;
        this.f9320m = Collections.unmodifiableSet(bzgVar.f9327d);
        this.f9321n = bzgVar.f9328e;
        this.f9322o = Collections.unmodifiableSet(bzgVar.f9329f);
        this.f9323p = bzgVar.f9338o;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m10438a(Class<? extends InterfaceC0861b> cls) {
        return this.f9314g.getBundle(cls.getName());
    }

    /* JADX INFO: renamed from: a */
    public final Date m10439a() {
        return this.f9308a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10440a(Context context) {
        Set<String> set = this.f9320m;
        bxm.m10404a();
        return set.contains(C1657jb.m11562a(context));
    }

    /* JADX INFO: renamed from: b */
    public final String m10441b() {
        return this.f9309b;
    }

    /* JADX INFO: renamed from: c */
    public final int m10442c() {
        return this.f9310c;
    }

    /* JADX INFO: renamed from: d */
    public final Set<String> m10443d() {
        return this.f9311d;
    }

    /* JADX INFO: renamed from: e */
    public final Location m10444e() {
        return this.f9312e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10445f() {
        return this.f9313f;
    }

    /* JADX INFO: renamed from: g */
    public final String m10446g() {
        return this.f9316i;
    }

    /* JADX INFO: renamed from: h */
    public final String m10447h() {
        return this.f9317j;
    }

    /* JADX INFO: renamed from: i */
    public final C0682a m10448i() {
        return this.f9318k;
    }

    /* JADX INFO: renamed from: j */
    public final Map<Class<? extends Object>, Object> m10449j() {
        return this.f9315h;
    }

    /* JADX INFO: renamed from: k */
    public final Bundle m10450k() {
        return this.f9314g;
    }

    /* JADX INFO: renamed from: l */
    public final int m10451l() {
        return this.f9319l;
    }

    /* JADX INFO: renamed from: m */
    public final Bundle m10452m() {
        return this.f9321n;
    }

    /* JADX INFO: renamed from: n */
    public final Set<String> m10453n() {
        return this.f9322o;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10454o() {
        return this.f9323p;
    }
}
