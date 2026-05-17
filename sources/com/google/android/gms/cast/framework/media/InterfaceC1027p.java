package com.google.android.gms.cast.framework.media;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.p */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1027p extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.p$a */
    public static abstract class a extends bns implements InterfaceC1027p {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1027p m6518a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IMediaNotificationService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1027p ? (InterfaceC1027p) iInterfaceQueryLocalInterface : new C1028q(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    int mo6514a(Intent intent, int i, int i2);

    /* JADX INFO: renamed from: a */
    IBinder mo6515a(Intent intent);

    /* JADX INFO: renamed from: a */
    void mo6516a();

    /* JADX INFO: renamed from: b */
    void mo6517b();
}
