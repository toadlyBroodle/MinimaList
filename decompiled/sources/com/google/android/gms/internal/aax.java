package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aax extends acd {

    /* JADX INFO: renamed from: a */
    private static int f6190a = 65535;

    /* JADX INFO: renamed from: b */
    private static int f6191b = 2;

    /* JADX INFO: renamed from: c */
    private final Map<String, Map<String, String>> f6192c;

    /* JADX INFO: renamed from: d */
    private final Map<String, Map<String, Boolean>> f6193d;

    /* JADX INFO: renamed from: e */
    private final Map<String, Map<String, Boolean>> f6194e;

    /* JADX INFO: renamed from: f */
    private final Map<String, aes> f6195f;

    /* JADX INFO: renamed from: g */
    private final Map<String, Map<String, Integer>> f6196g;

    /* JADX INFO: renamed from: h */
    private final Map<String, String> f6197h;

    aax(abd abdVar) {
        super(abdVar);
        this.f6192c = new C0207a();
        this.f6193d = new C0207a();
        this.f6194e = new C0207a();
        this.f6195f = new C0207a();
        this.f6197h = new C0207a();
        this.f6196g = new C0207a();
    }

    /* JADX INFO: renamed from: a */
    private final aes m7454a(String str, byte[] bArr) {
        if (bArr == null) {
            return new aes();
        }
        brt brtVarM10078a = brt.m10078a(bArr, 0, bArr.length);
        aes aesVar = new aes();
        try {
            aesVar.mo7776a(brtVarM10078a);
            mo7393t().m7405E().m7414a("Parsed config. version, gmp_app_id", aesVar.f6538a, aesVar.f6539b);
            return aesVar;
        } catch (IOException e) {
            mo7393t().m7401A().m7414a("Unable to merge remote config. appId", aac.m7397a(str), e);
            return new aes();
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m7455a(aes aesVar) {
        C0207a c0207a = new C0207a();
        if (aesVar != null && aesVar.f6540c != null) {
            for (aet aetVar : aesVar.f6540c) {
                if (aetVar != null) {
                    c0207a.put(aetVar.f6545a, aetVar.f6546b);
                }
            }
        }
        return c0207a;
    }

    /* JADX INFO: renamed from: a */
    private final void m7456a(String str, aes aesVar) {
        C0207a c0207a = new C0207a();
        C0207a c0207a2 = new C0207a();
        C0207a c0207a3 = new C0207a();
        if (aesVar != null && aesVar.f6541d != null) {
            for (aer aerVar : aesVar.f6541d) {
                if (TextUtils.isEmpty(aerVar.f6534a)) {
                    mo7393t().m7401A().m7412a("EventConfig contained null event name");
                } else {
                    String strM12796a = AppMeasurement.C2114a.m12796a(aerVar.f6534a);
                    if (!TextUtils.isEmpty(strM12796a)) {
                        aerVar.f6534a = strM12796a;
                    }
                    c0207a.put(aerVar.f6534a, aerVar.f6535b);
                    c0207a2.put(aerVar.f6534a, aerVar.f6536c);
                    if (aerVar.f6537d != null) {
                        if (aerVar.f6537d.intValue() < f6191b || aerVar.f6537d.intValue() > f6190a) {
                            mo7393t().m7401A().m7414a("Invalid sampling rate. Event name, sample rate", aerVar.f6534a, aerVar.f6537d);
                        } else {
                            c0207a3.put(aerVar.f6534a, aerVar.f6537d);
                        }
                    }
                }
            }
        }
        this.f6193d.put(str, c0207a);
        this.f6194e.put(str, c0207a2);
        this.f6196g.put(str, c0207a3);
    }

    /* JADX INFO: renamed from: e */
    private final void m7457e(String str) {
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        if (this.f6195f.get(str) == null) {
            byte[] bArrM12740d = mo7387n().m12740d(str);
            if (bArrM12740d != null) {
                aes aesVarM7454a = m7454a(str, bArrM12740d);
                this.f6192c.put(str, m7455a(aesVarM7454a));
                m7456a(str, aesVarM7454a);
                this.f6195f.put(str, aesVarM7454a);
                this.f6197h.put(str, null);
                return;
            }
            this.f6192c.put(str, null);
            this.f6193d.put(str, null);
            this.f6194e.put(str, null);
            this.f6195f.put(str, null);
            this.f6197h.put(str, null);
            this.f6196g.put(str, null);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final aes m7458a(String str) {
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        m7457e(str);
        return this.f6195f.get(str);
    }

    /* JADX INFO: renamed from: a */
    final String m7459a(String str, String str2) {
        mo7376c();
        m7457e(str);
        Map<String, String> map = this.f6192c.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m7460a(String str, byte[] bArr, String str2) {
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        aes aesVarM7454a = m7454a(str, bArr);
        if (aesVarM7454a == null) {
            return false;
        }
        m7456a(str, aesVarM7454a);
        this.f6195f.put(str, aesVarM7454a);
        this.f6197h.put(str, str2);
        this.f6192c.put(str, m7455a(aesVarM7454a));
        C2086yz c2086yzMo7378e = mo7378e();
        ael[] aelVarArr = aesVarM7454a.f6542e;
        C1221aj.m7065a(aelVarArr);
        for (ael aelVar : aelVarArr) {
            for (aem aemVar : aelVar.f6508c) {
                String strM12796a = AppMeasurement.C2114a.m12796a(aemVar.f6511b);
                if (strM12796a != null) {
                    aemVar.f6511b = strM12796a;
                }
                aen[] aenVarArr = aemVar.f6512c;
                for (aen aenVar : aenVarArr) {
                    String strM12798a = AppMeasurement.C2117d.m12798a(aenVar.f6519d);
                    if (strM12798a != null) {
                        aenVar.f6519d = strM12798a;
                    }
                }
            }
            for (aep aepVar : aelVar.f6507b) {
                String strM12799a = AppMeasurement.C2118e.m12799a(aepVar.f6527b);
                if (strM12799a != null) {
                    aepVar.f6527b = strM12799a;
                }
            }
        }
        c2086yzMo7378e.mo7387n().m12728a(str, aelVarArr);
        try {
            aesVarM7454a.f6542e = null;
            byte[] bArr2 = new byte[aesVarM7454a.m10166f()];
            aesVarM7454a.mo7777a(bru.m10108a(bArr2, 0, bArr2.length));
            bArr = bArr2;
        } catch (IOException e) {
            mo7393t().m7401A().m7414a("Unable to serialize reduced-size config. Storing full config instead. appId", aac.m7397a(str), e);
        }
        C2091zd c2091zdMo7387n = mo7387n();
        C1221aj.m7067a(str);
        c2091zdMo7387n.mo7376c();
        c2091zdMo7387n.m7584Q();
        new ContentValues().put("remote_config", bArr);
        try {
            if (c2091zdMo7387n.m12709A().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                c2091zdMo7387n.mo7393t().m7410y().m7413a("Failed to update remote config (got 0). appId", aac.m7397a(str));
            }
        } catch (SQLiteException e2) {
            c2091zdMo7387n.mo7393t().m7410y().m7414a("Error storing remote config. appId", aac.m7397a(str), e2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    protected final String m7461b(String str) {
        mo7376c();
        return this.f6197h.get(str);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: b */
    final boolean m7462b(String str, String str2) {
        Boolean bool;
        mo7376c();
        m7457e(str);
        if (mo7389p().m7770l(str) && aek.m7739i(str2)) {
            return true;
        }
        if (mo7389p().m7771m(str) && aek.m7723a(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f6193d.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    /* JADX INFO: renamed from: c */
    protected final void m7463c(String str) {
        mo7376c();
        this.f6197h.put(str, null);
    }

    /* JADX INFO: renamed from: c */
    final boolean m7464c(String str, String str2) {
        Boolean bool;
        mo7376c();
        m7457e(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f6194e.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    final int m7465d(String str, String str2) {
        Integer num;
        mo7376c();
        m7457e(str);
        Map<String, Integer> map = this.f6196g.get(str);
        if (map != null && (num = map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    /* JADX INFO: renamed from: d */
    final void m7466d(String str) {
        mo7376c();
        this.f6195f.remove(str);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }
}
