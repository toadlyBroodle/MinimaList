package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bvz implements Parcelable.Creator<bvy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvy createFromParcel(Parcel parcel) {
        long jM12496e = 0;
        Bundle bundleM12504m = null;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        long jM12496e2 = 0;
        String strM12502k4 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 4:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bvy(strM12502k4, jM12496e2, strM12502k3, strM12502k2, strM12502k, bundleM12504m, zM12494c, jM12496e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvy[] newArray(int i) {
        return new bvy[i];
    }
}
