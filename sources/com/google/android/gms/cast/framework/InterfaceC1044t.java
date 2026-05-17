package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.t */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1044t extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.t$a */
    public static abstract class a extends bns implements InterfaceC1044t {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1044t m6529a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1044t ? (InterfaceC1044t) iInterfaceQueryLocalInterface : new C1045u(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0997ad mo6526a();

    /* JADX INFO: renamed from: b */
    InterfaceC1048x mo6527b();

    /* JADX INFO: renamed from: c */
    InterfaceC0652a mo6528c();
}
