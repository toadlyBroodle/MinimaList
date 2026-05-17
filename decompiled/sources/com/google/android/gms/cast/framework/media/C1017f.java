package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1017f implements Parcelable.Creator<C1012a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1012a createFromParcel(Parcel parcel) {
        C1015d c1015d = null;
        int iM12486a = C2012wf.m12486a(parcel);
        IBinder iBinderM12503l = null;
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
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                case 5:
                    c1015d = (C1015d) C2012wf.m12488a(parcel, i, C1015d.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1012a(strM12502k2, strM12502k, iBinderM12503l, c1015d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1012a[] newArray(int i) {
        return new C1012a[i];
    }
}
