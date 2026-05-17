package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.overlay.InterfaceC0839n;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.AbstractC1556fi;
import com.google.android.gms.internal.C1377ar;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1543ew;
import com.google.android.gms.internal.C1545ey;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1590gp;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1603hb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C2006w;
import com.google.android.gms.internal.C2040xg;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceFutureC1689kg;
import com.google.android.gms.internal.buw;
import com.google.android.gms.internal.bwh;
import com.google.android.gms.internal.bwk;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bzd;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.ccm;
import com.google.android.gms.internal.cdv;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cgu;
import com.google.android.gms.internal.chu;
import com.google.android.gms.internal.cib;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.internal.cne;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ay */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractBinderC0714ay extends AbstractBinderC0689a implements InterfaceC0703an, InterfaceC0839n, chu {

    /* JADX INFO: renamed from: i */
    protected final cii f4545i;

    /* JADX INFO: renamed from: j */
    private transient boolean f4546j;

    public AbstractBinderC0714ay(Context context, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        this(new ViewTreeObserverOnGlobalLayoutListenerC0711av(context, bxbVar, str, c1670jo), ciiVar, null, c0733bq);
    }

    private AbstractBinderC0714ay(ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av, cii ciiVar, C0700ak c0700ak, C0733bq c0733bq) {
        super(viewTreeObserverOnGlobalLayoutListenerC0711av, null, c0733bq);
        this.f4545i = ciiVar;
        this.f4546j = false;
    }

    /* JADX INFO: renamed from: a */
    private final C2006w m5606a(bwx bwxVar, Bundle bundle, C1545ey c1545ey, int i) {
        PackageInfo packageInfoM12560b;
        JSONArray jSONArrayOptJSONArray;
        ApplicationInfo applicationInfo = this.f4405e.f4517c.getApplicationInfo();
        try {
            packageInfoM12560b = C2040xg.m12562a(this.f4405e.f4517c).m12560b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfoM12560b = null;
        }
        DisplayMetrics displayMetrics = this.f4405e.f4517c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (this.f4405e.f4520f != null && this.f4405e.f4520f.getParent() != null) {
            int[] iArr = new int[2];
            this.f4405e.f4520f.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = this.f4405e.f4520f.getWidth();
            int height = this.f4405e.f4520f.getHeight();
            int i4 = 0;
            if (this.f4405e.f4520f.isShown() && i2 + width > 0 && i3 + height > 0 && i2 <= displayMetrics.widthPixels && i3 <= displayMetrics.heightPixels) {
                i4 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i2);
            bundle2.putInt("y", i3);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i4);
        }
        String strM11300c = C0710au.m5573i().m11300c();
        this.f4405e.f4526l = new C1543ew(strM11300c, this.f4405e.f4516b);
        this.f4405e.f4526l.m11259a(bwxVar);
        C0710au.m5569e();
        String strM11380a = C1596gv.m11380a(this.f4405e.f4517c, this.f4405e.f4520f, this.f4405e.f4523i);
        long jMo10411a = 0;
        if (this.f4405e.f4530p != null) {
            try {
                jMo10411a = this.f4405e.f4530p.mo10411a();
            } catch (RemoteException e2) {
                C1560fm.m11615e("Cannot get correlation id, default to 0.");
            }
        }
        String string = UUID.randomUUID().toString();
        Bundle bundleM11279a = C0710au.m5573i().m11279a(this.f4405e.f4517c, this, strM11300c);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= this.f4405e.f4534t.size()) {
                break;
            }
            String strM1583b = this.f4405e.f4534t.m1583b(i6);
            arrayList.add(strM1583b);
            if (this.f4405e.f4533s.containsKey(strM1583b) && this.f4405e.f4533s.get(strM1583b) != null) {
                arrayList2.add(strM1583b);
            }
            i5 = i6 + 1;
        }
        InterfaceFutureC1689kg interfaceFutureC1689kgM11371a = C1590gp.m11371a(C1590gp.f10701a, new CallableC0715az(this));
        InterfaceFutureC1689kg interfaceFutureC1689kgM11371a2 = C1590gp.m11371a(C1590gp.f10701a, new CallableC0717ba(this));
        String strM11274c = c1545ey != null ? c1545ey.m11274c() : null;
        String string2 = null;
        if (this.f4405e.f4503C != null && this.f4405e.f4503C.size() > 0) {
            int i7 = packageInfoM12560b != null ? packageInfoM12560b.versionCode : 0;
            if (i7 > C0710au.m5573i().m11311m()) {
                C0710au.m5573i().m11318t();
                C0710au.m5573i().m11282a(i7);
            } else {
                JSONObject jSONObjectM11317s = C0710au.m5573i().m11317s();
                if (jSONObjectM11317s != null && (jSONArrayOptJSONArray = jSONObjectM11317s.optJSONArray(this.f4405e.f4516b)) != null) {
                    string2 = jSONArrayOptJSONArray.toString();
                }
            }
        }
        bxb bxbVar = this.f4405e.f4523i;
        String str = this.f4405e.f4516b;
        String strM10406c = bxm.m10406c();
        C1670jo c1670jo = this.f4405e.f4519e;
        List<String> list = this.f4405e.f4503C;
        boolean zM11304f = C0710au.m5573i().m11304f();
        int i8 = displayMetrics.widthPixels;
        int i9 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        List<String> listM10548a = can.m10548a();
        String str2 = this.f4405e.f4515a;
        ccm ccmVar = this.f4405e.f4535u;
        String strM5600f = this.f4405e.m5600f();
        C0710au.m5569e();
        float fM11413c = C1596gv.m11413c();
        C0710au.m5569e();
        boolean zM11419d = C1596gv.m11419d();
        C0710au.m5569e();
        int iM11433k = C1596gv.m11433k(this.f4405e.f4517c);
        C0710au.m5569e();
        int iM11417d = C1596gv.m11417d(this.f4405e.f4520f);
        boolean z = this.f4405e.f4517c instanceof Activity;
        boolean zM11308j = C0710au.m5573i().m11308j();
        boolean zM11313o = C0710au.m5573i().m11313o();
        int iM11783a = C0710au.m5588x().m11783a();
        C0710au.m5569e();
        Bundle bundleM11422e = C1596gv.m11422e();
        String strM11514a = C0710au.m5578n().m11514a();
        bzd bzdVar = this.f4405e.f4537w;
        boolean zM11518b = C0710au.m5578n().m11518b();
        Bundle bundleM10844j = cgu.m10834a().m10844j();
        C0710au.m5573i();
        boolean zContains = this.f4405e.f4517c.getSharedPreferences("admob", 0).getStringSet("never_pool_slots", Collections.emptySet()).contains(this.f4405e.f4516b);
        List<Integer> list2 = this.f4405e.f4539y;
        boolean zM12557a = C2040xg.m12562a(this.f4405e.f4517c).m12557a();
        boolean zM11314p = C0710au.m5573i().m11314p();
        C0710au.m5571g();
        return new C2006w(bundle2, bwxVar, bxbVar, str, applicationInfo, packageInfoM12560b, strM11300c, strM10406c, c1670jo, bundleM11279a, list, arrayList, bundle, zM11304f, i8, i9, f, strM11380a, jMo10411a, string, listM10548a, str2, ccmVar, strM5600f, fM11413c, zM11419d, iM11433k, iM11417d, z, zM11308j, interfaceFutureC1689kgM11371a, strM11274c, zM11313o, iM11783a, bundleM11422e, strM11514a, bzdVar, zM11518b, bundleM10844j, zContains, interfaceFutureC1689kgM11371a2, list2, string2, arrayList2, i, zM12557a, zM11314p, C1603hb.m11458e());
    }

    /* JADX INFO: renamed from: c */
    static String m5607c(C1541eu c1541eu) {
        if (c1541eu == null) {
            return null;
        }
        String str = c1541eu.f10549p;
        if (!("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) || c1541eu.f10547n == null) {
            return str;
        }
        try {
            return new JSONObject(c1541eu.f10547n.f10024j).getString("class_name");
        } catch (NullPointerException e) {
            return str;
        } catch (JSONException e2) {
            return str;
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo5503D() {
        C1560fm.m11615e("showInterstitial is not supported for current ad type");
    }

    /* JADX INFO: renamed from: O */
    public void mo5514O() {
        mo5308e();
    }

    /* JADX INFO: renamed from: P */
    public void mo5515P() {
        m5613W();
    }

    /* JADX INFO: renamed from: Q */
    public void mo5516Q() {
        C1560fm.m11615e("Mediated ad does not support onVideoEnd callback");
    }

    /* JADX INFO: renamed from: R */
    protected boolean mo5608R() {
        C0710au.m5569e();
        if (C1596gv.m11400a(this.f4405e.f4517c, this.f4405e.f4517c.getPackageName(), "android.permission.INTERNET")) {
            C0710au.m5569e();
            if (C1596gv.m11399a(this.f4405e.f4517c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: S */
    public final void mo5609S() {
        mo5618b();
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: T */
    public final void mo5610T() {
        m5490t();
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: U */
    public final void mo5611U() {
        mo5622f();
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: V */
    public final void mo5612V() {
        if (this.f4405e.f4524j != null) {
            String str = this.f4405e.f4524j.f10549p;
            C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        mo5615a(this.f4405e.f4524j, true);
        mo5492v();
    }

    /* JADX INFO: renamed from: W */
    public final void m5613W() {
        mo5615a(this.f4405e.f4524j, false);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final String mo5549a() {
        if (this.f4405e.f4524j == null) {
            return null;
        }
        return this.f4405e.f4524j.f10549p;
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: a */
    public final void mo5614a(cdv cdvVar, String str) {
        String strMo10624l;
        cef cefVar = null;
        if (cdvVar != null) {
            try {
                strMo10624l = cdvVar.mo10624l();
            } catch (RemoteException e) {
                C1560fm.m11613c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            strMo10624l = null;
        }
        if (this.f4405e.f4533s != null && strMo10624l != null) {
            cefVar = this.f4405e.f4533s.get(strMo10624l);
        }
        if (cefVar == null) {
            C1560fm.m11615e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            cefVar.mo10751a(cdvVar, str);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo5615a(C1541eu c1541eu, boolean z) {
        if (c1541eu == null) {
            C1560fm.m11615e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (c1541eu == null) {
            C1560fm.m11615e("Ad state was null when trying to ping impression URLs.");
        } else {
            C1560fm.m11610b("Pinging Impression URLs.");
            if (this.f4405e.f4526l != null) {
                this.f4405e.f4526l.m11257a();
            }
            c1541eu.f10528H.m10356a(bwh.C1461a.b.AD_IMPRESSION);
            if (c1541eu.f10538e != null && !c1541eu.f10523C) {
                C0710au.m5569e();
                C1596gv.m11392a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, m5446a(c1541eu.f10538e));
                c1541eu.f10523C = true;
            }
        }
        if (!c1541eu.f10524D || z) {
            if (c1541eu.f10550q != null && c1541eu.f10550q.f10037d != null) {
                C0710au.m5586v();
                cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, c1541eu, this.f4405e.f4516b, z, m5446a(c1541eu.f10550q.f10037d));
            }
            if (c1541eu.f10547n != null && c1541eu.f10547n.f10021g != null) {
                C0710au.m5586v();
                cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, c1541eu, this.f4405e.f4516b, z, c1541eu.f10547n.f10021g);
            }
            c1541eu.f10524D = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public boolean mo5467a(bwx bwxVar, cba cbaVar) {
        return m5616a(bwxVar, cbaVar, 1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5616a(bwx bwxVar, cba cbaVar, int i) {
        C1545ey c1545eyM11316r;
        if (!mo5608R()) {
            return false;
        }
        C0710au.m5569e();
        buw buwVarM11280a = C0710au.m5573i().m11280a(this.f4405e.f4517c);
        Bundle bundleM11375a = buwVarM11280a == null ? null : C1596gv.m11375a(buwVarM11280a);
        this.f4404d.m5527a();
        this.f4405e.f4506F = 0;
        if (((Boolean) bxm.m10409f().m10546a(can.f9562cc)).booleanValue()) {
            c1545eyM11316r = C0710au.m5573i().m11316r();
            C0710au.m5576l().m5651a(this.f4405e.f4517c, this.f4405e.f4519e, false, c1545eyM11316r, c1545eyM11316r != null ? c1545eyM11316r.m11275d() : null, this.f4405e.f4516b, null);
        } else {
            c1545eyM11316r = null;
        }
        return m5617a(m5606a(bwxVar, bundleM11375a, c1545eyM11316r, i), cbaVar);
    }

    /* JADX INFO: renamed from: a */
    protected boolean mo5520a(bwx bwxVar, C1541eu c1541eu, boolean z) {
        if (!z && this.f4405e.m5598d()) {
            if (c1541eu.f10541h > 0) {
                this.f4404d.m5529a(bwxVar, c1541eu.f10541h);
            } else if (c1541eu.f10550q != null && c1541eu.f10550q.f10042i > 0) {
                this.f4404d.m5529a(bwxVar, c1541eu.f10550q.f10042i);
            } else if (!c1541eu.f10546m && c1541eu.f10537d == 2) {
                this.f4404d.m5531b(bwxVar);
            }
        }
        return this.f4404d.m5533d();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    final boolean mo5468a(C1541eu c1541eu) {
        bwx bwxVar;
        boolean z = false;
        if (this.f4406f != null) {
            bwxVar = this.f4406f;
            this.f4406f = null;
        } else {
            bwxVar = c1541eu.f10534a;
            if (bwxVar.f9209c != null) {
                z = bwxVar.f9209c.getBoolean("_noRefresh", false);
            }
        }
        return mo5520a(bwxVar, c1541eu, z);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        int i;
        int i2 = 0;
        if (c1541eu != null && c1541eu.f10551r != null) {
            c1541eu.f10551r.m10871a((chu) null);
        }
        if (c1541eu2.f10551r != null) {
            c1541eu2.f10551r.m10871a(this);
        }
        if (c1541eu2.f10550q != null) {
            i = c1541eu2.f10550q.f10050q;
            i2 = c1541eu2.f10550q.f10051r;
        } else {
            i = 0;
        }
        this.f4405e.f4504D.m11336a(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5617a(C2006w c2006w, cba cbaVar) {
        this.f4401a = cbaVar;
        cbaVar.m10579a("seq_num", c2006w.f11876g);
        cbaVar.m10579a("request_id", c2006w.f11891v);
        cbaVar.m10579a("session_id", c2006w.f11877h);
        if (c2006w.f11875f != null) {
            cbaVar.m10579a("app_version", String.valueOf(c2006w.f11875f.versionCode));
        }
        ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
        C0710au.m5565a();
        Context context = this.f4405e.f4517c;
        bwk bwkVar = this.f4408h.f4579d;
        AbstractC1556fi c1377ar = c2006w.f11871b.f9209c.getBundle("sdk_less_server_data") != null ? new C1377ar(context, c2006w, this, bwkVar) : new cne(context, c2006w, this, bwkVar);
        c1377ar.m11341h();
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4521g = c1377ar;
        return true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: b */
    public void mo5618b() {
        this.f4546j = false;
        mo5489s();
        this.f4405e.f4526l.m11264c();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.clg
    /* JADX INFO: renamed from: b */
    public final void mo5471b(C1541eu c1541eu) {
        super.mo5471b(c1541eu);
        if (c1541eu.f10547n != null) {
            C1560fm.m11610b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f4405e.f4520f != null) {
                this.f4405e.f4520f.m5604d();
            }
            C1560fm.m11610b("Pinging network fill URLs.");
            C0710au.m5586v();
            cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, c1541eu, this.f4405e.f4516b, false, c1541eu.f10547n.f10023i);
            if (c1541eu.f10550q != null && c1541eu.f10550q.f10039f != null && c1541eu.f10550q.f10039f.size() > 0) {
                C1560fm.m11610b("Pinging urls remotely");
                C0710au.m5569e().m11445a(this.f4405e.f4517c, c1541eu.f10550q.f10039f);
            }
        } else {
            C1560fm.m11610b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f4405e.f4520f != null) {
                this.f4405e.f4520f.m5603c();
            }
        }
        if (c1541eu.f10537d != 3 || c1541eu.f10550q == null || c1541eu.f10550q.f10038e == null) {
            return;
        }
        C1560fm.m11610b("Pinging no fill URLs.");
        C0710au.m5586v();
        cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, c1541eu, this.f4405e.f4516b, false, c1541eu.f10550q.f10038e);
    }

    @Override // com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: b */
    public final void mo5619b(String str, String str2) {
        mo5465a(str, str2);
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: c */
    public final void mo5620c() {
        this.f4407g.m10206c(this.f4405e.f4524j);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: c */
    protected final boolean mo5475c(bwx bwxVar) {
        return super.mo5475c(bwxVar) && !this.f4546j;
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: d */
    public final void mo5621d() {
        this.f4407g.m10207d(this.f4405e.f4524j);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.bws
    /* JADX INFO: renamed from: e */
    public void mo5308e() {
        if (this.f4405e.f4524j == null) {
            C1560fm.m11615e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (this.f4405e.f4524j.f10550q != null && this.f4405e.f4524j.f10550q.f10036c != null) {
            C0710au.m5586v();
            cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j, this.f4405e.f4516b, false, m5446a(this.f4405e.f4524j.f10550q.f10036c));
        }
        if (this.f4405e.f4524j.f10547n != null && this.f4405e.f4524j.f10547n.f10020f != null) {
            C0710au.m5586v();
            cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j, this.f4405e.f4516b, false, this.f4405e.f4524j.f10547n.f10020f);
        }
        super.mo5308e();
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: f */
    public void mo5622f() {
        this.f4546j = true;
        m5491u();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: f_ */
    public final String mo5554f_() {
        if (this.f4405e.f4524j == null) {
            return null;
        }
        return m5607c(this.f4405e.f4524j);
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: g_ */
    public final void mo5536g_() {
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC0718bb(this));
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: h_ */
    public final void mo5537h_() {
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC0719bc(this));
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public void mo5484n() {
        C1221aj.m7073b("pause must be called on the main UI thread.");
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10535b != null && this.f4405e.m5598d()) {
            C0710au.m5571g();
            C1603hb.m11456a(this.f4405e.f4524j.f10535b);
        }
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10548o != null) {
            try {
                this.f4405e.f4524j.f10548o.mo10955d();
            } catch (RemoteException e) {
                C1560fm.m11615e("Could not pause mediation adapter.");
            }
        }
        this.f4407g.m10206c(this.f4405e.f4524j);
        this.f4404d.m5530b();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public void mo5485o() {
        C1221aj.m7073b("resume must be called on the main UI thread.");
        InterfaceC1758mv interfaceC1758mv = null;
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10535b != null) {
            interfaceC1758mv = this.f4405e.f4524j.f10535b;
        }
        if (interfaceC1758mv != null && this.f4405e.m5598d()) {
            C0710au.m5571g();
            C1603hb.m11457b(this.f4405e.f4524j.f10535b);
        }
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10548o != null) {
            try {
                this.f4405e.f4524j.f10548o.mo10956e();
            } catch (RemoteException e) {
                C1560fm.m11615e("Could not resume mediation adapter.");
            }
        }
        if (interfaceC1758mv == null || !interfaceC1758mv.mo11801E()) {
            this.f4404d.m5532c();
        }
        this.f4407g.m10207d(this.f4405e.f4524j);
    }
}
