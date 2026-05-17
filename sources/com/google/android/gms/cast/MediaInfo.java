package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.C1309m;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediaInfo extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C1061q();

    /* JADX INFO: renamed from: a */
    private final String f5152a;

    /* JADX INFO: renamed from: b */
    private int f5153b;

    /* JADX INFO: renamed from: c */
    private String f5154c;

    /* JADX INFO: renamed from: d */
    private C1052h f5155d;

    /* JADX INFO: renamed from: e */
    private long f5156e;

    /* JADX INFO: renamed from: f */
    private List<MediaTrack> f5157f;

    /* JADX INFO: renamed from: g */
    private C1055k f5158g;

    /* JADX INFO: renamed from: h */
    private String f5159h;

    /* JADX INFO: renamed from: i */
    private List<C0988b> f5160i;

    /* JADX INFO: renamed from: j */
    private List<C0979a> f5161j;

    /* JADX INFO: renamed from: k */
    private JSONObject f5162k;

    MediaInfo(String str, int i, String str2, C1052h c1052h, long j, List<MediaTrack> list, C1055k c1055k, String str3, List<C0988b> list2, List<C0979a> list3) {
        this.f5152a = str;
        this.f5153b = i;
        this.f5154c = str2;
        this.f5155d = c1052h;
        this.f5156e = j;
        this.f5157f = list;
        this.f5158g = c1055k;
        this.f5159h = str3;
        if (this.f5159h != null) {
            try {
                this.f5162k = new JSONObject(this.f5159h);
            } catch (JSONException e) {
                this.f5162k = null;
                this.f5159h = null;
            }
        } else {
            this.f5162k = null;
        }
        this.f5160i = list2;
        this.f5161j = list3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    MediaInfo(JSONObject jSONObject) throws JSONException {
        this(jSONObject.getString("contentId"), -1, null, null, -1L, null, null, null, null, null);
        String string = jSONObject.getString("streamType");
        if ("NONE".equals(string)) {
            this.f5153b = 0;
        } else if ("BUFFERED".equals(string)) {
            this.f5153b = 1;
        } else if ("LIVE".equals(string)) {
            this.f5153b = 2;
        } else {
            this.f5153b = -1;
        }
        this.f5154c = jSONObject.getString("contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            this.f5155d = new C1052h(jSONObject2.getInt("metadataType"));
            this.f5155d.m6547a(jSONObject2);
        }
        this.f5156e = -1L;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble)) {
                this.f5156e = (long) (dOptDouble * 1000.0d);
            }
        }
        if (jSONObject.has("tracks")) {
            this.f5157f = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f5157f.add(new MediaTrack(jSONArray.getJSONObject(i)));
            }
        } else {
            this.f5157f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("textTrackStyle");
            C1055k c1055k = new C1055k();
            c1055k.m6593a(jSONObject3);
            this.f5158g = c1055k;
        } else {
            this.f5158g = null;
        }
        m6261a(jSONObject);
        this.f5162k = jSONObject.optJSONObject("customData");
    }

    /* JADX INFO: renamed from: a */
    public String m6259a() {
        return this.f5152a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6260a(List<C0988b> list) {
        this.f5160i = list;
    }

    /* JADX INFO: renamed from: a */
    final void m6261a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            this.f5160i = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                }
                C0988b c0988bM6292a = C0988b.m6292a(jSONArray.getJSONObject(i));
                if (c0988bM6292a == null) {
                    this.f5160i.clear();
                    break;
                } else {
                    this.f5160i.add(c0988bM6292a);
                    i++;
                }
            }
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            this.f5161j = new ArrayList(jSONArray2.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                C0979a c0979aM6279a = C0979a.m6279a(jSONArray2.getJSONObject(i2));
                if (c0979aM6279a == null) {
                    this.f5161j.clear();
                    return;
                }
                this.f5161j.add(c0979aM6279a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m6262b() {
        return this.f5153b;
    }

    /* JADX INFO: renamed from: c */
    public String m6263c() {
        return this.f5154c;
    }

    /* JADX INFO: renamed from: d */
    public C1052h m6264d() {
        return this.f5155d;
    }

    /* JADX INFO: renamed from: e */
    public long m6265e() {
        return this.f5156e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.f5162k == null) == (mediaInfo.f5162k == null)) {
            return (this.f5162k == null || mediaInfo.f5162k == null || C1309m.m7277a(this.f5162k, mediaInfo.f5162k)) && C1981vb.m12427a(this.f5152a, mediaInfo.f5152a) && this.f5153b == mediaInfo.f5153b && C1981vb.m12427a(this.f5154c, mediaInfo.f5154c) && C1981vb.m12427a(this.f5155d, mediaInfo.f5155d) && this.f5156e == mediaInfo.f5156e && C1981vb.m12427a(this.f5157f, mediaInfo.f5157f) && C1981vb.m12427a(this.f5158g, mediaInfo.f5158g) && C1981vb.m12427a(this.f5160i, mediaInfo.f5160i) && C1981vb.m12427a(this.f5161j, mediaInfo.f5161j);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<MediaTrack> m6266f() {
        return this.f5157f;
    }

    /* JADX INFO: renamed from: g */
    public C1055k m6267g() {
        return this.f5158g;
    }

    /* JADX INFO: renamed from: h */
    public List<C0988b> m6268h() {
        if (this.f5160i == null) {
            return null;
        }
        return Collections.unmodifiableList(this.f5160i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5152a, Integer.valueOf(this.f5153b), this.f5154c, this.f5155d, Long.valueOf(this.f5156e), String.valueOf(this.f5162k), this.f5157f, this.f5158g, this.f5160i, this.f5161j});
    }

    /* JADX INFO: renamed from: i */
    public List<C0979a> m6269i() {
        if (this.f5161j == null) {
            return null;
        }
        return Collections.unmodifiableList(this.f5161j);
    }

    /* JADX INFO: renamed from: j */
    public final JSONObject m6270j() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f5152a);
            switch (this.f5153b) {
                case 1:
                    str = "BUFFERED";
                    break;
                case 2:
                    str = "LIVE";
                    break;
                default:
                    str = "NONE";
                    break;
            }
            jSONObject.put("streamType", str);
            if (this.f5154c != null) {
                jSONObject.put("contentType", this.f5154c);
            }
            if (this.f5155d != null) {
                jSONObject.put("metadata", this.f5155d.m6549c());
            }
            if (this.f5156e <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", this.f5156e / 1000.0d);
            }
            if (this.f5157f != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<MediaTrack> it = this.f5157f.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m6278h());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.f5158g != null) {
                jSONObject.put("textTrackStyle", this.f5158g.m6604l());
            }
            if (this.f5162k != null) {
                jSONObject.put("customData", this.f5162k);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f5159h = this.f5162k == null ? null : this.f5162k.toString();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, m6259a(), false);
        C2014wh.m12516a(parcel, 3, m6262b());
        C2014wh.m12524a(parcel, 4, m6263c(), false);
        C2014wh.m12520a(parcel, 5, (Parcelable) m6264d(), i, false);
        C2014wh.m12517a(parcel, 6, m6265e());
        C2014wh.m12537c(parcel, 7, m6266f(), false);
        C2014wh.m12520a(parcel, 8, (Parcelable) m6267g(), i, false);
        C2014wh.m12524a(parcel, 9, this.f5159h, false);
        C2014wh.m12537c(parcel, 10, m6268h(), false);
        C2014wh.m12537c(parcel, 11, m6269i(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
