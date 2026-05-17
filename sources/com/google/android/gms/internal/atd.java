package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class atd implements ase {

    /* JADX INFO: renamed from: a */
    private static final byte[] f7237a = new byte[0];

    /* JADX INFO: renamed from: b */
    private final avw f7238b;

    /* JADX INFO: renamed from: c */
    private final ase f7239c;

    public atd(avw avwVar, ase aseVar) {
        this.f7238b = avwVar;
        this.f7239c = aseVar;
    }

    @Override // com.google.android.gms.internal.ase
    /* JADX INFO: renamed from: a */
    public final byte[] mo8266a(byte[] bArr, byte[] bArr2) {
        byte[] bArrMo9748k = asu.m8297b(this.f7238b).mo9748k();
        byte[] bArrMo8266a = this.f7239c.mo8266a(bArrMo9748k, f7237a);
        byte[] bArrMo8266a2 = ((ase) asu.m8292a(this.f7238b.m8536a(), bArrMo9748k)).mo8266a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo8266a.length + 4 + bArrMo8266a2.length).putInt(bArrMo8266a.length).put(bArrMo8266a).put(bArrMo8266a2).array();
    }
}
