package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class afu implements Parcelable.Creator<aft> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aft createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        Intent intent = null;
        int iM12495d2 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 3:
                    intent = (Intent) C2012wf.m12488a(parcel, i, Intent.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new aft(iM12495d2, iM12495d, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aft[] newArray(int i) {
        return new aft[i];
    }
}
