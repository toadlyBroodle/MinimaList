package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class atn implements axd {

    /* JADX INFO: renamed from: a */
    private final String f7246a;

    /* JADX INFO: renamed from: b */
    private final int f7247b;

    /* JADX INFO: renamed from: c */
    private auj f7248c;

    /* JADX INFO: renamed from: d */
    private att f7249d;

    /* JADX INFO: renamed from: e */
    private int f7250e;

    atn(avw avwVar) throws GeneralSecurityException {
        this.f7246a = avwVar.m8536a();
        if (this.f7246a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                aul aulVarM8412a = aul.m8412a(avwVar.m8537b());
                this.f7248c = (auj) asu.m8297b(avwVar);
                this.f7247b = aulVarM8412a.m8415b();
                return;
            } catch (bpf e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!this.f7246a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String strValueOf = String.valueOf(this.f7246a);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            atv atvVarM8348a = atv.m8348a(avwVar.m8537b());
            this.f7249d = (att) asu.m8297b(avwVar);
            this.f7250e = atvVarM8348a.m8350a().m8372b();
            this.f7247b = atvVarM8348a.m8351b().m8504b() + this.f7250e;
        } catch (bpf e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
        }
    }

    @Override // com.google.android.gms.internal.axd
    /* JADX INFO: renamed from: a */
    public final int mo8317a() {
        return this.f7247b;
    }

    @Override // com.google.android.gms.internal.axd
    /* JADX INFO: renamed from: a */
    public final ase mo8318a(byte[] bArr) throws GeneralSecurityException {
        if (this.f7246a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (ase) asu.m8298b(this.f7246a, auj.m8405c().mo9750a(this.f7248c).m8411a(bob.m9757a(bArr)).m9912d());
        }
        if (!this.f7246a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f7250e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f7250e, this.f7247b);
        atx atxVarM9912d = atx.m8359e().mo9750a(this.f7249d.m8342b()).m8367a(bob.m9757a(bArrCopyOfRange)).m9912d();
        return (ase) asu.m8298b(this.f7246a, att.m8337e().m8345a(this.f7249d.m8339a()).m8346a(atxVarM9912d).m8347a(avk.m8491e().mo9750a(this.f7249d.m8343c()).m8499a(bob.m9757a(bArrCopyOfRange2)).m9912d()).m9912d());
    }
}
