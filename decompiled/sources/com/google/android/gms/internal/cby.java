package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cby extends ccd {

    /* JADX INFO: renamed from: b */
    private civ f9773b;

    /* JADX INFO: renamed from: c */
    private ciy f9774c;

    /* JADX INFO: renamed from: d */
    private final cca f9775d;

    /* JADX INFO: renamed from: e */
    private cbz f9776e;

    /* JADX INFO: renamed from: f */
    private boolean f9777f;

    /* JADX INFO: renamed from: g */
    private Object f9778g;

    private cby(Context context, cca ccaVar, afk afkVar, ccb ccbVar) {
        super(context, ccaVar, null, afkVar, null, ccbVar, null, null);
        this.f9777f = false;
        this.f9778g = new Object();
        this.f9775d = ccaVar;
    }

    public cby(Context context, cca ccaVar, afk afkVar, civ civVar, ccb ccbVar) {
        this(context, ccaVar, afkVar, ccbVar);
        this.f9773b = civVar;
    }

    public cby(Context context, cca ccaVar, afk afkVar, ciy ciyVar, ccb ccbVar) {
        this(context, ccaVar, afkVar, ccbVar);
        this.f9774c = ciyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x001a, code lost:
    
        r0 = null;
     */
    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo10663a(View.OnClickListener onClickListener, boolean z) {
        synchronized (this.f9778g) {
            if (this.f9776e != null) {
                return this.f9776e.mo10663a(onClickListener, z);
            }
            try {
            } catch (RemoteException e) {
                C1560fm.m11613c("Failed to call getAdChoicesContent", e);
            }
            InterfaceC0652a interfaceC0652aMo10983n = this.f9773b != null ? this.f9773b.mo10983n() : this.f9774c != null ? this.f9774c.mo11000k() : null;
            if (interfaceC0652aMo10983n != null) {
                return (View) BinderC0654c.m5330a(interfaceC0652aMo10983n);
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10664a(View view, Map<String, WeakReference<View>> map) {
        C1221aj.m7073b("recordImpression must be called on the main UI thread.");
        synchronized (this.f9778g) {
            this.f9782a = true;
            if (this.f9776e != null) {
                this.f9776e.mo10664a(view, map);
                this.f9775d.m10688W();
            } else {
                try {
                    if (this.f9773b != null && !this.f9773b.mo10979j()) {
                        this.f9773b.mo10978i();
                        this.f9775d.m10688W();
                    } else if (this.f9774c != null && !this.f9774c.mo10997h()) {
                        this.f9774c.mo10996g();
                        this.f9775d.m10688W();
                    }
                } catch (RemoteException e) {
                    C1560fm.m11613c("Failed to call recordImpression", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10665a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1221aj.m7073b("performClick must be called on the main UI thread.");
        synchronized (this.f9778g) {
            if (this.f9776e == null) {
                try {
                    if (this.f9773b != null && !this.f9773b.mo10980k()) {
                        this.f9773b.mo10968a(BinderC0654c.m5329a(view));
                        this.f9775d.m10689e();
                    }
                    if (this.f9774c != null && !this.f9774c.mo10998i()) {
                        this.f9774c.mo10988a(BinderC0654c.m5329a(view));
                        this.f9775d.m10689e();
                    }
                } catch (RemoteException e) {
                    C1560fm.m11613c("Failed to call performClick", e);
                }
            }
            this.f9776e.mo10665a(view, map, bundle, view2);
            this.f9775d.m10689e();
        }
    }

    @Override // com.google.android.gms.internal.ccd
    /* JADX INFO: renamed from: a */
    public final void mo10666a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.f9778g) {
            this.f9777f = true;
            try {
                if (this.f9773b != null) {
                    this.f9773b.mo10970b(BinderC0654c.m5329a(view));
                } else if (this.f9774c != null) {
                    this.f9774c.mo10990b(BinderC0654c.m5329a(view));
                }
            } catch (RemoteException e) {
                C1560fm.m11613c("Failed to call prepareAd", e);
            }
            this.f9777f = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10667a(cbz cbzVar) {
        synchronized (this.f9778g) {
            this.f9776e = cbzVar;
        }
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final boolean mo10668a() {
        boolean zMo10668a;
        synchronized (this.f9778g) {
            zMo10668a = this.f9776e != null ? this.f9776e.mo10668a() : this.f9775d.mo5512M();
        }
        return zMo10668a;
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public final void mo10669b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f9778g) {
            try {
                if (this.f9773b != null) {
                    this.f9773b.mo10972c(BinderC0654c.m5329a(view));
                } else if (this.f9774c != null) {
                    this.f9774c.mo10992c(BinderC0654c.m5329a(view));
                }
            } catch (RemoteException e) {
                C1560fm.m11613c("Failed to call untrackView", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public final boolean mo10670b() {
        boolean zMo10670b;
        synchronized (this.f9778g) {
            zMo10670b = this.f9776e != null ? this.f9776e.mo10670b() : this.f9775d.mo5513N();
        }
        return zMo10670b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10671c() {
        boolean z;
        synchronized (this.f9778g) {
            z = this.f9777f;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final cbz m10672d() {
        cbz cbzVar;
        synchronized (this.f9778g) {
            cbzVar = this.f9776e;
        }
        return cbzVar;
    }

    @Override // com.google.android.gms.internal.ccd
    /* JADX INFO: renamed from: e */
    public final InterfaceC1758mv mo10673e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: f */
    public final void mo10674f() {
    }

    @Override // com.google.android.gms.internal.ccd, com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: g */
    public final void mo10675g() {
    }
}
