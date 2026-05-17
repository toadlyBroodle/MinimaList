package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.InterfaceC1766nc;
import com.google.android.gms.internal.bua;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.m */
/* JADX INFO: loaded from: classes.dex */
final class C0823m implements InterfaceC1766nc {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1541eu f4773a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0822l f4774b;

    C0823m(BinderC0822l binderC0822l, C1541eu c1541eu) {
        this.f4774b = binderC0822l;
        this.f4773a = c1541eu;
    }

    @Override // com.google.android.gms.internal.InterfaceC1766nc
    /* JADX INFO: renamed from: a */
    public final void mo5623a() {
        Context context = this.f4774b.f4405e.f4517c;
        Object obj = this.f4773a.f10535b;
        if (obj == null) {
            throw null;
        }
        new bua(context, (View) obj).m10262a(this.f4773a.f10535b);
    }
}
