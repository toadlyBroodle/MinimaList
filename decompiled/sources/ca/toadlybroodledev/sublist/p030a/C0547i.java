package ca.toadlybroodledev.sublist.p030a;

import org.json.JSONObject;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.i */
/* JADX INFO: loaded from: classes.dex */
public class C0547i {

    /* JADX INFO: renamed from: a */
    String f3793a;

    /* JADX INFO: renamed from: b */
    String f3794b;

    /* JADX INFO: renamed from: c */
    String f3795c;

    /* JADX INFO: renamed from: d */
    String f3796d;

    /* JADX INFO: renamed from: e */
    String f3797e;

    /* JADX INFO: renamed from: f */
    String f3798f;

    /* JADX INFO: renamed from: g */
    String f3799g;

    public C0547i(String str, String str2) {
        this.f3793a = str;
        this.f3799g = str2;
        JSONObject jSONObject = new JSONObject(this.f3799g);
        this.f3794b = jSONObject.optString("productId");
        this.f3795c = jSONObject.optString("type");
        this.f3796d = jSONObject.optString("price");
        this.f3797e = jSONObject.optString("title");
        this.f3798f = jSONObject.optString("description");
    }

    /* JADX INFO: renamed from: a */
    public String m4842a() {
        return this.f3794b;
    }

    public String toString() {
        return "SkuDetails:" + this.f3799g;
    }
}
