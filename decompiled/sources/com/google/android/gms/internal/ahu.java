package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class ahu extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static String f6792a = ahu.class.getName();

    /* JADX INFO: renamed from: b */
    private final aik f6793b;

    ahu(aik aikVar) {
        this.f6793b = aikVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m7948a(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f6792a, true);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(f6792a)) {
                return;
            }
            this.f6793b.mo8006a();
            return;
        }
        Bundle extras = intent.getExtras();
        Boolean boolValueOf = Boolean.FALSE;
        if (extras != null) {
            boolValueOf = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
        }
        this.f6793b.mo8007a(!boolValueOf.booleanValue());
    }
}
