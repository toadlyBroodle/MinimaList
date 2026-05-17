package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1281k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1238b implements Parcelable.Creator<C1255bq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1255bq createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        C1281k[] c1281kArr = null;
        int iM12486a = C2012wf.m12486a(parcel);
        Account account = null;
        Bundle bundleM12504m = null;
        Scope[] scopeArr = null;
        IBinder iBinderM12503l = null;
        String strM12502k = null;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 5:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2012wf.m12492b(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 8:
                    account = (Account) C2012wf.m12488a(parcel, i, Account.CREATOR);
                    break;
                case 9:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 10:
                    c1281kArr = (C1281k[]) C2012wf.m12492b(parcel, i, C1281k.CREATOR);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1255bq(iM12495d3, iM12495d2, iM12495d, strM12502k, iBinderM12503l, scopeArr, bundleM12504m, account, c1281kArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1255bq[] newArray(int i) {
        return new C1255bq[i];
    }
}
