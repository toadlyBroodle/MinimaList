package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bim {

    /* JADX INFO: renamed from: a */
    private static final bix<Map<bjp, bil>> f8222a = new bin();

    /* JADX INFO: renamed from: b */
    private static final bix<Map<bjp, bil>> f8223b = new bio();

    /* JADX INFO: renamed from: c */
    private static final bix<bil> f8224c = new bip();

    /* JADX INFO: renamed from: d */
    private static final bix<bil> f8225d = new biq();

    /* JADX INFO: renamed from: e */
    private bit<Map<bjp, bil>> f8226e = new bit<>(null);

    /* JADX INFO: renamed from: f */
    private final bif f8227f;

    /* JADX INFO: renamed from: g */
    private final bkl f8228g;

    /* JADX INFO: renamed from: h */
    private final bmt f8229h;

    /* JADX INFO: renamed from: i */
    private long f8230i;

    public bim(bif bifVar, bkl bklVar, bmt bmtVar) {
        this.f8230i = 0L;
        this.f8227f = bifVar;
        this.f8228g = bklVar;
        this.f8229h = bmtVar;
        try {
            this.f8227f.mo8853d();
            this.f8227f.mo8851c(this.f8229h.mo9681a());
            this.f8227f.mo8855f();
            this.f8227f.mo8854e();
            for (bil bilVar : this.f8227f.mo8850c()) {
                this.f8230i = Math.max(bilVar.f8217a + 1, this.f8230i);
                m9386a(bilVar);
            }
        } catch (Throwable th) {
            this.f8227f.mo8854e();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private final List<bil> m9385a(bix<bil> bixVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<bfa, Map<bjp, bil>>> it = this.f8226e.iterator();
        while (it.hasNext()) {
            for (bil bilVar : it.next().getValue().values()) {
                if (bixVar.mo9333a(bilVar)) {
                    arrayList.add(bilVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private final void m9386a(bil bilVar) {
        Map<bjp, bil> map;
        bjs bjsVar = bilVar.f8218b;
        bne.m9697a(!bjsVar.m9486e() || bjsVar.m9485d(), "Can't have tracked non-default query that loads all data");
        Map<bjp, bil> mapM9422e = this.f8226e.m9422e(bilVar.f8218b.m9482a());
        if (mapM9422e == null) {
            HashMap map2 = new HashMap();
            this.f8226e = this.f8226e.m9410a(bilVar.f8218b.m9482a(), map2);
            map = map2;
        } else {
            map = mapM9422e;
        }
        bil bilVar2 = map.get(bilVar.f8218b.m9483b());
        bne.m9696a(bilVar2 == null || bilVar2.f8217a == bilVar.f8217a);
        map.put(bilVar.f8218b.m9483b(), bilVar);
    }

    /* JADX INFO: renamed from: a */
    private final void m9388a(bjs bjsVar, boolean z) {
        bil bilVar;
        bjs bjsVarM9392f = m9392f(bjsVar);
        bil bilVarM9396a = m9396a(bjsVarM9392f);
        long jMo9681a = this.f8229h.mo9681a();
        if (bilVarM9396a != null) {
            bil bilVar2 = new bil(bilVarM9396a.f8217a, bilVarM9396a.f8218b, jMo9681a, bilVarM9396a.f8220d, bilVarM9396a.f8221e);
            bilVar = new bil(bilVar2.f8217a, bilVar2.f8218b, bilVar2.f8219c, bilVar2.f8220d, z);
        } else {
            long j = this.f8230i;
            this.f8230i = 1 + j;
            bilVar = new bil(j, bjsVarM9392f, jMo9681a, false, z);
        }
        m9390b(bilVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m9390b(bil bilVar) {
        m9386a(bilVar);
        this.f8227f.mo8846a(bilVar);
    }

    /* JADX INFO: renamed from: e */
    private final boolean m9391e(bfa bfaVar) {
        return this.f8226e.m9408a(bfaVar, f8222a) != null;
    }

    /* JADX INFO: renamed from: f */
    private static bjs m9392f(bjs bjsVar) {
        return bjsVar.m9486e() ? bjs.m9481a(bjsVar.m9482a()) : bjsVar;
    }

    /* JADX INFO: renamed from: f */
    private final Set<Long> m9393f(bfa bfaVar) {
        HashSet hashSet = new HashSet();
        Map<bjp, bil> mapM9422e = this.f8226e.m9422e(bfaVar);
        if (mapM9422e != null) {
            for (bil bilVar : mapM9422e.values()) {
                if (!bilVar.f8218b.m9486e()) {
                    hashSet.add(Long.valueOf(bilVar.f8217a));
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final long m9394a() {
        return m9385a(f8224c).size();
    }

    /* JADX INFO: renamed from: a */
    public final bih m9395a(bhz bhzVar) {
        List<bil> listM9385a = m9385a(f8224c);
        long size = listM9385a.size() - Math.min((long) Math.floor((1.0f - bhzVar.mo9356a()) * r0), bhzVar.mo9359b());
        bih bihVar = new bih();
        if (this.f8228g.m9541a()) {
            this.f8228g.m9540a(new StringBuilder(80).append("Pruning old queries.  Prunable: ").append(listM9385a.size()).append(" Count to prune: ").append(size).toString(), null, new Object[0]);
        }
        Collections.sort(listM9385a, new bis(this));
        for (int i = 0; i < size; i++) {
            bil bilVar = listM9385a.get(i);
            bihVar = bihVar.m9382c(bilVar.f8218b.m9482a());
            bjs bjsVarM9392f = m9392f(bilVar.f8218b);
            this.f8227f.mo8848b(m9396a(bjsVarM9392f).f8217a);
            Map<bjp, bil> mapM9422e = this.f8226e.m9422e(bjsVarM9392f.m9482a());
            mapM9422e.remove(bjsVarM9392f.m9483b());
            if (mapM9422e.isEmpty()) {
                this.f8226e = this.f8226e.m9420d(bjsVarM9392f.m9482a());
            }
        }
        int i2 = (int) size;
        bih bihVarM9383d = bihVar;
        while (true) {
            int i3 = i2;
            if (i3 >= listM9385a.size()) {
                break;
            }
            bihVarM9383d = bihVarM9383d.m9383d(listM9385a.get(i3).f8218b.m9482a());
            i2 = i3 + 1;
        }
        List<bil> listM9385a2 = m9385a(f8225d);
        if (this.f8228g.m9541a()) {
            this.f8228g.m9540a(new StringBuilder(31).append("Unprunable queries: ").append(listM9385a2.size()).toString(), null, new Object[0]);
        }
        Iterator<bil> it = listM9385a2.iterator();
        while (it.hasNext()) {
            bihVarM9383d = bihVarM9383d.m9383d(it.next().f8218b.m9482a());
        }
        return bihVarM9383d;
    }

    /* JADX INFO: renamed from: a */
    public final bil m9396a(bjs bjsVar) {
        bjs bjsVarM9392f = m9392f(bjsVar);
        Map<bjp, bil> mapM9422e = this.f8226e.m9422e(bjsVarM9392f.m9482a());
        if (mapM9422e != null) {
            return mapM9422e.get(bjsVarM9392f.m9483b());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9397a(bfa bfaVar) {
        this.f8226e.m9419c(bfaVar).m9413a(new bir(this));
    }

    /* JADX INFO: renamed from: b */
    public final Set<bkp> m9398b(bfa bfaVar) {
        HashSet hashSet = new HashSet();
        Set<Long> setM9393f = m9393f(bfaVar);
        if (!setM9393f.isEmpty()) {
            hashSet.addAll(this.f8227f.mo8837a(setM9393f));
        }
        for (Map.Entry<bkp, bit<Map<bjp, bil>>> entry : this.f8226e.m9419c(bfaVar).m9418c()) {
            bkp key = entry.getKey();
            bit<Map<bjp, bil>> value = entry.getValue();
            if (value.m9415b() != null && f8222a.mo9333a(value.m9415b())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m9399b(bjs bjsVar) {
        m9388a(bjsVar, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m9400c(bfa bfaVar) {
        bil bilVarM9384a;
        if (m9391e(bfaVar)) {
            return;
        }
        bjs bjsVarM9481a = bjs.m9481a(bfaVar);
        bil bilVarM9396a = m9396a(bjsVarM9481a);
        if (bilVarM9396a == null) {
            long j = this.f8230i;
            this.f8230i = 1 + j;
            bilVarM9384a = new bil(j, bjsVarM9481a, this.f8229h.mo9681a(), true, false);
        } else {
            bilVarM9384a = bilVarM9396a.m9384a();
        }
        m9390b(bilVarM9384a);
    }

    /* JADX INFO: renamed from: c */
    public final void m9401c(bjs bjsVar) {
        m9388a(bjsVar, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m9402d(bjs bjsVar) {
        bil bilVarM9396a = m9396a(m9392f(bjsVar));
        if (bilVarM9396a == null || bilVarM9396a.f8220d) {
            return;
        }
        m9390b(bilVarM9396a.m9384a());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9403d(bfa bfaVar) {
        return this.f8226e.m9417b(bfaVar, f8223b) != null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9404e(bjs bjsVar) {
        if (m9391e(bjsVar.m9482a())) {
            return true;
        }
        if (bjsVar.m9486e()) {
            return false;
        }
        Map<bjp, bil> mapM9422e = this.f8226e.m9422e(bjsVar.m9482a());
        return mapM9422e != null && mapM9422e.containsKey(bjsVar.m9483b()) && mapM9422e.get(bjsVar.m9483b()).f8220d;
    }
}
