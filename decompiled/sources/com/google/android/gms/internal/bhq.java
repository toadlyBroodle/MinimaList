package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bhq implements bey {

    /* JADX INFO: renamed from: b */
    private static bhq f8178b = new bhq();

    /* JADX INFO: renamed from: a */
    private HashMap<bex, List<bex>> f8179a = new HashMap<>();

    private bhq() {
    }

    /* JADX INFO: renamed from: a */
    public static bhq m9341a() {
        return f8178b;
    }

    @Override // com.google.android.gms.internal.bey
    /* JADX INFO: renamed from: a */
    public final void mo9141a(bex bexVar) {
        bex bexVarMo9130a;
        List<bex> list;
        int i = 0;
        synchronized (this.f8179a) {
            List<bex> list2 = this.f8179a.get(bexVar);
            if (list2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    }
                    if (list2.get(i2) == bexVar) {
                        list2.remove(i2);
                        break;
                    }
                    i2++;
                }
                if (list2.isEmpty()) {
                    this.f8179a.remove(bexVar);
                }
            }
            if (!bexVar.mo9132a().m9485d() && (list = this.f8179a.get((bexVarMo9130a = bexVar.mo9130a(bjs.m9481a(bexVar.mo9132a().m9482a()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (list.get(i) == bexVar) {
                        list.remove(i);
                        break;
                    }
                    i++;
                }
                if (list.isEmpty()) {
                    this.f8179a.remove(bexVarMo9130a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9342b(bex bexVar) {
        synchronized (this.f8179a) {
            List<bex> arrayList = this.f8179a.get(bexVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f8179a.put(bexVar, arrayList);
            }
            arrayList.add(bexVar);
            if (!bexVar.mo9132a().m9485d()) {
                bex bexVarMo9130a = bexVar.mo9130a(bjs.m9481a(bexVar.mo9132a().m9482a()));
                List<bex> arrayList2 = this.f8179a.get(bexVarMo9130a);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    this.f8179a.put(bexVarMo9130a, arrayList2);
                }
                arrayList2.add(bexVar);
            }
            bexVar.m9136a(true);
            bexVar.m9133a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9343c(bex bexVar) {
        synchronized (this.f8179a) {
            List<bex> list = this.f8179a.get(bexVar);
            if (list != null && !list.isEmpty()) {
                if (bexVar.mo9132a().m9485d()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        bex bexVar2 = list.get(size);
                        if (!hashSet.contains(bexVar2.mo9132a())) {
                            hashSet.add(bexVar2.mo9132a());
                            bexVar2.m9139b();
                        }
                    }
                } else {
                    list.get(0).m9139b();
                }
            }
        }
    }
}
