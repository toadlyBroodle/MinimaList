package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class acq implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ acf f6375a;

    acq(acf acfVar) {
        this.f6375a = acfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws TimeoutException {
        String strM7438z = this.f6375a.mo7394u().m7438z();
        if (strM7438z == null) {
            acf acfVarMo7379f = this.f6375a.mo7379f();
            if (acfVarMo7379f.mo7392s().m7482z()) {
                acfVarMo7379f.mo7393t().m7410y().m7412a("Cannot retrieve app instance id from analytics worker thread");
                strM7438z = null;
            } else {
                acfVarMo7379f.mo7392s();
                if (aay.m7476y()) {
                    acfVarMo7379f.mo7393t().m7410y().m7412a("Cannot retrieve app instance id from main thread");
                    strM7438z = null;
                } else {
                    long jMo7253b = acfVarMo7379f.mo7384k().mo7253b();
                    strM7438z = acfVarMo7379f.m7625c(120000L);
                    long jMo7253b2 = acfVarMo7379f.mo7384k().mo7253b() - jMo7253b;
                    if (strM7438z == null && jMo7253b2 < 120000) {
                        strM7438z = acfVarMo7379f.m7625c(120000 - jMo7253b2);
                    }
                }
            }
            if (strM7438z == null) {
                throw new TimeoutException();
            }
            this.f6375a.mo7394u().m7435d(strM7438z);
        }
        return strM7438z;
    }
}
