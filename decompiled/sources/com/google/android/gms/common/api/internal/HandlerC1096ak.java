package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ak */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1096ak extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1094ai f5573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1096ak(C1094ai c1094ai, Looper looper) {
        super(looper);
        this.f5573a = c1094ai;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((AbstractC1095aj) message.obj).m6777a(this.f5573a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return;
        }
    }
}
