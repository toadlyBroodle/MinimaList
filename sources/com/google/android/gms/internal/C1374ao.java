package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1374ao implements Parcelable.Creator<C1372am> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1372am createFromParcel(Parcel parcel) {
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
        return new C1372am(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1372am[] newArray(int i) {
        return new C1372am[i];
    }
}
