package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bcm<A, B, C> {

    /* JADX INFO: renamed from: a */
    private final List<A> f7788a;

    /* JADX INFO: renamed from: b */
    private final Map<B, C> f7789b;

    /* JADX INFO: renamed from: c */
    private final bbz<A, B> f7790c;

    /* JADX INFO: renamed from: d */
    private bcj<A, C> f7791d;

    /* JADX INFO: renamed from: e */
    private bcj<A, C> f7792e;

    private bcm(List<A> list, Map<B, C> map, bbz<A, B> bbzVar) {
        this.f7788a = list;
        this.f7789b = map;
        this.f7790c = bbzVar;
    }

    /* JADX INFO: renamed from: a */
    private final bcf<A, C> m8919a(int i, int i2) {
        if (i2 == 0) {
            return bce.m8896a();
        }
        if (i2 == 1) {
            A a = this.f7788a.get(i);
            return new bcd(a, m8921a(a), null, null);
        }
        int i3 = i2 / 2;
        int i4 = i + i3;
        bcf<A, C> bcfVarM8919a = m8919a(i, i3);
        bcf<A, C> bcfVarM8919a2 = m8919a(i4 + 1, i3);
        A a2 = this.f7788a.get(i4);
        return new bcd(a2, m8921a(a2), bcfVarM8919a, bcfVarM8919a2);
    }

    /* JADX INFO: renamed from: a */
    public static <A, B, C> bck<A, C> m8920a(List<A> list, Map<B, C> map, bbz<A, B> bbzVar, Comparator<A> comparator) {
        bcm bcmVar = new bcm(list, map, bbzVar);
        Collections.sort(list, comparator);
        int size = list.size();
        for (bcp bcpVar : new bcn(list.size())) {
            size -= bcpVar.f7798b;
            if (bcpVar.f7797a) {
                bcmVar.m8922a(bcg.f7780b, bcpVar.f7798b, size);
            } else {
                bcmVar.m8922a(bcg.f7780b, bcpVar.f7798b, size);
                size -= bcpVar.f7798b;
                bcmVar.m8922a(bcg.f7779a, bcpVar.f7798b, size);
            }
        }
        return new bck<>(bcmVar.f7791d == null ? bce.m8896a() : bcmVar.f7791d, comparator);
    }

    /* JADX INFO: renamed from: a */
    private final C m8921a(A a) {
        return this.f7789b.get(this.f7790c.mo8883a(a));
    }

    /* JADX INFO: renamed from: a */
    private final void m8922a(int i, int i2, int i3) {
        bcf<A, C> bcfVarM8919a = m8919a(i3 + 1, i2 - 1);
        A a = this.f7788a.get(i3);
        bcj<A, C> bciVar = i == bcg.f7779a ? new bci<>(a, m8921a(a), null, bcfVarM8919a) : new bcd<>(a, m8921a(a), null, bcfVarM8919a);
        if (this.f7791d == null) {
            this.f7791d = bciVar;
            this.f7792e = bciVar;
        } else {
            this.f7792e.mo8893a(bciVar);
            this.f7792e = bciVar;
        }
    }
}
