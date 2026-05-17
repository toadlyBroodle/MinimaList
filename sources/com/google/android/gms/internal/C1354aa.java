package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1354aa implements Parcelable.Creator<C2087z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2087z createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        String strM12502k = null;
        String strM12502k2 = null;
        ArrayList<String> arrayListM12510s = null;
        int iM12495d2 = 0;
        ArrayList<String> arrayListM12510s2 = null;
        long jM12496e = 0;
        boolean zM12494c = false;
        long jM12496e2 = 0;
        ArrayList<String> arrayListM12510s3 = null;
        long jM12496e3 = 0;
        int iM12495d3 = 0;
        String strM12502k3 = null;
        long jM12496e4 = 0;
        String strM12502k4 = null;
        boolean zM12494c2 = false;
        String strM12502k5 = null;
        String strM12502k6 = null;
        boolean zM12494c3 = false;
        boolean zM12494c4 = false;
        boolean zM12494c5 = false;
        boolean zM12494c6 = false;
        boolean zM12494c7 = false;
        C1372am c1372am = null;
        String strM12502k7 = null;
        String strM12502k8 = null;
        boolean zM12494c8 = false;
        boolean zM12494c9 = false;
        C1515dv c1515dv = null;
        ArrayList<String> arrayListM12510s4 = null;
        ArrayList<String> arrayListM12510s5 = null;
        boolean zM12494c10 = false;
        C1355ab c1355ab = null;
        boolean zM12494c11 = false;
        String strM12502k9 = null;
        ArrayList<String> arrayListM12510s6 = null;
        boolean zM12494c12 = false;
        String strM12502k10 = null;
        C1524ed c1524ed = null;
        String strM12502k11 = null;
        boolean zM12494c13 = false;
        boolean zM12494c14 = false;
        Bundle bundleM12504m = null;
        boolean zM12494c15 = false;
        int iM12495d4 = 0;
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
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 5:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 6:
                    arrayListM12510s2 = C2012wf.m12510s(parcel, i);
                    break;
                case 7:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 10:
                    arrayListM12510s3 = C2012wf.m12510s(parcel, i);
                    break;
                case 11:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 12:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 13:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 14:
                    jM12496e4 = C2012wf.m12496e(parcel, i);
                    break;
                case 15:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 18:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 19:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 21:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 22:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 23:
                    zM12494c4 = C2012wf.m12494c(parcel, i);
                    break;
                case 24:
                    zM12494c5 = C2012wf.m12494c(parcel, i);
                    break;
                case 25:
                    zM12494c6 = C2012wf.m12494c(parcel, i);
                    break;
                case 26:
                    zM12494c7 = C2012wf.m12494c(parcel, i);
                    break;
                case 28:
                    c1372am = (C1372am) C2012wf.m12488a(parcel, i, C1372am.CREATOR);
                    break;
                case 29:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 30:
                    strM12502k8 = C2012wf.m12502k(parcel, i);
                    break;
                case 31:
                    zM12494c8 = C2012wf.m12494c(parcel, i);
                    break;
                case 32:
                    zM12494c9 = C2012wf.m12494c(parcel, i);
                    break;
                case 33:
                    c1515dv = (C1515dv) C2012wf.m12488a(parcel, i, C1515dv.CREATOR);
                    break;
                case 34:
                    arrayListM12510s4 = C2012wf.m12510s(parcel, i);
                    break;
                case 35:
                    arrayListM12510s5 = C2012wf.m12510s(parcel, i);
                    break;
                case 36:
                    zM12494c10 = C2012wf.m12494c(parcel, i);
                    break;
                case 37:
                    c1355ab = (C1355ab) C2012wf.m12488a(parcel, i, C1355ab.CREATOR);
                    break;
                case 38:
                    zM12494c11 = C2012wf.m12494c(parcel, i);
                    break;
                case 39:
                    strM12502k9 = C2012wf.m12502k(parcel, i);
                    break;
                case 40:
                    arrayListM12510s6 = C2012wf.m12510s(parcel, i);
                    break;
                case 42:
                    zM12494c12 = C2012wf.m12494c(parcel, i);
                    break;
                case 43:
                    strM12502k10 = C2012wf.m12502k(parcel, i);
                    break;
                case 44:
                    c1524ed = (C1524ed) C2012wf.m12488a(parcel, i, C1524ed.CREATOR);
                    break;
                case 45:
                    strM12502k11 = C2012wf.m12502k(parcel, i);
                    break;
                case 46:
                    zM12494c13 = C2012wf.m12494c(parcel, i);
                    break;
                case 47:
                    zM12494c14 = C2012wf.m12494c(parcel, i);
                    break;
                case 48:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 49:
                    zM12494c15 = C2012wf.m12494c(parcel, i);
                    break;
                case 50:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2087z(iM12495d, strM12502k, strM12502k2, arrayListM12510s, iM12495d2, arrayListM12510s2, jM12496e, zM12494c, jM12496e2, arrayListM12510s3, jM12496e3, iM12495d3, strM12502k3, jM12496e4, strM12502k4, zM12494c2, strM12502k5, strM12502k6, zM12494c3, zM12494c4, zM12494c5, zM12494c6, zM12494c7, c1372am, strM12502k7, strM12502k8, zM12494c8, zM12494c9, c1515dv, arrayListM12510s4, arrayListM12510s5, zM12494c10, c1355ab, zM12494c11, strM12502k9, arrayListM12510s6, zM12494c12, strM12502k10, c1524ed, strM12502k11, zM12494c13, zM12494c14, bundleM12504m, zM12494c15, iM12495d4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2087z[] newArray(int i) {
        return new C2087z[i];
    }
}
