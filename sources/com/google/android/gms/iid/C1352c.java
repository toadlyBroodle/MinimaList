package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.iid.c */
/* JADX INFO: loaded from: classes.dex */
final class C1352c implements Parcelable.Creator<MessengerCompat> {
    C1352c() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MessengerCompat createFromParcel(Parcel parcel) {
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new MessengerCompat(strongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MessengerCompat[] newArray(int i) {
        return new MessengerCompat[i];
    }
}
