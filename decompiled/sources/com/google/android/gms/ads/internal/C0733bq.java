package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.AbstractC1725lp;
import com.google.android.gms.internal.C1522eb;
import com.google.android.gms.internal.C1523ec;
import com.google.android.gms.internal.C1730lu;
import com.google.android.gms.internal.C1744mh;
import com.google.android.gms.internal.InterfaceC1529ei;
import com.google.android.gms.internal.InterfaceC1756mt;
import com.google.android.gms.internal.bwk;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bq */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0733bq {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1756mt f4576a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1725lp f4577b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1529ei f4578c;

    /* JADX INFO: renamed from: d */
    public final bwk f4579d;

    private C0733bq(InterfaceC1756mt interfaceC1756mt, AbstractC1725lp abstractC1725lp, InterfaceC1529ei interfaceC1529ei, bwk bwkVar) {
        this.f4576a = interfaceC1756mt;
        this.f4577b = abstractC1725lp;
        this.f4578c = interfaceC1529ei;
        this.f4579d = bwkVar;
    }

    /* JADX INFO: renamed from: a */
    public static C0733bq m5641a(Context context) {
        return new C0733bq(new C1744mh(), new C1730lu(), new C1522eb(new C1523ec()), new bwk(context));
    }
}
