package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class baf implements Parcelable.Creator<bae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bae createFromParcel(Parcel parcel) {
        Long lM12497f = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        Long lM12497f2 = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    lM12497f2 = C2012wf.m12497f(parcel, i);
                    break;
                case 5:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    lM12497f = C2012wf.m12497f(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bae(strM12502k3, strM12502k2, lM12497f2, strM12502k, lM12497f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bae[] newArray(int i) {
        return new bae[i];
    }
}
