package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2033x implements Parcelable.Creator<C1979v> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1979v createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        Bundle bundleM12504m = null;
        bwx bwxVar = null;
        bxb bxbVar = null;
        String strM12502k = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        C1670jo c1670jo = null;
        Bundle bundleM12504m2 = null;
        int iM12495d2 = 0;
        ArrayList<String> arrayListM12510s = null;
        Bundle bundleM12504m3 = null;
        boolean zM12494c = false;
        int iM12495d3 = 0;
        int iM12495d4 = 0;
        float fM12498g = 0.0f;
        String strM12502k5 = null;
        long jM12496e = 0;
        String strM12502k6 = null;
        ArrayList<String> arrayListM12510s2 = null;
        String strM12502k7 = null;
        ccm ccmVar = null;
        ArrayList<String> arrayListM12510s3 = null;
        long jM12496e2 = 0;
        String strM12502k8 = null;
        float fM12498g2 = 0.0f;
        boolean zM12494c2 = false;
        int iM12495d5 = 0;
        int iM12495d6 = 0;
        boolean zM12494c3 = false;
        boolean zM12494c4 = false;
        String strM12502k9 = null;
        String strM12502k10 = null;
        boolean zM12494c5 = false;
        int iM12495d7 = 0;
        Bundle bundleM12504m4 = null;
        String strM12502k11 = null;
        bzd bzdVar = null;
        boolean zM12494c6 = false;
        Bundle bundleM12504m5 = null;
        String strM12502k12 = null;
        String strM12502k13 = null;
        String strM12502k14 = null;
        boolean zM12494c7 = false;
        ArrayList<Integer> arrayListM12509r = null;
        String strM12502k15 = null;
        ArrayList<String> arrayListM12510s4 = null;
        int iM12495d8 = 0;
        boolean zM12494c8 = false;
        boolean zM12494c9 = false;
        boolean zM12494c10 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 3:
                    bwxVar = (bwx) C2012wf.m12488a(parcel, i, bwx.CREATOR);
                    break;
                case 4:
                    bxbVar = (bxb) C2012wf.m12488a(parcel, i, bxb.CREATOR);
                    break;
                case 5:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C2012wf.m12488a(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C2012wf.m12488a(parcel, i, PackageInfo.CREATOR);
                    break;
                case 8:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 11:
                    c1670jo = (C1670jo) C2012wf.m12488a(parcel, i, C1670jo.CREATOR);
                    break;
                case 12:
                    bundleM12504m2 = C2012wf.m12504m(parcel, i);
                    break;
                case 13:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 14:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 15:
                    bundleM12504m3 = C2012wf.m12504m(parcel, i);
                    break;
                case 16:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 18:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 19:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 20:
                    fM12498g = C2012wf.m12498g(parcel, i);
                    break;
                case 21:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 25:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 26:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 27:
                    arrayListM12510s2 = C2012wf.m12510s(parcel, i);
                    break;
                case 28:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 29:
                    ccmVar = (ccm) C2012wf.m12488a(parcel, i, ccm.CREATOR);
                    break;
                case 30:
                    arrayListM12510s3 = C2012wf.m12510s(parcel, i);
                    break;
                case 31:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 33:
                    strM12502k8 = C2012wf.m12502k(parcel, i);
                    break;
                case 34:
                    fM12498g2 = C2012wf.m12498g(parcel, i);
                    break;
                case 35:
                    iM12495d5 = C2012wf.m12495d(parcel, i);
                    break;
                case 36:
                    iM12495d6 = C2012wf.m12495d(parcel, i);
                    break;
                case 37:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 38:
                    zM12494c4 = C2012wf.m12494c(parcel, i);
                    break;
                case 39:
                    strM12502k9 = C2012wf.m12502k(parcel, i);
                    break;
                case 40:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 41:
                    strM12502k10 = C2012wf.m12502k(parcel, i);
                    break;
                case 42:
                    zM12494c5 = C2012wf.m12494c(parcel, i);
                    break;
                case 43:
                    iM12495d7 = C2012wf.m12495d(parcel, i);
                    break;
                case 44:
                    bundleM12504m4 = C2012wf.m12504m(parcel, i);
                    break;
                case 45:
                    strM12502k11 = C2012wf.m12502k(parcel, i);
                    break;
                case 46:
                    bzdVar = (bzd) C2012wf.m12488a(parcel, i, bzd.CREATOR);
                    break;
                case 47:
                    zM12494c6 = C2012wf.m12494c(parcel, i);
                    break;
                case 48:
                    bundleM12504m5 = C2012wf.m12504m(parcel, i);
                    break;
                case 49:
                    strM12502k12 = C2012wf.m12502k(parcel, i);
                    break;
                case 50:
                    strM12502k13 = C2012wf.m12502k(parcel, i);
                    break;
                case 51:
                    strM12502k14 = C2012wf.m12502k(parcel, i);
                    break;
                case 52:
                    zM12494c7 = C2012wf.m12494c(parcel, i);
                    break;
                case 53:
                    arrayListM12509r = C2012wf.m12509r(parcel, i);
                    break;
                case 54:
                    strM12502k15 = C2012wf.m12502k(parcel, i);
                    break;
                case 55:
                    arrayListM12510s4 = C2012wf.m12510s(parcel, i);
                    break;
                case 56:
                    iM12495d8 = C2012wf.m12495d(parcel, i);
                    break;
                case 57:
                    zM12494c8 = C2012wf.m12494c(parcel, i);
                    break;
                case 58:
                    zM12494c9 = C2012wf.m12494c(parcel, i);
                    break;
                case 59:
                    zM12494c10 = C2012wf.m12494c(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1979v(iM12495d, bundleM12504m, bwxVar, bxbVar, strM12502k, applicationInfo, packageInfo, strM12502k2, strM12502k3, strM12502k4, c1670jo, bundleM12504m2, iM12495d2, arrayListM12510s, bundleM12504m3, zM12494c, iM12495d3, iM12495d4, fM12498g, strM12502k5, jM12496e, strM12502k6, arrayListM12510s2, strM12502k7, ccmVar, arrayListM12510s3, jM12496e2, strM12502k8, fM12498g2, zM12494c2, iM12495d5, iM12495d6, zM12494c3, zM12494c4, strM12502k9, strM12502k10, zM12494c5, iM12495d7, bundleM12504m4, strM12502k11, bzdVar, zM12494c6, bundleM12504m5, strM12502k12, strM12502k13, strM12502k14, zM12494c7, arrayListM12509r, strM12502k15, arrayListM12510s4, iM12495d8, zM12494c8, zM12494c9, zM12494c10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1979v[] newArray(int i) {
        return new C1979v[i];
    }
}
