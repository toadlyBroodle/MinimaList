package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.bde;
import com.google.android.gms.internal.bdv;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.d */
/* JADX INFO: loaded from: classes.dex */
final class C2243d implements bde {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2237ai f12923a;

    C2243d(InterfaceC2237ai interfaceC2237ai) {
        this.f12923a = interfaceC2237ai;
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8975a() {
        try {
            this.f12923a.mo12981a();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8976a(List<String> list, Object obj, boolean z, Long l) {
        try {
            this.f12923a.mo12983a(list, BinderC0654c.m5329a(obj), z, IPersistentConnectionImpl.m12972b(l));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8977a(List<String> list, List<bdv> list2, Long l) {
        ArrayList arrayList = new ArrayList(list2.size());
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (bdv bdvVar : list2) {
            arrayList.add(new C2251l(bdvVar.m9043a(), bdvVar.m9044b()));
            arrayList2.add(bdvVar.m9045c());
        }
        try {
            this.f12923a.mo12984a(list, arrayList, BinderC0654c.m5329a(arrayList2), IPersistentConnectionImpl.m12972b(l));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8978a(Map<String, Object> map) {
        try {
            this.f12923a.mo12982a(BinderC0654c.m5329a(map));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8979a(boolean z) {
        try {
            this.f12923a.mo12985a(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: b */
    public final void mo8980b() {
        try {
            this.f12923a.mo12986b();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
