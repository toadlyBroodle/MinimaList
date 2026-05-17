package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ahh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ahf f6779a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f6780b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6781c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6782d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ String f6783e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ Map f6784f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ String f6785g;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ ahg f6786h;

    ahh(ahg ahgVar, ahf ahfVar, long j, String str, String str2, String str3, Map map, String str4) {
        this.f6786h = ahgVar;
        this.f6779a = ahfVar;
        this.f6780b = j;
        this.f6781c = str;
        this.f6782d = str2;
        this.f6783e = str3;
        this.f6784f = map;
        this.f6785g = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6786h.f6776e == null) {
            ail ailVarM8010b = ail.m8010b();
            ailVarM8010b.m8017a(this.f6786h.f6777f, this.f6779a);
            this.f6786h.f6776e = ailVarM8010b.m8019c();
        }
        this.f6786h.f6776e.mo7928a(this.f6780b, this.f6781c, this.f6782d, this.f6783e, this.f6784f, this.f6785g);
    }
}
