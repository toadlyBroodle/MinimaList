package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.f */
/* JADX INFO: loaded from: classes.dex */
final class C2126f implements AppMeasurement.InterfaceC2116c {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2131k f12774a;

    C2126f(BinderC2124d binderC2124d, InterfaceC2131k interfaceC2131k) {
        this.f12774a = interfaceC2131k;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.InterfaceC2116c
    /* JADX INFO: renamed from: a */
    public final void mo8795a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f12774a.mo8053a(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
