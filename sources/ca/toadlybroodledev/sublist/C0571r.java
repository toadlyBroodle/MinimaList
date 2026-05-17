package ca.toadlybroodledev.sublist;

import android.util.Log;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0552d;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.r */
/* JADX INFO: loaded from: classes.dex */
public class C0571r {

    /* JADX INFO: renamed from: a */
    InterfaceC0552d f3986a;

    /* JADX INFO: renamed from: b */
    protected ArrayList<C0557d> f3987b;

    /* JADX INFO: renamed from: d */
    private InterfaceC0549a f3989d;

    /* JADX INFO: renamed from: c */
    private final String f3988c = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    private ArrayList<C0557d> f3990e = new ArrayList<>();

    public C0571r(InterfaceC0549a interfaceC0549a, InterfaceC0552d interfaceC0552d, ArrayList<C0554a> arrayList) {
        this.f3989d = interfaceC0549a;
        this.f3986a = interfaceC0552d;
        if (arrayList != null) {
            Iterator<C0554a> it = arrayList.iterator();
            while (it.hasNext()) {
                m4991a(it.next());
            }
        }
        this.f3987b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: j */
    private C0557d m4985j(C0557d c0557d) {
        int iM4859a = c0557d.m4859a();
        for (int iIndexOf = this.f3987b.indexOf(c0557d) - 1; iIndexOf >= 0; iIndexOf--) {
            C0557d c0557d2 = this.f3987b.get(iIndexOf);
            if (c0557d2.m4859a() == iM4859a || c0557d2.m4859a() == iM4859a - 1) {
                return c0557d2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private C0557d m4986k(C0557d c0557d) {
        int iM4859a = c0557d.m4859a();
        int iIndexOf = this.f3987b.indexOf(c0557d) + 1;
        while (true) {
            int i = iIndexOf;
            if (i >= this.f3987b.size()) {
                return null;
            }
            C0557d c0557d2 = this.f3987b.get(i);
            if (c0557d2.m4859a() == iM4859a) {
                return c0557d2;
            }
            if (c0557d2.m4859a() == iM4859a - 1) {
                return null;
            }
            iIndexOf = i + 1;
        }
    }

    /* JADX INFO: renamed from: l */
    private C0557d m4987l(C0557d c0557d) {
        try {
            return this.f3987b.get(this.f3987b.indexOf(c0557d) - 1);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<C0557d> m4988a() {
        return this.f3990e;
    }

    /* JADX INFO: renamed from: a */
    void m4989a(int i, C0557d c0557d) {
        this.f3990e.add(i, c0557d);
        this.f3989d.mo4763a(c0557d);
        if (C0563j.m4893aj() != -1) {
            C0563j.m4898d(1);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m4990a(int i, ArrayList<C0557d> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f3990e.add(i + i2, arrayList.get(i2));
            if (C0563j.m4893aj() != -1) {
                C0563j.m4898d(1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m4991a(C0554a c0554a) {
        if (c0554a != null) {
            this.f3990e.add(new C0557d(this.f3989d, this.f3986a, c0554a));
        } else {
            C0557d c0557d = new C0557d(this.f3989d, this.f3986a, new C0554a(0, "", false, false, 0L, false));
            this.f3990e.add(c0557d);
            try {
                this.f3989d.mo4763a(c0557d);
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m4992a(C0557d c0557d) {
        if (this.f3990e.contains(c0557d)) {
            AbstractC0565l.m4920a(this.f3986a.mo4848ae(), this.f3990e, c0557d);
            if (C0566m.f3952o) {
                ArrayList<C0557d> arrayListM5004h = m5004h(c0557d);
                AbstractC0565l.m4921a(arrayListM5004h);
                Iterator<C0557d> it = arrayListM5004h.iterator();
                while (it.hasNext()) {
                    this.f3990e.remove(it.next());
                    if (C0563j.m4893aj() != -1) {
                        C0563j.m4898d(-1);
                    }
                }
            }
            this.f3990e.remove(c0557d);
            if (C0563j.m4893aj() != -1) {
                C0563j.m4898d(-1);
            }
            this.f3989d.mo4763a((C0557d) null);
        }
    }

    /* JADX INFO: renamed from: a */
    void m4993a(C0557d c0557d, int i) {
        int iM4859a = c0557d.m4859a() + i;
        for (C0557d c0557d2 : m5004h(c0557d)) {
            c0557d2.m4860a(c0557d2.m4859a() + i);
        }
        c0557d.m4860a(iM4859a);
    }

    /* JADX INFO: renamed from: a */
    void m4994a(C0557d c0557d, boolean z) {
        ArrayList<C0557d> arrayListM5004h = m5004h(c0557d);
        if (arrayListM5004h == null || arrayListM5004h.size() == 0) {
            return;
        }
        c0557d.f3824g = z;
        this.f3986a.mo4852am();
    }

    /* JADX INFO: renamed from: b */
    void m4995b() {
        C0557d c0557d = new C0557d(this.f3989d, this.f3986a, new C0554a(this.f3987b.get(0).m4859a(), "", false, false, 0L, false));
        m4989a(this.f3990e.indexOf(this.f3987b.get(this.f3987b.size() - 1)) + 1, c0557d);
        this.f3987b.add(c0557d);
    }

    /* JADX INFO: renamed from: b */
    void m4996b(C0557d c0557d, boolean z) {
        c0557d.f3823f = z;
        this.f3989d.mo4776n().m4865ac();
        if (C0566m.f3951n) {
            Iterator<C0557d> it = m5004h(c0557d).iterator();
            while (it.hasNext()) {
                it.next().f3823f = z;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    boolean m4997b(C0557d c0557d) {
        C0557d c0557dM4987l = m4987l(c0557d);
        if (C0563j.m4893aj() != -1 && (c0557dM4987l == null || c0557d.m4859a() <= this.f3987b.get(0).m4859a())) {
            return false;
        }
        if (c0557dM4987l != null || c0557d.m4859a() > 0) {
            return c0557d.m4859a() + (-1) >= 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    void m4998c() {
        ArrayList arrayList = new ArrayList();
        for (C0557d c0557d : this.f3990e) {
            if (c0557d.f3823f) {
                arrayList.add(c0557d);
            }
        }
        int size = this.f3990e.size();
        this.f3990e.removeAll(arrayList);
        Log.d(this.f3988c, "Completed entries deleted: " + (size - this.f3990e.size()));
    }

    /* JADX INFO: renamed from: c */
    boolean m4999c(C0557d c0557d) {
        C0557d c0557dM4987l = m4987l(c0557d);
        return c0557dM4987l != null && c0557d.m4859a() <= c0557dM4987l.m4859a();
    }

    /* JADX INFO: renamed from: d */
    boolean m5000d(C0557d c0557d) {
        C0557d c0557dM4985j = m4985j(c0557d);
        return c0557dM4985j != null && c0557dM4985j.m4859a() >= c0557d.m4859a() && this.f3987b.indexOf(c0557d) > this.f3987b.indexOf(c0557dM4985j);
    }

    /* JADX INFO: renamed from: e */
    boolean m5001e(C0557d c0557d) {
        return m4986k(c0557d) != null;
    }

    /* JADX INFO: renamed from: f */
    boolean m5002f(C0557d c0557d) {
        C0557d c0557dM4985j = m4985j(c0557d);
        int iIndexOf = c0557dM4985j == null ? this.f3990e.indexOf(c0557d) : this.f3990e.indexOf(c0557dM4985j);
        ArrayList<C0557d> arrayListM5004h = m5004h(c0557d);
        m4992a(c0557d);
        for (int size = arrayListM5004h.size() - 1; size >= 0; size--) {
            m4989a(iIndexOf, arrayListM5004h.get(size));
        }
        m4989a(iIndexOf, c0557d);
        return true;
    }

    /* JADX INFO: renamed from: g */
    boolean m5003g(C0557d c0557d) {
        C0557d c0557dM4986k = m4986k(c0557d);
        ArrayList<C0557d> arrayListM5004h = m5004h(c0557d);
        m4992a(c0557d);
        int size = m5004h(c0557dM4986k).size() + this.f3990e.indexOf(c0557dM4986k) + 1;
        for (int size2 = arrayListM5004h.size() - 1; size2 >= 0; size2--) {
            m4989a(size, arrayListM5004h.get(size2));
        }
        m4989a(size, c0557d);
        return true;
    }

    /* JADX INFO: renamed from: h */
    ArrayList<C0557d> m5004h(C0557d c0557d) {
        ArrayList<C0557d> arrayList = new ArrayList<>();
        if (c0557d == null) {
            return arrayList;
        }
        int iIndexOf = this.f3990e.indexOf(c0557d) + 1;
        while (true) {
            int i = iIndexOf;
            if (i >= this.f3990e.size()) {
                break;
            }
            C0557d c0557d2 = this.f3990e.get(i);
            if (c0557d2.m4859a() <= c0557d.m4859a()) {
                break;
            }
            arrayList.add(c0557d2);
            iIndexOf = i + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    int m5005i(C0557d c0557d) {
        ArrayList<C0557d> arrayListM5004h = m5004h(c0557d);
        return (arrayListM5004h == null || arrayListM5004h.size() == 0) ? this.f3990e.indexOf(c0557d) : this.f3990e.indexOf(c0557d) + m5004h(c0557d).size();
    }
}
