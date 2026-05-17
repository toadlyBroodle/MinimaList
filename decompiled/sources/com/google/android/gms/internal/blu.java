package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class blu {

    /* JADX INFO: renamed from: a */
    private final bfa f8392a;

    /* JADX INFO: renamed from: b */
    private final bfa f8393b;

    /* JADX INFO: renamed from: c */
    private final bln f8394c;

    public blu(bdv bdvVar) {
        List<String> listM9043a = bdvVar.m9043a();
        this.f8392a = listM9043a != null ? new bfa(listM9043a) : null;
        List<String> listM9044b = bdvVar.m9044b();
        this.f8393b = listM9044b != null ? new bfa(listM9044b) : null;
        this.f8394c = blq.m9628a(bdvVar.m9045c(), bld.m9605j());
    }

    /* JADX INFO: renamed from: a */
    private final bln m9632a(bfa bfaVar, bln blnVar, bln blnVar2) {
        int i = 0;
        int iCompareTo = this.f8392a == null ? 1 : bfaVar.compareTo(this.f8392a);
        int iCompareTo2 = this.f8393b == null ? -1 : bfaVar.compareTo(this.f8393b);
        boolean z = this.f8392a != null && bfaVar.m9155b(this.f8392a);
        boolean z2 = this.f8393b != null && bfaVar.m9155b(this.f8393b);
        if (iCompareTo > 0 && iCompareTo2 < 0 && !z2) {
            return blnVar2;
        }
        if (iCompareTo > 0 && z2 && blnVar2.mo9572e()) {
            return blnVar2;
        }
        if (iCompareTo > 0 && iCompareTo2 == 0) {
            return blnVar.mo9572e() ? bld.m9605j() : blnVar;
        }
        if (!z && !z2) {
            return blnVar;
        }
        HashSet hashSet = new HashSet();
        Iterator<blm> it = blnVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().m9626c());
        }
        Iterator<blm> it2 = blnVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().m9626c());
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!blnVar2.mo9573f().mo9568b() || !blnVar.mo9573f().mo9568b()) {
            arrayList.add(bkp.m9552c());
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        bln blnVarMo9562a = blnVar;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            bkp bkpVar = (bkp) obj;
            bln blnVarMo9570c = blnVar.mo9570c(bkpVar);
            bln blnVarM9632a = m9632a(bfaVar.m9153a(bkpVar), blnVar.mo9570c(bkpVar), blnVar2.mo9570c(bkpVar));
            blnVarMo9562a = blnVarM9632a != blnVarMo9570c ? blnVarMo9562a.mo9562a(bkpVar, blnVarM9632a) : blnVarMo9562a;
        }
        return blnVarMo9562a;
    }

    /* JADX INFO: renamed from: a */
    public final bln m9633a(bln blnVar) {
        return m9632a(bfa.m9147a(), blnVar, this.f8394c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8392a);
        String strValueOf2 = String.valueOf(this.f8393b);
        String strValueOf3 = String.valueOf(this.f8394c);
        return new StringBuilder(String.valueOf(strValueOf).length() + 55 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append("RangeMerge{optExclusiveStart=").append(strValueOf).append(", optInclusiveEnd=").append(strValueOf2).append(", snap=").append(strValueOf3).append("}").toString();
    }
}
