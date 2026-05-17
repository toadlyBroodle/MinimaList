package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.internal.C1218ag;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ck */
/* JADX INFO: loaded from: classes.dex */
public final class C1150ck<O extends C1074a.a> {

    /* JADX INFO: renamed from: a */
    private final boolean f5710a;

    /* JADX INFO: renamed from: b */
    private final int f5711b;

    /* JADX INFO: renamed from: c */
    private final C1074a<O> f5712c;

    /* JADX INFO: renamed from: d */
    private final O f5713d;

    private C1150ck(C1074a<O> c1074a) {
        this.f5710a = true;
        this.f5712c = c1074a;
        this.f5713d = null;
        this.f5711b = System.identityHashCode(this);
    }

    private C1150ck(C1074a<O> c1074a, O o) {
        this.f5710a = false;
        this.f5712c = c1074a;
        this.f5713d = o;
        this.f5711b = Arrays.hashCode(new Object[]{this.f5712c, this.f5713d});
    }

    /* JADX INFO: renamed from: a */
    public static <O extends C1074a.a> C1150ck<O> m6927a(C1074a<O> c1074a) {
        return new C1150ck<>(c1074a);
    }

    /* JADX INFO: renamed from: a */
    public static <O extends C1074a.a> C1150ck<O> m6928a(C1074a<O> c1074a, O o) {
        return new C1150ck<>(c1074a, o);
    }

    /* JADX INFO: renamed from: a */
    public final String m6929a() {
        return this.f5712c.m6632d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1150ck)) {
            return false;
        }
        C1150ck c1150ck = (C1150ck) obj;
        return !this.f5710a && !c1150ck.f5710a && C1218ag.m7063a(this.f5712c, c1150ck.f5712c) && C1218ag.m7063a(this.f5713d, c1150ck.f5713d);
    }

    public final int hashCode() {
        return this.f5711b;
    }
}
