package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.firebase.auth.af */
/* JADX INFO: loaded from: classes.dex */
public final class C2164af implements Parcelable.Creator<C2201o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2201o createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2201o(strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2201o[] newArray(int i) {
        return new C2201o[i];
    }
}
