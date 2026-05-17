package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bgo {

    /* JADX INFO: renamed from: f */
    private final bhe f8098f;

    /* JADX INFO: renamed from: g */
    private final bie f8099g;

    /* JADX INFO: renamed from: h */
    private final bkl f8100h;

    /* JADX INFO: renamed from: i */
    private long f8101i = 1;

    /* JADX INFO: renamed from: a */
    private bit<bgn> f8093a = bit.m9405a();

    /* JADX INFO: renamed from: b */
    private final bhm f8094b = new bhm();

    /* JADX INFO: renamed from: c */
    private final Map<bhg, bjs> f8095c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Map<bjs, bhg> f8096d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Set<bjs> f8097e = new HashSet();

    public bgo(bet betVar, bie bieVar, bhe bheVar) {
        this.f8098f = bheVar;
        this.f8099g = bieVar;
        this.f8100h = betVar.m9117a("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final bhg m9256a() {
        long j = this.f8101i;
        this.f8101i = 1 + j;
        return new bhg(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static bjs m9260a(bjs bjsVar) {
        return (!bjsVar.m9486e() || bjsVar.m9485d()) ? bjsVar : bjs.m9481a(bjsVar.m9482a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final List<bjj> m9265a(bhu bhuVar) {
        return m9266a(bhuVar, this.f8093a, (bln) null, this.f8094b.m9323a(bfa.m9147a()));
    }

    /* JADX INFO: renamed from: a */
    private final List<bjj> m9266a(bhu bhuVar, bit<bgn> bitVar, bln blnVar, bhp bhpVar) {
        if (bhuVar.m9348c().m9162h()) {
            return m9280b(bhuVar, bitVar, blnVar, bhpVar);
        }
        bgn bgnVarM9415b = bitVar.m9415b();
        if (blnVar == null && bgnVarM9415b != null) {
            blnVar = bgnVarM9415b.m9247a(bfa.m9147a());
        }
        ArrayList arrayList = new ArrayList();
        bkp bkpVarM9158d = bhuVar.m9348c().m9158d();
        bhu bhuVarMo9344a = bhuVar.mo9344a(bkpVarM9158d);
        bit<bgn> bitVarMo8872b = bitVar.m9418c().mo8872b(bkpVarM9158d);
        if (bitVarMo8872b != null && bhuVarMo9344a != null) {
            arrayList.addAll(m9266a(bhuVarMo9344a, bitVarMo8872b, blnVar != null ? blnVar.mo9570c(bkpVarM9158d) : null, bhpVar.m9334a(bkpVarM9158d)));
        }
        if (bgnVarM9415b != null) {
            arrayList.addAll(bgnVarM9415b.m9250a(bhuVar, bhpVar, blnVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final List<bjt> m9267a(bit<bgn> bitVar) {
        ArrayList arrayList = new ArrayList();
        m9272a(bitVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private final List<bjj> m9268a(bjs bjsVar, bex bexVar, C2226b c2226b) {
        return (List) this.f8099g.mo9362a(new bgs(this, bjsVar, bexVar, c2226b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9269a(bjs bjsVar, bhu bhuVar) {
        bfa bfaVarM9482a = bjsVar.m9482a();
        return this.f8093a.m9422e(bfaVarM9482a).m9250a(bhuVar, this.f8094b.m9323a(bfaVarM9482a), (bln) null);
    }

    /* JADX INFO: renamed from: a */
    private final void m9272a(bit<bgn> bitVar, List<bjt> list) {
        bgn bgnVarM9415b = bitVar.m9415b();
        if (bgnVarM9415b != null && bgnVarM9415b.m9254c()) {
            list.add(bgnVarM9415b.m9255d());
            return;
        }
        if (bgnVarM9415b != null) {
            list.addAll(bgnVarM9415b.m9252b());
        }
        Iterator<Map.Entry<bkp, bit<bgn>>> it = bitVar.m9418c().iterator();
        while (it.hasNext()) {
            m9272a(it.next().getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9273a(bjs bjsVar, bjt bjtVar) {
        bfa bfaVarM9482a = bjsVar.m9482a();
        bhg bhgVarM9275b = m9275b(bjsVar);
        bhd bhdVar = new bhd(this, bjtVar);
        this.f8098f.mo9212a(m9260a(bjsVar), bhgVarM9275b, bhdVar, bhdVar);
        bit<bgn> bitVarM9419c = this.f8093a.m9419c(bfaVarM9482a);
        if (bhgVarM9275b == null) {
            bitVarM9419c.m9413a(new bgt(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9274a(List<bjs> list) {
        for (bjs bjsVar : list) {
            if (!bjsVar.m9486e()) {
                bhg bhgVarM9275b = m9275b(bjsVar);
                this.f8096d.remove(bjsVar);
                this.f8095c.remove(bhgVarM9275b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final bhg m9275b(bjs bjsVar) {
        return this.f8096d.get(bjsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final bjs m9278b(bhg bhgVar) {
        return this.f8095c.get(bhgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final List<bjj> m9280b(bhu bhuVar, bit<bgn> bitVar, bln blnVar, bhp bhpVar) {
        bgn bgnVarM9415b = bitVar.m9415b();
        bln blnVarM9247a = (blnVar != null || bgnVarM9415b == null) ? blnVar : bgnVarM9415b.m9247a(bfa.m9147a());
        ArrayList arrayList = new ArrayList();
        bitVar.m9418c().mo8869a(new bgu(this, blnVarM9247a, bhpVar, bhuVar, arrayList));
        if (bgnVarM9415b != null) {
            arrayList.addAll(bgnVarM9415b.m9250a(bhuVar, bhpVar, blnVarM9247a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9287a(long j, boolean z, boolean z2, bmt bmtVar) {
        return (List) this.f8099g.mo9362a(new bgw(this, z2, j, z, bmtVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9288a(bex bexVar) {
        return (List) this.f8099g.mo9362a(new bgr(this, bexVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9289a(bfa bfaVar) {
        return (List) this.f8099g.mo9362a(new bgz(this, bfaVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9290a(bfa bfaVar, beo beoVar, beo beoVar2, long j, boolean z) {
        return (List) this.f8099g.mo9362a(new bgv(this, z, bfaVar, beoVar, j, beoVar2));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9291a(bfa bfaVar, bln blnVar) {
        return (List) this.f8099g.mo9362a(new bgx(this, bfaVar, blnVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9292a(bfa bfaVar, bln blnVar, bhg bhgVar) {
        return (List) this.f8099g.mo9362a(new bhb(this, bhgVar, bfaVar, blnVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9293a(bfa bfaVar, bln blnVar, bln blnVar2, long j, boolean z, boolean z2) {
        bne.m9697a(z || !z2, "We shouldn't be persisting non-visible writes.");
        return (List) this.f8099g.mo9362a(new bgp(this, z2, bfaVar, blnVar, j, blnVar2, z));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9294a(bfa bfaVar, List<blu> list) {
        bjt bjtVarM9255d;
        bgn bgnVarM9422e = this.f8093a.m9422e(bfaVar);
        if (bgnVarM9422e != null && (bjtVarM9255d = bgnVarM9422e.m9255d()) != null) {
            bln blnVarM9493b = bjtVarM9255d.m9493b();
            Iterator<blu> it = list.iterator();
            while (true) {
                bln blnVar = blnVarM9493b;
                if (!it.hasNext()) {
                    return m9291a(bfaVar, blnVar);
                }
                blnVarM9493b = it.next().m9633a(blnVar);
            }
        }
        return Collections.emptyList();
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9295a(bfa bfaVar, List<blu> list, bhg bhgVar) {
        bjs bjsVarM9278b = m9278b(bhgVar);
        if (bjsVarM9278b == null) {
            return Collections.emptyList();
        }
        bln blnVarM9493b = this.f8093a.m9422e(bjsVarM9278b.m9482a()).m9246a(bjsVarM9278b).m9493b();
        Iterator<blu> it = list.iterator();
        while (true) {
            bln blnVar = blnVarM9493b;
            if (!it.hasNext()) {
                return m9292a(bfaVar, blnVar, bhgVar);
            }
            blnVarM9493b = it.next().m9633a(blnVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9296a(bfa bfaVar, Map<bfa, bln> map) {
        return (List) this.f8099g.mo9362a(new bgy(this, map, bfaVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9297a(bfa bfaVar, Map<bfa, bln> map, bhg bhgVar) {
        return (List) this.f8099g.mo9362a(new bgq(this, bhgVar, bfaVar, map));
    }

    /* JADX INFO: renamed from: a */
    public final List<? extends bjj> m9298a(bhg bhgVar) {
        return (List) this.f8099g.mo9362a(new bha(this, bhgVar));
    }

    /* JADX INFO: renamed from: a */
    public final List<bjj> m9299a(bjs bjsVar, C2226b c2226b) {
        return m9268a(bjsVar, (bex) null, c2226b);
    }

    /* JADX INFO: renamed from: b */
    public final bln m9300b(bfa bfaVar, List<Long> list) {
        bln blnVarM9247a;
        bit<bgn> bitVar = this.f8093a;
        bitVar.m9415b();
        bln blnVar = null;
        bfa bfaVarM9147a = bfa.m9147a();
        bit<bgn> bitVarM9411a = bitVar;
        bfa bfaVar2 = bfaVar;
        while (true) {
            bkp bkpVarM9158d = bfaVar2.m9158d();
            bfa bfaVarM9159e = bfaVar2.m9159e();
            bfa bfaVarM9153a = bfaVarM9147a.m9153a(bkpVarM9158d);
            bfa bfaVarM9148a = bfa.m9148a(bfaVarM9153a, bfaVar);
            bitVarM9411a = bkpVarM9158d != null ? bitVarM9411a.m9411a(bkpVarM9158d) : bit.m9405a();
            bgn bgnVarM9415b = bitVarM9411a.m9415b();
            blnVarM9247a = bgnVarM9415b != null ? bgnVarM9415b.m9247a(bfaVarM9148a) : blnVar;
            if (bfaVarM9159e.m9162h() || blnVarM9247a != null) {
                break;
            }
            blnVar = blnVarM9247a;
            bfaVarM9147a = bfaVarM9153a;
            bfaVar2 = bfaVarM9159e;
        }
        return this.f8094b.m9328a(bfaVar, blnVarM9247a, list, true);
    }

    /* JADX INFO: renamed from: b */
    public final List<bjj> m9301b(bex bexVar) {
        return m9268a(bexVar.mo9132a(), bexVar, (C2226b) null);
    }
}
