package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.bwh;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cne extends AbstractC1556fi implements InterfaceC1763n {

    /* JADX INFO: renamed from: a */
    InterfaceC1616ho f10406a;

    /* JADX INFO: renamed from: b */
    private final cnd f10407b;

    /* JADX INFO: renamed from: c */
    private final C2006w f10408c;

    /* JADX INFO: renamed from: d */
    private final Object f10409d = new Object();

    /* JADX INFO: renamed from: e */
    private final Context f10410e;

    /* JADX INFO: renamed from: f */
    private final bwf f10411f;

    /* JADX INFO: renamed from: g */
    private final bwk f10412g;

    /* JADX INFO: renamed from: h */
    private C1979v f10413h;

    /* JADX INFO: renamed from: i */
    private Runnable f10414i;

    /* JADX INFO: renamed from: j */
    private C2087z f10415j;

    /* JADX INFO: renamed from: k */
    private cht f10416k;

    public cne(Context context, C2006w c2006w, cnd cndVar, bwk bwkVar) {
        this.f10407b = cndVar;
        this.f10410e = context;
        this.f10408c = c2006w;
        this.f10412g = bwkVar;
        this.f10411f = new bwf(this.f10412g, ((Boolean) bxm.m10409f().m10546a(can.f9543cJ)).booleanValue());
        this.f10411f.m10355a(new bwg(this) { // from class: com.google.android.gms.internal.cnf

            /* JADX INFO: renamed from: a */
            private final cne f10417a;

            {
                this.f10417a = this;
            }

            @Override // com.google.android.gms.internal.bwg
            /* JADX INFO: renamed from: a */
            public final void mo5605a(bwq bwqVar) {
                this.f10417a.m11153b(bwqVar);
            }
        });
        final bwr bwrVar = new bwr();
        bwrVar.f9202a = Integer.valueOf(this.f10408c.f11879j.f10856b);
        bwrVar.f9203b = Integer.valueOf(this.f10408c.f11879j.f10857c);
        bwrVar.f9204c = Integer.valueOf(this.f10408c.f11879j.f10858d ? 0 : 2);
        this.f10411f.m10355a(new bwg(bwrVar) { // from class: com.google.android.gms.internal.c

            /* JADX INFO: renamed from: a */
            private final bwr f9382a;

            {
                this.f9382a = bwrVar;
            }

            @Override // com.google.android.gms.internal.bwg
            /* JADX INFO: renamed from: a */
            public final void mo5605a(bwq bwqVar) {
                bwqVar.f9200c.f9197b = this.f9382a;
            }
        });
        if (this.f10408c.f11875f != null) {
            this.f10411f.m10355a(new bwg(this) { // from class: com.google.android.gms.internal.d

                /* JADX INFO: renamed from: a */
                private final cne f10420a;

                {
                    this.f10420a = this;
                }

                @Override // com.google.android.gms.internal.bwg
                /* JADX INFO: renamed from: a */
                public final void mo5605a(bwq bwqVar) {
                    this.f10420a.m11151a(bwqVar);
                }
            });
        }
        bxb bxbVar = this.f10408c.f11872c;
        if (bxbVar.f9250d && "interstitial_mb".equals(bxbVar.f9247a)) {
            this.f10411f.m10355a(C1520e.f10492a);
        } else if (bxbVar.f9250d && "reward_mb".equals(bxbVar.f9247a)) {
            this.f10411f.m10355a(C1547f.f10624a);
        } else if (bxbVar.f9254h || bxbVar.f9250d) {
            this.f10411f.m10355a(C1601h.f10726a);
        } else {
            this.f10411f.m10355a(C1574g.f10677a);
        }
        this.f10411f.m10356a(bwh.C1461a.b.AD_REQUEST);
    }

    /* JADX INFO: renamed from: a */
    private final bxb m11144a(C1979v c1979v) throws C1682k {
        if (((this.f10413h == null || this.f10413h.f11744V == null || this.f10413h.f11744V.size() <= 1) ? false : true) && this.f10416k != null && !this.f10416k.f10052s) {
            return null;
        }
        if (this.f10415j.f12633y) {
            for (bxb bxbVar : c1979v.f11754d.f9253g) {
                if (bxbVar.f9255i) {
                    return new bxb(bxbVar, c1979v.f11754d.f9253g);
                }
            }
        }
        if (this.f10415j.f12620l == null) {
            throw new C1682k("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] strArrSplit = this.f10415j.f12620l.split("x");
        if (strArrSplit.length != 2) {
            String strValueOf = String.valueOf(this.f10415j.f12620l);
            throw new C1682k(strValueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(strValueOf) : new String("Invalid ad size format from the ad response: "), 0);
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            for (bxb bxbVar2 : c1979v.f11754d.f9253g) {
                float f = this.f10410e.getResources().getDisplayMetrics().density;
                int i3 = bxbVar2.f9251e == -1 ? (int) (bxbVar2.f9252f / f) : bxbVar2.f9251e;
                int i4 = bxbVar2.f9248b == -2 ? (int) (bxbVar2.f9249c / f) : bxbVar2.f9248b;
                if (i == i3 && i2 == i4 && !bxbVar2.f9255i) {
                    return new bxb(bxbVar2, c1979v.f11754d.f9253g);
                }
            }
            String strValueOf2 = String.valueOf(this.f10415j.f12620l);
            throw new C1682k(strValueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(strValueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
        } catch (NumberFormatException e) {
            String strValueOf3 = String.valueOf(this.f10415j.f12620l);
            throw new C1682k(strValueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(strValueOf3) : new String("Invalid ad size number from the ad response: "), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11146a(int i, String str) {
        if (i == 3 || i == -1) {
            C1560fm.m11614d(str);
        } else {
            C1560fm.m11615e(str);
        }
        if (this.f10415j == null) {
            this.f10415j = new C2087z(i);
        } else {
            this.f10415j = new C2087z(i, this.f10415j.f12618j);
        }
        this.f10407b.mo5462a(new C1542ev(this.f10413h != null ? this.f10413h : new C1979v(this.f10408c, -1L, null, null, null), this.f10415j, this.f10416k, null, i, -1L, this.f10415j.f12621m, null, this.f10411f, null));
    }

    /* JADX INFO: renamed from: a */
    final InterfaceC1616ho m11150a(C1670jo c1670jo, InterfaceC1702kt<C1979v> interfaceC1702kt) {
        Context context = this.f10410e;
        if (new C1736m(context).mo11733a(c1670jo)) {
            C1560fm.m11610b("Fetching ad response from local ad request service.");
            C1898s c1898s = new C1898s(context, interfaceC1702kt, this);
            c1898s.mo11076d();
            return c1898s;
        }
        C1560fm.m11610b("Fetching ad response from remote ad request service.");
        bxm.m10404a();
        if (C1657jb.m11576c(context)) {
            return new C1925t(context, c1670jo, interfaceC1702kt, this);
        }
        C1560fm.m11615e("Failed to connect to remote ad request service.");
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        String string;
        C1560fm.m11610b("AdLoaderBackgroundTask started.");
        this.f10414i = new RunnableC1628i(this);
        C1596gv.f10711a.postDelayed(this.f10414i, ((Long) bxm.m10409f().m10546a(can.f9519bm)).longValue());
        long jMo7253b = C0710au.m5575k().mo7253b();
        if (((Boolean) bxm.m10409f().m10546a(can.f9517bk)).booleanValue() && this.f10408c.f11871b.f9209c != null && (string = this.f10408c.f11871b.f9209c.getString("_ad")) != null) {
            this.f10413h = new C1979v(this.f10408c, jMo7253b, null, null, null);
            mo11152a(C1433bk.m9511a(this.f10410e, this.f10413h, string));
            return;
        }
        C1706kx c1706kx = new C1706kx();
        C1590gp.m11370a(new RunnableC1655j(this, c1706kx));
        String strM11247g = C0710au.m5590z().m11247g(this.f10410e);
        String strM11248h = C0710au.m5590z().m11248h(this.f10410e);
        String strM11249i = C0710au.m5590z().m11249i(this.f10410e);
        C0710au.m5590z().m11246f(this.f10410e, strM11249i);
        this.f10413h = new C1979v(this.f10408c, jMo7253b, strM11247g, strM11248h, strM11249i);
        c1706kx.mo11660a(this.f10413h);
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m11151a(bwq bwqVar) {
        bwqVar.f9200c.f9196a = this.f10408c.f11875f.packageName;
    }

    @Override // com.google.android.gms.internal.InterfaceC1763n
    /* JADX INFO: renamed from: a */
    public final void mo11152a(C2087z c2087z) {
        JSONObject jSONObject;
        Boolean boolValueOf;
        Boolean bool = null;
        C1560fm.m11610b("Received ad response.");
        this.f10415j = c2087z;
        long jMo7253b = C0710au.m5575k().mo7253b();
        synchronized (this.f10409d) {
            this.f10406a = null;
        }
        C0710au.m5573i().m11296b(this.f10410e, this.f10415j.f12594F);
        if (((Boolean) bxm.m10409f().m10546a(can.f9433aF)).booleanValue()) {
            if (this.f10415j.f12602N) {
                C0710au.m5573i();
                Context context = this.f10410e;
                String str = this.f10413h.f11755e;
                SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (!stringSet.contains(str)) {
                    HashSet hashSet = new HashSet(stringSet);
                    hashSet.add(str);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putStringSet("never_pool_slots", hashSet);
                    editorEdit.apply();
                }
            } else {
                C0710au.m5573i();
                Context context2 = this.f10410e;
                String str2 = this.f10413h.f11755e;
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("admob", 0);
                Set<String> stringSet2 = sharedPreferences2.getStringSet("never_pool_slots", Collections.emptySet());
                if (stringSet2.contains(str2)) {
                    HashSet hashSet2 = new HashSet(stringSet2);
                    hashSet2.remove(str2);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putStringSet("never_pool_slots", hashSet2);
                    editorEdit2.apply();
                }
            }
        }
        try {
            if (this.f10415j.f12612d != -2 && this.f10415j.f12612d != -3) {
                throw new C1682k(new StringBuilder(66).append("There was a problem getting an ad response. ErrorCode: ").append(this.f10415j.f12612d).toString(), this.f10415j.f12612d);
            }
            if (this.f10415j.f12612d != -3) {
                if (TextUtils.isEmpty(this.f10415j.f12610b)) {
                    throw new C1682k("No fill from ad server.", 3);
                }
                C0710au.m5573i().m11285a(this.f10410e, this.f10415j.f12628t);
                if (this.f10415j.f12615g) {
                    try {
                        this.f10416k = new cht(this.f10415j.f12610b);
                        C0710au.m5573i().m11301c(this.f10416k.f10040g);
                    } catch (JSONException e) {
                        C1560fm.m11611b("Could not parse mediation config.", e);
                        String strValueOf = String.valueOf(this.f10415j.f12610b);
                        throw new C1682k(strValueOf.length() != 0 ? "Could not parse mediation config: ".concat(strValueOf) : new String("Could not parse mediation config: "), 0);
                    }
                } else {
                    C0710au.m5573i().m11301c(this.f10415j.f12597I);
                }
                if (!TextUtils.isEmpty(this.f10415j.f12595G)) {
                    if (((Boolean) bxm.m10409f().m10546a(can.f9572cm)).booleanValue()) {
                        C1560fm.m11610b("Received cookie from server. Setting webview cookie in CookieManager.");
                        CookieManager cookieManagerMo11476c = C0710au.m5571g().mo11476c(this.f10410e);
                        if (cookieManagerMo11476c != null) {
                            cookieManagerMo11476c.setCookie("googleads.g.doubleclick.net", this.f10415j.f12595G);
                        }
                    }
                }
            }
            bxb bxbVarM11144a = this.f10413h.f11754d.f9253g != null ? m11144a(this.f10413h) : null;
            C0710au.m5573i().m11294a(this.f10415j.f12629u);
            C0710au.m5573i().m11298b(this.f10415j.f12601M);
            if (TextUtils.isEmpty(this.f10415j.f12625q)) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(this.f10415j.f12625q);
                } catch (Exception e2) {
                    C1560fm.m11611b("Error parsing the JSON for Active View.", e2);
                    jSONObject = null;
                }
            }
            if (this.f10415j.f12604P == 2) {
                bool = true;
                C0710au.m5569e();
                C1596gv.m11393a(this.f10413h.f11753c, true);
            }
            if (this.f10415j.f12604P == 1) {
                bool = false;
            }
            if (this.f10415j.f12604P == 0) {
                C0710au.m5569e();
                boolValueOf = Boolean.valueOf(C1596gv.m11401a(this.f10413h.f11753c));
            } else {
                boolValueOf = bool;
            }
            this.f10407b.mo5462a(new C1542ev(this.f10413h, this.f10415j, this.f10416k, bxbVarM11144a, -2, jMo7253b, this.f10415j.f12621m, jSONObject, this.f10411f, boolValueOf));
            C1596gv.f10711a.removeCallbacks(this.f10414i);
        } catch (C1682k e3) {
            m11146a(e3.m11630a(), e3.getMessage());
            C1596gv.f10711a.removeCallbacks(this.f10414i);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
        synchronized (this.f10409d) {
            if (this.f10406a != null) {
                this.f10406a.mo11075c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m11153b(bwq bwqVar) {
        bwqVar.f9198a = this.f10408c.f11891v;
    }
}
