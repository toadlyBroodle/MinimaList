package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1358ad implements Parcelable.Creator<C1355ab> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1355ab createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        ArrayList<String> arrayListM12510s = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 3:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1355ab(zM12494c, arrayListM12510s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1355ab[] newArray(int i) {
        return new C1355ab[i];
    }
}
