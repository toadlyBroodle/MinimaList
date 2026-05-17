package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C0710au;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.bx */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1462bx extends AbstractC1465bz {

    /* JADX INFO: renamed from: a */
    private final Object f9242a = new Object();

    /* JADX INFO: renamed from: b */
    private final Context f9243b;

    /* JADX INFO: renamed from: c */
    private SharedPreferences f9244c;

    /* JADX INFO: renamed from: d */
    private final cgz<JSONObject, JSONObject> f9245d;

    public C1462bx(Context context, cgz<JSONObject, JSONObject> cgzVar) {
        this.f9243b = context.getApplicationContext();
        this.f9245d = cgzVar;
    }

    @Override // com.google.android.gms.internal.AbstractC1465bz
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1689kg<Void> mo10376a() {
        synchronized (this.f9242a) {
            if (this.f9244c == null) {
                this.f9244c = this.f9243b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C0710au.m5575k().mo7252a() - this.f9244c.getLong("js_last_update", 0L) < ((Long) bxm.m10409f().m10546a(can.f9488bH)).longValue()) {
            return C1678jw.m11618a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C1670jo.m11616a().f10855a);
            jSONObject.put("mf", bxm.m10409f().m10546a(can.f9489bI));
            jSONObject.put("cl", "179146524");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            return C1678jw.m11621a(this.f9245d.mo10850b(jSONObject), new InterfaceC1674js(this) { // from class: com.google.android.gms.internal.by

                /* JADX INFO: renamed from: a */
                private final C1462bx f9304a;

                {
                    this.f9304a = this;
                }

                @Override // com.google.android.gms.internal.InterfaceC1674js
                /* JADX INFO: renamed from: a */
                public final Object mo10413a(Object obj) {
                    return this.f9304a.m10377a((JSONObject) obj);
                }
            }, C1695km.f10894b);
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to populate SDK Core Constants parameters.", e);
            return C1678jw.m11618a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Void m10377a(JSONObject jSONObject) {
        can.m10550a(this.f9243b, 1, jSONObject);
        this.f9244c.edit().putLong("js_last_update", C0710au.m5575k().mo7252a()).apply();
        return null;
    }
}
