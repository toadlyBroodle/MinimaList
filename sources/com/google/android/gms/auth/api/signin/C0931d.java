package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0931d implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        String strM12502k4 = null;
        Uri uri = null;
        String strM12502k5 = null;
        long jM12496e = 0;
        String strM12502k6 = null;
        ArrayList arrayListM12493c = null;
        String strM12502k7 = null;
        String strM12502k8 = null;
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
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 6:
                    uri = (Uri) C2012wf.m12488a(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strM12502k5 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    jM12496e = C2012wf.m12496e(parcel, i);
                    break;
                case 9:
                    strM12502k6 = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strM12502k7 = C2012wf.m12502k(parcel, i);
                    break;
                case 12:
                    strM12502k8 = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new GoogleSignInAccount(iM12495d, strM12502k, strM12502k2, strM12502k3, strM12502k4, uri, strM12502k5, jM12496e, strM12502k6, arrayListM12493c, strM12502k7, strM12502k8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
