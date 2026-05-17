package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bkb {

    /* JADX INFO: renamed from: a */
    private final Map<bkp, bjg> f8307a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final List<bjg> m9518a() {
        return new ArrayList(this.f8307a.values());
    }

    /* JADX INFO: renamed from: a */
    public final void m9519a(bjg bjgVar) {
        bjk bjkVarM9453b = bjgVar.m9453b();
        bkp bkpVarM9452a = bjgVar.m9452a();
        if (!this.f8307a.containsKey(bkpVarM9452a)) {
            this.f8307a.put(bjgVar.m9452a(), bjgVar);
            return;
        }
        bjg bjgVar2 = this.f8307a.get(bkpVarM9452a);
        bjk bjkVarM9453b2 = bjgVar2.m9453b();
        if (bjkVarM9453b == bjk.CHILD_ADDED && bjkVarM9453b2 == bjk.CHILD_REMOVED) {
            this.f8307a.put(bjgVar.m9452a(), bjg.m9444a(bkpVarM9452a, bjgVar.m9454c(), bjgVar2.m9454c()));
            return;
        }
        if (bjkVarM9453b == bjk.CHILD_REMOVED && bjkVarM9453b2 == bjk.CHILD_ADDED) {
            this.f8307a.remove(bkpVarM9452a);
            return;
        }
        if (bjkVarM9453b == bjk.CHILD_REMOVED && bjkVarM9453b2 == bjk.CHILD_CHANGED) {
            this.f8307a.put(bkpVarM9452a, bjg.m9448b(bkpVarM9452a, bjgVar2.m9455d()));
            return;
        }
        if (bjkVarM9453b == bjk.CHILD_CHANGED && bjkVarM9453b2 == bjk.CHILD_ADDED) {
            this.f8307a.put(bkpVarM9452a, bjg.m9443a(bkpVarM9452a, bjgVar.m9454c()));
        } else if (bjkVarM9453b == bjk.CHILD_CHANGED && bjkVarM9453b2 == bjk.CHILD_CHANGED) {
            this.f8307a.put(bkpVarM9452a, bjg.m9444a(bkpVarM9452a, bjgVar.m9454c(), bjgVar2.m9455d()));
        } else {
            String strValueOf = String.valueOf(bjgVar);
            String strValueOf2 = String.valueOf(bjgVar2);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 48 + String.valueOf(strValueOf2).length()).append("Illegal combination of changes: ").append(strValueOf).append(" occurred after ").append(strValueOf2).toString());
        }
    }
}
