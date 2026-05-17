package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.z */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1050z extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.z$a */
    public static abstract class a extends bns implements InterfaceC1050z {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1050z m6538a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1050z ? (InterfaceC1050z) iInterfaceQueryLocalInterface : new C0994aa(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    int mo6337a(Intent intent, int i, int i2);

    /* JADX INFO: renamed from: a */
    IBinder mo6338a(Intent intent);

    /* JADX INFO: renamed from: a */
    void mo6339a();

    /* JADX INFO: renamed from: b */
    void mo6340b();
}
