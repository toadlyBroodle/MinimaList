package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bhm {

    /* JADX INFO: renamed from: d */
    private static final bix<bhj> f8169d = new bho();

    /* JADX INFO: renamed from: a */
    private beo f8170a = beo.m9094a();

    /* JADX INFO: renamed from: b */
    private List<bhj> f8171b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private Long f8172c = -1L;

    /* JADX INFO: renamed from: a */
    private static beo m9321a(List<bhj> list, bix<bhj> bixVar, bfa bfaVar) {
        beo beoVarM9094a = beo.m9094a();
        Iterator<bhj> it = list.iterator();
        while (true) {
            beo beoVarM9100a = beoVarM9094a;
            if (!it.hasNext()) {
                return beoVarM9100a;
            }
            bhj next = it.next();
            if (bixVar.mo9333a(next)) {
                bfa bfaVarM9309b = next.m9309b();
                if (next.m9312e()) {
                    if (bfaVar.m9155b(bfaVarM9309b)) {
                        beoVarM9094a = beoVarM9100a.m9100a(bfa.m9148a(bfaVar, bfaVarM9309b), next.m9310c());
                    } else if (bfaVarM9309b.m9155b(bfaVar)) {
                        beoVarM9094a = beoVarM9100a.m9100a(bfa.m9147a(), next.m9310c().mo9560a(bfa.m9148a(bfaVarM9309b, bfaVar)));
                    }
                } else if (bfaVar.m9155b(bfaVarM9309b)) {
                    beoVarM9094a = beoVarM9100a.m9099a(bfa.m9148a(bfaVar, bfaVarM9309b), next.m9311d());
                } else if (bfaVarM9309b.m9155b(bfaVar)) {
                    bfa bfaVarM9148a = bfa.m9148a(bfaVarM9309b, bfaVar);
                    if (bfaVarM9148a.m9162h()) {
                        beoVarM9094a = beoVarM9100a.m9099a(bfa.m9147a(), next.m9311d());
                    } else {
                        bln blnVarM9106c = next.m9311d().m9106c(bfaVarM9148a);
                        if (blnVarM9106c != null) {
                            beoVarM9100a = beoVarM9100a.m9100a(bfa.m9147a(), blnVarM9106c);
                        }
                    }
                }
            }
            beoVarM9094a = beoVarM9100a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final bhj m9322a(long j) {
        for (bhj bhjVar : this.f8171b) {
            if (bhjVar.m9308a() == j) {
                return bhjVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final bhp m9323a(bfa bfaVar) {
        return new bhp(bfaVar, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final blm m9324a(bfa bfaVar, bln blnVar, blm blmVar, boolean z, ble bleVar) {
        blm blmVar2 = null;
        beo beoVarM9108d = this.f8170a.m9108d(bfaVar);
        bln blnVarM9106c = beoVarM9108d.m9106c(bfa.m9147a());
        if (blnVarM9106c != null) {
            while (r2.hasNext()) {
            }
        } else if (blnVar != null) {
            blnVarM9106c = beoVarM9108d.m9102a(blnVar);
            for (blm blmVar3 : blnVarM9106c) {
                if (bleVar.m9606a(blmVar3, blmVar, z) <= 0 || (blmVar2 != null && bleVar.m9606a(blmVar3, blmVar2, z) >= 0)) {
                    blmVar3 = blmVar2;
                }
                blmVar2 = blmVar3;
            }
        }
        return blmVar2;
    }

    /* JADX INFO: renamed from: a */
    public final bln m9325a(bfa bfaVar, bfa bfaVar2, bln blnVar, bln blnVar2) {
        bfa bfaVarM9152a = bfaVar.m9152a(bfaVar2);
        if (this.f8170a.m9105b(bfaVarM9152a)) {
            return null;
        }
        beo beoVarM9108d = this.f8170a.m9108d(bfaVarM9152a);
        return beoVarM9108d.m9110e() ? blnVar2.mo9560a(bfaVar2) : beoVarM9108d.m9102a(blnVar2.mo9560a(bfaVar2));
    }

    /* JADX INFO: renamed from: a */
    public final bln m9326a(bfa bfaVar, bkp bkpVar, bje bjeVar) {
        bfa bfaVarM9153a = bfaVar.m9153a(bkpVar);
        bln blnVarM9106c = this.f8170a.m9106c(bfaVarM9153a);
        if (blnVarM9106c != null) {
            return blnVarM9106c;
        }
        if (bjeVar.m9438a(bkpVar)) {
            return this.f8170a.m9108d(bfaVarM9153a).m9102a(bjeVar.m9440c().mo9570c(bkpVar));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final bln m9327a(bfa bfaVar, bln blnVar) {
        bln blnVarMo9562a;
        bln blnVarM9605j = bld.m9605j();
        bln blnVarM9106c = this.f8170a.m9106c(bfaVar);
        if (blnVarM9106c == null) {
            beo beoVarM9108d = this.f8170a.m9108d(bfaVar);
            Iterator<blm> it = blnVar.iterator();
            while (true) {
                blnVarMo9562a = blnVarM9605j;
                if (!it.hasNext()) {
                    break;
                }
                blm next = it.next();
                blnVarM9605j = blnVarMo9562a.mo9562a(next.m9626c(), beoVarM9108d.m9108d(new bfa(next.m9626c())).m9102a(next.m9627d()));
            }
            for (blm blmVar : beoVarM9108d.m9107c()) {
                blnVarMo9562a = blnVarMo9562a.mo9562a(blmVar.m9626c(), blmVar.m9627d());
            }
            return blnVarMo9562a;
        }
        if (blnVarM9106c.mo9572e()) {
            return blnVarM9605j;
        }
        Iterator<blm> it2 = blnVarM9106c.iterator();
        while (true) {
            bln blnVar2 = blnVarM9605j;
            if (!it2.hasNext()) {
                return blnVar2;
            }
            blm next2 = it2.next();
            blnVarM9605j = blnVar2.mo9562a(next2.m9626c(), next2.m9627d());
        }
    }

    /* JADX INFO: renamed from: a */
    public final bln m9328a(bfa bfaVar, bln blnVar, List<Long> list, boolean z) {
        if (list.isEmpty() && !z) {
            bln blnVarM9106c = this.f8170a.m9106c(bfaVar);
            if (blnVarM9106c != null) {
                return blnVarM9106c;
            }
            beo beoVarM9108d = this.f8170a.m9108d(bfaVar);
            if (beoVarM9108d.m9110e()) {
                return blnVar;
            }
            if (blnVar == null && !beoVarM9108d.m9105b(bfa.m9147a())) {
                return null;
            }
            if (blnVar == null) {
                blnVar = bld.m9605j();
            }
            return beoVarM9108d.m9102a(blnVar);
        }
        beo beoVarM9108d2 = this.f8170a.m9108d(bfaVar);
        if (!z && beoVarM9108d2.m9110e()) {
            return blnVar;
        }
        if (!z && blnVar == null && !beoVarM9108d2.m9105b(bfa.m9147a())) {
            return null;
        }
        beo beoVarM9321a = m9321a(this.f8171b, new bhn(this, z, list, bfaVar), bfaVar);
        if (blnVar == null) {
            blnVar = bld.m9605j();
        }
        return beoVarM9321a.m9102a(blnVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m9329a(bfa bfaVar, beo beoVar, Long l) {
        this.f8171b.add(new bhj(l.longValue(), bfaVar, beoVar));
        this.f8170a = this.f8170a.m9099a(bfaVar, beoVar);
        this.f8172c = l;
    }

    /* JADX INFO: renamed from: a */
    public final void m9330a(bfa bfaVar, bln blnVar, Long l, boolean z) {
        this.f8171b.add(new bhj(l.longValue(), bfaVar, blnVar, z));
        if (z) {
            this.f8170a = this.f8170a.m9100a(bfaVar, blnVar);
        }
        this.f8172c = l;
    }

    /* JADX INFO: renamed from: b */
    public final bln m9331b(bfa bfaVar) {
        return this.f8170a.m9106c(bfaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9332b(long j) {
        bhj bhjVar;
        boolean z;
        boolean z2;
        boolean zM9155b;
        Iterator<bhj> it = this.f8171b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                bhjVar = null;
                break;
            }
            bhj next = it.next();
            if (next.m9308a() == j) {
                bhjVar = next;
                break;
            }
            i++;
        }
        this.f8171b.remove(bhjVar);
        boolean zM9313f = bhjVar.m9313f();
        int size = this.f8171b.size() - 1;
        boolean z3 = false;
        while (zM9313f && size >= 0) {
            bhj bhjVar2 = this.f8171b.get(size);
            if (!bhjVar2.m9313f()) {
                z = z3;
                z2 = zM9313f;
            } else if (size >= i) {
                bfa bfaVarM9309b = bhjVar.m9309b();
                if (!bhjVar2.m9312e()) {
                    Iterator<Map.Entry<bfa, bln>> it2 = bhjVar2.m9311d().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            zM9155b = false;
                            break;
                        }
                        if (bhjVar2.m9309b().m9152a(it2.next().getKey()).m9155b(bfaVarM9309b)) {
                            zM9155b = true;
                            break;
                        }
                    }
                } else {
                    zM9155b = bhjVar2.m9309b().m9155b(bfaVarM9309b);
                }
                if (zM9155b) {
                    z = z3;
                    z2 = false;
                } else if (bhjVar.m9309b().m9155b(bhjVar2.m9309b())) {
                    z = true;
                    z2 = zM9313f;
                }
            }
            size--;
            zM9313f = z2;
            z3 = z;
        }
        if (!zM9313f) {
            return false;
        }
        if (z3) {
            this.f8170a = m9321a(this.f8171b, f8169d, bfa.m9147a());
            if (this.f8171b.size() > 0) {
                this.f8172c = Long.valueOf(this.f8171b.get(this.f8171b.size() - 1).m9308a());
                return true;
            }
            this.f8172c = -1L;
            return true;
        }
        if (bhjVar.m9312e()) {
            this.f8170a = this.f8170a.m9098a(bhjVar.m9309b());
            return true;
        }
        Iterator<Map.Entry<bfa, bln>> it3 = bhjVar.m9311d().iterator();
        while (it3.hasNext()) {
            this.f8170a = this.f8170a.m9098a(bhjVar.m9309b().m9152a(it3.next().getKey()));
        }
        return true;
    }
}
