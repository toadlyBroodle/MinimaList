package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.tz */
/* JADX INFO: loaded from: classes.dex */
public final class C1951tz extends bnr implements InterfaceC1950ty {
    C1951tz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // com.google.android.gms.internal.InterfaceC1950ty
    /* JADX INFO: renamed from: a */
    public final Bitmap mo12349a(Uri uri) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, uri);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        Bitmap bitmap = (Bitmap) bnt.m9734a(parcelM9730a, Bitmap.CREATOR);
        parcelM9730a.recycle();
        return bitmap;
    }
}
