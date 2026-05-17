package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class blf implements Iterable<blm> {

    /* JADX INFO: renamed from: a */
    private static final bcb<blm> f8368a = new bcb<>(Collections.emptyList(), null);

    /* JADX INFO: renamed from: b */
    private final bln f8369b;

    /* JADX INFO: renamed from: c */
    private bcb<blm> f8370c;

    /* JADX INFO: renamed from: d */
    private final ble f8371d;

    private blf(bln blnVar, ble bleVar) {
        this.f8371d = bleVar;
        this.f8369b = blnVar;
        this.f8370c = null;
    }

    private blf(bln blnVar, ble bleVar, bcb<blm> bcbVar) {
        this.f8371d = bleVar;
        this.f8369b = blnVar;
        this.f8370c = bcbVar;
    }

    /* JADX INFO: renamed from: a */
    public static blf m9611a(bln blnVar) {
        return new blf(blnVar, bls.m9629c());
    }

    /* JADX INFO: renamed from: a */
    public static blf m9612a(bln blnVar, ble bleVar) {
        return new blf(blnVar, bleVar);
    }

    /* JADX INFO: renamed from: e */
    private final void m9613e() {
        if (this.f8370c == null) {
            if (!this.f8371d.equals(blg.m9621c())) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (blm blmVar : this.f8369b) {
                    z = z || this.f8371d.mo9609a(blmVar.m9627d());
                    arrayList.add(new blm(blmVar.m9626c(), blmVar.m9627d()));
                }
                if (z) {
                    this.f8370c = new bcb<>(arrayList, this.f8371d);
                    return;
                }
            }
            this.f8370c = f8368a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final bkp m9614a(bkp bkpVar, bln blnVar, ble bleVar) {
        if (!this.f8371d.equals(blg.m9621c()) && !this.f8371d.equals(bleVar)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        m9613e();
        if (this.f8370c == f8368a) {
            return this.f8369b.mo9567b(bkpVar);
        }
        blm blmVarM8889c = this.f8370c.m8889c(new blm(bkpVar, blnVar));
        if (blmVarM8889c != null) {
            return blmVarM8889c.m9626c();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final blf m9615a(bkp bkpVar, bln blnVar) {
        bln blnVarMo9562a = this.f8369b.mo9562a(bkpVar, blnVar);
        if (this.f8370c == f8368a && !this.f8371d.mo9609a(blnVar)) {
            return new blf(blnVarMo9562a, this.f8371d, f8368a);
        }
        if (this.f8370c == null || this.f8370c == f8368a) {
            return new blf(blnVarMo9562a, this.f8371d, null);
        }
        bcb<blm> bcbVarM8885a = this.f8370c.m8885a(new blm(bkpVar, this.f8369b.mo9570c(bkpVar)));
        if (!blnVar.mo9568b()) {
            bcbVarM8885a = bcbVarM8885a.m8887b(new blm(bkpVar, blnVar));
        }
        return new blf(blnVarMo9562a, this.f8371d, bcbVarM8885a);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9616a() {
        return this.f8369b;
    }

    /* JADX INFO: renamed from: b */
    public final blf m9617b(bln blnVar) {
        return new blf(this.f8369b.mo9544a(blnVar), this.f8371d, this.f8370c);
    }

    /* JADX INFO: renamed from: b */
    public final Iterator<blm> m9618b() {
        m9613e();
        return this.f8370c == f8368a ? this.f8369b.mo9576i() : this.f8370c.m8890c();
    }

    /* JADX INFO: renamed from: c */
    public final blm m9619c() {
        if (!(this.f8369b instanceof bkr)) {
            return null;
        }
        m9613e();
        if (this.f8370c != f8368a) {
            return this.f8370c.m8886a();
        }
        bkp bkpVarM9574g = ((bkr) this.f8369b).m9574g();
        return new blm(bkpVarM9574g, this.f8369b.mo9570c(bkpVarM9574g));
    }

    /* JADX INFO: renamed from: d */
    public final blm m9620d() {
        if (!(this.f8369b instanceof bkr)) {
            return null;
        }
        m9613e();
        if (this.f8370c != f8368a) {
            return this.f8370c.m8888b();
        }
        bkp bkpVarM9575h = ((bkr) this.f8369b).m9575h();
        return new blm(bkpVarM9575h, this.f8369b.mo9570c(bkpVarM9575h));
    }

    @Override // java.lang.Iterable
    public final Iterator<blm> iterator() {
        m9613e();
        return this.f8370c == f8368a ? this.f8369b.iterator() : this.f8370c.iterator();
    }
}
