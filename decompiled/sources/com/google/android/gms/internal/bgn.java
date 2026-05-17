package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bgn {

    /* JADX INFO: renamed from: a */
    private final Map<bjp, bjt> f8091a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final bie f8092b;

    public bgn(bie bieVar) {
        this.f8092b = bieVar;
    }

    /* JADX INFO: renamed from: a */
    private final List<bji> m9245a(bjt bjtVar, bhu bhuVar, bhp bhpVar, bln blnVar) {
        bju bjuVarM9489a = bjtVar.m9489a(bhuVar, bhpVar, blnVar);
        if (!bjtVar.m9488a().m9486e()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (bjg bjgVar : bjuVarM9489a.f8295b) {
                bjk bjkVarM9453b = bjgVar.m9453b();
                if (bjkVarM9453b == bjk.CHILD_ADDED) {
                    hashSet2.add(bjgVar.m9452a());
                } else if (bjkVarM9453b == bjk.CHILD_REMOVED) {
                    hashSet.add(bjgVar.m9452a());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f8092b.mo9371a(bjtVar.m9488a(), hashSet2, hashSet);
            }
        }
        return bjuVarM9489a.f8294a;
    }

    /* JADX INFO: renamed from: a */
    public final bjt m9246a(bjs bjsVar) {
        return bjsVar.m9486e() ? m9255d() : this.f8091a.get(bjsVar.m9483b());
    }

    /* JADX INFO: renamed from: a */
    public final bln m9247a(bfa bfaVar) {
        for (bjt bjtVar : this.f8091a.values()) {
            if (bjtVar.m9490a(bfaVar) != null) {
                return bjtVar.m9490a(bfaVar);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final bnb<List<bjs>, List<bjj>> m9248a(bjs bjsVar, bex bexVar, C2226b c2226b) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zM9254c = m9254c();
        if (bjsVar.m9485d()) {
            Iterator<Map.Entry<bjp, bjt>> it = this.f8091a.entrySet().iterator();
            while (it.hasNext()) {
                bjt value = it.next().getValue();
                arrayList2.addAll(value.m9491a(bexVar, c2226b));
                if (value.m9496d()) {
                    it.remove();
                    if (!value.m9488a().m9486e()) {
                        arrayList.add(value.m9488a());
                    }
                }
            }
        } else {
            bjt bjtVar = this.f8091a.get(bjsVar.m9483b());
            if (bjtVar != null) {
                arrayList2.addAll(bjtVar.m9491a(bexVar, c2226b));
                if (bjtVar.m9496d()) {
                    this.f8091a.remove(bjsVar.m9483b());
                    if (!bjtVar.m9488a().m9486e()) {
                        arrayList.add(bjtVar.m9488a());
                    }
                }
            }
        }
        if (zM9254c && !m9254c()) {
            arrayList.add(bjs.m9481a(bjsVar.m9482a()));
        }
        return new bnb<>(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final List<bji> m9249a(bex bexVar, bhp bhpVar, bje bjeVar) {
        boolean z;
        bjs bjsVarMo9132a = bexVar.mo9132a();
        bjt bjtVar = this.f8091a.get(bjsVarMo9132a.m9483b());
        if (bjtVar == null) {
            bln blnVarM9339a = bhpVar.m9339a(bjeVar.m9436a() ? bjeVar.m9440c() : null);
            if (blnVarM9339a != null) {
                z = true;
            } else {
                blnVarM9339a = bhpVar.m9340b(bjeVar.m9440c());
                z = false;
            }
            bjt bjtVar2 = new bjt(bjsVarMo9132a, new bjv(new bje(blf.m9612a(blnVarM9339a, bjsVarMo9132a.m9484c()), z, false), bjeVar));
            if (!bjsVarMo9132a.m9486e()) {
                HashSet hashSet = new HashSet();
                Iterator<blm> it = bjtVar2.m9495c().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().m9626c());
                }
                this.f8092b.mo9370a(bjsVarMo9132a, hashSet);
            }
            this.f8091a.put(bjsVarMo9132a.m9483b(), bjtVar2);
            bjtVar = bjtVar2;
        }
        bjtVar.m9492a(bexVar);
        return bjtVar.m9494b(bexVar);
    }

    /* JADX INFO: renamed from: a */
    public final List<bji> m9250a(bhu bhuVar, bhp bhpVar, bln blnVar) {
        bjp bjpVarM9354c = bhuVar.m9349d().m9354c();
        if (bjpVarM9354c != null) {
            return m9245a(this.f8091a.get(bjpVarM9354c), bhuVar, bhpVar, blnVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<bjp, bjt>> it = this.f8091a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(m9245a(it.next().getValue(), bhuVar, bhpVar, blnVar));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9251a() {
        return this.f8091a.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final List<bjt> m9252b() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<bjp, bjt>> it = this.f8091a.entrySet().iterator();
        while (it.hasNext()) {
            bjt value = it.next().getValue();
            if (!value.m9488a().m9486e()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9253b(bjs bjsVar) {
        return m9246a(bjsVar) != null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9254c() {
        return m9255d() != null;
    }

    /* JADX INFO: renamed from: d */
    public final bjt m9255d() {
        Iterator<Map.Entry<bjp, bjt>> it = this.f8091a.entrySet().iterator();
        while (it.hasNext()) {
            bjt value = it.next().getValue();
            if (value.m9488a().m9486e()) {
                return value;
            }
        }
        return null;
    }
}
