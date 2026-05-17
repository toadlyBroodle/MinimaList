package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1075b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p051b.C0965f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1191z<T> extends AbstractC1085a {

    /* JADX INFO: renamed from: a */
    protected final C0965f<T> f5819a;

    public AbstractC1191z(int i, C0965f<T> c0965f) {
        super(i);
        this.f5819a = c0965f;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public void mo6726a(Status status) {
        this.f5819a.m6220b(new C1075b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6727a(C1100ao<?> c1100ao) throws DeadObjectException {
        try {
            mo6926b(c1100ao);
        } catch (DeadObjectException e) {
            mo6726a(AbstractC1085a.m6725b(e));
            throw e;
        } catch (RemoteException e2) {
            mo6726a(AbstractC1085a.m6725b(e2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public void mo6728a(C1171f c1171f, boolean z) {
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo6926b(C1100ao<?> c1100ao);
}
