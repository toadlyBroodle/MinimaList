package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bcs;
import com.google.android.gms.internal.bda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.a */
/* JADX INFO: loaded from: classes.dex */
final class C2228a extends AbstractC2011we {
    public static final Parcelable.Creator<C2228a> CREATOR = new C2253n();

    /* JADX INFO: renamed from: a */
    private List<String> f12918a;

    /* JADX INFO: renamed from: b */
    private List<String> f12919b;

    public C2228a(List<String> list, List<String> list2) {
        this.f12918a = list;
        this.f12919b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static bcs m12974a(C2228a c2228a) {
        ArrayList arrayList = new ArrayList(c2228a.f12918a.size());
        Iterator<String> it = c2228a.f12918a.iterator();
        while (it.hasNext()) {
            arrayList.add(bda.m8951a(it.next()));
        }
        return new bcs(arrayList, c2228a.f12919b);
    }

    /* JADX INFO: renamed from: a */
    public static C2228a m12975a(bcs bcsVar) {
        List<List<String>> listM8926a = bcsVar.m8926a();
        ArrayList arrayList = new ArrayList(listM8926a.size());
        Iterator<List<String>> it = listM8926a.iterator();
        while (it.hasNext()) {
            arrayList.add(bda.m8950a(it.next()));
        }
        return new C2228a(arrayList, bcsVar.m8927b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12535b(parcel, 2, this.f12918a, false);
        C2014wh.m12535b(parcel, 3, this.f12919b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
