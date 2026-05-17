package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bzx implements Parcelable.Creator<bzw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzw createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c2 = false;
        boolean zM12494c3 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 3:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 4:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bzw(zM12494c3, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bzw[] newArray(int i) {
        return new bzw[i];
    }
}
