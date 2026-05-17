package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cu */
/* JADX INFO: loaded from: classes.dex */
final class C1160cu extends AbstractC1110ay {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Dialog f5739a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC1159ct f5740b;

    C1160cu(RunnableC1159ct runnableC1159ct, Dialog dialog) {
        this.f5740b = runnableC1159ct;
        this.f5739a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1110ay
    /* JADX INFO: renamed from: a */
    public final void mo6748a() {
        this.f5740b.f5737a.m6952h();
        if (this.f5739a.isShowing()) {
            this.f5739a.dismiss();
        }
    }
}
