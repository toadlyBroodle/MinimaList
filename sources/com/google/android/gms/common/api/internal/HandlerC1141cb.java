package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cb */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1141cb extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1138bz f5696a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                AbstractC1080g<?> abstractC1080g = (AbstractC1080g) message.obj;
                synchronized (this.f5696a.f5689e) {
                    if (abstractC1080g == null) {
                        this.f5696a.f5686b.m6907a(new Status(13, "Transform returned null"));
                    } else if (abstractC1080g instanceof C1127bo) {
                        this.f5696a.f5686b.m6907a(((C1127bo) abstractC1080g).m6893d());
                    } else {
                        this.f5696a.f5686b.m6919a(abstractC1080g);
                    }
                    break;
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String strValueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            default:
                Log.e("TransformedResultImpl", new StringBuilder(70).append("TransformationResultHandler received unknown message type: ").append(message.what).toString());
                return;
        }
    }
}
