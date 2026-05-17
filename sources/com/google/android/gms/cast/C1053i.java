package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.C1309m;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.i */
/* JADX INFO: loaded from: classes.dex */
public class C1053i extends AbstractC2011we {
    public static final Parcelable.Creator<C1053i> CREATOR = new C1064t();

    /* JADX INFO: renamed from: a */
    private MediaInfo f5387a;

    /* JADX INFO: renamed from: b */
    private int f5388b;

    /* JADX INFO: renamed from: c */
    private boolean f5389c;

    /* JADX INFO: renamed from: d */
    private double f5390d;

    /* JADX INFO: renamed from: e */
    private double f5391e;

    /* JADX INFO: renamed from: f */
    private double f5392f;

    /* JADX INFO: renamed from: g */
    private long[] f5393g;

    /* JADX INFO: renamed from: h */
    private String f5394h;

    /* JADX INFO: renamed from: i */
    private JSONObject f5395i;

    /* JADX INFO: renamed from: com.google.android.gms.cast.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1053i f5396a;

        public a(MediaInfo mediaInfo) {
            this.f5396a = new C1053i(mediaInfo);
        }

        /* JADX INFO: renamed from: a */
        public C1053i m6566a() {
            this.f5396a.m6564h();
            return this.f5396a;
        }
    }

    private C1053i(MediaInfo mediaInfo) {
        this(mediaInfo, 0, true, 0.0d, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    C1053i(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f5387a = mediaInfo;
        this.f5388b = i;
        this.f5389c = z;
        this.f5390d = d;
        this.f5391e = d2;
        this.f5392f = d3;
        this.f5393g = jArr;
        this.f5394h = str;
        if (this.f5394h == null) {
            this.f5395i = null;
            return;
        }
        try {
            this.f5395i = new JSONObject(this.f5394h);
        } catch (JSONException e) {
            this.f5395i = null;
            this.f5394h = null;
        }
    }

    C1053i(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, 0.0d, Double.POSITIVE_INFINITY, 0.0d, null, null);
        m6557a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public MediaInfo m6556a() {
        return this.f5387a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6557a(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        long[] jArr;
        boolean z3;
        int i;
        if (jSONObject.has("media")) {
            this.f5387a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f5388b != (i = jSONObject.getInt("itemId"))) {
            this.f5388b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f5389c != (z3 = jSONObject.getBoolean("autoplay"))) {
            this.f5389c = z3;
            z = true;
        }
        if (jSONObject.has("startTime")) {
            double d = jSONObject.getDouble("startTime");
            if (Math.abs(d - this.f5390d) > 1.0E-7d) {
                this.f5390d = d;
                z = true;
            }
        }
        if (jSONObject.has("playbackDuration")) {
            double d2 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d2 - this.f5391e) > 1.0E-7d) {
                this.f5391e = d2;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d3 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d3 - this.f5392f) > 1.0E-7d) {
                this.f5392f = d3;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            if (this.f5393g != null && this.f5393g.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        jArr = jArr2;
                        break;
                    }
                    if (this.f5393g[i3] != jArr2[i3]) {
                        jArr = jArr2;
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            } else {
                jArr = jArr2;
                z2 = true;
            }
        } else {
            z2 = false;
            jArr = null;
        }
        if (z2) {
            this.f5393g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f5395i = jSONObject.getJSONObject("customData");
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m6558b() {
        return this.f5388b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m6559c() {
        return this.f5389c;
    }

    /* JADX INFO: renamed from: d */
    public double m6560d() {
        return this.f5390d;
    }

    /* JADX INFO: renamed from: e */
    public double m6561e() {
        return this.f5391e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1053i)) {
            return false;
        }
        C1053i c1053i = (C1053i) obj;
        if ((this.f5395i == null) == (c1053i.f5395i == null)) {
            return (this.f5395i == null || c1053i.f5395i == null || C1309m.m7277a(this.f5395i, c1053i.f5395i)) && C1981vb.m12427a(this.f5387a, c1053i.f5387a) && this.f5388b == c1053i.f5388b && this.f5389c == c1053i.f5389c && this.f5390d == c1053i.f5390d && this.f5391e == c1053i.f5391e && this.f5392f == c1053i.f5392f && Arrays.equals(this.f5393g, c1053i.f5393g);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public double m6562f() {
        return this.f5392f;
    }

    /* JADX INFO: renamed from: g */
    public long[] m6563g() {
        return this.f5393g;
    }

    /* JADX INFO: renamed from: h */
    final void m6564h() {
        if (this.f5387a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (Double.isNaN(this.f5390d) || this.f5390d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.f5391e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.f5392f) || this.f5392f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5387a, Integer.valueOf(this.f5388b), Boolean.valueOf(this.f5389c), Double.valueOf(this.f5390d), Double.valueOf(this.f5391e), Double.valueOf(this.f5392f), Integer.valueOf(Arrays.hashCode(this.f5393g)), String.valueOf(this.f5395i)});
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m6565i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.f5387a.m6270j());
            if (this.f5388b != 0) {
                jSONObject.put("itemId", this.f5388b);
            }
            jSONObject.put("autoplay", this.f5389c);
            jSONObject.put("startTime", this.f5390d);
            if (this.f5391e != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", this.f5391e);
            }
            jSONObject.put("preloadTime", this.f5392f);
            if (this.f5393g != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.f5393g) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.f5395i != null) {
                jSONObject.put("customData", this.f5395i);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f5394h = this.f5395i == null ? null : this.f5395i.toString();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) m6556a(), i, false);
        C2014wh.m12516a(parcel, 3, m6558b());
        C2014wh.m12526a(parcel, 4, m6559c());
        C2014wh.m12514a(parcel, 5, m6560d());
        C2014wh.m12514a(parcel, 6, m6561e());
        C2014wh.m12514a(parcel, 7, m6562f());
        C2014wh.m12529a(parcel, 8, m6563g(), false);
        C2014wh.m12524a(parcel, 9, this.f5394h, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
