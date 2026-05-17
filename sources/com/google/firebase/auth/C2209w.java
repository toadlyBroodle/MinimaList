package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import com.google.firebase.auth.C2205s;

/* JADX INFO: renamed from: com.google.firebase.auth.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2209w implements Parcelable.Creator<C2205s.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2205s.a createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        while (parcel.dataPosition() < iM12486a) {
            C2012wf.m12491b(parcel, parcel.readInt());
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2205s.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2205s.a[] newArray(int i) {
        return new C2205s.a[i];
    }
}
