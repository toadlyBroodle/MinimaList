package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC1235ax;

/* JADX INFO: loaded from: classes.dex */
final class bvt implements InterfaceC1235ax {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bvq f9140a;

    bvt(bvq bvqVar) {
        this.f9140a = bvqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7136a(int i) {
        synchronized (this.f9140a.f9134b) {
            this.f9140a.f9137e = null;
            this.f9140a.f9134b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7137a(Bundle bundle) {
        synchronized (this.f9140a.f9134b) {
            try {
            } catch (DeadObjectException e) {
                C1560fm.m11611b("Unable to obtain a cache service instance.", e);
                this.f9140a.m10339c();
            }
            if (this.f9140a.f9135c != null) {
                this.f9140a.f9137e = this.f9140a.f9135c.m10347e();
                this.f9140a.f9134b.notifyAll();
            } else {
                this.f9140a.f9134b.notifyAll();
            }
        }
    }
}
