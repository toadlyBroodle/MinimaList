package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: loaded from: classes.dex */
final class ccp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ccd f9833a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cco f9834b;

    ccp(cco ccoVar, ccd ccdVar) {
        this.f9834b = ccoVar;
        this.f9833a = ccdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objMo10673e;
        if (this.f9834b.f9825f) {
            if (this.f9834b.f9824e == null) {
                this.f9834b.f9824e = new View(this.f9834b.f9823d.getContext());
                this.f9834b.f9824e.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            }
            if (this.f9834b.f9823d != this.f9834b.f9824e.getParent()) {
                this.f9834b.f9823d.addView(this.f9834b.f9824e);
            }
        }
        try {
            objMo10673e = this.f9833a.mo10673e();
        } catch (Exception e) {
            C0710au.m5571g();
            if (C1603hb.m11458e()) {
                C1560fm.m11615e("Privileged processes cannot create HTML overlays.");
                objMo10673e = null;
            } else {
                C1560fm.m11611b("Error obtaining overlay.", e);
                objMo10673e = null;
            }
        }
        if (objMo10673e != null && this.f9834b.f9821a != null) {
            FrameLayout frameLayout = this.f9834b.f9821a;
            if (objMo10673e == null) {
                throw null;
            }
            frameLayout.addView((View) objMo10673e);
        }
        this.f9834b.m10716a(this.f9833a);
    }
}
