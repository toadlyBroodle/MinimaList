package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bad implements Parcelable.Creator<bac> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bac createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        boolean zM12494c = false;
        String strM12502k3 = null;
        String strM12502k4 = null;
        bai baiVar = null;
        String strM12502k5 = null;
        String strM12502k6 = null;
        long jM12496e = 0;
        long jM12496e2 = 0;
        boolean zM12494c2 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    baiVar = (bai) C2012wf.m12488a(parcel, i, bai.CREATOR);
                    break;
                case 8:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 11:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 12:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bac(strM12502k, strM12502k2, zM12494c, strM12502k3, strM12502k4, baiVar, strM12502k5, strM12502k6, jM12496e, jM12496e2, zM12494c2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bac[] newArray(int i) {
        return new bac[i];
    }
}
