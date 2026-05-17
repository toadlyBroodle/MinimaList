package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbp extends ccz {

    /* JADX INFO: renamed from: a */
    private final Drawable f9728a;

    /* JADX INFO: renamed from: b */
    private final Uri f9729b;

    /* JADX INFO: renamed from: c */
    private final double f9730c;

    public cbp(Drawable drawable, Uri uri, double d) {
        this.f9728a = drawable;
        this.f9729b = uri;
        this.f9730c = d;
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10604a() {
        return BinderC0654c.m5329a(this.f9728a);
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: b */
    public final Uri mo10605b() {
        return this.f9729b;
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: c */
    public final double mo10606c() {
        return this.f9730c;
    }
}
