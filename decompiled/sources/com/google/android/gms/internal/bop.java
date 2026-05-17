package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class bop implements brs {

    /* JADX INFO: renamed from: a */
    private final bon f8543a;

    private bop(bon bonVar) {
        this.f8543a = (bon) bpb.m9932a(bonVar, "output");
        this.f8543a.f8538a = this;
    }

    /* JADX INFO: renamed from: a */
    public static bop m9868a(bon bonVar) {
        return bonVar.f8538a != null ? bonVar.f8538a : new bop(bonVar);
    }

    @Override // com.google.android.gms.internal.brs
    /* JADX INFO: renamed from: a */
    public final int mo9869a() {
        return boz.C1447g.f8581k;
    }

    @Override // com.google.android.gms.internal.brs
    /* JADX INFO: renamed from: a */
    public final void mo9870a(int i, Object obj) {
        try {
            if (obj instanceof bob) {
                this.f8543a.mo9861b(i, (bob) obj);
            } else {
                this.f8543a.mo9862b(i, (bqa) obj);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
