package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1070z implements Parcelable.Creator<C0989c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0989c createFromParcel(Parcel parcel) {
        String strM12502k = null;
        long jM12496e = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k2 = null;
        long jM12496e2 = 0;
        long jM12496e3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    jM12496e3 = C2012wf.m12496e(parcel, i);
                    break;
                case 3:
                    jM12496e2 = C2012wf.m12496e(parcel, i);
                    break;
                case 4:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0989c(jM12496e3, jM12496e2, strM12502k2, strM12502k, jM12496e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0989c[] newArray(int i) {
        return new C0989c[i];
    }
}
