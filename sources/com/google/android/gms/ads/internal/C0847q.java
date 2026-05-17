package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0847q implements Parcelable.Creator<C0846p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0846p createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        float fM12498g = 0.0f;
        boolean zM12494c2 = false;
        int iM12495d = 0;
        boolean zM12494c3 = false;
        boolean zM12494c4 = false;
        boolean zM12494c5 = false;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    zM12494c5 = C2012wf.m12494c(parcel, i);
                    break;
                case 3:
                    zM12494c4 = C2012wf.m12494c(parcel, i);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    fM12498g = C2012wf.m12498g(parcel, i);
                    break;
                case 7:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0846p(zM12494c5, zM12494c4, strM12502k, zM12494c3, fM12498g, iM12495d, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0846p[] newArray(int i) {
        return new C0846p[i];
    }
}
