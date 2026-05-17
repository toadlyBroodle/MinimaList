package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1222ak;

/* JADX INFO: loaded from: classes.dex */
public final class agc implements Parcelable.Creator<agb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ agb createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        C1222ak c1222ak = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    c1222ak = (C1222ak) C2012wf.m12488a(parcel, i, C1222ak.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new agb(iM12495d, c1222ak);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ agb[] newArray(int i) {
        return new agb[i];
    }
}
