package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.p007b.AbstractC0171a;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.internal.InterfaceC1128bp;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0937b extends AbstractC0171a<Void> implements InterfaceC1128bp {

    /* JADX INFO: renamed from: o */
    private Semaphore f5088o;

    /* JADX INFO: renamed from: p */
    private Set<AbstractC1079f> f5089p;

    public C0937b(Context context, Set<AbstractC1079f> set) {
        super(context);
        this.f5088o = new Semaphore(0);
        this.f5089p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.p007b.AbstractC0171a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final Void mo1299d() {
        int i = 0;
        Iterator<AbstractC1079f> it = this.f5089p.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                try {
                    this.f5088o.tryAcquire(i2, 5L, TimeUnit.SECONDS);
                    return null;
                } catch (InterruptedException e) {
                    Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            i = it.next().mo6672a(this) ? i2 + 1 : i2;
        }
    }

    @Override // android.support.v4.p007b.C0176c
    /* JADX INFO: renamed from: j */
    protected final void mo1351j() {
        this.f5088o.drainPermits();
        m1353l();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1128bp
    /* JADX INFO: renamed from: t */
    public final void mo6164t() {
        this.f5088o.release();
    }
}
