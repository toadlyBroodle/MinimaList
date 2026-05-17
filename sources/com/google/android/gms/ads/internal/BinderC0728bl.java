package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.cbq;
import com.google.android.gms.internal.cbs;
import com.google.android.gms.internal.cbx;
import com.google.android.gms.internal.cby;
import com.google.android.gms.internal.cbz;
import com.google.android.gms.internal.cca;
import com.google.android.gms.internal.cdv;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cht;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.civ;
import com.google.android.gms.internal.ciy;
import com.google.android.gms.internal.clf;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bl */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0728bl extends AbstractBinderC0714ay implements cca {

    /* JADX INFO: renamed from: j */
    private boolean f4566j;

    /* JADX INFO: renamed from: k */
    private C1541eu f4567k;

    /* JADX INFO: renamed from: l */
    private boolean f4568l;

    public BinderC0728bl(Context context, C0733bq c0733bq, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo) {
        super(context, bxbVar, str, ciiVar, c1670jo, c0733bq);
        this.f4568l = false;
    }

    /* JADX INFO: renamed from: E */
    private final cht m5634E() {
        if (this.f4405e.f4524j == null || !this.f4405e.f4524j.f10546m) {
            return null;
        }
        return this.f4405e.f4524j.f10550q;
    }

    /* JADX INFO: renamed from: a */
    private static C1541eu m5636a(C1542ev c1542ev, int i) {
        return new C1541eu(c1542ev.f10560a.f11753c, null, c1542ev.f10561b.f12611c, i, c1542ev.f10561b.f12613e, c1542ev.f10561b.f12617i, c1542ev.f10561b.f12619k, c1542ev.f10561b.f12618j, c1542ev.f10560a.f11759i, c1542ev.f10561b.f12615g, null, null, null, c1542ev.f10562c, null, c1542ev.f10561b.f12616h, c1542ev.f10563d, c1542ev.f10561b.f12614f, c1542ev.f10565f, c1542ev.f10566g, c1542ev.f10561b.f12622n, c1542ev.f10567h, null, c1542ev.f10561b.f12589A, c1542ev.f10561b.f12590B, c1542ev.f10561b.f12590B, c1542ev.f10561b.f12592D, c1542ev.f10561b.f12593E, null, c1542ev.f10561b.f12596H, c1542ev.f10561b.f12600L, c1542ev.f10568i, c1542ev.f10561b.f12603O, c1542ev.f10569j);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m5637b(C1541eu c1541eu, C1541eu c1541eu2) {
        m5639b((List<String>) null);
        if (!this.f4405e.m5598d()) {
            C1560fm.m11615e("Native ad does not have custom rendering mode.");
            mo5447a(0);
            return false;
        }
        try {
            civ civVarMo10959h = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10959h() : null;
            ciy ciyVarMo10960i = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10960i() : null;
            cdv cdvVarMo10965n = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10965n() : null;
            String strC = m5607c(c1541eu2);
            if (civVarMo10959h != null && this.f4405e.f4531q != null) {
                cbq cbqVar = new cbq(civVarMo10959h.mo10967a(), civVarMo10959h.mo10969b(), civVarMo10959h.mo10971c(), civVarMo10959h.mo10973d() != null ? civVarMo10959h.mo10973d() : null, civVarMo10959h.mo10974e(), civVarMo10959h.mo10975f(), civVarMo10959h.mo10976g(), civVarMo10959h.mo10977h(), null, civVarMo10959h.mo10981l(), civVarMo10959h.mo10982m(), civVarMo10959h.mo10985p() != null ? (View) BinderC0654c.m5330a(civVarMo10959h.mo10985p()) : null, civVarMo10959h.mo10986q(), strC);
                cbqVar.mo10611a(new cby(this.f4405e.f4517c, this, this.f4405e.f4518d, civVarMo10959h, cbqVar));
                C1596gv.f10711a.post(new RunnableC0730bn(this, cbqVar));
            } else if (ciyVarMo10960i != null && this.f4405e.f4532r != null) {
                cbs cbsVar = new cbs(ciyVarMo10960i.mo10987a(), ciyVarMo10960i.mo10989b(), ciyVarMo10960i.mo10991c(), ciyVarMo10960i.mo10993d() != null ? ciyVarMo10960i.mo10993d() : null, ciyVarMo10960i.mo10994e(), ciyVarMo10960i.mo10995f(), null, ciyVarMo10960i.mo10999j(), ciyVarMo10960i.mo11001l(), ciyVarMo10960i.mo11003n() != null ? (View) BinderC0654c.m5330a(ciyVarMo10960i.mo11003n()) : null, ciyVarMo10960i.mo11004o(), strC);
                cbsVar.mo10611a(new cby(this.f4405e.f4517c, this, this.f4405e.f4518d, ciyVarMo10960i, cbsVar));
                C1596gv.f10711a.post(new RunnableC0731bo(this, cbsVar));
            } else {
                if (cdvVarMo10965n == null || this.f4405e.f4534t == null || this.f4405e.f4534t.get(cdvVarMo10965n.mo10624l()) == null) {
                    C1560fm.m11615e("No matching mapper/listener for retrieved native ad template.");
                    mo5447a(0);
                    return false;
                }
                C1596gv.f10711a.post(new RunnableC0732bp(this, cdvVarMo10965n));
            }
            return super.mo5469a(c1541eu, c1541eu2);
        } catch (RemoteException e) {
            C1560fm.m11613c("Failed to get native ad mapper", e);
            mo5447a(0);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    private final boolean m5638c(C1541eu c1541eu, C1541eu c1541eu2) {
        View viewM5806a = C0848r.m5806a(c1541eu2);
        if (viewM5806a == null) {
            return false;
        }
        View nextView = this.f4405e.f4520f.getNextView();
        if (nextView != 0) {
            if (nextView instanceof InterfaceC1758mv) {
                ((InterfaceC1758mv) nextView).destroy();
            }
            this.f4405e.f4520f.removeView(nextView);
        }
        if (!C0848r.m5818b(c1541eu2)) {
            try {
                m5449a(viewM5806a);
            } catch (Throwable th) {
                C0710au.m5573i().m11292a(th, "AdLoaderManager.swapBannerViews");
                C1560fm.m11613c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f4405e.f4520f.getChildCount() > 1) {
            this.f4405e.f4520f.showNext();
        }
        if (c1541eu != null) {
            View nextView2 = this.f4405e.f4520f.getNextView();
            if (nextView2 != null) {
                this.f4405e.f4520f.removeView(nextView2);
            }
            this.f4405e.m5597c();
        }
        this.f4405e.f4520f.setMinimumWidth(mo5481k().f9252f);
        this.f4405e.f4520f.setMinimumHeight(mo5481k().f9249c);
        this.f4405e.f4520f.requestLayout();
        this.f4405e.f4520f.setVisibility(0);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: K */
    public final void mo5510K() {
        C1560fm.m11615e("Unexpected call to AdLoaderManager method");
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: M */
    public final boolean mo5512M() {
        if (m5634E() != null) {
            return m5634E().f10048o;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: N */
    public final boolean mo5513N() {
        if (m5634E() != null) {
            return m5634E().f10049p;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: O */
    public final void mo5514O() {
        if (this.f4405e.f4524j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f4405e.f4524j.f10549p) || this.f4405e.f4524j.f10547n == null || !this.f4405e.f4524j.f10547n.m10866b()) {
            super.mo5514O();
        } else {
            m5494x();
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: P */
    public final void mo5515P() {
        if (this.f4405e.f4524j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f4405e.f4524j.f10549p) || this.f4405e.f4524j.f10547n == null || !this.f4405e.f4524j.f10547n.m10866b()) {
            super.mo5515P();
        } else {
            m5493w();
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: a */
    public final void mo5517a(cbx cbxVar) {
        C1560fm.m11615e("Unexpected call to AdLoaderManager method");
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: a */
    public final void mo5518a(cbz cbzVar) {
        C1560fm.m11615e("Unexpected call to AdLoaderManager method");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final void mo5463a(C1542ev c1542ev, cba cbaVar) {
        this.f4567k = null;
        if (c1542ev.f10564e != -2) {
            this.f4567k = m5636a(c1542ev, c1542ev.f10564e);
        } else if (!c1542ev.f10561b.f12615g) {
            C1560fm.m11615e("partialAdState is not mediation");
            this.f4567k = m5636a(c1542ev, 0);
        }
        if (this.f4567k != null) {
            C1596gv.f10711a.post(new RunnableC0729bm(this));
            return;
        }
        if (c1542ev.f10563d != null) {
            this.f4405e.f4523i = c1542ev.f10563d;
        }
        this.f4405e.f4506F = 0;
        ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
        C0710au.m5568d();
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4522h = clf.m11081a(this.f4405e.f4517c, this, c1542ev, this.f4405e.f4518d, null, this.f4545i, this, cbaVar);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: a */
    protected final boolean mo5520a(bwx bwxVar, C1541eu c1541eu, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected final boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        boolean z;
        if (!this.f4405e.m5598d()) {
            throw new IllegalStateException("AdLoader API does not support custom rendering.");
        }
        if (!c1541eu2.f10546m) {
            mo5447a(0);
            C1560fm.m11615e("newState is not mediation.");
            return false;
        }
        if (c1541eu2.f10547n != null && c1541eu2.f10547n.m10865a()) {
            if (this.f4405e.m5598d() && this.f4405e.f4520f != null) {
                this.f4405e.f4520f.m5601a().m11505c(c1541eu2.f10559z);
            }
            if (!super.mo5469a(c1541eu, c1541eu2)) {
                z = false;
            } else if (!this.f4405e.m5598d() || m5638c(c1541eu, c1541eu2)) {
                if (!this.f4405e.m5599e()) {
                    super.mo5615a(c1541eu2, false);
                }
                z = true;
            } else {
                mo5447a(0);
                z = false;
            }
            if (!z) {
                return false;
            }
            this.f4568l = true;
        } else {
            if (c1541eu2.f10547n == null || !c1541eu2.f10547n.m10866b()) {
                mo5447a(0);
                C1560fm.m11615e("Response is neither banner nor native.");
                return false;
            }
            if (!m5637b(c1541eu, c1541eu2)) {
                return false;
            }
        }
        m5640c(new ArrayList(Arrays.asList(2)));
        return true;
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: b */
    public final cef mo5521b(String str) {
        C1221aj.m7073b("getOnCustomClickListener must be called on the main UI thread.");
        return this.f4405e.f4533s.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5639b(List<String> list) {
        C1221aj.m7073b("setNativeTemplates must be called on the main UI thread.");
        this.f4405e.f4503C = list;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final void mo5472b(boolean z) {
        C1221aj.m7073b("setManualImpressionsEnabled must be called from the main thread.");
        this.f4566j = z;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final boolean mo5473b(bwx bwxVar) {
        if (this.f4405e.f4539y != null && this.f4405e.f4539y.size() == 1 && this.f4405e.f4539y.get(0).intValue() == 2) {
            C1560fm.m11612c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            mo5447a(0);
            return false;
        }
        if (this.f4405e.f4538x == null) {
            return super.mo5473b(bwxVar);
        }
        if (bwxVar.f9214h != this.f4566j) {
            bwxVar = new bwx(bwxVar.f9207a, bwxVar.f9208b, bwxVar.f9209c, bwxVar.f9210d, bwxVar.f9211e, bwxVar.f9212f, bwxVar.f9213g, bwxVar.f9214h || this.f4566j, bwxVar.f9215i, bwxVar.f9216j, bwxVar.f9217k, bwxVar.f9218l, bwxVar.f9219m, bwxVar.f9220n, bwxVar.f9221o, bwxVar.f9222p, bwxVar.f9223q, bwxVar.f9224r);
        }
        return super.mo5473b(bwxVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m5640c(List<Integer> list) {
        C1221aj.m7073b("setAllowedAdTypes must be called on the main UI thread.");
        this.f4405e.f4539y = list;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        if (!this.f4568l) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.mo5484n();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        if (!this.f4568l) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.mo5485o();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public final byx mo5488r() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: v */
    protected final void mo5492v() {
        super.mo5492v();
        C1541eu c1541eu = this.f4405e.f4524j;
        if (c1541eu == null || c1541eu.f10547n == null || !c1541eu.f10547n.m10865a() || this.f4405e.f4538x == null) {
            return;
        }
        try {
            this.f4405e.f4538x.mo10779a(this, BinderC0654c.m5329a(this.f4405e.f4517c));
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
        }
    }
}
