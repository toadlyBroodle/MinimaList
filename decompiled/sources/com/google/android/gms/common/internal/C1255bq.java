package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1281k;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bq */
/* JADX INFO: loaded from: classes.dex */
public final class C1255bq extends AbstractC2011we {
    public static final Parcelable.Creator<C1255bq> CREATOR = new C1238b();

    /* JADX INFO: renamed from: a */
    String f5927a;

    /* JADX INFO: renamed from: b */
    IBinder f5928b;

    /* JADX INFO: renamed from: c */
    Scope[] f5929c;

    /* JADX INFO: renamed from: d */
    Bundle f5930d;

    /* JADX INFO: renamed from: e */
    Account f5931e;

    /* JADX INFO: renamed from: f */
    C1281k[] f5932f;

    /* JADX INFO: renamed from: g */
    private int f5933g;

    /* JADX INFO: renamed from: h */
    private int f5934h;

    /* JADX INFO: renamed from: i */
    private int f5935i;

    public C1255bq(int i) {
        this.f5933g = 3;
        this.f5935i = C1283m.f5983b;
        this.f5934h = i;
    }

    C1255bq(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1281k[] c1281kArr) {
        Account accountM7054a = null;
        InterfaceC1268o c1270q = null;
        this.f5933g = i;
        this.f5934h = i2;
        this.f5935i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f5927a = "com.google.android.gms";
        } else {
            this.f5927a = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    c1270q = iInterfaceQueryLocalInterface instanceof InterfaceC1268o ? (InterfaceC1268o) iInterfaceQueryLocalInterface : new C1270q(iBinder);
                }
                accountM7054a = BinderC1211a.m7054a(c1270q);
            }
            this.f5931e = accountM7054a;
        } else {
            this.f5928b = iBinder;
            this.f5931e = account;
        }
        this.f5929c = scopeArr;
        this.f5930d = bundle;
        this.f5932f = c1281kArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5933g);
        C2014wh.m12516a(parcel, 2, this.f5934h);
        C2014wh.m12516a(parcel, 3, this.f5935i);
        C2014wh.m12524a(parcel, 4, this.f5927a, false);
        C2014wh.m12519a(parcel, 5, this.f5928b, false);
        C2014wh.m12530a(parcel, 6, (Parcelable[]) this.f5929c, i, false);
        C2014wh.m12518a(parcel, 7, this.f5930d, false);
        C2014wh.m12520a(parcel, 8, (Parcelable) this.f5931e, i, false);
        C2014wh.m12530a(parcel, 10, (Parcelable[]) this.f5932f, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
