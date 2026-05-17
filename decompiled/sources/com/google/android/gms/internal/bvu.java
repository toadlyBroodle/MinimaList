package com.google.android.gms.internal;

import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: loaded from: classes.dex */
final class bvu implements InterfaceC1236ay {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bvq f9141a;

    bvu(bvq bvqVar) {
        this.f9141a = bvqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1236ay
    /* JADX INFO: renamed from: a */
    public final void mo7138a(C1071a c1071a) {
        synchronized (this.f9141a.f9134b) {
            this.f9141a.f9137e = null;
            if (this.f9141a.f9135c != null) {
                bvq.m10333a(this.f9141a, (bvx) null);
            }
            this.f9141a.f9134b.notifyAll();
        }
    }
}
