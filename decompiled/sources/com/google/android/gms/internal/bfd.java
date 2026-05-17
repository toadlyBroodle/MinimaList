package com.google.android.gms.internal;

import com.google.firebase.database.C2225a;
import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2266d;
import com.google.firebase.database.C2268f;
import com.google.firebase.database.C2275m;
import com.google.firebase.database.C2278p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bfd implements bde {

    /* JADX INFO: renamed from: a */
    private final bgb f7992a;

    /* JADX INFO: renamed from: c */
    private bdd f7994c;

    /* JADX INFO: renamed from: d */
    private bgi f7995d;

    /* JADX INFO: renamed from: e */
    private bgj f7996e;

    /* JADX INFO: renamed from: f */
    private biz<List<bfz>> f7997f;

    /* JADX INFO: renamed from: h */
    private final bjn f7999h;

    /* JADX INFO: renamed from: i */
    private final bet f8000i;

    /* JADX INFO: renamed from: j */
    private final bkl f8001j;

    /* JADX INFO: renamed from: k */
    private final bkl f8002k;

    /* JADX INFO: renamed from: l */
    private final bkl f8003l;

    /* JADX INFO: renamed from: o */
    private bgo f8006o;

    /* JADX INFO: renamed from: p */
    private bgo f8007p;

    /* JADX INFO: renamed from: q */
    private C2268f f8008q;

    /* JADX INFO: renamed from: b */
    private final bna f7993b = new bna(new bmu(), 0);

    /* JADX INFO: renamed from: g */
    private boolean f7998g = false;

    /* JADX INFO: renamed from: m */
    private long f8004m = 0;

    /* JADX INFO: renamed from: n */
    private long f8005n = 1;

    /* JADX INFO: renamed from: r */
    private boolean f8009r = false;

    /* JADX INFO: renamed from: s */
    private long f8010s = 0;

    bfd(bgb bgbVar, bet betVar, C2268f c2268f) {
        this.f7992a = bgbVar;
        this.f8000i = betVar;
        this.f8008q = c2268f;
        this.f8001j = this.f8000i.m9117a("RepoOperation");
        this.f8002k = this.f8000i.m9117a("Transaction");
        this.f8003l = this.f8000i.m9117a("DataOperation");
        this.f7999h = new bjn(this.f8000i);
        m9203a(new bfe(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final bfa m9164a(bfa bfaVar) {
        C2226b c2226bM12964a;
        boolean z;
        C2275m.b bVarM13014a;
        biz<List<bfz>> bizVarM9184b = m9184b(bfaVar);
        bfa bfaVarM9431b = bizVarM9184b.m9431b();
        List<bfz> listM9190c = m9190c(bizVarM9184b);
        if (!listM9190c.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<Long> arrayList2 = new ArrayList<>();
            Iterator<bfz> it = listM9190c.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(it.next().f8062i));
            }
            for (bfz bfzVar : listM9190c) {
                bfa.m9148a(bfaVarM9431b, bfzVar.f8054a);
                ArrayList arrayList3 = new ArrayList();
                if (bfzVar.f8057d == bga.f8072f) {
                    z = true;
                    c2226bM12964a = bfzVar.f8061h;
                    if (c2226bM12964a.m12967a() != -25) {
                        arrayList3.addAll(this.f8007p.m9287a(bfzVar.f8062i, true, false, (bmt) this.f7993b));
                    }
                } else if (bfzVar.f8057d != bga.f8068b) {
                    c2226bM12964a = null;
                    z = false;
                } else if (bfzVar.f8060g >= 25) {
                    z = true;
                    c2226bM12964a = C2226b.m12964a("maxretries");
                    arrayList3.addAll(this.f8007p.m9287a(bfzVar.f8062i, true, false, (bmt) this.f7993b));
                } else {
                    bln blnVarM9168a = m9168a(bfzVar.f8054a, arrayList2);
                    bfzVar.f8063j = blnVarM9168a;
                    try {
                        bVarM13014a = bfzVar.f8055b.m13015a(C2278p.m13021a(blnVarM9168a));
                        c2226bM12964a = null;
                    } catch (Throwable th) {
                        C2226b c2226bM12966a = C2226b.m12966a(th);
                        bVarM13014a = C2275m.m13014a();
                        c2226bM12964a = c2226bM12966a;
                    }
                    if (bVarM13014a.m13017a()) {
                        Long lValueOf = Long.valueOf(bfzVar.f8062i);
                        Map<String, Object> mapM9237a = bge.m9237a(this.f7993b);
                        bln blnVarM13018b = bVarM13014a.m13018b();
                        bln blnVarM9236a = bge.m9236a(blnVarM13018b, mapM9237a);
                        bfzVar.f8064k = blnVarM13018b;
                        bfzVar.f8065l = blnVarM9236a;
                        bfzVar.f8062i = m9193e();
                        arrayList2.remove(lValueOf);
                        arrayList3.addAll(this.f8007p.m9293a(bfzVar.f8054a, blnVarM13018b, blnVarM9236a, bfzVar.f8062i, bfzVar.f8059f, false));
                        arrayList3.addAll(this.f8007p.m9287a(lValueOf.longValue(), true, false, (bmt) this.f7993b));
                        c2226bM12964a = null;
                        z = false;
                    } else {
                        z = true;
                        arrayList3.addAll(this.f8007p.m9287a(bfzVar.f8062i, true, false, (bmt) this.f7993b));
                    }
                }
                m9182a(arrayList3);
                if (z) {
                    bfzVar.f8057d = bga.f8070d;
                    C2225a c2225aM13019a = C2278p.m13019a(C2278p.m13020a(this, bfzVar.f8054a), blf.m9611a(bfzVar.f8063j));
                    m9203a(new bfk(this, bfzVar));
                    arrayList.add(new bfl(this, bfzVar, c2226bM12964a, c2225aM13019a));
                }
            }
            m9188b(this.f7997f);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    break;
                }
                m9205b((Runnable) arrayList.get(i2));
                i = i2 + 1;
            }
            m9196f();
        }
        return bfaVarM9431b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final bfa m9165a(bfa bfaVar, int i) {
        bfa bfaVarM9431b = m9184b(bfaVar).m9431b();
        if (this.f8002k.m9541a()) {
            bkl bklVar = this.f8001j;
            String strValueOf = String.valueOf(bfaVar);
            String strValueOf2 = String.valueOf(bfaVarM9431b);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 44 + String.valueOf(strValueOf2).length()).append("Aborting transactions for path: ").append(strValueOf).append(". Affected: ").append(strValueOf2).toString(), null, new Object[0]);
        }
        biz<List<bfz>> bizVarM9425a = this.f7997f.m9425a(bfaVar);
        bizVarM9425a.m9430a(new bfp(this, i), false);
        m9179a(bizVarM9425a, i);
        bizVarM9425a.m9428a(new bfq(this, i), false, false);
        return bfaVarM9431b;
    }

    /* JADX INFO: renamed from: a */
    private final bln m9168a(bfa bfaVar, List<Long> list) {
        bln blnVarM9300b = this.f8007p.m9300b(bfaVar, list);
        return blnVarM9300b == null ? bld.m9605j() : blnVarM9300b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9170a(long j, bfa bfaVar, C2226b c2226b) {
        if (c2226b == null || c2226b.m12967a() != -25) {
            List<? extends bjj> listM9287a = this.f8007p.m9287a(j, !(c2226b == null), true, (bmt) this.f7993b);
            if (listM9287a.size() > 0) {
                m9164a(bfaVar);
            }
            m9182a(listM9287a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9178a(biz<List<bfz>> bizVar) {
        Boolean bool;
        if (bizVar.m9426a() == null) {
            if (bizVar.m9432c()) {
                bizVar.m9427a(new bfg(this));
                return;
            }
            return;
        }
        List<bfz> listM9190c = m9190c(bizVar);
        Iterator<bfz> it = listM9190c.iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = true;
                break;
            } else if (it.next().f8057d != bga.f8068b) {
                bool = false;
                break;
            }
        }
        if (!bool.booleanValue()) {
            return;
        }
        bfa bfaVarM9431b = bizVar.m9431b();
        ArrayList arrayList = new ArrayList();
        Iterator<bfz> it2 = listM9190c.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().f8062i));
        }
        bln blnVarM9168a = m9168a(bfaVarM9431b, arrayList);
        String strMo9571d = blnVarM9168a.mo9571d();
        Iterator<bfz> it3 = listM9190c.iterator();
        while (true) {
            bln blnVar = blnVarM9168a;
            if (!it3.hasNext()) {
                this.f7994c.mo8962a(bfaVarM9431b.m9157c(), blnVar.mo9563a(true), strMo9571d, new bfh(this, bfaVarM9431b, listM9190c, this));
                return;
            } else {
                bfz next = it3.next();
                next.f8057d = bga.f8069c;
                bfz.m9222d(next);
                blnVarM9168a = blnVar.mo9561a(bfa.m9148a(bfaVarM9431b, next.f8054a), next.f8064k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9179a(biz<List<bfz>> bizVar, int i) {
        C2226b c2226bM12963a;
        int i2;
        List<bfz> listM9426a = bizVar.m9426a();
        ArrayList arrayList = new ArrayList();
        if (listM9426a != null) {
            ArrayList arrayList2 = new ArrayList();
            if (i == -9) {
                c2226bM12963a = C2226b.m12964a("overriddenBySet");
            } else {
                bne.m9697a(i == -25, new StringBuilder(45).append("Unknown transaction abort reason: ").append(i).toString());
                c2226bM12963a = C2226b.m12963a(-25);
            }
            int i3 = -1;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                i2 = i3;
                if (i5 >= listM9426a.size()) {
                    break;
                }
                bfz bfzVar = listM9426a.get(i5);
                if (bfzVar.f8057d == bga.f8071e) {
                    i3 = i2;
                } else if (bfzVar.f8057d == bga.f8069c) {
                    bfzVar.f8057d = bga.f8071e;
                    bfzVar.f8061h = c2226bM12963a;
                    i3 = i5;
                } else {
                    m9200a(new bhl(this, bfzVar.f8056c, bjs.m9481a(bfzVar.f8054a)));
                    if (i == -9) {
                        arrayList.addAll(this.f8007p.m9287a(bfzVar.f8062i, true, false, (bmt) this.f7993b));
                    } else {
                        bne.m9697a(i == -25, new StringBuilder(45).append("Unknown transaction abort reason: ").append(i).toString());
                    }
                    arrayList2.add(new bfr(this, bfzVar, c2226bM12963a));
                    i3 = i2;
                }
                i4 = i5 + 1;
            }
            if (i2 == -1) {
                bizVar.m9429a((List<bfz>) null);
            } else {
                bizVar.m9429a(listM9426a.subList(0, i2 + 1));
            }
            m9182a(arrayList);
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList3.get(i6);
                i6++;
                m9205b((Runnable) obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m9180a(bkp bkpVar, Object obj) {
        if (bkpVar.equals(bes.f7960b)) {
            this.f7993b.m9686a(((Long) obj).longValue());
        }
        bfa bfaVar = new bfa(bes.f7959a, bkpVar);
        try {
            bln blnVarM9628a = blq.m9628a(obj, bld.m9605j());
            this.f7995d.m9241a(bfaVar, blnVarM9628a);
            m9182a(this.f8006o.m9291a(bfaVar, blnVarM9628a));
        } catch (C2227c e) {
            this.f8001j.m9539a("Failed to parse info update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9181a(String str, bfa bfaVar, C2226b c2226b) {
        if (c2226b == null || c2226b.m12967a() == -1 || c2226b.m12967a() == -25) {
            return;
        }
        bkl bklVar = this.f8001j;
        String string = bfaVar.toString();
        String string2 = c2226b.toString();
        bklVar.m9542b(new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(string).length() + String.valueOf(string2).length()).append(str).append(" at ").append(string).append(" failed: ").append(string2).toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9182a(List<? extends bjj> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f7999h.m9462a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9183a(List<bfz> list, biz<List<bfz>> bizVar) {
        List<bfz> listM9426a = bizVar.m9426a();
        if (listM9426a != null) {
            list.addAll(listM9426a);
        }
        bizVar.m9427a(new bfo(this, list));
    }

    /* JADX INFO: renamed from: b */
    private final biz<List<bfz>> m9184b(bfa bfaVar) {
        biz<List<bfz>> bizVarM9425a = this.f7997f;
        while (!bfaVar.m9162h() && bizVarM9425a.m9426a() == null) {
            bizVarM9425a = bizVarM9425a.m9425a(new bfa(bfaVar.m9158d()));
            bfaVar = bfaVar.m9159e();
        }
        return bizVarM9425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static C2226b m9186b(String str, String str2) {
        if (str != null) {
            return C2226b.m12965a(str, str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m9188b(biz<List<bfz>> bizVar) {
        List<bfz> listM9426a = bizVar.m9426a();
        if (listM9426a != null) {
            int i = 0;
            while (i < listM9426a.size()) {
                if (listM9426a.get(i).f8057d == bga.f8070d) {
                    listM9426a.remove(i);
                } else {
                    i++;
                }
            }
            if (listM9426a.size() > 0) {
                bizVar.m9429a(listM9426a);
            } else {
                bizVar.m9429a((List<bfz>) null);
            }
        }
        bizVar.m9427a(new bfj(this));
    }

    /* JADX INFO: renamed from: c */
    private final List<bfz> m9190c(biz<List<bfz>> bizVar) {
        ArrayList arrayList = new ArrayList();
        m9183a(arrayList, bizVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m9192d() {
        this.f7994c = this.f8000i.m9116a(new bdb(this.f7992a.f8074a, this.f7992a.f8076c, this.f7992a.f8075b), this);
        this.f8000i.f7964b.mo8801a(new bfn(this));
        this.f7994c.mo8959a();
        bie bieVarM9119b = this.f8000i.m9119b(this.f7992a.f8074a);
        this.f7995d = new bgi();
        this.f7996e = new bgj();
        this.f7997f = new biz<>();
        this.f8006o = new bgo(this.f8000i, new bid(), new bfs(this));
        this.f8007p = new bgo(this.f8000i, bieVarM9119b, new bfu(this));
        List<bhj> listMo9363a = bieVarM9119b.mo9363a();
        Map<String, Object> mapM9237a = bge.m9237a(this.f7993b);
        long j = Long.MIN_VALUE;
        for (bhj bhjVar : listMo9363a) {
            bfw bfwVar = new bfw(this, bhjVar);
            if (j >= bhjVar.m9308a()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long jM9308a = bhjVar.m9308a();
            this.f8005n = bhjVar.m9308a() + 1;
            if (bhjVar.m9312e()) {
                if (this.f8001j.m9541a()) {
                    this.f8001j.m9540a(new StringBuilder(48).append("Restoring overwrite with id ").append(bhjVar.m9308a()).toString(), null, new Object[0]);
                }
                this.f7994c.mo8961a(bhjVar.m9309b().m9157c(), bhjVar.m9310c().mo9563a(true), bfwVar);
                this.f8007p.m9293a(bhjVar.m9309b(), bhjVar.m9310c(), bge.m9236a(bhjVar.m9310c(), mapM9237a), bhjVar.m9308a(), true, false);
                j = jM9308a;
            } else {
                if (this.f8001j.m9541a()) {
                    this.f8001j.m9540a(new StringBuilder(44).append("Restoring merge with id ").append(bhjVar.m9308a()).toString(), null, new Object[0]);
                }
                this.f7994c.mo8965a(bhjVar.m9309b().m9157c(), bhjVar.m9311d().m9103a(true), (bdw) bfwVar);
                this.f8007p.m9290a(bhjVar.m9309b(), bhjVar.m9311d(), bge.m9235a(bhjVar.m9311d(), mapM9237a), bhjVar.m9308a(), false);
                j = jM9308a;
            }
        }
        m9180a(bes.f7961c, (Object) false);
        m9180a(bes.f7962d, (Object) false);
    }

    /* JADX INFO: renamed from: e */
    private final long m9193e() {
        long j = this.f8005n;
        this.f8005n = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m9196f() {
        biz<List<bfz>> bizVar = this.f7997f;
        m9188b(bizVar);
        m9178a(bizVar);
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8975a() {
        m9180a(bes.f7962d, (Object) true);
    }

    /* JADX INFO: renamed from: a */
    public final void m9200a(bex bexVar) {
        m9182a(bes.f7959a.equals(bexVar.mo9132a().m9482a().m9158d()) ? this.f8006o.m9301b(bexVar) : this.f8007p.m9301b(bexVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m9201a(bfa bfaVar, bln blnVar, C2266d.a aVar) {
        if (this.f8001j.m9541a()) {
            bkl bklVar = this.f8001j;
            String strValueOf = String.valueOf(bfaVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 5).append("set: ").append(strValueOf).toString(), null, new Object[0]);
        }
        if (this.f8003l.m9541a()) {
            bkl bklVar2 = this.f8003l;
            String strValueOf2 = String.valueOf(bfaVar);
            String strValueOf3 = String.valueOf(blnVar);
            bklVar2.m9540a(new StringBuilder(String.valueOf(strValueOf2).length() + 6 + String.valueOf(strValueOf3).length()).append("set: ").append(strValueOf2).append(" ").append(strValueOf3).toString(), null, new Object[0]);
        }
        bln blnVarM9236a = bge.m9236a(blnVar, bge.m9237a(this.f7993b));
        long jM9193e = m9193e();
        m9182a(this.f8007p.m9293a(bfaVar, blnVar, blnVarM9236a, jM9193e, true, true));
        this.f7994c.mo8961a(bfaVar.m9157c(), blnVar.mo9563a(true), new bfy(this, bfaVar, jM9193e, aVar));
        m9164a(m9165a(bfaVar, -9));
    }

    /* JADX INFO: renamed from: a */
    final void m9202a(C2266d.a aVar, C2226b c2226b, bfa bfaVar) {
        if (aVar != null) {
            bkp bkpVarM9161g = bfaVar.m9161g();
            m9205b(new bfx(this, aVar, c2226b, (bkpVarM9161g == null || !bkpVarM9161g.m9555e()) ? C2278p.m13020a(this, bfaVar) : C2278p.m13020a(this, bfaVar.m9160f())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9203a(Runnable runnable) {
        this.f8000i.m9120b();
        this.f8000i.f7965c.mo9234a(runnable);
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8976a(List<String> list, Object obj, boolean z, Long l) {
        List<? extends bjj> listM9291a;
        bfa bfaVar = new bfa(list);
        if (this.f8001j.m9541a()) {
            bkl bklVar = this.f8001j;
            String strValueOf = String.valueOf(bfaVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 14).append("onDataUpdate: ").append(strValueOf).toString(), null, new Object[0]);
        }
        if (this.f8003l.m9541a()) {
            bkl bklVar2 = this.f8001j;
            String strValueOf2 = String.valueOf(bfaVar);
            String strValueOf3 = String.valueOf(obj);
            bklVar2.m9540a(new StringBuilder(String.valueOf(strValueOf2).length() + 15 + String.valueOf(strValueOf3).length()).append("onDataUpdate: ").append(strValueOf2).append(" ").append(strValueOf3).toString(), null, new Object[0]);
        }
        this.f8004m++;
        try {
            if (l != null) {
                bhg bhgVar = new bhg(l.longValue());
                if (z) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        map.put(new bfa((String) entry.getKey()), blq.m9628a(entry.getValue(), bld.m9605j()));
                    }
                    listM9291a = this.f8007p.m9297a(bfaVar, map, bhgVar);
                } else {
                    listM9291a = this.f8007p.m9292a(bfaVar, blq.m9628a(obj, bld.m9605j()), bhgVar);
                }
            } else if (z) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    map2.put(new bfa((String) entry2.getKey()), blq.m9628a(entry2.getValue(), bld.m9605j()));
                }
                listM9291a = this.f8007p.m9296a(bfaVar, map2);
            } else {
                listM9291a = this.f8007p.m9291a(bfaVar, blq.m9628a(obj, bld.m9605j()));
            }
            if (listM9291a.size() > 0) {
                m9164a(bfaVar);
            }
            m9182a(listM9291a);
        } catch (C2227c e) {
            this.f8001j.m9539a("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8977a(List<String> list, List<bdv> list2, Long l) {
        bfa bfaVar = new bfa(list);
        if (this.f8001j.m9541a()) {
            bkl bklVar = this.f8001j;
            String strValueOf = String.valueOf(bfaVar);
            bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 20).append("onRangeMergeUpdate: ").append(strValueOf).toString(), null, new Object[0]);
        }
        if (this.f8003l.m9541a()) {
            bkl bklVar2 = this.f8001j;
            String strValueOf2 = String.valueOf(bfaVar);
            String strValueOf3 = String.valueOf(list2);
            bklVar2.m9540a(new StringBuilder(String.valueOf(strValueOf2).length() + 21 + String.valueOf(strValueOf3).length()).append("onRangeMergeUpdate: ").append(strValueOf2).append(" ").append(strValueOf3).toString(), null, new Object[0]);
        }
        this.f8004m++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<bdv> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new blu(it.next()));
        }
        List<? extends bjj> listM9295a = l != null ? this.f8007p.m9295a(bfaVar, arrayList, new bhg(l.longValue())) : this.f8007p.m9294a(bfaVar, arrayList);
        if (listM9295a.size() > 0) {
            m9164a(bfaVar);
        }
        m9182a(listM9295a);
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8978a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m9180a(bkp.m9549a(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: a */
    public final void mo8979a(boolean z) {
        m9180a(bes.f7961c, Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.bde
    /* JADX INFO: renamed from: b */
    public final void mo8980b() {
        m9180a(bes.f7962d, (Object) false);
        Map<String, Object> mapM9237a = bge.m9237a(this.f7993b);
        bgj bgjVar = this.f7996e;
        bgj bgjVar2 = new bgj();
        bgjVar.m9242a(new bfa(""), new bgf(bgjVar2, mapM9237a));
        ArrayList arrayList = new ArrayList();
        bgjVar2.m9242a(bfa.m9147a(), new bff(this, arrayList));
        this.f7996e = new bgj();
        m9182a(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m9204b(bex bexVar) {
        bkp bkpVarM9158d = bexVar.mo9132a().m9482a().m9158d();
        m9182a((bkpVarM9158d == null || !bkpVarM9158d.equals(bes.f7959a)) ? this.f8007p.m9288a(bexVar) : this.f8006o.m9288a(bexVar));
    }

    /* JADX INFO: renamed from: b */
    public final void m9205b(Runnable runnable) {
        this.f8000i.m9120b();
        this.f8000i.f7963a.mo8804a(runnable);
    }

    /* JADX INFO: renamed from: c */
    public final long m9206c() {
        return this.f7993b.mo9681a();
    }

    public final String toString() {
        return this.f7992a.toString();
    }
}
