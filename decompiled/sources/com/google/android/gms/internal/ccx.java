package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ccx extends AbstractC0666c.a {

    /* JADX INFO: renamed from: a */
    private final ccu f9852a;

    /* JADX INFO: renamed from: b */
    private final List<AbstractC0666c.b> f9853b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private String f9854c;

    public ccx(ccu ccuVar) {
        ccy cdaVar;
        IBinder iBinder;
        this.f9852a = ccuVar;
        try {
            this.f9854c = this.f9852a.mo10595a();
        } catch (RemoteException e) {
            C1668jm.m11611b("Error while obtaining attribution text.", e);
            this.f9854c = "";
        }
        try {
            for (ccy ccyVar : ccuVar.mo10596b()) {
                if (!(ccyVar instanceof IBinder) || (iBinder = (IBinder) ccyVar) == null) {
                    cdaVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    cdaVar = iInterfaceQueryLocalInterface instanceof ccy ? (ccy) iInterfaceQueryLocalInterface : new cda(iBinder);
                }
                if (cdaVar != null) {
                    this.f9853b.add(new cdb(cdaVar));
                }
            }
        } catch (RemoteException e2) {
            C1668jm.m11611b("Error while obtaining image.", e2);
        }
    }
}
