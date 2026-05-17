package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgw implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f8131a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f8132b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f8133c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bmt f8134d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bgo f8135e;

    bgw(bgo bgoVar, boolean z, long j, boolean z2, bmt bmtVar) {
        this.f8135e = bgoVar;
        this.f8131a = z;
        this.f8132b = j;
        this.f8133c = z2;
        this.f8134d = bmtVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        bit bitVarM9410a;
        if (this.f8131a) {
            this.f8135e.f8099g.mo9364a(this.f8132b);
        }
        bhj bhjVarM9322a = this.f8135e.f8094b.m9322a(this.f8132b);
        boolean zM9332b = this.f8135e.f8094b.m9332b(this.f8132b);
        if (bhjVarM9322a.m9313f() && !this.f8133c) {
            Map<String, Object> mapM9237a = bge.m9237a(this.f8134d);
            if (bhjVarM9322a.m9312e()) {
                this.f8135e.f8099g.mo9367a(bhjVarM9322a.m9309b(), bge.m9236a(bhjVarM9322a.m9310c(), mapM9237a));
            } else {
                this.f8135e.f8099g.mo9365a(bhjVarM9322a.m9309b(), bge.m9235a(bhjVarM9322a.m9311d(), mapM9237a));
            }
        }
        if (!zM9332b) {
            return Collections.emptyList();
        }
        bit bitVarM9405a = bit.m9405a();
        if (!bhjVarM9322a.m9312e()) {
            Iterator<Map.Entry<bfa, bln>> it = bhjVarM9322a.m9311d().iterator();
            while (true) {
                bitVarM9410a = bitVarM9405a;
                if (!it.hasNext()) {
                    break;
                }
                bitVarM9405a = bitVarM9410a.m9410a(it.next().getKey(), true);
            }
        } else {
            bitVarM9410a = bitVarM9405a.m9410a(bfa.m9147a(), true);
        }
        return this.f8135e.m9265a(new bhr(bhjVarM9322a.m9309b(), bitVarM9410a, this.f8133c));
    }
}
