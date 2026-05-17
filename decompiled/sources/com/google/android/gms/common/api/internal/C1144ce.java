package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.AbstractC1200r;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ce */
/* JADX INFO: loaded from: classes.dex */
final class C1144ce implements IBinder.DeathRecipient, InterfaceC1145cf {

    /* JADX INFO: renamed from: a */
    private final WeakReference<BasePendingResult<?>> f5703a;

    /* JADX INFO: renamed from: b */
    private final WeakReference<AbstractC1200r> f5704b;

    /* JADX INFO: renamed from: c */
    private final WeakReference<IBinder> f5705c;

    private C1144ce(BasePendingResult<?> basePendingResult, AbstractC1200r abstractC1200r, IBinder iBinder) {
        this.f5704b = new WeakReference<>(abstractC1200r);
        this.f5703a = new WeakReference<>(basePendingResult);
        this.f5705c = new WeakReference<>(iBinder);
    }

    /* synthetic */ C1144ce(BasePendingResult basePendingResult, AbstractC1200r abstractC1200r, IBinder iBinder, C1143cd c1143cd) {
        this(basePendingResult, null, iBinder);
    }

    /* JADX INFO: renamed from: a */
    private final void m6924a() {
        BasePendingResult<?> basePendingResult = this.f5703a.get();
        AbstractC1200r abstractC1200r = this.f5704b.get();
        if (abstractC1200r != null && basePendingResult != null) {
            abstractC1200r.m7030a(basePendingResult.mo6698c().intValue());
        }
        IBinder iBinder = this.f5705c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException e) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1145cf
    /* JADX INFO: renamed from: a */
    public final void mo6923a(BasePendingResult<?> basePendingResult) {
        m6924a();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        m6924a();
    }
}
