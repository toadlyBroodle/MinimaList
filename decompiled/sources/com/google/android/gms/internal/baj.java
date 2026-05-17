package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class baj implements Parcelable.Creator<bai> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bai createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        ArrayList arrayListM12493c = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, bag.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bai(arrayListM12493c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bai[] newArray(int i) {
        return new bai[i];
    }
}
