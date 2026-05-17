package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1064t implements Parcelable.Creator<C1053i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1053i createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        String strM12502k = null;
        double dM12500i = 0.0d;
        int iM12486a = C2012wf.m12486a(parcel);
        long[] jArrM12507p = null;
        double dM12500i2 = 0.0d;
        double dM12500i3 = 0.0d;
        int iM12495d = 0;
        MediaInfo mediaInfo = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    mediaInfo = (MediaInfo) C2012wf.m12488a(parcel, i, MediaInfo.CREATOR);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    dM12500i3 = C2012wf.m12500i(parcel, i);
                    break;
                case 6:
                    dM12500i2 = C2012wf.m12500i(parcel, i);
                    break;
                case 7:
                    dM12500i = C2012wf.m12500i(parcel, i);
                    break;
                case 8:
                    jArrM12507p = C2012wf.m12507p(parcel, i);
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
        return new C1053i(mediaInfo, iM12495d, zM12494c, dM12500i3, dM12500i2, dM12500i, jArrM12507p, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1053i[] newArray(int i) {
        return new C1053i[i];
    }
}
