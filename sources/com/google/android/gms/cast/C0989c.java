package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.c */
/* JADX INFO: loaded from: classes.dex */
public class C0989c extends AbstractC2011we {
    public static final Parcelable.Creator<C0989c> CREATOR = new C1070z();

    /* JADX INFO: renamed from: a */
    private final long f5194a;

    /* JADX INFO: renamed from: b */
    private final long f5195b;

    /* JADX INFO: renamed from: c */
    private final String f5196c;

    /* JADX INFO: renamed from: d */
    private final String f5197d;

    /* JADX INFO: renamed from: e */
    private final long f5198e;

    C0989c(long j, long j2, String str, String str2, long j3) {
        this.f5194a = j;
        this.f5195b = j2;
        this.f5196c = str;
        this.f5197d = str2;
        this.f5198e = j3;
    }

    /* JADX INFO: renamed from: a */
    static C0989c m6298a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has("currentBreakTime") || !jSONObject.has("currentBreakClipTime")) {
            return null;
        }
        try {
            long j = (long) (jSONObject.getLong("currentBreakTime") * 1000.0d);
            long j2 = (long) (jSONObject.getLong("currentBreakClipTime") * 1000.0d);
            String strOptString = jSONObject.optString("breakId", null);
            String strOptString2 = jSONObject.optString("breakClipId", null);
            long jOptLong = jSONObject.optLong("whenSkippable", -1L);
            if (jOptLong != -1) {
                jOptLong = (long) (jOptLong * 1000.0d);
            }
            return new C0989c(j, j2, strOptString, strOptString2, jOptLong);
        } catch (JSONException e) {
            Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m6299a() {
        return this.f5196c;
    }

    /* JADX INFO: renamed from: b */
    public String m6300b() {
        return this.f5197d;
    }

    /* JADX INFO: renamed from: c */
    public long m6301c() {
        return this.f5194a;
    }

    /* JADX INFO: renamed from: d */
    public long m6302d() {
        return this.f5195b;
    }

    /* JADX INFO: renamed from: e */
    public long m6303e() {
        return this.f5198e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0989c)) {
            return false;
        }
        C0989c c0989c = (C0989c) obj;
        return this.f5194a == c0989c.f5194a && this.f5195b == c0989c.f5195b && C1981vb.m12427a(this.f5196c, c0989c.f5196c) && C1981vb.m12427a(this.f5197d, c0989c.f5197d) && this.f5198e == c0989c.f5198e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5194a), Long.valueOf(this.f5195b), this.f5196c, this.f5197d, Long.valueOf(this.f5198e)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12517a(parcel, 2, m6301c());
        C2014wh.m12517a(parcel, 3, m6302d());
        C2014wh.m12524a(parcel, 4, m6299a(), false);
        C2014wh.m12524a(parcel, 5, m6300b(), false);
        C2014wh.m12517a(parcel, 6, m6303e());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
