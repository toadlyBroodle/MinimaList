package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.InterfaceC0703an;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.overlay.BinderC0829d;
import com.google.android.gms.ads.internal.p048js.InterfaceC0783a;
import com.google.android.gms.ads.internal.p048js.InterfaceC0819y;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.mv */
/* JADX INFO: loaded from: classes.dex */
@cnb
public interface InterfaceC1758mv extends InterfaceC0703an, InterfaceC0783a, InterfaceC0819y, bue, InterfaceC1739mc, InterfaceC1785nv, InterfaceC1786nw, InterfaceC1800oj, InterfaceC1802ol, InterfaceC1803om, InterfaceC1804on {
    /* JADX INFO: renamed from: A */
    int mo11797A();

    /* JADX INFO: renamed from: B */
    boolean mo11798B();

    /* JADX INFO: renamed from: C */
    void mo11799C();

    /* JADX INFO: renamed from: D */
    boolean mo11800D();

    /* JADX INFO: renamed from: E */
    boolean mo11801E();

    /* JADX INFO: renamed from: F */
    boolean mo11802F();

    /* JADX INFO: renamed from: G */
    void mo11803G();

    /* JADX INFO: renamed from: H */
    void mo11804H();

    /* JADX INFO: renamed from: I */
    View.OnClickListener mo11805I();

    /* JADX INFO: renamed from: J */
    cbx mo11806J();

    /* JADX INFO: renamed from: K */
    void mo11807K();

    /* JADX INFO: renamed from: L */
    void mo11808L();

    /* JADX INFO: renamed from: a */
    void mo11809a(int i);

    /* JADX INFO: renamed from: a */
    void mo11810a(Context context);

    /* JADX INFO: renamed from: a */
    void mo11811a(BinderC0829d binderC0829d);

    /* JADX INFO: renamed from: a */
    void mo11812a(cbx cbxVar);

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    void mo11750a(BinderC1779np binderC1779np);

    /* JADX INFO: renamed from: a */
    void mo11813a(C1807oq c1807oq);

    /* JADX INFO: renamed from: a */
    void mo11814a(String str);

    /* JADX INFO: renamed from: a */
    void mo11815a(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa);

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    void mo5712a(String str, Map<String, ?> map);

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    void mo5713a(String str, JSONObject jSONObject);

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: b */
    BinderC1779np mo11753b();

    /* JADX INFO: renamed from: b */
    void mo11816b(int i);

    /* JADX INFO: renamed from: b */
    void mo11817b(BinderC0829d binderC0829d);

    /* JADX INFO: renamed from: b */
    void mo11818b(String str);

    /* JADX INFO: renamed from: b */
    void mo11819b(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa);

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0819y
    /* JADX INFO: renamed from: b */
    void mo5728b(String str, JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    void mo11820b(boolean z);

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: c */
    cay mo11754c();

    /* JADX INFO: renamed from: c */
    void mo11821c(boolean z);

    @Override // com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1785nv
    /* JADX INFO: renamed from: d */
    Activity mo11755d();

    /* JADX INFO: renamed from: d */
    void mo11822d(boolean z);

    void destroy();

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: e */
    C0733bq mo11756e();

    /* JADX INFO: renamed from: e */
    void mo11823e(boolean z);

    @Override // com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1785nv
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: i */
    String mo11758i();

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: j */
    caz mo11759j();

    @Override // com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1803om
    /* JADX INFO: renamed from: k */
    C1670jo mo11760k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* JADX INFO: renamed from: n */
    WebView mo11824n();

    /* JADX INFO: renamed from: o */
    void mo11825o();

    void onPause();

    void onResume();

    /* JADX INFO: renamed from: p */
    void mo11826p();

    /* JADX INFO: renamed from: q */
    void mo11827q();

    /* JADX INFO: renamed from: r */
    Context mo11828r();

    /* JADX INFO: renamed from: s */
    BinderC0829d mo11829s();

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* JADX INFO: renamed from: t */
    BinderC0829d mo11830t();

    @Override // com.google.android.gms.internal.InterfaceC1801ok
    /* JADX INFO: renamed from: u */
    C1807oq mo11831u();

    /* JADX INFO: renamed from: v */
    String mo11832v();

    /* JADX INFO: renamed from: w */
    C1759mw mo11833w();

    /* JADX INFO: renamed from: x */
    boolean mo11834x();

    @Override // com.google.android.gms.internal.InterfaceC1802ol
    /* JADX INFO: renamed from: y */
    afk mo11835y();

    @Override // com.google.android.gms.internal.InterfaceC1786nw
    /* JADX INFO: renamed from: z */
    boolean mo11836z();
}
