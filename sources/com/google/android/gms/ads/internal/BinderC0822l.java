package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.C0760g;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0752ae;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0761h;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0837l;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1433bk;
import com.google.android.gms.internal.C1515dv;
import com.google.android.gms.internal.C1531ek;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1603hb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1759mw;
import com.google.android.gms.internal.C1807oq;
import com.google.android.gms.internal.C2087z;
import com.google.android.gms.internal.InterfaceC1528eh;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bua;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.chs;
import com.google.android.gms.internal.cht;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cnb;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.l */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0822l extends BinderC0720bd implements InterfaceC0752ae, InterfaceC0761h {

    /* JADX INFO: renamed from: j */
    private transient boolean f4765j;

    /* JADX INFO: renamed from: k */
    private int f4766k;

    /* JADX INFO: renamed from: l */
    private boolean f4767l;

    /* JADX INFO: renamed from: m */
    private float f4768m;

    /* JADX INFO: renamed from: n */
    private boolean f4769n;

    /* JADX INFO: renamed from: o */
    private C1531ek f4770o;

    /* JADX INFO: renamed from: p */
    private String f4771p;

    /* JADX INFO: renamed from: q */
    private final String f4772q;

    public BinderC0822l(Context context, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        super(context, bxbVar, str, ciiVar, c1670jo, c0733bq);
        this.f4766k = -1;
        this.f4765j = false;
        this.f4772q = (bxbVar == null || !"reward_mb".equals(bxbVar.f9247a)) ? "/Interstitial" : "/Rewarded";
    }

    /* JADX INFO: renamed from: a */
    private final void m5762a(Bundle bundle) {
        C0710au.m5569e().m11448b(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, "gmob-apps", bundle, false);
    }

    /* JADX INFO: renamed from: b */
    private static C1542ev m5765b(C1542ev c1542ev) {
        try {
            String string = C1433bk.m9516a(c1542ev.f10561b).toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, c1542ev.f10560a.f11755e);
            chs chsVar = new chs(string, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
            C2087z c2087z = c1542ev.f10561b;
            cht chtVar = new cht(Collections.singletonList(chsVar), ((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), c2087z.f12596H, c2087z.f12597I, "", -1L, 0, 1, null, 0, -1, -1L, false);
            return new C1542ev(c1542ev.f10560a, new C2087z(c1542ev.f10560a, c2087z.f12609a, c2087z.f12610b, Collections.emptyList(), Collections.emptyList(), c2087z.f12614f, true, c2087z.f12616h, Collections.emptyList(), c2087z.f12618j, c2087z.f12619k, c2087z.f12620l, c2087z.f12621m, c2087z.f12622n, c2087z.f12623o, c2087z.f12624p, null, c2087z.f12626r, c2087z.f12627s, c2087z.f12628t, c2087z.f12629u, c2087z.f12630v, c2087z.f12632x, c2087z.f12633y, c2087z.f12634z, null, Collections.emptyList(), Collections.emptyList(), c2087z.f12592D, c2087z.f12593E, c2087z.f12594F, c2087z.f12595G, c2087z.f12596H, c2087z.f12597I, c2087z.f12598J, null, c2087z.f12600L, c2087z.f12601M, c2087z.f12602N, c2087z.f12603O, 0), chtVar, c1542ev.f10563d, c1542ev.f10564e, c1542ev.f10565f, c1542ev.f10566g, null, c1542ev.f10568i, null);
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return c1542ev;
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        Bitmap bitmapM11430h = null;
        C1221aj.m7073b("showInterstitial must be called on the main UI thread.");
        if (C0710au.m5590z().m11242d(this.f4405e.f4517c)) {
            this.f4771p = C0710au.m5590z().m11245f(this.f4405e.f4517c);
            String strValueOf = String.valueOf(this.f4771p);
            String strValueOf2 = String.valueOf(this.f4772q);
            this.f4771p = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        if (this.f4405e.f4524j == null) {
            C1560fm.m11615e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9510bd)).booleanValue()) {
            String packageName = this.f4405e.f4517c.getApplicationContext() != null ? this.f4405e.f4517c.getApplicationContext().getPackageName() : this.f4405e.f4517c.getPackageName();
            if (!this.f4765j) {
                C1560fm.m11615e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m5762a(bundle);
            }
            C0710au.m5569e();
            if (!C1596gv.m11428g(this.f4405e.f4517c)) {
                C1560fm.m11615e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                m5762a(bundle2);
            }
        }
        if (this.f4405e.m5599e()) {
            return;
        }
        if (this.f4405e.f4524j.f10546m && this.f4405e.f4524j.f10548o != null) {
            try {
                if (((Boolean) bxm.m10409f().m10546a(can.f9431aD)).booleanValue()) {
                    this.f4405e.f4524j.f10548o.mo10952a(this.f4769n);
                }
                this.f4405e.f4524j.f10548o.mo10953b();
                return;
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not show interstitial.", e);
                m5768F();
                return;
            }
        }
        if (this.f4405e.f4524j.f10535b == null) {
            C1560fm.m11615e("The interstitial failed to load.");
            return;
        }
        if (this.f4405e.f4524j.f10535b.mo11836z()) {
            C1560fm.m11615e("The interstitial is already showing.");
            return;
        }
        this.f4405e.f4524j.f10535b.mo11820b(true);
        ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
        Object obj = this.f4405e.f4524j.f10535b;
        if (obj == null) {
            throw null;
        }
        viewTreeObserverOnGlobalLayoutListenerC0711av.m5593a((View) obj);
        if (this.f4405e.f4524j.f10543j != null) {
            this.f4407g.m10200a(this.f4405e.f4523i, this.f4405e.f4524j);
        }
        C1541eu c1541eu = this.f4405e.f4524j;
        if (c1541eu.m11256a()) {
            Context context = this.f4405e.f4517c;
            Object obj2 = c1541eu.f10535b;
            if (obj2 == null) {
                throw null;
            }
            new bua(context, (View) obj2).m10262a(c1541eu.f10535b);
        } else {
            c1541eu.f10535b.mo11833w().m11855a(new C0823m(this, c1541eu));
        }
        if (this.f4405e.f4507G) {
            C0710au.m5569e();
            bitmapM11430h = C1596gv.m11430h(this.f4405e.f4517c);
        }
        this.f4766k = C0710au.m5587w().m11537a(bitmapM11430h);
        if (((Boolean) bxm.m10409f().m10546a(can.f9485bE)).booleanValue() && bitmapM11430h != null) {
            new C0824n(this, this.f4766k).m11341h();
            return;
        }
        C0846p c0846p = new C0846p(this.f4405e.f4507G, m5767E(), false, 0.0f, -1, this.f4769n, this.f4405e.f4524j.f10529I);
        int iMo11797A = this.f4405e.f4524j.f10535b.mo11797A();
        if (iMo11797A == -1) {
            iMo11797A = this.f4405e.f4524j.f10540g;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f4405e.f4524j.f10535b, iMo11797A, this.f4405e.f4519e, this.f4405e.f4524j.f10559z, c0846p);
        C0710au.m5567c();
        C0837l.m5804a(this.f4405e.f4517c, adOverlayInfoParcel, true);
    }

    /* JADX INFO: renamed from: E */
    protected final boolean m5767E() {
        if (!(this.f4405e.f4517c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f4405e.f4517c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public final void m5768F() {
        C0710au.m5587w().m11539b(Integer.valueOf(this.f4766k));
        if (this.f4405e.m5598d()) {
            this.f4405e.m5596b();
            this.f4405e.f4524j = null;
            this.f4405e.f4507G = false;
            this.f4765j = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.BinderC0720bd
    /* JADX INFO: renamed from: a */
    protected final InterfaceC1758mv mo5625a(C1542ev c1542ev, C0734br c0734br, InterfaceC1528eh interfaceC1528eh) {
        InterfaceC1758mv interfaceC1758mvM11878a = C0710au.m5570f().m11878a(this.f4405e.f4517c, C1807oq.m11927a(this.f4405e.f4523i), this.f4405e.f4523i.f9247a, false, false, this.f4405e.f4518d, this.f4405e.f4519e, this.f4401a, this, this.f4408h, c1542ev.f10568i);
        interfaceC1758mvM11878a.mo11833w().m11852a(this, null, this, this, ((Boolean) bxm.m10409f().m10546a(can.f9456ac)).booleanValue(), this, c0734br, null, interfaceC1528eh);
        m5627a(interfaceC1758mvM11878a);
        interfaceC1758mvM11878a.mo11818b(c1542ev.f10560a.f11772v);
        interfaceC1758mvM11878a.mo11833w().m11857a("/reward", new C0760g(this));
        return interfaceC1758mvM11878a;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0761h
    /* JADX INFO: renamed from: a */
    public final void mo5690a(C1515dv c1515dv) {
        if (this.f4405e.f4524j != null) {
            if (this.f4405e.f4524j.f10556w != null) {
                C0710au.m5569e();
                C1596gv.m11392a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j.f10556w);
            }
            if (this.f4405e.f4524j.f10554u != null) {
                c1515dv = this.f4405e.f4524j.f10554u;
            }
        }
        m5470b(c1515dv);
    }

    @Override // com.google.android.gms.ads.internal.BinderC0720bd, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final void mo5463a(C1542ev c1542ev, cba cbaVar) {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9433aF)).booleanValue()) {
            super.mo5463a(c1542ev, cbaVar);
            return;
        }
        if (c1542ev.f10564e != -2) {
            super.mo5463a(c1542ev, cbaVar);
            return;
        }
        boolean z = !c1542ev.f10561b.f12615g;
        if (m5441a(c1542ev.f10560a.f11753c) && z) {
            this.f4405e.f4525k = m5765b(c1542ev);
        }
        super.mo5463a(this.f4405e.f4525k, cbaVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0752ae
    /* JADX INFO: renamed from: a */
    public final void mo5675a(boolean z) {
        this.f4405e.f4507G = z;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0752ae
    /* JADX INFO: renamed from: a */
    public final void mo5676a(boolean z, float f) {
        this.f4767l = z;
        this.f4768m = f;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final boolean mo5467a(bwx bwxVar, cba cbaVar) {
        if (this.f4405e.f4524j != null) {
            C1560fm.m11615e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f4770o == null && m5441a(bwxVar) && C0710au.m5590z().m11242d(this.f4405e.f4517c) && !TextUtils.isEmpty(this.f4405e.f4516b)) {
            this.f4770o = new C1531ek(this.f4405e.f4517c, this.f4405e.f4516b);
        }
        return super.mo5467a(bwxVar, cbaVar);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: a */
    protected final boolean mo5520a(bwx bwxVar, C1541eu c1541eu, boolean z) {
        if (this.f4405e.m5598d() && c1541eu.f10535b != null) {
            C0710au.m5571g();
            C1603hb.m11456a(c1541eu.f10535b);
        }
        return this.f4404d.m5533d();
    }

    @Override // com.google.android.gms.ads.internal.BinderC0720bd, com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        if (!super.mo5469a(c1541eu, c1541eu2)) {
            return false;
        }
        if (!this.f4405e.m5598d() && this.f4405e.f4505E != null && c1541eu2.f10543j != null) {
            this.f4407g.m10201a(this.f4405e.f4523i, c1541eu2, this.f4405e.f4505E);
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: b */
    public final void mo5618b() {
        super.mo5618b();
        this.f4407g.m10204a(this.f4405e.f4524j);
        if (this.f4770o != null) {
            this.f4770o.m11222a(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public final void mo5474c(boolean z) {
        C1221aj.m7073b("setImmersiveMode must be called on the main UI thread.");
        this.f4769n = z;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0761h
    /* JADX INFO: renamed from: c_ */
    public final void mo5691c_() {
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10555v != null) {
            C0710au.m5569e();
            C1596gv.m11392a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, this.f4405e.f4524j.f10555v);
        }
        m5495y();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.overlay.InterfaceC0839n
    /* JADX INFO: renamed from: f */
    public final void mo5622f() {
        C1759mw c1759mwMo11833w;
        m5613W();
        super.mo5622f();
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10535b != null && (c1759mwMo11833w = this.f4405e.f4524j.f10535b.mo11833w()) != null) {
            c1759mwMo11833w.m11870h();
        }
        if (C0710au.m5590z().m11242d(this.f4405e.f4517c) && this.f4405e.f4524j != null && this.f4405e.f4524j.f10535b != null) {
            C0710au.m5590z().m11239c(this.f4405e.f4524j.f10535b.getContext(), this.f4771p);
        }
        if (this.f4770o != null) {
            this.f4770o.m11222a(true);
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: s */
    protected final void mo5489s() {
        m5768F();
        super.mo5489s();
    }

    @Override // com.google.android.gms.ads.internal.BinderC0720bd, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: v */
    protected final void mo5492v() {
        super.mo5492v();
        this.f4765j = true;
    }
}
