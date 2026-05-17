package com.google.android.gms.internal;

import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes.dex */
public final class axe implements asj {

    /* JADX INFO: renamed from: a */
    private static final byte[] f7521a = new byte[0];

    /* JADX INFO: renamed from: b */
    private final ECPrivateKey f7522b;

    /* JADX INFO: renamed from: c */
    private final axg f7523c;

    /* JADX INFO: renamed from: d */
    private final String f7524d;

    /* JADX INFO: renamed from: e */
    private final byte[] f7525e;

    /* JADX INFO: renamed from: f */
    private final axm f7526f;

    /* JADX INFO: renamed from: g */
    private final axd f7527g;

    public axe(ECPrivateKey eCPrivateKey, byte[] bArr, String str, axm axmVar, axd axdVar) {
        this.f7522b = eCPrivateKey;
        this.f7523c = new axg(eCPrivateKey);
        this.f7525e = bArr;
        this.f7524d = str;
        this.f7526f = axmVar;
        this.f7527g = axdVar;
    }
}
