package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C1376aq implements Parcelable.Creator<C1375ap> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1375ap createFromParcel(Parcel parcel) {
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        String strM12502k2 = null;
        PackageInfo packageInfo = null;
        ArrayList<String> arrayListM12510s = null;
        String strM12502k3 = null;
        ApplicationInfo applicationInfo = null;
        C1670jo c1670jo = null;
        Bundle bundleM12504m = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 2:
                    c1670jo = (C1670jo) C2012wf.m12488a(parcel, i, C1670jo.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C2012wf.m12488a(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C2012wf.m12488a(parcel, i, PackageInfo.CREATOR);
                    break;
                case 7:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1375ap(bundleM12504m, c1670jo, applicationInfo, strM12502k3, arrayListM12510s, packageInfo, strM12502k2, zM12494c, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1375ap[] newArray(int i) {
        return new C1375ap[i];
    }
}
