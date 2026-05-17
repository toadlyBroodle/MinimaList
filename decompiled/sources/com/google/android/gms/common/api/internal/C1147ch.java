package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p051b.C0965f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ch */
/* JADX INFO: loaded from: classes.dex */
public final class C1147ch<TResult> extends AbstractC1085a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1137by<C1074a.c, TResult> f5706a;

    /* JADX INFO: renamed from: b */
    private final C0965f<TResult> f5707b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1133bu f5708c;

    public C1147ch(int i, AbstractC1137by<C1074a.c, TResult> abstractC1137by, C0965f<TResult> c0965f, InterfaceC1133bu interfaceC1133bu) {
        super(i);
        this.f5707b = c0965f;
        this.f5706a = abstractC1137by;
        this.f5708c = interfaceC1133bu;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6726a(Status status) {
        this.f5707b.m6220b(this.f5708c.mo6901a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6727a(C1100ao<?> c1100ao) throws DeadObjectException {
        try {
            this.f5706a.mo6905a(c1100ao.m6823b(), this.f5707b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo6726a(AbstractC1085a.m6725b(e2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6728a(C1171f c1171f, boolean z) {
        c1171f.m6984a(this.f5707b, z);
    }
}
