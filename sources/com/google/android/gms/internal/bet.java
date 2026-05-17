package com.google.android.gms.internal;

import com.google.firebase.C2213b;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2268f;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class bet {

    /* JADX INFO: renamed from: a */
    protected bez f7963a;

    /* JADX INFO: renamed from: b */
    protected bel f7964b;

    /* JADX INFO: renamed from: c */
    protected bgd f7965c;

    /* JADX INFO: renamed from: d */
    protected String f7966d;

    /* JADX INFO: renamed from: f */
    protected boolean f7968f;

    /* JADX INFO: renamed from: h */
    protected C2213b f7970h;

    /* JADX INFO: renamed from: i */
    private bkm f7971i;

    /* JADX INFO: renamed from: j */
    private String f7972j;

    /* JADX INFO: renamed from: m */
    private bfc f7975m;

    /* JADX INFO: renamed from: e */
    protected bkn f7967e = bkn.INFO;

    /* JADX INFO: renamed from: g */
    protected long f7969g = 10485760;

    /* JADX INFO: renamed from: k */
    private boolean f7973k = false;

    /* JADX INFO: renamed from: l */
    private boolean f7974l = false;

    /* JADX INFO: renamed from: j */
    private final bfc m9113j() {
        if (this.f7975m == null) {
            m9114k();
        }
        return this.f7975m;
    }

    /* JADX INFO: renamed from: k */
    private final synchronized void m9114k() {
        this.f7975m = new bbk(this.f7970h);
    }

    /* JADX INFO: renamed from: l */
    private final ScheduledExecutorService m9115l() {
        bgd bgdVar = this.f7965c;
        if (bgdVar instanceof bmv) {
            return ((bmv) bgdVar).m9682b();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    /* JADX INFO: renamed from: a */
    public final bdd m9116a(bdb bdbVar, bde bdeVar) {
        return m9113j().mo8806a(this, new bcz(this.f7971i, new beu(this.f7964b), m9115l(), this.f7968f, C2268f.m13002c(), this.f7972j, m9113j().mo8811a().getAbsolutePath()), bdbVar, bdeVar);
    }

    /* JADX INFO: renamed from: a */
    public final bkl m9117a(String str) {
        return new bkl(this.f7971i, str);
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m9118a() {
        if (!this.f7973k) {
            this.f7973k = true;
            if (this.f7971i == null) {
                this.f7971i = m9113j().mo8810a(this, this.f7967e, null);
            }
            m9113j();
            if (this.f7972j == null) {
                this.f7972j = "Firebase/5/" + C2268f.m13002c() + "/" + m9113j().mo8813c(this);
            }
            if (this.f7963a == null) {
                this.f7963a = m9113j().mo8808a(this);
            }
            if (this.f7965c == null) {
                this.f7965c = this.f7975m.mo8812b(this);
            }
            if (this.f7966d == null) {
                this.f7966d = "default";
            }
            if (this.f7964b == null) {
                this.f7964b = m9113j().mo8807a(m9115l());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final bie m9119b(String str) {
        return this.f7968f ? this.f7975m.mo8809a(this, str) : new bid();
    }

    /* JADX INFO: renamed from: b */
    public final void m9120b() {
        if (this.f7974l) {
            this.f7965c.mo9233a();
            this.f7974l = false;
        }
    }

    /* JADX INFO: renamed from: c */
    protected final void m9121c() {
        if (this.f7973k) {
            throw new C2227c("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* JADX INFO: renamed from: d */
    public final bkn m9122d() {
        return this.f7967e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9123e() {
        return this.f7968f;
    }

    /* JADX INFO: renamed from: f */
    public final long m9124f() {
        return this.f7969g;
    }

    /* JADX INFO: renamed from: g */
    public final bez m9125g() {
        return this.f7963a;
    }

    /* JADX INFO: renamed from: h */
    public final String m9126h() {
        return this.f7972j;
    }

    /* JADX INFO: renamed from: i */
    public final String m9127i() {
        return this.f7966d;
    }
}
