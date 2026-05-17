package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.zo */
/* JADX INFO: loaded from: classes.dex */
public final class C2102zo implements Parcelable.Creator<C2100zm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2100zm createFromParcel(Parcel parcel) {
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
        return new C2100zm(bundleM12504m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2100zm[] newArray(int i) {
        return new C2100zm[i];
    }
}
