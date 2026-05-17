package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1056l extends AbstractC2011we {
    public static final Parcelable.Creator<C1056l> CREATOR = new C1069y();

    /* JADX INFO: renamed from: a */
    private int f5431a;

    /* JADX INFO: renamed from: b */
    private int f5432b;

    /* JADX INFO: renamed from: c */
    private int f5433c;

    C1056l(int i, int i2, int i3) {
        this.f5431a = i;
        this.f5432b = i2;
        this.f5433c = i3;
    }

    /* JADX INFO: renamed from: a */
    static C1056l m6605a(JSONObject jSONObject) {
        String string;
        C1056l c1056l = null;
        int i = 2;
        if (jSONObject == null) {
            return null;
        }
        try {
            string = jSONObject.getString("hdrType");
            switch (string) {
                case "dv":
                    i = 3;
                    break;
                case "hdr10":
                    break;
                case "hdr":
                    i = 4;
                    break;
                case "sdr":
                    i = 1;
                    break;
                default:
                    Log.d("VideoInfo", String.format(Locale.ROOT, "Unknown HDR type: %s", string));
                    i = 0;
                    break;
            }
            c1056l = new C1056l(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            return c1056l;
        } catch (JSONException e) {
            Log.d("VideoInfo", String.format(Locale.ROOT, "Error while creating a VideoInfo instance from JSON: %s", e.getMessage()));
            return c1056l;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6606a() {
        return this.f5431a;
    }

    /* JADX INFO: renamed from: b */
    public final int m6607b() {
        return this.f5432b;
    }

    /* JADX INFO: renamed from: c */
    public final int m6608c() {
        return this.f5433c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056l)) {
            return false;
        }
        C1056l c1056l = (C1056l) obj;
        return this.f5432b == c1056l.m6607b() && this.f5431a == c1056l.m6606a() && this.f5433c == c1056l.m6608c();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5432b), Integer.valueOf(this.f5431a), Integer.valueOf(this.f5433c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 2, m6606a());
        C2014wh.m12516a(parcel, 3, m6607b());
        C2014wh.m12516a(parcel, 4, m6608c());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
