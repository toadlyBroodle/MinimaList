package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
class aal extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static String f6134a = aal.class.getName();

    /* JADX INFO: renamed from: b */
    private final abd f6135b;

    /* JADX INFO: renamed from: c */
    private boolean f6136c;

    /* JADX INFO: renamed from: d */
    private boolean f6137d;

    aal(abd abdVar) {
        C1221aj.m7065a(abdVar);
        this.f6135b = abdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7422a() {
        this.f6135b.m7518a();
        this.f6135b.m7542h().mo7376c();
        if (this.f6136c) {
            return;
        }
        this.f6135b.m7554t().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f6137d = this.f6135b.m7553s().m7419y();
        this.f6135b.m7540f().m7405E().m7413a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6137d));
        this.f6136c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7423b() {
        this.f6135b.m7518a();
        this.f6135b.m7542h().mo7376c();
        this.f6135b.m7542h().mo7376c();
        if (this.f6136c) {
            this.f6135b.m7540f().m7405E().m7412a("Unregistering connectivity change receiver");
            this.f6136c = false;
            this.f6137d = false;
            try {
                this.f6135b.m7554t().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6135b.m7540f().m7410y().m7413a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f6135b.m7518a();
        String action = intent.getAction();
        this.f6135b.m7540f().m7405E().m7413a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f6135b.m7540f().m7401A().m7413a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM7419y = this.f6135b.m7553s().m7419y();
        if (this.f6137d != zM7419y) {
            this.f6137d = zM7419y;
            this.f6135b.m7542h().m7479a(new aam(this, zM7419y));
        }
    }
}
