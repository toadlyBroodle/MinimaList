package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.firebase.messaging.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2321g implements Parcelable.Creator<C2315a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2315a createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        Bundle bundleM12504m = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2315a(bundleM12504m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2315a[] newArray(int i) {
        return new C2315a[i];
    }
}
