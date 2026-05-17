package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.C0990d;

/* JADX INFO: renamed from: com.google.android.gms.internal.vd */
/* JADX INFO: loaded from: classes.dex */
public final class C1983vd implements Parcelable.Creator<C1982vc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1982vc createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        double dM12500i = 0.0d;
        C0990d c0990d = null;
        int iM12495d2 = 0;
        boolean zM12494c = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    dM12500i = C2012wf.m12500i(parcel, i);
                    break;
                case 3:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 4:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    c0990d = (C0990d) C2012wf.m12488a(parcel, i, C0990d.CREATOR);
                    break;
                case 6:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1982vc(dM12500i, zM12494c, iM12495d2, c0990d, iM12495d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1982vc[] newArray(int i) {
        return new C1982vc[i];
    }
}
