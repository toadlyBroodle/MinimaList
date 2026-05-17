package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.InterfaceC0703an;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ni */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1772ni implements Callable<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f11124a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1807oq f11125b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f11126c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ boolean f11127d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f11128e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ afk f11129f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ C1670jo f11130g;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ cba f11131h;

    /* JADX INFO: renamed from: i */
    private /* synthetic */ InterfaceC0703an f11132i;

    /* JADX INFO: renamed from: j */
    private /* synthetic */ C0733bq f11133j;

    /* JADX INFO: renamed from: k */
    private /* synthetic */ bwf f11134k;

    CallableC1772ni(C1769nf c1769nf, Context context, C1807oq c1807oq, String str, boolean z, boolean z2, afk afkVar, C1670jo c1670jo, cba cbaVar, InterfaceC0703an interfaceC0703an, C0733bq c0733bq, bwf bwfVar) {
        this.f11124a = context;
        this.f11125b = c1807oq;
        this.f11126c = str;
        this.f11127d = z;
        this.f11128e = z2;
        this.f11129f = afkVar;
        this.f11130g = c1670jo;
        this.f11131h = cbaVar;
        this.f11132i = interfaceC0703an;
        this.f11133j = c0733bq;
        this.f11134k = bwfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ InterfaceC1758mv call() {
        C1774nk c1774nk = new C1774nk(ViewTreeObserverOnGlobalLayoutListenerC1775nl.m11892a(this.f11124a, this.f11125b, this.f11126c, this.f11127d, this.f11128e, this.f11129f, this.f11130g, this.f11131h, this.f11132i, this.f11133j, this.f11134k));
        c1774nk.setWebViewClient(C0710au.m5571g().mo11461a(c1774nk, this.f11128e));
        c1774nk.setWebChromeClient(C0710au.m5571g().mo11477c((InterfaceC1758mv) c1774nk));
        return c1774nk;
    }
}
