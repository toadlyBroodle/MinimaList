package com.google.android.gms.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class ayj extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a */
    private final int f7576a;

    public ayj(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f7576a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ayj ayjVar = (ayj) obj;
        return this.f7576a == ayjVar.f7576a && get() == ayjVar.get();
    }

    public final int hashCode() {
        return this.f7576a;
    }
}
