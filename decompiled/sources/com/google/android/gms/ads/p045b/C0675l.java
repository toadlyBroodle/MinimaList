package com.google.android.gms.ads.p045b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.ads.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0675l implements Parcelable.Creator<C0673j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0673j createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
        IBinder iBinderM12503l = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 2:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0673j(zM12494c, iBinderM12503l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0673j[] newArray(int i) {
        return new C0673j[i];
    }
}
