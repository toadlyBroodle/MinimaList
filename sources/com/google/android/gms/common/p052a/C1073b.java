package com.google.android.gms.common.p052a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1073b implements Parcelable.Creator<C1072a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1072a createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        Uri uri = null;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    uri = (Uri) C2012wf.m12488a(parcel, i, Uri.CREATOR);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1072a(iM12495d2, uri, iM12495d, iM12495d3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1072a[] newArray(int i) {
        return new C1072a[i];
    }
}
