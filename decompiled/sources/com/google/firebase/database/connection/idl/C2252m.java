package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2252m implements Parcelable.Creator<C2251l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2251l createFromParcel(Parcel parcel) {
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
        return new C2251l(arrayListM12510s2, arrayListM12510s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2251l[] newArray(int i) {
        return new C2251l[i];
    }
}
