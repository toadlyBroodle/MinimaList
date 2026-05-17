package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.b */
/* JADX INFO: loaded from: classes.dex */
public class C0929b implements InterfaceC1193k {

    /* JADX INFO: renamed from: a */
    private Status f5076a;

    /* JADX INFO: renamed from: b */
    private GoogleSignInAccount f5077b;

    public C0929b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5077b = googleSignInAccount;
        this.f5076a = status;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public Status mo6094a() {
        return this.f5076a;
    }

    /* JADX INFO: renamed from: b */
    public GoogleSignInAccount m6153b() {
        return this.f5077b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m6154c() {
        return this.f5076a.m6626d();
    }
}
