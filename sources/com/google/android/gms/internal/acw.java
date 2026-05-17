package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class acw implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6390a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ AppMeasurement.C2120g f6391b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ acy f6392c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ acv f6393d;

    acw(acv acvVar, boolean z, AppMeasurement.C2120g c2120g, acy acyVar) {
        this.f6393d = acvVar;
        this.f6390a = z;
        this.f6391b = c2120g;
        this.f6392c = acyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6390a && this.f6393d.f6381a != null) {
            this.f6393d.m7631a(this.f6393d.f6381a);
        }
        if ((this.f6391b != null && this.f6391b.f12761d == this.f6392c.f12761d && aek.m7725a(this.f6391b.f12760c, this.f6392c.f12760c) && aek.m7725a(this.f6391b.f12759b, this.f6392c.f12759b)) ? false : true) {
            Bundle bundle = new Bundle();
            acv.m7632a(this.f6392c, bundle);
            if (this.f6391b != null) {
                if (this.f6391b.f12759b != null) {
                    bundle.putString("_pn", this.f6391b.f12759b);
                }
                bundle.putString("_pc", this.f6391b.f12760c);
                bundle.putLong("_pi", this.f6391b.f12761d);
            }
            this.f6393d.mo7379f().m7614a("auto", "_vs", bundle);
        }
        this.f6393d.f6381a = this.f6392c;
        this.f6393d.mo7382i().m7667a(this.f6392c);
    }
}
