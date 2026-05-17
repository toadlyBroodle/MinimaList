package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0710au;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvy extends AbstractC2011we {
    public static final Parcelable.Creator<bvy> CREATOR = new bvz();

    /* JADX INFO: renamed from: a */
    public final String f9143a;

    /* JADX INFO: renamed from: b */
    private long f9144b;

    /* JADX INFO: renamed from: c */
    private String f9145c;

    /* JADX INFO: renamed from: d */
    private String f9146d;

    /* JADX INFO: renamed from: e */
    private String f9147e;

    /* JADX INFO: renamed from: f */
    private Bundle f9148f;

    /* JADX INFO: renamed from: g */
    private boolean f9149g;

    /* JADX INFO: renamed from: h */
    private long f9150h;

    bvy(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f9143a = str;
        this.f9144b = j;
        this.f9145c = str2 == null ? "" : str2;
        this.f9146d = str3 == null ? "" : str3;
        this.f9147e = str4 == null ? "" : str4;
        this.f9148f = bundle == null ? new Bundle() : bundle;
        this.f9149g = z;
        this.f9150h = j2;
    }

    /* JADX INFO: renamed from: a */
    public static bvy m10348a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                C1560fm.m11615e(new StringBuilder(62).append("Expected 2 path parts for namespace and id, found :").append(pathSegments.size()).toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 != null ? Long.parseLong(queryParameter2) : 0L;
            Bundle bundle = new Bundle();
            for (String str3 : C0710au.m5571g().mo11464a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new bvy(queryParameter, j, host, str, str2, bundle, zEquals, 0L);
        } catch (NullPointerException | NumberFormatException e) {
            C1560fm.m11613c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static bvy m10349a(String str) {
        return m10348a(Uri.parse(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f9143a, false);
        C2014wh.m12517a(parcel, 3, this.f9144b);
        C2014wh.m12524a(parcel, 4, this.f9145c, false);
        C2014wh.m12524a(parcel, 5, this.f9146d, false);
        C2014wh.m12524a(parcel, 6, this.f9147e, false);
        C2014wh.m12518a(parcel, 7, this.f9148f, false);
        C2014wh.m12526a(parcel, 8, this.f9149g);
        C2014wh.m12517a(parcel, 9, this.f9150h);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
