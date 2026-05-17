package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class beo implements Iterable<Map.Entry<bfa, bln>> {

    /* JADX INFO: renamed from: a */
    private static final beo f7954a = new beo(new bit(null));

    /* JADX INFO: renamed from: b */
    private final bit<bln> f7955b;

    private beo(bit<bln> bitVar) {
        this.f7955b = bitVar;
    }

    /* JADX INFO: renamed from: a */
    public static beo m9094a() {
        return f7954a;
    }

    /* JADX INFO: renamed from: a */
    public static beo m9095a(Map<String, Object> map) {
        bit bitVarM9405a = bit.m9405a();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (true) {
            bit bitVar = bitVarM9405a;
            if (!it.hasNext()) {
                return new beo(bitVar);
            }
            Map.Entry<String, Object> next = it.next();
            bitVarM9405a = bitVar.m9409a(new bfa(next.getKey()), new bit(blq.m9628a(next.getValue(), bld.m9605j())));
        }
    }

    /* JADX INFO: renamed from: a */
    private final bln m9096a(bfa bfaVar, bit<bln> bitVar, bln blnVar) {
        if (bitVar.m9415b() != null) {
            return blnVar.mo9561a(bfaVar, bitVar.m9415b());
        }
        bln blnVarM9415b = null;
        for (Map.Entry<bkp, bit<bln>> entry : bitVar.m9418c()) {
            bit<bln> value = entry.getValue();
            bkp key = entry.getKey();
            if (key.m9555e()) {
                blnVarM9415b = value.m9415b();
            } else {
                blnVar = m9096a(bfaVar.m9153a(key), value, blnVar);
            }
        }
        return (blnVar.mo9560a(bfaVar).mo9568b() || blnVarM9415b == null) ? blnVar : blnVar.mo9561a(bfaVar.m9153a(bkp.m9552c()), blnVarM9415b);
    }

    /* JADX INFO: renamed from: b */
    public static beo m9097b(Map<bfa, bln> map) {
        bit bitVarM9405a = bit.m9405a();
        Iterator<Map.Entry<bfa, bln>> it = map.entrySet().iterator();
        while (true) {
            bit bitVar = bitVarM9405a;
            if (!it.hasNext()) {
                return new beo(bitVar);
            }
            Map.Entry<bfa, bln> next = it.next();
            bitVarM9405a = bitVar.m9409a(next.getKey(), new bit(next.getValue()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final beo m9098a(bfa bfaVar) {
        return bfaVar.m9162h() ? f7954a : new beo(this.f7955b.m9409a(bfaVar, bit.m9405a()));
    }

    /* JADX INFO: renamed from: a */
    public final beo m9099a(bfa bfaVar, beo beoVar) {
        return (beo) beoVar.f7955b.m9412a(this, new bep(this, bfaVar));
    }

    /* JADX INFO: renamed from: a */
    public final beo m9100a(bfa bfaVar, bln blnVar) {
        if (bfaVar.m9162h()) {
            return new beo(new bit(blnVar));
        }
        bfa bfaVarM9407a = this.f7955b.m9407a(bfaVar);
        if (bfaVarM9407a == null) {
            return new beo(this.f7955b.m9409a(bfaVar, new bit<>(blnVar)));
        }
        bfa bfaVarM9148a = bfa.m9148a(bfaVarM9407a, bfaVar);
        bln blnVarM9422e = this.f7955b.m9422e(bfaVarM9407a);
        bkp bkpVarM9161g = bfaVarM9148a.m9161g();
        if (bkpVarM9161g != null && bkpVarM9161g.m9555e() && blnVarM9422e.mo9560a(bfaVarM9148a.m9160f()).mo9568b()) {
            return this;
        }
        return new beo(this.f7955b.m9410a(bfaVarM9407a, blnVarM9422e.mo9561a(bfaVarM9148a, blnVar)));
    }

    /* JADX INFO: renamed from: a */
    public final beo m9101a(bkp bkpVar, bln blnVar) {
        return m9100a(new bfa(bkpVar), blnVar);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9102a(bln blnVar) {
        return m9096a(bfa.m9147a(), this.f7955b, blnVar);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m9103a(boolean z) {
        HashMap map = new HashMap();
        this.f7955b.m9413a(new ber(this, map, true));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final bln m9104b() {
        return this.f7955b.m9415b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9105b(bfa bfaVar) {
        return m9106c(bfaVar) != null;
    }

    /* JADX INFO: renamed from: c */
    public final bln m9106c(bfa bfaVar) {
        bfa bfaVarM9407a = this.f7955b.m9407a(bfaVar);
        if (bfaVarM9407a != null) {
            return this.f7955b.m9422e(bfaVarM9407a).mo9560a(bfa.m9148a(bfaVarM9407a, bfaVar));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final List<blm> m9107c() {
        ArrayList arrayList = new ArrayList();
        if (this.f7955b.m9415b() != null) {
            for (blm blmVar : this.f7955b.m9415b()) {
                arrayList.add(new blm(blmVar.m9626c(), blmVar.m9627d()));
            }
        } else {
            for (Map.Entry<bkp, bit<bln>> entry : this.f7955b.m9418c()) {
                bit<bln> value = entry.getValue();
                if (value.m9415b() != null) {
                    arrayList.add(new blm(entry.getKey(), value.m9415b()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final beo m9108d(bfa bfaVar) {
        if (bfaVar.m9162h()) {
            return this;
        }
        bln blnVarM9106c = m9106c(bfaVar);
        return blnVarM9106c != null ? new beo(new bit(blnVarM9106c)) : new beo(this.f7955b.m9419c(bfaVar));
    }

    /* JADX INFO: renamed from: d */
    public final Map<bkp, beo> m9109d() {
        HashMap map = new HashMap();
        for (Map.Entry<bkp, bit<bln>> entry : this.f7955b.m9418c()) {
            map.put(entry.getKey(), new beo(entry.getValue()));
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9110e() {
        return this.f7955b.m9421d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((beo) obj).m9103a(true).equals(m9103a(true));
    }

    public final int hashCode() {
        return m9103a(true).hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<bfa, bln>> iterator() {
        return this.f7955b.iterator();
    }

    public final String toString() {
        String string = m9103a(true).toString();
        return new StringBuilder(String.valueOf(string).length() + 15).append("CompoundWrite{").append(string).append("}").toString();
    }
}
