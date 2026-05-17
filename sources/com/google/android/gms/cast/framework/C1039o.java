package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.cast.framework.media.C1012a;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1039o implements Parcelable.Creator<C1000b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1000b createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        C1012a c1012a = null;
        int iM12486a = C2012wf.m12486a(parcel);
        double dM12500i = 0.0d;
        boolean zM12494c2 = false;
        C1051g c1051g = null;
        boolean zM12494c3 = false;
        ArrayList<String> arrayListM12510s = null;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 4:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    c1051g = (C1051g) C2012wf.m12488a(parcel, i, C1051g.CREATOR);
                    break;
                case 6:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 7:
                    c1012a = (C1012a) C2012wf.m12488a(parcel, i, C1012a.CREATOR);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    dM12500i = C2012wf.m12500i(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1000b(strM12502k, arrayListM12510s, zM12494c3, c1051g, zM12494c2, c1012a, zM12494c, dM12500i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1000b[] newArray(int i) {
        return new C1000b[i];
    }
}
