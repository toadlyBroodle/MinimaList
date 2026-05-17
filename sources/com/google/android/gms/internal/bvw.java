package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bvw implements Parcelable.Creator<bvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvv createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C2012wf.m12488a(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bvv(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvv[] newArray(int i) {
        return new bvv[i];
    }
}
