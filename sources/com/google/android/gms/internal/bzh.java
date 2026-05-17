package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.ads.C0686g;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.C0857j;
import com.google.android.gms.ads.p044a.InterfaceC0658a;
import com.google.android.gms.ads.p044a.InterfaceC0660c;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzh {

    /* JADX INFO: renamed from: a */
    private final cih f9339a;

    /* JADX INFO: renamed from: b */
    private final bxa f9340b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f9341c;

    /* JADX INFO: renamed from: d */
    private final C0688i f9342d;

    /* JADX INFO: renamed from: e */
    private bxo f9343e;

    /* JADX INFO: renamed from: f */
    private bws f9344f;

    /* JADX INFO: renamed from: g */
    private C0657a f9345g;

    /* JADX INFO: renamed from: h */
    private C0681d[] f9346h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0658a f9347i;

    /* JADX INFO: renamed from: j */
    private C0686g f9348j;

    /* JADX INFO: renamed from: k */
    private byd f9349k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0660c f9350l;

    /* JADX INFO: renamed from: m */
    private C0857j f9351m;

    /* JADX INFO: renamed from: n */
    private String f9352n;

    /* JADX INFO: renamed from: o */
    private ViewGroup f9353o;

    /* JADX INFO: renamed from: p */
    private int f9354p;

    /* JADX INFO: renamed from: q */
    private boolean f9355q;

    public bzh(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, bxa.f9246a, i);
    }

    private bzh(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bxa bxaVar, int i) {
        this(viewGroup, attributeSet, z, bxaVar, null, i);
    }

    private bzh(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bxa bxaVar, byd bydVar, int i) {
        this.f9339a = new cih();
        this.f9342d = new C0688i();
        this.f9343e = new bzi(this);
        this.f9353o = viewGroup;
        this.f9340b = bxaVar;
        this.f9349k = null;
        this.f9341c = new AtomicBoolean(false);
        this.f9354p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                bxe bxeVar = new bxe(context, attributeSet);
                this.f9346h = bxeVar.m10388a(z);
                this.f9352n = bxeVar.m10387a();
                if (viewGroup.isInEditMode()) {
                    C1657jb c1657jbM10404a = bxm.m10404a();
                    C0681d c0681d = this.f9346h[0];
                    int i2 = this.f9354p;
                    bxb bxbVar = new bxb(context, c0681d);
                    bxbVar.f9256j = m10481a(i2);
                    c1657jbM10404a.m11584a(viewGroup, bxbVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                bxm.m10404a().m11585a(viewGroup, new bxb(context, C0681d.f4380a), e.getMessage(), e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static bxb m10480a(Context context, C0681d[] c0681dArr, int i) {
        bxb bxbVar = new bxb(context, c0681dArr);
        bxbVar.f9256j = m10481a(i);
        return bxbVar;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10481a(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m10482a() {
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5479i();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to destroy AdView.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10483a(InterfaceC0658a interfaceC0658a) {
        try {
            this.f9347i = interfaceC0658a;
            if (this.f9349k != null) {
                this.f9349k.mo5453a(interfaceC0658a != null ? new bxd(interfaceC0658a) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the AppEventListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10484a(InterfaceC0660c interfaceC0660c) {
        this.f9350l = interfaceC0660c;
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5458a(interfaceC0660c != null ? new cbk(interfaceC0660c) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10485a(C0657a c0657a) {
        this.f9345g = c0657a;
        this.f9343e.m10412a(c0657a);
    }

    /* JADX INFO: renamed from: a */
    public final void m10486a(C0686g c0686g) {
        this.f9348j = c0686g;
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5454a(this.f9348j == null ? null : this.f9348j.m5424a());
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set correlator.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10487a(C0857j c0857j) {
        this.f9351m = c0857j;
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5456a(c0857j == null ? null : new bzw(c0857j));
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set video options.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10488a(bws bwsVar) {
        try {
            this.f9344f = bwsVar;
            if (this.f9349k != null) {
                this.f9349k.mo5451a(bwsVar != null ? new bwt(bwsVar) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the AdClickListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10489a(bzf bzfVar) {
        try {
            if (this.f9349k == null) {
                if ((this.f9346h == null || this.f9352n == null) && this.f9349k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f9353o.getContext();
                bxb bxbVarM10480a = m10480a(context, this.f9346h, this.f9354p);
                this.f9349k = "search_v2".equals(bxbVarM10480a.f9247a) ? (byd) bxf.m10391a(context, false, (bxf.AbstractC1463a) new bxh(bxm.m10405b(), context, bxbVarM10480a, this.f9352n)) : (byd) bxf.m10391a(context, false, (bxf.AbstractC1463a) new bxg(bxm.m10405b(), context, bxbVarM10480a, this.f9352n, this.f9339a));
                this.f9349k.mo5452a(new bwu(this.f9343e));
                if (this.f9344f != null) {
                    this.f9349k.mo5451a(new bwt(this.f9344f));
                }
                if (this.f9347i != null) {
                    this.f9349k.mo5453a(new bxd(this.f9347i));
                }
                if (this.f9350l != null) {
                    this.f9349k.mo5458a(new cbk(this.f9350l));
                }
                if (this.f9348j != null) {
                    this.f9349k.mo5454a(this.f9348j.m5424a());
                }
                if (this.f9351m != null) {
                    this.f9349k.mo5456a(new bzw(this.f9351m));
                }
                this.f9349k.mo5472b(this.f9355q);
                try {
                    InterfaceC0652a interfaceC0652aMo5480j = this.f9349k.mo5480j();
                    if (interfaceC0652aMo5480j != null) {
                        this.f9353o.addView((View) BinderC0654c.m5330a(interfaceC0652aMo5480j));
                    }
                } catch (RemoteException e) {
                    C1668jm.m11613c("Failed to get an ad frame.", e);
                }
            }
            if (this.f9349k.mo5473b(bxa.m10378a(this.f9353o.getContext(), bzfVar))) {
                this.f9339a.m10935a(bzfVar.m10449j());
            }
        } catch (RemoteException e2) {
            C1668jm.m11613c("Failed to load ad.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10490a(String str) {
        if (this.f9352n != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f9352n = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10491a(boolean z) {
        this.f9355q = z;
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5472b(this.f9355q);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set manual impressions.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10492a(C0681d... c0681dArr) {
        if (this.f9346h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m10494b(c0681dArr);
    }

    /* JADX INFO: renamed from: b */
    public final C0657a m10493b() {
        return this.f9345g;
    }

    /* JADX INFO: renamed from: b */
    public final void m10494b(C0681d... c0681dArr) {
        this.f9346h = c0681dArr;
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5450a(m10480a(this.f9353o.getContext(), this.f9346h, this.f9354p));
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the ad size.", e);
        }
        this.f9353o.requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final C0681d m10495c() {
        bxb bxbVarMo5481k;
        try {
            if (this.f9349k != null && (bxbVarMo5481k = this.f9349k.mo5481k()) != null) {
                return bxbVarMo5481k.m10384b();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to get the current AdSize.", e);
        }
        if (this.f9346h != null) {
            return this.f9346h[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final C0681d[] m10496d() {
        return this.f9346h;
    }

    /* JADX INFO: renamed from: e */
    public final String m10497e() {
        if (this.f9352n == null && this.f9349k != null) {
            try {
                this.f9352n = this.f9349k.mo5443A();
            } catch (RemoteException e) {
                C1668jm.m11613c("Failed to get ad unit id.", e);
            }
        }
        return this.f9352n;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0658a m10498f() {
        return this.f9347i;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0660c m10499g() {
        return this.f9350l;
    }

    /* JADX INFO: renamed from: h */
    public final void m10500h() {
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5484n();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to call pause.", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10501i() {
        try {
            if (this.f9349k != null) {
                this.f9349k.mo5485o();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to call resume.", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m10502j() {
        try {
            if (this.f9349k != null) {
                return this.f9349k.mo5554f_();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0688i m10503k() {
        return this.f9342d;
    }

    /* JADX INFO: renamed from: l */
    public final byx m10504l() {
        if (this.f9349k == null) {
            return null;
        }
        try {
            return this.f9349k.mo5488r();
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to retrieve VideoController.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final C0857j m10505m() {
        return this.f9351m;
    }
}
