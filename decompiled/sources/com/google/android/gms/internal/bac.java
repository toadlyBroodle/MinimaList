package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bac extends AbstractC2011we {
    public static final Parcelable.Creator<bac> CREATOR = new bad();

    /* JADX INFO: renamed from: a */
    private String f7650a;

    /* JADX INFO: renamed from: b */
    private String f7651b;

    /* JADX INFO: renamed from: c */
    private boolean f7652c;

    /* JADX INFO: renamed from: d */
    private String f7653d;

    /* JADX INFO: renamed from: e */
    private String f7654e;

    /* JADX INFO: renamed from: f */
    private bai f7655f;

    /* JADX INFO: renamed from: g */
    private String f7656g;

    /* JADX INFO: renamed from: h */
    private String f7657h;

    /* JADX INFO: renamed from: i */
    private long f7658i;

    /* JADX INFO: renamed from: j */
    private long f7659j;

    /* JADX INFO: renamed from: k */
    private boolean f7660k;

    public bac() {
        this.f7655f = new bai();
    }

    public bac(String str, String str2, boolean z, String str3, String str4, bai baiVar, String str5, String str6, long j, long j2, boolean z2) {
        this.f7650a = str;
        this.f7651b = str2;
        this.f7652c = z;
        this.f7653d = str3;
        this.f7654e = str4;
        this.f7655f = baiVar == null ? new bai() : bai.m8780a(baiVar);
        this.f7656g = str5;
        this.f7657h = str6;
        this.f7658i = j;
        this.f7659j = j2;
        this.f7660k = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m8755a() {
        return this.f7651b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8756b() {
        return this.f7652c;
    }

    /* JADX INFO: renamed from: c */
    public final String m8757c() {
        return this.f7650a;
    }

    /* JADX INFO: renamed from: d */
    public final String m8758d() {
        return this.f7653d;
    }

    /* JADX INFO: renamed from: e */
    public final Uri m8759e() {
        if (TextUtils.isEmpty(this.f7654e)) {
            return null;
        }
        return Uri.parse(this.f7654e);
    }

    /* JADX INFO: renamed from: f */
    public final String m8760f() {
        return this.f7657h;
    }

    /* JADX INFO: renamed from: g */
    public final long m8761g() {
        return this.f7658i;
    }

    /* JADX INFO: renamed from: h */
    public final long m8762h() {
        return this.f7659j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8763i() {
        return this.f7660k;
    }

    /* JADX INFO: renamed from: j */
    public final List<bag> m8764j() {
        return this.f7655f.m8781a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7650a, false);
        C2014wh.m12524a(parcel, 3, this.f7651b, false);
        C2014wh.m12526a(parcel, 4, this.f7652c);
        C2014wh.m12524a(parcel, 5, this.f7653d, false);
        C2014wh.m12524a(parcel, 6, this.f7654e, false);
        C2014wh.m12520a(parcel, 7, (Parcelable) this.f7655f, i, false);
        C2014wh.m12524a(parcel, 8, this.f7656g, false);
        C2014wh.m12524a(parcel, 9, this.f7657h, false);
        C2014wh.m12517a(parcel, 10, this.f7658i);
        C2014wh.m12517a(parcel, 11, this.f7659j);
        C2014wh.m12526a(parcel, 12, this.f7660k);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
