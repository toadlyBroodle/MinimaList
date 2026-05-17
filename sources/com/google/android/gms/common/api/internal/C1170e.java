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

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.e */
/* JADX INFO: loaded from: classes.dex */
final class C1170e implements InterfaceC0960a<Map<C1150ck<?>, String>> {

    /* JADX INFO: renamed from: a */
    private InterfaceC1128bp f5766a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1112b f5767b;

    C1170e(C1112b c1112b, InterfaceC1128bp interfaceC1128bp) {
        this.f5767b = c1112b;
        this.f5766a = interfaceC1128bp;
    }

    /* JADX INFO: renamed from: a */
    final void m6980a() {
        this.f5766a.mo6164t();
    }

    @Override // com.google.android.gms.p051b.InterfaceC0960a
    /* JADX INFO: renamed from: a */
    public final void mo4877a(AbstractC0964e<Map<C1150ck<?>, String>> abstractC0964e) {
        this.f5767b.f5633f.lock();
        try {
            if (!this.f5767b.f5641n) {
                this.f5766a.mo6164t();
                return;
            }
            if (abstractC0964e.mo6214b()) {
                this.f5767b.f5643p = new C0207a(this.f5767b.f5629b.size());
                Iterator it = this.f5767b.f5629b.values().iterator();
                while (it.hasNext()) {
                    this.f5767b.f5643p.put(((C1169dc) it.next()).m6659b(), C1071a.f5439a);
                }
            } else if (abstractC0964e.mo6216d() instanceof C1076c) {
                C1076c c1076c = (C1076c) abstractC0964e.mo6216d();
                if (this.f5767b.f5639l) {
                    this.f5767b.f5643p = new C0207a(this.f5767b.f5629b.size());
                    for (C1169dc c1169dc : this.f5767b.f5629b.values()) {
                        Object objM6659b = c1169dc.m6659b();
                        C1071a c1071aM6648a = c1076c.m6648a(c1169dc);
                        if (this.f5767b.m6857a((C1169dc<?>) c1169dc, c1071aM6648a)) {
                            this.f5767b.f5643p.put(objM6659b, new C1071a(16));
                        } else {
                            this.f5767b.f5643p.put(objM6659b, c1071aM6648a);
                        }
                    }
                } else {
                    this.f5767b.f5643p = c1076c.m6647a();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", abstractC0964e.mo6216d());
                this.f5767b.f5643p = Collections.emptyMap();
            }
            if (this.f5767b.mo6770d()) {
                this.f5767b.f5642o.putAll(this.f5767b.f5643p);
                if (this.f5767b.m6872k() == null) {
                    this.f5767b.m6868i();
                    this.f5767b.m6870j();
                    this.f5767b.f5636i.signalAll();
                }
            }
            this.f5766a.mo6164t();
        } finally {
            this.f5767b.f5633f.unlock();
        }
    }
}
