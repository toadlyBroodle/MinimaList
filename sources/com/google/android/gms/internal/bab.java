package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bab implements Parcelable.Creator<baa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ baa createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        bam bamVar = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        boolean zM12494c2 = false;
        String strM12502k2 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    bamVar = (bam) C2012wf.m12488a(parcel, i, bam.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new baa(strM12502k2, zM12494c2, strM12502k, zM12494c, bamVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ baa[] newArray(int i) {
        return new baa[i];
    }
}
