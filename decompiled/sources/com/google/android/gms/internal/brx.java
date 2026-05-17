package com.google.android.gms.internal;

import com.google.android.gms.internal.brw;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class brx<M extends brw<M>, T> {

    /* JADX INFO: renamed from: a */
    protected final Class<T> f8770a;

    /* JADX INFO: renamed from: b */
    public final int f8771b;

    /* JADX INFO: renamed from: c */
    protected final boolean f8772c;

    /* JADX INFO: renamed from: d */
    private int f8773d;

    /* JADX INFO: renamed from: a */
    protected final int m10139a(Object obj) {
        int i = this.f8771b >>> 3;
        switch (this.f8773d) {
            case 10:
                return (bru.m10110b(i) << 1) + ((bsc) obj).m10166f();
            case 11:
                return bru.m10112b(i, (bsc) obj);
            default:
                throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.f8773d).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m10140a(Object obj, bru bruVar) {
        try {
            bruVar.m10133c(this.f8771b);
            switch (this.f8773d) {
                case 10:
                    int i = this.f8771b >>> 3;
                    ((bsc) obj).mo7777a(bruVar);
                    bruVar.m10134c(i, 4);
                    return;
                case 11:
                    bruVar.m10131a((bsc) obj);
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.f8773d).toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brx)) {
            return false;
        }
        brx brxVar = (brx) obj;
        return this.f8773d == brxVar.f8773d && this.f8770a == brxVar.f8770a && this.f8771b == brxVar.f8771b && this.f8772c == brxVar.f8772c;
    }

    public final int hashCode() {
        return (this.f8772c ? 1 : 0) + ((((((this.f8773d + 1147) * 31) + this.f8770a.hashCode()) * 31) + this.f8771b) * 31);
    }
}
