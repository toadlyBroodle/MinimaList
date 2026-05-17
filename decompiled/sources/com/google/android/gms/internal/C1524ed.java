package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ed */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1524ed extends AbstractC2011we {
    public static final Parcelable.Creator<C1524ed> CREATOR = new C1525ee();

    /* JADX INFO: renamed from: a */
    public final String f10494a;

    /* JADX INFO: renamed from: b */
    public final String f10495b;

    /* JADX INFO: renamed from: c */
    public final boolean f10496c;

    /* JADX INFO: renamed from: d */
    public final boolean f10497d;

    /* JADX INFO: renamed from: e */
    public final List<String> f10498e;

    /* JADX INFO: renamed from: f */
    public final boolean f10499f;

    /* JADX INFO: renamed from: g */
    public final boolean f10500g;

    public C1524ed(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.f10494a = str;
        this.f10495b = str2;
        this.f10496c = z;
        this.f10497d = z2;
        this.f10498e = list;
        this.f10499f = z3;
        this.f10500g = z4;
    }

    /* JADX INFO: renamed from: a */
    public static C1524ed m11218a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("click_string", "");
        String strOptString2 = jSONObject.optString("report_url", "");
        boolean zOptBoolean = jSONObject.optBoolean("rendered_ad_enabled", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("non_malicious_reporting_enabled", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("allowed_headers");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString3 = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString3)) {
                arrayList.add(strOptString3.toLowerCase(Locale.ENGLISH));
            }
        }
        return new C1524ed(strOptString, strOptString2, zOptBoolean, zOptBoolean2, arrayList, jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f10494a, false);
        C2014wh.m12524a(parcel, 3, this.f10495b, false);
        C2014wh.m12526a(parcel, 4, this.f10496c);
        C2014wh.m12526a(parcel, 5, this.f10497d);
        C2014wh.m12535b(parcel, 6, this.f10498e, false);
        C2014wh.m12526a(parcel, 7, this.f10499f);
        C2014wh.m12526a(parcel, 8, this.f10500g);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
