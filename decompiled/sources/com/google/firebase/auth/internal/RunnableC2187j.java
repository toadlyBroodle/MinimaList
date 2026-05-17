package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.firebase.C2213b;
import com.google.firebase.auth.C2200n;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.j */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2187j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2186i f12837a;

    /* JADX INFO: renamed from: b */
    private final String f12838b;

    RunnableC2187j(C2186i c2186i, String str) {
        this.f12837a = c2186i;
        this.f12838b = C1221aj.m7067a(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C2213b.m12919a(this.f12838b));
        if (firebaseAuth.m12838a() != null) {
            AbstractC0964e<C2200n> abstractC0964eMo12821a = firebaseAuth.mo12821a(true);
            C2186i.f12829c.m12548a("Token refreshing started", new Object[0]);
            abstractC0964eMo12821a.mo6209a(new C2188k(this));
        }
    }
}
