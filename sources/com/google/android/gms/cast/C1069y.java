package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1069y implements Parcelable.Creator<C1056l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1056l createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 3:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1056l(iM12495d3, iM12495d2, iM12495d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1056l[] newArray(int i) {
        return new C1056l[i];
    }
}
