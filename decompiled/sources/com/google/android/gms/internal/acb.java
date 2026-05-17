package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class acb implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6324a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6325b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6326c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ long f6327d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ abi f6328e;

    acb(abi abiVar, String str, String str2, String str3, long j) {
        this.f6328e = abiVar;
        this.f6324a = str;
        this.f6325b = str2;
        this.f6326c = str3;
        this.f6327d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6324a == null) {
            this.f6328e.f6271a.m7556v().m7637a(this.f6325b, (AppMeasurement.C2120g) null);
            return;
        }
        AppMeasurement.C2120g c2120g = new AppMeasurement.C2120g();
        c2120g.f12759b = this.f6326c;
        c2120g.f12760c = this.f6324a;
        c2120g.f12761d = this.f6327d;
        this.f6328e.f6271a.m7556v().m7637a(this.f6325b, c2120g);
    }
}
