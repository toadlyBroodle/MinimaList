package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(19)
public final class clk extends clh {

    /* JADX INFO: renamed from: d */
    private Object f10274d;

    /* JADX INFO: renamed from: e */
    private PopupWindow f10275e;

    /* JADX INFO: renamed from: f */
    private boolean f10276f;

    clk(Context context, C1542ev c1542ev, InterfaceC1758mv interfaceC1758mv, clg clgVar) {
        super(context, c1542ev, interfaceC1758mv, clgVar);
        this.f10274d = new Object();
        this.f10276f = false;
    }

    /* JADX INFO: renamed from: e */
    private final void m11084e() {
        synchronized (this.f10274d) {
            this.f10276f = true;
            if ((this.f10248a instanceof Activity) && ((Activity) this.f10248a).isDestroyed()) {
                this.f10275e = null;
            }
            if (this.f10275e != null) {
                if (this.f10275e.isShowing()) {
                    this.f10275e.dismiss();
                }
                this.f10275e = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.cky
    /* JADX INFO: renamed from: a */
    protected final void mo11074a(int i) {
        m11084e();
        super.mo11074a(i);
    }

    @Override // com.google.android.gms.internal.clh
    /* JADX INFO: renamed from: b */
    protected final void mo11082b() {
        Window window = this.f10248a instanceof Activity ? ((Activity) this.f10248a).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) this.f10248a).isDestroyed()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f10248a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Object obj = this.f10249b;
        if (obj == null) {
            throw null;
        }
        frameLayout.addView((View) obj, -1, -1);
        synchronized (this.f10274d) {
            if (this.f10276f) {
                return;
            }
            this.f10275e = new PopupWindow((View) frameLayout, 1, 1, false);
            this.f10275e.setOutsideTouchable(true);
            this.f10275e.setClippingEnabled(false);
            C1560fm.m11610b("Displaying the 1x1 popup off the screen.");
            try {
                this.f10275e.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception e) {
                this.f10275e = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.cky, com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: c */
    public final void mo11075c() {
        m11084e();
        super.mo11075c();
    }
}
