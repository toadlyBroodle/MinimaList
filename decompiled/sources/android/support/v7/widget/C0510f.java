package android.support.v7.widget;

import android.support.v4.p018i.C0217k;
import android.support.v7.widget.C0482at;
import android.support.v7.widget.C0484av;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.widget.f */
/* JADX INFO: loaded from: classes.dex */
class C0510f implements C0482at.a {

    /* JADX INFO: renamed from: a */
    final ArrayList<b> f3585a;

    /* JADX INFO: renamed from: b */
    final ArrayList<b> f3586b;

    /* JADX INFO: renamed from: c */
    final a f3587c;

    /* JADX INFO: renamed from: d */
    Runnable f3588d;

    /* JADX INFO: renamed from: e */
    final boolean f3589e;

    /* JADX INFO: renamed from: f */
    final C0482at f3590f;

    /* JADX INFO: renamed from: g */
    private C0217k.a<b> f3591g;

    /* JADX INFO: renamed from: h */
    private int f3592h;

    /* JADX INFO: renamed from: android.support.v7.widget.f$a */
    interface a {
        /* JADX INFO: renamed from: a */
        C0484av.w mo4143a(int i);

        /* JADX INFO: renamed from: a */
        void mo4144a(int i, int i2);

        /* JADX INFO: renamed from: a */
        void mo4145a(int i, int i2, Object obj);

        /* JADX INFO: renamed from: a */
        void mo4146a(b bVar);

        /* JADX INFO: renamed from: b */
        void mo4147b(int i, int i2);

        /* JADX INFO: renamed from: b */
        void mo4148b(b bVar);

        /* JADX INFO: renamed from: c */
        void mo4149c(int i, int i2);

        /* JADX INFO: renamed from: d */
        void mo4151d(int i, int i2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.f$b */
    static class b {

        /* JADX INFO: renamed from: a */
        int f3593a;

        /* JADX INFO: renamed from: b */
        int f3594b;

        /* JADX INFO: renamed from: c */
        Object f3595c;

        /* JADX INFO: renamed from: d */
        int f3596d;

        b(int i, int i2, int i3, Object obj) {
            this.f3593a = i;
            this.f3594b = i2;
            this.f3596d = i3;
            this.f3595c = obj;
        }

        /* JADX INFO: renamed from: a */
        String m4643a() {
            switch (this.f3593a) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                case 3:
                case 5:
                case 6:
                case 7:
                default:
                    return "??";
                case 4:
                    return "up";
                case 8:
                    return "mv";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3593a != bVar.f3593a) {
                return false;
            }
            if (this.f3593a == 8 && Math.abs(this.f3596d - this.f3594b) == 1 && this.f3596d == bVar.f3594b && this.f3594b == bVar.f3596d) {
                return true;
            }
            if (this.f3596d == bVar.f3596d && this.f3594b == bVar.f3594b) {
                return this.f3595c != null ? this.f3595c.equals(bVar.f3595c) : bVar.f3595c == null;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f3593a * 31) + this.f3594b) * 31) + this.f3596d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m4643a() + ",s:" + this.f3594b + "c:" + this.f3596d + ",p:" + this.f3595c + "]";
        }
    }

    C0510f(a aVar) {
        this(aVar, false);
    }

    C0510f(a aVar, boolean z) {
        this.f3591g = new C0217k.b(30);
        this.f3585a = new ArrayList<>();
        this.f3586b = new ArrayList<>();
        this.f3592h = 0;
        this.f3587c = aVar;
        this.f3589e = z;
        this.f3590f = new C0482at(this);
    }

    /* JADX INFO: renamed from: b */
    private int m4623b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        for (int size = this.f3586b.size() - 1; size >= 0; size--) {
            b bVar = this.f3586b.get(size);
            if (bVar.f3593a == 8) {
                if (bVar.f3594b < bVar.f3596d) {
                    i3 = bVar.f3594b;
                    i4 = bVar.f3596d;
                } else {
                    i3 = bVar.f3596d;
                    i4 = bVar.f3594b;
                }
                if (i6 < i3 || i6 > i4) {
                    if (i6 >= bVar.f3594b) {
                        i5 = i6;
                    } else if (i2 == 1) {
                        bVar.f3594b++;
                        bVar.f3596d++;
                        i5 = i6;
                    } else {
                        if (i2 == 2) {
                            bVar.f3594b--;
                            bVar.f3596d--;
                        }
                        i5 = i6;
                    }
                } else if (i3 == bVar.f3594b) {
                    if (i2 == 1) {
                        bVar.f3596d++;
                    } else if (i2 == 2) {
                        bVar.f3596d--;
                    }
                    i5 = i6 + 1;
                } else {
                    if (i2 == 1) {
                        bVar.f3594b++;
                    } else if (i2 == 2) {
                        bVar.f3594b--;
                    }
                    i5 = i6 - 1;
                }
                i6 = i5;
            } else if (bVar.f3594b <= i6) {
                if (bVar.f3593a == 1) {
                    i6 -= bVar.f3596d;
                } else if (bVar.f3593a == 2) {
                    i6 += bVar.f3596d;
                }
            } else if (i2 == 1) {
                bVar.f3594b++;
            } else if (i2 == 2) {
                bVar.f3594b--;
            }
        }
        for (int size2 = this.f3586b.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3586b.get(size2);
            if (bVar2.f3593a == 8) {
                if (bVar2.f3596d == bVar2.f3594b || bVar2.f3596d < 0) {
                    this.f3586b.remove(size2);
                    mo3997a(bVar2);
                }
            } else if (bVar2.f3596d <= 0) {
                this.f3586b.remove(size2);
                mo3997a(bVar2);
            }
        }
        return i6;
    }

    /* JADX INFO: renamed from: b */
    private void m4624b(b bVar) {
        m4630g(bVar);
    }

    /* JADX INFO: renamed from: c */
    private void m4625c(b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4 = bVar.f3594b;
        int i5 = bVar.f3594b + bVar.f3596d;
        byte b2 = -1;
        int i6 = bVar.f3594b;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f3587c.mo4143a(i6) != null || m4627d(i6)) {
                if (b2 == 0) {
                    m4628e(mo3996a(2, i4, i7, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    m4630g(mo3996a(2, i4, i7, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i3 = i6 - i7;
                i = i5 - i7;
                i2 = 1;
            } else {
                int i8 = i6;
                i = i5;
                i2 = i7 + 1;
                i3 = i8;
            }
            i7 = i2;
            i5 = i;
            i6 = i3 + 1;
        }
        if (i7 != bVar.f3596d) {
            mo3997a(bVar);
            bVar = mo3996a(2, i4, i7, null);
        }
        if (b2 == 0) {
            m4628e(bVar);
        } else {
            m4630g(bVar);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4626d(b bVar) {
        int i;
        int i2;
        byte b2;
        int i3 = bVar.f3594b;
        int i4 = bVar.f3594b + bVar.f3596d;
        int i5 = bVar.f3594b;
        byte b3 = -1;
        int i6 = 0;
        while (i5 < i4) {
            if (this.f3587c.mo4143a(i5) != null || m4627d(i5)) {
                if (b3 == 0) {
                    m4628e(mo3996a(4, i3, i6, bVar.f3595c));
                    i6 = 0;
                    i3 = i5;
                }
                i = i3;
                i2 = i6;
                b2 = 1;
            } else {
                if (b3 == 1) {
                    m4630g(mo3996a(4, i3, i6, bVar.f3595c));
                    i6 = 0;
                    i3 = i5;
                }
                i = i3;
                i2 = i6;
                b2 = 0;
            }
            i5++;
            byte b4 = b2;
            i6 = i2 + 1;
            i3 = i;
            b3 = b4;
        }
        if (i6 != bVar.f3596d) {
            Object obj = bVar.f3595c;
            mo3997a(bVar);
            bVar = mo3996a(4, i3, i6, obj);
        }
        if (b3 == 0) {
            m4628e(bVar);
        } else {
            m4630g(bVar);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m4627d(int i) {
        int size = this.f3586b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3586b.get(i2);
            if (bVar.f3593a == 8) {
                if (m4631a(bVar.f3596d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f3593a == 1) {
                int i3 = bVar.f3594b + bVar.f3596d;
                for (int i4 = bVar.f3594b; i4 < i3; i4++) {
                    if (m4631a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private void m4628e(b bVar) {
        int i;
        boolean z;
        if (bVar.f3593a == 1 || bVar.f3593a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4623b = m4623b(bVar.f3594b, bVar.f3593a);
        int i2 = bVar.f3594b;
        switch (bVar.f3593a) {
            case 2:
                i = 0;
                break;
            case 3:
            default:
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            case 4:
                i = 1;
                break;
        }
        int i3 = 1;
        int i4 = iM4623b;
        int i5 = i2;
        for (int i6 = 1; i6 < bVar.f3596d; i6++) {
            int iM4623b2 = m4623b(bVar.f3594b + (i * i6), bVar.f3593a);
            switch (bVar.f3593a) {
                case 2:
                    z = iM4623b2 == i4;
                    break;
                case 3:
                default:
                    z = false;
                    break;
                case 4:
                    z = iM4623b2 == i4 + 1;
                    break;
            }
            if (z) {
                i3++;
            } else {
                b bVarMo3996a = mo3996a(bVar.f3593a, i4, i3, bVar.f3595c);
                m4633a(bVarMo3996a, i5);
                mo3997a(bVarMo3996a);
                if (bVar.f3593a == 4) {
                    i5 += i3;
                }
                i3 = 1;
                i4 = iM4623b2;
            }
        }
        Object obj = bVar.f3595c;
        mo3997a(bVar);
        if (i3 > 0) {
            b bVarMo3996a2 = mo3996a(bVar.f3593a, i4, i3, obj);
            m4633a(bVarMo3996a2, i5);
            mo3997a(bVarMo3996a2);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4629f(b bVar) {
        m4630g(bVar);
    }

    /* JADX INFO: renamed from: g */
    private void m4630g(b bVar) {
        this.f3586b.add(bVar);
        switch (bVar.f3593a) {
            case 1:
                this.f3587c.mo4149c(bVar.f3594b, bVar.f3596d);
                return;
            case 2:
                this.f3587c.mo4147b(bVar.f3594b, bVar.f3596d);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException("Unknown update op type for " + bVar);
            case 4:
                this.f3587c.mo4145a(bVar.f3594b, bVar.f3596d, bVar.f3595c);
                return;
            case 8:
                this.f3587c.mo4151d(bVar.f3594b, bVar.f3596d);
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    int m4631a(int i, int i2) {
        int size = this.f3586b.size();
        int i3 = i;
        while (i2 < size) {
            b bVar = this.f3586b.get(i2);
            if (bVar.f3593a == 8) {
                if (bVar.f3594b == i3) {
                    i3 = bVar.f3596d;
                } else {
                    if (bVar.f3594b < i3) {
                        i3--;
                    }
                    if (bVar.f3596d <= i3) {
                        i3++;
                    }
                }
            } else if (bVar.f3594b > i3) {
                continue;
            } else if (bVar.f3593a == 2) {
                if (i3 < bVar.f3594b + bVar.f3596d) {
                    return -1;
                }
                i3 -= bVar.f3596d;
            } else if (bVar.f3593a == 1) {
                i3 += bVar.f3596d;
            }
            i2++;
        }
        return i3;
    }

    @Override // android.support.v7.widget.C0482at.a
    /* JADX INFO: renamed from: a */
    public b mo3996a(int i, int i2, int i3, Object obj) {
        b bVarMo1569a = this.f3591g.mo1569a();
        if (bVarMo1569a == null) {
            return new b(i, i2, i3, obj);
        }
        bVarMo1569a.f3593a = i;
        bVarMo1569a.f3594b = i2;
        bVarMo1569a.f3596d = i3;
        bVarMo1569a.f3595c = obj;
        return bVarMo1569a;
    }

    /* JADX INFO: renamed from: a */
    void m4632a() {
        m4634a(this.f3585a);
        m4634a(this.f3586b);
        this.f3592h = 0;
    }

    @Override // android.support.v7.widget.C0482at.a
    /* JADX INFO: renamed from: a */
    public void mo3997a(b bVar) {
        if (this.f3589e) {
            return;
        }
        bVar.f3595c = null;
        this.f3591g.mo1570a(bVar);
    }

    /* JADX INFO: renamed from: a */
    void m4633a(b bVar, int i) {
        this.f3587c.mo4146a(bVar);
        switch (bVar.f3593a) {
            case 2:
                this.f3587c.mo4144a(i, bVar.f3596d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                this.f3587c.mo4145a(i, bVar.f3596d, bVar.f3595c);
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    void m4634a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3997a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: a */
    boolean m4635a(int i) {
        return (this.f3592h & i) != 0;
    }

    /* JADX INFO: renamed from: b */
    int m4636b(int i) {
        return m4631a(i, 0);
    }

    /* JADX INFO: renamed from: b */
    void m4637b() {
        this.f3590f.m3993a(this.f3585a);
        int size = this.f3585a.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f3585a.get(i);
            switch (bVar.f3593a) {
                case 1:
                    m4629f(bVar);
                    break;
                case 2:
                    m4625c(bVar);
                    break;
                case 4:
                    m4626d(bVar);
                    break;
                case 8:
                    m4624b(bVar);
                    break;
            }
            if (this.f3588d != null) {
                this.f3588d.run();
            }
        }
        this.f3585a.clear();
    }

    /* JADX INFO: renamed from: c */
    public int m4638c(int i) {
        int size = this.f3585a.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f3585a.get(i3);
            switch (bVar.f3593a) {
                case 1:
                    if (bVar.f3594b <= i2) {
                        i2 += bVar.f3596d;
                    }
                    break;
                case 2:
                    if (bVar.f3594b > i2) {
                        continue;
                    } else {
                        if (bVar.f3594b + bVar.f3596d > i2) {
                            return -1;
                        }
                        i2 -= bVar.f3596d;
                    }
                    break;
                case 8:
                    if (bVar.f3594b == i2) {
                        i2 = bVar.f3596d;
                    } else {
                        if (bVar.f3594b < i2) {
                            i2--;
                        }
                        if (bVar.f3596d <= i2) {
                            i2++;
                        }
                    }
                    break;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    void m4639c() {
        int size = this.f3586b.size();
        for (int i = 0; i < size; i++) {
            this.f3587c.mo4148b(this.f3586b.get(i));
        }
        m4634a(this.f3586b);
        this.f3592h = 0;
    }

    /* JADX INFO: renamed from: d */
    boolean m4640d() {
        return this.f3585a.size() > 0;
    }

    /* JADX INFO: renamed from: e */
    void m4641e() {
        m4639c();
        int size = this.f3585a.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f3585a.get(i);
            switch (bVar.f3593a) {
                case 1:
                    this.f3587c.mo4148b(bVar);
                    this.f3587c.mo4149c(bVar.f3594b, bVar.f3596d);
                    break;
                case 2:
                    this.f3587c.mo4148b(bVar);
                    this.f3587c.mo4144a(bVar.f3594b, bVar.f3596d);
                    break;
                case 4:
                    this.f3587c.mo4148b(bVar);
                    this.f3587c.mo4145a(bVar.f3594b, bVar.f3596d, bVar.f3595c);
                    break;
                case 8:
                    this.f3587c.mo4148b(bVar);
                    this.f3587c.mo4151d(bVar.f3594b, bVar.f3596d);
                    break;
            }
            if (this.f3588d != null) {
                this.f3588d.run();
            }
        }
        m4634a(this.f3585a);
        this.f3592h = 0;
    }

    /* JADX INFO: renamed from: f */
    boolean m4642f() {
        return (this.f3586b.isEmpty() || this.f3585a.isEmpty()) ? false : true;
    }
}
