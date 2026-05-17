package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.lt */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1729lt {

    /* JADX INFO: renamed from: a */
    private final Context f10971a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1739mc f10972b;

    /* JADX INFO: renamed from: c */
    private final ViewGroup f10973c;

    /* JADX INFO: renamed from: d */
    private C1726lq f10974d;

    private C1729lt(Context context, ViewGroup viewGroup, InterfaceC1739mc interfaceC1739mc, C1726lq c1726lq) {
        this.f10971a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10973c = viewGroup;
        this.f10972b = interfaceC1739mc;
        this.f10974d = null;
    }

    public C1729lt(Context context, ViewGroup viewGroup, InterfaceC1758mv interfaceC1758mv) {
        this(context, viewGroup, interfaceC1758mv, null);
    }

    /* JADX INFO: renamed from: a */
    public final C1726lq m11720a() {
        C1221aj.m7073b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f10974d;
    }

    /* JADX INFO: renamed from: a */
    public final void m11721a(int i, int i2, int i3, int i4) {
        C1221aj.m7073b("The underlay may only be modified from the UI thread.");
        if (this.f10974d != null) {
            this.f10974d.m11709a(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11722a(int i, int i2, int i3, int i4, int i5, boolean z, C1738mb c1738mb) {
        if (this.f10974d != null) {
            return;
        }
        cat.m10565a(this.f10972b.mo11759j().m10571a(), this.f10972b.mo11754c(), "vpr2");
        this.f10974d = new C1726lq(this.f10971a, this.f10972b, i5, z, this.f10972b.mo11759j().m10571a(), c1738mb);
        this.f10973c.addView(this.f10974d, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f10974d.m11709a(i, i2, i3, i4);
        this.f10972b.mo11752a(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m11723b() {
        C1221aj.m7073b("onPause must be called from the UI thread.");
        if (this.f10974d != null) {
            this.f10974d.m11713i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11724c() {
        C1221aj.m7073b("onDestroy must be called from the UI thread.");
        if (this.f10974d != null) {
            this.f10974d.m11718n();
            this.f10973c.removeView(this.f10974d);
            this.f10974d = null;
        }
    }
}
