package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2256q implements Parcelable.Creator<C2254o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2254o createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        String strM12502k = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k2 = null;
        String strM12502k3 = null;
        ArrayList<String> arrayListM12510s = null;
        int iM12495d = 0;
        C2260u c2260u = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    c2260u = (C2260u) C2012wf.m12488a(parcel, i, C2260u.CREATOR);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 5:
                    zM12494c = C2012wf.m12494c(parcel, i);
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
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2254o(c2260u, iM12495d, arrayListM12510s, zM12494c, strM12502k3, strM12502k2, strM12502k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2254o[] newArray(int i) {
        return new C2254o[i];
    }
}
