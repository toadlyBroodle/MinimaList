package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w */
/* JADX INFO: loaded from: classes.dex */
final class C1188w implements AbstractC1079f.b, AbstractC1079f.c {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1179n f5816a;

    private C1188w(C1179n c1179n) {
        this.f5816a = c1179n;
    }

    /* synthetic */ C1188w(C1179n c1179n, RunnableC1180o runnableC1180o) {
        this(c1179n);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        this.f5816a.f5791k.mo7819a(new BinderC1186u(this.f5816a));
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.c
    /* JADX INFO: renamed from: a */
    public final void mo4766a(C1071a c1071a) {
        this.f5816a.f5782b.lock();
        try {
            if (this.f5816a.m6999a(c1071a)) {
                this.f5816a.m7015g();
                this.f5816a.m7010e();
            } else {
                this.f5816a.m7002b(c1071a);
            }
        } finally {
            this.f5816a.f5782b.unlock();
        }
    }
}
