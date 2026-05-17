package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.p027d.C0375f;
import android.support.v7.p027d.C0376g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.tq */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1942tq extends AbstractBinderC1938tm {

    /* JADX INFO: renamed from: a */
    private final C0376g f11611a;

    /* JADX INFO: renamed from: b */
    private final Map<C0375f, Set<C0376g.a>> f11612b = new HashMap();

    public BinderC1942tq(C0376g c0376g) {
        this.f11611a = c0376g;
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: a */
    public final void mo12324a() {
        this.f11611a.m2900a(this.f11611a.m2902b());
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: a */
    public final void mo12325a(Bundle bundle) {
        Iterator<C0376g.a> it = this.f11612b.get(C0375f.m2880a(bundle)).iterator();
        while (it.hasNext()) {
            this.f11611a.m2899a(it.next());
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: a */
    public final void mo12326a(Bundle bundle, int i) {
        C0375f c0375fM2880a = C0375f.m2880a(bundle);
        Iterator<C0376g.a> it = this.f11612b.get(c0375fM2880a).iterator();
        while (it.hasNext()) {
            this.f11611a.m2898a(c0375fM2880a, it.next(), i);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: a */
    public final void mo12327a(Bundle bundle, InterfaceC1939tn interfaceC1939tn) {
        C0375f c0375fM2880a = C0375f.m2880a(bundle);
        if (!this.f11612b.containsKey(c0375fM2880a)) {
            this.f11612b.put(c0375fM2880a, new HashSet());
        }
        this.f11612b.get(c0375fM2880a).add(new C1941tp(interfaceC1939tn));
    }

    /* JADX INFO: renamed from: a */
    public final void m12339a(MediaSessionCompat mediaSessionCompat) {
        this.f11611a.m2897a(mediaSessionCompat);
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: a */
    public final void mo12328a(String str) {
        for (C0376g.g gVar : this.f11611a.m2896a()) {
            if (gVar.m2984c().equals(str)) {
                this.f11611a.m2900a(gVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: b */
    public final Bundle mo12329b(String str) {
        for (C0376g.g gVar : this.f11611a.m2896a()) {
            if (gVar.m2984c().equals(str)) {
                return gVar.m2995n();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: b */
    public final boolean mo12330b() {
        return this.f11611a.m2903c().m2984c().equals(this.f11611a.m2902b().m2984c());
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: b */
    public final boolean mo12331b(Bundle bundle, int i) {
        return this.f11611a.m2901a(C0375f.m2880a(bundle), i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1936tk
    /* JADX INFO: renamed from: c */
    public final String mo12332c() {
        return this.f11611a.m2903c().m2984c();
    }
}
