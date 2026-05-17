package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.C0025a;
import android.support.v4.p019j.C0246q;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0734br;
import com.google.android.gms.ads.internal.gmsg.C0747a;
import com.google.android.gms.ads.internal.gmsg.C0751ad;
import com.google.android.gms.ads.internal.gmsg.C0754ag;
import com.google.android.gms.ads.internal.gmsg.C0755b;
import com.google.android.gms.ads.internal.gmsg.C0756c;
import com.google.android.gms.ads.internal.gmsg.C0764k;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0752ae;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0762i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0828c;
import com.google.android.gms.ads.internal.overlay.C0837l;
import com.google.android.gms.ads.internal.overlay.InterfaceC0839n;
import com.google.android.gms.ads.internal.overlay.InterfaceC0842q;
import com.google.android.gms.common.util.InterfaceC1311o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.mw */
/* JADX INFO: loaded from: classes.dex */
@cnb
public class C1759mw extends WebViewClient {

    /* JADX INFO: renamed from: c */
    private static final String[] f11079c = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* JADX INFO: renamed from: d */
    private static final String[] f11080d = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* JADX INFO: renamed from: A */
    private boolean f11081A;

    /* JADX INFO: renamed from: B */
    private boolean f11082B;

    /* JADX INFO: renamed from: C */
    private int f11083C;

    /* JADX INFO: renamed from: D */
    private View.OnAttachStateChangeListener f11084D;

    /* JADX INFO: renamed from: a */
    protected InterfaceC1758mv f11085a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC1528eh f11086b;

    /* JADX INFO: renamed from: e */
    private final HashMap<String, List<InterfaceC0748aa<? super InterfaceC1758mv>>> f11087e;

    /* JADX INFO: renamed from: f */
    private final Object f11088f;

    /* JADX INFO: renamed from: g */
    private bws f11089g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0839n f11090h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1764na f11091i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1765nb f11092j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0762i f11093k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1766nc f11094l;

    /* JADX INFO: renamed from: m */
    private boolean f11095m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0752ae f11096n;

    /* JADX INFO: renamed from: o */
    private boolean f11097o;

    /* JADX INFO: renamed from: p */
    private boolean f11098p;

    /* JADX INFO: renamed from: q */
    private ViewTreeObserver.OnGlobalLayoutListener f11099q;

    /* JADX INFO: renamed from: r */
    private ViewTreeObserver.OnScrollChangedListener f11100r;

    /* JADX INFO: renamed from: s */
    private boolean f11101s;

    /* JADX INFO: renamed from: t */
    private InterfaceC0842q f11102t;

    /* JADX INFO: renamed from: u */
    private final cke f11103u;

    /* JADX INFO: renamed from: v */
    private C0734br f11104v;

    /* JADX INFO: renamed from: w */
    private cju f11105w;

    /* JADX INFO: renamed from: x */
    private ckg f11106x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1768ne f11107y;

    /* JADX INFO: renamed from: z */
    private boolean f11108z;

    public C1759mw(InterfaceC1758mv interfaceC1758mv, boolean z) {
        this(interfaceC1758mv, z, new cke(interfaceC1758mv, interfaceC1758mv.mo11828r(), new bzy(interfaceC1758mv.getContext())), null);
    }

    private C1759mw(InterfaceC1758mv interfaceC1758mv, boolean z, cke ckeVar, cju cjuVar) {
        this.f11087e = new HashMap<>();
        this.f11088f = new Object();
        this.f11095m = false;
        this.f11085a = interfaceC1758mv;
        this.f11097o = z;
        this.f11103u = ckeVar;
        this.f11105w = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return new android.webkit.WebResourceResponse(r7, r8, r0.getInputStream());
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse m11837a(String str) throws IOException {
        URL url = new URL(str);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 > 20) {
                throw new IOException(new StringBuilder(32).append("Too many redirects (20)").toString());
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            C0710au.m5569e().m11444a(this.f11085a.getContext(), this.f11085a.mo11760k().f10855a, false, httpURLConnection);
            C1661jf c1661jf = new C1661jf();
            c1661jf.m11604a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            C0710au.m5569e();
            String strM11426f = C1596gv.m11426f(httpURLConnection.getContentType());
            C0710au.m5569e();
            String strM11427g = C1596gv.m11427g(httpURLConnection.getContentType());
            c1661jf.m11603a(httpURLConnection, responseCode);
            if (responseCode < 300 || responseCode >= 400) {
                break;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                C1560fm.m11615e("Protocol is null");
                return null;
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                String strValueOf = String.valueOf(protocol);
                C1560fm.m11615e(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
                return null;
            }
            String strValueOf2 = String.valueOf(headerField);
            C1560fm.m11610b(strValueOf2.length() != 0 ? "Redirecting to ".concat(strValueOf2) : new String("Redirecting to "));
            httpURLConnection.disconnect();
            i = i2;
            url = url2;
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC1766nc m11839a(C1759mw c1759mw, InterfaceC1766nc interfaceC1766nc) {
        c1759mw.f11094l = null;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m11840a(Context context, String str, String str2, String str3) {
        String host;
        if (((Boolean) bxm.m10409f().m10546a(can.f9511be)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri uri = Uri.parse(str3);
                host = uri.getHost() != null ? uri.getHost() : "";
            }
            bundle.putString("host", host);
            C0710au.m5569e().m11443a(context, this.f11085a.mo11760k().f10855a, "gmob-apps", bundle, true);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11841a(Uri uri) {
        String path = uri.getPath();
        List<InterfaceC0748aa<? super InterfaceC1758mv>> list = this.f11087e.get(path);
        if (list == null) {
            String strValueOf = String.valueOf(uri);
            C1560fm.m11343a(new StringBuilder(String.valueOf(strValueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(strValueOf).toString());
            return;
        }
        C0710au.m5569e();
        Map<String, String> mapM11385a = C1596gv.m11385a(uri);
        if (C1560fm.m11609a(2)) {
            String strValueOf2 = String.valueOf(path);
            C1560fm.m11343a(strValueOf2.length() != 0 ? "Received GMSG: ".concat(strValueOf2) : new String("Received GMSG: "));
            for (String str : mapM11385a.keySet()) {
                String str2 = mapM11385a.get(str);
                C1560fm.m11343a(new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length()).append("  ").append(str).append(": ").append(str2).toString());
            }
        }
        Iterator<InterfaceC0748aa<? super InterfaceC1758mv>> it = list.iterator();
        while (it.hasNext()) {
            it.next().zza(this.f11085a, mapM11385a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11842a(View view, InterfaceC1528eh interfaceC1528eh, int i) {
        if (!interfaceC1528eh.mo11212b() || i <= 0) {
            return;
        }
        interfaceC1528eh.mo11208a(view);
        if (interfaceC1528eh.mo11212b()) {
            C1596gv.f10711a.postDelayed(new RunnableC1760mx(this, view, interfaceC1528eh, i), 100L);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11843a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean zM11042a = this.f11105w != null ? this.f11105w.m11042a() : false;
        C0710au.m5567c();
        C0837l.m5804a(this.f11085a.getContext(), adOverlayInfoParcel, zM11042a ? false : true);
        if (this.f11086b != null) {
            String str = adOverlayInfoParcel.f4790l;
            if (str == null && adOverlayInfoParcel.f4779a != null) {
                str = adOverlayInfoParcel.f4779a.f4794a;
            }
            this.f11086b.mo11209a(str);
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m11845o() {
        if (this.f11084D == null) {
            return;
        }
        Object obj = this.f11085a;
        if (obj == null) {
            throw null;
        }
        ((View) obj).removeOnAttachStateChangeListener(this.f11084D);
    }

    /* JADX INFO: renamed from: p */
    private final void m11846p() {
        if (this.f11091i != null && ((this.f11081A && this.f11083C <= 0) || this.f11082B)) {
            this.f11091i.mo5739a(this.f11085a, !this.f11082B);
            this.f11091i = null;
        }
        this.f11085a.mo11804H();
    }

    /* JADX INFO: renamed from: a */
    public final C0734br m11847a() {
        return this.f11104v;
    }

    /* JADX INFO: renamed from: a */
    public final void m11848a(int i, int i2) {
        if (this.f11105w != null) {
            this.f11105w.m11038a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11849a(int i, int i2, boolean z) {
        this.f11103u.m11058a(i, i2);
        if (this.f11105w != null) {
            this.f11105w.m11039a(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11850a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f11088f) {
            this.f11098p = true;
            this.f11085a.mo11803G();
            this.f11099q = onGlobalLayoutListener;
            this.f11100r = onScrollChangedListener;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11851a(C0828c c0828c) {
        boolean zMo11836z = this.f11085a.mo11836z();
        m11843a(new AdOverlayInfoParcel(c0828c, (!zMo11836z || this.f11085a.mo11831u().m11930d()) ? this.f11089g : null, zMo11836z ? null : this.f11090h, this.f11102t, this.f11085a.mo11760k()));
    }

    /* JADX INFO: renamed from: a */
    public final void m11852a(bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0762i interfaceC0762i, InterfaceC0842q interfaceC0842q, boolean z, InterfaceC0752ae interfaceC0752ae, C0734br c0734br, ckg ckgVar, InterfaceC1528eh interfaceC1528eh) {
        C0734br c0734br2 = c0734br == null ? new C0734br(this.f11085a.getContext(), interfaceC1528eh, null) : c0734br;
        this.f11105w = new cju(this.f11085a, ckgVar);
        this.f11086b = interfaceC1528eh;
        m11857a("/appEvent", new C0747a(interfaceC0762i));
        m11857a("/backButton", C0764k.f4649j);
        m11857a("/refresh", C0764k.f4650k);
        m11857a("/canOpenURLs", C0764k.f4640a);
        m11857a("/canOpenIntents", C0764k.f4641b);
        m11857a("/click", C0764k.f4642c);
        m11857a("/close", C0764k.f4643d);
        m11857a("/customClose", C0764k.f4644e);
        m11857a("/instrument", C0764k.f4653n);
        m11857a("/delayPageLoaded", C0764k.f4655p);
        m11857a("/delayPageClosed", C0764k.f4656q);
        m11857a("/getLocationInfo", C0764k.f4657r);
        m11857a("/httpTrack", C0764k.f4645f);
        m11857a("/log", C0764k.f4646g);
        m11857a("/mraid", new C0755b(c0734br2, this.f11105w));
        m11857a("/mraidLoaded", this.f11103u);
        m11857a("/open", new C0756c(this.f11085a.getContext(), this.f11085a.mo11760k(), this.f11085a.mo11835y(), interfaceC0842q, bwsVar, interfaceC0762i, interfaceC0839n, c0734br2, this.f11105w));
        m11857a("/precache", new C1755ms());
        m11857a("/touch", C0764k.f4648i);
        m11857a("/video", C0764k.f4651l);
        m11857a("/videoMeta", C0764k.f4652m);
        if (C0710au.m5590z().m11236a(this.f11085a.getContext())) {
            m11857a("/logScionEvent", new C0754ag(this.f11085a.getContext()));
        }
        if (interfaceC0752ae != null) {
            m11857a("/setInterstitialProperties", new C0751ad(interfaceC0752ae));
        }
        this.f11089g = bwsVar;
        this.f11090h = interfaceC0839n;
        this.f11093k = interfaceC0762i;
        this.f11102t = interfaceC0842q;
        this.f11104v = c0734br2;
        this.f11106x = ckgVar;
        this.f11096n = interfaceC0752ae;
        this.f11095m = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m11853a(InterfaceC1764na interfaceC1764na) {
        this.f11091i = interfaceC1764na;
    }

    /* JADX INFO: renamed from: a */
    public final void m11854a(InterfaceC1765nb interfaceC1765nb) {
        this.f11092j = interfaceC1765nb;
    }

    /* JADX INFO: renamed from: a */
    public final void m11855a(InterfaceC1766nc interfaceC1766nc) {
        this.f11094l = interfaceC1766nc;
    }

    /* JADX INFO: renamed from: a */
    public final void m11856a(InterfaceC1768ne interfaceC1768ne) {
        this.f11107y = interfaceC1768ne;
    }

    /* JADX INFO: renamed from: a */
    public final void m11857a(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        synchronized (this.f11088f) {
            List<InterfaceC0748aa<? super InterfaceC1758mv>> copyOnWriteArrayList = this.f11087e.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f11087e.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(interfaceC0748aa);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11858a(String str, InterfaceC1311o<InterfaceC0748aa<? super InterfaceC1758mv>> interfaceC1311o) {
        synchronized (this.f11088f) {
            List<InterfaceC0748aa<? super InterfaceC1758mv>> list = this.f11087e.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa : list) {
                if (interfaceC1311o.mo5738a(interfaceC0748aa)) {
                    arrayList.add(interfaceC0748aa);
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11859a(boolean z) {
        this.f11095m = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m11860a(boolean z, int i) {
        m11843a(new AdOverlayInfoParcel((!this.f11085a.mo11836z() || this.f11085a.mo11831u().m11930d()) ? this.f11089g : null, this.f11090h, this.f11102t, this.f11085a, z, i, this.f11085a.mo11760k()));
    }

    /* JADX INFO: renamed from: a */
    public final void m11861a(boolean z, int i, String str) {
        boolean zMo11836z = this.f11085a.mo11836z();
        m11843a(new AdOverlayInfoParcel((!zMo11836z || this.f11085a.mo11831u().m11930d()) ? this.f11089g : null, zMo11836z ? null : new C1767nd(this.f11085a, this.f11090h), this.f11093k, this.f11102t, this.f11085a, z, i, str, this.f11085a.mo11760k()));
    }

    /* JADX INFO: renamed from: a */
    public final void m11862a(boolean z, int i, String str, String str2) {
        boolean zMo11836z = this.f11085a.mo11836z();
        m11843a(new AdOverlayInfoParcel((!zMo11836z || this.f11085a.mo11831u().m11930d()) ? this.f11089g : null, zMo11836z ? null : new C1767nd(this.f11085a, this.f11090h), this.f11093k, this.f11102t, this.f11085a, z, i, str, str2, this.f11085a.mo11760k()));
    }

    /* JADX INFO: renamed from: b */
    public final void m11863b(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        synchronized (this.f11088f) {
            List<InterfaceC0748aa<? super InterfaceC1758mv>> list = this.f11087e.get(str);
            if (list == null) {
                return;
            }
            list.remove(interfaceC0748aa);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11864b() {
        boolean z;
        synchronized (this.f11088f) {
            z = this.f11097o;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11865c() {
        boolean z;
        synchronized (this.f11088f) {
            z = this.f11098p;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener m11866d() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f11088f) {
            onGlobalLayoutListener = this.f11099q;
        }
        return onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: e */
    public final ViewTreeObserver.OnScrollChangedListener m11867e() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f11088f) {
            onScrollChangedListener = this.f11100r;
        }
        return onScrollChangedListener;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11868f() {
        boolean z;
        synchronized (this.f11088f) {
            z = this.f11101s;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m11869g() {
        synchronized (this.f11088f) {
            C1560fm.m11343a("Loading blank page in WebView, 2...");
            this.f11108z = true;
            this.f11085a.mo11814a("about:blank");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11870h() {
        InterfaceC1528eh interfaceC1528eh = this.f11086b;
        if (interfaceC1528eh != null) {
            WebView webViewMo11824n = this.f11085a.mo11824n();
            if (C0246q.m1780z(webViewMo11824n)) {
                m11842a(webViewMo11824n, interfaceC1528eh, 10);
                return;
            }
            m11845o();
            this.f11084D = new ViewOnAttachStateChangeListenerC1761my(this, interfaceC1528eh);
            Object obj = this.f11085a;
            if (obj == null) {
                throw null;
            }
            ((View) obj).addOnAttachStateChangeListener(this.f11084D);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11871i() {
        synchronized (this.f11088f) {
            this.f11101s = true;
        }
        this.f11083C++;
        m11846p();
    }

    /* JADX INFO: renamed from: j */
    public final void m11872j() {
        this.f11083C--;
        m11846p();
    }

    /* JADX INFO: renamed from: k */
    public final void m11873k() {
        this.f11082B = true;
        m11846p();
    }

    /* JADX INFO: renamed from: l */
    public final void m11874l() {
        if (this.f11086b != null) {
            this.f11086b.mo11214d();
            this.f11086b = null;
        }
        m11845o();
        synchronized (this.f11088f) {
            this.f11087e.clear();
            this.f11089g = null;
            this.f11090h = null;
            this.f11091i = null;
            this.f11092j = null;
            this.f11093k = null;
            this.f11095m = false;
            this.f11097o = false;
            this.f11098p = false;
            this.f11101s = false;
            this.f11102t = null;
            this.f11094l = null;
            if (this.f11105w != null) {
                this.f11105w.m11041a(true);
                this.f11105w = null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC1768ne m11875m() {
        return this.f11107y;
    }

    /* JADX INFO: renamed from: n */
    public final void m11876n() {
        synchronized (this.f11088f) {
            this.f11095m = false;
            this.f11097o = true;
            C0710au.m5569e();
            C1596gv.m11394a(new RunnableC1762mz(this));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        C1560fm.m11343a(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            m11841a(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f11088f) {
            if (this.f11108z) {
                C1560fm.m11343a("Blank page loaded, 1...");
                this.f11085a.mo11799C();
                return;
            }
            this.f11081A = true;
            if (this.f11092j != null) {
                this.f11092j.mo11125a(this.f11085a);
                this.f11092j = null;
            }
            m11846p();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m11840a(this.f11085a.getContext(), "http_err", (i >= 0 || (-i) + (-1) >= f11079c.length) ? String.valueOf(i) : f11079c[(-i) - 1], str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            m11840a(this.f11085a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= f11080d.length) ? String.valueOf(primaryError) : f11080d[primaryError], C0710au.m5571g().mo11463a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseM11837a;
        bvv bvvVarM10341a;
        try {
            String strM11251a = C1535eo.m11251a(str, this.f11085a.getContext());
            if (strM11251a.equals(str)) {
                bvy bvyVarM10349a = bvy.m10349a(str);
                if (bvyVarM10349a != null && (bvvVarM10341a = C0710au.m5574j().m10341a(bvyVarM10349a)) != null && bvvVarM10341a.m10345a()) {
                    webResourceResponseM11837a = new WebResourceResponse("", "", bvvVarM10341a.m10346b());
                } else if (C1661jf.m11600c()) {
                    webResourceResponseM11837a = ((Boolean) bxm.m10409f().m10546a(can.f9448aU)).booleanValue() ? m11837a(str) : null;
                }
            } else {
                webResourceResponseM11837a = m11837a(strM11251a);
            }
            return webResourceResponseM11837a;
        } catch (Exception | NoClassDefFoundError e) {
            C0710au.m5573i().m11292a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case C0025a.j.AppCompatTheme_panelBackground /* 79 */:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        Uri uriM7809a;
        String strValueOf = String.valueOf(str);
        C1560fm.m11343a(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri2 = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri2.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri2.getHost())) {
            m11841a(uri2);
        } else {
            if (this.f11095m && webView == this.f11085a.mo11824n()) {
                String scheme = uri2.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f11089g != null) {
                        if (((Boolean) bxm.m10409f().m10546a(can.f9457ad)).booleanValue()) {
                            this.f11089g.mo5308e();
                            if (this.f11086b != null) {
                                this.f11086b.mo11209a(str);
                            }
                            this.f11089g = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f11085a.mo11824n().willNotDraw()) {
                String strValueOf2 = String.valueOf(str);
                C1560fm.m11615e(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    afk afkVarMo11835y = this.f11085a.mo11835y();
                    if (afkVarMo11835y == null || !afkVarMo11835y.m7812a(uri2)) {
                        uriM7809a = uri2;
                    } else {
                        Context context = this.f11085a.getContext();
                        Object obj = this.f11085a;
                        if (obj == null) {
                            throw null;
                        }
                        uriM7809a = afkVarMo11835y.m7809a(uri2, context, (View) obj, this.f11085a.mo11755d());
                    }
                    uri = uriM7809a;
                } catch (afl e) {
                    String strValueOf3 = String.valueOf(str);
                    C1560fm.m11615e(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
                    uri = uri2;
                }
                if (this.f11104v == null || this.f11104v.m5645b()) {
                    m11851a(new C0828c("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
                } else {
                    this.f11104v.m5644a(str);
                }
            }
        }
        return true;
    }
}
