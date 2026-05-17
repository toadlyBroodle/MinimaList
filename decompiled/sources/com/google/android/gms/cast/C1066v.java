package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1066v implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        long jM12496e = 0;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        String strM12502k5 = null;
        int iM12495d2 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 3:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    iM12495d = C2012wf.m12495d(parcel, i);
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
        return new MediaTrack(jM12496e, iM12495d2, strM12502k5, strM12502k4, strM12502k3, strM12502k2, iM12495d, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i) {
        return new MediaTrack[i];
    }
}
