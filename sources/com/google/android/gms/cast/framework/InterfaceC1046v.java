package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.C0990d;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.v */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1046v extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.v$a */
    public static abstract class a extends bns implements InterfaceC1046v {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1046v m6536a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1046v ? (InterfaceC1046v) iInterfaceQueryLocalInterface : new C1047w(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6530a(int i);

    /* JADX INFO: renamed from: a */
    void mo6531a(Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo6532a(C0990d c0990d, String str, String str2, boolean z);

    /* JADX INFO: renamed from: a */
    void mo6533a(C1071a c1071a);

    /* JADX INFO: renamed from: a */
    void mo6534a(boolean z, int i);

    /* JADX INFO: renamed from: b */
    void mo6535b(int i);
}
