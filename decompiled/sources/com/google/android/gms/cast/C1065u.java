package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1065u implements Parcelable.Creator<C1054j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1054j createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        MediaInfo mediaInfo = null;
        long jM12496e = 0;
        int iM12495d = 0;
        double dM12500i = 0.0d;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        long jM12496e2 = 0;
        long jM12496e3 = 0;
        double dM12500i2 = 0.0d;
        boolean zM12494c = false;
        long[] jArrM12507p = null;
        int iM12495d4 = 0;
        int iM12495d5 = 0;
        String strM12502k = null;
        int iM12495d6 = 0;
        ArrayList arrayListM12493c = null;
        boolean zM12494c2 = false;
        C0989c c0989c = null;
        C1056l c1056l = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    mediaInfo = (MediaInfo) C2012wf.m12488a(parcel, i, MediaInfo.CREATOR);
                    break;
                case 3:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 4:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    dM12500i = C2012wf.m12500i(parcel, i);
                    break;
                case 6:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 7:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 9:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 10:
                    dM12500i2 = C2012wf.m12500i(parcel, i);
                    break;
                case 11:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 12:
                    jArrM12507p = C2012wf.m12507p(parcel, i);
                    break;
                case 13:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 14:
                    iM12495d5 = C2012wf.m12495d(parcel, i);
                    break;
                case 15:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 16:
                    iM12495d6 = C2012wf.m12495d(parcel, i);
                    break;
                case 17:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C1053i.CREATOR);
                    break;
                case 18:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 19:
                    c0989c = (C0989c) C2012wf.m12488a(parcel, i, C0989c.CREATOR);
                    break;
                case 20:
                    c1056l = (C1056l) C2012wf.m12488a(parcel, i, C1056l.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1054j(mediaInfo, jM12496e, iM12495d, dM12500i, iM12495d2, iM12495d3, jM12496e2, jM12496e3, dM12500i2, zM12494c, jArrM12507p, iM12495d4, iM12495d5, strM12502k, iM12495d6, arrayListM12493c, zM12494c2, c0989c, c1056l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1054j[] newArray(int i) {
        return new C1054j[i];
    }
}
