package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.al */
/* JADX INFO: loaded from: classes.dex */
public final class C1223al implements Parcelable.Creator<C1222ak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1222ak createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        Account account = null;
        int iM12495d2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    account = (Account) C2012wf.m12488a(parcel, i, Account.CREATOR);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C2012wf.m12488a(parcel, i, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1222ak(iM12495d2, account, iM12495d, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1222ak[] newArray(int i) {
        return new C1222ak[i];
    }
}
