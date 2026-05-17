package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.C1290a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1264k implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Set<ServiceConnection> f5962a = new HashSet();

    /* JADX INFO: renamed from: b */
    private int f5963b = 2;

    /* JADX INFO: renamed from: c */
    private boolean f5964c;

    /* JADX INFO: renamed from: d */
    private IBinder f5965d;

    /* JADX INFO: renamed from: e */
    private final C1262i f5966e;

    /* JADX INFO: renamed from: f */
    private ComponentName f5967f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ C1263j f5968g;

    public ServiceConnectionC1264k(C1263j c1263j, C1262i c1262i) {
        this.f5968g = c1263j;
        this.f5966e = c1262i;
    }

    /* JADX INFO: renamed from: a */
    public final void m7198a(ServiceConnection serviceConnection, String str) {
        C1290a unused = this.f5968g.f5959d;
        Context unused2 = this.f5968g.f5957b;
        this.f5966e.m7192d();
        this.f5962a.add(serviceConnection);
    }

    /* JADX INFO: renamed from: a */
    public final void m7199a(String str) {
        this.f5963b = 3;
        this.f5964c = this.f5968g.f5959d.m7242a(this.f5968g.f5957b, str, this.f5966e.m7192d(), this, this.f5966e.m7191c());
        if (this.f5964c) {
            this.f5968g.f5958c.sendMessageDelayed(this.f5968g.f5958c.obtainMessage(1, this.f5966e), this.f5968g.f5961f);
        } else {
            this.f5963b = 2;
            try {
                C1290a unused = this.f5968g.f5959d;
                this.f5968g.f5957b.unbindService(this);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7200a() {
        return this.f5964c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7201a(ServiceConnection serviceConnection) {
        return this.f5962a.contains(serviceConnection);
    }

    /* JADX INFO: renamed from: b */
    public final int m7202b() {
        return this.f5963b;
    }

    /* JADX INFO: renamed from: b */
    public final void m7203b(ServiceConnection serviceConnection, String str) {
        C1290a unused = this.f5968g.f5959d;
        Context unused2 = this.f5968g.f5957b;
        this.f5962a.remove(serviceConnection);
    }

    /* JADX INFO: renamed from: b */
    public final void m7204b(String str) {
        this.f5968g.f5958c.removeMessages(1, this.f5966e);
        C1290a unused = this.f5968g.f5959d;
        this.f5968g.f5957b.unbindService(this);
        this.f5964c = false;
        this.f5963b = 2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7205c() {
        return this.f5962a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final IBinder m7206d() {
        return this.f5965d;
    }

    /* JADX INFO: renamed from: e */
    public final ComponentName m7207e() {
        return this.f5967f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5968g.f5956a) {
            this.f5968g.f5958c.removeMessages(1, this.f5966e);
            this.f5965d = iBinder;
            this.f5967f = componentName;
            Iterator<ServiceConnection> it = this.f5962a.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f5963b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5968g.f5956a) {
            this.f5968g.f5958c.removeMessages(1, this.f5966e);
            this.f5965d = null;
            this.f5967f = componentName;
            Iterator<ServiceConnection> it = this.f5962a.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f5963b = 2;
        }
    }
}
