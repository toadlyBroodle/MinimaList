package com.google.android.gms.common.api.internal;

import android.support.v4.p018i.C0208b;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i */
/* JADX INFO: loaded from: classes.dex */
public class C1174i extends AbstractDialogInterfaceOnCancelListenerC1157cr {

    /* JADX INFO: renamed from: e */
    private final C0208b<C1150ck<?>> f5774e;

    /* JADX INFO: renamed from: f */
    private C1098am f5775f;

    /* JADX INFO: renamed from: i */
    private final void m6989i() {
        if (this.f5774e.isEmpty()) {
            return;
        }
        this.f5775f.m6802a(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr
    /* JADX INFO: renamed from: a */
    protected final void mo6934a(C1071a c1071a, int i) {
        this.f5775f.m6804b(c1071a, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: b */
    public final void mo6720b() {
        super.mo6720b();
        m6989i();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: c */
    public final void mo6722c() {
        super.mo6722c();
        m6989i();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo6250d() {
        super.mo6250d();
        this.f5775f.m6805b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr
    /* JADX INFO: renamed from: f */
    protected final void mo6935f() {
        this.f5775f.m6807d();
    }

    /* JADX INFO: renamed from: g */
    final C0208b<C1150ck<?>> m6990g() {
        return this.f5774e;
    }
}
