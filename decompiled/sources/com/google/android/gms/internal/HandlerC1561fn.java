package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.fn */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class HandlerC1561fn extends Handler {
    public HandlerC1561fn(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C0710au.m5573i().m11292a(e, "AdMobHandler.handleMessage");
        }
    }
}
