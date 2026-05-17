package com.google.firebase.database.connection.idl;

import com.google.android.gms.internal.bde;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.c */
/* JADX INFO: loaded from: classes.dex */
final class BinderC2242c extends AbstractBinderC2238aj {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bde f12922a;

    BinderC2242c(bde bdeVar) {
        this.f12922a = bdeVar;
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12981a() {
        this.f12922a.mo8975a();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12982a(InterfaceC0652a interfaceC0652a) {
        this.f12922a.mo8978a((Map<String, Object>) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12983a(List<String> list, InterfaceC0652a interfaceC0652a, boolean z, long j) {
        this.f12922a.mo8976a(list, BinderC0654c.m5330a(interfaceC0652a), z, IPersistentConnectionImpl.m12973b(j));
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12984a(List<String> list, List<C2251l> list2, InterfaceC0652a interfaceC0652a, long j) {
        List list3 = (List) BinderC0654c.m5330a(interfaceC0652a);
        ArrayList arrayList = new ArrayList(list2.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list2.size()) {
                this.f12922a.mo8977a(list, arrayList, IPersistentConnectionImpl.m12973b(j));
                return;
            } else {
                arrayList.add(C2251l.m12989a(list2.get(i2), list3.get(i2)));
                i = i2 + 1;
            }
        }
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12985a(boolean z) {
        this.f12922a.mo8979a(z);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: b */
    public final void mo12986b() {
        this.f12922a.mo8980b();
    }
}
