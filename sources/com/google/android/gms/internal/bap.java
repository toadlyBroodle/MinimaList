package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bap implements Parcelable.Creator<bao> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bao createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        String strM12502k5 = null;
        String strM12502k6 = null;
        String strM12502k7 = null;
        String strM12502k8 = null;
        boolean zM12494c = false;
        boolean zM12494c2 = false;
        String strM12502k9 = null;
        String strM12502k10 = null;
        String strM12502k11 = null;
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
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    strM12502k8 = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 11:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 12:
                    strM12502k9 = C2012wf.m12502k(parcel, i);
                    break;
                case 13:
                    strM12502k10 = C2012wf.m12502k(parcel, i);
                    break;
                case 14:
                    strM12502k11 = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bao(strM12502k, strM12502k2, strM12502k3, strM12502k4, strM12502k5, strM12502k6, strM12502k7, strM12502k8, zM12494c, zM12494c2, strM12502k9, strM12502k10, strM12502k11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bao[] newArray(int i) {
        return new bao[i];
    }
}
