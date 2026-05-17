package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.C1053i;
import com.google.android.gms.common.util.C1309m;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.j */
/* JADX INFO: loaded from: classes.dex */
public class C1054j extends AbstractC2011we {
    public static final Parcelable.Creator<C1054j> CREATOR = new C1065u();

    /* JADX INFO: renamed from: a */
    private MediaInfo f5397a;

    /* JADX INFO: renamed from: b */
    private long f5398b;

    /* JADX INFO: renamed from: c */
    private int f5399c;

    /* JADX INFO: renamed from: d */
    private double f5400d;

    /* JADX INFO: renamed from: e */
    private int f5401e;

    /* JADX INFO: renamed from: f */
    private int f5402f;

    /* JADX INFO: renamed from: g */
    private long f5403g;

    /* JADX INFO: renamed from: h */
    private long f5404h;

    /* JADX INFO: renamed from: i */
    private double f5405i;

    /* JADX INFO: renamed from: j */
    private boolean f5406j;

    /* JADX INFO: renamed from: k */
    private long[] f5407k;

    /* JADX INFO: renamed from: l */
    private int f5408l;

    /* JADX INFO: renamed from: m */
    private int f5409m;

    /* JADX INFO: renamed from: n */
    private String f5410n;

    /* JADX INFO: renamed from: o */
    private JSONObject f5411o;

    /* JADX INFO: renamed from: p */
    private int f5412p;

    /* JADX INFO: renamed from: q */
    private ArrayList<C1053i> f5413q;

    /* JADX INFO: renamed from: r */
    private boolean f5414r;

    /* JADX INFO: renamed from: s */
    private C0989c f5415s;

    /* JADX INFO: renamed from: t */
    private C1056l f5416t;

    /* JADX INFO: renamed from: u */
    private final SparseArray<Integer> f5417u;

    C1054j(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List<C1053i> list, boolean z2, C0989c c0989c, C1056l c1056l) {
        this.f5413q = new ArrayList<>();
        this.f5417u = new SparseArray<>();
        this.f5397a = mediaInfo;
        this.f5398b = j;
        this.f5399c = i;
        this.f5400d = d;
        this.f5401e = i2;
        this.f5402f = i3;
        this.f5403g = j2;
        this.f5404h = j3;
        this.f5405i = d2;
        this.f5406j = z;
        this.f5407k = jArr;
        this.f5408l = i4;
        this.f5409m = i5;
        this.f5410n = str;
        if (this.f5410n != null) {
            try {
                this.f5411o = new JSONObject(this.f5410n);
            } catch (JSONException e) {
                this.f5411o = null;
                this.f5410n = null;
            }
        } else {
            this.f5411o = null;
        }
        this.f5412p = i6;
        if (list != null && !list.isEmpty()) {
            m6567a((C1053i[]) list.toArray(new C1053i[list.size()]));
        }
        this.f5414r = z2;
        this.f5415s = c0989c;
        this.f5416t = c1056l;
    }

    public C1054j(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null);
        m6568a(jSONObject, 0);
    }

    /* JADX INFO: renamed from: a */
    private final void m6567a(C1053i[] c1053iArr) {
        this.f5413q.clear();
        this.f5417u.clear();
        for (int i = 0; i < c1053iArr.length; i++) {
            C1053i c1053i = c1053iArr[i];
            this.f5413q.add(c1053i);
            this.f5417u.put(c1053i.m6558b(), Integer.valueOf(i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0393  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m6568a(JSONObject jSONObject, int i) throws JSONException {
        int i2;
        boolean z;
        boolean z2;
        boolean zM6557a;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.f5398b) {
            this.f5398b = j;
            i6 = 1;
        }
        if (jSONObject.has("playerState")) {
            int i7 = 0;
            String string = jSONObject.getString("playerState");
            if (string.equals("IDLE")) {
                i7 = 1;
            } else if (string.equals("PLAYING")) {
                i7 = 2;
            } else if (string.equals("PAUSED")) {
                i7 = 3;
            } else if (string.equals("BUFFERING")) {
                i7 = 4;
            }
            if (i7 != this.f5401e) {
                this.f5401e = i7;
                i5 = i6 | 2;
            } else {
                i5 = i6;
            }
            if (i7 == 1 && jSONObject.has("idleReason")) {
                int i8 = 0;
                String string2 = jSONObject.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i8 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i8 = 3;
                } else if (string2.equals("FINISHED")) {
                    i8 = 1;
                } else if (string2.equals("ERROR")) {
                    i8 = 4;
                }
                if (i8 != this.f5402f) {
                    this.f5402f = i8;
                    i6 = i5 | 2;
                }
            } else {
                i6 = i5;
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.f5400d != d) {
                this.f5400d = d;
                i6 |= 2;
            }
        }
        if (jSONObject.has("currentTime") && (i & 2) == 0) {
            long j2 = (long) (jSONObject.getDouble("currentTime") * 1000.0d);
            if (j2 != this.f5403g) {
                this.f5403g = j2;
                i6 |= 2;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j3 = jSONObject.getLong("supportedMediaCommands");
            if (j3 != this.f5404h) {
                this.f5404h = j3;
                i6 |= 2;
            }
        }
        if (jSONObject.has("volume") && (i & 1) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("volume");
            double d2 = jSONObject2.getDouble("level");
            if (d2 != this.f5405i) {
                this.f5405i = d2;
                i6 |= 2;
            }
            boolean z4 = jSONObject2.getBoolean("muted");
            if (z4 != this.f5406j) {
                this.f5406j = z4;
                i6 |= 2;
            }
        }
        boolean z5 = false;
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i9 = 0; i9 < length; i9++) {
                jArr[i9] = jSONArray.getLong(i9);
            }
            if (this.f5407k != null && this.f5407k.length == length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (this.f5407k[i10] != jArr[i10]) {
                        z5 = true;
                        break;
                    }
                    i10++;
                }
            } else {
                z5 = true;
            }
            if (z5) {
                this.f5407k = jArr;
            }
        } else if (this.f5407k != null) {
            z5 = true;
        }
        if (z5) {
            this.f5407k = jArr;
            i6 |= 2;
        }
        if (jSONObject.has("customData")) {
            this.f5411o = jSONObject.getJSONObject("customData");
            this.f5410n = null;
            i6 |= 2;
        }
        if (jSONObject.has("media")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("media");
            MediaInfo mediaInfo = new MediaInfo(jSONObject3);
            if (this.f5397a == null || (this.f5397a != null && !this.f5397a.equals(mediaInfo))) {
                this.f5397a = mediaInfo;
                i6 |= 2;
            }
            if (jSONObject3.has("metadata")) {
                i6 |= 4;
            }
        }
        if (jSONObject.has("currentItemId") && this.f5399c != (i4 = jSONObject.getInt("currentItemId"))) {
            this.f5399c = i4;
            i6 |= 2;
        }
        int iOptInt = jSONObject.optInt("preloadedItemId", 0);
        if (this.f5409m != iOptInt) {
            this.f5409m = iOptInt;
            i6 |= 16;
        }
        int iOptInt2 = jSONObject.optInt("loadingItemId", 0);
        if (this.f5408l != iOptInt2) {
            this.f5408l = iOptInt2;
            i2 = i6 | 2;
        } else {
            i2 = i6;
        }
        int iM6262b = this.f5397a == null ? -1 : this.f5397a.m6262b();
        int i11 = this.f5401e;
        int i12 = this.f5402f;
        int i13 = this.f5408l;
        if (i11 == 1) {
            switch (i12) {
                case 1:
                case 3:
                    z = i13 == 0;
                    break;
                case 2:
                    if (iM6262b == 2) {
                        z = false;
                        break;
                    }
                    break;
            }
        } else {
            z = false;
        }
        if (z) {
            this.f5399c = 0;
            this.f5408l = 0;
            this.f5409m = 0;
            if (!this.f5413q.isEmpty()) {
                this.f5412p = 0;
                this.f5413q.clear();
                this.f5417u.clear();
                i2 |= 8;
            }
        } else if (jSONObject.has("repeatMode")) {
            i3 = this.f5412p;
            switch (jSONObject.getString("repeatMode")) {
                case "REPEAT_OFF":
                    i3 = 0;
                    break;
                case "REPEAT_ALL":
                    i3 = 1;
                    break;
                case "REPEAT_SINGLE":
                    i3 = 2;
                    break;
                case "REPEAT_ALL_AND_SHUFFLE":
                    i3 = 3;
                    break;
            }
            if (this.f5412p != i3) {
                this.f5412p = i3;
                z2 = true;
            } else {
                z2 = false;
            }
            if (jSONObject.has("items")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                int length2 = jSONArray2.length();
                SparseArray sparseArray = new SparseArray();
                for (int i14 = 0; i14 < length2; i14++) {
                    sparseArray.put(i14, Integer.valueOf(jSONArray2.getJSONObject(i14).getInt("itemId")));
                }
                C1053i[] c1053iArr = new C1053i[length2];
                int i15 = 0;
                boolean z6 = z2;
                while (i15 < length2) {
                    Integer num = (Integer) sparseArray.get(i15);
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i15);
                    C1053i c1053iM6573b = m6573b(num.intValue());
                    if (c1053iM6573b != null) {
                        zM6557a = z6 | c1053iM6573b.m6557a(jSONObject4);
                        c1053iArr[i15] = c1053iM6573b;
                        z3 = i15 != m6575c(num.intValue()).intValue() ? true : zM6557a;
                    } else {
                        zM6557a = true;
                        if (num.intValue() != this.f5399c || this.f5397a == null) {
                            c1053iArr[i15] = new C1053i(jSONObject4);
                        } else {
                            c1053iArr[i15] = new C1053i.a(this.f5397a).m6566a();
                            c1053iArr[i15].m6557a(jSONObject4);
                            z3 = true;
                        }
                    }
                    i15++;
                    z6 = z3;
                }
                z2 = this.f5413q.size() != length2 ? true : z6;
                m6567a(c1053iArr);
            }
            if (z2) {
                i2 |= 8;
            }
        }
        C0989c c0989cM6298a = C0989c.m6298a(jSONObject.optJSONObject("breakStatus"));
        if ((this.f5415s == null && c0989cM6298a != null) || (this.f5415s != null && !this.f5415s.equals(c0989cM6298a))) {
            this.f5414r = c0989cM6298a != null;
            this.f5415s = c0989cM6298a;
            i2 |= 32;
        }
        C1056l c1056lM6605a = C1056l.m6605a(jSONObject.optJSONObject("videoInfo"));
        if ((this.f5416t == null && c1056lM6605a != null) || (this.f5416t != null && !this.f5416t.equals(c1056lM6605a))) {
            this.f5416t = c1056lM6605a;
            i2 |= 64;
        }
        if (!jSONObject.has("breakInfo") || this.f5397a == null) {
            return i2;
        }
        this.f5397a.m6261a(jSONObject.getJSONObject("breakInfo"));
        return i2 | 2;
    }

    /* JADX INFO: renamed from: a */
    public final long m6569a() {
        return this.f5398b;
    }

    /* JADX INFO: renamed from: a */
    public C1053i m6570a(int i) {
        return m6573b(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m6571a(boolean z) {
        this.f5414r = z;
    }

    /* JADX INFO: renamed from: b */
    public int m6572b() {
        return this.f5401e;
    }

    /* JADX INFO: renamed from: b */
    public C1053i m6573b(int i) {
        Integer num = this.f5417u.get(i);
        if (num == null) {
            return null;
        }
        return this.f5413q.get(num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public int m6574c() {
        return this.f5402f;
    }

    /* JADX INFO: renamed from: c */
    public Integer m6575c(int i) {
        return this.f5417u.get(i);
    }

    /* JADX INFO: renamed from: d */
    public double m6576d() {
        return this.f5400d;
    }

    /* JADX INFO: renamed from: e */
    public MediaInfo m6577e() {
        return this.f5397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1054j)) {
            return false;
        }
        C1054j c1054j = (C1054j) obj;
        if ((this.f5411o == null) == (c1054j.f5411o == null) && this.f5398b == c1054j.f5398b && this.f5399c == c1054j.f5399c && this.f5400d == c1054j.f5400d && this.f5401e == c1054j.f5401e && this.f5402f == c1054j.f5402f && this.f5403g == c1054j.f5403g && this.f5405i == c1054j.f5405i && this.f5406j == c1054j.f5406j && this.f5408l == c1054j.f5408l && this.f5409m == c1054j.f5409m && this.f5412p == c1054j.f5412p && Arrays.equals(this.f5407k, c1054j.f5407k) && C1981vb.m12427a(Long.valueOf(this.f5404h), Long.valueOf(c1054j.f5404h)) && C1981vb.m12427a(this.f5413q, c1054j.f5413q) && C1981vb.m12427a(this.f5397a, c1054j.f5397a)) {
            return (this.f5411o == null || c1054j.f5411o == null || C1309m.m7277a(this.f5411o, c1054j.f5411o)) && this.f5414r == c1054j.m6587o();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m6578f() {
        return this.f5403g;
    }

    /* JADX INFO: renamed from: g */
    public double m6579g() {
        return this.f5405i;
    }

    /* JADX INFO: renamed from: h */
    public boolean m6580h() {
        return this.f5406j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5397a, Long.valueOf(this.f5398b), Integer.valueOf(this.f5399c), Double.valueOf(this.f5400d), Integer.valueOf(this.f5401e), Integer.valueOf(this.f5402f), Long.valueOf(this.f5403g), Long.valueOf(this.f5404h), Double.valueOf(this.f5405i), Boolean.valueOf(this.f5406j), Integer.valueOf(Arrays.hashCode(this.f5407k)), Integer.valueOf(this.f5408l), Integer.valueOf(this.f5409m), String.valueOf(this.f5411o), Integer.valueOf(this.f5412p), this.f5413q, Boolean.valueOf(this.f5414r)});
    }

    /* JADX INFO: renamed from: i */
    public long[] m6581i() {
        return this.f5407k;
    }

    /* JADX INFO: renamed from: j */
    public int m6582j() {
        return this.f5399c;
    }

    /* JADX INFO: renamed from: k */
    public int m6583k() {
        return this.f5408l;
    }

    /* JADX INFO: renamed from: l */
    public int m6584l() {
        return this.f5409m;
    }

    /* JADX INFO: renamed from: m */
    public int m6585m() {
        return this.f5412p;
    }

    /* JADX INFO: renamed from: n */
    public int m6586n() {
        return this.f5413q.size();
    }

    /* JADX INFO: renamed from: o */
    public boolean m6587o() {
        return this.f5414r;
    }

    /* JADX INFO: renamed from: p */
    public C0989c m6588p() {
        return this.f5415s;
    }

    /* JADX INFO: renamed from: q */
    public C1056l m6589q() {
        return this.f5416t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f5410n = this.f5411o == null ? null : this.f5411o.toString();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) m6577e(), i, false);
        C2014wh.m12517a(parcel, 3, this.f5398b);
        C2014wh.m12516a(parcel, 4, m6582j());
        C2014wh.m12514a(parcel, 5, m6576d());
        C2014wh.m12516a(parcel, 6, m6572b());
        C2014wh.m12516a(parcel, 7, m6574c());
        C2014wh.m12517a(parcel, 8, m6578f());
        C2014wh.m12517a(parcel, 9, this.f5404h);
        C2014wh.m12514a(parcel, 10, m6579g());
        C2014wh.m12526a(parcel, 11, m6580h());
        C2014wh.m12529a(parcel, 12, m6581i(), false);
        C2014wh.m12516a(parcel, 13, m6583k());
        C2014wh.m12516a(parcel, 14, m6584l());
        C2014wh.m12524a(parcel, 15, this.f5410n, false);
        C2014wh.m12516a(parcel, 16, this.f5412p);
        C2014wh.m12537c(parcel, 17, this.f5413q, false);
        C2014wh.m12526a(parcel, 18, m6587o());
        C2014wh.m12520a(parcel, 19, (Parcelable) m6588p(), i, false);
        C2014wh.m12520a(parcel, 20, (Parcelable) m6589q(), i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
