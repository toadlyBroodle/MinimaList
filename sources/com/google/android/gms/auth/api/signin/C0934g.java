package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0934g implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strM12502k2 = "";
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                case 6:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 7:
                    googleSignInAccount = (GoogleSignInAccount) C2012wf.m12488a(parcel, i, GoogleSignInAccount.CREATOR);
                    break;
                case 8:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new SignInAccount(strM12502k, googleSignInAccount, strM12502k2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
