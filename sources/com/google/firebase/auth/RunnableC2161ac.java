package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.p053a.C2151d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.firebase.auth.ac */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2161ac implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2151d f12791a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ FirebaseAuth f12792b;

    RunnableC2161ac(FirebaseAuth firebaseAuth, C2151d c2151d) {
        this.f12792b = firebaseAuth;
        this.f12791a = c2151d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12792b.f12779a.m12931a(this.f12791a);
        Iterator it = this.f12792b.f12780b.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.InterfaceC2156b) it.next()).m12844a(this.f12792b);
        }
    }
}
