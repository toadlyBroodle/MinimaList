package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.db */
/* JADX INFO: loaded from: classes.dex */
final class C1168db implements InterfaceC1115bc {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1164cy f5761a;

    private C1168db(C1164cy c1164cy) {
        this.f5761a = c1164cy;
    }

    /* synthetic */ C1168db(C1164cy c1164cy, RunnableC1165cz runnableC1165cz) {
        this(c1164cy);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6740a(int i, boolean z) {
        this.f5761a.f5756m.lock();
        try {
            if (this.f5761a.f5755l) {
                this.f5761a.f5755l = false;
                this.f5761a.m6960a(i, z);
            } else {
                this.f5761a.f5755l = true;
                this.f5761a.f5747d.mo6386a(i);
            }
        } finally {
            this.f5761a.f5756m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6741a(Bundle bundle) {
        this.f5761a.f5756m.lock();
        try {
            this.f5761a.f5754k = C1071a.f5439a;
            this.f5761a.m6974h();
        } finally {
            this.f5761a.f5756m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1115bc
    /* JADX INFO: renamed from: a */
    public final void mo6742a(C1071a c1071a) {
        this.f5761a.f5756m.lock();
        try {
            this.f5761a.f5754k = c1071a;
            this.f5761a.m6974h();
        } finally {
            this.f5761a.f5756m.unlock();
        }
    }
}
