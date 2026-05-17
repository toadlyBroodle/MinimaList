package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1773nj;
import com.google.android.gms.internal.InterfaceC1528eh;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cbb;
import com.google.android.gms.internal.clf;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bg */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0723bg implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1542ev f4557a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC1528eh f4558b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC0720bd f4559c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ cba f4560d;

    RunnableC0723bg(BinderC0720bd binderC0720bd, C1542ev c1542ev, InterfaceC1528eh interfaceC1528eh, cba cbaVar) {
        this.f4559c = binderC0720bd;
        this.f4557a = c1542ev;
        this.f4558b = interfaceC1528eh;
        this.f4560d = cbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4557a.f10561b.f12626r && this.f4559c.f4405e.f4540z != null) {
            String strM11384a = null;
            if (this.f4557a.f10561b.f12609a != null) {
                C0710au.m5569e();
                strM11384a = C1596gv.m11384a(this.f4557a.f10561b.f12609a);
            }
            cbb cbbVar = new cbb(this.f4559c, strM11384a, this.f4557a.f10561b.f12610b);
            this.f4559c.f4405e.f4506F = 1;
            try {
                this.f4559c.f4403c = false;
                this.f4559c.f4405e.f4540z.mo10590a(cbbVar);
                return;
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.f4559c.f4403c = true;
            }
        }
        C0734br c0734br = new C0734br(this.f4559c.f4405e.f4517c, this.f4558b, this.f4557a.f10561b.f12593E);
        try {
            InterfaceC1758mv interfaceC1758mvMo5625a = this.f4559c.mo5625a(this.f4557a, c0734br, this.f4558b);
            interfaceC1758mvMo5625a.setOnTouchListener(new ViewOnTouchListenerC0725bi(this, c0734br));
            interfaceC1758mvMo5625a.setOnClickListener(new ViewOnClickListenerC0726bj(this, c0734br));
            this.f4559c.f4405e.f4506F = 0;
            ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4559c.f4405e;
            C0710au.m5568d();
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4522h = clf.m11081a(this.f4559c.f4405e.f4517c, this.f4559c, this.f4557a, this.f4559c.f4405e.f4518d, interfaceC1758mvMo5625a, this.f4559c.f4545i, this.f4559c, this.f4560d);
        } catch (C1773nj e2) {
            C1560fm.m11611b("Could not obtain webview.", e2);
            C1596gv.f10711a.post(new RunnableC0724bh(this));
        }
    }
}
