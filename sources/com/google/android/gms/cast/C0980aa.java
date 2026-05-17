package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0980aa implements Parcelable.Creator<C0990d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0990d createFromParcel(Parcel parcel) {
        Uri uri = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        ArrayList<String> arrayListM12510s = null;
        ArrayList arrayListM12493c = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C1072a.CREATOR);
                    break;
                case 5:
                    arrayListM12510s = C2012wf.m12510s(parcel, i);
                    break;
                case 6:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 7:
                    uri = (Uri) C2012wf.m12488a(parcel, i, Uri.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C0990d(strM12502k3, strM12502k2, arrayListM12493c, arrayListM12510s, strM12502k, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0990d[] newArray(int i) {
        return new C0990d[i];
    }
}
