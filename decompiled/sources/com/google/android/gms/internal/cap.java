package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C0710au;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cap {

    /* JADX INFO: renamed from: a */
    private boolean f9676a = ((Boolean) bxm.m10409f().m10546a(can.f9408H)).booleanValue();

    /* JADX INFO: renamed from: b */
    private String f9677b = (String) bxm.m10409f().m10546a(can.f9409I);

    /* JADX INFO: renamed from: c */
    private Map<String, String> f9678c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private Context f9679d;

    /* JADX INFO: renamed from: e */
    private String f9680e;

    public cap(Context context, String str) {
        this.f9679d = null;
        this.f9680e = null;
        this.f9679d = context;
        this.f9680e = str;
        this.f9678c.put("s", "gmob_sdk");
        this.f9678c.put("v", "3");
        this.f9678c.put("os", Build.VERSION.RELEASE);
        this.f9678c.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f9678c;
        C0710au.m5569e();
        map.put("device", C1596gv.m11407b());
        this.f9678c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f9678c;
        C0710au.m5569e();
        map2.put("is_lite_sdk", C1596gv.m11435m(context) ? "1" : "0");
        Future<C1456bs> futureM10252a = C0710au.m5579o().m10252a(this.f9679d);
        try {
            futureM10252a.get();
            this.f9678c.put("network_coarse", Integer.toString(futureM10252a.get().f8797n));
            this.f9678c.put("network_fine", Integer.toString(futureM10252a.get().f8798o));
        } catch (Exception e) {
            C0710au.m5573i().m11292a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m10552a() {
        return this.f9676a;
    }

    /* JADX INFO: renamed from: b */
    final String m10553b() {
        return this.f9677b;
    }

    /* JADX INFO: renamed from: c */
    final Context m10554c() {
        return this.f9679d;
    }

    /* JADX INFO: renamed from: d */
    final String m10555d() {
        return this.f9680e;
    }

    /* JADX INFO: renamed from: e */
    final Map<String, String> m10556e() {
        return this.f9678c;
    }
}
