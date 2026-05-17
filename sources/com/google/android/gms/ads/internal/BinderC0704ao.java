package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1590gp;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.InterfaceC1487cu;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.afl;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxp;
import com.google.android.gms.internal.bxs;
import com.google.android.gms.internal.bye;
import com.google.android.gms.internal.byi;
import com.google.android.gms.internal.byp;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.bzd;
import com.google.android.gms.internal.bzw;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cbh;
import com.google.android.gms.internal.ckp;
import com.google.android.gms.internal.ckv;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ao */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0704ao extends bye {

    /* JADX INFO: renamed from: a */
    private final C1670jo f4450a;

    /* JADX INFO: renamed from: b */
    private final bxb f4451b;

    /* JADX INFO: renamed from: c */
    private final Future<afk> f4452c = C1590gp.m11371a(C1590gp.f10701a, new CallableC0707ar(this));

    /* JADX INFO: renamed from: d */
    private final Context f4453d;

    /* JADX INFO: renamed from: e */
    private final C0709at f4454e;

    /* JADX INFO: renamed from: f */
    private WebView f4455f;

    /* JADX INFO: renamed from: g */
    private bxs f4456g;

    /* JADX INFO: renamed from: h */
    private afk f4457h;

    /* JADX INFO: renamed from: i */
    private AsyncTask<Void, Void, String> f4458i;

    public BinderC0704ao(Context context, bxb bxbVar, String str, C1670jo c1670jo) {
        this.f4453d = context;
        this.f4450a = c1670jo;
        this.f4451b = bxbVar;
        this.f4455f = new WebView(this.f4453d);
        this.f4454e = new C0709at(str);
        m5550a(0);
        this.f4455f.setVerticalScrollBarEnabled(false);
        this.f4455f.getSettings().setJavaScriptEnabled(true);
        this.f4455f.setWebViewClient(new C0705ap(this));
        this.f4455f.setOnTouchListener(new ViewOnTouchListenerC0706aq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final String m5544c(String str) {
        if (this.f4457h == null) {
            return str;
        }
        Uri uriM7809a = Uri.parse(str);
        try {
            uriM7809a = this.f4457h.m7809a(uriM7809a, this.f4453d, null, null);
        } catch (afl e) {
            C1560fm.m11613c("Unable to process ad data", e);
        }
        return uriM7809a.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m5546d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f4453d.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: A */
    public final String mo5443A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: B */
    public final byi mo5444B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: C */
    public final bxs mo5445C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final String mo5549a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    final void m5550a(int i) {
        if (this.f4455f == null) {
            return;
        }
        this.f4455f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5450a(bxb bxbVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5451a(bxp bxpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5452a(bxs bxsVar) {
        this.f4456g = bxsVar;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5453a(byi byiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5454a(byp bypVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5455a(bzd bzdVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5456a(bzw bzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5459a(ckp ckpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5460a(ckv ckvVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5461a(InterfaceC1487cu interfaceC1487cu) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5464a(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: renamed from: b */
    final int m5551b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            bxm.m10404a();
            return C1657jb.m11560a(this.f4453d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final void mo5472b(boolean z) {
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final boolean mo5473b(bwx bwxVar) {
        C1221aj.m7066a(this.f4455f, "This Search Ad has already been torn down");
        this.f4454e.m5557a(bwxVar, this.f4450a);
        this.f4458i = new AsyncTaskC0708as(this, null).execute(new Void[0]);
        return true;
    }

    /* JADX INFO: renamed from: c */
    final String m5552c() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) bxm.m10409f().m10546a(can.f9567ch));
        builder.appendQueryParameter("query", this.f4454e.m5558b());
        builder.appendQueryParameter("pubId", this.f4454e.m5559c());
        Map<String, String> mapM5560d = this.f4454e.m5560d();
        for (String str : mapM5560d.keySet()) {
            builder.appendQueryParameter(str, mapM5560d.get(str));
        }
        Uri uriBuild = builder.build();
        if (this.f4457h != null) {
            try {
                uriBuild = this.f4457h.m7808a(uriBuild, this.f4453d);
            } catch (afl e) {
                C1560fm.m11613c("Unable to process ad data", e);
            }
        }
        String strM5553d = m5553d();
        String encodedQuery = uriBuild.getEncodedQuery();
        return new StringBuilder(String.valueOf(strM5553d).length() + 1 + String.valueOf(encodedQuery).length()).append(strM5553d).append("#").append(encodedQuery).toString();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public final void mo5474c(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: renamed from: d */
    final String m5553d() {
        String strM5556a = this.f4454e.m5556a();
        String str = TextUtils.isEmpty(strM5556a) ? "www.google.com" : strM5556a;
        String str2 = (String) bxm.m10409f().m10546a(can.f9567ch);
        return new StringBuilder(String.valueOf("https://").length() + String.valueOf(str).length() + String.valueOf(str2).length()).append("https://").append(str).append(str2).toString();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: f_ */
    public final String mo5554f_() {
        return null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: i */
    public final void mo5479i() {
        C1221aj.m7073b("destroy must be called on the main UI thread.");
        this.f4458i.cancel(true);
        this.f4452c.cancel(true);
        this.f4455f.destroy();
        this.f4455f = null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo5480j() {
        C1221aj.m7073b("getAdFrame must be called on the main UI thread.");
        return BinderC0654c.m5329a(this.f4455f);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: k */
    public final bxb mo5481k() {
        return this.f4451b;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: l */
    public final boolean mo5482l() {
        return false;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: m */
    public final void mo5483m() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        C1221aj.m7073b("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        C1221aj.m7073b("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: p */
    public final void mo5486p() {
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: q */
    public final boolean mo5487q() {
        return false;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public final byx mo5488r() {
        return null;
    }
}
