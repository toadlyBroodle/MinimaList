package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.yy */
/* JADX INFO: loaded from: classes.dex */
public final class C2085yy implements Parcelable.Creator<C2084yx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2084yx createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        long jM12496e = 0;
        long jM12496e2 = 0;
        String strM12502k5 = null;
        boolean zM12494c = true;
        boolean zM12494c2 = false;
        long jM12496e3 = -2147483648L;
        String strM12502k6 = null;
        long jM12496e4 = 0;
        long jM12496e5 = 0;
        int iM12495d = 0;
        boolean zM12494c3 = true;
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
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 7:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 8:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 10:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 11:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 12:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 13:
                    jM12496e4 = C2012wf.m12496e(parcel, i);
                    break;
                case 14:
                    jM12496e5 = C2012wf.m12496e(parcel, i);
                    break;
                case 15:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 16:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2084yx(strM12502k, strM12502k2, strM12502k3, strM12502k4, jM12496e, jM12496e2, strM12502k5, zM12494c, zM12494c2, jM12496e3, strM12502k6, jM12496e4, jM12496e5, iM12495d, zM12494c3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2084yx[] newArray(int i) {
        return new C2084yx[i];
    }
}
