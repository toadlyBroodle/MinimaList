package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ix */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1652ix {

    /* JADX INFO: renamed from: d */
    private boolean f10817d;

    /* JADX INFO: renamed from: e */
    private Context f10818e;

    /* JADX INFO: renamed from: c */
    private boolean f10816c = false;

    /* JADX INFO: renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f10815b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    private final BroadcastReceiver f10814a = new C1653iy(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final synchronized void m11546a(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f10815b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11548a(Context context) {
        if (!this.f10816c) {
            this.f10818e = context.getApplicationContext();
            if (this.f10818e == null) {
                this.f10818e = context;
            }
            can.m10549a(this.f10818e);
            this.f10817d = ((Boolean) bxm.m10409f().m10546a(can.f9500bT)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10818e.registerReceiver(this.f10814a, intentFilter);
            this.f10816c = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11549a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f10817d) {
            this.f10815b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11550a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f10817d) {
            this.f10815b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
