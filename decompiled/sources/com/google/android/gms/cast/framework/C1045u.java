package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1045u extends bnr implements InterfaceC1044t {
    C1045u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1044t
    /* JADX INFO: renamed from: a */
    public final InterfaceC0997ad mo6526a() {
        InterfaceC0997ad c0998ae;
        Parcel parcelM9730a = m9730a(5, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            c0998ae = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            c0998ae = iInterfaceQueryLocalInterface instanceof InterfaceC0997ad ? (InterfaceC0997ad) iInterfaceQueryLocalInterface : new C0998ae(strongBinder);
        }
        parcelM9730a.recycle();
        return c0998ae;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1044t
    /* JADX INFO: renamed from: b */
    public final InterfaceC1048x mo6527b() {
        InterfaceC1048x c1049y;
        Parcel parcelM9730a = m9730a(6, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            c1049y = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            c1049y = iInterfaceQueryLocalInterface instanceof InterfaceC1048x ? (InterfaceC1048x) iInterfaceQueryLocalInterface : new C1049y(strongBinder);
        }
        parcelM9730a.recycle();
        return c1049y;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1044t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0652a mo6528c() {
        Parcel parcelM9730a = m9730a(10, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
