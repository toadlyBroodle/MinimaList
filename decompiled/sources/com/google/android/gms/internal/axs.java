package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class axs implements axp<KeyFactory> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KeyFactory mo8674a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
