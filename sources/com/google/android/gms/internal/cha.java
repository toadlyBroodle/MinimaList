package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cha {

    /* JADX INFO: renamed from: a */
    private final Object f9988a = new Object();

    /* JADX INFO: renamed from: b */
    private chh f9989b;

    /* JADX INFO: renamed from: a */
    public final chh m10853a(Context context, C1670jo c1670jo) {
        chh chhVar;
        synchronized (this.f9988a) {
            if (this.f9989b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f9989b = new chh(context, c1670jo, (String) bxm.m10409f().m10546a(can.f9427a));
            }
            chhVar = this.f9989b;
        }
        return chhVar;
    }
}
