package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbq;
import com.google.android.gms.internal.cbs;
import com.google.android.gms.internal.ccb;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.af */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0695af implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ccb f4428a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f4429b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ List f4430c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ BinderC0692ac f4431d;

    RunnableC0695af(BinderC0692ac binderC0692ac, ccb ccbVar, int i, List list) {
        this.f4431d = binderC0692ac;
        this.f4428a = ccbVar;
        this.f4429b = i;
        this.f4430c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if ((this.f4428a instanceof cbs) && this.f4431d.f4405e.f4532r != null) {
                this.f4431d.f4403c = this.f4429b != this.f4430c.size() + (-1);
                this.f4431d.f4405e.f4532r.mo10749a((cbs) this.f4428a);
            } else if (!(this.f4428a instanceof cbq) || this.f4431d.f4405e.f4531q == null) {
                this.f4431d.mo5448a(3, this.f4429b != this.f4430c.size() + (-1));
            } else {
                this.f4431d.f4403c = this.f4429b != this.f4430c.size() + (-1);
                this.f4431d.f4405e.f4531q.mo10746a((cbq) this.f4428a);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
