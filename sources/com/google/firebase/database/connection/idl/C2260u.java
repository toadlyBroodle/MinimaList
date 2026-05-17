package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bdb;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.u */
/* JADX INFO: loaded from: classes.dex */
final class C2260u extends AbstractC2011we {
    public static final Parcelable.Creator<C2260u> CREATOR = new C2261v();

    /* JADX INFO: renamed from: a */
    private String f12941a;

    /* JADX INFO: renamed from: b */
    private String f12942b;

    /* JADX INFO: renamed from: c */
    private boolean f12943c;

    public C2260u(String str, String str2, boolean z) {
        this.f12941a = str;
        this.f12942b = str2;
        this.f12943c = z;
    }

    /* JADX INFO: renamed from: a */
    public static bdb m12992a(C2260u c2260u) {
        return new bdb(c2260u.f12941a, c2260u.f12942b, c2260u.f12943c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f12941a, false);
        C2014wh.m12524a(parcel, 3, this.f12942b, false);
        C2014wh.m12526a(parcel, 4, this.f12943c);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
