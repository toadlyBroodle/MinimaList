package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2253n implements Parcelable.Creator<C2228a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2228a createFromParcel(Parcel parcel) {
        ArrayList<String> arrayListM12510s = null;
        int iM12486a = C2012wf.m12486a(parcel);
        ArrayList<String> arrayListM12510s2 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    arrayListM12510s2 = C2012wf.m12510s(parcel, i);
                    break;
                case 3:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2228a(arrayListM12510s2, arrayListM12510s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2228a[] newArray(int i) {
        return new C2228a[i];
    }
}
