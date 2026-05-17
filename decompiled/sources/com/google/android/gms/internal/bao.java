package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class bao extends AbstractC2011we {
    public static final Parcelable.Creator<bao> CREATOR = new bap();

    /* JADX INFO: renamed from: a */
    private String f7679a;

    /* JADX INFO: renamed from: b */
    private String f7680b;

    /* JADX INFO: renamed from: c */
    private String f7681c;

    /* JADX INFO: renamed from: d */
    private String f7682d;

    /* JADX INFO: renamed from: e */
    private String f7683e;

    /* JADX INFO: renamed from: f */
    private String f7684f;

    /* JADX INFO: renamed from: g */
    private String f7685g;

    /* JADX INFO: renamed from: h */
    private String f7686h;

    /* JADX INFO: renamed from: i */
    private boolean f7687i;

    /* JADX INFO: renamed from: j */
    private boolean f7688j;

    /* JADX INFO: renamed from: k */
    private String f7689k;

    /* JADX INFO: renamed from: l */
    private String f7690l;

    /* JADX INFO: renamed from: m */
    private String f7691m;

    public bao() {
        this.f7687i = true;
        this.f7688j = true;
    }

    public bao(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, null, str5, null);
    }

    public bao(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f7679a = "http://localhost";
        this.f7681c = str;
        this.f7682d = str2;
        this.f7686h = str5;
        this.f7689k = str6;
        this.f7687i = true;
        if (TextUtils.isEmpty(this.f7681c) && TextUtils.isEmpty(this.f7682d) && TextUtils.isEmpty(this.f7689k)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.f7683e = C1221aj.m7067a(str3);
        this.f7684f = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f7681c)) {
            sb.append("id_token=").append(this.f7681c).append("&");
        }
        if (!TextUtils.isEmpty(this.f7682d)) {
            sb.append("access_token=").append(this.f7682d).append("&");
        }
        if (!TextUtils.isEmpty(this.f7684f)) {
            sb.append("identifier=").append(this.f7684f).append("&");
        }
        if (!TextUtils.isEmpty(this.f7686h)) {
            sb.append("oauth_token_secret=").append(this.f7686h).append("&");
        }
        if (!TextUtils.isEmpty(this.f7689k)) {
            sb.append("code=").append(this.f7689k).append("&");
        }
        sb.append("providerId=").append(this.f7683e);
        this.f7685g = sb.toString();
        this.f7688j = true;
    }

    bao(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11) {
        this.f7679a = str;
        this.f7680b = str2;
        this.f7681c = str3;
        this.f7682d = str4;
        this.f7683e = str5;
        this.f7684f = str6;
        this.f7685g = str7;
        this.f7686h = str8;
        this.f7687i = z;
        this.f7688j = z2;
        this.f7689k = str9;
        this.f7690l = str10;
        this.f7691m = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7679a, false);
        C2014wh.m12524a(parcel, 3, this.f7680b, false);
        C2014wh.m12524a(parcel, 4, this.f7681c, false);
        C2014wh.m12524a(parcel, 5, this.f7682d, false);
        C2014wh.m12524a(parcel, 6, this.f7683e, false);
        C2014wh.m12524a(parcel, 7, this.f7684f, false);
        C2014wh.m12524a(parcel, 8, this.f7685g, false);
        C2014wh.m12524a(parcel, 9, this.f7686h, false);
        C2014wh.m12526a(parcel, 10, this.f7687i);
        C2014wh.m12526a(parcel, 11, this.f7688j);
        C2014wh.m12524a(parcel, 12, this.f7689k, false);
        C2014wh.m12524a(parcel, 13, this.f7690l, false);
        C2014wh.m12524a(parcel, 14, this.f7691m, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
