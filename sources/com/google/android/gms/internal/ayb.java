package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class ayb implements asq {

    /* JADX INFO: renamed from: a */
    private Mac f7564a;

    /* JADX INFO: renamed from: b */
    private final int f7565b;

    /* JADX INFO: renamed from: c */
    private final String f7566c;

    /* JADX INFO: renamed from: d */
    private final Key f7567d;

    public ayb(String str, Key key, int i) throws InvalidKeyException {
        this.f7566c = str;
        this.f7565b = i;
        this.f7567d = key;
        this.f7564a = axo.f7551b.m8673a(str);
        this.f7564a.init(key);
    }

    @Override // com.google.android.gms.internal.asq
    /* JADX INFO: renamed from: a */
    public final byte[] mo8280a(byte[] bArr) throws GeneralSecurityException {
        Mac macM8673a;
        try {
            macM8673a = (Mac) this.f7564a.clone();
        } catch (CloneNotSupportedException e) {
            macM8673a = axo.f7551b.m8673a(this.f7566c);
            macM8673a.init(this.f7567d);
        }
        macM8673a.update(bArr);
        byte[] bArr2 = new byte[this.f7565b];
        System.arraycopy(macM8673a.doFinal(), 0, bArr2, 0, this.f7565b);
        return bArr2;
    }
}
