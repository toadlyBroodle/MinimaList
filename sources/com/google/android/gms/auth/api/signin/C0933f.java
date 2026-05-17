package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.C0947l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0933f implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        boolean zM12494c = false;
        ArrayList arrayListM12493c = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        boolean zM12494c2 = false;
        boolean zM12494c3 = false;
        Account account = null;
        ArrayList arrayListM12493c2 = null;
        int iM12495d = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    arrayListM12493c2 = C2012wf.m12493c(parcel, i, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2012wf.m12488a(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    zM12494c3 = C2012wf.m12494c(parcel, i);
                    break;
                case 5:
                    zM12494c2 = C2012wf.m12494c(parcel, i);
                    break;
                case 6:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 7:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 9:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C0947l.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new GoogleSignInOptions(iM12495d, (ArrayList<Scope>) arrayListM12493c2, account, zM12494c3, zM12494c2, zM12494c, strM12502k2, strM12502k, (ArrayList<C0947l>) arrayListM12493c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
