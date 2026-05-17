package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.bcx;
import com.google.android.gms.internal.bcz;
import com.google.android.gms.internal.bdb;
import com.google.android.gms.internal.bdd;
import com.google.android.gms.internal.bde;
import com.google.android.gms.internal.bdf;
import com.google.android.gms.internal.bdw;
import com.google.android.gms.internal.bkh;
import com.google.android.gms.internal.bkn;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class IPersistentConnectionImpl extends AbstractBinderC2235ag {

    /* JADX INFO: renamed from: a */
    private bdd f12917a;

    /* JADX INFO: renamed from: a */
    private static bdw m12970a(InterfaceC2248i interfaceC2248i) {
        return new C2241b(interfaceC2248i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static long m12972b(Long l) {
        if (l == null) {
            return -1L;
        }
        if (l.longValue() == -1) {
            throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Long m12973b(long j) {
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public static InterfaceC2234af loadDynamic(Context context, C2254o c2254o, bcx bcxVar, ScheduledExecutorService scheduledExecutorService, bde bdeVar) {
        try {
            InterfaceC2234af interfaceC2234afAsInterface = AbstractBinderC2235ag.asInterface(DynamiteModule.m7328a(context, DynamiteModule.f6066d, ModuleDescriptor.MODULE_ID).m7339a("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            interfaceC2234afAsInterface.setup(c2254o, new BinderC2244e(bcxVar), BinderC0654c.m5329a(scheduledExecutorService), new BinderC2242c(bdeVar));
            return interfaceC2234afAsInterface;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (DynamiteModule.C1323c e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void compareAndPut(List<String> list, InterfaceC0652a interfaceC0652a, String str, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8962a(list, BinderC0654c.m5330a(interfaceC0652a), str, m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void initialize() {
        this.f12917a.mo8959a();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void interrupt(String str) {
        this.f12917a.mo8972d(str);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public boolean isInterrupted(String str) {
        return this.f12917a.mo8974f(str);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void listen(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2231ac interfaceC2231ac, long j, InterfaceC2248i interfaceC2248i) {
        Long lM12973b = m12973b(j);
        this.f12917a.mo8964a(list, (Map) BinderC0654c.m5330a(interfaceC0652a), new C2240al(this, interfaceC2231ac), lM12973b, m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void merge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8965a(list, (Map<String, Object>) BinderC0654c.m5330a(interfaceC0652a), m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void onDisconnectCancel(List<String> list, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8960a(list, m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void onDisconnectMerge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8968b(list, (Map<String, Object>) BinderC0654c.m5330a(interfaceC0652a), m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void onDisconnectPut(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8967b(list, BinderC0654c.m5330a(interfaceC0652a), m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void purgeOutstandingWrites() {
        this.f12917a.mo8971d();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void put(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        this.f12917a.mo8961a(list, BinderC0654c.m5330a(interfaceC0652a), m12970a(interfaceC2248i));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void refreshAuthToken() {
        this.f12917a.mo8969c();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void refreshAuthToken2(String str) {
        this.f12917a.mo8970c(str);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void resume(String str) {
        this.f12917a.mo8973e(str);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void setup(C2254o c2254o, InterfaceC2262w interfaceC2262w, InterfaceC0652a interfaceC0652a, InterfaceC2237ai interfaceC2237ai) {
        bkn bknVar;
        bdb bdbVarM12992a = C2260u.m12992a(c2254o.f12930a);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) BinderC0654c.m5330a(interfaceC0652a);
        C2243d c2243d = new C2243d(interfaceC2237ai);
        switch (c2254o.f12931b) {
            case 0:
                bknVar = bkn.NONE;
                break;
            case 1:
                bknVar = bkn.DEBUG;
                break;
            case 2:
                bknVar = bkn.INFO;
                break;
            case 3:
                bknVar = bkn.WARN;
                break;
            case 4:
                bknVar = bkn.ERROR;
                break;
            default:
                bknVar = bkn.NONE;
                break;
        }
        this.f12917a = new bdf(new bcz(new bkh(bknVar, c2254o.f12932c), new C2246g(interfaceC2262w), scheduledExecutorService, c2254o.f12933d, c2254o.f12934e, c2254o.f12935f, c2254o.f12936g), bdbVarM12992a, c2243d);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void shutdown() {
        this.f12917a.mo8966b();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public void unlisten(List<String> list, InterfaceC0652a interfaceC0652a) {
        this.f12917a.mo8963a(list, (Map<String, Object>) BinderC0654c.m5330a(interfaceC0652a));
    }
}
