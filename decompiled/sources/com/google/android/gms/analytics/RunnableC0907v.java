package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1808or;
import com.google.android.gms.internal.C1822pe;
import com.google.android.gms.internal.C1833pp;
import com.google.android.gms.internal.C1837pt;
import com.google.android.gms.internal.C1877rf;
import com.google.android.gms.internal.C1897rz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.v */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0907v implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f4979a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f4980b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4981c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ long f4982d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f4983e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ boolean f4984f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ String f4985g;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ C0893h f4986h;

    RunnableC0907v(C0893h c0893h, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f4986h = c0893h;
        this.f4979a = map;
        this.f4980b = z;
        this.f4981c = str;
        this.f4982d = j;
        this.f4983e = z2;
        this.f4984f = z3;
        this.f4985g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4986h.f4935e.m6023b()) {
            this.f4979a.put("sc", "start");
        }
        Map map = this.f4979a;
        C0889d c0889dM12042n = this.f4986h.m12042n();
        C1221aj.m7077c("getClientId can not be called from the main thread");
        C1897rz.m12295b(map, "cid", c0889dM12042n.m6027g().m12070o().m12154b());
        String str = (String) this.f4979a.get("sf");
        if (str != null) {
            double dM12282a = C1897rz.m12282a(str, 100.0d);
            if (C1897rz.m12290a(dM12282a, (String) this.f4979a.get("cid"))) {
                this.f4986h.m12024b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(dM12282a));
                return;
            }
        }
        C1822pe c1822peM12048t = this.f4986h.m12048t();
        if (this.f4980b) {
            C1897rz.m12289a((Map<String, String>) this.f4979a, "ate", c1822peM12048t.m12002b());
            C1897rz.m12287a((Map<String, String>) this.f4979a, "adid", c1822peM12048t.m12003c());
        } else {
            this.f4979a.remove("ate");
            this.f4979a.remove("adid");
        }
        C1808or c1808orM12122b = this.f4986h.m12049u().m12122b();
        C1897rz.m12287a((Map<String, String>) this.f4979a, "an", c1808orM12122b.m11933a());
        C1897rz.m12287a((Map<String, String>) this.f4979a, "av", c1808orM12122b.m11936b());
        C1897rz.m12287a((Map<String, String>) this.f4979a, "aid", c1808orM12122b.m11938c());
        C1897rz.m12287a((Map<String, String>) this.f4979a, "aiid", c1808orM12122b.m11940d());
        this.f4979a.put("v", "1");
        this.f4979a.put("_v", C1833pp.f11303b);
        C1897rz.m12287a((Map<String, String>) this.f4979a, "ul", this.f4986h.m12050v().m12190b().m11966a());
        C1897rz.m12287a((Map<String, String>) this.f4979a, "sr", this.f4986h.m12050v().m12191c());
        if (!(this.f4981c.equals("transaction") || this.f4981c.equals("item")) && !this.f4986h.f4934d.m12219a()) {
            this.f4986h.m12039k().m12229a(this.f4979a, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long jM12283a = C1897rz.m12283a((String) this.f4979a.get("ht"));
        if (jM12283a == 0) {
            jM12283a = this.f4982d;
        }
        if (this.f4983e) {
            this.f4986h.m12039k().m12028c("Dry run enabled. Would have sent hit", new C1877rf(this.f4986h, this.f4979a, jM12283a, this.f4984f));
            return;
        }
        String str2 = (String) this.f4979a.get("cid");
        HashMap map2 = new HashMap();
        C1897rz.m12288a(map2, "uid", (Map<String, String>) this.f4979a);
        C1897rz.m12288a(map2, "an", (Map<String, String>) this.f4979a);
        C1897rz.m12288a(map2, "aid", (Map<String, String>) this.f4979a);
        C1897rz.m12288a(map2, "av", (Map<String, String>) this.f4979a);
        C1897rz.m12288a(map2, "aiid", (Map<String, String>) this.f4979a);
        this.f4979a.put("_s", String.valueOf(this.f4986h.m12043o().m12005a(new C1837pt(0L, str2, this.f4985g, TextUtils.isEmpty((CharSequence) this.f4979a.get("adid")) ? false : true, 0L, map2))));
        this.f4986h.m12043o().m12008a(new C1877rf(this.f4986h, this.f4979a, jM12283a, this.f4984f));
    }
}
