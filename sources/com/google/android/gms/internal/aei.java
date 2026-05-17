package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class aei implements Parcelable.Creator<aeh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aeh createFromParcel(Parcel parcel) {
        Double dM12501j = null;
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        long jM12496e = 0;
        String strM12502k = null;
        String strM12502k2 = null;
        Float fM12499h = null;
        Long lM12497f = null;
        String strM12502k3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 4:
                    lM12497f = C2012wf.m12497f(parcel, i);
                    break;
                case 5:
                    fM12499h = C2012wf.m12499h(parcel, i);
                    break;
                case 6:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    dM12501j = C2012wf.m12501j(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new aeh(iM12495d, strM12502k3, jM12496e, lM12497f, fM12499h, strM12502k2, strM12502k, dM12501j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aeh[] newArray(int i) {
        return new aeh[i];
    }
}
