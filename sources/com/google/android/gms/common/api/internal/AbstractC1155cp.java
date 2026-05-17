package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.c;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1230as;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1155cp<R extends InterfaceC1193k, A extends C1074a.c> extends BasePendingResult<R> implements InterfaceC1156cq<R> {

    /* JADX INFO: renamed from: a */
    private final C1074a.d<A> f5729a;

    /* JADX INFO: renamed from: c */
    private final C1074a<?> f5730c;

    protected AbstractC1155cp(C1074a<?> c1074a, AbstractC1079f abstractC1079f) {
        super((AbstractC1079f) C1221aj.m7066a(abstractC1079f, "GoogleApiClient must not be null"));
        C1221aj.m7066a(c1074a, "Api must not be null");
        this.f5729a = (C1074a.d<A>) c1074a.m6631c();
        this.f5730c = c1074a;
    }

    /* JADX INFO: renamed from: a */
    private final void m6945a(RemoteException remoteException) {
        m6946b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6178a(A a);

    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo6179a(Object obj) {
        super.m6708a((InterfaceC1193k) obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m6946b(Status status) {
        C1221aj.m7075b(!status.m6626d(), "Failed result must not be success");
        m6708a((InterfaceC1193k) mo6177a(status));
    }

    /* JADX INFO: renamed from: b */
    public final void m6947b(A a) throws DeadObjectException {
        if (a instanceof C1230as) {
            a = C1230as.m7086e();
        }
        try {
            mo6178a((C1074a.c) a);
        } catch (DeadObjectException e) {
            m6945a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m6945a(e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1074a.d<A> m6948g() {
        return this.f5729a;
    }

    /* JADX INFO: renamed from: h */
    public final C1074a<?> m6949h() {
        return this.f5730c;
    }
}
