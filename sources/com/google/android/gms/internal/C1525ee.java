package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1525ee implements Parcelable.Creator<C1524ed> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1524ed createFromParcel(Parcel parcel) {
        ArrayList<String> arrayListM12510s = null;
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c2 = false;
        boolean zM12494c3 = false;
        boolean zM12494c4 = false;
        String strM12502k = null;
        String strM12502k2 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    zM12494c4 = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 7:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1524ed(strM12502k2, strM12502k, zM12494c4, zM12494c3, arrayListM12510s, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1524ed[] newArray(int i) {
        return new C1524ed[i];
    }
}
