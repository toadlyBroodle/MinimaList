package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0762i;
import com.google.android.gms.ads.internal.overlay.InterfaceC0842q;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.internal.BinderC1474ch;
import com.google.android.gms.internal.C1515dv;
import com.google.android.gms.internal.C1535eo;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;
import com.google.android.gms.internal.C1543ew;
import com.google.android.gms.internal.C1553ff;
import com.google.android.gms.internal.C1558fk;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1807oq;
import com.google.android.gms.internal.InterfaceC1487cu;
import com.google.android.gms.internal.InterfaceC1552fe;
import com.google.android.gms.internal.bsz;
import com.google.android.gms.internal.bwh;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bwy;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxp;
import com.google.android.gms.internal.bxs;
import com.google.android.gms.internal.bye;
import com.google.android.gms.internal.byi;
import com.google.android.gms.internal.byp;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.bzd;
import com.google.android.gms.internal.bzu;
import com.google.android.gms.internal.bzw;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cay;
import com.google.android.gms.internal.cba;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.ckp;
import com.google.android.gms.internal.ckv;
import com.google.android.gms.internal.clg;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.internal.cnd;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.a */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractBinderC0689a extends bye implements InterfaceC0762i, InterfaceC0842q, bws, clg, cnd, InterfaceC1552fe {

    /* JADX INFO: renamed from: a */
    protected cba f4401a;

    /* JADX INFO: renamed from: b */
    protected cay f4402b;

    /* JADX INFO: renamed from: c */
    protected boolean f4403c = false;

    /* JADX INFO: renamed from: d */
    protected final C0700ak f4404d = new C0700ak(this);

    /* JADX INFO: renamed from: e */
    protected final ViewTreeObserverOnGlobalLayoutListenerC0711av f4405e;

    /* JADX INFO: renamed from: f */
    protected transient bwx f4406f;

    /* JADX INFO: renamed from: g */
    protected final bsz f4407g;

    /* JADX INFO: renamed from: h */
    protected final C0733bq f4408h;

    /* JADX INFO: renamed from: i */
    private cay f4409i;

    AbstractBinderC0689a(ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av, C0700ak c0700ak, C0733bq c0733bq) {
        this.f4405e = viewTreeObserverOnGlobalLayoutListenerC0711av;
        this.f4408h = c0733bq;
        C0710au.m5569e().m11449b(this.f4405e.f4517c);
        C0710au.m5569e().m11451c(this.f4405e.f4517c);
        C1558fk.m11342a(this.f4405e.f4517c);
        C0710au.m5561A().m5729a(this.f4405e.f4517c);
        C0710au.m5573i().m11287a(this.f4405e.f4517c, this.f4405e.f4519e);
        C0710au.m5574j().m10343a(this.f4405e.f4517c);
        this.f4407g = C0710au.m5573i().m11319u();
        C0710au.m5572h().m10287a(this.f4405e.f4517c);
        C0710au.m5563C().m11548a(this.f4405e.f4517c);
        if (((Boolean) bxm.m10409f().m10546a(can.f9504bX)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C0691ab(this, new CountDownLatch(((Integer) bxm.m10409f().m10546a(can.f9506bZ)).intValue()), timer), 0L, ((Long) bxm.m10409f().m10546a(can.f9505bY)).longValue());
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m5441a(bwx bwxVar) {
        Bundle bundle = bwxVar.f9219m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* JADX INFO: renamed from: b */
    private static long m5442b(String str) {
        int iIndexOf = str.indexOf("ufe");
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(iIndexOf + 4, iIndexOf2));
        } catch (IndexOutOfBoundsException e) {
            C1560fm.m11615e("Invalid index for Url fetch time in CSI latency info.");
            return -1L;
        } catch (NumberFormatException e2) {
            C1560fm.m11615e("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: A */
    public String mo5443A() {
        return this.f4405e.f4516b;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: B */
    public final byi mo5444B() {
        return this.f4405e.f4529o;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: C */
    public final bxs mo5445C() {
        return this.f4405e.f4528n;
    }

    /* JADX INFO: renamed from: a */
    protected final List<String> m5446a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1535eo.m11251a(it.next(), this.f4405e.f4517c));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a */
    public void mo5447a(int i) {
        mo5448a(i, false);
    }

    /* JADX INFO: renamed from: a */
    protected void mo5448a(int i, boolean z) {
        C1560fm.m11615e(new StringBuilder(30).append("Failed to load ad: ").append(i).toString());
        this.f4403c = z;
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10365a(i);
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f4405e.f4501A != null) {
            try {
                this.f4405e.f4501A.mo10799a(i);
            } catch (RemoteException e2) {
                C1560fm.m11613c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m5449a(View view) {
        C0712aw c0712aw = this.f4405e.f4520f;
        if (c0712aw != null) {
            c0712aw.addView(view, C0710au.m5571g().mo11479d());
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5450a(bxb bxbVar) {
        C1221aj.m7073b("setAdSize must be called on the main UI thread.");
        this.f4405e.f4523i = bxbVar;
        if (this.f4405e.f4524j != null && this.f4405e.f4524j.f10535b != null && this.f4405e.f4506F == 0) {
            this.f4405e.f4524j.f10535b.mo11813a(C1807oq.m11927a(bxbVar));
        }
        if (this.f4405e.f4520f == null) {
            return;
        }
        if (this.f4405e.f4520f.getChildCount() > 1) {
            this.f4405e.f4520f.removeView(this.f4405e.f4520f.getNextView());
        }
        this.f4405e.f4520f.setMinimumWidth(bxbVar.f9252f);
        this.f4405e.f4520f.setMinimumHeight(bxbVar.f9249c);
        this.f4405e.f4520f.requestLayout();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5451a(bxp bxpVar) {
        C1221aj.m7073b("setAdListener must be called on the main UI thread.");
        this.f4405e.f4527m = bxpVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5452a(bxs bxsVar) {
        C1221aj.m7073b("setAdListener must be called on the main UI thread.");
        this.f4405e.f4528n = bxsVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5453a(byi byiVar) {
        C1221aj.m7073b("setAppEventListener must be called on the main UI thread.");
        this.f4405e.f4529o = byiVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5454a(byp bypVar) {
        C1221aj.m7073b("setCorrelationIdProvider must be called on the main UI thread");
        this.f4405e.f4530p = bypVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5455a(bzd bzdVar) {
        C1221aj.m7073b("setIconAdOptions must be called on the main UI thread.");
        this.f4405e.f4537w = bzdVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5456a(bzw bzwVar) {
        C1221aj.m7073b("setVideoOptions must be called on the main UI thread.");
        this.f4405e.f4536v = bzwVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5457a(cay cayVar) {
        this.f4401a = new cba(((Boolean) bxm.m10409f().m10546a(can.f9408H)).booleanValue(), "load_ad", this.f4405e.f4523i.f9247a);
        this.f4409i = new cay(-1L, null, null);
        if (cayVar == null) {
            this.f4402b = new cay(-1L, null, null);
        } else {
            this.f4402b = new cay(cayVar.m10568a(), cayVar.m10569b(), cayVar.m10570c());
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public void mo5458a(cbh cbhVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public void mo5459a(ckp ckpVar) {
        C1560fm.m11615e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5460a(ckv ckvVar, String str) {
        C1560fm.m11615e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5461a(InterfaceC1487cu interfaceC1487cu) {
        C1221aj.m7073b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f4405e.f4501A = interfaceC1487cu;
    }

    @Override // com.google.android.gms.internal.cnd
    /* JADX INFO: renamed from: a */
    public final void mo5462a(C1542ev c1542ev) {
        if (c1542ev.f10561b.f12621m != -1 && !TextUtils.isEmpty(c1542ev.f10561b.f12631w)) {
            long jM5442b = m5442b(c1542ev.f10561b.f12631w);
            if (jM5442b != -1) {
                this.f4401a.m10581a(this.f4401a.m10576a(jM5442b + c1542ev.f10561b.f12621m), "stc");
            }
        }
        this.f4401a.m10578a(c1542ev.f10561b.f12631w);
        this.f4401a.m10581a(this.f4402b, "arf");
        this.f4409i = this.f4401a.m10575a();
        this.f4401a.m10579a("gqi", c1542ev.f10561b.f12632x);
        this.f4405e.f4521g = null;
        this.f4405e.f4525k = c1542ev;
        c1542ev.f10568i.m10355a(new C0713ax(this, c1542ev));
        c1542ev.f10568i.m10356a(bwh.C1461a.b.AD_LOADED);
        mo5463a(c1542ev, this.f4401a);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo5463a(C1542ev c1542ev, cba cbaVar);

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5464a(String str) {
        C1221aj.m7073b("setUserId must be called on the main UI thread.");
        this.f4405e.f4502B = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0762i
    /* JADX INFO: renamed from: a */
    public final void mo5465a(String str, String str2) {
        if (this.f4405e.f4529o != null) {
            try {
                this.f4405e.f4529o.mo10385a(str, str2);
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call the AppEventListener.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1552fe
    /* JADX INFO: renamed from: a */
    public final void mo5466a(HashSet<C1543ew> hashSet) {
        this.f4405e.m5594a(hashSet);
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo5467a(bwx bwxVar, cba cbaVar);

    /* JADX INFO: renamed from: a */
    boolean mo5468a(C1541eu c1541eu) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo5469a(C1541eu c1541eu, C1541eu c1541eu2);

    /* JADX INFO: renamed from: b */
    protected final void m5470b(C1515dv c1515dv) {
        if (this.f4405e.f4501A == null) {
            return;
        }
        String str = "";
        int i = 1;
        if (c1515dv != null) {
            try {
                str = c1515dv.f10475a;
                i = c1515dv.f10476b;
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call RewardedVideoAdListener.onRewarded().", e);
                return;
            }
        }
        this.f4405e.f4501A.mo10800a(new BinderC1474ch(str, i));
    }

    @Override // com.google.android.gms.internal.clg
    /* JADX INFO: renamed from: b */
    public void mo5471b(C1541eu c1541eu) {
        this.f4401a.m10581a(this.f4409i, "awr");
        this.f4405e.f4522h = null;
        if (c1541eu.f10537d != -2 && c1541eu.f10537d != 3 && this.f4405e.m5592a() != null) {
            C0710au.m5573i().m11293a(this.f4405e.m5592a());
        }
        if (c1541eu.f10537d == -1) {
            this.f4403c = false;
            return;
        }
        if (mo5468a(c1541eu)) {
            C1560fm.m11610b("Ad refresh scheduled.");
        }
        if (c1541eu.f10537d != -2) {
            if (c1541eu.f10537d == 3) {
                c1541eu.f10528H.m10356a(bwh.C1461a.b.AD_FAILED_TO_LOAD_NO_FILL);
            } else {
                c1541eu.f10528H.m10356a(bwh.C1461a.b.AD_FAILED_TO_LOAD);
            }
            mo5447a(c1541eu.f10537d);
            return;
        }
        if (this.f4405e.f4504D == null) {
            this.f4405e.f4504D = new C1553ff(this.f4405e.f4516b);
        }
        if (this.f4405e.f4520f != null) {
            this.f4405e.f4520f.m5601a().m11506d(c1541eu.f10521A);
        }
        this.f4407g.m10204a(this.f4405e.f4524j);
        if (mo5469a(this.f4405e.f4524j, c1541eu)) {
            this.f4405e.f4524j = c1541eu;
            ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
            if (viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l != null) {
                if (viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l.m11258a(viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j.f10557x);
                    viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l.m11262b(viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j.f10558y);
                    viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l.m11263b(viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j.f10546m);
                }
                viewTreeObserverOnGlobalLayoutListenerC0711av.f4526l.m11260a(viewTreeObserverOnGlobalLayoutListenerC0711av.f4523i.f9250d);
            }
            this.f4401a.m10579a("is_mraid", this.f4405e.f4524j.m11256a() ? "1" : "0");
            this.f4401a.m10579a("is_mediation", this.f4405e.f4524j.f10546m ? "1" : "0");
            if (this.f4405e.f4524j.f10535b != null && this.f4405e.f4524j.f10535b.mo11833w() != null) {
                this.f4401a.m10579a("is_delay_pl", this.f4405e.f4524j.f10535b.mo11833w().m11868f() ? "1" : "0");
            }
            this.f4401a.m10581a(this.f4402b, "ttc");
            if (C0710au.m5573i().m11303e() != null) {
                C0710au.m5573i().m11303e().m10562a(this.f4401a);
            }
            m5496z();
            if (this.f4405e.m5598d()) {
                mo5492v();
            }
        }
        if (c1541eu.f10527G != null) {
            C0710au.m5569e().m11445a(this.f4405e.f4517c, c1541eu.f10527G);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public void mo5472b(boolean z) {
        C1560fm.m11615e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public boolean mo5473b(bwx bwxVar) {
        C1221aj.m7073b("loadAd must be called on the main UI thread.");
        C0710au.m5574j().m10342a();
        if (((Boolean) bxm.m10409f().m10546a(can.f9429aB)).booleanValue()) {
            bwx.m10373a(bwxVar);
        }
        if (C1304h.m7266c(this.f4405e.f4517c) && bwxVar.f9217k != null) {
            bwxVar = new bwy(bwxVar).m10375a(null).m10374a();
        }
        if (this.f4405e.f4521g != null || this.f4405e.f4522h != null) {
            if (this.f4406f != null) {
                C1560fm.m11615e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            } else {
                C1560fm.m11615e("Loading already in progress, saving this object for future refreshes.");
            }
            this.f4406f = bwxVar;
            return false;
        }
        C1560fm.m11614d("Starting ad request.");
        m5457a((cay) null);
        this.f4402b = this.f4401a.m10575a();
        if (bwxVar.f9212f) {
            C1560fm.m11614d("This request is sent from a test device.");
        } else {
            bxm.m10404a();
            String strM11562a = C1657jb.m11562a(this.f4405e.f4517c);
            C1560fm.m11614d(new StringBuilder(String.valueOf(strM11562a).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(strM11562a).append("\") to get test ads on this device.").toString());
        }
        this.f4404d.m5528a(bwxVar);
        this.f4403c = mo5467a(bwxVar, this.f4401a);
        return this.f4403c;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public void mo5474c(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo5475c(bwx bwxVar) {
        if (this.f4405e.f4520f == null) {
            return false;
        }
        Object parent = this.f4405e.f4520f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C0710au.m5569e().m11446a(view, view.getContext());
    }

    /* JADX INFO: renamed from: d */
    protected void mo5476d(boolean z) {
        C1560fm.m11614d("Ad finished loading.");
        this.f4403c = z;
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10367c();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f4405e.f4501A != null) {
            try {
                this.f4405e.f4501A.mo10798a();
            } catch (RemoteException e2) {
                C1560fm.m11613c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.bws
    /* JADX INFO: renamed from: e */
    public void mo5308e() {
        if (this.f4405e.f4524j == null) {
            C1560fm.m11615e("Ad state was null when trying to ping click URLs.");
            return;
        }
        C1560fm.m11610b("Pinging click URLs.");
        if (this.f4405e.f4526l != null) {
            this.f4405e.f4526l.m11261b();
        }
        if (this.f4405e.f4524j.f10536c != null) {
            C0710au.m5569e();
            C1596gv.m11392a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, m5446a(this.f4405e.f4524j.f10536c));
        }
        if (this.f4405e.f4527m != null) {
            try {
                this.f4405e.f4527m.mo10363a();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not notify onAdClicked event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0842q
    /* JADX INFO: renamed from: g */
    public final void mo5477g() {
        m5490t();
    }

    /* JADX INFO: renamed from: h */
    public final C0733bq m5478h() {
        return this.f4408h;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: i */
    public void mo5479i() {
        C1221aj.m7073b("destroy must be called on the main UI thread.");
        this.f4404d.m5527a();
        this.f4407g.m10205b(this.f4405e.f4524j);
        ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av = this.f4405e;
        if (viewTreeObserverOnGlobalLayoutListenerC0711av.f4520f != null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4520f.m5602b();
        }
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4528n = null;
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4529o = null;
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4540z = null;
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4530p = null;
        viewTreeObserverOnGlobalLayoutListenerC0711av.m5595a(false);
        if (viewTreeObserverOnGlobalLayoutListenerC0711av.f4520f != null) {
            viewTreeObserverOnGlobalLayoutListenerC0711av.f4520f.removeAllViews();
        }
        viewTreeObserverOnGlobalLayoutListenerC0711av.m5596b();
        viewTreeObserverOnGlobalLayoutListenerC0711av.m5597c();
        viewTreeObserverOnGlobalLayoutListenerC0711av.f4524j = null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo5480j() {
        C1221aj.m7073b("getAdFrame must be called on the main UI thread.");
        return BinderC0654c.m5329a(this.f4405e.f4520f);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: k */
    public final bxb mo5481k() {
        C1221aj.m7073b("getAdSize must be called on the main UI thread.");
        if (this.f4405e.f4523i == null) {
            return null;
        }
        return new bzu(this.f4405e.f4523i);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: l */
    public final boolean mo5482l() {
        C1221aj.m7073b("isLoaded must be called on the main UI thread.");
        return this.f4405e.f4521g == null && this.f4405e.f4522h == null && this.f4405e.f4524j != null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: m */
    public final void mo5483m() {
        C1221aj.m7073b("recordManualImpression must be called on the main UI thread.");
        if (this.f4405e.f4524j == null) {
            C1560fm.m11615e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C1560fm.m11610b("Pinging manual tracking URLs.");
        if (this.f4405e.f4524j.f10525E) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f4405e.f4524j.f10539f != null) {
            arrayList.addAll(this.f4405e.f4524j.f10539f);
        }
        if (this.f4405e.f4524j.f10547n != null && this.f4405e.f4524j.f10547n.f10022h != null) {
            arrayList.addAll(this.f4405e.f4524j.f10547n.f10022h);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C0710au.m5569e();
        C1596gv.m11392a(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, arrayList);
        this.f4405e.f4524j.f10525E = true;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public void mo5484n() {
        C1221aj.m7073b("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public void mo5485o() {
        C1221aj.m7073b("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: p */
    public final void mo5486p() {
        C1221aj.m7073b("stopLoading must be called on the main UI thread.");
        this.f4403c = false;
        this.f4405e.m5595a(true);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: q */
    public final boolean mo5487q() {
        return this.f4403c;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public byx mo5488r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    protected void mo5489s() {
        C1560fm.m11614d("Ad closing.");
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10364a();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f4405e.f4501A != null) {
            try {
                this.f4405e.f4501A.mo10803d();
            } catch (RemoteException e2) {
                C1560fm.m11613c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    protected final void m5490t() {
        C1560fm.m11614d("Ad leaving application.");
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10366b();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f4405e.f4501A != null) {
            try {
                this.f4405e.f4501A.mo10804e();
            } catch (RemoteException e2) {
                C1560fm.m11613c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    protected final void m5491u() {
        C1560fm.m11614d("Ad opening.");
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10368d();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f4405e.f4501A != null) {
            try {
                this.f4405e.f4501A.mo10801b();
            } catch (RemoteException e2) {
                C1560fm.m11613c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    protected void mo5492v() {
        mo5476d(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m5493w() {
        C1560fm.m11614d("Ad impression.");
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10370f();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5494x() {
        C1560fm.m11614d("Ad clicked.");
        if (this.f4405e.f4528n != null) {
            try {
                this.f4405e.f4528n.mo10369e();
            } catch (RemoteException e) {
                C1560fm.m11613c("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    protected final void m5495y() {
        if (this.f4405e.f4501A == null) {
            return;
        }
        try {
            this.f4405e.f4501A.mo10802c();
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call RewardedVideoAdListener.onVideoStarted().", e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5496z() {
        C1541eu c1541eu = this.f4405e.f4524j;
        if (c1541eu == null || TextUtils.isEmpty(c1541eu.f10521A) || c1541eu.f10526F || !C0710au.m5578n().m11518b()) {
            return;
        }
        C1560fm.m11610b("Sending troubleshooting signals to the server.");
        C0710au.m5578n().m11517b(this.f4405e.f4517c, this.f4405e.f4519e.f10855a, c1541eu.f10521A, this.f4405e.f4516b);
        c1541eu.f10526F = true;
    }
}
