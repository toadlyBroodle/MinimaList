package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
final class cgo extends bxt {

    /* JADX INFO: renamed from: a */
    private final bxs f9949a;

    cgo(bxs bxsVar) {
        this.f9949a = bxsVar;
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10364a() {
        if (cgx.m10849a()) {
            int iIntValue = ((Integer) bxm.m10409f().m10546a(can.f9441aN)).intValue();
            int iIntValue2 = ((Integer) bxm.m10409f().m10546a(can.f9442aO)).intValue();
            if (iIntValue <= 0 || iIntValue2 < 0) {
                C0710au.m5581q().m10817a();
            } else {
                C1596gv.f10711a.postDelayed(cgp.f9950a, new Random().nextInt(iIntValue2 + 1) + iIntValue);
            }
        }
        this.f9949a.mo10364a();
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10365a(int i) {
        this.f9949a.mo10365a(i);
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: b */
    public final void mo10366b() {
        this.f9949a.mo10366b();
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: c */
    public final void mo10367c() {
        this.f9949a.mo10367c();
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: d */
    public final void mo10368d() {
        this.f9949a.mo10368d();
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: e */
    public final void mo10369e() {
        this.f9949a.mo10369e();
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: f */
    public final void mo10370f() {
        this.f9949a.mo10370f();
    }
}
