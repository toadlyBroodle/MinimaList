package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.p018i.C0219m;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1590gp;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C1700kr;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceFutureC1689kg;
import com.google.android.gms.internal.bsz;
import com.google.android.gms.internal.btf;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.bza;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.cbq;
import com.google.android.gms.internal.cbs;
import com.google.android.gms.internal.cbu;
import com.google.android.gms.internal.cbx;
import com.google.android.gms.internal.cby;
import com.google.android.gms.internal.cbz;
import com.google.android.gms.internal.cca;
import com.google.android.gms.internal.ccb;
import com.google.android.gms.internal.cdv;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cei;
import com.google.android.gms.internal.cht;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cim;
import com.google.android.gms.internal.civ;
import com.google.android.gms.internal.ciy;
import com.google.android.gms.internal.ckp;
import com.google.android.gms.internal.clf;
import com.google.android.gms.internal.cmh;
import com.google.android.gms.internal.cml;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ac */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0692ac extends AbstractBinderC0714ay implements cca {

    /* JADX INFO: renamed from: j */
    private final Object f4413j;

    /* JADX INFO: renamed from: k */
    private boolean f4414k;

    /* JADX INFO: renamed from: l */
    private C1700kr<ccb> f4415l;

    /* JADX INFO: renamed from: m */
    private InterfaceC1758mv f4416m;

    /* JADX INFO: renamed from: n */
    private boolean f4417n;

    /* JADX INFO: renamed from: o */
    private int f4418o;

    /* JADX INFO: renamed from: p */
    private cmh f4419p;

    /* JADX INFO: renamed from: q */
    private final String f4420q;

    public BinderC0692ac(Context context, C0733bq c0733bq, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo) {
        this(context, c0733bq, bxbVar, str, ciiVar, c1670jo, false);
    }

    public BinderC0692ac(Context context, C0733bq c0733bq, bxb bxbVar, String str, cii ciiVar, C1670jo c1670jo, boolean z) {
        super(context, bxbVar, str, ciiVar, c1670jo, c0733bq);
        this.f4413j = new Object();
        this.f4415l = new C1700kr<>();
        this.f4418o = 1;
        this.f4420q = UUID.randomUUID().toString();
        this.f4414k = z;
    }

    /* JADX INFO: renamed from: X */
    private final cht m5497X() {
        if (this.f4405e.f4524j == null || !this.f4405e.f4524j.f10546m) {
            return null;
        }
        return this.f4405e.f4524j.f10550q;
    }

    /* JADX INFO: renamed from: Y */
    private final void m5498Y() {
        cmh cmhVarM5505F = m5505F();
        if (cmhVarM5505F != null) {
            cmhVarM5505F.mo11127a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m5500a(ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av, ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av2) {
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4531q == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4531q = viewTreeObserverOnGlobalLayoutListenerC0711av.f4531q;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4532r == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4532r = viewTreeObserverOnGlobalLayoutListenerC0711av.f4532r;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4533s == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4533s = viewTreeObserverOnGlobalLayoutListenerC0711av.f4533s;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4534t == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4534t = viewTreeObserverOnGlobalLayoutListenerC0711av.f4534t;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4536v == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4536v = viewTreeObserverOnGlobalLayoutListenerC0711av.f4536v;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4535u == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4535u = viewTreeObserverOnGlobalLayoutListenerC0711av.f4535u;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4503C == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4503C = viewTreeObserverOnGlobalLayoutListenerC0711av.f4503C;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4526l == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4526l = viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4504D == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4504D = viewTreeObserverOnGlobalLayoutListenerC0711av.f4504D;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4527m == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4527m = viewTreeObserverOnGlobalLayoutListenerC0711av.f4527m;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4528n == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4528n = viewTreeObserverOnGlobalLayoutListenerC0711av.f4528n;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4523i == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4523i = viewTreeObserverOnGlobalLayoutListenerC0711av.f4523i;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4524j == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4524j = viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0711av2.f4525k == null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av2.f4525k = viewTreeObserverOnGlobalLayoutListenerC0711av.f4525k;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5501a(cbq cbqVar) {
        C1596gv.f10711a.post(new RunnableC0696ag(this, cbqVar));
    }

    /* JADX INFO: renamed from: a */
    private final void m5502a(cbs cbsVar) {
        C1596gv.f10711a.post(new RunnableC0697ah(this, cbsVar));
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: A */
    public final String mo5443A() {
        return this.f4405e.f4516b;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* JADX INFO: renamed from: E */
    final void m5504E() {
        synchronized (this.f4413j) {
            C1560fm.m11343a("Initializing webview native ads utills");
            this.f4419p = new cml(this.f4405e.f4517c, this, this.f4420q, this.f4405e.f4518d, this.f4405e.f4519e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final cmh m5505F() {
        cmh cmhVar;
        synchronized (this.f4413j) {
            cmhVar = this.f4419p;
        }
        return cmhVar;
    }

    /* JADX INFO: renamed from: G */
    protected final Future<ccb> m5506G() {
        return this.f4415l;
    }

    /* JADX INFO: renamed from: H */
    public final void m5507H() {
        if (this.f4405e.f4524j == null || this.f4416m == null) {
            this.f4417n = true;
            C1560fm.m11615e("Request to enable ActiveView before adState is available.");
            return;
        }
        bsz bszVarM11319u = C0710au.m5573i().m11319u();
        bxb bxbVar = this.f4405e.f4523i;
        C1541eu c1541eu = this.f4405e.f4524j;
        Object obj = this.f4416m;
        if (obj == null) {
            throw null;
        }
        bszVarM11319u.m10202a(bxbVar, c1541eu, (View) obj, this.f4416m);
        this.f4417n = false;
    }

    /* JADX INFO: renamed from: I */
    public final void m5508I() {
        this.f4417n = false;
        if (this.f4405e.f4524j == null || this.f4416m == null) {
            C1560fm.m11615e("Request to enable ActiveView before adState is available.");
        } else {
            C0710au.m5573i().m11319u().m10204a(this.f4405e.f4524j);
        }
    }

    /* JADX INFO: renamed from: J */
    public final C0219m<String, cei> m5509J() {
        C1221aj.m7073b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f4405e.f4534t;
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: K */
    public final void mo5510K() {
        if (this.f4416m != null) {
            this.f4416m.destroy();
            this.f4416m = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m5511L() {
        if (this.f4416m == null || this.f4416m.mo11753b() == null || this.f4405e.f4535u == null || this.f4405e.f4535u.f9819f == null) {
            return;
        }
        this.f4416m.mo11753b().m11914a(this.f4405e.f4535u.f9819f);
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: M */
    public final boolean mo5512M() {
        if (m5497X() != null) {
            return m5497X().f10048o;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: N */
    public final boolean mo5513N() {
        if (m5497X() != null) {
            return m5497X().f10049p;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: O */
    public final void mo5514O() {
        if (this.f4405e.f4524j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f4405e.f4524j.f10549p)) {
            super.mo5514O();
        } else {
            m5494x();
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: P */
    public final void mo5515P() {
        if (this.f4405e.f4524j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f4405e.f4524j.f10549p)) {
            super.mo5515P();
        } else {
            m5493w();
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.internal.chu
    /* JADX INFO: renamed from: Q */
    public final void mo5516Q() {
        bza bzaVarMo10429h;
        C1541eu c1541eu = this.f4405e.f4524j;
        if (c1541eu.f10548o == null) {
            super.mo5516Q();
            return;
        }
        try {
            cim cimVar = c1541eu.f10548o;
            byx byxVarMo10656c = null;
            civ civVarMo10959h = cimVar.mo10959h();
            if (civVarMo10959h != null) {
                byxVarMo10656c = civVarMo10959h.mo10982m();
            } else {
                ciy ciyVarMo10960i = cimVar.mo10960i();
                if (ciyVarMo10960i != null) {
                    byxVarMo10656c = ciyVarMo10960i.mo11001l();
                } else {
                    cdv cdvVarMo10965n = cimVar.mo10965n();
                    if (cdvVarMo10965n != null) {
                        byxVarMo10656c = cdvVarMo10965n.mo10656c();
                    }
                }
            }
            if (byxVarMo10656c == null || (bzaVarMo10429h = byxVarMo10656c.mo10429h()) == null) {
                return;
            }
            bzaVarMo10429h.mo10437d();
        } catch (RemoteException e) {
            C1560fm.m11613c("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected final void mo5447a(int i) {
        mo5448a(i, false);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected final void mo5448a(int i, boolean z) {
        m5498Y();
        super.mo5448a(i, z);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: a */
    public final void mo5517a(cbx cbxVar) {
        if (this.f4416m != null) {
            this.f4416m.mo11812a(cbxVar);
        }
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: a */
    public final void mo5518a(cbz cbzVar) {
        if (this.f4405e.f4524j.f10543j != null) {
            C0710au.m5573i().m11319u().m10203a(this.f4405e.f4523i, this.f4405e.f4524j, new btf(cbzVar), (InterfaceC1758mv) null);
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5459a(ckp ckpVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final void mo5463a(C1542ev c1542ev, cba cbaVar) {
        if (c1542ev.f10563d != null) {
            this.f4405e.f4523i = c1542ev.f10563d;
        }
        if (c1542ev.f10564e != -2) {
            C1596gv.f10711a.post(new RunnableC0693ad(this, c1542ev));
            return;
        }
        int i = c1542ev.f10560a.f11747Y;
        if (i == 1) {
            this.f4405e.f4506F = 0;
            ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
            C0710au.m5568d();
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4522h = clf.m11081a(this.f4405e.f4517c, this, c1542ev, this.f4405e.f4518d, null, this.f4545i, this, cbaVar);
            String strValueOf = String.valueOf(this.f4405e.f4522h.getClass().getName());
            C1560fm.m11610b(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(c1542ev.f10561b.f12610b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            m5498Y();
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(C1590gp.m11371a(executorServiceNewFixedThreadPool, new CallableC0694ae(this, i4, jSONArray, i, c1542ev)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C1596gv.f10711a.post(new RunnableC0695af(this, (ccb) ((InterfaceFutureC1689kg) arrayList.get(i5)).get(((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    C1560fm.m11613c("Exception occurred while getting an ad response", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    C1560fm.m11613c("Exception occurred while getting an ad response", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    C1560fm.m11613c("Exception occurred while getting an ad response", e);
                } catch (TimeoutException e4) {
                    e = e4;
                    C1560fm.m11613c("Exception occurred while getting an ad response", e);
                }
            }
        } catch (JSONException e5) {
            C1560fm.m11613c("Malformed native ad response", e5);
            mo5447a(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5519a(InterfaceC1758mv interfaceC1758mv) {
        this.f4416m = interfaceC1758mv;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    public final boolean mo5467a(bwx bwxVar, cba cbaVar) {
        try {
            m5504E();
            return super.m5616a(bwxVar, cbaVar, this.f4418o);
        } catch (Exception e) {
            if (C1668jm.m11609a(4)) {
                Log.i("Ads", "Error initializing webview.", e);
            }
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay
    /* JADX INFO: renamed from: a */
    protected final boolean mo5520a(bwx bwxVar, C1541eu c1541eu, boolean z) {
        return this.f4404d.m5533d();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: a */
    protected final boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2) {
        m5523b((List<String>) null);
        if (!this.f4405e.m5598d()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (c1541eu2.f10546m) {
            m5498Y();
            try {
                civ civVarMo10959h = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10959h() : null;
                ciy ciyVarMo10960i = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10960i() : null;
                cdv cdvVarMo10965n = c1541eu2.f10548o != null ? c1541eu2.f10548o.mo10965n() : null;
                String strC = m5607c(c1541eu2);
                if (civVarMo10959h != null && this.f4405e.f4531q != null) {
                    cbq cbqVar = new cbq(civVarMo10959h.mo10967a(), civVarMo10959h.mo10969b(), civVarMo10959h.mo10971c(), civVarMo10959h.mo10973d() != null ? civVarMo10959h.mo10973d() : null, civVarMo10959h.mo10974e(), civVarMo10959h.mo10975f(), civVarMo10959h.mo10976g(), civVarMo10959h.mo10977h(), null, civVarMo10959h.mo10981l(), civVarMo10959h.mo10982m(), civVarMo10959h.mo10985p() != null ? (View) BinderC0654c.m5330a(civVarMo10959h.mo10985p()) : null, civVarMo10959h.mo10986q(), strC);
                    cbqVar.mo10611a(new cby(this.f4405e.f4517c, this, this.f4405e.f4518d, civVarMo10959h, cbqVar));
                    m5501a(cbqVar);
                } else if (ciyVarMo10960i != null && this.f4405e.f4532r != null) {
                    cbs cbsVar = new cbs(ciyVarMo10960i.mo10987a(), ciyVarMo10960i.mo10989b(), ciyVarMo10960i.mo10991c(), ciyVarMo10960i.mo10993d() != null ? ciyVarMo10960i.mo10993d() : null, ciyVarMo10960i.mo10994e(), ciyVarMo10960i.mo10995f(), null, ciyVarMo10960i.mo10999j(), ciyVarMo10960i.mo11001l(), ciyVarMo10960i.mo11003n() != null ? (View) BinderC0654c.m5330a(ciyVarMo10960i.mo11003n()) : null, ciyVarMo10960i.mo11004o(), strC);
                    cbsVar.mo10611a(new cby(this.f4405e.f4517c, this, this.f4405e.f4518d, ciyVarMo10960i, cbsVar));
                    m5502a(cbsVar);
                } else {
                    if (cdvVarMo10965n == null || this.f4405e.f4534t == null || this.f4405e.f4534t.get(cdvVarMo10965n.mo10624l()) == null) {
                        C1560fm.m11615e("No matching mapper/listener for retrieved native ad template.");
                        mo5447a(0);
                        return false;
                    }
                    C1596gv.f10711a.post(new RunnableC0699aj(this, cdvVarMo10965n));
                }
            } catch (RemoteException e) {
                C1560fm.m11613c("Failed to get native ad mapper", e);
            }
        } else {
            ccb ccbVar = c1541eu2.f10522B;
            if (this.f4414k) {
                this.f4415l.m11657b(ccbVar);
            } else if ((ccbVar instanceof cbs) && this.f4405e.f4532r != null) {
                m5502a((cbs) c1541eu2.f10522B);
            } else if ((ccbVar instanceof cbq) && this.f4405e.f4531q != null) {
                m5501a((cbq) c1541eu2.f10522B);
            } else {
                if (!(ccbVar instanceof cbu) || this.f4405e.f4534t == null || this.f4405e.f4534t.get(((cbu) ccbVar).mo10624l()) == null) {
                    C1560fm.m11615e("No matching listener for retrieved native ad template.");
                    mo5447a(0);
                    return false;
                }
                C1596gv.f10711a.post(new RunnableC0698ai(this, ((cbu) ccbVar).mo10624l(), c1541eu2));
            }
        }
        return super.mo5469a(c1541eu, c1541eu2);
    }

    @Override // com.google.android.gms.internal.cca
    /* JADX INFO: renamed from: b */
    public final cef mo5521b(String str) {
        C1221aj.m7073b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.f4405e.f4533s == null) {
            return null;
        }
        return this.f4405e.f4533s.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5522b(int i) {
        C1221aj.m7073b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f4418o = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m5523b(List<String> list) {
        C1221aj.m7073b("setNativeTemplates must be called on the main UI thread.");
        this.f4405e.f4503C = list;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: d */
    protected final void mo5476d(boolean z) {
        super.mo5476d(z);
        if (this.f4417n) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9499bS)).booleanValue()) {
                m5507H();
            }
        }
    }

    /* JADX INFO: renamed from: i_ */
    public final String m5524i_() {
        return this.f4420q;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0714ay, com.google.android.gms.ads.internal.AbstractBinderC0689a, com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC0689a
    /* JADX INFO: renamed from: v */
    protected final void mo5492v() {
        mo5476d(false);
    }
}
