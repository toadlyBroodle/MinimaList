package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.c */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0828c extends AbstractC2011we {
    public static final Parcelable.Creator<C0828c> CREATOR = new C0827b();

    /* JADX INFO: renamed from: a */
    public final String f4794a;

    /* JADX INFO: renamed from: b */
    public final String f4795b;

    /* JADX INFO: renamed from: c */
    public final String f4796c;

    /* JADX INFO: renamed from: d */
    public final String f4797d;

    /* JADX INFO: renamed from: e */
    public final String f4798e;

    /* JADX INFO: renamed from: f */
    public final Intent f4799f;

    /* JADX INFO: renamed from: g */
    private String f4800g;

    /* JADX INFO: renamed from: h */
    private String f4801h;

    public C0828c(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public C0828c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public C0828c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f4800g = str;
        this.f4794a = str2;
        this.f4795b = str3;
        this.f4796c = str4;
        this.f4797d = str5;
        this.f4798e = str6;
        this.f4801h = str7;
        this.f4799f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f4800g, false);
        C2014wh.m12524a(parcel, 3, this.f4794a, false);
        C2014wh.m12524a(parcel, 4, this.f4795b, false);
        C2014wh.m12524a(parcel, 5, this.f4796c, false);
        C2014wh.m12524a(parcel, 6, this.f4797d, false);
        C2014wh.m12524a(parcel, 7, this.f4798e, false);
        C2014wh.m12524a(parcel, 8, this.f4801h, false);
        C2014wh.m12520a(parcel, 9, (Parcelable) this.f4799f, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
