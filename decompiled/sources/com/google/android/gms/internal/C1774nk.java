package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.C0651a;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.ads.internal.overlay.BinderC0829d;
import com.google.android.gms.ads.internal.overlay.C0828c;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.nk */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C1774nk extends FrameLayout implements InterfaceC1758mv {

    /* JADX INFO: renamed from: a */
    private static final int f11135a = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    private final InterfaceC1758mv f11136b;

    /* JADX INFO: renamed from: c */
    private final C1729lt f11137c;

    public C1774nk(InterfaceC1758mv interfaceC1758mv) {
        super(interfaceC1758mv.getContext());
        this.f11136b = interfaceC1758mv;
        this.f11137c = new C1729lt(interfaceC1758mv.mo11828r(), this, this);
        C1759mw c1759mwMo11833w = this.f11136b.mo11833w();
        if (c1759mwMo11833w != null) {
            c1759mwMo11833w.f11085a = this;
        }
        Object obj = this.f11136b;
        if (obj == null) {
            throw null;
        }
        addView((View) obj);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: A */
    public final int mo11797A() {
        return this.f11136b.mo11797A();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: B */
    public final boolean mo11798B() {
        return this.f11136b.mo11798B();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: C */
    public final void mo11799C() {
        this.f11137c.m11724c();
        this.f11136b.mo11799C();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: D */
    public final boolean mo11800D() {
        return this.f11136b.mo11800D();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: E */
    public final boolean mo11801E() {
        return this.f11136b.mo11801E();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: F */
    public final boolean mo11802F() {
        return this.f11136b.mo11802F();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: G */
    public final void mo11803G() {
        this.f11136b.mo11803G();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: H */
    public final void mo11804H() {
        this.f11136b.mo11804H();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: I */
    public final View.OnClickListener mo11805I() {
        return this.f11136b.mo11805I();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: J */
    public final cbx mo11806J() {
        return this.f11136b.mo11806J();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: K */
    public final void mo11807K() {
        setBackgroundColor(f11135a);
        this.f11136b.setBackgroundColor(f11135a);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: L */
    public final void mo11808L() {
        TextView textView = new TextView(getContext());
        Resources resourcesM11320v = C0710au.m5573i().m11320v();
        textView.setText(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4334s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final C1729lt mo11749a() {
        return this.f11137c;
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11809a(int i) {
        this.f11136b.mo11809a(i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11810a(Context context) {
        this.f11136b.mo11810a(context);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11879a(C0828c c0828c) {
        this.f11136b.mo11879a(c0828c);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11811a(BinderC0829d binderC0829d) {
        this.f11136b.mo11811a(binderC0829d);
    }

    @Override // com.google.android.gms.internal.bue
    /* JADX INFO: renamed from: a */
    public final void mo10264a(bud budVar) {
        this.f11136b.mo10264a(budVar);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11812a(cbx cbxVar) {
        this.f11136b.mo11812a(cbxVar);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final void mo11750a(BinderC1779np binderC1779np) {
        this.f11136b.mo11750a(binderC1779np);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11813a(C1807oq c1807oq) {
        this.f11136b.mo11813a(c1807oq);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11814a(String str) {
        this.f11136b.mo11814a(str);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: a */
    public final void mo11815a(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        this.f11136b.mo11815a(str, interfaceC0748aa);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5712a(String str, Map<String, ?> map) {
        this.f11136b.mo5712a(str, map);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5713a(String str, JSONObject jSONObject) {
        this.f11136b.mo5713a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: a */
    public final void mo11752a(boolean z) {
        this.f11136b.mo11752a(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11880a(boolean z, int i) {
        this.f11136b.mo11880a(z, i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11881a(boolean z, int i, String str) {
        this.f11136b.mo11881a(z, i, str);
    }

    @Override // com.google.android.gms.internal.InterfaceC1800oj
    /* JADX INFO: renamed from: a */
    public final void mo11882a(boolean z, int i, String str, String str2) {
        this.f11136b.mo11882a(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: b */
    public final BinderC1779np mo11753b() {
        return this.f11136b.mo11753b();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11816b(int i) {
        this.f11136b.mo11816b(i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11817b(BinderC0829d binderC0829d) {
        this.f11136b.mo11817b(binderC0829d);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11818b(String str) {
        this.f11136b.mo11818b(str);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11819b(String str, InterfaceC0748aa<? super InterfaceC1758mv> interfaceC0748aa) {
        this.f11136b.mo11819b(str, interfaceC0748aa);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.ads.internal.p048js.InterfaceC0819y
    /* JADX INFO: renamed from: b */
    public final void mo5728b(String str, JSONObject jSONObject) {
        this.f11136b.mo5728b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: b */
    public final void mo11820b(boolean z) {
        this.f11136b.mo11820b(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: c */
    public final cay mo11754c() {
        return this.f11136b.mo11754c();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: c */
    public final void mo11821c(boolean z) {
        this.f11136b.mo11821c(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1785nv
    /* JADX INFO: renamed from: d */
    public final Activity mo11755d() {
        return this.f11136b.mo11755d();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: d */
    public final void mo11822d(boolean z) {
        this.f11136b.mo11822d(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void destroy() {
        this.f11136b.destroy();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: e */
    public final C0733bq mo11756e() {
        return this.f11136b.mo11756e();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: e */
    public final void mo11823e(boolean z) {
        this.f11136b.mo11823e(z);
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: f */
    public final void mo11757f() {
        this.f11136b.mo11757f();
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: g_ */
    public final void mo5536g_() {
        this.f11136b.mo5536g_();
    }

    @Override // com.google.android.gms.ads.internal.InterfaceC0703an
    /* JADX INFO: renamed from: h_ */
    public final void mo5537h_() {
        this.f11136b.mo5537h_();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: i */
    public final String mo11758i() {
        return this.f11136b.mo11758i();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: j */
    public final caz mo11759j() {
        return this.f11136b.mo11759j();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1739mc, com.google.android.gms.internal.InterfaceC1803om
    /* JADX INFO: renamed from: k */
    public final C1670jo mo11760k() {
        return this.f11136b.mo11760k();
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: l */
    public final int mo11761l() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void loadData(String str, String str2, String str3) {
        this.f11136b.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f11136b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void loadUrl(String str) {
        this.f11136b.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.InterfaceC1739mc
    /* JADX INFO: renamed from: m */
    public final int mo11762m() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: n */
    public final WebView mo11824n() {
        return this.f11136b.mo11824n();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: o */
    public final void mo11825o() {
        this.f11136b.mo11825o();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void onPause() {
        this.f11137c.m11723b();
        this.f11136b.onPause();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void onResume() {
        this.f11136b.onResume();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: p */
    public final void mo11826p() {
        this.f11136b.mo11826p();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: q */
    public final void mo11827q() {
        this.f11136b.mo11827q();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: r */
    public final Context mo11828r() {
        return this.f11136b.mo11828r();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: s */
    public final BinderC0829d mo11829s() {
        return this.f11136b.mo11829s();
    }

    @Override // android.view.View, com.google.android.gms.internal.InterfaceC1758mv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11136b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.InterfaceC1758mv
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f11136b.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f11136b.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f11136b.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    public final void stopLoading() {
        this.f11136b.stopLoading();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: t */
    public final BinderC0829d mo11830t() {
        return this.f11136b.mo11830t();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1801ok
    /* JADX INFO: renamed from: u */
    public final C1807oq mo11831u() {
        return this.f11136b.mo11831u();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: v */
    public final String mo11832v() {
        return this.f11136b.mo11832v();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: w */
    public final C1759mw mo11833w() {
        return this.f11136b.mo11833w();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv
    /* JADX INFO: renamed from: x */
    public final boolean mo11834x() {
        return this.f11136b.mo11834x();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1802ol
    /* JADX INFO: renamed from: y */
    public final afk mo11835y() {
        return this.f11136b.mo11835y();
    }

    @Override // com.google.android.gms.internal.InterfaceC1758mv, com.google.android.gms.internal.InterfaceC1786nw
    /* JADX INFO: renamed from: z */
    public final boolean mo11836z() {
        return this.f11136b.mo11836z();
    }
}
