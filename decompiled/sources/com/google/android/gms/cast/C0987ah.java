package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0987ah implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        String strM12502k5 = null;
        int iM12495d = 0;
        ArrayList arrayListM12493c = null;
        int iM12495d2 = 0;
        int iM12495d3 = -1;
        String strM12502k6 = null;
        String strM12502k7 = null;
        int iM12495d4 = 0;
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
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C1072a.CREATOR);
                    break;
                case 9:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 10:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 11:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 12:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 13:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new CastDevice(strM12502k, strM12502k2, strM12502k3, strM12502k4, strM12502k5, iM12495d, arrayListM12493c, iM12495d2, iM12495d3, strM12502k6, strM12502k7, iM12495d4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
