package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.b */
/* JADX INFO: loaded from: classes.dex */
public class C0988b extends AbstractC2011we {
    public static final Parcelable.Creator<C0988b> CREATOR = new C1067w();

    /* JADX INFO: renamed from: a */
    private final long f5189a;

    /* JADX INFO: renamed from: b */
    private final String f5190b;

    /* JADX INFO: renamed from: c */
    private final long f5191c;

    /* JADX INFO: renamed from: d */
    private final boolean f5192d;

    /* JADX INFO: renamed from: e */
    private String[] f5193e;

    public C0988b(long j, String str, long j2, boolean z, String[] strArr) {
        this.f5189a = j;
        this.f5190b = str;
        this.f5191c = j2;
        this.f5192d = z;
        this.f5193e = strArr;
    }

    /* JADX INFO: renamed from: a */
    static C0988b m6292a(JSONObject jSONObject) {
        String[] strArr;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has("id") || !jSONObject.has("position")) {
            return null;
        }
        try {
            String string = jSONObject.getString("id");
            long j = (long) (jSONObject.getLong("position") * 1000.0d);
            boolean zOptBoolean = jSONObject.optBoolean("isWatched");
            long jOptLong = (long) (jSONObject.optLong("duration") * 1000.0d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("breakClipIds");
            if (jSONArrayOptJSONArray != null) {
                strArr = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    strArr[i] = jSONArrayOptJSONArray.getString(i);
                }
            } else {
                strArr = null;
            }
            return new C0988b(j, string, jOptLong, zOptBoolean, strArr);
        } catch (JSONException e) {
            Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m6293a() {
        return this.f5189a;
    }

    /* JADX INFO: renamed from: b */
    public String m6294b() {
        return this.f5190b;
    }

    /* JADX INFO: renamed from: c */
    public long m6295c() {
        return this.f5191c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m6296d() {
        return this.f5192d;
    }

    /* JADX INFO: renamed from: e */
    public String[] m6297e() {
        return this.f5193e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0988b)) {
            return false;
        }
        C0988b c0988b = (C0988b) obj;
        return C1981vb.m12427a(this.f5190b, c0988b.f5190b) && this.f5189a == c0988b.f5189a && this.f5191c == c0988b.f5191c && this.f5192d == c0988b.f5192d && Arrays.equals(this.f5193e, c0988b.f5193e);
    }

    public int hashCode() {
        return this.f5190b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12517a(parcel, 2, m6293a());
        C2014wh.m12524a(parcel, 3, m6294b(), false);
        C2014wh.m12517a(parcel, 4, m6295c());
        C2014wh.m12526a(parcel, 5, m6296d());
        C2014wh.m12531a(parcel, 6, m6297e(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
