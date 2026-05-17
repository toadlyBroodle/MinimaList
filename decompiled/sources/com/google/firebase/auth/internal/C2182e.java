package com.google.firebase.auth.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.aym;
import com.google.android.gms.internal.bac;
import com.google.android.gms.internal.bag;
import com.google.firebase.auth.InterfaceC2208v;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2182e implements InterfaceC2208v {

    /* JADX INFO: renamed from: a */
    private String f12807a;

    /* JADX INFO: renamed from: b */
    private String f12808b;

    /* JADX INFO: renamed from: c */
    private String f12809c;

    /* JADX INFO: renamed from: d */
    private String f12810d;

    /* JADX INFO: renamed from: e */
    private Uri f12811e;

    /* JADX INFO: renamed from: f */
    private String f12812f;

    /* JADX INFO: renamed from: g */
    private String f12813g;

    /* JADX INFO: renamed from: h */
    private boolean f12814h;

    /* JADX INFO: renamed from: i */
    private String f12815i;

    public C2182e(bac bacVar, String str) {
        C1221aj.m7065a(bacVar);
        C1221aj.m7067a(str);
        this.f12807a = C1221aj.m7067a(bacVar.m8757c());
        this.f12808b = str;
        this.f12812f = bacVar.m8755a();
        this.f12809c = bacVar.m8758d();
        Uri uriM8759e = bacVar.m8759e();
        if (uriM8759e != null) {
            this.f12810d = uriM8759e.toString();
            this.f12811e = uriM8759e;
        }
        this.f12814h = bacVar.m8756b();
        this.f12815i = null;
        this.f12813g = bacVar.m8760f();
    }

    public C2182e(bag bagVar) {
        C1221aj.m7065a(bagVar);
        this.f12807a = bagVar.m8773a();
        this.f12808b = C1221aj.m7067a(bagVar.m8776d());
        this.f12809c = bagVar.m8774b();
        Uri uriM8775c = bagVar.m8775c();
        if (uriM8775c != null) {
            this.f12810d = uriM8775c.toString();
            this.f12811e = uriM8775c;
        }
        this.f12812f = bagVar.m8779g();
        this.f12813g = bagVar.m8777e();
        this.f12814h = false;
        this.f12815i = bagVar.m8778f();
    }

    private C2182e(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f12807a = str;
        this.f12808b = str2;
        this.f12812f = str3;
        this.f12813g = str4;
        this.f12809c = str5;
        this.f12810d = str6;
        this.f12814h = z;
        this.f12815i = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C2182e m12856a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2182e(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new aym(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m12857a() {
        return this.f12807a;
    }

    /* JADX INFO: renamed from: b */
    public final String m12858b() {
        return this.f12809c;
    }

    /* JADX INFO: renamed from: c */
    public final String m12859c() {
        return this.f12812f;
    }

    /* JADX INFO: renamed from: d */
    public final String m12860d() {
        return this.f12815i;
    }

    /* JADX INFO: renamed from: e */
    public final String m12861e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f12807a);
            jSONObject.putOpt("providerId", this.f12808b);
            jSONObject.putOpt("displayName", this.f12809c);
            jSONObject.putOpt("photoUrl", this.f12810d);
            jSONObject.putOpt("email", this.f12812f);
            jSONObject.putOpt("phoneNumber", this.f12813g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f12814h));
            jSONObject.putOpt("rawUserInfo", this.f12815i);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new aym(e);
        }
    }

    @Override // com.google.firebase.auth.InterfaceC2208v
    /* JADX INFO: renamed from: j */
    public final String mo12862j() {
        return this.f12808b;
    }
}
