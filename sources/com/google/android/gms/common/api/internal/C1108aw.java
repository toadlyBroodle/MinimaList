package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.InterfaceC1193k;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C1108aw<O extends C1074a.a> extends C1175j {

    /* JADX INFO: renamed from: a */
    private final C1078e<O> f5619a;

    public C1108aw(C1078e<O> c1078e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5619a = c1078e;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6667a(T t) {
        return (T) this.f5619a.m6657a(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: a */
    public final void mo6670a(C1138bz c1138bz) {
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final Context mo6673b() {
        return this.f5619a.m6663e();
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6674b(T t) {
        return (T) this.f5619a.m6660b(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: b */
    public final void mo6676b(C1138bz c1138bz) {
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f
    /* JADX INFO: renamed from: c */
    public final Looper mo6677c() {
        return this.f5619a.m6662d();
    }
}
