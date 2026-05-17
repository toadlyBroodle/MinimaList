package com.google.android.gms.ads.p045b;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.cdc;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.ads.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0668e extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f4355a;

    /* JADX INFO: renamed from: b */
    private final cdc f4356b;

    /* JADX INFO: renamed from: a */
    protected final View m5363a(String str) {
        try {
            InterfaceC0652a interfaceC0652aMo10722a = this.f4356b.mo10722a(str);
            if (interfaceC0652aMo10722a != null) {
                return (View) BinderC0654c.m5330a(interfaceC0652aMo10722a);
            }
        } catch (RemoteException e) {
            C1668jm.m11611b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected final void m5364a(String str, View view) {
        try {
            this.f4356b.mo10726a(str, BinderC0654c.m5329a(view));
        } catch (RemoteException e) {
            C1668jm.m11611b("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f4355a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f4355a != view) {
            super.bringChildToFront(this.f4355a);
        }
    }

    public C0664a getAdChoicesView() {
        View viewM5363a = m5363a("1098");
        if (viewM5363a instanceof C0664a) {
            return (C0664a) viewM5363a;
        }
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f4356b != null) {
            try {
                this.f4356b.mo10725a(BinderC0654c.m5329a(view), i);
            } catch (RemoteException e) {
                C1668jm.m11611b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f4355a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4355a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(C0664a c0664a) {
        m5364a("1098", c0664a);
    }

    public void setNativeAd(AbstractC0666c abstractC0666c) {
        try {
            this.f4356b.mo10724a((InterfaceC0652a) abstractC0666c.mo5343a());
        } catch (RemoteException e) {
            C1668jm.m11611b("Unable to call setNativeAd on delegate", e);
        }
    }
}
