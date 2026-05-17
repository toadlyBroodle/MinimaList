package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.common.stats.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1293d implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        long jM12496e = 0;
        int iM12495d2 = 0;
        String strM12502k = null;
        int iM12495d3 = 0;
        ArrayList<String> arrayListM12510s = null;
        String strM12502k2 = null;
        long jM12496e2 = 0;
        int iM12495d4 = 0;
        String strM12502k3 = null;
        String strM12502k4 = null;
        float fM12498g = 0.0f;
        long jM12496e3 = 0;
        String strM12502k5 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 6:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 8:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 10:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 11:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 12:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 13:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 14:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 15:
                    fM12498g = C2012wf.m12498g(parcel, i);
                    break;
                case 16:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 17:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new WakeLockEvent(iM12495d, jM12496e, iM12495d2, strM12502k, iM12495d3, arrayListM12510s, strM12502k2, jM12496e2, iM12495d4, strM12502k3, strM12502k4, fM12498g, jM12496e3, strM12502k5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
