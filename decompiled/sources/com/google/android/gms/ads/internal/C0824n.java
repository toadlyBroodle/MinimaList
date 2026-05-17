package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.AbstractC1556fi;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.n */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C0824n extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC0822l f4775a;

    /* JADX INFO: renamed from: b */
    private final int f4776b;

    public C0824n(BinderC0822l binderC0822l, int i) {
        this.f4775a = binderC0822l;
        this.f4776b = i;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        C0846p c0846p = new C0846p(this.f4775a.f4405e.f4507G, this.f4775a.m5767E(), this.f4775a.f4767l, this.f4775a.f4768m, this.f4775a.f4405e.f4507G ? this.f4776b : -1, this.f4775a.f4769n, this.f4775a.f4405e.f4524j.f10529I);
        int iMo11797A = this.f4775a.f4405e.f4524j.f10535b.mo11797A();
        if (iMo11797A == -1) {
            iMo11797A = this.f4775a.f4405e.f4524j.f10540g;
        }
        C1596gv.f10711a.post(new RunnableC0825o(this, new AdOverlayInfoParcel(this.f4775a, this.f4775a, this.f4775a, this.f4775a.f4405e.f4524j.f10535b, iMo11797A, this.f4775a.f4405e.f4519e, this.f4775a.f4405e.f4524j.f10559z, c0846p)));
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }
}
