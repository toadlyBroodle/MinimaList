package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ty */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1950ty extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ty$a */
    public static abstract class a extends bns implements InterfaceC1950ty {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1950ty m12350a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1950ty ? (InterfaceC1950ty) iInterfaceQueryLocalInterface : new C1951tz(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: a */
    Bitmap mo12349a(Uri uri);
}
