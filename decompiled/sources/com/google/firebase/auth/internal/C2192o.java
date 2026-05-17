package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1153cn;
import com.google.android.gms.internal.bae;
import com.google.firebase.C2213b;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2192o implements C2213b.c {

    /* JADX INFO: renamed from: a */
    private volatile int f12844a;

    /* JADX INFO: renamed from: b */
    private final C2186i f12845b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f12846c;

    private C2192o(Context context, C2186i c2186i) {
        this.f12846c = false;
        this.f12844a = 0;
        this.f12845b = c2186i;
        ComponentCallbacks2C1153cn.m6940a((Application) context.getApplicationContext());
        ComponentCallbacks2C1153cn.m6939a().m6942a(new C2193p(this));
    }

    public C2192o(C2213b c2213b) {
        this(c2213b.m12929a(), new C2186i(c2213b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final boolean m12897b() {
        return this.f12844a > 0 && !this.f12846c;
    }

    /* JADX INFO: renamed from: a */
    public final void m12898a() {
        this.f12845b.m12883c();
    }

    @Override // com.google.firebase.C2213b.c
    /* JADX INFO: renamed from: a */
    public final void mo12822a(int i) {
        if (i > 0 && this.f12844a == 0) {
            this.f12844a = i;
            if (m12897b()) {
                this.f12845b.m12881a();
            }
        } else if (i == 0 && this.f12844a != 0) {
            this.f12845b.m12883c();
        }
        this.f12844a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m12899a(bae baeVar) {
        if (baeVar == null) {
            return;
        }
        long jM8770d = baeVar.m8770d();
        if (jM8770d <= 0) {
            jM8770d = 3600;
        }
        long jM8771e = ((jM8770d * 1000) + baeVar.m8771e()) - 300000;
        C2186i c2186i = this.f12845b;
        c2186i.f12830a = jM8771e;
        c2186i.f12831b = -1L;
        if (m12897b()) {
            this.f12845b.m12881a();
        }
    }
}
