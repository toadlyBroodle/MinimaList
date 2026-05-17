package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bkr implements bln {

    /* JADX INFO: renamed from: a */
    public static Comparator<bkp> f8337a = new bks();

    /* JADX INFO: renamed from: c */
    private final bbw<bkp, bln> f8338c;

    /* JADX INFO: renamed from: d */
    private final bln f8339d;

    /* JADX INFO: renamed from: e */
    private String f8340e;

    protected bkr() {
        this.f8340e = null;
        this.f8338c = bbx.m8879a(f8337a);
        this.f8339d = bld.m9605j();
    }

    protected bkr(bbw<bkp, bln> bbwVar, bln blnVar) {
        this.f8340e = null;
        if (bbwVar.mo8876d() && !blnVar.mo9568b()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f8339d = blnVar;
        this.f8338c = bbwVar;
    }

    /* JADX INFO: renamed from: a */
    private static void m9558a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m9559b(StringBuilder sb, int i) {
        if (this.f8338c.mo8876d() && this.f8339d.mo9568b()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        for (Map.Entry<bkp, bln> entry : this.f8338c) {
            m9558a(sb, i + 2);
            sb.append(entry.getKey().m9554d());
            sb.append("=");
            if (entry.getValue() instanceof bkr) {
                ((bkr) entry.getValue()).m9559b(sb, i + 2);
            } else {
                sb.append(entry.getValue().toString());
            }
            sb.append("\n");
        }
        if (!this.f8339d.mo9568b()) {
            m9558a(sb, i + 2);
            sb.append(".priority=");
            sb.append(this.f8339d.toString());
            sb.append("\n");
        }
        m9558a(sb, i);
        sb.append("}");
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public bln mo9560a(bfa bfaVar) {
        bkp bkpVarM9158d = bfaVar.m9158d();
        return bkpVarM9158d == null ? this : mo9570c(bkpVarM9158d).mo9560a(bfaVar.m9159e());
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public bln mo9561a(bfa bfaVar, bln blnVar) {
        bkp bkpVarM9158d = bfaVar.m9158d();
        return bkpVarM9158d == null ? blnVar : bkpVarM9158d.m9555e() ? mo9544a(blnVar) : mo9562a(bkpVarM9158d, mo9570c(bkpVarM9158d).mo9561a(bfaVar.m9159e(), blnVar));
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public bln mo9562a(bkp bkpVar, bln blnVar) {
        if (bkpVar.m9555e()) {
            return mo9544a(blnVar);
        }
        bbw<bkp, bln> bbwVarMo8867a = this.f8338c;
        if (bbwVarMo8867a.mo8870a(bkpVar)) {
            bbwVarMo8867a = bbwVarMo8867a.mo8874c(bkpVar);
        }
        if (!blnVar.mo9568b()) {
            bbwVarMo8867a = bbwVarMo8867a.mo8867a(bkpVar, blnVar);
        }
        return bbwVarMo8867a.mo8876d() ? bld.m9605j() : new bkr(bbwVarMo8867a, this.f8339d);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public bln mo9544a(bln blnVar) {
        return this.f8338c.mo8876d() ? bld.m9605j() : new bkr(this.f8338c, blnVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public Object mo9545a() {
        return mo9563a(false);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public Object mo9563a(boolean z) {
        boolean z2;
        Integer numM9700d;
        if (mo9568b()) {
            return null;
        }
        HashMap map = new HashMap();
        boolean z3 = true;
        int iIntValue = 0;
        int i = 0;
        for (Map.Entry<bkp, bln> entry : this.f8338c) {
            String strM9554d = entry.getKey().m9554d();
            map.put(strM9554d, entry.getValue().mo9563a(z));
            int i2 = i + 1;
            if (z3) {
                if ((strM9554d.length() > 1 && strM9554d.charAt(0) == '0') || (numM9700d = bne.m9700d(strM9554d)) == null || numM9700d.intValue() < 0) {
                    z2 = false;
                    z3 = z2;
                    i = i2;
                } else if (numM9700d.intValue() > iIntValue) {
                    iIntValue = numM9700d.intValue();
                    i = i2;
                }
            }
            z2 = z3;
            z3 = z2;
            i = i2;
        }
        if (z || !z3 || iIntValue >= i * 2) {
            if (z && !this.f8339d.mo9568b()) {
                map.put(".priority", this.f8339d.mo9545a());
            }
            return map;
        }
        ArrayList arrayList = new ArrayList(iIntValue + 1);
        for (int i3 = 0; i3 <= iIntValue; i3++) {
            arrayList.add(map.get(new StringBuilder(11).append(i3).toString()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public String mo9546a(blp blpVar) {
        int i = 0;
        if (blpVar != blp.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f8339d.mo9568b()) {
            sb.append("priority:");
            sb.append(this.f8339d.mo9546a(blp.V1));
            sb.append(":");
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (blm blmVar : this) {
            arrayList.add(blmVar);
            z = z || !blmVar.m9627d().mo9573f().mo9568b();
        }
        if (z) {
            Collections.sort(arrayList, bls.m9629c());
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            blm blmVar2 = (blm) obj;
            String strMo9571d = blmVar2.m9627d().mo9571d();
            if (!strMo9571d.equals("")) {
                sb.append(":");
                sb.append(blmVar2.m9626c().m9554d());
                sb.append(":");
                sb.append(strMo9571d);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m9564a(bku bkuVar, boolean z) {
        if (!z || mo9573f().mo9568b()) {
            this.f8338c.mo8869a(bkuVar);
        } else {
            this.f8338c.mo8869a(new bkt(this, bkuVar));
        }
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: a */
    public boolean mo9565a(bkp bkpVar) {
        return !mo9570c(bkpVar).mo9568b();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(bln blnVar) {
        if (mo9568b()) {
            return blnVar.mo9568b() ? 0 : -1;
        }
        if (!blnVar.mo9572e() && !blnVar.mo9568b()) {
            return blnVar == bln.f8386b ? -1 : 0;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public bkp mo9567b(bkp bkpVar) {
        return this.f8338c.mo8875d(bkpVar);
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: b */
    public boolean mo9568b() {
        return this.f8338c.mo8876d();
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public int mo9569c() {
        return this.f8338c.mo8873c();
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: c */
    public bln mo9570c(bkp bkpVar) {
        return (!bkpVar.m9555e() || this.f8339d.mo9568b()) ? this.f8338c.mo8870a(bkpVar) ? this.f8338c.mo8872b(bkpVar) : bld.m9605j() : this.f8339d;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: d */
    public String mo9571d() {
        if (this.f8340e == null) {
            String strMo9546a = mo9546a(blp.V1);
            this.f8340e = strMo9546a.isEmpty() ? "" : bne.m9698b(strMo9546a);
        }
        return this.f8340e;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: e */
    public boolean mo9572e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkr)) {
            return false;
        }
        bkr bkrVar = (bkr) obj;
        if (mo9573f().equals(bkrVar.mo9573f()) && this.f8338c.mo8873c() == bkrVar.f8338c.mo8873c()) {
            Iterator<Map.Entry<bkp, bln>> it = this.f8338c.iterator();
            Iterator<Map.Entry<bkp, bln>> it2 = bkrVar.f8338c.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<bkp, bln> next = it.next();
                Map.Entry<bkp, bln> next2 = it2.next();
                if (!next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                    return false;
                }
            }
            if (it.hasNext() || it2.hasNext()) {
                throw new IllegalStateException("Something went wrong internally.");
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: f */
    public bln mo9573f() {
        return this.f8339d;
    }

    /* JADX INFO: renamed from: g */
    public final bkp m9574g() {
        return this.f8338c.mo8868a();
    }

    /* JADX INFO: renamed from: h */
    public final bkp m9575h() {
        return this.f8338c.mo8871b();
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator<blm> it = iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            blm next = it.next();
            iHashCode = next.m9627d().hashCode() + (((i * 31) + next.m9626c().hashCode()) * 17);
        }
    }

    @Override // com.google.android.gms.internal.bln
    /* JADX INFO: renamed from: i */
    public Iterator<blm> mo9576i() {
        return new bkv(this.f8338c.mo8877e());
    }

    @Override // java.lang.Iterable
    public Iterator<blm> iterator() {
        return new bkv(this.f8338c.iterator());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m9559b(sb, 0);
        return sb.toString();
    }
}
