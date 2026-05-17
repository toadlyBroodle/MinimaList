package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class biz<T> {

    /* JADX INFO: renamed from: a */
    private bkp f8239a;

    /* JADX INFO: renamed from: b */
    private biz<T> f8240b;

    /* JADX INFO: renamed from: c */
    private bjd<T> f8241c;

    public biz() {
        this(null, null, new bjd());
    }

    private biz(bkp bkpVar, biz<T> bizVar, bjd<T> bjdVar) {
        this.f8239a = bkpVar;
        this.f8240b = bizVar;
        this.f8241c = bjdVar;
    }

    /* JADX INFO: renamed from: d */
    private final void m9424d() {
        while (this.f8240b != null) {
            biz<T> bizVar = this.f8240b;
            bkp bkpVar = this.f8239a;
            boolean z = this.f8241c.f8245b == null && this.f8241c.f8244a.isEmpty();
            boolean zContainsKey = bizVar.f8241c.f8244a.containsKey(bkpVar);
            if (z && zContainsKey) {
                bizVar.f8241c.f8244a.remove(bkpVar);
                this = bizVar;
            } else {
                if (z || zContainsKey) {
                    return;
                }
                bizVar.f8241c.f8244a.put(bkpVar, this.f8241c);
                this = bizVar;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final biz<T> m9425a(bfa bfaVar) {
        bkp bkpVarM9158d = bfaVar.m9158d();
        while (bkpVarM9158d != null) {
            biz<T> bizVar = new biz<>(bkpVarM9158d, this, this.f8241c.f8244a.containsKey(bkpVarM9158d) ? this.f8241c.f8244a.get(bkpVarM9158d) : new bjd<>());
            bfaVar = bfaVar.m9159e();
            bkpVarM9158d = bfaVar.m9158d();
            this = bizVar;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final T m9426a() {
        return this.f8241c.f8245b;
    }

    /* JADX INFO: renamed from: a */
    public final void m9427a(bjc<T> bjcVar) {
        Object[] array = this.f8241c.f8244a.entrySet().toArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= array.length) {
                return;
            }
            Map.Entry entry = (Map.Entry) array[i2];
            bjcVar.mo9208a(new biz<>((bkp) entry.getKey(), this, (bjd) entry.getValue()));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9428a(bjc<T> bjcVar, boolean z, boolean z2) {
        if (z && !z2) {
            bjcVar.mo9208a(this);
        }
        m9427a((bjc) new bja(this, bjcVar, z2));
        if (z && z2) {
            bjcVar.mo9208a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9429a(T t) {
        this.f8241c.f8245b = t;
        m9424d();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9430a(bjb<T> bjbVar, boolean z) {
        for (biz<T> bizVar = this.f8240b; bizVar != null; bizVar = bizVar.f8240b) {
            bjbVar.mo9210a(bizVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final bfa m9431b() {
        return this.f8240b != null ? this.f8240b.m9431b().m9153a(this.f8239a) : this.f8239a != null ? new bfa(this.f8239a) : bfa.m9147a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9432c() {
        return !this.f8241c.f8244a.isEmpty();
    }

    public final String toString() {
        String strM9554d = this.f8239a == null ? "<anon>" : this.f8239a.m9554d();
        String strM9435a = this.f8241c.m9435a(String.valueOf("").concat("\t"));
        return new StringBuilder(String.valueOf("").length() + 1 + String.valueOf(strM9554d).length() + String.valueOf(strM9435a).length()).append("").append(strM9554d).append("\n").append(strM9435a).toString();
    }
}
