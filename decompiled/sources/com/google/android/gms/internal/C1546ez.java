package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ez */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1546ez implements buv, InterfaceC1589go {

    /* JADX INFO: renamed from: c */
    private bsz f10600c;

    /* JADX INFO: renamed from: k */
    private Context f10608k;

    /* JADX INFO: renamed from: l */
    private C1670jo f10609l;

    /* JADX INFO: renamed from: r */
    private String f10615r;

    /* JADX INFO: renamed from: s */
    private String f10616s;

    /* JADX INFO: renamed from: u */
    private String f10618u;

    /* JADX INFO: renamed from: a */
    private final Object f10598a = new Object();

    /* JADX INFO: renamed from: d */
    private BigInteger f10601d = BigInteger.ONE;

    /* JADX INFO: renamed from: e */
    private final HashSet<C1543ew> f10602e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashMap<String, C1553ff> f10603f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private boolean f10604g = false;

    /* JADX INFO: renamed from: h */
    private boolean f10605h = true;

    /* JADX INFO: renamed from: i */
    private int f10606i = 0;

    /* JADX INFO: renamed from: j */
    private boolean f10607j = false;

    /* JADX INFO: renamed from: m */
    private caq f10610m = null;

    /* JADX INFO: renamed from: n */
    private boolean f10611n = true;

    /* JADX INFO: renamed from: o */
    private boolean f10612o = true;

    /* JADX INFO: renamed from: p */
    private buw f10613p = null;

    /* JADX INFO: renamed from: q */
    private bur f10614q = null;

    /* JADX INFO: renamed from: t */
    private Boolean f10617t = null;

    /* JADX INFO: renamed from: v */
    private boolean f10619v = false;

    /* JADX INFO: renamed from: w */
    private boolean f10620w = false;

    /* JADX INFO: renamed from: x */
    private boolean f10621x = false;

    /* JADX INFO: renamed from: y */
    private String f10622y = "";

    /* JADX INFO: renamed from: z */
    private long f10623z = 0;

    /* JADX INFO: renamed from: A */
    private long f10591A = 0;

    /* JADX INFO: renamed from: B */
    private long f10592B = 0;

    /* JADX INFO: renamed from: C */
    private int f10593C = -1;

    /* JADX INFO: renamed from: D */
    private JSONObject f10594D = new JSONObject();

    /* JADX INFO: renamed from: E */
    private int f10595E = 0;

    /* JADX INFO: renamed from: F */
    private final AtomicInteger f10596F = new AtomicInteger(0);

    /* JADX INFO: renamed from: G */
    private final C1549fb f10597G = new C1549fb();

    /* JADX INFO: renamed from: b */
    private final C1551fd f10599b = new C1551fd(bxm.m10406c());

    public C1546ez(C1596gv c1596gv) {
    }

    /* JADX INFO: renamed from: b */
    private final Future m11277b(int i) {
        Future futureM11352b;
        synchronized (this.f10598a) {
            this.f10593C = i;
            futureM11352b = C1562fo.m11352b(this.f10608k, i);
        }
        return futureM11352b;
    }

    /* JADX INFO: renamed from: b */
    private final Future m11278b(long j) {
        Future futureM11348a;
        synchronized (this.f10598a) {
            this.f10591A = j;
            futureM11348a = C1562fo.m11348a(this.f10608k, j);
        }
        return futureM11348a;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m11279a(Context context, InterfaceC1552fe interfaceC1552fe, String str) {
        Bundle bundle;
        synchronized (this.f10598a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f10599b.m11331a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f10603f.keySet()) {
                bundle2.putBundle(str2, this.f10603f.get(str2).m11335a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C1543ew> it = this.f10602e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m11265d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            interfaceC1552fe.mo5466a(this.f10602e);
            this.f10602e.clear();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public final buw m11280a(Context context) {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9411K)).booleanValue()) {
            return null;
        }
        if (!((Boolean) bxm.m10409f().m10546a(can.f9419S)).booleanValue()) {
            if (!((Boolean) bxm.m10409f().m10546a(can.f9417Q)).booleanValue()) {
                return null;
            }
        }
        if (m11295a() && m11299b()) {
            return null;
        }
        synchronized (this.f10598a) {
            if (Looper.getMainLooper() == null || context == null) {
                return null;
            }
            if (this.f10614q == null) {
                this.f10614q = new bur();
            }
            if (this.f10613p == null) {
                this.f10613p = new buw(this.f10614q, cmv.m11140a(this.f10608k));
            }
            this.f10613p.m10304a();
            return this.f10613p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0028, TryCatch #0 {, blocks: (B:5:0x000f, B:7:0x0017, B:8:0x001f, B:10:0x0021, B:11:0x0026), top: B:17:0x000f }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceFutureC1689kg m11281a(Context context, String str) {
        InterfaceFutureC1689kg interfaceFutureC1689kgM11345a;
        this.f10623z = C0710au.m5575k().mo7252a();
        synchronized (this.f10598a) {
            if (str != null) {
                if (str.equals(this.f10622y)) {
                    interfaceFutureC1689kgM11345a = C1678jw.m11618a(null);
                } else {
                    this.f10622y = str;
                    interfaceFutureC1689kgM11345a = C1562fo.m11345a(context, str, this.f10623z);
                }
            }
        }
        return interfaceFutureC1689kgM11345a;
    }

    /* JADX INFO: renamed from: a */
    public final Future m11282a(int i) {
        Future futureM11347a;
        synchronized (this.f10598a) {
            this.f10595E = i;
            futureM11347a = C1562fo.m11347a(this.f10608k, i);
        }
        return futureM11347a;
    }

    /* JADX INFO: renamed from: a */
    final Future m11283a(long j) {
        Future futureM11353b;
        synchronized (this.f10598a) {
            this.f10592B = j;
            futureM11353b = C1562fo.m11353b(this.f10608k, j);
        }
        return futureM11353b;
    }

    /* JADX INFO: renamed from: a */
    public final Future m11284a(Context context, String str, String str2, boolean z) {
        Future futureM11358c;
        int i = 0;
        synchronized (this.f10598a) {
            JSONArray jSONArrayOptJSONArray = this.f10594D.optJSONArray(str);
            JSONArray jSONArray = jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
            int length = jSONArray.length();
            while (true) {
                if (i >= jSONArray.length()) {
                    i = length;
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || !str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                    i++;
                } else {
                    if (!z || jSONObjectOptJSONObject.optBoolean("uses_media_view", false) != z) {
                        break;
                    }
                    futureM11358c = null;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C0710au.m5575k().mo7252a());
                jSONArray.put(i, jSONObject);
                this.f10594D.put(str, jSONArray);
            } catch (JSONException e) {
                C1560fm.m11613c("Could not update native advanced settings", e);
            }
            futureM11358c = C1562fo.m11358c(this.f10608k, this.f10594D.toString());
        }
        return futureM11358c;
    }

    /* JADX INFO: renamed from: a */
    public final Future m11285a(Context context, boolean z) {
        Future futureM11351a;
        synchronized (this.f10598a) {
            if (z != this.f10605h) {
                this.f10605h = z;
                futureM11351a = C1562fo.m11351a(context, z);
            } else {
                futureM11351a = null;
            }
        }
        return futureM11351a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Future m11286a(String str) {
        Future futureM11350a;
        synchronized (this.f10598a) {
            if (str != null) {
                if (str.equals(this.f10615r)) {
                    futureM11350a = null;
                } else {
                    this.f10615r = str;
                    futureM11350a = C1562fo.m11350a(this.f10608k, str);
                }
            }
        }
        return futureM11350a;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: a */
    public final void m11287a(Context context, C1670jo c1670jo) {
        synchronized (this.f10598a) {
            if (!this.f10607j) {
                this.f10608k = context.getApplicationContext();
                this.f10609l = c1670jo;
                C0710au.m5572h().m10288a(this);
                C1562fo.m11349a(context, this);
                C1562fo.m11354b(context, this);
                C1562fo.m11364h(context, this);
                C1562fo.m11362f(context, this);
                C1562fo.m11357c(context, this);
                C1562fo.m11360d(context, this);
                C1562fo.m11361e(context, this);
                C1562fo.m11363g(context, this);
                C1562fo.m11365i(context, this);
                C1562fo.m11366j(context, this);
                C1562fo.m11367k(context, this);
                cmv.m11140a(this.f10608k);
                this.f10618u = C0710au.m5569e().m11440a(context, c1670jo.f10855a);
                if (Build.VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f10620w = true;
                }
                this.f10600c = new bsz(context.getApplicationContext(), this.f10609l);
                cap capVar = new cap(this.f10608k, this.f10609l.f10855a);
                try {
                    C0710au.m5577m();
                    this.f10610m = cas.m10563a(capVar);
                } catch (IllegalArgumentException e) {
                    C1560fm.m11613c("Cannot initialize CSI reporter.", e);
                }
                this.f10607j = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x00c9, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0028, B:9:0x0030, B:10:0x0038, B:12:0x004a, B:13:0x0053, B:15:0x005b, B:16:0x0063, B:18:0x006b, B:19:0x0078, B:21:0x0080, B:22:0x0088, B:24:0x0090, B:25:0x0096, B:26:0x00c0, B:33:0x00cc, B:29:0x00c3), top: B:37:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x00c9, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0028, B:9:0x0030, B:10:0x0038, B:12:0x004a, B:13:0x0053, B:15:0x005b, B:16:0x0063, B:18:0x006b, B:19:0x0078, B:21:0x0080, B:22:0x0088, B:24:0x0090, B:25:0x0096, B:26:0x00c0, B:33:0x00cc, B:29:0x00c3), top: B:37:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[Catch: all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0028, B:9:0x0030, B:10:0x0038, B:12:0x004a, B:13:0x0053, B:15:0x005b, B:16:0x0063, B:18:0x006b, B:19:0x0078, B:21:0x0080, B:22:0x0088, B:24:0x0090, B:25:0x0096, B:26:0x00c0, B:33:0x00cc, B:29:0x00c3), top: B:37:0x0003, inners: #0 }] */
    @Override // com.google.android.gms.internal.InterfaceC1589go
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11288a(Bundle bundle) {
        synchronized (this.f10598a) {
            this.f10605h = bundle.getBoolean("use_https", this.f10605h);
            this.f10606i = bundle.getInt("webview_cache_version", this.f10606i);
            if (bundle.containsKey("content_url_opted_out")) {
                m11294a(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f10615r = bundle.getString("content_url_hashes");
            }
            this.f10621x = bundle.getBoolean("auto_collect_location", this.f10621x);
            if (bundle.containsKey("content_vertical_opted_out")) {
                m11298b(bundle.getBoolean("content_vertical_opted_out"));
            }
            if (bundle.containsKey("content_vertical_hashes")) {
                this.f10616s = bundle.getString("content_vertical_hashes");
            }
            if (bundle.containsKey("native_advanced_settings")) {
                try {
                    this.f10594D = new JSONObject(bundle.getString("native_advanced_settings"));
                } catch (JSONException e) {
                    C1560fm.m11613c("Could not convert native advanced settings to json object", e);
                }
                if (bundle.containsKey("version_code")) {
                    this.f10595E = bundle.getInt("version_code");
                }
                this.f10622y = !bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f10622y;
                this.f10623z = bundle.getLong("app_settings_last_update_ms", this.f10623z);
                this.f10591A = bundle.getLong("app_last_background_time_ms", this.f10591A);
                this.f10593C = bundle.getInt("request_in_session_count", this.f10593C);
                this.f10592B = bundle.getLong("first_ad_req_time_ms", this.f10592B);
            } else {
                if (bundle.containsKey("version_code")) {
                }
                this.f10622y = !bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f10622y;
                this.f10623z = bundle.getLong("app_settings_last_update_ms", this.f10623z);
                this.f10591A = bundle.getLong("app_last_background_time_ms", this.f10591A);
                this.f10593C = bundle.getInt("request_in_session_count", this.f10593C);
                this.f10592B = bundle.getLong("first_ad_req_time_ms", this.f10592B);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11289a(C1543ew c1543ew) {
        synchronized (this.f10598a) {
            this.f10602e.add(c1543ew);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11290a(Boolean bool) {
        synchronized (this.f10598a) {
            this.f10617t = bool;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11291a(String str, C1553ff c1553ff) {
        synchronized (this.f10598a) {
            this.f10603f.put(str, c1553ff);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11292a(Throwable th, String str) {
        cmv.m11140a(this.f10608k).mo11143a(th, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m11293a(HashSet<C1543ew> hashSet) {
        synchronized (this.f10598a) {
            this.f10602e.addAll(hashSet);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11294a(boolean z) {
        synchronized (this.f10598a) {
            if (this.f10611n != z) {
                C1562fo.m11356b(this.f10608k, z);
            }
            this.f10611n = z;
            buw buwVarM11280a = m11280a(this.f10608k);
            if (buwVarM11280a != null && !buwVarM11280a.isAlive()) {
                C1560fm.m11614d("start fetching content...");
                buwVarM11280a.m10304a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11295a() {
        boolean z;
        synchronized (this.f10598a) {
            z = this.f10611n;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final Future m11296b(Context context, boolean z) {
        Future futureM11359c;
        synchronized (this.f10598a) {
            if (z != this.f10621x) {
                this.f10621x = z;
                futureM11359c = C1562fo.m11359c(context, z);
            } else {
                futureM11359c = null;
            }
        }
        return futureM11359c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Future m11297b(String str) {
        Future futureM11355b;
        synchronized (this.f10598a) {
            if (str != null) {
                if (str.equals(this.f10616s)) {
                    futureM11355b = null;
                } else {
                    this.f10616s = str;
                    futureM11355b = C1562fo.m11355b(this.f10608k, str);
                }
            }
        }
        return futureM11355b;
    }

    /* JADX INFO: renamed from: b */
    public final void m11298b(boolean z) {
        synchronized (this.f10598a) {
            if (this.f10612o != z) {
                C1562fo.m11356b(this.f10608k, z);
            }
            C1562fo.m11356b(this.f10608k, z);
            this.f10612o = z;
            buw buwVarM11280a = m11280a(this.f10608k);
            if (buwVarM11280a != null && !buwVarM11280a.isAlive()) {
                C1560fm.m11614d("start fetching content...");
                buwVarM11280a.m10304a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11299b() {
        boolean z;
        synchronized (this.f10598a) {
            z = this.f10612o;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final String m11300c() {
        String string;
        synchronized (this.f10598a) {
            string = this.f10601d.toString();
            this.f10601d = this.f10601d.add(BigInteger.ONE);
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final void m11301c(boolean z) {
        this.f10597G.m11326a(z);
    }

    /* JADX INFO: renamed from: d */
    public final C1551fd m11302d() {
        C1551fd c1551fd;
        synchronized (this.f10598a) {
            c1551fd = this.f10599b;
        }
        return c1551fd;
    }

    @Override // com.google.android.gms.internal.buv
    /* JADX INFO: renamed from: d */
    public final void mo10300d(boolean z) {
        long jMo7252a = C0710au.m5575k().mo7252a();
        if (!z) {
            m11278b(jMo7252a);
            m11277b(this.f10599b.f10632a);
            return;
        }
        if (jMo7252a - this.f10591A > ((Long) bxm.m10409f().m10546a(can.f9476aw)).longValue()) {
            this.f10599b.f10632a = -1;
        } else {
            this.f10599b.f10632a = this.f10593C;
        }
    }

    /* JADX INFO: renamed from: e */
    public final caq m11303e() {
        caq caqVar;
        synchronized (this.f10598a) {
            caqVar = this.f10610m;
        }
        return caqVar;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11304f() {
        boolean z;
        synchronized (this.f10598a) {
            z = this.f10605h || this.f10620w;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final String m11305g() {
        String str;
        synchronized (this.f10598a) {
            str = this.f10615r;
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m11306h() {
        String str;
        synchronized (this.f10598a) {
            str = this.f10616s;
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m11307i() {
        Boolean bool;
        synchronized (this.f10598a) {
            bool = this.f10617t;
        }
        return bool;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11308j() {
        boolean z;
        synchronized (this.f10598a) {
            z = this.f10621x;
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    final long m11309k() {
        long j;
        synchronized (this.f10598a) {
            j = this.f10591A;
        }
        return j;
    }

    /* JADX INFO: renamed from: l */
    final long m11310l() {
        long j;
        synchronized (this.f10598a) {
            j = this.f10592B;
        }
        return j;
    }

    /* JADX INFO: renamed from: m */
    public final int m11311m() {
        int i;
        synchronized (this.f10598a) {
            i = this.f10595E;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    final int m11312n() {
        int i;
        synchronized (this.f10598a) {
            i = this.f10593C;
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11313o() {
        return this.f10597G.m11327a();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11314p() {
        return this.f10597G.m11328b();
    }

    /* JADX INFO: renamed from: q */
    public final void m11315q() {
        this.f10597G.m11329c();
    }

    /* JADX INFO: renamed from: r */
    public final C1545ey m11316r() {
        C1545ey c1545ey;
        synchronized (this.f10598a) {
            c1545ey = new C1545ey(this.f10622y, this.f10623z);
        }
        return c1545ey;
    }

    /* JADX INFO: renamed from: s */
    public final JSONObject m11317s() {
        JSONObject jSONObject;
        synchronized (this.f10598a) {
            jSONObject = this.f10594D;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    public final Future m11318t() {
        Future futureM11346a;
        synchronized (this.f10598a) {
            futureM11346a = C1562fo.m11346a(this.f10608k);
        }
        return futureM11346a;
    }

    /* JADX INFO: renamed from: u */
    public final bsz m11319u() {
        return this.f10600c;
    }

    /* JADX INFO: renamed from: v */
    public final Resources m11320v() {
        if (this.f10609l.f10858d) {
            return this.f10608k.getResources();
        }
        try {
            DynamiteModule dynamiteModuleM7328a = DynamiteModule.m7328a(this.f10608k, DynamiteModule.f6063a, ModuleDescriptor.MODULE_ID);
            if (dynamiteModuleM7328a != null) {
                return dynamiteModuleM7328a.m7338a().getResources();
            }
            return null;
        } catch (DynamiteModule.C1323c e) {
            C1560fm.m11613c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11321w() {
        this.f10596F.incrementAndGet();
    }

    /* JADX INFO: renamed from: x */
    public final void m11322x() {
        this.f10596F.decrementAndGet();
    }

    /* JADX INFO: renamed from: y */
    public final int m11323y() {
        return this.f10596F.get();
    }
}
