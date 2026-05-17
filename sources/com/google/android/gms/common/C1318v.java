package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1318v implements Parcelable.Creator<C1296u> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1296u createFromParcel(Parcel parcel) {
        IBinder iBinderM12503l = null;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 2:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                case 3:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1296u(strM12502k, iBinderM12503l, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1296u[] newArray(int i) {
        return new C1296u[i];
    }
}
