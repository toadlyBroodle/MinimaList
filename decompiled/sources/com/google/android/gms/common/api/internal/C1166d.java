package com.google.android.gms.common.api.internal;

import android.support.v4.p018i.C0207a;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1076c;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.InterfaceC0960a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d */
/* JADX INFO: loaded from: classes.dex */
final class C1166d implements InterfaceC0960a<Map<C1150ck<?>, String>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1112b f5759a;

    private C1166d(C1112b c1112b) {
        this.f5759a = c1112b;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0960a
    /* JADX INFO: renamed from: a */
    public final void mo4877a(AbstractC0964e<Map<C1150ck<?>, String>> abstractC0964e) {
        this.f5759a.f5633f.lock();
        try {
            if (this.f5759a.f5641n) {
                if (abstractC0964e.mo6214b()) {
                    this.f5759a.f5642o = new C0207a(this.f5759a.f5628a.size());
                    Iterator it = this.f5759a.f5628a.values().iterator();
                    while (it.hasNext()) {
                        this.f5759a.f5642o.put(((C1169dc) it.next()).m6659b(), C1071a.f5439a);
                    }
                } else if (abstractC0964e.mo6216d() instanceof C1076c) {
                    C1076c c1076c = (C1076c) abstractC0964e.mo6216d();
                    if (this.f5759a.f5639l) {
                        this.f5759a.f5642o = new C0207a(this.f5759a.f5628a.size());
                        for (C1169dc c1169dc : this.f5759a.f5628a.values()) {
                            Object objM6659b = c1169dc.m6659b();
                            C1071a c1071aM6648a = c1076c.m6648a(c1169dc);
                            if (this.f5759a.m6857a((C1169dc<?>) c1169dc, c1071aM6648a)) {
                                this.f5759a.f5642o.put(objM6659b, new C1071a(16));
                            } else {
                                this.f5759a.f5642o.put(objM6659b, c1071aM6648a);
                            }
                        }
                    } else {
                        this.f5759a.f5642o = c1076c.m6647a();
                    }
                    this.f5759a.f5645r = this.f5759a.m6872k();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", abstractC0964e.mo6216d());
                    this.f5759a.f5642o = Collections.emptyMap();
                    this.f5759a.f5645r = new C1071a(8);
                }
                if (this.f5759a.f5643p != null) {
                    this.f5759a.f5642o.putAll(this.f5759a.f5643p);
                    this.f5759a.f5645r = this.f5759a.m6872k();
                }
                if (this.f5759a.f5645r == null) {
                    this.f5759a.m6868i();
                    this.f5759a.m6870j();
                } else {
                    C1112b.m6856a(this.f5759a, false);
                    this.f5759a.f5632e.mo6742a(this.f5759a.f5645r);
                }
                this.f5759a.f5636i.signalAll();
            }
        } finally {
            this.f5759a.f5633f.unlock();
        }
    }
}
