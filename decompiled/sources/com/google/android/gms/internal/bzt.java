package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bzt implements Parcelable.Creator<bzs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzs createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 15:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bzs(strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzs[] newArray(int i) {
        return new bzs[i];
    }
}
