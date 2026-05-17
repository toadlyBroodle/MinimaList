package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bag extends AbstractC2011we {
    public static final Parcelable.Creator<bag> CREATOR = new bah();

    /* JADX INFO: renamed from: a */
    private String f7666a;

    /* JADX INFO: renamed from: b */
    private String f7667b;

    /* JADX INFO: renamed from: c */
    private String f7668c;

    /* JADX INFO: renamed from: d */
    private String f7669d;

    /* JADX INFO: renamed from: e */
    private String f7670e;

    /* JADX INFO: renamed from: f */
    private String f7671f;

    /* JADX INFO: renamed from: g */
    private String f7672g;

    public bag() {
    }

    bag(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7666a = str;
        this.f7667b = str2;
        this.f7668c = str3;
        this.f7669d = str4;
        this.f7670e = str5;
        this.f7671f = str6;
        this.f7672g = str7;
    }

    /* JADX INFO: renamed from: a */
    public final String m8773a() {
        return this.f7666a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8774b() {
        return this.f7667b;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m8775c() {
        if (TextUtils.isEmpty(this.f7668c)) {
            return null;
        }
        return Uri.parse(this.f7668c);
    }

    /* JADX INFO: renamed from: d */
    public final String m8776d() {
        return this.f7669d;
    }

    /* JADX INFO: renamed from: e */
    public final String m8777e() {
        return this.f7671f;
    }

    /* JADX INFO: renamed from: f */
    public final String m8778f() {
        return this.f7670e;
    }

    /* JADX INFO: renamed from: g */
    public final String m8779g() {
        return this.f7672g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7666a, false);
        C2014wh.m12524a(parcel, 3, this.f7667b, false);
        C2014wh.m12524a(parcel, 4, this.f7668c, false);
        C2014wh.m12524a(parcel, 5, this.f7669d, false);
        C2014wh.m12524a(parcel, 6, this.f7670e, false);
        C2014wh.m12524a(parcel, 7, this.f7671f, false);
        C2014wh.m12524a(parcel, 8, this.f7672g, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
