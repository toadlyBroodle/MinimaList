package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bae extends AbstractC2011we {
    public static final Parcelable.Creator<bae> CREATOR = new baf();

    /* JADX INFO: renamed from: a */
    private String f7661a;

    /* JADX INFO: renamed from: b */
    private String f7662b;

    /* JADX INFO: renamed from: c */
    private Long f7663c;

    /* JADX INFO: renamed from: d */
    private String f7664d;

    /* JADX INFO: renamed from: e */
    private Long f7665e;

    public bae() {
        this.f7665e = Long.valueOf(System.currentTimeMillis());
    }

    bae(String str, String str2, Long l, String str3, Long l2) {
        this.f7661a = str;
        this.f7662b = str2;
        this.f7663c = l;
        this.f7664d = str3;
        this.f7665e = l2;
    }

    /* JADX INFO: renamed from: b */
    public static bae m8765b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            bae baeVar = new bae();
            baeVar.f7661a = jSONObject.optString("refresh_token", null);
            baeVar.f7662b = jSONObject.optString("access_token", null);
            baeVar.f7663c = Long.valueOf(jSONObject.optLong("expires_in"));
            baeVar.f7664d = jSONObject.optString("token_type", null);
            baeVar.f7665e = Long.valueOf(jSONObject.optLong("issued_at"));
            return baeVar;
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new aym(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8766a(String str) {
        this.f7661a = C1221aj.m7067a(str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8767a() {
        return C1303g.m7263d().mo7252a() + 300000 < this.f7665e.longValue() + (this.f7663c.longValue() * 1000);
    }

    /* JADX INFO: renamed from: b */
    public final String m8768b() {
        return this.f7661a;
    }

    /* JADX INFO: renamed from: c */
    public final String m8769c() {
        return this.f7662b;
    }

    /* JADX INFO: renamed from: d */
    public final long m8770d() {
        if (this.f7663c == null) {
            return 0L;
        }
        return this.f7663c.longValue();
    }

    /* JADX INFO: renamed from: e */
    public final long m8771e() {
        return this.f7665e.longValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m8772f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f7661a);
            jSONObject.put("access_token", this.f7662b);
            jSONObject.put("expires_in", this.f7663c);
            jSONObject.put("token_type", this.f7664d);
            jSONObject.put("issued_at", this.f7665e);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new aym(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7661a, false);
        C2014wh.m12524a(parcel, 3, this.f7662b, false);
        C2014wh.m12523a(parcel, 4, Long.valueOf(m8770d()), false);
        C2014wh.m12524a(parcel, 5, this.f7664d, false);
        C2014wh.m12523a(parcel, 6, Long.valueOf(this.f7665e.longValue()), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
