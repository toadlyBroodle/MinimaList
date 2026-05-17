package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p043a.AbstractC0655d;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.C0656e;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bww extends AbstractC0655d<byg> {
    public bww() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final byd m10372a(Context context, bxb bxbVar, String str, cii ciiVar, int i) {
        byd byfVar;
        try {
            IBinder iBinderMo10416a = m5331a(context).mo10416a(BinderC0654c.m5329a(context), bxbVar, str, ciiVar, 11910000, i);
            if (iBinderMo10416a == null) {
                byfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderMo10416a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                byfVar = iInterfaceQueryLocalInterface instanceof byd ? (byd) iInterfaceQueryLocalInterface : new byf(iBinderMo10416a);
            }
            return byfVar;
        } catch (RemoteException | C0656e e) {
            C1668jm.m11608a("Could not create remote AdManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ byg mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof byg ? (byg) iInterfaceQueryLocalInterface : new byh(iBinder);
    }
}
