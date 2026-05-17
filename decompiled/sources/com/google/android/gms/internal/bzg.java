package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class bzg {

    /* JADX INFO: renamed from: g */
    private Date f9330g;

    /* JADX INFO: renamed from: h */
    private String f9331h;

    /* JADX INFO: renamed from: j */
    private Location f9333j;

    /* JADX INFO: renamed from: l */
    private String f9335l;

    /* JADX INFO: renamed from: m */
    private String f9336m;

    /* JADX INFO: renamed from: o */
    private boolean f9338o;

    /* JADX INFO: renamed from: a */
    private final HashSet<String> f9324a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    private final Bundle f9325b = new Bundle();

    /* JADX INFO: renamed from: c */
    private final HashMap<Class<? extends Object>, Object> f9326c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<String> f9327d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final Bundle f9328e = new Bundle();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f9329f = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private int f9332i = -1;

    /* JADX INFO: renamed from: k */
    private boolean f9334k = false;

    /* JADX INFO: renamed from: n */
    private int f9337n = -1;

    /* JADX INFO: renamed from: a */
    public final void m10470a(int i) {
        this.f9332i = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10471a(Location location) {
        this.f9333j = location;
    }

    /* JADX INFO: renamed from: a */
    public final void m10472a(Class<? extends InterfaceC0861b> cls, Bundle bundle) {
        this.f9325b.putBundle(cls.getName(), bundle);
    }

    /* JADX INFO: renamed from: a */
    public final void m10473a(String str) {
        this.f9324a.add(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m10474a(Date date) {
        this.f9330g = date;
    }

    /* JADX INFO: renamed from: a */
    public final void m10475a(boolean z) {
        this.f9337n = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m10476b(String str) {
        this.f9327d.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m10477b(boolean z) {
        this.f9338o = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m10478c(String str) {
        this.f9327d.remove(str);
    }
}
