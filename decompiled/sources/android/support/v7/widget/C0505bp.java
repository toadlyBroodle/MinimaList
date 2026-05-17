package android.support.v7.widget;

import android.support.v4.p018i.C0207a;
import android.support.v4.p018i.C0212f;
import android.support.v4.p018i.C0217k;
import android.support.v7.widget.C0484av;

/* JADX INFO: renamed from: android.support.v7.widget.bp */
/* JADX INFO: loaded from: classes.dex */
class C0505bp {

    /* JADX INFO: renamed from: a */
    final C0207a<C0484av.w, a> f3524a = new C0207a<>();

    /* JADX INFO: renamed from: b */
    final C0212f<C0484av.w> f3525b = new C0212f<>();

    /* JADX INFO: renamed from: android.support.v7.widget.bp$a */
    static class a {

        /* JADX INFO: renamed from: d */
        static C0217k.a<a> f3526d = new C0217k.b(20);

        /* JADX INFO: renamed from: a */
        int f3527a;

        /* JADX INFO: renamed from: b */
        C0484av.e.c f3528b;

        /* JADX INFO: renamed from: c */
        C0484av.e.c f3529c;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        static a m4578a() {
            a aVarMo1569a = f3526d.mo1569a();
            return aVarMo1569a == null ? new a() : aVarMo1569a;
        }

        /* JADX INFO: renamed from: a */
        static void m4579a(a aVar) {
            aVar.f3527a = 0;
            aVar.f3528b = null;
            aVar.f3529c = null;
            f3526d.mo1570a(aVar);
        }

        /* JADX INFO: renamed from: b */
        static void m4580b() {
            while (f3526d.mo1569a() != null) {
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.bp$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo4139a(C0484av.w wVar);

        /* JADX INFO: renamed from: a */
        void mo4140a(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2);

        /* JADX INFO: renamed from: b */
        void mo4141b(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2);

        /* JADX INFO: renamed from: c */
        void mo4142c(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2);
    }

    C0505bp() {
    }

    /* JADX INFO: renamed from: a */
    private C0484av.e.c m4561a(C0484av.w wVar, int i) {
        a aVarC;
        C0484av.e.c cVar = null;
        int iA = this.f3524a.m1577a(wVar);
        if (iA >= 0 && (aVarC = this.f3524a.m1584c(iA)) != null && (aVarC.f3527a & i) != 0) {
            aVarC.f3527a &= i ^ (-1);
            if (i == 4) {
                cVar = aVarC.f3528b;
            } else {
                if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                cVar = aVarC.f3529c;
            }
            if ((aVarC.f3527a & 12) == 0) {
                this.f3524a.m1585d(iA);
                a.m4579a(aVarC);
            }
        }
        return cVar;
    }

    /* JADX INFO: renamed from: a */
    C0484av.w m4562a(long j) {
        return this.f3525b.m1539a(j);
    }

    /* JADX INFO: renamed from: a */
    void m4563a() {
        this.f3524a.clear();
        this.f3525b.m1548c();
    }

    /* JADX INFO: renamed from: a */
    void m4564a(long j, C0484av.w wVar) {
        this.f3525b.m1545b(j, wVar);
    }

    /* JADX INFO: renamed from: a */
    void m4565a(C0484av.w wVar, C0484av.e.c cVar) {
        a aVarM4578a = this.f3524a.get(wVar);
        if (aVarM4578a == null) {
            aVarM4578a = a.m4578a();
            this.f3524a.put(wVar, aVarM4578a);
        }
        aVarM4578a.f3528b = cVar;
        aVarM4578a.f3527a |= 4;
    }

    /* JADX INFO: renamed from: a */
    void m4566a(b bVar) {
        for (int size = this.f3524a.size() - 1; size >= 0; size--) {
            C0484av.w wVarB = this.f3524a.m1583b(size);
            a aVarD = this.f3524a.m1585d(size);
            if ((aVarD.f3527a & 3) == 3) {
                bVar.mo4139a(wVarB);
            } else if ((aVarD.f3527a & 1) != 0) {
                if (aVarD.f3528b == null) {
                    bVar.mo4139a(wVarB);
                } else {
                    bVar.mo4140a(wVarB, aVarD.f3528b, aVarD.f3529c);
                }
            } else if ((aVarD.f3527a & 14) == 14) {
                bVar.mo4141b(wVarB, aVarD.f3528b, aVarD.f3529c);
            } else if ((aVarD.f3527a & 12) == 12) {
                bVar.mo4142c(wVarB, aVarD.f3528b, aVarD.f3529c);
            } else if ((aVarD.f3527a & 4) != 0) {
                bVar.mo4140a(wVarB, aVarD.f3528b, null);
            } else if ((aVarD.f3527a & 8) != 0) {
                bVar.mo4141b(wVarB, aVarD.f3528b, aVarD.f3529c);
            } else if ((aVarD.f3527a & 2) != 0) {
            }
            a.m4579a(aVarD);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m4567a(C0484av.w wVar) {
        a aVar = this.f3524a.get(wVar);
        return (aVar == null || (aVar.f3527a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    C0484av.e.c m4568b(C0484av.w wVar) {
        return m4561a(wVar, 4);
    }

    /* JADX INFO: renamed from: b */
    void m4569b() {
        a.m4580b();
    }

    /* JADX INFO: renamed from: b */
    void m4570b(C0484av.w wVar, C0484av.e.c cVar) {
        a aVarM4578a = this.f3524a.get(wVar);
        if (aVarM4578a == null) {
            aVarM4578a = a.m4578a();
            this.f3524a.put(wVar, aVarM4578a);
        }
        aVarM4578a.f3527a |= 2;
        aVarM4578a.f3528b = cVar;
    }

    /* JADX INFO: renamed from: c */
    C0484av.e.c m4571c(C0484av.w wVar) {
        return m4561a(wVar, 8);
    }

    /* JADX INFO: renamed from: c */
    void m4572c(C0484av.w wVar, C0484av.e.c cVar) {
        a aVarM4578a = this.f3524a.get(wVar);
        if (aVarM4578a == null) {
            aVarM4578a = a.m4578a();
            this.f3524a.put(wVar, aVarM4578a);
        }
        aVarM4578a.f3529c = cVar;
        aVarM4578a.f3527a |= 8;
    }

    /* JADX INFO: renamed from: d */
    boolean m4573d(C0484av.w wVar) {
        a aVar = this.f3524a.get(wVar);
        return (aVar == null || (aVar.f3527a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    void m4574e(C0484av.w wVar) {
        a aVarM4578a = this.f3524a.get(wVar);
        if (aVarM4578a == null) {
            aVarM4578a = a.m4578a();
            this.f3524a.put(wVar, aVarM4578a);
        }
        aVarM4578a.f3527a |= 1;
    }

    /* JADX INFO: renamed from: f */
    void m4575f(C0484av.w wVar) {
        a aVar = this.f3524a.get(wVar);
        if (aVar == null) {
            return;
        }
        aVar.f3527a &= -2;
    }

    /* JADX INFO: renamed from: g */
    void m4576g(C0484av.w wVar) {
        int iM1542b = this.f3525b.m1542b() - 1;
        while (true) {
            if (iM1542b < 0) {
                break;
            }
            if (wVar == this.f3525b.m1547c(iM1542b)) {
                this.f3525b.m1541a(iM1542b);
                break;
            }
            iM1542b--;
        }
        a aVarRemove = this.f3524a.remove(wVar);
        if (aVarRemove != null) {
            a.m4579a(aVarRemove);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4577h(C0484av.w wVar) {
        m4575f(wVar);
    }
}
