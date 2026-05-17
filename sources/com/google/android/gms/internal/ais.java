package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class ais implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ air f6878a;

    ais(air airVar) {
        this.f6878a = airVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (1 == message.what && ail.f6849a.equals(message.obj)) {
            this.f6878a.f6876a.m8020d();
            if (!this.f6878a.f6876a.m8016f()) {
                this.f6878a.mo8026a(this.f6878a.f6876a.f6854e);
            }
        }
        return true;
    }
}
