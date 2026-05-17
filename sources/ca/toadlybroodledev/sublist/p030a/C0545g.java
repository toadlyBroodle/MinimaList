package ca.toadlybroodledev.sublist.p030a;

import org.json.JSONObject;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0545g {

    /* JADX INFO: renamed from: a */
    String f3783a;

    /* JADX INFO: renamed from: b */
    String f3784b;

    /* JADX INFO: renamed from: c */
    String f3785c;

    /* JADX INFO: renamed from: d */
    String f3786d;

    /* JADX INFO: renamed from: e */
    long f3787e;

    /* JADX INFO: renamed from: f */
    int f3788f;

    /* JADX INFO: renamed from: g */
    String f3789g;

    /* JADX INFO: renamed from: h */
    String f3790h;

    /* JADX INFO: renamed from: i */
    String f3791i;

    /* JADX INFO: renamed from: j */
    String f3792j;

    public C0545g(String str, String str2, String str3) {
        this.f3783a = str;
        this.f3791i = str2;
        JSONObject jSONObject = new JSONObject(this.f3791i);
        this.f3784b = jSONObject.optString("orderId");
        this.f3785c = jSONObject.optString("packageName");
        this.f3786d = jSONObject.optString("productId");
        this.f3787e = jSONObject.optLong("purchaseTime");
        this.f3788f = jSONObject.optInt("purchaseState");
        this.f3789g = jSONObject.optString("developerPayload");
        this.f3790h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f3792j = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m4836a() {
        return this.f3783a;
    }

    /* JADX INFO: renamed from: b */
    public String m4837b() {
        return this.f3786d;
    }

    /* JADX INFO: renamed from: c */
    public String m4838c() {
        return this.f3790h;
    }

    public String toString() {
        return "PurchaseInfo(type:" + this.f3783a + "):" + this.f3791i;
    }
}
