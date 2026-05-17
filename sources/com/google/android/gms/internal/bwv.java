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
public final class bwv extends AbstractC0655d<byb> {
    public bwv() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final bxy m10371a(Context context, String str, cii ciiVar) {
        bxy byaVar;
        try {
            IBinder iBinderMo10414a = m5331a(context).mo10414a(BinderC0654c.m5329a(context), str, ciiVar, 11910000);
            if (iBinderMo10414a == null) {
                byaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderMo10414a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                byaVar = iInterfaceQueryLocalInterface instanceof bxy ? (bxy) iInterfaceQueryLocalInterface : new bya(iBinderMo10414a);
            }
            return byaVar;
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (C0656e e2) {
            C1668jm.m11613c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ byb mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof byb ? (byb) iInterfaceQueryLocalInterface : new byc(iBinder);
    }
}
