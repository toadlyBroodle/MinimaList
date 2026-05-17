package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bib implements bie {

    /* JADX INFO: renamed from: a */
    private final bif f8202a;

    /* JADX INFO: renamed from: b */
    private final bim f8203b;

    /* JADX INFO: renamed from: c */
    private final bkl f8204c;

    /* JADX INFO: renamed from: d */
    private final bhz f8205d;

    /* JADX INFO: renamed from: e */
    private long f8206e;

    public bib(bet betVar, bif bifVar, bhz bhzVar) {
        this(betVar, bifVar, bhzVar, new bmu());
    }

    private bib(bet betVar, bif bifVar, bhz bhzVar, bmt bmtVar) {
        this.f8206e = 0L;
        this.f8202a = bifVar;
        this.f8204c = betVar.m9117a("Persistence");
        this.f8203b = new bim(this.f8202a, this.f8204c, bmtVar);
        this.f8205d = bhzVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m9360b() {
        this.f8206e++;
        if (this.f8205d.mo9357a(this.f8206e)) {
            if (this.f8204c.m9541a()) {
                this.f8204c.m9540a("Reached prune check threshold.", null, new Object[0]);
            }
            this.f8206e = 0L;
            boolean z = true;
            long jMo8847b = this.f8202a.mo8847b();
            if (this.f8204c.m9541a()) {
                this.f8204c.m9540a(new StringBuilder(32).append("Cache size: ").append(jMo8847b).toString(), null, new Object[0]);
            }
            while (z && this.f8205d.mo9358a(jMo8847b, this.f8203b.m9394a())) {
                bih bihVarM9395a = this.f8203b.m9395a(this.f8205d);
                if (bihVarM9395a.m9379a()) {
                    this.f8202a.mo8843a(bfa.m9147a(), bihVarM9395a);
                } else {
                    z = false;
                }
                jMo8847b = this.f8202a.mo8847b();
                if (this.f8204c.m9541a()) {
                    this.f8204c.m9540a(new StringBuilder(44).append("Cache size after prune: ").append(jMo8847b).toString(), null, new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final bje mo9361a(bjs bjsVar) {
        Set<bkp> setM9398b;
        boolean z;
        if (this.f8203b.m9404e(bjsVar)) {
            bil bilVarM9396a = this.f8203b.m9396a(bjsVar);
            if (bjsVar.m9486e() || bilVarM9396a == null || !bilVarM9396a.f8220d) {
                setM9398b = null;
                z = true;
            } else {
                setM9398b = this.f8202a.mo8852d(bilVarM9396a.f8217a);
                z = true;
            }
        } else {
            setM9398b = this.f8203b.m9398b(bjsVar.m9482a());
            z = false;
        }
        bln blnVarMo8835a = this.f8202a.mo8835a(bjsVar.m9482a());
        if (setM9398b == null) {
            return new bje(blf.m9612a(blnVarMo8835a, bjsVar.m9484c()), true, false);
        }
        bln blnVarM9605j = bld.m9605j();
        Iterator<bkp> it = setM9398b.iterator();
        while (true) {
            bln blnVar = blnVarM9605j;
            if (!it.hasNext()) {
                return new bje(blf.m9612a(blnVar, bjsVar.m9484c()), z, true);
            }
            bkp next = it.next();
            blnVarM9605j = blnVar.mo9562a(next, blnVarMo8835a.mo9570c(next));
        }
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final <T> T mo9362a(Callable<T> callable) {
        this.f8202a.mo8853d();
        try {
            try {
                T tCall = callable.call();
                this.f8202a.mo8855f();
                return tCall;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } finally {
            this.f8202a.mo8854e();
        }
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final List<bhj> mo9363a() {
        return this.f8202a.mo8836a();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9364a(long j) {
        this.f8202a.mo8838a(j);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9365a(bfa bfaVar, beo beoVar) {
        for (Map.Entry<bfa, bln> entry : beoVar) {
            mo9367a(bfaVar.m9152a(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9366a(bfa bfaVar, beo beoVar, long j) {
        this.f8202a.mo8842a(bfaVar, beoVar, j);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9367a(bfa bfaVar, bln blnVar) {
        if (this.f8203b.m9403d(bfaVar)) {
            return;
        }
        this.f8202a.mo8844a(bfaVar, blnVar);
        this.f8203b.m9400c(bfaVar);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9368a(bfa bfaVar, bln blnVar, long j) {
        this.f8202a.mo8845a(bfaVar, blnVar, j);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9369a(bjs bjsVar, bln blnVar) {
        if (bjsVar.m9486e()) {
            this.f8202a.mo8844a(bjsVar.m9482a(), blnVar);
        } else {
            this.f8202a.mo8849b(bjsVar.m9482a(), blnVar);
        }
        mo9375d(bjsVar);
        m9360b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9370a(bjs bjsVar, Set<bkp> set) {
        this.f8202a.mo8839a(this.f8203b.m9396a(bjsVar).f8217a, set);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9371a(bjs bjsVar, Set<bkp> set, Set<bkp> set2) {
        this.f8202a.mo8840a(this.f8203b.m9396a(bjsVar).f8217a, set, set2);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: b */
    public final void mo9372b(bfa bfaVar, beo beoVar) {
        this.f8202a.mo8841a(bfaVar, beoVar);
        m9360b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: b */
    public final void mo9373b(bjs bjsVar) {
        this.f8203b.m9399b(bjsVar);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: c */
    public final void mo9374c(bjs bjsVar) {
        this.f8203b.m9401c(bjsVar);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: d */
    public final void mo9375d(bjs bjsVar) {
        if (bjsVar.m9486e()) {
            this.f8203b.m9397a(bjsVar.m9482a());
        } else {
            this.f8203b.m9402d(bjsVar);
        }
    }
}
