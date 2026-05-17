package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1067w implements Parcelable.Creator<C0988b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0988b createFromParcel(Parcel parcel) {
        long jM12496e = 0;
        String[] strArrM12508q = null;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        String strM12502k = null;
        long jM12496e2 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 3:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 5:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    strArrM12508q = C2012wf.m12508q(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0988b(jM12496e2, strM12502k, jM12496e, zM12494c, strArrM12508q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0988b[] newArray(int i) {
        return new C0988b[i];
    }
}
