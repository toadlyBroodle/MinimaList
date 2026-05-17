package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.nr */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1781nr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f11196a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f11197b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f11198c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ boolean f11199d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ BinderC1779np f11200e;

    RunnableC1781nr(BinderC1779np binderC1779np, int i, int i2, boolean z, boolean z2) {
        this.f11200e = binderC1779np;
        this.f11196a = i;
        this.f11197b = i2;
        this.f11198c = z;
        this.f11199d = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        synchronized (this.f11200e.f11181b) {
            boolean z = this.f11196a != this.f11197b;
            boolean z2 = !this.f11200e.f11187h && this.f11197b == 1;
            boolean z3 = z && this.f11197b == 1;
            boolean z4 = z && this.f11197b == 2;
            boolean z5 = z && this.f11197b == 3;
            boolean z6 = this.f11198c != this.f11199d;
            this.f11200e.f11187h = this.f11200e.f11187h || z2;
            if (this.f11200e.f11186g == null) {
                return;
            }
            if (z2) {
                try {
                    this.f11200e.f11186g.mo10433a();
                } catch (RemoteException e) {
                    C1560fm.m11613c("Unable to call onVideoStart()", e);
                }
                if (!z3) {
                    try {
                        this.f11200e.f11186g.mo10435b();
                    } catch (RemoteException e2) {
                        C1560fm.m11613c("Unable to call onVideoPlay()", e2);
                    }
                    if (!z4) {
                        try {
                            this.f11200e.f11186g.mo10436c();
                        } catch (RemoteException e3) {
                            C1560fm.m11613c("Unable to call onVideoPause()", e3);
                        }
                        if (z5) {
                            if (z6) {
                            }
                            return;
                        }
                        try {
                            this.f11200e.f11186g.mo10437d();
                        } catch (RemoteException e4) {
                            C1560fm.m11613c("Unable to call onVideoEnd()", e4);
                        }
                        if (z6) {
                            try {
                                this.f11200e.f11186g.mo10434a(this.f11199d);
                            } catch (RemoteException e5) {
                                C1560fm.m11613c("Unable to call onVideoMute()", e5);
                            }
                        }
                        return;
                    }
                    if (z5) {
                    }
                } else if (!z4) {
                }
            } else if (!z3) {
            }
        }
    }
}
