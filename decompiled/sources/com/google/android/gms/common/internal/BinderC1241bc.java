package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bc */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1241bc extends AbstractBinderC1276w {

    /* JADX INFO: renamed from: a */
    private AbstractC1233av f5895a;

    /* JADX INFO: renamed from: b */
    private final int f5896b;

    public BinderC1241bc(AbstractC1233av abstractC1233av, int i) {
        this.f5895a = abstractC1233av;
        this.f5896b = i;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1275v
    /* JADX INFO: renamed from: a */
    public final void mo7144a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1275v
    /* JADX INFO: renamed from: a */
    public final void mo7145a(int i, IBinder iBinder, Bundle bundle) {
        C1221aj.m7066a(this.f5895a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f5895a.mo7109a(i, iBinder, bundle, this.f5896b);
        this.f5895a = null;
    }
}
