package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import com.google.android.gms.ads.p045b.AbstractC0670g;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cdq extends AbstractC0670g {

    /* JADX INFO: renamed from: a */
    private final cdn f9859a;

    /* JADX INFO: renamed from: c */
    private final cdb f9861c;

    /* JADX INFO: renamed from: e */
    private final AbstractC0666c.a f9863e;

    /* JADX INFO: renamed from: b */
    private final List<AbstractC0666c.b> f9860b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final C0688i f9862d = new C0688i();

    public cdq(cdn cdnVar) {
        cdb cdbVar;
        ccy cdaVar;
        IBinder iBinder;
        ccx ccxVar = null;
        this.f9859a = cdnVar;
        try {
            List listMo10612b = this.f9859a.mo10612b();
            if (listMo10612b != null) {
                for (Object obj : listMo10612b) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        cdaVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        cdaVar = iInterfaceQueryLocalInterface instanceof ccy ? (ccy) iInterfaceQueryLocalInterface : new cda(iBinder);
                    }
                    if (cdaVar != null) {
                        this.f9860b.add(new cdb(cdaVar));
                    }
                }
            }
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get image.", e);
        }
        try {
            ccy ccyVarMo10616d = this.f9859a.mo10616d();
            cdbVar = ccyVarMo10616d != null ? new cdb(ccyVarMo10616d) : null;
        } catch (RemoteException e2) {
            C1668jm.m11611b("Failed to get image.", e2);
            cdbVar = null;
        }
        this.f9861c = cdbVar;
        try {
            if (this.f9859a.mo10630r() != null) {
                ccxVar = new ccx(this.f9859a.mo10630r());
            }
        } catch (RemoteException e3) {
            C1668jm.m11611b("Failed to get attribution info.", e3);
        }
        this.f9863e = ccxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.p045b.AbstractC0666c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0652a mo5343a() {
        try {
            return this.f9859a.mo10622j();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: b */
    public final CharSequence mo5366b() {
        try {
            return this.f9859a.mo10609a();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get headline.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: c */
    public final List<AbstractC0666c.b> mo5367c() {
        return this.f9860b;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: d */
    public final CharSequence mo5368d() {
        try {
            return this.f9859a.mo10614c();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get body.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: e */
    public final AbstractC0666c.b mo5369e() {
        return this.f9861c;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: f */
    public final CharSequence mo5370f() {
        try {
            return this.f9859a.mo10617e();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get call to action.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: g */
    public final Double mo5371g() {
        try {
            double dMo10618f = this.f9859a.mo10618f();
            if (dMo10618f == -1.0d) {
                return null;
            }
            return Double.valueOf(dMo10618f);
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get star rating.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: h */
    public final CharSequence mo5372h() {
        try {
            return this.f9859a.mo10619g();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get store", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: i */
    public final CharSequence mo5373i() {
        try {
            return this.f9859a.mo10620h();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get price.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0670g
    /* JADX INFO: renamed from: j */
    public final C0688i mo5374j() {
        try {
            if (this.f9859a.mo10621i() != null) {
                this.f9862d.m5435a(this.f9859a.mo10621i());
            }
        } catch (RemoteException e) {
            C1668jm.m11611b("Exception occurred while getting video controller", e);
        }
        return this.f9862d;
    }
}
