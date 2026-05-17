package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.AbstractC1556fi;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.j */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C0835j extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC0829d f4830a;

    private C0835j(BinderC0829d binderC0829d) {
        this.f4830a = binderC0829d;
    }

    /* synthetic */ C0835j(BinderC0829d binderC0829d, C0830e c0830e) {
        this(binderC0829d);
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        Bitmap bitmapM11538a = C0710au.m5587w().m11538a(Integer.valueOf(this.f4830a.f4803a.f4793o.f4844e));
        if (bitmapM11538a != null) {
            C1596gv.f10711a.post(new RunnableC0836k(this, C0710au.m5571g().mo11460a(this.f4830a.f4804c, bitmapM11538a, this.f4830a.f4803a.f4793o.f4842c, this.f4830a.f4803a.f4793o.f4843d)));
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }
}
