package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0827b implements Parcelable.Creator<C0828c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0828c createFromParcel(Parcel parcel) {
        Intent intent = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        String strM12502k5 = null;
        String strM12502k6 = null;
        String strM12502k7 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    intent = (Intent) C2012wf.m12488a(parcel, i, Intent.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0828c(strM12502k7, strM12502k6, strM12502k5, strM12502k4, strM12502k3, strM12502k2, strM12502k, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0828c[] newArray(int i) {
        return new C0828c[i];
    }
}
