package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1206e;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.es */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1539es implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10519a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1700kr f10520b;

    RunnableC1539es(C1538er c1538er, Context context, C1700kr c1700kr) {
        this.f10519a = context;
        this.f10520b = c1700kr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10520b.m11657b(C0677a.m5396a(this.f10519a));
        } catch (C1205d | C1206e | IOException | IllegalStateException e) {
            this.f10520b.m11656a(e);
            C1668jm.m11611b("Exception while getting advertising Id info", e);
        }
    }
}
