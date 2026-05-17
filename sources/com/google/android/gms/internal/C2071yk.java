package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.yk */
/* JADX INFO: loaded from: classes.dex */
public final class C2071yk implements Parcelable.Creator<C2070yj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2070yj createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        byte[] bArrM12505n = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    bArrM12505n = C2012wf.m12505n(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2070yj(iM12495d, bArrM12505n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2070yj[] newArray(int i) {
        return new C2070yj[i];
    }
}
