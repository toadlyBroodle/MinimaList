package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.AbstractBinderC0714ay;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.ViewTreeObserverOnGlobalLayoutListenerC0711av;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.cj */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1476cj extends AbstractBinderC0714ay implements InterfaceC1504dk {

    /* JADX INFO: renamed from: j */
    private static BinderC1476cj f10136j;

    /* JADX INFO: renamed from: k */
    private static final cih f10137k = new cih();

    /* JADX INFO: renamed from: l */
    private final Map<String, C1510dq> f10138l;

    /* JADX INFO: renamed from: m */
    private boolean f10139m;

    /* JADX INFO: renamed from: n */
    private boolean f10140n;

    /* JADX INFO: renamed from: o */
    private C1531ek f10141o;

    public BinderC1476cj(Context context, C0733bq c0733bq, bxb bxbVar, cii ciiVar, C1670jo c1670jo) {
        super(context, bxbVar, null, ciiVar, c1670jo, c0733bq);
        this.f10138l = new HashMap();
        f10136j = this;
        this.f10141o = new C1531ek(context, null);
    }

    /* JADX INFO: renamed from: E */
    public static BinderC1476cj m11005E() {
        return f10136j;
    }

    /* JADX INFO: renamed from: b */
    private static C1542ev m11007b(C1542ev c1542ev) {
        C1560fm.m11343a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String string = C1433bk.m9516a(c1542ev.f10561b).toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, c1542ev.f10560a.f11755e);
            return new C1542ev(c1542ev.f10560a, c1542ev.f10561b, new cht(Arrays.asList(new chs(string, null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L)), ((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false), c1542ev.f10563d, c1542ev.f10564e, c1542ev.f10565f, c1542ev.f10566g, c1542ev.f10567h, c1542ev.f10568i, null);
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new C1542ev(c1542ev.f10560a, c1542ev.f10561b, null, c1542ev.f10563d, 0, c1542ev.f10565f, c1542ev.f10566g, c1542ev.f10567h, c1542ev.f10568i, null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11008F() {
        C1221aj.m7073b("showAd must be called on the main UI thread.");
        if (!m11009G()) {
            C1560fm.m11615e("The reward video has not loaded.");
            return;
        }
        this.f10139m = true;
        C1510dq c1510dqM11018b = m11018b(this.f4405e.f4524j.f10549p);
        if (c1510dqM11018b == null || c1510dqM11018b.m11199a() == null) {
            return;
        }
        try {
            c1510dqM11018b.m11199a().mo10952a(this.f10140n);
            c1510dqM11018b.m11199a().mo10957f();
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call showVideo.", e);
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m11009G() {
        C1221aj.m7073b("isLoaded must be called on the main UI thread.");
        return this.f4405e.f4521g == null && this.f4405e.f4522h == null && this.f4405e.f4524j != null && !this.f10139m;
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: H */
    public final void mo11010H() {
        if (C0710au.m5590z().m11244e(this.f4405e.f4517c)) {
            this.f10141o.m11222a(true);
        }
        mo5615a(this.f4405e.f4524j, false);
        m5491u();
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: I */
    public final void mo11011I() {
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10547n != null) {
            C0710au.m5586v();
            cib.m10920a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j, this.f4405e.f4516b, false, this.f4405e.f4524j.f10547n.f10025k);
        }
        m5495y();
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: J */
    public final void mo11012J() {
        if (C0710au.m5590z().m11244e(this.f4405e.f4517c)) {
            this.f10141o.m11222a(false);
        }
        mo5489s();
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: K */
    public final void mo11013K() {
        mo5308e();
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: L */
    public final void mo11014L() {
        m5490t();
    }

    /* JADX INFO: renamed from: a */
    public final void m11015a(Context context) {
        Iterator<C1510dq> it = this.f10138l.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().m11199a().mo10942a(BinderC0654c.m5329a(context));
            } catch (RemoteException e) {
                C1560fm.m11611b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11016a(C1494da c1494da) {
        C1221aj.m7073b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(c1494da.f10422b)) {
            C1560fm.m11615e("Invalid ad unit id. Aborting.");
            C1596gv.f10711a.post(new RunnableC1477ck(this));
            return;
        }
        this.f10139m = false;
        this.f4405e.f4516b = c1494da.f10422b;
        this.f10141o.m11221a(c1494da.f10422b);
        super.mo5473b(c1494da.f10421a);
    }

    @Override // com.google.android.gms.internal.InterfaceC1504dk
    /* JADX INFO: renamed from: a */
    public final void mo11017a(C1515dv c1515dv) {
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10550q != null && !TextUtils.isEmpty(this.f4405e.f4524j.f10550q.f10043j)) {
            c1515dv = new C1515dv(this.f4405e.f4524j.f10550q.f10043j, this.f4405e.f4524j.f10550q.f10044k);
        }
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10547n != null) {
            C0710au.m5586v();
            cib.m10921a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j.f10547n.f10026l, this.f4405e.f4502B, c1515dv);
        }
        if (C0710au.m5590z().m11244e(this.f4405e.f4517c) && c1515dv != null) {
            C0710au.m5590z().m11235a(this.f4405e.f4517c, C0710au.m5590z().m11249i(this.f4405e.f4517c), this.f4405e.f4516b, c1515dv.f10475a, c1515dv.f10476b);
        }
        m5470b(c1515dv);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final void mo5463a(C1542ev c1542ev, cba cbaVar) {
        if (c1542ev.f10564e != -2) {
            C1596gv.f10711a.post(new RunnableC1478cl(this, c1542ev));
            return;
        }
        this.f4405e.f4525k = c1542ev;
        if (c1542ev.f10562c == null) {
            this.f4405e.f4525k = m11007b(c1542ev);
        }
        this.f4405e.f4506F = 0;
        ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
        C0710au.m5568d();
        C1507dn c1507dn = new C1507dn(this.f4405e.f4517c, this.f4405e.f4525k, this);
        String strValueOf = String.valueOf(c1507dn.getClass().getName());
        C1560fm.m11610b(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
        c1507dn.mo11076d();
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4522h = c1507dn;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: a */
    protected final boolean mo5520a(bwx bwxVar, C1541eu c1541eu, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C1510dq m11018b(String str) {
        Exception exc;
        C1510dq c1510dq;
        C1510dq c1510dq2 = this.f10138l.get(str);
        if (c1510dq2 != null) {
            return c1510dq2;
        }
        try {
            c1510dq = new C1510dq(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? f10137k : this.f4545i).mo10934a(str), this);
        } catch (Exception e) {
            exc = e;
            c1510dq = c1510dq2;
        }
        try {
            this.f10138l.put(str, c1510dq);
            return c1510dq;
        } catch (Exception e2) {
            exc = e2;
            String strValueOf = String.valueOf(str);
            C1560fm.m11613c(strValueOf.length() != 0 ? "Fail to instantiate adapter ".concat(strValueOf) : new String("Fail to instantiate adapter "), exc);
            return c1510dq;
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public final void mo5474c(boolean z) {
        C1221aj.m7073b("setImmersiveMode must be called on the main UI thread.");
        this.f10140n = z;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: i */
    public final void mo5479i() {
        C1221aj.m7073b("destroy must be called on the main UI thread.");
        for (String str : this.f10138l.keySet()) {
            try {
                C1510dq c1510dq = this.f10138l.get(str);
                if (c1510dq != null && c1510dq.m11199a() != null) {
                    c1510dq.m11199a().mo10954c();
                }
            } catch (RemoteException e) {
                String strValueOf = String.valueOf(str);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Fail to destroy adapter: ".concat(strValueOf) : new String("Fail to destroy adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        C1221aj.m7073b("pause must be called on the main UI thread.");
        for (String str : this.f10138l.keySet()) {
            try {
                C1510dq c1510dq = this.f10138l.get(str);
                if (c1510dq != null && c1510dq.m11199a() != null) {
                    c1510dq.m11199a().mo10955d();
                }
            } catch (RemoteException e) {
                String strValueOf = String.valueOf(str);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Fail to pause adapter: ".concat(strValueOf) : new String("Fail to pause adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        C1221aj.m7073b("resume must be called on the main UI thread.");
        for (String str : this.f10138l.keySet()) {
            try {
                C1510dq c1510dq = this.f10138l.get(str);
                if (c1510dq != null && c1510dq.m11199a() != null) {
                    c1510dq.m11199a().mo10956e();
                }
            } catch (RemoteException e) {
                String strValueOf = String.valueOf(str);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Fail to resume adapter: ".concat(strValueOf) : new String("Fail to resume adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: s */
    protected final void mo5489s() {
        this.f4405e.f4524j = null;
        super.mo5489s();
    }
}
