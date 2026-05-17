package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class axw implements axp<MessageDigest> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageDigest mo8674a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
