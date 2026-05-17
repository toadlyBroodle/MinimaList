package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1261h {

    /* JADX INFO: renamed from: a */
    private static final Object f5950a = new Object();

    /* JADX INFO: renamed from: b */
    private static AbstractC1261h f5951b;

    /* JADX INFO: renamed from: a */
    public static AbstractC1261h m7185a(Context context) {
        synchronized (f5950a) {
            if (f5951b == null) {
                f5951b = new C1263j(context.getApplicationContext());
            }
        }
        return f5951b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7186a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo7188b(new C1262i(str, str2, i), serviceConnection, str3);
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo7187a(C1262i c1262i, ServiceConnection serviceConnection, String str);

    /* JADX INFO: renamed from: b */
    protected abstract void mo7188b(C1262i c1262i, ServiceConnection serviceConnection, String str);
}
