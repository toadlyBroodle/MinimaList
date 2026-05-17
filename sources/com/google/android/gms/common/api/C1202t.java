package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.api.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1202t implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        int iM12495d2 = 0;
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C2012wf.m12488a(parcel, i, PendingIntent.CREATOR);
                    break;
                case 1000:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new Status(iM12495d2, iM12495d, strM12502k, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
