package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p018i.C0219m;
import com.google.android.gms.ads.p045b.C0673j;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.bxs;
import com.google.android.gms.internal.bxw;
import com.google.android.gms.internal.byp;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.ccm;
import com.google.android.gms.internal.cdz;
import com.google.android.gms.internal.cec;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cei;
import com.google.android.gms.internal.cem;
import com.google.android.gms.internal.cep;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cnb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.h */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0780h extends bxw {

    /* JADX INFO: renamed from: a */
    private final Context f4664a;

    /* JADX INFO: renamed from: b */
    private final bxs f4665b;

    /* JADX INFO: renamed from: c */
    private final cii f4666c;

    /* JADX INFO: renamed from: d */
    private final cdz f4667d;

    /* JADX INFO: renamed from: e */
    private final cem f4668e;

    /* JADX INFO: renamed from: f */
    private final cec f4669f;

    /* JADX INFO: renamed from: g */
    private final cep f4670g;

    /* JADX INFO: renamed from: h */
    private final bxb f4671h;

    /* JADX INFO: renamed from: i */
    private final C0673j f4672i;

    /* JADX INFO: renamed from: j */
    private final C0219m<String, cei> f4673j;

    /* JADX INFO: renamed from: k */
    private final C0219m<String, cef> f4674k;

    /* JADX INFO: renamed from: l */
    private final ccm f4675l;

    /* JADX INFO: renamed from: n */
    private final byp f4677n;

    /* JADX INFO: renamed from: o */
    private final String f4678o;

    /* JADX INFO: renamed from: p */
    private final C1670jo f4679p;

    /* JADX INFO: renamed from: q */
    private WeakReference<AbstractBinderC0714ay> f4680q;

    /* JADX INFO: renamed from: r */
    private final C0733bq f4681r;

    /* JADX INFO: renamed from: s */
    private final Object f4682s = new Object();

    /* JADX INFO: renamed from: m */
    private final List<String> f4676m = m5706f();

    BinderC0780h(Context context, String str, cii ciiVar, C1670jo c1670jo, bxs bxsVar, cdz cdzVar, cem cemVar, cec cecVar, C0219m<String, cei> c0219m, C0219m<String, cef> c0219m2, ccm ccmVar, byp bypVar, C0733bq c0733bq, cep cepVar, bxb bxbVar, C0673j c0673j) {
        this.f4664a = context;
        this.f4678o = str;
        this.f4666c = ciiVar;
        this.f4679p = c1670jo;
        this.f4665b = bxsVar;
        this.f4669f = cecVar;
        this.f4667d = cdzVar;
        this.f4668e = cemVar;
        this.f4673j = c0219m;
        this.f4674k = c0219m2;
        this.f4675l = ccmVar;
        this.f4677n = bypVar;
        this.f4681r = c0733bq;
        this.f4670g = cepVar;
        this.f4671h = bxbVar;
        this.f4672i = c0673j;
        can.m10549a(this.f4664a);
    }

    /* JADX INFO: renamed from: a */
    private static void m5700a(Runnable runnable) {
        C1596gv.f10711a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m5701b(bwx bwxVar) {
        BinderC0728bl binderC0728bl = new BinderC0728bl(this.f4664a, this.f4681r, this.f4671h, this.f4678o, this.f4666c, this.f4679p);
        this.f4680q = new WeakReference<>(binderC0728bl);
        cep cepVar = this.f4670g;
        C1221aj.m7073b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        binderC0728bl.f4405e.f4538x = cepVar;
        if (this.f4672i != null) {
            if (this.f4672i.m5384b() != null) {
                binderC0728bl.mo5453a(this.f4672i.m5384b());
            }
            binderC0728bl.mo5472b(this.f4672i.m5383a());
        }
        cdz cdzVar = this.f4667d;
        C1221aj.m7073b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        binderC0728bl.f4405e.f4531q = cdzVar;
        cec cecVar = this.f4669f;
        C1221aj.m7073b("setOnContentAdLoadedListener must be called on the main UI thread.");
        binderC0728bl.f4405e.f4532r = cecVar;
        C0219m<String, cei> c0219m = this.f4673j;
        C1221aj.m7073b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        binderC0728bl.f4405e.f4534t = c0219m;
        C0219m<String, cef> c0219m2 = this.f4674k;
        C1221aj.m7073b("setOnCustomClickListener must be called on the main UI thread.");
        binderC0728bl.f4405e.f4533s = c0219m2;
        ccm ccmVar = this.f4675l;
        C1221aj.m7073b("setNativeAdOptions must be called on the main UI thread.");
        binderC0728bl.f4405e.f4535u = ccmVar;
        binderC0728bl.m5639b(m5706f());
        binderC0728bl.mo5452a(this.f4665b);
        binderC0728bl.mo5454a(this.f4677n);
        ArrayList arrayList = new ArrayList();
        if (m5705e()) {
            arrayList.add(1);
        }
        if (this.f4670g != null) {
            arrayList.add(2);
        }
        binderC0728bl.m5640c(arrayList);
        if (m5705e()) {
            bwxVar.f9209c.putBoolean("ina", true);
        }
        if (this.f4670g != null) {
            bwxVar.f9209c.putBoolean("iba", true);
        }
        binderC0728bl.mo5473b(bwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m5702b(bwx bwxVar, int i) {
        BinderC0692ac binderC0692ac = new BinderC0692ac(this.f4664a, this.f4681r, bxb.m10381a(this.f4664a), this.f4678o, this.f4666c, this.f4679p);
        this.f4680q = new WeakReference<>(binderC0692ac);
        cdz cdzVar = this.f4667d;
        C1221aj.m7073b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        binderC0692ac.f4405e.f4531q = cdzVar;
        cec cecVar = this.f4669f;
        C1221aj.m7073b("setOnContentAdLoadedListener must be called on the main UI thread.");
        binderC0692ac.f4405e.f4532r = cecVar;
        C0219m<String, cei> c0219m = this.f4673j;
        C1221aj.m7073b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        binderC0692ac.f4405e.f4534t = c0219m;
        binderC0692ac.mo5452a(this.f4665b);
        C0219m<String, cef> c0219m2 = this.f4674k;
        C1221aj.m7073b("setOnCustomClickListener must be called on the main UI thread.");
        binderC0692ac.f4405e.f4533s = c0219m2;
        binderC0692ac.m5523b(m5706f());
        ccm ccmVar = this.f4675l;
        C1221aj.m7073b("setNativeAdOptions must be called on the main UI thread.");
        binderC0692ac.f4405e.f4535u = ccmVar;
        binderC0692ac.mo5454a(this.f4677n);
        binderC0692ac.m5522b(i);
        binderC0692ac.mo5473b(bwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final boolean m5704d() {
        return ((Boolean) bxm.m10409f().m10546a(can.f9428aA)).booleanValue() && this.f4670g != null;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m5705e() {
        return (this.f4667d == null && this.f4669f == null && (this.f4673j == null || this.f4673j.size() <= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    private final List<String> m5706f() {
        ArrayList arrayList = new ArrayList();
        if (this.f4669f != null) {
            arrayList.add("1");
        }
        if (this.f4667d != null) {
            arrayList.add("2");
        }
        if (this.f4673j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final String mo5707a() {
        synchronized (this.f4682s) {
            if (this.f4680q == null) {
                return null;
            }
            AbstractBinderC0714ay abstractBinderC0714ay = this.f4680q.get();
            return abstractBinderC0714ay != null ? abstractBinderC0714ay.mo5549a() : null;
        }
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5708a(bwx bwxVar) {
        m5700a(new RunnableC0781i(this, bwxVar));
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5709a(bwx bwxVar, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        m5700a(new RunnableC0782j(this, bwxVar, i));
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: b */
    public final String mo5710b() {
        synchronized (this.f4682s) {
            if (this.f4680q == null) {
                return null;
            }
            AbstractBinderC0714ay abstractBinderC0714ay = this.f4680q.get();
            return abstractBinderC0714ay != null ? abstractBinderC0714ay.mo5554f_() : null;
        }
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: c */
    public final boolean mo5711c() {
        synchronized (this.f4682s) {
            if (this.f4680q == null) {
                return false;
            }
            AbstractBinderC0714ay abstractBinderC0714ay = this.f4680q.get();
            return abstractBinderC0714ay != null ? abstractBinderC0714ay.mo5487q() : false;
        }
    }
}
