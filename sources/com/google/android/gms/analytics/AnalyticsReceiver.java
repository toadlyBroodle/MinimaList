package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.C1890rs;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private C1890rs f4906a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f4906a == null) {
            this.f4906a = new C1890rs();
        }
        C1890rs.m12269a(context, intent);
    }
}
