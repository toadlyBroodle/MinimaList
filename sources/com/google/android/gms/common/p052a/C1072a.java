package com.google.android.gms.common.p052a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1218ag;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.common.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1072a extends AbstractC2011we {
    public static final Parcelable.Creator<C1072a> CREATOR = new C1073b();

    /* JADX INFO: renamed from: a */
    private int f5444a;

    /* JADX INFO: renamed from: b */
    private final Uri f5445b;

    /* JADX INFO: renamed from: c */
    private final int f5446c;

    /* JADX INFO: renamed from: d */
    private final int f5447d;

    C1072a(int i, Uri uri, int i2, int i3) {
        this.f5444a = i;
        this.f5445b = uri;
        this.f5446c = i2;
        this.f5447d = i3;
    }

    public C1072a(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public C1072a(JSONObject jSONObject) {
        this(m6616a(jSONObject), jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    /* JADX INFO: renamed from: a */
    private static Uri m6616a(JSONObject jSONObject) {
        if (!jSONObject.has("url")) {
            return null;
        }
        try {
            return Uri.parse(jSONObject.getString("url"));
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Uri m6617a() {
        return this.f5445b;
    }

    /* JADX INFO: renamed from: b */
    public final int m6618b() {
        return this.f5446c;
    }

    /* JADX INFO: renamed from: c */
    public final int m6619c() {
        return this.f5447d;
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m6620d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f5445b.toString());
            jSONObject.put("width", this.f5446c);
            jSONObject.put("height", this.f5447d);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1072a)) {
            return false;
        }
        C1072a c1072a = (C1072a) obj;
        return C1218ag.m7063a(this.f5445b, c1072a.f5445b) && this.f5446c == c1072a.f5446c && this.f5447d == c1072a.f5447d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5445b, Integer.valueOf(this.f5446c), Integer.valueOf(this.f5447d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f5446c), Integer.valueOf(this.f5447d), this.f5445b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5444a);
        C2014wh.m12520a(parcel, 2, (Parcelable) m6617a(), i, false);
        C2014wh.m12516a(parcel, 3, m6618b());
        C2014wh.m12516a(parcel, 4, m6619c());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
