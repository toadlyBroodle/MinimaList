package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.fi */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractC1556fi implements InterfaceC1616ho<InterfaceFutureC1689kg> {

    /* JADX INFO: renamed from: b */
    private volatile Thread f10650b;

    /* JADX INFO: renamed from: a */
    private final Runnable f10649a = new RunnableC1557fj(this);

    /* JADX INFO: renamed from: c */
    private boolean f10651c = false;

    public AbstractC1556fi() {
    }

    public AbstractC1556fi(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5769a();

    /* JADX INFO: renamed from: b */
    public abstract void mo5770b();

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: c */
    public final void mo11075c() {
        mo5770b();
        if (this.f10650b != null) {
            this.f10650b.interrupt();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceFutureC1689kg mo11076d() {
        return this.f10651c ? C1590gp.m11369a(1, this.f10649a) : C1590gp.m11370a(this.f10649a);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceFutureC1689kg m11341h() {
        return this.f10651c ? C1590gp.m11369a(1, this.f10649a) : C1590gp.m11370a(this.f10649a);
    }
}
