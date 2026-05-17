package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.bcz;
import com.google.android.gms.internal.bdc;
import com.google.android.gms.internal.bdd;
import com.google.android.gms.internal.bde;
import com.google.android.gms.internal.bdw;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2257r implements bdd {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2234af f12938a;

    private C2257r(InterfaceC2234af interfaceC2234af) {
        this.f12938a = interfaceC2234af;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC2248i m12990a(bdw bdwVar) {
        return new BinderC2259t(bdwVar);
    }

    /* JADX INFO: renamed from: a */
    public static C2257r m12991a(Context context, C2254o c2254o, bcz bczVar, bde bdeVar) {
        return new C2257r(IPersistentConnectionImpl.loadDynamic(context, c2254o, bczVar.m8943b(), bczVar.m8944c(), bdeVar));
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8959a() {
        try {
            this.f12938a.initialize();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8960a(List<String> list, bdw bdwVar) {
        try {
            this.f12938a.onDisconnectCancel(list, m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8961a(List<String> list, Object obj, bdw bdwVar) {
        try {
            this.f12938a.put(list, BinderC0654c.m5329a(obj), m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8962a(List<String> list, Object obj, String str, bdw bdwVar) {
        try {
            this.f12938a.compareAndPut(list, BinderC0654c.m5329a(obj), str, m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8963a(List<String> list, Map<String, Object> map) {
        try {
            this.f12938a.unlisten(list, BinderC0654c.m5329a(map));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8964a(List<String> list, Map<String, Object> map, bdc bdcVar, Long l, bdw bdwVar) {
        long jLongValue;
        BinderC2258s binderC2258s = new BinderC2258s(this, bdcVar);
        if (l != null) {
            try {
                jLongValue = l.longValue();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            jLongValue = -1;
        }
        this.f12938a.listen(list, BinderC0654c.m5329a(map), binderC2258s, jLongValue, m12990a(bdwVar));
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: a */
    public final void mo8965a(List<String> list, Map<String, Object> map, bdw bdwVar) {
        try {
            this.f12938a.merge(list, BinderC0654c.m5329a(map), m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8966b() {
        try {
            this.f12938a.shutdown();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8967b(List<String> list, Object obj, bdw bdwVar) {
        try {
            this.f12938a.onDisconnectPut(list, BinderC0654c.m5329a(obj), m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: b */
    public final void mo8968b(List<String> list, Map<String, Object> map, bdw bdwVar) {
        try {
            this.f12938a.onDisconnectMerge(list, BinderC0654c.m5329a(map), m12990a(bdwVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: c */
    public final void mo8969c() {
        try {
            this.f12938a.refreshAuthToken();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: c */
    public final void mo8970c(String str) {
        try {
            this.f12938a.refreshAuthToken2(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: d */
    public final void mo8971d() {
        try {
            this.f12938a.purgeOutstandingWrites();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: d */
    public final void mo8972d(String str) {
        try {
            this.f12938a.interrupt(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: e */
    public final void mo8973e(String str) {
        try {
            this.f12938a.resume(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdd
    /* JADX INFO: renamed from: f */
    public final boolean mo8974f(String str) {
        try {
            return this.f12938a.isInterrupted(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
