package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ap */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1375ap extends AbstractC2011we {
    public static final Parcelable.Creator<C1375ap> CREATOR = new C1376aq();

    /* JADX INFO: renamed from: a */
    private Bundle f7010a;

    /* JADX INFO: renamed from: b */
    private C1670jo f7011b;

    /* JADX INFO: renamed from: c */
    private ApplicationInfo f7012c;

    /* JADX INFO: renamed from: d */
    private String f7013d;

    /* JADX INFO: renamed from: e */
    private List<String> f7014e;

    /* JADX INFO: renamed from: f */
    private PackageInfo f7015f;

    /* JADX INFO: renamed from: g */
    private String f7016g;

    /* JADX INFO: renamed from: h */
    private boolean f7017h;

    /* JADX INFO: renamed from: i */
    private String f7018i;

    public C1375ap(Bundle bundle, C1670jo c1670jo, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f7010a = bundle;
        this.f7011b = c1670jo;
        this.f7013d = str;
        this.f7012c = applicationInfo;
        this.f7014e = list;
        this.f7015f = packageInfo;
        this.f7016g = str2;
        this.f7017h = z;
        this.f7018i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12518a(parcel, 1, this.f7010a, false);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f7011b, i, false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f7012c, i, false);
        C2014wh.m12524a(parcel, 4, this.f7013d, false);
        C2014wh.m12535b(parcel, 5, this.f7014e, false);
        C2014wh.m12520a(parcel, 6, (Parcelable) this.f7015f, i, false);
        C2014wh.m12524a(parcel, 7, this.f7016g, false);
        C2014wh.m12526a(parcel, 8, this.f7017h);
        C2014wh.m12524a(parcel, 9, this.f7018i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
