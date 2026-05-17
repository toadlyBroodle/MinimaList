package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1200r;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cc */
/* JADX INFO: loaded from: classes.dex */
public final class C1142cc {

    /* JADX INFO: renamed from: a */
    public static final Status f5697a = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: c */
    private static final BasePendingResult<?>[] f5698c = new BasePendingResult[0];

    /* JADX INFO: renamed from: b */
    final Set<BasePendingResult<?>> f5699b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: d */
    private final InterfaceC1145cf f5700d = new C1143cd(this);

    /* JADX INFO: renamed from: e */
    private final Map<C1074a.d<?>, C1074a.f> f5701e;

    public C1142cc(Map<C1074a.d<?>, C1074a.f> map) {
        this.f5701e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m6920a() {
        AbstractC1200r abstractC1200r = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        AbstractC1200r abstractC1200r2 = null;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5699b.toArray(f5698c)) {
            basePendingResult.m6707a((InterfaceC1145cf) null);
            if (basePendingResult.mo6698c() != null) {
                basePendingResult.mo6696a((InterfaceC1194l) null);
                IBinder iBinderM6645k = this.f5701e.get(((AbstractC1155cp) basePendingResult).m6948g()).m6645k();
                if (basePendingResult.m6710d()) {
                    basePendingResult.m6707a(new C1144ce(basePendingResult, objArr4 == true ? 1 : 0, iBinderM6645k, objArr3 == true ? 1 : 0));
                } else if (iBinderM6645k == null || !iBinderM6645k.isBinderAlive()) {
                    basePendingResult.m6707a((InterfaceC1145cf) null);
                    basePendingResult.mo6694a();
                    abstractC1200r.m7030a(basePendingResult.mo6698c().intValue());
                } else {
                    C1144ce c1144ce = new C1144ce(basePendingResult, objArr2 == true ? 1 : 0, iBinderM6645k, objArr == true ? 1 : 0);
                    basePendingResult.m6707a(c1144ce);
                    try {
                        iBinderM6645k.linkToDeath(c1144ce, 0);
                    } catch (RemoteException e) {
                        basePendingResult.mo6694a();
                        abstractC1200r2.m7030a(basePendingResult.mo6698c().intValue());
                    }
                }
                this.f5699b.remove(basePendingResult);
            } else if (basePendingResult.m6711e()) {
                this.f5699b.remove(basePendingResult);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m6921a(BasePendingResult<? extends InterfaceC1193k> basePendingResult) {
        this.f5699b.add(basePendingResult);
        basePendingResult.m6707a(this.f5700d);
    }

    /* JADX INFO: renamed from: b */
    public final void m6922b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5699b.toArray(f5698c)) {
            basePendingResult.m6709c(f5697a);
        }
    }
}
