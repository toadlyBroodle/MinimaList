package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class axv implements axp<Mac> {
    @Override // com.google.android.gms.internal.axp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Mac mo8674a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
