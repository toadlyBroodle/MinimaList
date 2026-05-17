package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC1079f;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ac */
/* JADX INFO: loaded from: classes.dex */
final class C1088ac implements AbstractC1079f.b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f5547a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1134bv f5548b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1086aa f5549c;

    C1088ac(C1086aa c1086aa, AtomicReference atomicReference, C1134bv c1134bv) {
        this.f5549c = c1086aa;
        this.f5547a = atomicReference;
        this.f5548b = c1134bv;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        this.f5549c.m6730a((AbstractC1079f) this.f5547a.get(), this.f5548b, true);
    }
}
