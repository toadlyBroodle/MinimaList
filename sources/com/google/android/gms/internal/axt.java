package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class axt implements axp<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KeyPairGenerator mo8674a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
