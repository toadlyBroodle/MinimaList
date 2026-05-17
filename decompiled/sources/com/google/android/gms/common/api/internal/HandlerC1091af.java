package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.af */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1091af extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1086aa f5555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1091af(C1086aa c1086aa, Looper looper) {
        super(looper);
        this.f5555a = c1086aa;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f5555a.m6739q();
                break;
            case 2:
                this.f5555a.m6738p();
                break;
            default:
                Log.w("GoogleApiClientImpl", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                break;
        }
    }
}
