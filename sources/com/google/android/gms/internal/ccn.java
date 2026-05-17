package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ccn implements Parcelable.Creator<ccm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ccm createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        bzw bzwVar = null;
        boolean zM12494c = false;
        int iM12495d2 = 0;
        boolean zM12494c2 = false;
        int iM12495d3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 3:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 6:
                    bzwVar = (bzw) C2012wf.m12488a(parcel, i, bzw.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new ccm(iM12495d3, zM12494c2, iM12495d2, zM12494c, iM12495d, bzwVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ccm[] newArray(int i) {
        return new ccm[i];
    }
}
