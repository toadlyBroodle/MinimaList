package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bdv;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.l */
/* JADX INFO: loaded from: classes.dex */
final class C2251l extends AbstractC2011we {
    public static final Parcelable.Creator<C2251l> CREATOR = new C2252m();

    /* JADX INFO: renamed from: a */
    private List<String> f12928a;

    /* JADX INFO: renamed from: b */
    private List<String> f12929b;

    public C2251l(List<String> list, List<String> list2) {
        this.f12928a = list;
        this.f12929b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static bdv m12989a(C2251l c2251l, Object obj) {
        return new bdv(c2251l.f12928a, c2251l.f12929b, obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12535b(parcel, 2, this.f12928a, false);
        C2014wh.m12535b(parcel, 3, this.f12929b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
