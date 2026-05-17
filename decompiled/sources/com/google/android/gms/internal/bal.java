package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bal implements Parcelable.Creator<bak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bak createFromParcel(Parcel parcel) {
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
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
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bak(strM12502k3, strM12502k2, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bak[] newArray(int i) {
        return new bak[i];
    }
}
