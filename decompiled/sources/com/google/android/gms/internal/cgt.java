package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.BinderC0822l;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: loaded from: classes.dex */
final class cgt {

    /* JADX INFO: renamed from: a */
    BinderC0822l f9960a;

    /* JADX INFO: renamed from: b */
    bwx f9961b;

    /* JADX INFO: renamed from: c */
    cfn f9962c;

    /* JADX INFO: renamed from: d */
    long f9963d;

    /* JADX INFO: renamed from: e */
    boolean f9964e;

    /* JADX INFO: renamed from: f */
    boolean f9965f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ cgs f9966g;

    cgt(cgs cgsVar, cfm cfmVar) {
        this.f9966g = cgsVar;
        this.f9960a = cfmVar.m10793b(cgsVar.f9957c);
        this.f9962c = new cfn();
        cfn cfnVar = this.f9962c;
        BinderC0822l binderC0822l = this.f9960a;
        binderC0822l.mo5452a((bxs) new cfo(cfnVar));
        binderC0822l.mo5453a((byi) new cfw(cfnVar));
        binderC0822l.mo5458a((cbh) new cfy(cfnVar));
        binderC0822l.mo5451a((bxp) new cga(cfnVar));
        binderC0822l.mo5461a((InterfaceC1487cu) new cgc(cfnVar));
    }

    cgt(cgs cgsVar, cfm cfmVar, bwx bwxVar) {
        this(cgsVar, cfmVar);
        this.f9961b = bwxVar;
    }

    /* JADX INFO: renamed from: a */
    final boolean m10833a() {
        if (this.f9964e) {
            return false;
        }
        this.f9965f = this.f9960a.mo5473b(cgq.m10810b(this.f9961b != null ? this.f9961b : this.f9966g.f9956b));
        this.f9964e = true;
        this.f9963d = C0710au.m5575k().mo7252a();
        return true;
    }
}
