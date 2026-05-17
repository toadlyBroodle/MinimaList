package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class buc extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bua f9012a;

    buc(bua buaVar) {
        this.f9012a = buaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f9012a.m10254a(3);
    }
}
