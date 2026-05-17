package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.firebase.auth.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C2166ah implements Parcelable.Creator<C2204r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2204r createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k2 = null;
        boolean zM12494c2 = false;
        String strM12502k3 = null;
        String strM12502k4 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 2:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 4:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2204r(strM12502k4, strM12502k3, zM12494c2, strM12502k2, zM12494c, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2204r[] newArray(int i) {
        return new C2204r[i];
    }
}
