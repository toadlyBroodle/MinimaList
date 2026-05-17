package android.support.v7.widget;

import android.support.v7.widget.C0510f;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.widget.at */
/* JADX INFO: loaded from: classes.dex */
class C0482at {

    /* JADX INFO: renamed from: a */
    final a f3194a;

    /* JADX INFO: renamed from: android.support.v7.widget.at$a */
    interface a {
        /* JADX INFO: renamed from: a */
        C0510f.b mo3996a(int i, int i2, int i3, Object obj);

        /* JADX INFO: renamed from: a */
        void mo3997a(C0510f.b bVar);
    }

    C0482at(a aVar) {
        this.f3194a = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m3990a(List<C0510f.b> list, int i, int i2) {
        C0510f.b bVar = list.get(i);
        C0510f.b bVar2 = list.get(i2);
        switch (bVar2.f3593a) {
            case 1:
                m3992c(list, i, bVar, i2, bVar2);
                break;
            case 2:
                m3994a(list, i, bVar, i2, bVar2);
                break;
            case 4:
                m3995b(list, i, bVar, i2, bVar2);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m3991b(List<C0510f.b> list) {
        boolean z;
        boolean z2 = false;
        int size = list.size() - 1;
        while (size >= 0) {
            if (list.get(size).f3593a != 8) {
                z = true;
            } else {
                if (z2) {
                    return size;
                }
                z = z2;
            }
            size--;
            z2 = z;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private void m3992c(List<C0510f.b> list, int i, C0510f.b bVar, int i2, C0510f.b bVar2) {
        int i3 = bVar.f3596d < bVar2.f3594b ? -1 : 0;
        if (bVar.f3594b < bVar2.f3594b) {
            i3++;
        }
        if (bVar2.f3594b <= bVar.f3594b) {
            bVar.f3594b += bVar2.f3596d;
        }
        if (bVar2.f3594b <= bVar.f3596d) {
            bVar.f3596d += bVar2.f3596d;
        }
        bVar2.f3594b = i3 + bVar2.f3594b;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* JADX INFO: renamed from: a */
    void m3993a(List<C0510f.b> list) {
        while (true) {
            int iM3991b = m3991b(list);
            if (iM3991b == -1) {
                return;
            } else {
                m3990a(list, iM3991b, iM3991b + 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3994a(List<C0510f.b> list, int i, C0510f.b bVar, int i2, C0510f.b bVar2) {
        boolean z;
        C0510f.b bVarMo3996a;
        boolean z2 = false;
        if (bVar.f3594b < bVar.f3596d) {
            z = bVar2.f3594b == bVar.f3594b && bVar2.f3596d == bVar.f3596d - bVar.f3594b;
        } else if (bVar2.f3594b == bVar.f3596d + 1 && bVar2.f3596d == bVar.f3594b - bVar.f3596d) {
            z2 = true;
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        if (bVar.f3596d < bVar2.f3594b) {
            bVar2.f3594b--;
        } else if (bVar.f3596d < bVar2.f3594b + bVar2.f3596d) {
            bVar2.f3596d--;
            bVar.f3593a = 2;
            bVar.f3596d = 1;
            if (bVar2.f3596d == 0) {
                list.remove(i2);
                this.f3194a.mo3997a(bVar2);
                return;
            }
            return;
        }
        if (bVar.f3594b <= bVar2.f3594b) {
            bVar2.f3594b++;
            bVarMo3996a = null;
        } else if (bVar.f3594b < bVar2.f3594b + bVar2.f3596d) {
            bVarMo3996a = this.f3194a.mo3996a(2, bVar.f3594b + 1, (bVar2.f3594b + bVar2.f3596d) - bVar.f3594b, null);
            bVar2.f3596d = bVar.f3594b - bVar2.f3594b;
        } else {
            bVarMo3996a = null;
        }
        if (z) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f3194a.mo3997a(bVar);
            return;
        }
        if (z2) {
            if (bVarMo3996a != null) {
                if (bVar.f3594b > bVarMo3996a.f3594b) {
                    bVar.f3594b -= bVarMo3996a.f3596d;
                }
                if (bVar.f3596d > bVarMo3996a.f3594b) {
                    bVar.f3596d -= bVarMo3996a.f3596d;
                }
            }
            if (bVar.f3594b > bVar2.f3594b) {
                bVar.f3594b -= bVar2.f3596d;
            }
            if (bVar.f3596d > bVar2.f3594b) {
                bVar.f3596d -= bVar2.f3596d;
            }
        } else {
            if (bVarMo3996a != null) {
                if (bVar.f3594b >= bVarMo3996a.f3594b) {
                    bVar.f3594b -= bVarMo3996a.f3596d;
                }
                if (bVar.f3596d >= bVarMo3996a.f3594b) {
                    bVar.f3596d -= bVarMo3996a.f3596d;
                }
            }
            if (bVar.f3594b >= bVar2.f3594b) {
                bVar.f3594b -= bVar2.f3596d;
            }
            if (bVar.f3596d >= bVar2.f3594b) {
                bVar.f3596d -= bVar2.f3596d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f3594b != bVar.f3596d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVarMo3996a != null) {
            list.add(i, bVarMo3996a);
        }
    }

    /* JADX INFO: renamed from: b */
    void m3995b(List<C0510f.b> list, int i, C0510f.b bVar, int i2, C0510f.b bVar2) {
        C0510f.b bVarMo3996a;
        C0510f.b bVarMo3996a2 = null;
        if (bVar.f3596d < bVar2.f3594b) {
            bVar2.f3594b--;
            bVarMo3996a = null;
        } else if (bVar.f3596d < bVar2.f3594b + bVar2.f3596d) {
            bVar2.f3596d--;
            bVarMo3996a = this.f3194a.mo3996a(4, bVar.f3594b, 1, bVar2.f3595c);
        } else {
            bVarMo3996a = null;
        }
        if (bVar.f3594b <= bVar2.f3594b) {
            bVar2.f3594b++;
        } else if (bVar.f3594b < bVar2.f3594b + bVar2.f3596d) {
            int i3 = (bVar2.f3594b + bVar2.f3596d) - bVar.f3594b;
            bVarMo3996a2 = this.f3194a.mo3996a(4, bVar.f3594b + 1, i3, bVar2.f3595c);
            bVar2.f3596d -= i3;
        }
        list.set(i2, bVar);
        if (bVar2.f3596d > 0) {
            list.set(i, bVar2);
        } else {
            list.remove(i);
            this.f3194a.mo3997a(bVar2);
        }
        if (bVarMo3996a != null) {
            list.add(i, bVarMo3996a);
        }
        if (bVarMo3996a2 != null) {
            list.add(i, bVarMo3996a2);
        }
    }
}
