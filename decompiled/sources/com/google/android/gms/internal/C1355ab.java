package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ab */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1355ab extends AbstractC2011we {
    public static final Parcelable.Creator<C1355ab> CREATOR = new C1358ad();

    /* JADX INFO: renamed from: a */
    public final boolean f6209a;

    /* JADX INFO: renamed from: b */
    public final List<String> f6210b;

    public C1355ab() {
        this(false, Collections.emptyList());
    }

    public C1355ab(boolean z, List<String> list) {
        this.f6209a = z;
        this.f6210b = list;
    }

    /* JADX INFO: renamed from: a */
    public static C1355ab m7483a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new C1355ab();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                } catch (JSONException e) {
                    C1560fm.m11613c("Error grabbing url from json.", e);
                }
            }
        }
        return new C1355ab(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 2, this.f6209a);
        C2014wh.m12535b(parcel, 3, this.f6210b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
