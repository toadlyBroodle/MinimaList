package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class cfc implements Parcelable.Creator<cfb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cfb createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        String[] strArrM12508q = null;
        int iM12486a = C2012wf.m12486a(parcel);
        long jM12496e = 0;
        String[] strArrM12508q2 = null;
        byte[] bArrM12505n = null;
        int iM12495d = 0;
        String strM12502k = null;
        boolean zM12494c2 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    bArrM12505n = C2012wf.m12505n(parcel, i);
                    break;
                case 5:
                    strArrM12508q2 = C2012wf.m12508q(parcel, i);
                    break;
                case 6:
                    strArrM12508q = C2012wf.m12508q(parcel, i);
                    break;
                case 7:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 8:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new cfb(zM12494c2, strM12502k, iM12495d, bArrM12505n, strArrM12508q2, strArrM12508q, zM12494c, jM12496e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cfb[] newArray(int i) {
        return new cfb[i];
    }
}
