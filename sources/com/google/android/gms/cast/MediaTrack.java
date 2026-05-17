package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.C1309m;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class MediaTrack extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C1066v();

    /* JADX INFO: renamed from: a */
    private long f5163a;

    /* JADX INFO: renamed from: b */
    private int f5164b;

    /* JADX INFO: renamed from: c */
    private String f5165c;

    /* JADX INFO: renamed from: d */
    private String f5166d;

    /* JADX INFO: renamed from: e */
    private String f5167e;

    /* JADX INFO: renamed from: f */
    private String f5168f;

    /* JADX INFO: renamed from: g */
    private int f5169g;

    /* JADX INFO: renamed from: h */
    private String f5170h;

    /* JADX INFO: renamed from: i */
    private JSONObject f5171i;

    MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f5163a = j;
        this.f5164b = i;
        this.f5165c = str;
        this.f5166d = str2;
        this.f5167e = str3;
        this.f5168f = str4;
        this.f5169g = i2;
        this.f5170h = str5;
        if (this.f5170h == null) {
            this.f5171i = null;
            return;
        }
        try {
            this.f5171i = new JSONObject(this.f5170h);
        } catch (JSONException e) {
            this.f5171i = null;
            this.f5170h = null;
        }
    }

    MediaTrack(JSONObject jSONObject) throws JSONException {
        this(0L, 0, null, null, null, null, -1, null);
        this.f5163a = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.f5164b = 1;
        } else if ("AUDIO".equals(string)) {
            this.f5164b = 2;
        } else {
            if (!"VIDEO".equals(string)) {
                String strValueOf = String.valueOf(string);
                throw new JSONException(strValueOf.length() != 0 ? "invalid type: ".concat(strValueOf) : new String("invalid type: "));
            }
            this.f5164b = 3;
        }
        this.f5165c = jSONObject.optString("trackContentId", null);
        this.f5166d = jSONObject.optString("trackContentType", null);
        this.f5167e = jSONObject.optString("name", null);
        this.f5168f = jSONObject.optString("language", null);
        if (jSONObject.has("subtype")) {
            String string2 = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string2)) {
                this.f5169g = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.f5169g = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.f5169g = 3;
            } else if ("CHAPTERS".equals(string2)) {
                this.f5169g = 4;
            } else {
                if (!"METADATA".equals(string2)) {
                    String strValueOf2 = String.valueOf(string2);
                    throw new JSONException(strValueOf2.length() != 0 ? "invalid subtype: ".concat(strValueOf2) : new String("invalid subtype: "));
                }
                this.f5169g = 5;
            }
        } else {
            this.f5169g = 0;
        }
        this.f5171i = jSONObject.optJSONObject("customData");
    }

    /* JADX INFO: renamed from: a */
    public final long m6271a() {
        return this.f5163a;
    }

    /* JADX INFO: renamed from: b */
    public final int m6272b() {
        return this.f5164b;
    }

    /* JADX INFO: renamed from: c */
    public final String m6273c() {
        return this.f5165c;
    }

    /* JADX INFO: renamed from: d */
    public final String m6274d() {
        return this.f5166d;
    }

    /* JADX INFO: renamed from: e */
    public final String m6275e() {
        return this.f5167e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.f5171i == null) == (mediaTrack.f5171i == null)) {
            return (this.f5171i == null || mediaTrack.f5171i == null || C1309m.m7277a(this.f5171i, mediaTrack.f5171i)) && this.f5163a == mediaTrack.f5163a && this.f5164b == mediaTrack.f5164b && C1981vb.m12427a(this.f5165c, mediaTrack.f5165c) && C1981vb.m12427a(this.f5166d, mediaTrack.f5166d) && C1981vb.m12427a(this.f5167e, mediaTrack.f5167e) && C1981vb.m12427a(this.f5168f, mediaTrack.f5168f) && this.f5169g == mediaTrack.f5169g;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m6276f() {
        return this.f5168f;
    }

    /* JADX INFO: renamed from: g */
    public final int m6277g() {
        return this.f5169g;
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m6278h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f5163a);
            switch (this.f5164b) {
                case 1:
                    jSONObject.put("type", "TEXT");
                    break;
                case 2:
                    jSONObject.put("type", "AUDIO");
                    break;
                case 3:
                    jSONObject.put("type", "VIDEO");
                    break;
            }
            if (this.f5165c != null) {
                jSONObject.put("trackContentId", this.f5165c);
            }
            if (this.f5166d != null) {
                jSONObject.put("trackContentType", this.f5166d);
            }
            if (this.f5167e != null) {
                jSONObject.put("name", this.f5167e);
            }
            if (!TextUtils.isEmpty(this.f5168f)) {
                jSONObject.put("language", this.f5168f);
            }
            switch (this.f5169g) {
                case 1:
                    jSONObject.put("subtype", "SUBTITLES");
                    break;
                case 2:
                    jSONObject.put("subtype", "CAPTIONS");
                    break;
                case 3:
                    jSONObject.put("subtype", "DESCRIPTIONS");
                    break;
                case 4:
                    jSONObject.put("subtype", "CHAPTERS");
                    break;
                case 5:
                    jSONObject.put("subtype", "METADATA");
                    break;
            }
            if (this.f5171i != null) {
                jSONObject.put("customData", this.f5171i);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5163a), Integer.valueOf(this.f5164b), this.f5165c, this.f5166d, this.f5167e, this.f5168f, Integer.valueOf(this.f5169g), String.valueOf(this.f5171i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f5170h = this.f5171i == null ? null : this.f5171i.toString();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12517a(parcel, 2, m6271a());
        C2014wh.m12516a(parcel, 3, m6272b());
        C2014wh.m12524a(parcel, 4, m6273c(), false);
        C2014wh.m12524a(parcel, 5, m6274d(), false);
        C2014wh.m12524a(parcel, 6, m6275e(), false);
        C2014wh.m12524a(parcel, 7, m6276f(), false);
        C2014wh.m12516a(parcel, 8, m6277g());
        C2014wh.m12524a(parcel, 9, this.f5170h, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
