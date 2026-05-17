package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.internal.C1149cj;
import com.google.android.gms.common.api.internal.InterfaceC1133bu;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.api.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1199q {

    /* JADX INFO: renamed from: a */
    private InterfaceC1133bu f5820a;

    /* JADX INFO: renamed from: b */
    private Looper f5821b;

    /* JADX INFO: renamed from: a */
    public final C1078e.a m7028a() {
        if (this.f5820a == null) {
            this.f5820a = new C1149cj();
        }
        if (this.f5821b == null) {
            this.f5821b = Looper.getMainLooper();
        }
        return new C1078e.a(this.f5820a, this.f5821b);
    }

    /* JADX INFO: renamed from: a */
    public final C1199q m7029a(InterfaceC1133bu interfaceC1133bu) {
        C1221aj.m7066a(interfaceC1133bu, "StatusExceptionMapper must not be null.");
        this.f5820a = interfaceC1133bu;
        return this;
    }
}
