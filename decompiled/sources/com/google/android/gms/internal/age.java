package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.C1224am;

/* JADX INFO: loaded from: classes.dex */
public final class age implements Parcelable.Creator<agd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ agd createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        C1071a c1071a = null;
        int iM12495d = 0;
        C1224am c1224am = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    c1071a = (C1071a) C2012wf.m12488a(parcel, i, C1071a.CREATOR);
                    break;
                case 3:
                    c1224am = (C1224am) C2012wf.m12488a(parcel, i, C1224am.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new agd(iM12495d, c1071a, c1224am);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ agd[] newArray(int i) {
        return new agd[i];
    }
}
