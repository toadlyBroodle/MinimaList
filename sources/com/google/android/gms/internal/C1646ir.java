package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.ir */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1646ir extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    private final C1669jn f10804a;

    /* JADX INFO: renamed from: b */
    private final String f10805b;

    public C1646ir(Context context, String str, String str2) {
        this(str2, C0710au.m5569e().m11440a(context, str));
    }

    private C1646ir(String str, String str2) {
        this.f10804a = new C1669jn(str2);
        this.f10805b = str;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        this.f10804a.mo11455a(this.f10805b);
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }
}
