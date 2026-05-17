package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1931tf;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1005g {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5258a = new C1992vm("Session");

    /* JADX INFO: renamed from: b */
    private final InterfaceC0995ab f5259b;

    /* JADX INFO: renamed from: c */
    private final a f5260c = new a();

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.g$a */
    class a extends AbstractBinderC1010l {
        private a() {
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: a */
        public final InterfaceC0652a mo6396a() {
            return BinderC0654c.m5329a(AbstractC1005g.this);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: a */
        public final void mo6397a(Bundle bundle) {
            AbstractC1005g.this.mo6375a(bundle);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: a */
        public final void mo6398a(boolean z) {
            AbstractC1005g.this.mo6376a(z);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: b */
        public final long mo6399b() {
            return AbstractC1005g.this.mo6379c();
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: b */
        public final void mo6400b(Bundle bundle) {
            AbstractC1005g.this.mo6380c(bundle);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: c */
        public final void mo6401c(Bundle bundle) {
            AbstractC1005g.this.mo6378b(bundle);
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC1009k
        /* JADX INFO: renamed from: d */
        public final void mo6402d(Bundle bundle) {
            AbstractC1005g.this.mo6381d(bundle);
        }
    }

    protected AbstractC1005g(Context context, String str, String str2) {
        this.f5259b = C1931tf.m12311a(context, str, str2, this.f5260c);
    }

    /* JADX INFO: renamed from: a */
    protected final void m6390a(int i) {
        try {
            this.f5259b.mo6342a(i);
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", InterfaceC0995ab.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo6375a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6376a(boolean z);

    /* JADX INFO: renamed from: b */
    protected final void m6391b(int i) {
        try {
            this.f5259b.mo6343b(i);
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC0995ab.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: b */
    protected void mo6378b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: c */
    public long mo6379c() {
        C1221aj.m7073b("Must be called from the main thread.");
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    protected final void m6392c(int i) {
        try {
            this.f5259b.mo6345c(i);
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", InterfaceC0995ab.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo6380c(Bundle bundle);

    /* JADX INFO: renamed from: d */
    protected abstract void mo6381d(Bundle bundle);

    /* JADX INFO: renamed from: e */
    public boolean m6393e() {
        C1221aj.m7073b("Must be called from the main thread.");
        try {
            return this.f5259b.mo6344b();
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "isConnected", InterfaceC0995ab.class.getSimpleName());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m6394f() {
        C1221aj.m7073b("Must be called from the main thread.");
        try {
            return this.f5259b.mo6346c();
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "isResuming", InterfaceC0995ab.class.getSimpleName());
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0652a m6395g() {
        try {
            return this.f5259b.mo6341a();
        } catch (RemoteException e) {
            f5258a.m12446a(e, "Unable to call %s on %s.", "getWrappedObject", InterfaceC0995ab.class.getSimpleName());
            return null;
        }
    }
}
