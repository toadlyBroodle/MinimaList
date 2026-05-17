package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.C0753af;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.p048js.C0796b;
import com.google.android.gms.ads.internal.p048js.C0820z;
import com.google.android.gms.ads.internal.p048js.InterfaceC0809o;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1206e;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ar */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1377ar extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    private static long f7112a = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: b */
    private static final Object f7113b = new Object();

    /* JADX INFO: renamed from: c */
    private static boolean f7114c = false;

    /* JADX INFO: renamed from: d */
    private static C0820z f7115d = null;

    /* JADX INFO: renamed from: e */
    private static HttpClient f7116e = null;

    /* JADX INFO: renamed from: f */
    private static C0753af f7117f = null;

    /* JADX INFO: renamed from: g */
    private static InterfaceC0748aa<Object> f7118g = null;

    /* JADX INFO: renamed from: h */
    private final cnd f7119h;

    /* JADX INFO: renamed from: i */
    private final C2006w f7120i;

    /* JADX INFO: renamed from: j */
    private final Object f7121j;

    /* JADX INFO: renamed from: k */
    private final Context f7122k;

    /* JADX INFO: renamed from: l */
    private C0796b f7123l;

    /* JADX INFO: renamed from: m */
    private bwk f7124m;

    public C1377ar(Context context, C2006w c2006w, cnd cndVar, bwk bwkVar) {
        super(true);
        this.f7121j = new Object();
        this.f7119h = cndVar;
        this.f7122k = context;
        this.f7120i = c2006w;
        this.f7124m = bwkVar;
        synchronized (f7113b) {
            if (!f7114c) {
                f7117f = new C0753af();
                f7116e = new HttpClient(context.getApplicationContext(), c2006w.f11879j);
                f7118g = new C1421az();
                f7115d = new C0820z(this.f7122k.getApplicationContext(), this.f7120i.f11879j, (String) bxm.m10409f().m10546a(can.f9427a), new C1419ay(), new C1418ax());
                f7114c = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final C2087z m8182a(C1979v c1979v) {
        C0710au.m5569e();
        String strM11379a = C1596gv.m11379a();
        JSONObject jSONObjectM8183a = m8183a(c1979v, strM11379a);
        if (jSONObjectM8183a == null) {
            return new C2087z(0);
        }
        long jMo7253b = C0710au.m5575k().mo7253b();
        Future<JSONObject> futureM5677a = f7117f.m5677a(strM11379a);
        C1657jb.f10832a.post(new RunnableC1380at(this, jSONObjectM8183a, strM11379a));
        try {
            JSONObject jSONObject = futureM5677a.get(f7112a - (C0710au.m5575k().mo7253b() - jMo7253b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new C2087z(-1);
            }
            C2087z c2087zM9511a = C1433bk.m9511a(this.f7122k, c1979v, jSONObject.toString());
            return (c2087zM9511a.f12612d == -3 || !TextUtils.isEmpty(c2087zM9511a.f12610b)) ? c2087zM9511a : new C2087z(3);
        } catch (InterruptedException e) {
            return new C2087z(-1);
        } catch (CancellationException e2) {
            return new C2087z(-1);
        } catch (ExecutionException e3) {
            return new C2087z(0);
        } catch (TimeoutException e4) {
            return new C2087z(2);
        }
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m8183a(C1979v c1979v, String str) {
        C1456bs c1456bs;
        C0677a.a aVarM5396a;
        Bundle bundle = c1979v.f11753c.f9209c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            c1456bs = C0710au.m5579o().m10252a(this.f7122k).get();
        } catch (Exception e) {
            C1560fm.m11613c("Error grabbing device info: ", e);
            c1456bs = null;
        }
        Context context = this.f7122k;
        C1425bc c1425bc = new C1425bc();
        c1425bc.f7769i = c1979v;
        c1425bc.f7770j = c1456bs;
        JSONObject jSONObjectM9515a = C1433bk.m9515a(context, c1425bc);
        if (jSONObjectM9515a == null) {
            return null;
        }
        try {
            aVarM5396a = C0677a.m5396a(this.f7122k);
        } catch (C1205d | C1206e | IOException | IllegalStateException e2) {
            C1560fm.m11613c("Cannot get advertising id info", e2);
            aVarM5396a = null;
        }
        HashMap map = new HashMap();
        map.put("request_id", str);
        map.put("request_param", jSONObjectM9515a);
        map.put("data", bundle);
        if (aVarM5396a != null) {
            map.put("adid", aVarM5396a.m5408a());
            map.put("lat", Integer.valueOf(aVarM5396a.m5409b() ? 1 : 0));
        }
        try {
            return C0710au.m5569e().m11442a(map);
        } catch (JSONException e3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m8184a(InterfaceC0809o interfaceC0809o) {
        interfaceC0809o.mo5725a("/loadAd", f7117f);
        interfaceC0809o.mo5725a("/fetchHttpRequest", f7116e);
        interfaceC0809o.mo5725a("/invalidRequest", f7118g);
    }

    /* JADX INFO: renamed from: b */
    protected static void m8186b(InterfaceC0809o interfaceC0809o) {
        interfaceC0809o.mo5726b("/loadAd", f7117f);
        interfaceC0809o.mo5726b("/fetchHttpRequest", f7116e);
        interfaceC0809o.mo5726b("/invalidRequest", f7118g);
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        C1560fm.m11610b("SdkLessAdLoaderBackgroundTask started.");
        String strM11249i = C0710au.m5590z().m11249i(this.f7122k);
        C1979v c1979v = new C1979v(this.f7120i, -1L, C0710au.m5590z().m11247g(this.f7122k), C0710au.m5590z().m11248h(this.f7122k), strM11249i);
        C0710au.m5590z().m11246f(this.f7122k, strM11249i);
        C2087z c2087zM8182a = m8182a(c1979v);
        C1657jb.f10832a.post(new RunnableC1379as(this, new C1542ev(c1979v, c2087zM8182a, null, null, c2087zM8182a.f12612d, C0710au.m5575k().mo7253b(), c2087zM8182a.f12621m, null, this.f7124m)));
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
        synchronized (this.f7121j) {
            C1657jb.f10832a.post(new RunnableC1408aw(this));
        }
    }
}
