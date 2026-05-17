package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.firebase.auth.ad */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2162ad implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FirebaseAuth f12793a;

    RunnableC2162ad(FirebaseAuth firebaseAuth) {
        this.f12793a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f12793a.f12781c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.InterfaceC2155a) it.next()).mo4978a(this.f12793a);
        }
    }
}
