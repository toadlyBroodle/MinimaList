package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.bb */
/* JADX INFO: loaded from: classes.dex */
public final class C1424bb implements Parcelable.Creator<C1423ba> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1423ba createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1423ba(strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1423ba[] newArray(int i) {
        return new C1423ba[i];
    }
}
