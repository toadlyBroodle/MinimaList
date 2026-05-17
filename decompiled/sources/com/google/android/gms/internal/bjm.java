package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class bjm implements Comparator<bjg> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bjl f8269a;

    bjm(bjl bjlVar) {
        this.f8269a = bjlVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(bjg bjgVar, bjg bjgVar2) {
        bjg bjgVar3 = bjgVar;
        bjg bjgVar4 = bjgVar2;
        return this.f8269a.f8268b.compare(new blm(bjgVar3.m9452a(), bjgVar3.m9454c().m9616a()), new blm(bjgVar4.m9452a(), bjgVar4.m9454c().m9616a()));
    }
}
