package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bdb;
import com.google.android.gms.internal.bkn;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2254o extends AbstractC2011we {
    public static final Parcelable.Creator<C2254o> CREATOR = new C2256q();

    /* JADX INFO: renamed from: a */
    final C2260u f12930a;

    /* JADX INFO: renamed from: b */
    final int f12931b;

    /* JADX INFO: renamed from: c */
    final List<String> f12932c;

    /* JADX INFO: renamed from: d */
    final boolean f12933d;

    /* JADX INFO: renamed from: e */
    final String f12934e;

    /* JADX INFO: renamed from: f */
    final String f12935f;

    /* JADX INFO: renamed from: g */
    final String f12936g;

    public C2254o(bdb bdbVar, bkn bknVar, List<String> list, boolean z, String str, String str2, File file) {
        int i;
        switch (bknVar) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.f12930a = new C2260u(bdbVar.m8953a(), bdbVar.m8954b(), bdbVar.m8955c());
        this.f12931b = i;
        this.f12932c = null;
        this.f12933d = z;
        this.f12934e = str;
        this.f12935f = str2;
        this.f12936g = file.getAbsolutePath();
    }

    public C2254o(C2260u c2260u, int i, List<String> list, boolean z, String str, String str2, String str3) {
        this.f12930a = c2260u;
        this.f12931b = i;
        this.f12932c = list;
        this.f12933d = z;
        this.f12934e = str;
        this.f12935f = str2;
        this.f12936g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f12930a, i, false);
        C2014wh.m12516a(parcel, 3, this.f12931b);
        C2014wh.m12535b(parcel, 4, this.f12932c, false);
        C2014wh.m12526a(parcel, 5, this.f12933d);
        C2014wh.m12524a(parcel, 6, this.f12934e, false);
        C2014wh.m12524a(parcel, 7, this.f12935f, false);
        C2014wh.m12524a(parcel, 8, this.f12936g, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
