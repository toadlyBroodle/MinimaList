package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.zr */
/* JADX INFO: loaded from: classes.dex */
public final class C2105zr implements Parcelable.Creator<C2104zq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2104zq createFromParcel(Parcel parcel) {
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        long jM12496e = 0;
        C2100zm c2100zm = null;
        String strM12502k2 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    c2100zm = (C2100zm) C2012wf.m12488a(parcel, i, C2100zm.CREATOR);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2104zq(strM12502k2, c2100zm, strM12502k, jM12496e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2104zq[] newArray(int i) {
        return new C2104zq[i];
    }
}
