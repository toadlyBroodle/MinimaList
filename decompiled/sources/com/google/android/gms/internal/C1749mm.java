package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mm */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1749mm implements Iterable<C1747mk> {

    /* JADX INFO: renamed from: a */
    private final List<C1747mk> f11053a = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static boolean m11781a(InterfaceC1739mc interfaceC1739mc) {
        C1747mk c1747mkM11782b = m11782b(interfaceC1739mc);
        if (c1747mkM11782b == null) {
            return false;
        }
        c1747mkM11782b.f11050b.mo11794b();
        return true;
    }

    /* JADX INFO: renamed from: b */
    static C1747mk m11782b(InterfaceC1739mc interfaceC1739mc) {
        for (C1747mk c1747mk : C0710au.m5588x()) {
            if (c1747mk.f11049a == interfaceC1739mc) {
                return c1747mk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m11783a() {
        return this.f11053a.size();
    }

    /* JADX INFO: renamed from: a */
    public final void m11784a(C1747mk c1747mk) {
        this.f11053a.add(c1747mk);
    }

    /* JADX INFO: renamed from: b */
    public final void m11785b(C1747mk c1747mk) {
        this.f11053a.remove(c1747mk);
    }

    @Override // java.lang.Iterable
    public final Iterator<C1747mk> iterator() {
        return this.f11053a.iterator();
    }
}
