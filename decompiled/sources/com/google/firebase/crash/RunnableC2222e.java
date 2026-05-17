package com.google.firebase.crash;

import android.util.Log;
import com.google.android.gms.common.util.C1302f;
import com.google.android.gms.internal.bau;
import com.google.android.gms.internal.baw;
import com.google.android.gms.internal.bay;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.firebase.C2283e;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.crash.e */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2222e implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Future f12906a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f12907b = 10000;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ InterfaceC2223f f12908c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C2220c f12909d;

    RunnableC2222e(C2220c c2220c, Future future, long j, InterfaceC2223f interfaceC2223f) {
        this.f12909d = c2220c;
        this.f12906a = future;
        this.f12908c = interfaceC2223f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        baw bawVar;
        try {
            bawVar = (baw) this.f12906a.get(this.f12907b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("FirebaseCrash", "Failed to initialize crash reporting", e);
            this.f12906a.cancel(true);
            bawVar = null;
        }
        if (bawVar == null) {
            this.f12908c.mo12950a();
            return;
        }
        try {
            C2283e c2283eM12937c = this.f12909d.f12903b.m12937c();
            bawVar.mo8788a(BinderC0654c.m5329a(this.f12909d.f12904c), new bau(c2283eM12937c.m13024b(), c2283eM12937c.m13023a()));
            if (this.f12909d.f12902a == null) {
                this.f12909d.f12902a = FirebaseInstanceId.m13027a().m13040c();
            }
            bawVar.mo8789a(this.f12909d.f12902a);
            String strValueOf = String.valueOf(bay.m8792a());
            Log.i("FirebaseCrash", new StringBuilder(String.valueOf(strValueOf).length() + 36).append("FirebaseCrash reporting initialized ").append(strValueOf).toString());
            this.f12908c.mo12951a(bawVar);
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("FirebaseCrash", strValueOf2.length() != 0 ? "Failed to initialize crash reporting: ".concat(strValueOf2) : new String("Failed to initialize crash reporting: "));
            C1302f.m7261a(this.f12909d.f12904c, e2);
            this.f12908c.mo12950a();
        }
    }
}
