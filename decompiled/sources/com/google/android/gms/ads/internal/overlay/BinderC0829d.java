package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1603hb;
import com.google.android.gms.internal.C1759mw;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bwf;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.ckf;
import com.google.android.gms.internal.ckj;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.d */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0829d extends ckj implements InterfaceC0845t {

    /* JADX INFO: renamed from: b */
    private static int f4802b = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    AdOverlayInfoParcel f4803a;

    /* JADX INFO: renamed from: c */
    private final Activity f4804c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1758mv f4805d;

    /* JADX INFO: renamed from: e */
    private C0834i f4806e;

    /* JADX INFO: renamed from: f */
    private ViewOnClickListenerC0840o f4807f;

    /* JADX INFO: renamed from: h */
    private FrameLayout f4809h;

    /* JADX INFO: renamed from: i */
    private WebChromeClient.CustomViewCallback f4810i;

    /* JADX INFO: renamed from: l */
    private C0833h f4813l;

    /* JADX INFO: renamed from: p */
    private Runnable f4817p;

    /* JADX INFO: renamed from: q */
    private boolean f4818q;

    /* JADX INFO: renamed from: r */
    private boolean f4819r;

    /* JADX INFO: renamed from: g */
    private boolean f4808g = false;

    /* JADX INFO: renamed from: j */
    private boolean f4811j = false;

    /* JADX INFO: renamed from: k */
    private boolean f4812k = false;

    /* JADX INFO: renamed from: m */
    private boolean f4814m = false;

    /* JADX INFO: renamed from: n */
    private int f4815n = 0;

    /* JADX INFO: renamed from: o */
    private final Object f4816o = new Object();

    /* JADX INFO: renamed from: s */
    private boolean f4820s = false;

    /* JADX INFO: renamed from: t */
    private boolean f4821t = false;

    /* JADX INFO: renamed from: u */
    private boolean f4822u = true;

    public BinderC0829d(Activity activity) {
        this.f4804c = activity;
    }

    /* JADX INFO: renamed from: a */
    private final void m5776a(boolean z) {
        int iIntValue = ((Integer) bxm.m10409f().m10546a(can.f9542cI)).intValue();
        C0841p c0841p = new C0841p();
        c0841p.f4839e = 50;
        c0841p.f4835a = z ? iIntValue : 0;
        c0841p.f4836b = z ? 0 : iIntValue;
        c0841p.f4837c = 0;
        c0841p.f4838d = iIntValue;
        this.f4807f = new ViewOnClickListenerC0840o(this.f4804c, c0841p, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        m5786a(z, this.f4803a.f4785g);
        this.f4813l.addView(this.f4807f, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0308  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m5777b(boolean z) throws C0832g {
        boolean zM11398a;
        if (!this.f4819r) {
            this.f4804c.requestWindowFeature(1);
        }
        Window window = this.f4804c.getWindow();
        if (window == null) {
            throw new C0832g("Invalid activity, no window available.");
        }
        if (C1310n.m7285h()) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9540cG)).booleanValue()) {
                C0710au.m5569e();
                zM11398a = C1596gv.m11398a(this.f4804c, this.f4804c.getResources().getConfiguration());
            } else {
                zM11398a = true;
            }
        }
        boolean z2 = this.f4803a.f4793o != null && this.f4803a.f4793o.f4841b;
        if ((!this.f4812k || z2) && zM11398a) {
            window.setFlags(1024, 1024);
            if (((Boolean) bxm.m10409f().m10546a(can.f9431aD)).booleanValue() && C1310n.m7282e() && this.f4803a.f4793o != null && this.f4803a.f4793o.f4845f) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        C1759mw c1759mwMo11833w = this.f4803a.f4782d != null ? this.f4803a.f4782d.mo11833w() : null;
        boolean zM11864b = c1759mwMo11833w != null ? c1759mwMo11833w.m11864b() : false;
        this.f4814m = false;
        if (zM11864b) {
            if (this.f4803a.f4788j == C0710au.m5571g().mo11459a()) {
                this.f4814m = this.f4804c.getResources().getConfiguration().orientation == 1;
            } else if (this.f4803a.f4788j == C0710au.m5571g().mo11472b()) {
                this.f4814m = this.f4804c.getResources().getConfiguration().orientation == 2;
            }
        }
        C1560fm.m11610b(new StringBuilder(46).append("Delay onShow to next orientation change: ").append(this.f4814m).toString());
        m5781a(this.f4803a.f4788j);
        if (C0710au.m5571g().mo11471a(window)) {
            C1560fm.m11610b("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.f4812k) {
            this.f4813l.setBackgroundColor(f4802b);
        } else {
            this.f4813l.setBackgroundColor(-16777216);
        }
        this.f4804c.setContentView(this.f4813l);
        this.f4819r = true;
        if (z) {
            try {
                this.f4805d = C0710au.m5570f().m11878a(this.f4804c, this.f4803a.f4782d != null ? this.f4803a.f4782d.mo11831u() : null, this.f4803a.f4782d != null ? this.f4803a.f4782d.mo11832v() : null, true, zM11864b, null, this.f4803a.f4791m, null, null, this.f4803a.f4782d != null ? this.f4803a.f4782d.mo11756e() : null, bwf.m10352a());
                this.f4805d.mo11833w().m11852a(null, null, this.f4803a.f4783e, this.f4803a.f4787i, true, null, this.f4803a.f4782d != null ? this.f4803a.f4782d.mo11833w().m11847a() : null, null, null);
                this.f4805d.mo11833w().m11853a(new C0830e(this));
                if (this.f4803a.f4790l != null) {
                    this.f4805d.loadUrl(this.f4803a.f4790l);
                } else {
                    if (this.f4803a.f4786h == null) {
                        throw new C0832g("No URL or HTML to display in ad overlay.");
                    }
                    this.f4805d.loadDataWithBaseURL(this.f4803a.f4784f, this.f4803a.f4786h, "text/html", "UTF-8", null);
                }
                if (this.f4803a.f4782d != null) {
                    this.f4803a.f4782d.mo11817b(this);
                }
            } catch (Exception e) {
                C1560fm.m11611b("Error obtaining webview.", e);
                throw new C0832g("Could not obtain webview for the overlay.");
            }
        } else {
            this.f4805d = this.f4803a.f4782d;
            this.f4805d.mo11810a(this.f4804c);
        }
        this.f4805d.mo11811a(this);
        ViewParent parent = this.f4805d.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            Object obj = this.f4805d;
            if (obj == null) {
                throw null;
            }
            viewGroup.removeView((View) obj);
        }
        if (this.f4812k) {
            this.f4805d.mo11807K();
        }
        C0833h c0833h = this.f4813l;
        Object obj2 = this.f4805d;
        if (obj2 == null) {
            throw null;
        }
        c0833h.addView((View) obj2, -1, -1);
        if (!z && !this.f4814m) {
            m5779s();
        }
        m5776a(zM11864b);
        if (this.f4805d.mo11834x()) {
            m5786a(zM11864b, true);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m5778r() {
        if (!this.f4804c.isFinishing() || this.f4820s) {
            return;
        }
        this.f4820s = true;
        if (this.f4805d != null) {
            this.f4805d.mo11809a(this.f4815n);
            synchronized (this.f4816o) {
                if (!this.f4818q && this.f4805d.mo11802F()) {
                    this.f4817p = new RunnableC0831f(this);
                    C1596gv.f10711a.postDelayed(this.f4817p, ((Long) bxm.m10409f().m10546a(can.f9430aC)).longValue());
                    return;
                }
            }
        }
        m5800n();
    }

    /* JADX INFO: renamed from: s */
    private final void m5779s() {
        this.f4805d.mo11826p();
    }

    /* JADX INFO: renamed from: a */
    public final void m5780a() {
        this.f4815n = 2;
        this.f4804c.finish();
    }

    /* JADX INFO: renamed from: a */
    public final void m5781a(int i) {
        this.f4804c.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5782a(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5783a(Bundle bundle) {
        this.f4804c.requestWindowFeature(1);
        this.f4811j = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f4803a = AdOverlayInfoParcel.m5771a(this.f4804c.getIntent());
            if (this.f4803a == null) {
                throw new C0832g("Could not get info for ad overlay.");
            }
            if (this.f4803a.f4791m.f10857c > 7500000) {
                this.f4815n = 3;
            }
            if (this.f4804c.getIntent() != null) {
                this.f4822u = this.f4804c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f4803a.f4793o != null) {
                this.f4812k = this.f4803a.f4793o.f4840a;
            } else {
                this.f4812k = false;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9485bE)).booleanValue() && this.f4812k && this.f4803a.f4793o.f4844e != -1) {
                new C0835j(this, null).m11341h();
            }
            if (bundle == null) {
                if (this.f4803a.f4781c != null && this.f4822u) {
                    this.f4803a.f4781c.mo5622f();
                }
                if (this.f4803a.f4789k != 1 && this.f4803a.f4780b != null) {
                    this.f4803a.f4780b.mo5308e();
                }
            }
            this.f4813l = new C0833h(this.f4804c, this.f4803a.f4792n, this.f4803a.f4791m.f10855a);
            this.f4813l.setId(1000);
            switch (this.f4803a.f4789k) {
                case 1:
                    m5777b(false);
                    return;
                case 2:
                    this.f4806e = new C0834i(this.f4803a.f4782d);
                    m5777b(false);
                    return;
                case 3:
                    m5777b(true);
                    return;
                case 4:
                    if (this.f4811j) {
                        this.f4815n = 3;
                        this.f4804c.finish();
                        return;
                    }
                    C0710au.m5566b();
                    if (C0826a.m5774a(this.f4804c, this.f4803a.f4779a, this.f4803a.f4787i)) {
                        return;
                    }
                    this.f4815n = 3;
                    this.f4804c.finish();
                    return;
                default:
                    throw new C0832g("Could not determine ad overlay type.");
            }
        } catch (C0832g e) {
            C1560fm.m11615e(e.getMessage());
            this.f4815n = 3;
            this.f4804c.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5784a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f4809h = new FrameLayout(this.f4804c);
        this.f4809h.setBackgroundColor(-16777216);
        this.f4809h.addView(view, -1, -1);
        this.f4804c.setContentView(this.f4809h);
        this.f4819r = true;
        this.f4810i = customViewCallback;
        this.f4808g = true;
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5785a(InterfaceC0652a interfaceC0652a) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9540cG)).booleanValue() && C1310n.m7285h()) {
            Configuration configuration = (Configuration) BinderC0654c.m5330a(interfaceC0652a);
            C0710au.m5569e();
            if (C1596gv.m11398a(this.f4804c, configuration)) {
                this.f4804c.getWindow().addFlags(1024);
                this.f4804c.getWindow().clearFlags(2048);
            } else {
                this.f4804c.getWindow().addFlags(2048);
                this.f4804c.getWindow().clearFlags(1024);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5786a(boolean z, boolean z2) {
        boolean z3 = ((Boolean) bxm.m10409f().m10546a(can.f9432aE)).booleanValue() && this.f4803a != null && this.f4803a.f4793o != null && this.f4803a.f4793o.f4846g;
        if (z && z2 && z3) {
            new ckf(this.f4805d, "useCustomClose").m11061a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f4807f != null) {
            this.f4807f.m5805a(z, z2 && !z3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5787b() {
        if (this.f4803a != null && this.f4808g) {
            m5781a(this.f4803a.f4788j);
        }
        if (this.f4809h != null) {
            this.f4804c.setContentView(this.f4813l);
            this.f4819r = true;
            this.f4809h.removeAllViews();
            this.f4809h = null;
        }
        if (this.f4810i != null) {
            this.f4810i.onCustomViewHidden();
            this.f4810i = null;
        }
        this.f4808g = false;
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: b */
    public final void mo5788b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f4811j);
    }

    @Override // com.google.android.gms.ads.internal.overlay.InterfaceC0845t
    /* JADX INFO: renamed from: c */
    public final void mo5789c() {
        this.f4815n = 1;
        this.f4804c.finish();
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: d */
    public final void mo5790d() {
        this.f4815n = 0;
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: e */
    public final boolean mo5791e() {
        this.f4815n = 0;
        if (this.f4805d == null) {
            return true;
        }
        boolean zMo11800D = this.f4805d.mo11800D();
        if (zMo11800D) {
            return zMo11800D;
        }
        this.f4805d.mo5712a("onbackblocked", Collections.emptyMap());
        return zMo11800D;
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: f */
    public final void mo5792f() {
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: g */
    public final void mo5793g() {
        if (((Boolean) bxm.m10409f().m10546a(can.f9541cH)).booleanValue()) {
            if (this.f4805d == null || this.f4805d.mo11798B()) {
                C1560fm.m11615e("The webview does not exist. Ignoring action.");
            } else {
                C0710au.m5571g();
                C1603hb.m11457b(this.f4805d);
            }
        }
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: h */
    public final void mo5794h() {
        if (this.f4803a != null && this.f4803a.f4789k == 4) {
            if (this.f4811j) {
                this.f4815n = 3;
                this.f4804c.finish();
            } else {
                this.f4811j = true;
            }
        }
        if (this.f4803a.f4781c != null) {
            this.f4803a.f4781c.mo5621d();
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9541cH)).booleanValue()) {
            return;
        }
        if (this.f4805d == null || this.f4805d.mo11798B()) {
            C1560fm.m11615e("The webview does not exist. Ignoring action.");
        } else {
            C0710au.m5571g();
            C1603hb.m11457b(this.f4805d);
        }
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: i */
    public final void mo5795i() {
        m5787b();
        if (this.f4803a.f4781c != null) {
            this.f4803a.f4781c.mo5620c();
        }
        if (!((Boolean) bxm.m10409f().m10546a(can.f9541cH)).booleanValue() && this.f4805d != null && (!this.f4804c.isFinishing() || this.f4806e == null)) {
            C0710au.m5571g();
            C1603hb.m11456a(this.f4805d);
        }
        m5778r();
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: j */
    public final void mo5796j() {
        if (((Boolean) bxm.m10409f().m10546a(can.f9541cH)).booleanValue() && this.f4805d != null && (!this.f4804c.isFinishing() || this.f4806e == null)) {
            C0710au.m5571g();
            C1603hb.m11456a(this.f4805d);
        }
        m5778r();
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: k */
    public final void mo5797k() {
        if (this.f4805d != null) {
            C0833h c0833h = this.f4813l;
            Object obj = this.f4805d;
            if (obj == null) {
                throw null;
            }
            c0833h.removeView((View) obj);
        }
        m5778r();
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: l */
    public final void mo5798l() {
        this.f4819r = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m5799m() {
        this.f4813l.removeView(this.f4807f);
        m5776a(true);
    }

    /* JADX INFO: renamed from: n */
    final void m5800n() {
        if (this.f4821t) {
            return;
        }
        this.f4821t = true;
        if (this.f4805d != null) {
            C0833h c0833h = this.f4813l;
            Object obj = this.f4805d;
            if (obj == null) {
                throw null;
            }
            c0833h.removeView((View) obj);
            if (this.f4806e != null) {
                this.f4805d.mo11810a(this.f4806e.f4829d);
                this.f4805d.mo11820b(false);
                ViewGroup viewGroup = this.f4806e.f4828c;
                Object obj2 = this.f4805d;
                if (obj2 == null) {
                    throw null;
                }
                viewGroup.addView((View) obj2, this.f4806e.f4826a, this.f4806e.f4827b);
                this.f4806e = null;
            } else if (this.f4804c.getApplicationContext() != null) {
                this.f4805d.mo11810a(this.f4804c.getApplicationContext());
            }
            this.f4805d = null;
        }
        if (this.f4803a == null || this.f4803a.f4781c == null) {
            return;
        }
        this.f4803a.f4781c.mo5618b();
    }

    /* JADX INFO: renamed from: o */
    public final void m5801o() {
        if (this.f4814m) {
            this.f4814m = false;
            m5779s();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5802p() {
        this.f4813l.f4824a = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m5803q() {
        synchronized (this.f4816o) {
            this.f4818q = true;
            if (this.f4817p != null) {
                C1596gv.f10711a.removeCallbacks(this.f4817p);
                C1596gv.f10711a.post(this.f4817p);
            }
        }
    }
}
