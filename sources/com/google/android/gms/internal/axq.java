package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class axq implements axp<Cipher> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Cipher mo8674a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
