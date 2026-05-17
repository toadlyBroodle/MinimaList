package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.InterfaceC0880a;
import com.google.android.gms.common.internal.C1218ag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.internal.dv */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1515dv extends AbstractC2011we {
    public static final Parcelable.Creator<C1515dv> CREATOR = new C1516dw();

    /* JADX INFO: renamed from: a */
    public final String f10475a;

    /* JADX INFO: renamed from: b */
    public final int f10476b;

    public C1515dv(InterfaceC0880a interfaceC0880a) {
        this(interfaceC0880a.mo5916a(), interfaceC0880a.mo5917b());
    }

    public C1515dv(String str, int i) {
        this.f10475a = str;
        this.f10476b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C1515dv m11202a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m11203a(new JSONArray(str));
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1515dv m11203a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C1515dv(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1515dv)) {
            return false;
        }
        C1515dv c1515dv = (C1515dv) obj;
        return C1218ag.m7063a(this.f10475a, c1515dv.f10475a) && C1218ag.m7063a(Integer.valueOf(this.f10476b), Integer.valueOf(c1515dv.f10476b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10475a, Integer.valueOf(this.f10476b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f10475a, false);
        C2014wh.m12516a(parcel, 3, this.f10476b);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
