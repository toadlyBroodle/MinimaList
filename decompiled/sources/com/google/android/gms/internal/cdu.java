package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import com.google.android.gms.ads.p045b.AbstractC0671h;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cdu extends AbstractC0671h {

    /* JADX INFO: renamed from: a */
    private final cdr f9864a;

    /* JADX INFO: renamed from: c */
    private final cdb f9866c;

    /* JADX INFO: renamed from: e */
    private final AbstractC0666c.a f9868e;

    /* JADX INFO: renamed from: b */
    private final List<AbstractC0666c.b> f9865b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final C0688i f9867d = new C0688i();

    public cdu(cdr cdrVar) {
        cdb cdbVar;
        ccy cdaVar;
        IBinder iBinder;
        ccx ccxVar = null;
        this.f9864a = cdrVar;
        try {
            List listMo10612b = this.f9864a.mo10612b();
            if (listMo10612b != null) {
                for (Object obj : listMo10612b) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        cdaVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        cdaVar = iInterfaceQueryLocalInterface instanceof ccy ? (ccy) iInterfaceQueryLocalInterface : new cda(iBinder);
                    }
                    if (cdaVar != null) {
                        this.f9865b.add(new cdb(cdaVar));
                    }
                }
            }
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get image.", e);
        }
        try {
            ccy ccyVarMo10641f = this.f9864a.mo10641f();
            cdbVar = ccyVarMo10641f != null ? new cdb(ccyVarMo10641f) : null;
        } catch (RemoteException e2) {
            C1668jm.m11611b("Failed to get image.", e2);
            cdbVar = null;
        }
        this.f9866c = cdbVar;
        try {
            if (this.f9864a.mo10647p() != null) {
                ccxVar = new ccx(this.f9864a.mo10647p());
            }
        } catch (RemoteException e3) {
            C1668jm.m11611b("Failed to get attribution info.", e3);
        }
        this.f9868e = ccxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.p045b.AbstractC0666c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0652a mo5343a() {
        try {
            return this.f9864a.mo10645j();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: b */
    public final CharSequence mo5375b() {
        try {
            return this.f9864a.mo10634a();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get headline.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: c */
    public final List<AbstractC0666c.b> mo5376c() {
        return this.f9865b;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: d */
    public final CharSequence mo5377d() {
        try {
            return this.f9864a.mo10640e();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get body.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: e */
    public final AbstractC0666c.b mo5378e() {
        return this.f9866c;
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: f */
    public final CharSequence mo5379f() {
        try {
            return this.f9864a.mo10642g();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get call to action.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: g */
    public final CharSequence mo5380g() {
        try {
            return this.f9864a.mo10643h();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get attribution.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p045b.AbstractC0671h
    /* JADX INFO: renamed from: h */
    public final C0688i mo5381h() {
        try {
            if (this.f9864a.mo10644i() != null) {
                this.f9867d.m5435a(this.f9864a.mo10644i());
            }
        } catch (RemoteException e) {
            C1668jm.m11611b("Exception occurred while getting video controller", e);
        }
        return this.f9867d;
    }
}
