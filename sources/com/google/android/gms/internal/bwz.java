package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bwz implements Parcelable.Creator<bwx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bwx createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        long jM12496e = 0;
        Bundle bundleM12504m = null;
        int iM12495d2 = 0;
        ArrayList<String> arrayListM12510s = null;
        boolean zM12494c = false;
        int iM12495d3 = 0;
        boolean zM12494c2 = false;
        String strM12502k = null;
        bzs bzsVar = null;
        Location location = null;
        String strM12502k2 = null;
        Bundle bundleM12504m2 = null;
        Bundle bundleM12504m3 = null;
        ArrayList<String> arrayListM12510s2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        boolean zM12494c3 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 3:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 4:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 6:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 7:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    bzsVar = (bzs) C2012wf.m12488a(parcel, i, bzs.CREATOR);
                    break;
                case 11:
                    location = (Location) C2012wf.m12488a(parcel, i, Location.CREATOR);
                    break;
                case 12:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 13:
                    bundleM12504m2 = C2012wf.m12504m(parcel, i);
                    break;
                case 14:
                    bundleM12504m3 = C2012wf.m12504m(parcel, i);
                    break;
                case 15:
                    arrayListM12510s2 = C2012wf.m12510s(parcel, i);
                    break;
                case 16:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 17:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 18:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bwx(iM12495d, jM12496e, bundleM12504m, iM12495d2, arrayListM12510s, zM12494c, iM12495d3, zM12494c2, strM12502k, bzsVar, location, strM12502k2, bundleM12504m2, bundleM12504m3, arrayListM12510s2, strM12502k3, strM12502k4, zM12494c3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bwx[] newArray(int i) {
        return new bwx[i];
    }
}
