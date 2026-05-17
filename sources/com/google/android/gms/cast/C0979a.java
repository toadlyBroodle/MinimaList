package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.a */
/* JADX INFO: loaded from: classes.dex */
public class C0979a extends AbstractC2011we {
    public static final Parcelable.Creator<C0979a> CREATOR = new C1057m();

    /* JADX INFO: renamed from: a */
    private final String f5172a;

    /* JADX INFO: renamed from: b */
    private final String f5173b;

    /* JADX INFO: renamed from: c */
    private final long f5174c;

    /* JADX INFO: renamed from: d */
    private final String f5175d;

    /* JADX INFO: renamed from: e */
    private final String f5176e;

    /* JADX INFO: renamed from: f */
    private final String f5177f;

    /* JADX INFO: renamed from: g */
    private String f5178g;

    /* JADX INFO: renamed from: h */
    private JSONObject f5179h;

    C0979a(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        this.f5172a = str;
        this.f5173b = str2;
        this.f5174c = j;
        this.f5175d = str3;
        this.f5176e = str4;
        this.f5177f = str5;
        this.f5178g = str6;
        if (TextUtils.isEmpty(this.f5178g)) {
            this.f5179h = new JSONObject();
            return;
        }
        try {
            this.f5179h = new JSONObject(str6);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
            this.f5178g = null;
            this.f5179h = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    static C0979a m6279a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("id")) {
            try {
                String string = jSONObject.getString("id");
                long jOptLong = (long) (jSONObject.optLong("duration") * 1000.0d);
                String strOptString = jSONObject.optString("clickThroughUrl", null);
                String strOptString2 = jSONObject.optString("contentUrl", null);
                String strOptString3 = jSONObject.optString("mimeType", null);
                String strOptString4 = jSONObject.optString("title", null);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customData");
                return new C0979a(string, strOptString4, jOptLong, strOptString2, strOptString3, strOptString, jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.toString());
            } catch (JSONException e) {
                Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e.getMessage()));
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m6280a() {
        return this.f5172a;
    }

    /* JADX INFO: renamed from: b */
    public String m6281b() {
        return this.f5173b;
    }

    /* JADX INFO: renamed from: c */
    public long m6282c() {
        return this.f5174c;
    }

    /* JADX INFO: renamed from: d */
    public String m6283d() {
        return this.f5175d;
    }

    /* JADX INFO: renamed from: e */
    public String m6284e() {
        return this.f5176e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0979a)) {
            return false;
        }
        C0979a c0979a = (C0979a) obj;
        return C1981vb.m12427a(this.f5172a, c0979a.f5172a) && C1981vb.m12427a(this.f5173b, c0979a.f5173b) && this.f5174c == c0979a.f5174c && C1981vb.m12427a(this.f5175d, c0979a.f5175d) && C1981vb.m12427a(this.f5176e, c0979a.f5176e) && C1981vb.m12427a(this.f5177f, c0979a.f5177f) && C1981vb.m12427a(this.f5178g, c0979a.f5178g);
    }

    /* JADX INFO: renamed from: f */
    public String m6285f() {
        return this.f5177f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5172a, this.f5173b, Long.valueOf(this.f5174c), this.f5175d, this.f5176e, this.f5177f, this.f5178g});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, m6280a(), false);
        C2014wh.m12524a(parcel, 3, m6281b(), false);
        C2014wh.m12517a(parcel, 4, m6282c());
        C2014wh.m12524a(parcel, 5, m6283d(), false);
        C2014wh.m12524a(parcel, 6, m6284e(), false);
        C2014wh.m12524a(parcel, 7, m6285f(), false);
        C2014wh.m12524a(parcel, 8, this.f5178g, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
