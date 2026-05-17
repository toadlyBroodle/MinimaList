package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvq {

    /* JADX INFO: renamed from: a */
    private final Runnable f9133a = new bvr(this);

    /* JADX INFO: renamed from: b */
    private final Object f9134b = new Object();

    /* JADX INFO: renamed from: c */
    private bvx f9135c;

    /* JADX INFO: renamed from: d */
    private Context f9136d;

    /* JADX INFO: renamed from: e */
    private bwb f9137e;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ bvx m10333a(bvq bvqVar, bvx bvxVar) {
        bvqVar.f9135c = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m10336b() {
        synchronized (this.f9134b) {
            if (this.f9136d == null || this.f9135c != null) {
                return;
            }
            this.f9135c = new bvx(this.f9136d, C0710au.m5583s().m11535a(), new bvt(this), new bvu(this));
            this.f9135c.m7126r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m10339c() {
        synchronized (this.f9134b) {
            if (this.f9135c == null) {
                return;
            }
            if (this.f9135c.m7118g() || this.f9135c.m7119h()) {
                this.f9135c.mo6640f();
            }
            this.f9135c = null;
            this.f9137e = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: renamed from: a */
    public final bvv m10341a(bvy bvyVar) {
        bvv bvvVar;
        synchronized (this.f9134b) {
            if (this.f9137e == null) {
                bvvVar = new bvv();
            } else {
                try {
                    bvvVar = this.f9137e.mo10351a(bvyVar);
                } catch (RemoteException e) {
                    C1560fm.m11611b("Unable to call into cache service.", e);
                    bvvVar = new bvv();
                }
            }
        }
        return bvvVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10342a() {
        if (((Boolean) bxm.m10409f().m10546a(can.f9575cp)).booleanValue()) {
            synchronized (this.f9134b) {
                m10336b();
                C0710au.m5569e();
                C1596gv.f10711a.removeCallbacks(this.f9133a);
                C0710au.m5569e();
                C1596gv.f10711a.postDelayed(this.f9133a, ((Long) bxm.m10409f().m10546a(can.f9576cq)).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10343a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f9134b) {
            if (this.f9136d != null) {
                return;
            }
            this.f9136d = context.getApplicationContext();
            if (((Boolean) bxm.m10409f().m10546a(can.f9574co)).booleanValue()) {
                m10336b();
            } else {
                if (((Boolean) bxm.m10409f().m10546a(can.f9573cn)).booleanValue()) {
                    C0710au.m5572h().m10288a(new bvs(this));
                }
            }
        }
    }
}
