package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.C1545ey;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1676ju;
import com.google.android.gms.internal.C1678jw;
import com.google.android.gms.internal.C1695km;
import com.google.android.gms.internal.InterfaceC1673jr;
import com.google.android.gms.internal.InterfaceFutureC1689kg;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cgz;
import com.google.android.gms.internal.che;
import com.google.android.gms.internal.cnb;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.d */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0739d {

    /* JADX INFO: renamed from: b */
    private Context f4591b;

    /* JADX INFO: renamed from: a */
    private final Object f4590a = new Object();

    /* JADX INFO: renamed from: c */
    private long f4592c = 0;

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceFutureC1689kg m5649a(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.optBoolean("isSuccessful", false)) {
            return C1678jw.m11618a(null);
        }
        return C0710au.m5573i().m11281a(this.f4591b, jSONObject.getString("appSettingsJson"));
    }

    /* JADX INFO: renamed from: a */
    public final void m5650a(Context context, C1670jo c1670jo, String str, Runnable runnable) {
        m5651a(context, c1670jo, true, null, str, null, runnable);
    }

    /* JADX INFO: renamed from: a */
    final void m5651a(Context context, C1670jo c1670jo, boolean z, C1545ey c1545ey, String str, String str2, Runnable runnable) {
        boolean z2;
        if (C0710au.m5575k().mo7253b() - this.f4592c < 5000) {
            C1560fm.m11615e("Not retrying to fetch app settings");
            return;
        }
        this.f4592c = C0710au.m5575k().mo7253b();
        if (c1545ey == null) {
            z2 = true;
        } else {
            z2 = (((C0710au.m5575k().mo7252a() - c1545ey.m11272a()) > ((Long) bxm.m10409f().m10546a(can.f9563cd)).longValue() ? 1 : ((C0710au.m5575k().mo7252a() - c1545ey.m11272a()) == ((Long) bxm.m10409f().m10546a(can.f9563cd)).longValue() ? 0 : -1)) > 0) || !c1545ey.m11273b();
        }
        if (z2) {
            if (context == null) {
                C1560fm.m11615e("Context not provided to fetch application settings");
                return;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                C1560fm.m11615e("App settings could not be fetched. Required parameters missing");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f4591b = applicationContext;
            cgz cgzVarM10857a = C0710au.m5582r().m10853a(this.f4591b, c1670jo).m10857a("google.afma.config.fetchAppSettings", che.f9990a, che.f9990a);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                InterfaceFutureC1689kg interfaceFutureC1689kgMo10850b = cgzVarM10857a.mo10850b(jSONObject);
                InterfaceFutureC1689kg interfaceFutureC1689kgM11620a = C1678jw.m11620a(interfaceFutureC1689kgMo10850b, new InterfaceC1673jr(this) { // from class: com.google.android.gms.ads.internal.e

                    /* JADX INFO: renamed from: a */
                    private final C0739d f4593a;

                    {
                        this.f4593a = this;
                    }

                    @Override // com.google.android.gms.internal.InterfaceC1673jr
                    /* JADX INFO: renamed from: a */
                    public final InterfaceFutureC1689kg mo5652a(Object obj) {
                        return this.f4593a.m5649a((JSONObject) obj);
                    }
                }, C1695km.f10894b);
                if (runnable != null) {
                    interfaceFutureC1689kgMo10850b.mo11631a(runnable, C1695km.f10894b);
                }
                C1676ju.m11617a(interfaceFutureC1689kgM11620a, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                C1560fm.m11611b("Error requesting application settings", e);
            }
        }
    }
}
