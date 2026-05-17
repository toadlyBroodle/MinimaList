package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.ab */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0995ab extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.ab$a */
    public static abstract class a extends bns implements InterfaceC0995ab {
        /* JADX INFO: renamed from: a */
        public static InterfaceC0995ab m6347a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0995ab ? (InterfaceC0995ab) iInterfaceQueryLocalInterface : new C0996ac(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0652a mo6341a();

    /* JADX INFO: renamed from: a */
    void mo6342a(int i);

    /* JADX INFO: renamed from: b */
    void mo6343b(int i);

    /* JADX INFO: renamed from: b */
    boolean mo6344b();

    /* JADX INFO: renamed from: c */
    void mo6345c(int i);

    /* JADX INFO: renamed from: c */
    boolean mo6346c();
}
