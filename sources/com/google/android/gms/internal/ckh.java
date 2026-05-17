package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p043a.AbstractC0655d;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.C0656e;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ckh extends AbstractC0655d<ckl> {
    public ckh() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final cki m11065a(Activity activity) {
        cki ckkVar;
        try {
            IBinder iBinderMo11067a = m5331a((Context) activity).mo11067a(BinderC0654c.m5329a(activity));
            if (iBinderMo11067a == null) {
                ckkVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderMo11067a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                ckkVar = iInterfaceQueryLocalInterface instanceof cki ? (cki) iInterfaceQueryLocalInterface : new ckk(iBinderMo11067a);
            }
            return ckkVar;
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not create remote AdOverlay.", e);
            return null;
        } catch (C0656e e2) {
            C1668jm.m11613c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ ckl mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof ckl ? (ckl) iInterfaceQueryLocalInterface : new ckm(iBinder);
    }
}
