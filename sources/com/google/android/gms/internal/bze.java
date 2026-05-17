package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bze implements Parcelable.Creator<bzd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzd createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bzd(iM12495d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzd[] newArray(int i) {
        return new bzd[i];
    }
}
