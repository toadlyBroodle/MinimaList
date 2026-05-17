package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.bzv;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.i */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0688i {

    /* JADX INFO: renamed from: a */
    private final Object f4398a = new Object();

    /* JADX INFO: renamed from: b */
    private byx f4399b;

    /* JADX INFO: renamed from: c */
    private a f4400c;

    /* JADX INFO: renamed from: com.google.android.gms.ads.i$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void m5436a() {
        }

        /* JADX INFO: renamed from: a */
        public void m5437a(boolean z) {
        }

        /* JADX INFO: renamed from: b */
        public void m5438b() {
        }

        /* JADX INFO: renamed from: c */
        public void m5439c() {
        }

        /* JADX INFO: renamed from: d */
        public void m5440d() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final byx m5433a() {
        byx byxVar;
        synchronized (this.f4398a) {
            byxVar = this.f4399b;
        }
        return byxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5434a(a aVar) {
        C1221aj.m7066a(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f4398a) {
            this.f4400c = aVar;
            if (this.f4399b == null) {
                return;
            }
            try {
                this.f4399b.mo10421a(new bzv(aVar));
            } catch (RemoteException e) {
                C1668jm.m11611b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5435a(byx byxVar) {
        synchronized (this.f4398a) {
            this.f4399b = byxVar;
            if (this.f4400c != null) {
                m5434a(this.f4400c);
            }
        }
    }
}
