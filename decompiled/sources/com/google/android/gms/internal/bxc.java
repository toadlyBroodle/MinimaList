package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bxc implements Parcelable.Creator<bxb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bxb createFromParcel(Parcel parcel) {
        bxb[] bxbVarArr = null;
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c2 = false;
        boolean zM12494c3 = false;
        int iM12495d = 0;
        int iM12495d2 = 0;
        boolean zM12494c4 = false;
        int iM12495d3 = 0;
        int iM12495d4 = 0;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    zM12494c4 = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 7:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    bxbVarArr = (bxb[]) C2012wf.m12492b(parcel, i, bxb.CREATOR);
                    break;
                case 9:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 10:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 11:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bxb(strM12502k, iM12495d4, iM12495d3, zM12494c4, iM12495d2, iM12495d, bxbVarArr, zM12494c3, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bxb[] newArray(int i) {
        return new bxb[i];
    }
}
