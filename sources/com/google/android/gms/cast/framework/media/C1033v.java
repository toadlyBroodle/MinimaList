package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1033v implements Parcelable.Creator<C1015d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1015d createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        ArrayList<String> arrayListM12510s = null;
        int[] iArrM12506o = null;
        long jM12496e = 0;
        String strM12502k = null;
        int iM12495d = 0;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        int iM12495d4 = 0;
        int iM12495d5 = 0;
        int iM12495d6 = 0;
        int iM12495d7 = 0;
        int iM12495d8 = 0;
        int iM12495d9 = 0;
        int iM12495d10 = 0;
        int iM12495d11 = 0;
        int iM12495d12 = 0;
        int iM12495d13 = 0;
        int iM12495d14 = 0;
        int iM12495d15 = 0;
        int iM12495d16 = 0;
        int iM12495d17 = 0;
        int iM12495d18 = 0;
        int iM12495d19 = 0;
        int iM12495d20 = 0;
        int iM12495d21 = 0;
        int iM12495d22 = 0;
        int iM12495d23 = 0;
        int iM12495d24 = 0;
        int iM12495d25 = 0;
        int iM12495d26 = 0;
        int iM12495d27 = 0;
        IBinder iBinderM12503l = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 3:
                    iArrM12506o = C2012wf.m12506o(parcel, i);
                    break;
                case 4:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 5:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 7:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 9:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 10:
                    iM12495d5 = C2012wf.m12495d(parcel, i);
                    break;
                case 11:
                    iM12495d6 = C2012wf.m12495d(parcel, i);
                    break;
                case 12:
                    iM12495d7 = C2012wf.m12495d(parcel, i);
                    break;
                case 13:
                    iM12495d8 = C2012wf.m12495d(parcel, i);
                    break;
                case 14:
                    iM12495d9 = C2012wf.m12495d(parcel, i);
                    break;
                case 15:
                    iM12495d10 = C2012wf.m12495d(parcel, i);
                    break;
                case 16:
                    iM12495d11 = C2012wf.m12495d(parcel, i);
                    break;
                case 17:
                    iM12495d12 = C2012wf.m12495d(parcel, i);
                    break;
                case 18:
                    iM12495d13 = C2012wf.m12495d(parcel, i);
                    break;
                case 19:
                    iM12495d14 = C2012wf.m12495d(parcel, i);
                    break;
                case 20:
                    iM12495d15 = C2012wf.m12495d(parcel, i);
                    break;
                case 21:
                    iM12495d16 = C2012wf.m12495d(parcel, i);
                    break;
                case 22:
                    iM12495d17 = C2012wf.m12495d(parcel, i);
                    break;
                case 23:
                    iM12495d18 = C2012wf.m12495d(parcel, i);
                    break;
                case 24:
                    iM12495d19 = C2012wf.m12495d(parcel, i);
                    break;
                case 25:
                    iM12495d20 = C2012wf.m12495d(parcel, i);
                    break;
                case 26:
                    iM12495d21 = C2012wf.m12495d(parcel, i);
                    break;
                case 27:
                    iM12495d22 = C2012wf.m12495d(parcel, i);
                    break;
                case 28:
                    iM12495d23 = C2012wf.m12495d(parcel, i);
                    break;
                case 29:
                    iM12495d24 = C2012wf.m12495d(parcel, i);
                    break;
                case 30:
                    iM12495d25 = C2012wf.m12495d(parcel, i);
                    break;
                case 31:
                    iM12495d26 = C2012wf.m12495d(parcel, i);
                    break;
                case 32:
                    iM12495d27 = C2012wf.m12495d(parcel, i);
                    break;
                case 33:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1015d(arrayListM12510s, iArrM12506o, jM12496e, strM12502k, iM12495d, iM12495d2, iM12495d3, iM12495d4, iM12495d5, iM12495d6, iM12495d7, iM12495d8, iM12495d9, iM12495d10, iM12495d11, iM12495d12, iM12495d13, iM12495d14, iM12495d15, iM12495d16, iM12495d17, iM12495d18, iM12495d19, iM12495d20, iM12495d21, iM12495d22, iM12495d23, iM12495d24, iM12495d25, iM12495d26, iM12495d27, iBinderM12503l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1015d[] newArray(int i) {
        return new C1015d[i];
    }
}
