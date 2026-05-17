package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.internal.iy */
/* JADX INFO: loaded from: classes.dex */
final class C1653iy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1652ix f10819a;

    C1653iy(C1652ix c1652ix) {
        this.f10819a = c1652ix;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f10819a.m11546a(context, intent);
    }
}
