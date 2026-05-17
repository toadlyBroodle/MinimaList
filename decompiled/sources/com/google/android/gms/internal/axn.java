package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class axn implements ase {

    /* JADX INFO: renamed from: a */
    private final aya f7547a;

    /* JADX INFO: renamed from: b */
    private final asq f7548b;

    /* JADX INFO: renamed from: c */
    private final int f7549c;

    public axn(aya ayaVar, asq asqVar, int i) {
        this.f7547a = ayaVar;
        this.f7548b = asqVar;
        this.f7549c = i;
    }

    @Override // com.google.android.gms.internal.ase
    /* JADX INFO: renamed from: a */
    public final byte[] mo8266a(byte[] bArr, byte[] bArr2) {
        byte[] bArrMo8637a = this.f7547a.mo8637a(bArr);
        return awu.m8641a(bArrMo8637a, this.f7548b.mo8280a(awu.m8641a(bArr2, bArrMo8637a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(8 * ((long) bArr2.length)).array(), 8))));
    }
}
