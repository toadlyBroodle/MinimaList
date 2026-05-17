package com.google.android.gms.internal;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class axx implements axp<Signature> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Signature mo8674a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
