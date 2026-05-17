package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.db */
/* JADX INFO: loaded from: classes.dex */
public final class C1495db implements Parcelable.Creator<C1494da> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1494da createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        bwx bwxVar = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    bwxVar = (bwx) C2012wf.m12488a(parcel, i, bwx.CREATOR);
                    break;
                case 3:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1494da(bwxVar, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1494da[] newArray(int i) {
        return new C1494da[i];
    }
}
