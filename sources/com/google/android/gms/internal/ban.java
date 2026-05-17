package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ban implements Parcelable.Creator<bam> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bam createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        ArrayList<String> arrayListM12510s = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new bam(iM12495d, arrayListM12510s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bam[] newArray(int i) {
        return new bam[i];
    }
}
