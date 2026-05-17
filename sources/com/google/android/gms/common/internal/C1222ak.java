package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C1222ak extends AbstractC2011we {
    public static final Parcelable.Creator<C1222ak> CREATOR = new C1223al();

    /* JADX INFO: renamed from: a */
    private int f5845a;

    /* JADX INFO: renamed from: b */
    private final Account f5846b;

    /* JADX INFO: renamed from: c */
    private final int f5847c;

    /* JADX INFO: renamed from: d */
    private final GoogleSignInAccount f5848d;

    C1222ak(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f5845a = i;
        this.f5846b = account;
        this.f5847c = i2;
        this.f5848d = googleSignInAccount;
    }

    public C1222ak(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5845a);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f5846b, i, false);
        C2014wh.m12516a(parcel, 3, this.f5847c);
        C2014wh.m12520a(parcel, 4, (Parcelable) this.f5848d, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
