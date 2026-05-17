package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.rl */
/* JADX INFO: loaded from: classes.dex */
class C1883rl extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static String f11468a = C1883rl.class.getName();

    /* JADX INFO: renamed from: b */
    private final C1834pq f11469b;

    /* JADX INFO: renamed from: c */
    private boolean f11470c;

    /* JADX INFO: renamed from: d */
    private boolean f11471d;

    C1883rl(C1834pq c1834pq) {
        C1221aj.m7065a(c1834pq);
        this.f11469b = c1834pq;
    }

    /* JADX INFO: renamed from: e */
    private final void m12230e() {
        this.f11469b.m12060e();
        this.f11469b.m12063h();
    }

    /* JADX INFO: renamed from: f */
    private final boolean m12231f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11469b.m12056a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12232a() {
        m12230e();
        if (this.f11470c) {
            return;
        }
        Context contextM12056a = this.f11469b.m12056a();
        contextM12056a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(contextM12056a.getPackageName());
        contextM12056a.registerReceiver(this, intentFilter);
        this.f11471d = m12231f();
        this.f11469b.m12060e().m12020a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f11471d));
        this.f11470c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m12233b() {
        if (this.f11470c) {
            this.f11469b.m12060e().m12023b("Unregistering connectivity change receiver");
            this.f11470c = false;
            this.f11471d = false;
            try {
                this.f11469b.m12056a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f11469b.m12060e().m12034e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12234c() {
        Context contextM12056a = this.f11469b.m12056a();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(contextM12056a.getPackageName());
        intent.putExtra(f11468a, true);
        contextM12056a.sendOrderedBroadcast(intent, null);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12235d() {
        if (!this.f11470c) {
            this.f11469b.m12060e().m12033e("Connectivity unknown. Receiver not registered");
        }
        return this.f11471d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m12230e();
        String action = intent.getAction();
        this.f11469b.m12060e().m12020a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zM12231f = m12231f();
            if (this.f11471d != zM12231f) {
                this.f11471d = zM12231f;
                C1823pf c1823pfM12063h = this.f11469b.m12063h();
                c1823pfM12063h.m12020a("Network connectivity status changed", Boolean.valueOf(zM12231f));
                c1823pfM12063h.m12041m().m6080a(new RunnableC1825ph(c1823pfM12063h, zM12231f));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f11469b.m12060e().m12031d("NetworkBroadcastReceiver received unknown action", action);
        } else {
            if (intent.hasExtra(f11468a)) {
                return;
            }
            C1823pf c1823pfM12063h2 = this.f11469b.m12063h();
            c1823pfM12063h2.m12023b("Radio powered up");
            c1823pfM12063h2.m12011c();
        }
    }
}
