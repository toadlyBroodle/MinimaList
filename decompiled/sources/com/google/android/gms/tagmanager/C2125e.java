package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.e */
/* JADX INFO: loaded from: classes.dex */
final class C2125e implements AppMeasurement.InterfaceC2115b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2134n f12773a;

    C2125e(BinderC2124d binderC2124d, InterfaceC2134n interfaceC2134n) {
        this.f12773a = interfaceC2134n;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.InterfaceC2115b
    /* JADX INFO: renamed from: a */
    public final void mo12797a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f12773a.mo8052a(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
