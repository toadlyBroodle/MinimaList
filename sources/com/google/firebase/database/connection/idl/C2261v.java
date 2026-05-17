package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2261v implements Parcelable.Creator<C2260u> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2260u createFromParcel(Parcel parcel) {
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        boolean zM12494c = false;
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
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2260u(strM12502k2, strM12502k, zM12494c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2260u[] newArray(int i) {
        return new C2260u[i];
    }
}
