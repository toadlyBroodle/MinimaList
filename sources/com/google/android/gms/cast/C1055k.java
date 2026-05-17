package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.C1309m;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1055k extends AbstractC2011we {
    public static final Parcelable.Creator<C1055k> CREATOR = new C1068x();

    /* JADX INFO: renamed from: a */
    private float f5418a;

    /* JADX INFO: renamed from: b */
    private int f5419b;

    /* JADX INFO: renamed from: c */
    private int f5420c;

    /* JADX INFO: renamed from: d */
    private int f5421d;

    /* JADX INFO: renamed from: e */
    private int f5422e;

    /* JADX INFO: renamed from: f */
    private int f5423f;

    /* JADX INFO: renamed from: g */
    private int f5424g;

    /* JADX INFO: renamed from: h */
    private int f5425h;

    /* JADX INFO: renamed from: i */
    private String f5426i;

    /* JADX INFO: renamed from: j */
    private int f5427j;

    /* JADX INFO: renamed from: k */
    private int f5428k;

    /* JADX INFO: renamed from: l */
    private String f5429l;

    /* JADX INFO: renamed from: m */
    private JSONObject f5430m;

    public C1055k() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    C1055k(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f5418a = f;
        this.f5419b = i;
        this.f5420c = i2;
        this.f5421d = i3;
        this.f5422e = i4;
        this.f5423f = i5;
        this.f5424g = i6;
        this.f5425h = i7;
        this.f5426i = str;
        this.f5427j = i8;
        this.f5428k = i9;
        this.f5429l = str2;
        if (this.f5429l == null) {
            this.f5430m = null;
            return;
        }
        try {
            this.f5430m = new JSONObject(this.f5429l);
        } catch (JSONException e) {
            this.f5430m = null;
            this.f5429l = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m6590a(String str) {
        if (str == null || str.length() != 9 || str.charAt(0) != '#') {
            return 0;
        }
        try {
            return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m6591a(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    /* JADX INFO: renamed from: a */
    public final float m6592a() {
        return this.f5418a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6593a(JSONObject jSONObject) throws JSONException {
        this.f5418a = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f5419b = m6590a(jSONObject.optString("foregroundColor"));
        this.f5420c = m6590a(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f5421d = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f5421d = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f5421d = 2;
            } else if ("RAISED".equals(string)) {
                this.f5421d = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f5421d = 4;
            }
        }
        this.f5422e = m6590a(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f5423f = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f5423f = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f5423f = 2;
            }
        }
        this.f5424g = m6590a(jSONObject.optString("windowColor"));
        if (this.f5423f == 2) {
            this.f5425h = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f5426i = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f5427j = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f5427j = 1;
            } else if ("SERIF".equals(string3)) {
                this.f5427j = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f5427j = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f5427j = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.f5427j = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.f5427j = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f5428k = 0;
            } else if ("BOLD".equals(string4)) {
                this.f5428k = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f5428k = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f5428k = 3;
            }
        }
        this.f5430m = jSONObject.optJSONObject("customData");
    }

    /* JADX INFO: renamed from: b */
    public final int m6594b() {
        return this.f5419b;
    }

    /* JADX INFO: renamed from: c */
    public final int m6595c() {
        return this.f5420c;
    }

    /* JADX INFO: renamed from: d */
    public final int m6596d() {
        return this.f5421d;
    }

    /* JADX INFO: renamed from: e */
    public final int m6597e() {
        return this.f5422e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1055k)) {
            return false;
        }
        C1055k c1055k = (C1055k) obj;
        if ((this.f5430m == null) == (c1055k.f5430m == null)) {
            return (this.f5430m == null || c1055k.f5430m == null || C1309m.m7277a(this.f5430m, c1055k.f5430m)) && this.f5418a == c1055k.f5418a && this.f5419b == c1055k.f5419b && this.f5420c == c1055k.f5420c && this.f5421d == c1055k.f5421d && this.f5422e == c1055k.f5422e && this.f5423f == c1055k.f5423f && this.f5425h == c1055k.f5425h && C1981vb.m12427a(this.f5426i, c1055k.f5426i) && this.f5427j == c1055k.f5427j && this.f5428k == c1055k.f5428k;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m6598f() {
        return this.f5423f;
    }

    /* JADX INFO: renamed from: g */
    public final int m6599g() {
        return this.f5424g;
    }

    /* JADX INFO: renamed from: h */
    public final int m6600h() {
        return this.f5425h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5418a), Integer.valueOf(this.f5419b), Integer.valueOf(this.f5420c), Integer.valueOf(this.f5421d), Integer.valueOf(this.f5422e), Integer.valueOf(this.f5423f), Integer.valueOf(this.f5424g), Integer.valueOf(this.f5425h), this.f5426i, Integer.valueOf(this.f5427j), Integer.valueOf(this.f5428k), String.valueOf(this.f5430m)});
    }

    /* JADX INFO: renamed from: i */
    public final String m6601i() {
        return this.f5426i;
    }

    /* JADX INFO: renamed from: j */
    public final int m6602j() {
        return this.f5427j;
    }

    /* JADX INFO: renamed from: k */
    public final int m6603k() {
        return this.f5428k;
    }

    /* JADX INFO: renamed from: l */
    public final JSONObject m6604l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f5418a);
            if (this.f5419b != 0) {
                jSONObject.put("foregroundColor", m6591a(this.f5419b));
            }
            if (this.f5420c != 0) {
                jSONObject.put("backgroundColor", m6591a(this.f5420c));
            }
            switch (this.f5421d) {
                case 0:
                    jSONObject.put("edgeType", "NONE");
                    break;
                case 1:
                    jSONObject.put("edgeType", "OUTLINE");
                    break;
                case 2:
                    jSONObject.put("edgeType", "DROP_SHADOW");
                    break;
                case 3:
                    jSONObject.put("edgeType", "RAISED");
                    break;
                case 4:
                    jSONObject.put("edgeType", "DEPRESSED");
                    break;
            }
            if (this.f5422e != 0) {
                jSONObject.put("edgeColor", m6591a(this.f5422e));
            }
            switch (this.f5423f) {
                case 0:
                    jSONObject.put("windowType", "NONE");
                    break;
                case 1:
                    jSONObject.put("windowType", "NORMAL");
                    break;
                case 2:
                    jSONObject.put("windowType", "ROUNDED_CORNERS");
                    break;
            }
            if (this.f5424g != 0) {
                jSONObject.put("windowColor", m6591a(this.f5424g));
            }
            if (this.f5423f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f5425h);
            }
            if (this.f5426i != null) {
                jSONObject.put("fontFamily", this.f5426i);
            }
            switch (this.f5427j) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            switch (this.f5428k) {
                case 0:
                    jSONObject.put("fontStyle", "NORMAL");
                    break;
                case 1:
                    jSONObject.put("fontStyle", "BOLD");
                    break;
                case 2:
                    jSONObject.put("fontStyle", "ITALIC");
                    break;
                case 3:
                    jSONObject.put("fontStyle", "BOLD_ITALIC");
                    break;
            }
            if (this.f5430m != null) {
                jSONObject.put("customData", this.f5430m);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f5429l = this.f5430m == null ? null : this.f5430m.toString();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12515a(parcel, 2, m6592a());
        C2014wh.m12516a(parcel, 3, m6594b());
        C2014wh.m12516a(parcel, 4, m6595c());
        C2014wh.m12516a(parcel, 5, m6596d());
        C2014wh.m12516a(parcel, 6, m6597e());
        C2014wh.m12516a(parcel, 7, m6598f());
        C2014wh.m12516a(parcel, 8, m6599g());
        C2014wh.m12516a(parcel, 9, m6600h());
        C2014wh.m12524a(parcel, 10, m6601i(), false);
        C2014wh.m12516a(parcel, 11, m6602j());
        C2014wh.m12516a(parcel, 12, m6603k());
        C2014wh.m12524a(parcel, 13, this.f5429l, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
