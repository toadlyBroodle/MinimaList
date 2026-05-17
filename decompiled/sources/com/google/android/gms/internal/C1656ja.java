package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.ja */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1656ja {

    /* JADX INFO: renamed from: a */
    private final View f10825a;

    /* JADX INFO: renamed from: b */
    private Activity f10826b;

    /* JADX INFO: renamed from: c */
    private boolean f10827c;

    /* JADX INFO: renamed from: d */
    private boolean f10828d;

    /* JADX INFO: renamed from: e */
    private boolean f10829e;

    /* JADX INFO: renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f10830f;

    /* JADX INFO: renamed from: g */
    private ViewTreeObserver.OnScrollChangedListener f10831g;

    public C1656ja(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f10826b = activity;
        this.f10825a = view;
        this.f10830f = onGlobalLayoutListener;
        this.f10831g = onScrollChangedListener;
    }

    /* JADX INFO: renamed from: e */
    private final void m11553e() {
        if (this.f10827c) {
            return;
        }
        if (this.f10830f != null) {
            if (this.f10826b != null) {
                C0710au.m5569e();
                C1596gv.m11388a(this.f10826b, this.f10830f);
            }
            C0710au.m5589y();
            C1708kz.m11663a(this.f10825a, this.f10830f);
        }
        if (this.f10831g != null) {
            if (this.f10826b != null) {
                C0710au.m5569e();
                C1596gv.m11389a(this.f10826b, this.f10831g);
            }
            C0710au.m5589y();
            C1708kz.m11664a(this.f10825a, this.f10831g);
        }
        this.f10827c = true;
    }

    /* JADX INFO: renamed from: f */
    private final void m11554f() {
        if (this.f10826b != null && this.f10827c) {
            if (this.f10830f != null && this.f10826b != null) {
                C0710au.m5571g().mo11465a(this.f10826b, this.f10830f);
            }
            if (this.f10831g != null && this.f10826b != null) {
                C0710au.m5569e();
                C1596gv.m11409b(this.f10826b, this.f10831g);
            }
            this.f10827c = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11555a() {
        this.f10829e = true;
        if (this.f10828d) {
            m11553e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11556a(Activity activity) {
        this.f10826b = activity;
    }

    /* JADX INFO: renamed from: b */
    public final void m11557b() {
        this.f10829e = false;
        m11554f();
    }

    /* JADX INFO: renamed from: c */
    public final void m11558c() {
        this.f10828d = true;
        if (this.f10829e) {
            m11553e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11559d() {
        this.f10828d = false;
        m11554f();
    }
}
