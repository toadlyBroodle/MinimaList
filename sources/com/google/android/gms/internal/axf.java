package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes.dex */
public final class axf implements ask {

    /* JADX INFO: renamed from: a */
    private static final byte[] f7528a = new byte[0];

    /* JADX INFO: renamed from: b */
    private final axh f7529b;

    /* JADX INFO: renamed from: c */
    private final String f7530c;

    /* JADX INFO: renamed from: d */
    private final byte[] f7531d;

    /* JADX INFO: renamed from: e */
    private final axm f7532e;

    /* JADX INFO: renamed from: f */
    private final axd f7533f;

    public axf(ECPublicKey eCPublicKey, byte[] bArr, String str, axm axmVar, axd axdVar) throws GeneralSecurityException {
        axj.m8670a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f7529b = new axh(eCPublicKey);
        this.f7531d = bArr;
        this.f7530c = str;
        this.f7532e = axmVar;
        this.f7533f = axdVar;
    }

    @Override // com.google.android.gms.internal.ask
    /* JADX INFO: renamed from: a */
    public final byte[] mo8269a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        axi axiVarM8664a = this.f7529b.m8664a(this.f7530c, this.f7531d, bArr2, this.f7533f.mo8317a(), this.f7532e);
        byte[] bArrMo8266a = this.f7533f.mo8318a(axiVarM8664a.m8666b()).mo8266a(bArr, f7528a);
        byte[] bArrM8665a = axiVarM8664a.m8665a();
        return ByteBuffer.allocate(bArrM8665a.length + bArrMo8266a.length).put(bArrM8665a).put(bArrMo8266a).array();
    }
}
