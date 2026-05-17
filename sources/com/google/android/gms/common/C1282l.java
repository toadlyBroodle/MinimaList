package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1282l implements Parcelable.Creator<C1281k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1281k createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        int iM12495d = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 2:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1281k(strM12502k, iM12495d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1281k[] newArray(int i) {
        return new C1281k[i];
    }
}
