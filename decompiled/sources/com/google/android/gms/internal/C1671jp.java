package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.jp */
/* JADX INFO: loaded from: classes.dex */
public final class C1671jp implements Parcelable.Creator<C1670jo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1670jo createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        boolean zM12494c2 = false;
        int iM12495d = 0;
        int iM12495d2 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1670jo(strM12502k, iM12495d2, iM12495d, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1670jo[] newArray(int i) {
        return new C1670jo[i];
    }
}
