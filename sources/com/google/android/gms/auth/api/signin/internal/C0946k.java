package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0946k implements Parcelable.Creator<C0947l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0947l createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        Bundle bundleM12504m = null;
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
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0947l(iM12495d2, iM12495d, bundleM12504m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0947l[] newArray(int i) {
        return new C0947l[i];
    }
}
