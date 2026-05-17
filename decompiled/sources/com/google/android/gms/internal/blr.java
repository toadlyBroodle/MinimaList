package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blr extends ble {

    /* JADX INFO: renamed from: a */
    private final bfa f8390a;

    public blr(bfa bfaVar) {
        if (bfaVar.m9163i() == 1 && bfaVar.m9158d().m9555e()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f8390a = bfaVar;
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9607a() {
        return new blm(bkp.m9550b(), bld.m9605j().mo9561a(this.f8390a, bln.f8386b));
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final blm mo9608a(bkp bkpVar, bln blnVar) {
        return new blm(bkpVar, bld.m9605j().mo9561a(this.f8390a, blnVar));
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: a */
    public final boolean mo9609a(bln blnVar) {
        return !blnVar.mo9560a(this.f8390a).mo9568b();
    }

    @Override // com.google.android.gms.internal.ble
    /* JADX INFO: renamed from: b */
    public final String mo9610b() {
        return this.f8390a.m9154b();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(blm blmVar, blm blmVar2) {
        blm blmVar3 = blmVar;
        blm blmVar4 = blmVar2;
        int iCompareTo = blmVar3.m9627d().mo9560a(this.f8390a).compareTo(blmVar4.m9627d().mo9560a(this.f8390a));
        return iCompareTo == 0 ? blmVar3.m9626c().compareTo(blmVar4.m9626c()) : iCompareTo;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8390a.equals(((blr) obj).f8390a);
    }

    public final int hashCode() {
        return this.f8390a.hashCode();
    }
}
