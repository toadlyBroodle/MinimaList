package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.InterfaceC0703an;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.overlay.BinderC0829d;
import com.google.android.gms.ads.internal.overlay.C0828c;
import com.google.android.gms.common.util.C1310n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.nl */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class ViewTreeObserverOnGlobalLayoutListenerC1775nl extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, InterfaceC1758mv {

    /* JADX INFO: renamed from: A */
    private cay f11138A;

    /* JADX INFO: renamed from: B */
    private cay f11139B;

    /* JADX INFO: renamed from: C */
    private caz f11140C;

    /* JADX INFO: renamed from: D */
    private WeakReference<View.OnClickListener> f11141D;

    /* JADX INFO: renamed from: E */
    private BinderC0829d f11142E;

    /* JADX INFO: renamed from: F */
    private boolean f11143F;

    /* JADX INFO: renamed from: G */
    private C1656ja f11144G;

    /* JADX INFO: renamed from: H */
    private int f11145H;

    /* JADX INFO: renamed from: I */
    private int f11146I;

    /* JADX INFO: renamed from: J */
    private int f11147J;

    /* JADX INFO: renamed from: K */
    private int f11148K;

    /* JADX INFO: renamed from: L */
    private Map<String, AbstractC1751mo> f11149L;

    /* JADX INFO: renamed from: M */
    private final WindowManager f11150M;

    /* JADX INFO: renamed from: N */
    private final bwf f11151N;

    /* JADX INFO: renamed from: a */
    private final C1805oo f11152a;

    /* JADX INFO: renamed from: b */
    private final Object f11153b;

    /* JADX INFO: renamed from: c */
    private final afk f11154c;

    /* JADX INFO: renamed from: d */
    private final C1670jo f11155d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0703an f11156e;

    /* JADX INFO: renamed from: f */
    private final C0733bq f11157f;

    /* JADX INFO: renamed from: g */
    private C1759mw f11158g;

    /* JADX INFO: renamed from: h */
    private BinderC0829d f11159h;

    /* JADX INFO: renamed from: i */
    private C1807oq f11160i;

    /* JADX INFO: renamed from: j */
    private String f11161j;

    /* JADX INFO: renamed from: k */
    private boolean f11162k;

    /* JADX INFO: renamed from: l */
    private boolean f11163l;

    /* JADX INFO: renamed from: m */
    private boolean f11164m;

    /* JADX INFO: renamed from: n */
    private boolean f11165n;

    /* JADX INFO: renamed from: o */
    private Boolean f11166o;

    /* JADX INFO: renamed from: p */
    private int f11167p;

    /* JADX INFO: renamed from: q */
    private boolean f11168q;

    /* JADX INFO: renamed from: r */
    private boolean f11169r;

    /* JADX INFO: renamed from: s */
    private String f11170s;

    /* JADX INFO: renamed from: t */
    private BinderC1779np f11171t;

    /* JADX INFO: renamed from: u */
    private boolean f11172u;

    /* JADX INFO: renamed from: v */
    private boolean f11173v;

    /* JADX INFO: renamed from: w */
    private cbx f11174w;

    /* JADX INFO: renamed from: x */
    private int f11175x;

    /* JADX INFO: renamed from: y */
    private int f11176y;

    /* JADX INFO: renamed from: z */
    private cay f11177z;

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.android.gms.internal.nt, com.google.android.gms.internal.nu] */
    private ViewTreeObserverOnGlobalLayoutListenerC1775nl(C1805oo c1805oo, C1807oq c1807oq, String str, boolean z, boolean z2, afk afkVar, C1670jo c1670jo, cba cbaVar, InterfaceC0703an interfaceC0703an, C0733bq c0733bq, bwf bwfVar) {
        super(c1805oo);
        this.f11153b = new Object();
        this.f11168q = true;
        this.f11169r = false;
        this.f11170s = "";
        this.f11145H = -1;
        this.f11146I = -1;
        this.f11147J = -1;
        this.f11148K = -1;
        this.f11152a = c1805oo;
        this.f11160i = c1807oq;
        this.f11161j = str;
        this.f11164m = z;
        this.f11167p = -1;
        this.f11154c = afkVar;
        this.f11155d = c1670jo;
        this.f11156e = interfaceC0703an;
        this.f11157f = c0733bq;
        this.f11150M = (WindowManager) getContext().getSystemService("window");
        this.f11151N = bwfVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C1560fm.m11611b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(C0710au.m5569e().m11440a(c1805oo, c1670jo.f10855a));
        C0710au.m5571g().mo11469a(getContext(), settings);
        setDownloadListener(this);
        m11886P();
        if (C1310n.m7280c()) {
            addJavascriptInterface(new C1782ns(this, new Object(this) { // from class: com.google.android.gms.internal.nt

                /* JADX INFO: renamed from: a */
                private final InterfaceC1758mv f11203a;

                {
                    this.f11203a = this;
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f11144G = new C1656ja(this.f11152a.m11919a(), this, this, null);
        m11890T();
        this.f11140C = new caz(new cba(true, "make_wv", this.f11161j));
        this.f11140C.m10571a().m10577a(cbaVar);
        this.f11138A = cat.m10564a(this.f11140C.m10571a());
        this.f11140C.m10572a("native:view_create", this.f11138A);
        this.f11139B = null;
        this.f11177z = null;
        C0710au.m5571g().mo11473b(c1805oo);
    }

    /* JADX INFO: renamed from: M */
    private final boolean m11883M() {
        int iM11571b;
        int iM11571b2;
        if (!this.f11158g.m11864b() && !this.f11158g.m11865c()) {
            return false;
        }
        C0710au.m5569e();
        DisplayMetrics displayMetricsM11376a = C1596gv.m11376a(this.f11150M);
        bxm.m10404a();
        int iM11571b3 = C1657jb.m11571b(displayMetricsM11376a, displayMetricsM11376a.widthPixels);
        bxm.m10404a();
        int iM11571b4 = C1657jb.m11571b(displayMetricsM11376a, displayMetricsM11376a.heightPixels);
        Activity activityM11919a = this.f11152a.m11919a();
        if (activityM11919a == null || activityM11919a.getWindow() == null) {
            iM11571b = iM11571b4;
            iM11571b2 = iM11571b3;
        } else {
            C0710au.m5569e();
            int[] iArrM11404a = C1596gv.m11404a(activityM11919a);
            bxm.m10404a();
            iM11571b2 = C1657jb.m11571b(displayMetricsM11376a, iArrM11404a[0]);
            bxm.m10404a();
            iM11571b = C1657jb.m11571b(displayMetricsM11376a, iArrM11404a[1]);
        }
        if (this.f11146I == iM11571b3 && this.f11145H == iM11571b4 && this.f11147J == iM11571b2 && this.f11148K == iM11571b) {
            return false;
        }
        boolean z = (this.f11146I == iM11571b3 && this.f11145H == iM11571b4) ? false : true;
        this.f11146I = iM11571b3;
        this.f11145H = iM11571b4;
        this.f11147J = iM11571b2;
        this.f11148K = iM11571b;
        new ckf(this).m11060a(iM11571b3, iM11571b4, iM11571b2, iM11571b, displayMetricsM11376a.density, this.f11150M.getDefaultDisplay().getRotation());
        return z;
    }

    /* JADX INFO: renamed from: N */
    private final Boolean m11884N() {
        Boolean bool;
        synchronized (this.f11153b) {
            bool = this.f11166o;
        }
        return bool;
    }

    /* JADX INFO: renamed from: O */
    private final void m11885O() {
        cat.m10565a(this.f11140C.m10571a(), this.f11138A, "aeh2");
    }

    /* JADX INFO: renamed from: P */
    private final void m11886P() {
        synchronized (this.f11153b) {
            if (this.f11164m || this.f11160i.m11930d()) {
                C1560fm.m11610b("Enabling hardware acceleration on an overlay.");
                m11887Q();
            } else if (Build.VERSION.SDK_INT < 18) {
                C1560fm.m11610b("Disabling hardware acceleration on an AdView.");
                synchronized (this.f11153b) {
                    if (!this.f11165n) {
                        C0710au.m5571g().mo11478c((View) this);
                    }
                    this.f11165n = true;
                }
            } else {
                C1560fm.m11610b("Enabling hardware acceleration on an AdView.");
                m11887Q();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m11887Q() {
        synchronized (this.f11153b) {
            if (this.f11165n) {
                C0710au.m5571g().mo11474b((View) this);
            }
            this.f11165n = false;
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m11888R() {
        synchronized (this.f11153b) {
            if (!this.f11143F) {
                this.f11143F = true;
                C0710au.m5573i().m11322x();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m11889S() {
        synchronized (this.f11153b) {
            this.f11149L = null;
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m11890T() {
        cba cbaVarM10571a;
        if (this.f11140C == null || (cbaVarM10571a = this.f11140C.m10571a()) == null || C0710au.m5573i().m11303e() == null) {
            return;
        }
        C0710au.m5573i().m11303e().m10562a(cbaVarM10571a);
    }

    /* JADX INFO: renamed from: a */
    static ViewTreeObserverOnGlobalLayoutListenerC1775nl m11892a(Context context, C1807oq c1807oq, String str, boolean z, boolean z2, afk afkVar, C1670jo c1670jo, cba cbaVar, InterfaceC0703an interfaceC0703an, C0733bq c0733bq, bwf bwfVar) {
        return new ViewTreeObserverOnGlobalLayoutListenerC1775nl(new C1805oo(context), c1807oq, str, z, z2, afkVar, c1670jo, cbaVar, interfaceC0703an, c0733bq, bwfVar);
    }

    /* JADX INFO: renamed from: a */
    private final void m11894a(Boolean bool) {
        synchronized (this.f11153b) {
            this.f11166o = bool;
        }
        C0710au.m5573i().m11290a(bool);
    }

    /* JADX INFO: renamed from: c */
    private final void m11897c(String str) {
        synchronized (this.f11153b) {
            if (mo11798B()) {
                C1560fm.m11615e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m11898d(String str) {
        if (!C1310n.m7282e()) {
            String strValueOf = String.valueOf(str);
            m11897c(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
            return;
        }
        if (m11884N() == null) {
            synchronized (this.f11153b) {
                this.f11166o = C0710au.m5573i().m11307i();
                if (this.f11166o == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        m11894a((Boolean) true);
                    } catch (IllegalStateException e) {
                        m11894a((Boolean) false);
                    }
                }
            }
        }
        if (!m11884N().booleanValue()) {
            String strValueOf2 = String.valueOf(str);
            m11897c(strValueOf2.length() != 0 ? "javascript:".concat(strValueOf2) : new String("javascript:"));
        } else {
            synchronized (this.f11153b) {
                if (mo11798B()) {
                    C1560fm.m11615e("The webview is destroyed. Ignoring action.");
                } else {
                    evaluateJavascript(str, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m11899f(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        mo5712a("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: A */
    public final int mo11797A() {
        int i;
        synchronized (this.f11153b) {
            i = this.f11167p;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: B */
    public final boolean mo11798B() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11163l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: C */
    public final void mo11799C() {
        synchronized (this.f11153b) {
            C1560fm.m11343a("Destroying WebView!");
            m11888R();
            C1596gv.f10711a.post(new RunnableC1777nn(this));
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: D */
    public final boolean mo11800D() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11168q;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: E */
    public final boolean mo11801E() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11169r;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: F */
    public final boolean mo11802F() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11175x > 0;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: G */
    public final void mo11803G() {
        this.f11144G.m11555a();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: H */
    public final void mo11804H() {
        if (this.f11139B == null) {
            this.f11139B = cat.m10564a(this.f11140C.m10571a());
            this.f11140C.m10572a("native:view_load", this.f11139B);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: I */
    public final View.OnClickListener mo11805I() {
        return this.f11141D.get();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: J */
    public final cbx mo11806J() {
        cbx cbxVar;
        synchronized (this.f11153b) {
            cbxVar = this.f11174w;
        }
        return cbxVar;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: K */
    public final void mo11807K() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: L */
    public final void mo11808L() {
        C1560fm.m11343a("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final C1729lt mo11749a() {
        return null;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11809a(int i) {
        if (i == 0) {
            cat.m10565a(this.f11140C.m10571a(), this.f11138A, "aebb2");
        }
        m11885O();
        if (this.f11140C.m10571a() != null) {
            this.f11140C.m10571a().m10579a("close_type", String.valueOf(i));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.f11155d.f10855a);
        mo5712a("onhide", map);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11810a(Context context) {
        this.f11152a.setBaseContext(context);
        this.f11144G.m11556a(this.f11152a.m11919a());
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11879a(C0828c c0828c) {
        this.f11158g.m11851a(c0828c);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11811a(BinderC0829d binderC0829d) {
        synchronized (this.f11153b) {
            this.f11159h = binderC0829d;
        }
    }

    @Override // com.google.android.gms.internal.bue
    /* JADX INFO: renamed from: a */
    public final void mo10264a(bud budVar) {
        synchronized (this.f11153b) {
            this.f11172u = budVar.f9013a;
        }
        m11899f(budVar.f9013a);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11812a(cbx cbxVar) {
        synchronized (this.f11153b) {
            this.f11174w = cbxVar;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final void mo11750a(BinderC1779np binderC1779np) {
        synchronized (this.f11153b) {
            if (this.f11171t != null) {
                C1560fm.m11612c("Attempt to create multiple AdWebViewVideoControllers.");
            } else {
                this.f11171t = binderC1779np;
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11813a(C1807oq c1807oq) {
        synchronized (this.f11153b) {
            this.f11160i = c1807oq;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11814a(String str) {
        synchronized (this.f11153b) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
                C0710au.m5573i().m11292a(e, "AdWebViewImpl.loadUrlUnsafe");
                C1560fm.m11613c("Could not call loadUrl. ", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11815a(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        if (this.f11158g != null) {
            this.f11158g.m11857a(str, interfaceC0748aa);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5712a(String str, Map<String, ?> map) {
        try {
            mo5713a(str, C0710au.m5569e().m11442a(map));
        } catch (JSONException e) {
            C1560fm.m11615e("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5713a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        C1560fm.m11610b(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        m11898d(sb.toString());
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final void mo11752a(boolean z) {
        this.f11158g.m11859a(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11880a(boolean z, int i) {
        this.f11158g.m11860a(z, i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11881a(boolean z, int i, String str) {
        this.f11158g.m11861a(z, i, str);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11882a(boolean z, int i, String str, String str2) {
        this.f11158g.m11862a(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: b */
    public final BinderC1779np mo11753b() {
        BinderC1779np binderC1779np;
        synchronized (this.f11153b) {
            binderC1779np = this.f11171t;
        }
        return binderC1779np;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11816b(int i) {
        synchronized (this.f11153b) {
            this.f11167p = i;
            if (this.f11159h != null) {
                this.f11159h.m5781a(this.f11167p);
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11817b(BinderC0829d binderC0829d) {
        synchronized (this.f11153b) {
            this.f11142E = binderC0829d;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11818b(String str) {
        synchronized (this.f11153b) {
            if (str == null) {
                str = "";
            }
            this.f11170s = str;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11819b(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        if (this.f11158g != null) {
            this.f11158g.m11863b(str, interfaceC0748aa);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0819y
    /* JADX INFO: renamed from: b */
    public final void mo5728b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        m11898d(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length()).append(str).append("(").append(string).append(");").toString());
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11820b(boolean z) {
        synchronized (this.f11153b) {
            boolean z2 = z != this.f11164m;
            this.f11164m = z;
            m11886P();
            if (z2) {
                new ckf(this).m11064c(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: c */
    public final cay mo11754c() {
        return this.f11138A;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: c */
    public final void mo11821c(boolean z) {
        synchronized (this.f11153b) {
            if (this.f11159h != null) {
                this.f11159h.m5786a(this.f11158g.m11864b(), z);
            } else {
                this.f11162k = z;
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1785nv
    /* JADX INFO: renamed from: d */
    public final Activity mo11755d() {
        return this.f11152a.m11919a();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: d */
    public final void mo11822d(boolean z) {
        synchronized (this.f11153b) {
            this.f11168q = z;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void destroy() {
        synchronized (this.f11153b) {
            m11890T();
            this.f11144G.m11557b();
            if (this.f11159h != null) {
                this.f11159h.m5780a();
                this.f11159h.mo5797k();
                this.f11159h = null;
            }
            this.f11158g.m11874l();
            if (this.f11163l) {
                return;
            }
            C0710au.m5588x();
            C1749mm.m11781a(this);
            m11889S();
            this.f11163l = true;
            C1560fm.m11343a("Initiating WebView self destruct sequence in 3...");
            this.f11158g.m11869g();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: e */
    public final C0733bq mo11756e() {
        return this.f11157f;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: e */
    public final void mo11823e(boolean z) {
        synchronized (this.f11153b) {
            this.f11175x = (z ? 1 : -1) + this.f11175x;
            if (this.f11175x <= 0 && this.f11159h != null) {
                this.f11159h.m5803q();
            }
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f11153b) {
            if (!mo11798B()) {
                super.evaluateJavascript(str, valueCallback);
                return;
            }
            C1560fm.m11615e("The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: f */
    public final void mo11757f() {
        BinderC0829d binderC0829dMo11829s = mo11829s();
        if (binderC0829dMo11829s != null) {
            binderC0829dMo11829s.m5802p();
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f11153b != null) {
                synchronized (this.f11153b) {
                    if (!this.f11163l) {
                        this.f11158g.m11874l();
                        C0710au.m5588x();
                        C1749mm.m11781a(this);
                        m11889S();
                        m11888R();
                    }
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: g_ */
    public final void mo5536g_() {
        synchronized (this.f11153b) {
            this.f11169r = true;
            if (this.f11156e != null) {
                this.f11156e.mo5536g_();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: h_ */
    public final void mo5537h_() {
        synchronized (this.f11153b) {
            this.f11169r = false;
            if (this.f11156e != null) {
                this.f11156e.mo5537h_();
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: i */
    public final String mo11758i() {
        String str;
        synchronized (this.f11153b) {
            str = this.f11170s;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: j */
    public final caz mo11759j() {
        return this.f11140C;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1803om
    /* JADX INFO: renamed from: k */
    public final C1670jo mo11760k() {
        return this.f11155d;
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: l */
    public final int mo11761l() {
        return getMeasuredHeight();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void loadData(String str, String str2, String str3) {
        synchronized (this.f11153b) {
            if (mo11798B()) {
                C1560fm.m11615e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f11153b) {
            if (mo11798B()) {
                C1560fm.m11615e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void loadUrl(String str) {
        synchronized (this.f11153b) {
            if (mo11798B()) {
                C1560fm.m11615e("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                    C0710au.m5573i().m11292a(e, "AdWebViewImpl.loadUrl");
                    C1560fm.m11613c("Could not call loadUrl. ", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: m */
    public final int mo11762m() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: n */
    public final WebView mo11824n() {
        return this;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: o */
    public final void mo11825o() {
        m11885O();
        HashMap map = new HashMap(1);
        map.put("version", this.f11155d.f10855a);
        mo5712a("onhide", map);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.f11153b) {
            super.onAttachedToWindow();
            if (!mo11798B()) {
                this.f11144G.m11558c();
            }
            boolean z2 = this.f11172u;
            if (this.f11158g == null || !this.f11158g.m11865c()) {
                z = z2;
            } else {
                if (!this.f11173v) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerM11866d = this.f11158g.m11866d();
                    if (onGlobalLayoutListenerM11866d != null) {
                        C0710au.m5589y();
                        if (this == null) {
                            throw null;
                        }
                        C1708kz.m11663a(this, onGlobalLayoutListenerM11866d);
                    }
                    ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerM11867e = this.f11158g.m11867e();
                    if (onScrollChangedListenerM11867e != null) {
                        C0710au.m5589y();
                        if (this == null) {
                            throw null;
                        }
                        C1708kz.m11664a(this, onScrollChangedListenerM11867e);
                    }
                    this.f11173v = true;
                }
                m11883M();
            }
            m11899f(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this.f11153b) {
            if (!mo11798B()) {
                this.f11144G.m11559d();
            }
            super.onDetachedFromWindow();
            if (this.f11173v && this.f11158g != null && this.f11158g.m11865c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerM11866d = this.f11158g.m11866d();
                if (onGlobalLayoutListenerM11866d != null) {
                    C0710au.m5571g().mo11467a(getViewTreeObserver(), onGlobalLayoutListenerM11866d);
                }
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerM11867e = this.f11158g.m11867e();
                if (onScrollChangedListenerM11867e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListenerM11867e);
                }
                this.f11173v = false;
            }
        }
        m11899f(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C0710au.m5569e();
            C1596gv.m11390a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            C1560fm.m11610b(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (mo11798B()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        if (this.f11158g == null || this.f11158g.m11875m() == null) {
            return;
        }
        this.f11158g.m11875m().mo5648a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9471ar)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zM11883M = m11883M();
        BinderC0829d binderC0829dMo11829s = mo11829s();
        if (binderC0829dMo11829s == null || !zM11883M) {
            return;
        }
        binderC0829dMo11829s.m5801o();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int i, int i2) {
        int size;
        synchronized (this.f11153b) {
            if (mo11798B()) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (isInEditMode() || this.f11164m || this.f11160i.m11931e()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.f11160i.m11932f()) {
                BinderC1779np binderC1779npMo11753b = mo11753b();
                float fMo10426e = binderC1779npMo11753b != null ? binderC1779npMo11753b.mo10426e() : 0.0f;
                if (fMo10426e == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                int i3 = (int) (size3 * fMo10426e);
                int i4 = (int) (size2 / fMo10426e);
                if (size3 == 0 && i4 != 0) {
                    i3 = (int) (i4 * fMo10426e);
                    size3 = i4;
                } else if (size2 == 0 && i3 != 0) {
                    i4 = (int) (i3 / fMo10426e);
                    size2 = i3;
                }
                setMeasuredDimension(Math.min(i3, size2), Math.min(i4, size3));
                return;
            }
            if (this.f11160i.m11929c()) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9503bW)).booleanValue() || !C1310n.m7280c()) {
                    super.onMeasure(i, i2);
                    return;
                }
                mo11815a("/contentHeight", new C1776nm(this));
                m11898d("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f = this.f11152a.getResources().getDisplayMetrics().density;
                int size4 = View.MeasureSpec.getSize(i);
                switch (this.f11176y) {
                    case -1:
                        size = View.MeasureSpec.getSize(i2);
                        break;
                    default:
                        size = (int) (f * this.f11176y);
                        break;
                }
                setMeasuredDimension(size4, size);
                return;
            }
            if (this.f11160i.m11930d()) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f11150M.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size5 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size6 = View.MeasureSpec.getSize(i2);
            int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size5 : Integer.MAX_VALUE;
            int i6 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size6 : Integer.MAX_VALUE;
            if (this.f11160i.f11221b > i5 || this.f11160i.f11220a > i6) {
                float f2 = this.f11152a.getResources().getDisplayMetrics().density;
                int i7 = (int) (size5 / f2);
                C1560fm.m11615e(new StringBuilder(103).append("Not enough space to show ad. Needs ").append((int) (this.f11160i.f11221b / f2)).append("x").append((int) (this.f11160i.f11220a / f2)).append(" dp, but only has ").append(i7).append("x").append((int) (size6 / f2)).append(" dp.").toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.f11160i.f11221b, this.f11160i.f11220a);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void onPause() {
        if (mo11798B()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            C1560fm.m11611b("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void onResume() {
        if (mo11798B()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            C1560fm.m11611b("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11158g.m11865c()) {
            synchronized (this.f11153b) {
                if (this.f11174w != null) {
                    this.f11174w.mo10662a(motionEvent);
                }
            }
        } else if (this.f11154c != null) {
            this.f11154c.m7811a(motionEvent);
        }
        if (mo11798B()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: p */
    public final void mo11826p() {
        if (this.f11177z == null) {
            cat.m10565a(this.f11140C.m10571a(), this.f11138A, "aes2");
            this.f11177z = cat.m10564a(this.f11140C.m10571a());
            this.f11140C.m10572a("native:view_show", this.f11177z);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f11155d.f10855a);
        mo5712a("onshow", map);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: q */
    public final void mo11827q() {
        HashMap map = new HashMap(3);
        C0710au.m5569e();
        map.put("app_muted", String.valueOf(C1596gv.m11419d()));
        C0710au.m5569e();
        map.put("app_volume", String.valueOf(C1596gv.m11413c()));
        C0710au.m5569e();
        map.put("device_volume", String.valueOf(C1596gv.m11432j(getContext())));
        mo5712a("volume", map);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: r */
    public final Context mo11828r() {
        return this.f11152a.m11920b();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: s */
    public final BinderC0829d mo11829s() {
        BinderC0829d binderC0829d;
        synchronized (this.f11153b) {
            binderC0829d = this.f11159h;
        }
        return binderC0829d;
    }

    @Override // android.view.View, com.google.android.gms.internal.InterfaceC1758mv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11141D = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C1759mw) {
            this.f11158g = (C1759mw) webViewClient;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.InterfaceC1758mv
    public final void stopLoading() {
        if (mo11798B()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            C1560fm.m11611b("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: t */
    public final BinderC0829d mo11830t() {
        BinderC0829d binderC0829d;
        synchronized (this.f11153b) {
            binderC0829d = this.f11142E;
        }
        return binderC0829d;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1801ok
    /* JADX INFO: renamed from: u */
    public final C1807oq mo11831u() {
        C1807oq c1807oq;
        synchronized (this.f11153b) {
            c1807oq = this.f11160i;
        }
        return c1807oq;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: v */
    public final String mo11832v() {
        String str;
        synchronized (this.f11153b) {
            str = this.f11161j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: w */
    public final C1759mw mo11833w() {
        return this.f11158g;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: x */
    public final boolean mo11834x() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11162k;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1802ol
    /* JADX INFO: renamed from: y */
    public final afk mo11835y() {
        return this.f11154c;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1786nw
    /* JADX INFO: renamed from: z */
    public final boolean mo11836z() {
        boolean z;
        synchronized (this.f11153b) {
            z = this.f11164m;
        }
        return z;
    }
}
