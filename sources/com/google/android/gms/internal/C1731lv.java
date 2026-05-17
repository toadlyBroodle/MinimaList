package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.lv */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class C1731lv {

    /* JADX INFO: renamed from: b */
    private long f10976b;

    /* JADX INFO: renamed from: a */
    private final long f10975a = TimeUnit.MILLISECONDS.toNanos(((Long) bxm.m10409f().m10546a(can.f9668t)).longValue());

    /* JADX INFO: renamed from: c */
    private boolean f10977c = true;

    C1731lv() {
    }

    /* JADX INFO: renamed from: a */
    public final void m11725a() {
        this.f10977c = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m11726a(SurfaceTexture surfaceTexture, InterfaceC1723ln interfaceC1723ln) {
        if (interfaceC1723ln == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f10977c || Math.abs(timestamp - this.f10976b) >= this.f10975a) {
            this.f10977c = false;
            this.f10976b = timestamp;
            C1596gv.f10711a.post(new RunnableC1732lw(this, interfaceC1723ln));
        }
    }
}
