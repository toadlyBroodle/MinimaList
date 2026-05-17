package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1061q implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo createFromParcel(Parcel parcel) {
        ArrayList arrayListM12493c = null;
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        long jM12496e = 0;
        ArrayList arrayListM12493c2 = null;
        String strM12502k = null;
        C1055k c1055k = null;
        ArrayList arrayListM12493c3 = null;
        C1052h c1052h = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    c1052h = (C1052h) C2012wf.m12488a(parcel, i, C1052h.CREATOR);
                    break;
                case 6:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 7:
                    arrayListM12493c3 = C2012wf.m12493c(parcel, i, MediaTrack.CREATOR);
                    break;
                case 8:
                    c1055k = (C1055k) C2012wf.m12488a(parcel, i, C1055k.CREATOR);
                    break;
                case 9:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    arrayListM12493c2 = C2012wf.m12493c(parcel, i, C0988b.CREATOR);
                    break;
                case 11:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C0979a.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new MediaInfo(strM12502k3, iM12495d, strM12502k2, c1052h, jM12496e, arrayListM12493c3, c1055k, strM12502k, arrayListM12493c2, arrayListM12493c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i) {
        return new MediaInfo[i];
    }
}
