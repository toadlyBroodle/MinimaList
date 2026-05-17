package com.google.android.gms.internal;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class ail extends aik {

    /* JADX INFO: renamed from: a */
    private static final Object f6849a = new Object();

    /* JADX INFO: renamed from: o */
    private static ail f6850o;

    /* JADX INFO: renamed from: b */
    private Context f6851b;

    /* JADX INFO: renamed from: c */
    private ahi f6852c;

    /* JADX INFO: renamed from: d */
    private volatile ahf f6853d;

    /* JADX INFO: renamed from: l */
    private aiq f6861l;

    /* JADX INFO: renamed from: m */
    private ahu f6862m;

    /* JADX INFO: renamed from: e */
    private int f6854e = 1800000;

    /* JADX INFO: renamed from: f */
    private boolean f6855f = true;

    /* JADX INFO: renamed from: g */
    private boolean f6856g = false;

    /* JADX INFO: renamed from: h */
    private boolean f6857h = false;

    /* JADX INFO: renamed from: i */
    private boolean f6858i = true;

    /* JADX INFO: renamed from: j */
    private boolean f6859j = true;

    /* JADX INFO: renamed from: k */
    private ahj f6860k = new aim(this);

    /* JADX INFO: renamed from: n */
    private boolean f6863n = false;

    private ail() {
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m8009a(ail ailVar, boolean z) {
        ailVar.f6857h = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ail m8010b() {
        if (f6850o == null) {
            f6850o = new ail();
        }
        return f6850o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m8016f() {
        return this.f6863n || !this.f6858i || this.f6854e <= 0;
    }

    @Override // com.google.android.gms.internal.aik
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8006a() {
        if (!m8016f()) {
            this.f6861l.mo8025a();
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m8017a(Context context, ahf ahfVar) {
        if (this.f6851b == null) {
            this.f6851b = context.getApplicationContext();
            if (this.f6853d == null) {
                this.f6853d = ahfVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.aik
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8007a(boolean z) {
        m8018a(this.f6863n, z);
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m8018a(boolean z, boolean z2) {
        boolean zM8016f = m8016f();
        this.f6863n = z;
        this.f6858i = z2;
        if (m8016f() != zM8016f) {
            if (m8016f()) {
                this.f6861l.mo8027b();
                ahs.m7947d("PowerSaveMode initiated.");
            } else {
                this.f6861l.mo8026a(this.f6854e);
                ahs.m7947d("PowerSaveMode terminated.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final synchronized ahi m8019c() {
        if (this.f6852c == null) {
            if (this.f6851b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f6852c = new ahv(this.f6860k, this.f6851b);
        }
        if (this.f6861l == null) {
            this.f6861l = new air(this, null);
            if (this.f6854e > 0) {
                this.f6861l.mo8026a(this.f6854e);
            }
        }
        this.f6856g = true;
        if (this.f6855f) {
            m8020d();
            this.f6855f = false;
        }
        if (this.f6862m == null && this.f6859j) {
            this.f6862m = new ahu(this);
            ahu ahuVar = this.f6862m;
            Context context = this.f6851b;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(ahuVar, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context.getPackageName());
            context.registerReceiver(ahuVar, intentFilter2);
        }
        return this.f6852c;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8020d() {
        if (!this.f6856g) {
            ahs.m7947d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f6855f = true;
        } else if (!this.f6857h) {
            this.f6857h = true;
            this.f6853d.mo7921a(new ain(this));
        }
    }
}
