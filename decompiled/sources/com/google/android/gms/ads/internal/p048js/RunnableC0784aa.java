package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1648it;
import com.google.android.gms.internal.afk;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.aa */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0784aa implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ afk f4688a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0800f f4689b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0820z f4690c;

    RunnableC0784aa(C0820z c0820z, afk afkVar, C0800f c0800f) {
        this.f4690c = c0820z;
        this.f4688a = afkVar;
        this.f4689b = c0800f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0811q c0811q = new C0811q(this.f4690c.f4742b, this.f4690c.f4744d, this.f4688a, null);
            c0811q.mo5731a(new C0785ab(this, c0811q));
            c0811q.mo5725a("/jsLoaded", new C0788ae(this, c0811q));
            C1648it c1648it = new C1648it();
            C0789af c0789af = new C0789af(this, c0811q, c1648it);
            c1648it.m11542a(c0789af);
            c0811q.mo5725a("/requestReload", c0789af);
            if (this.f4690c.f4743c.endsWith(".js")) {
                c0811q.mo5732a(this.f4690c.f4743c);
            } else if (this.f4690c.f4743c.startsWith("<html>")) {
                c0811q.mo5735c(this.f4690c.f4743c);
            } else {
                c0811q.mo5734b(this.f4690c.f4743c);
            }
            C1596gv.f10711a.postDelayed(new RunnableC0790ag(this, c0811q), C0794ak.f4707a);
        } catch (Throwable th) {
            C1560fm.m11611b("Error creating webview.", th);
            C0710au.m5573i().m11292a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.f4689b.m11661d();
        }
    }
}
