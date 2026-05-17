package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1678jw;
import com.google.android.gms.internal.C1979v;
import com.google.android.gms.internal.C2006w;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.ccb;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ae */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0694ae implements Callable<ccb> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f4423a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ JSONArray f4424b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f4425c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1542ev f4426d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ BinderC0692ac f4427e;

    CallableC0694ae(BinderC0692ac binderC0692ac, int i, JSONArray jSONArray, int i2, C1542ev c1542ev) {
        this.f4427e = binderC0692ac;
        this.f4423a = i;
        this.f4424b = jSONArray;
        this.f4425c = i2;
        this.f4426d = c1542ev;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ ccb call() throws JSONException {
        if (this.f4423a >= this.f4424b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f4424b.get(this.f4423a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        BinderC0692ac binderC0692ac = new BinderC0692ac(this.f4427e.f4405e.f4517c, this.f4427e.f4408h, this.f4427e.f4405e.f4523i, this.f4427e.f4405e.f4516b, this.f4427e.f4545i, this.f4427e.f4405e.f4519e, true);
        BinderC0692ac binderC0692ac2 = this.f4427e;
        BinderC0692ac.m5500a(this.f4427e.f4405e, binderC0692ac.f4405e);
        binderC0692ac.m5504E();
        binderC0692ac.m5457a(this.f4427e.f4402b);
        cba cbaVar = binderC0692ac.f4401a;
        int i = this.f4423a;
        cbaVar.m10579a("num_ads_requested", String.valueOf(this.f4425c));
        cbaVar.m10579a("ad_index", String.valueOf(i));
        C1979v c1979v = this.f4426d.f10560a;
        String string = jSONObject.toString();
        Bundle bundle = c1979v.f11753c.f9209c != null ? new Bundle(c1979v.f11753c.f9209c) : new Bundle();
        bundle.putString("_ad", string);
        binderC0692ac.m5617a(new C2006w(c1979v.f11752b, new bwx(c1979v.f11753c.f9207a, c1979v.f11753c.f9208b, bundle, c1979v.f11753c.f9210d, c1979v.f11753c.f9211e, c1979v.f11753c.f9212f, c1979v.f11753c.f9213g, c1979v.f11753c.f9214h, c1979v.f11753c.f9215i, c1979v.f11753c.f9216j, c1979v.f11753c.f9217k, c1979v.f11753c.f9218l, c1979v.f11753c.f9219m, c1979v.f11753c.f9220n, c1979v.f11753c.f9221o, c1979v.f11753c.f9222p, c1979v.f11753c.f9223q, c1979v.f11753c.f9224r), c1979v.f11754d, c1979v.f11755e, c1979v.f11756f, c1979v.f11757g, c1979v.f11759i, c1979v.f11760j, c1979v.f11761k, c1979v.f11762l, c1979v.f11764n, c1979v.f11776z, c1979v.f11765o, c1979v.f11766p, c1979v.f11767q, c1979v.f11768r, c1979v.f11769s, c1979v.f11770t, c1979v.f11771u, c1979v.f11772v, c1979v.f11773w, c1979v.f11774x, c1979v.f11775y, c1979v.f11724B, c1979v.f11725C, c1979v.f11731I, c1979v.f11726D, c1979v.f11727E, c1979v.f11728F, c1979v.f11729G, C1678jw.m11618a(c1979v.f11730H), c1979v.f11732J, c1979v.f11733K, c1979v.f11734L, c1979v.f11735M, c1979v.f11736N, c1979v.f11737O, c1979v.f11738P, c1979v.f11739Q, c1979v.f11743U, C1678jw.m11618a(c1979v.f11758h), c1979v.f11744V, c1979v.f11745W, c1979v.f11746X, 1, c1979v.f11748Z, c1979v.f11750aa, c1979v.f11751ab), binderC0692ac.f4401a);
        return binderC0692ac.m5506G().get();
    }
}
