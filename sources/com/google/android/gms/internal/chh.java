package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.p048js.C0820z;
import com.google.android.gms.ads.internal.p048js.InterfaceC0809o;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class chh {

    /* JADX INFO: renamed from: a */
    private static InterfaceC1627hz<InterfaceC0809o> f9994a = new chi();

    /* JADX INFO: renamed from: b */
    private static InterfaceC1627hz<InterfaceC0809o> f9995b = new chj();

    /* JADX INFO: renamed from: c */
    private final C0820z f9996c;

    public chh(Context context, C1670jo c1670jo, String str) {
        this.f9996c = new C0820z(context, c1670jo, str, f9994a, f9995b);
    }

    /* JADX INFO: renamed from: a */
    public final <I, O> cgz<I, O> m10857a(String str, chc<I> chcVar, chb<O> chbVar) {
        return new chl(this.f9996c, str, chcVar, chbVar);
    }
}
