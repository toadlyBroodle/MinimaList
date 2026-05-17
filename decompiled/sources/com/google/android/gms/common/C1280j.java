package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1280j implements Parcelable.Creator<C1071a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1071a createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        PendingIntent pendingIntent = null;
        int iM12495d = 0;
        int iM12495d2 = 0;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C2012wf.m12488a(parcel, i, PendingIntent.CREATOR);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1071a(iM12495d2, iM12495d, pendingIntent, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1071a[] newArray(int i) {
        return new C1071a[i];
    }
}
