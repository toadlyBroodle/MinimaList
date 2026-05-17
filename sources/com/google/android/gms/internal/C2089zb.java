package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.zb */
/* JADX INFO: loaded from: classes.dex */
public final class C2089zb implements Parcelable.Creator<C2088za> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2088za createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        String strM12502k = null;
        String strM12502k2 = null;
        aeh aehVar = null;
        long jM12496e = 0;
        boolean zM12494c = false;
        String strM12502k3 = null;
        C2104zq c2104zq = null;
        long jM12496e2 = 0;
        C2104zq c2104zq2 = null;
        long jM12496e3 = 0;
        C2104zq c2104zq3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    aehVar = (aeh) C2012wf.m12488a(parcel, i, aeh.CREATOR);
                    break;
                case 5:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 6:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 7:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    c2104zq = (C2104zq) C2012wf.m12488a(parcel, i, C2104zq.CREATOR);
                    break;
                case 9:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 10:
                    c2104zq2 = (C2104zq) C2012wf.m12488a(parcel, i, C2104zq.CREATOR);
                    break;
                case 11:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 12:
                    c2104zq3 = (C2104zq) C2012wf.m12488a(parcel, i, C2104zq.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2088za(iM12495d, strM12502k, strM12502k2, aehVar, jM12496e, zM12494c, strM12502k3, c2104zq, jM12496e2, c2104zq2, jM12496e3, c2104zq3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2088za[] newArray(int i) {
        return new C2088za[i];
    }
}
