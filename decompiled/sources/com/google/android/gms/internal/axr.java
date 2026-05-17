package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class axr implements axp<KeyAgreement> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KeyAgreement mo8674a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
