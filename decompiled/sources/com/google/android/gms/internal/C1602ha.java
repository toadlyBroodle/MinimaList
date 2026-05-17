package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.internal.ha */
/* JADX INFO: loaded from: classes.dex */
final class C1602ha extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1596gv f10727a;

    private C1602ha(C1596gv c1596gv) {
        this.f10727a = c1596gv;
    }

    /* synthetic */ C1602ha(C1596gv c1596gv, C1597gw c1597gw) {
        this(c1596gv);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f10727a.f10713c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f10727a.f10713c = false;
        }
    }
}
