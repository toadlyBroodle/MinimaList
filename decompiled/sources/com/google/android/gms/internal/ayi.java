package com.google.android.gms.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
final class ayi {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<ayj, List<Throwable>> f7574a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b */
    private final ReferenceQueue<Throwable> f7575b = new ReferenceQueue<>();

    ayi() {
    }

    /* JADX INFO: renamed from: a */
    public final List<Throwable> m8691a(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.f7575b.poll();
        while (referencePoll != null) {
            this.f7574a.remove(referencePoll);
            referencePoll = this.f7575b.poll();
        }
        return this.f7574a.get(new ayj(th, null));
    }
}
