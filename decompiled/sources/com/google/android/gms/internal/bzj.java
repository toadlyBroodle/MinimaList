package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0686g;
import com.google.android.gms.ads.p044a.C0662e;
import com.google.android.gms.ads.p044a.InterfaceC0658a;
import com.google.android.gms.ads.p044a.InterfaceC0660c;
import com.google.android.gms.ads.reward.InterfaceC0881b;
import com.google.android.gms.internal.bxf;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzj {

    /* JADX INFO: renamed from: a */
    private final cih f9357a;

    /* JADX INFO: renamed from: b */
    private final Context f9358b;

    /* JADX INFO: renamed from: c */
    private final bxa f9359c;

    /* JADX INFO: renamed from: d */
    private C0657a f9360d;

    /* JADX INFO: renamed from: e */
    private bws f9361e;

    /* JADX INFO: renamed from: f */
    private byd f9362f;

    /* JADX INFO: renamed from: g */
    private String f9363g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0658a f9364h;

    /* JADX INFO: renamed from: i */
    private C0662e f9365i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0660c f9366j;

    /* JADX INFO: renamed from: k */
    private C0686g f9367k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0881b f9368l;

    /* JADX INFO: renamed from: m */
    private boolean f9369m;

    /* JADX INFO: renamed from: n */
    private boolean f9370n;

    public bzj(Context context) {
        this(context, bxa.f9246a, null);
    }

    private bzj(Context context, bxa bxaVar, C0662e c0662e) {
        this.f9357a = new cih();
        this.f9358b = context;
        this.f9359c = bxaVar;
        this.f9365i = c0662e;
    }

    /* JADX INFO: renamed from: b */
    private final void m10506b(String str) {
        if (this.f9362f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10507a(C0657a c0657a) {
        try {
            this.f9360d = c0657a;
            if (this.f9362f != null) {
                this.f9362f.mo5452a(c0657a != null ? new bwu(c0657a) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the AdListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10508a(InterfaceC0881b interfaceC0881b) {
        try {
            this.f9368l = interfaceC0881b;
            if (this.f9362f != null) {
                this.f9362f.mo5461a(interfaceC0881b != null ? new BinderC1492cz(interfaceC0881b) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the AdListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10509a(bws bwsVar) {
        try {
            this.f9361e = bwsVar;
            if (this.f9362f != null) {
                this.f9362f.mo5451a(bwsVar != null ? new bwt(bwsVar) : null);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set the AdClickListener.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10510a(bzf bzfVar) {
        try {
            if (this.f9362f == null) {
                if (this.f9363g == null) {
                    m10506b("loadAd");
                }
                bxb bxbVarM10380a = this.f9369m ? bxb.m10380a() : new bxb();
                bxf bxfVarM10405b = bxm.m10405b();
                Context context = this.f9358b;
                this.f9362f = (byd) bxf.m10391a(context, false, (bxf.AbstractC1463a) new bxi(bxfVarM10405b, context, bxbVarM10380a, this.f9363g, this.f9357a));
                if (this.f9360d != null) {
                    this.f9362f.mo5452a(new bwu(this.f9360d));
                }
                if (this.f9361e != null) {
                    this.f9362f.mo5451a(new bwt(this.f9361e));
                }
                if (this.f9364h != null) {
                    this.f9362f.mo5453a(new bxd(this.f9364h));
                }
                if (this.f9366j != null) {
                    this.f9362f.mo5458a(new cbk(this.f9366j));
                }
                if (this.f9367k != null) {
                    this.f9362f.mo5454a(this.f9367k.m5424a());
                }
                if (this.f9368l != null) {
                    this.f9362f.mo5461a(new BinderC1492cz(this.f9368l));
                }
                this.f9362f.mo5474c(this.f9370n);
            }
            if (this.f9362f.mo5473b(bxa.m10378a(this.f9358b, bzfVar))) {
                this.f9357a.m10935a(bzfVar.m10449j());
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to load ad.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10511a(String str) {
        if (this.f9363g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f9363g = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10512a(boolean z) {
        this.f9369m = true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10513a() {
        try {
            if (this.f9362f == null) {
                return false;
            }
            return this.f9362f.mo5482l();
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to check if ad is ready.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10514b() {
        try {
            m10506b("show");
            this.f9362f.mo5503D();
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to show interstitial.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10515b(boolean z) {
        try {
            this.f9370n = z;
            if (this.f9362f != null) {
                this.f9362f.mo5474c(z);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to set immersive mode", e);
        }
    }
}
