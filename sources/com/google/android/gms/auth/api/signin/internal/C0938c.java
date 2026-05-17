package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.C0915a;
import com.google.android.gms.auth.api.signin.C0929b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.InterfaceC0928a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0938c implements InterfaceC0928a {
    /* JADX INFO: renamed from: d */
    private static GoogleSignInOptions m6165d(AbstractC1079f abstractC1079f) {
        return ((C0939d) abstractC1079f.mo6666a(C0915a.f4997b)).m6170e();
    }

    @Override // com.google.android.gms.auth.api.signin.InterfaceC0928a
    /* JADX INFO: renamed from: a */
    public final Intent mo6149a(AbstractC1079f abstractC1079f) {
        return C0940e.m6172a(abstractC1079f.mo6673b(), m6165d(abstractC1079f));
    }

    @Override // com.google.android.gms.auth.api.signin.InterfaceC0928a
    /* JADX INFO: renamed from: a */
    public final C0929b mo6150a(Intent intent) {
        return C0940e.m6173a(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.InterfaceC0928a
    /* JADX INFO: renamed from: b */
    public final AbstractC1080g<Status> mo6151b(AbstractC1079f abstractC1079f) {
        return C0940e.m6174a(abstractC1079f, abstractC1079f.mo6673b(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.InterfaceC0928a
    /* JADX INFO: renamed from: c */
    public final AbstractC1080g<Status> mo6152c(AbstractC1079f abstractC1079f) {
        return C0940e.m6176b(abstractC1079f, abstractC1079f.mo6673b(), false);
    }
}
