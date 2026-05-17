package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.an */
/* JADX INFO: loaded from: classes.dex */
public final class C1225an implements Parcelable.Creator<C1224am> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1224am createFromParcel(Parcel parcel) {
        C1071a c1071a = null;
        boolean zM12494c = false;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c2 = false;
        IBinder iBinderM12503l = null;
        int iM12495d = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                case 3:
                    c1071a = (C1071a) C2012wf.m12488a(parcel, i, C1071a.CREATOR);
                    break;
                case 4:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1224am(iM12495d, iBinderM12503l, c1071a, zM12494c2, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1224am[] newArray(int i) {
        return new C1224am[i];
    }
}
