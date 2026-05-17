package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ax */
/* JADX INFO: loaded from: classes.dex */
public final class C1109ax extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private Context f5620a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1110ay f5621b;

    public C1109ax(AbstractC1110ay abstractC1110ay) {
        this.f5621b = abstractC1110ay;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6845a() {
        if (this.f5620a != null) {
            this.f5620a.unregisterReceiver(this);
        }
        this.f5620a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m6846a(Context context) {
        this.f5620a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5621b.mo6748a();
            m6845a();
        }
    }
}
