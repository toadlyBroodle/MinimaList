package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1060p implements Parcelable.Creator<C1051g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1051g createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 3:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1051g(zM12494c, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1051g[] newArray(int i) {
        return new C1051g[i];
    }
}
