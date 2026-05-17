package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: com.google.firebase.auth.ab */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2160ab implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FirebaseAuth.InterfaceC2155a f12789a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ FirebaseAuth f12790b;

    RunnableC2160ab(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC2155a interfaceC2155a) {
        this.f12790b = firebaseAuth;
        this.f12789a = interfaceC2155a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12789a.mo4978a(this.f12790b);
    }
}
