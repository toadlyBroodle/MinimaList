package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bqf<T> implements bql<T> {

    /* JADX INFO: renamed from: a */
    private final bqa f8647a;

    /* JADX INFO: renamed from: b */
    private final brb<?, ?> f8648b;

    /* JADX INFO: renamed from: c */
    private final boolean f8649c;

    /* JADX INFO: renamed from: d */
    private final bos<?> f8650d;

    private bqf(Class<T> cls, brb<?, ?> brbVar, bos<?> bosVar, bqa bqaVar) {
        this.f8648b = brbVar;
        this.f8649c = bosVar.mo9877a((Class<?>) cls);
        this.f8650d = bosVar;
        this.f8647a = bqaVar;
    }

    /* JADX INFO: renamed from: a */
    static <T> bqf<T> m9972a(Class<T> cls, brb<?, ?> brbVar, bos<?> bosVar, bqa bqaVar) {
        return new bqf<>(cls, brbVar, bosVar, bqaVar);
    }

    @Override // com.google.android.gms.internal.bql
    /* JADX INFO: renamed from: a */
    public final int mo9970a(T t) {
        brb<?, ?> brbVar = this.f8648b;
        int iMo10022b = brbVar.mo10022b(brbVar.mo10020a(t)) + 0;
        return this.f8649c ? iMo10022b + this.f8650d.mo9876a(t).m9889c() : iMo10022b;
    }

    @Override // com.google.android.gms.internal.bql
    /* JADX INFO: renamed from: a */
    public final void mo9971a(T t, brs brsVar) {
        Iterator itM9888b = this.f8650d.mo9876a(t).m9888b();
        while (itM9888b.hasNext()) {
            Map.Entry entry = (Map.Entry) itM9888b.next();
            box boxVar = (box) entry.getKey();
            if (boxVar.m9892c() != brr.MESSAGE || boxVar.m9893d() || boxVar.m9894e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof bpj) {
                brsVar.mo9870a(boxVar.m9890a(), ((bpj) entry).m9945a().m9949c());
            } else {
                brsVar.mo9870a(boxVar.m9890a(), entry.getValue());
            }
        }
        brb<?, ?> brbVar = this.f8648b;
        brbVar.mo10021a(brbVar.mo10020a(t), brsVar);
    }
}
