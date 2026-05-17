package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.google.firebase.iid.y */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC2313y extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2312x f13055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2313y(C2312x c2312x, Looper looper) {
        super(looper);
        this.f13055a = c2312x;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f13055a.m13112a(message);
    }
}
