package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class cfa implements Parcelable.Creator<cez> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cez createFromParcel(Parcel parcel) {
        String[] strArrM12508q = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String[] strArrM12508q2 = null;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 2:
                    strArrM12508q2 = C2012wf.m12508q(parcel, i);
                    break;
                case 3:
                    strArrM12508q = C2012wf.m12508q(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new cez(strM12502k, strArrM12508q2, strArrM12508q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cez[] newArray(int i) {
        return new cez[i];
    }
}
