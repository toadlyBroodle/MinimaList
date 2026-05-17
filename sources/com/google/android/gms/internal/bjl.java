package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bjl {

    /* JADX INFO: renamed from: a */
    private final bjs f8267a;

    /* JADX INFO: renamed from: b */
    private final ble f8268b;

    public bjl(bjs bjsVar) {
        this.f8267a = bjsVar;
        this.f8268b = bjsVar.m9484c();
    }

    /* JADX INFO: renamed from: a */
    private final void m9459a(List<bji> list, bjk bjkVar, List<bjg> list2, List<bex> list3, blf blfVar) {
        ArrayList arrayList = new ArrayList();
        for (bjg bjgVar : list2) {
            if (bjgVar.m9453b().equals(bjkVar)) {
                arrayList.add(bjgVar);
            }
        }
        Collections.sort(arrayList, new bjm(this));
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bjg bjgVar2 = (bjg) arrayList2.get(i);
            for (bex bexVar : list3) {
                if (bexVar.mo9138a(bjkVar)) {
                    list.add(bexVar.mo9131a((bjgVar2.m9453b().equals(bjk.VALUE) || bjgVar2.m9453b().equals(bjk.CHILD_REMOVED)) ? bjgVar2 : bjgVar2.m9451a(blfVar.m9614a(bjgVar2.m9452a(), bjgVar2.m9454c().m9616a(), this.f8268b)), this.f8267a));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<bji> m9460a(List<bjg> list, blf blfVar, List<bex> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (bjg bjgVar : list) {
            if (bjgVar.m9453b().equals(bjk.CHILD_CHANGED)) {
                if (this.f8268b.compare(new blm(bkp.m9548a(), bjgVar.m9455d().m9616a()), new blm(bkp.m9548a(), bjgVar.m9454c().m9616a())) != 0) {
                    arrayList2.add(bjg.m9450c(bjgVar.m9452a(), bjgVar.m9454c()));
                }
            }
        }
        m9459a(arrayList, bjk.CHILD_REMOVED, list, list2, blfVar);
        m9459a(arrayList, bjk.CHILD_ADDED, list, list2, blfVar);
        m9459a(arrayList, bjk.CHILD_MOVED, arrayList2, list2, blfVar);
        m9459a(arrayList, bjk.CHILD_CHANGED, list, list2, blfVar);
        m9459a(arrayList, bjk.VALUE, list, list2, blfVar);
        return arrayList;
    }
}
