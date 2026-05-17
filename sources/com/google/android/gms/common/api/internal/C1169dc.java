package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.dc */
/* JADX INFO: loaded from: classes.dex */
public final class C1169dc<O extends C1074a.a> extends C1078e<O> {

    /* JADX INFO: renamed from: b */
    private final C1074a.f f5762b;

    /* JADX INFO: renamed from: c */
    private final C1162cw f5763c;

    /* JADX INFO: renamed from: d */
    private final C1248bj f5764d;

    /* JADX INFO: renamed from: e */
    private final C1074a.b<? extends afq, afr> f5765e;

    public C1169dc(Context context, C1074a<O> c1074a, Looper looper, C1074a.f fVar, C1162cw c1162cw, C1248bj c1248bj, C1074a.b<? extends afq, afr> bVar) {
        super(context, c1074a, looper);
        this.f5762b = fVar;
        this.f5763c = c1162cw;
        this.f5764d = c1248bj;
        this.f5765e = bVar;
        this.f5469a.m6799a(this);
    }

    @Override // com.google.android.gms.common.api.C1078e
    /* JADX INFO: renamed from: a */
    public final C1074a.f mo6654a(Looper looper, C1100ao<O> c1100ao) {
        this.f5763c.m6956a(c1100ao);
        return this.f5762b;
    }

    @Override // com.google.android.gms.common.api.C1078e
    /* JADX INFO: renamed from: a */
    public final BinderC1129bq mo6656a(Context context, Handler handler) {
        return new BinderC1129bq(context, handler, this.f5764d, this.f5765e);
    }

    /* JADX INFO: renamed from: f */
    public final C1074a.f m6979f() {
        return this.f5762b;
    }
}
