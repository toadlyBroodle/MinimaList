package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.d */
/* JADX INFO: loaded from: classes.dex */
final class BinderC2124d extends AbstractBinderC2138r {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AppMeasurement f12772a;

    BinderC2124d(AppMeasurement appMeasurement) {
        this.f12772a = appMeasurement;
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> mo12815a() {
        return this.f12772a.getUserProperties(true);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12816a(InterfaceC2131k interfaceC2131k) {
        this.f12772a.registerOnMeasurementEventListener(new C2126f(this, interfaceC2131k));
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12817a(InterfaceC2134n interfaceC2134n) {
        this.f12772a.setEventInterceptor(new C2125e(this, interfaceC2134n));
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12818a(String str, String str2, Bundle bundle, long j) {
        this.f12772a.logEventInternalNoInterceptor(str, str2, bundle, j);
    }
}
