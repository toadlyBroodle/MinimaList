package android.support.v4.p006a;

import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v4.p006a.LayoutInflaterFactory2C0160p;
import android.support.v4.p018i.C0211e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v4.a.d */
/* JADX INFO: loaded from: classes.dex */
final class C0148d extends AbstractC0164t implements LayoutInflaterFactory2C0160p.f {

    /* JADX INFO: renamed from: a */
    final LayoutInflaterFactory2C0160p f748a;

    /* JADX INFO: renamed from: c */
    int f750c;

    /* JADX INFO: renamed from: d */
    int f751d;

    /* JADX INFO: renamed from: e */
    int f752e;

    /* JADX INFO: renamed from: f */
    int f753f;

    /* JADX INFO: renamed from: g */
    int f754g;

    /* JADX INFO: renamed from: h */
    int f755h;

    /* JADX INFO: renamed from: i */
    boolean f756i;

    /* JADX INFO: renamed from: k */
    String f758k;

    /* JADX INFO: renamed from: l */
    boolean f759l;

    /* JADX INFO: renamed from: n */
    int f761n;

    /* JADX INFO: renamed from: o */
    CharSequence f762o;

    /* JADX INFO: renamed from: p */
    int f763p;

    /* JADX INFO: renamed from: q */
    CharSequence f764q;

    /* JADX INFO: renamed from: r */
    ArrayList<String> f765r;

    /* JADX INFO: renamed from: s */
    ArrayList<String> f766s;

    /* JADX INFO: renamed from: u */
    ArrayList<Runnable> f768u;

    /* JADX INFO: renamed from: b */
    ArrayList<a> f749b = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    boolean f757j = true;

    /* JADX INFO: renamed from: m */
    int f760m = -1;

    /* JADX INFO: renamed from: t */
    boolean f767t = false;

    /* JADX INFO: renamed from: android.support.v4.a.d$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        int f769a;

        /* JADX INFO: renamed from: b */
        ComponentCallbacksC0154j f770b;

        /* JADX INFO: renamed from: c */
        int f771c;

        /* JADX INFO: renamed from: d */
        int f772d;

        /* JADX INFO: renamed from: e */
        int f773e;

        /* JADX INFO: renamed from: f */
        int f774f;

        a() {
        }

        a(int i, ComponentCallbacksC0154j componentCallbacksC0154j) {
            this.f769a = i;
            this.f770b = componentCallbacksC0154j;
        }
    }

    public C0148d(LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p) {
        this.f748a = layoutInflaterFactory2C0160p;
    }

    /* JADX INFO: renamed from: a */
    private void m832a(int i, ComponentCallbacksC0154j componentCallbacksC0154j, String str, int i2) {
        Class<?> cls = componentCallbacksC0154j.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        componentCallbacksC0154j.f804A = this.f748a;
        if (str != null) {
            if (componentCallbacksC0154j.f811H != null && !str.equals(componentCallbacksC0154j.f811H)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0154j + ": was " + componentCallbacksC0154j.f811H + " now " + str);
            }
            componentCallbacksC0154j.f811H = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0154j + " with tag " + str + " to container view with no id");
            }
            if (componentCallbacksC0154j.f809F != 0 && componentCallbacksC0154j.f809F != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0154j + ": was " + componentCallbacksC0154j.f809F + " now " + i);
            }
            componentCallbacksC0154j.f809F = i;
            componentCallbacksC0154j.f810G = i;
        }
        m841a(new a(i2, componentCallbacksC0154j));
    }

    /* JADX INFO: renamed from: b */
    private static boolean m833b(a aVar) {
        ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f770b;
        return (componentCallbacksC0154j == null || !componentCallbacksC0154j.f843t || componentCallbacksC0154j.f820Q == null || componentCallbacksC0154j.f813J || componentCallbacksC0154j.f812I || !componentCallbacksC0154j.m938aa()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    int m834a(boolean z) {
        if (this.f759l) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactory2C0160p.f901a) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0211e("FragmentManager"));
            m843a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.f759l = true;
        if (this.f756i) {
            this.f760m = this.f748a.m1127a(this);
        } else {
            this.f760m = -1;
        }
        this.f748a.m1142a(this, z);
        return this.f760m;
    }

    /* JADX INFO: renamed from: a */
    ComponentCallbacksC0154j m835a(ArrayList<ComponentCallbacksC0154j> arrayList, ComponentCallbacksC0154j componentCallbacksC0154j) {
        boolean z;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f749b.size()) {
                return componentCallbacksC0154j;
            }
            a aVar = this.f749b.get(i2);
            switch (aVar.f769a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f770b);
                    break;
                case 2:
                    ComponentCallbacksC0154j componentCallbacksC0154j2 = aVar.f770b;
                    int i3 = componentCallbacksC0154j2.f810G;
                    boolean z2 = false;
                    int size = arrayList.size() - 1;
                    ComponentCallbacksC0154j componentCallbacksC0154j3 = componentCallbacksC0154j;
                    int i4 = i2;
                    while (size >= 0) {
                        ComponentCallbacksC0154j componentCallbacksC0154j4 = arrayList.get(size);
                        if (componentCallbacksC0154j4.f810G != i3) {
                            z = z2;
                        } else if (componentCallbacksC0154j4 == componentCallbacksC0154j2) {
                            z = true;
                        } else {
                            if (componentCallbacksC0154j4 == componentCallbacksC0154j3) {
                                this.f749b.add(i4, new a(9, componentCallbacksC0154j4));
                                i4++;
                                componentCallbacksC0154j3 = null;
                            }
                            a aVar2 = new a(3, componentCallbacksC0154j4);
                            aVar2.f771c = aVar.f771c;
                            aVar2.f773e = aVar.f773e;
                            aVar2.f772d = aVar.f772d;
                            aVar2.f774f = aVar.f774f;
                            this.f749b.add(i4, aVar2);
                            arrayList.remove(componentCallbacksC0154j4);
                            i4++;
                            z = z2;
                        }
                        size--;
                        z2 = z;
                    }
                    if (z2) {
                        this.f749b.remove(i4);
                        i4--;
                    } else {
                        aVar.f769a = 1;
                        arrayList.add(componentCallbacksC0154j2);
                    }
                    i2 = i4;
                    componentCallbacksC0154j = componentCallbacksC0154j3;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f770b);
                    if (aVar.f770b == componentCallbacksC0154j) {
                        this.f749b.add(i2, new a(9, aVar.f770b));
                        i2++;
                        componentCallbacksC0154j = null;
                    }
                    break;
                case 8:
                    this.f749b.add(i2, new a(9, componentCallbacksC0154j));
                    i2++;
                    componentCallbacksC0154j = aVar.f770b;
                    break;
            }
            i = i2 + 1;
        }
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: a */
    public AbstractC0164t mo836a(int i, ComponentCallbacksC0154j componentCallbacksC0154j, String str) {
        m832a(i, componentCallbacksC0154j, str, 1);
        return this;
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: a */
    public AbstractC0164t mo837a(ComponentCallbacksC0154j componentCallbacksC0154j) {
        m841a(new a(3, componentCallbacksC0154j));
        return this;
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: a */
    public AbstractC0164t mo838a(ComponentCallbacksC0154j componentCallbacksC0154j, String str) {
        m832a(0, componentCallbacksC0154j, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m839a() {
        if (this.f768u != null) {
            int size = this.f768u.size();
            for (int i = 0; i < size; i++) {
                this.f768u.get(i).run();
            }
            this.f768u = null;
        }
    }

    /* JADX INFO: renamed from: a */
    void m840a(int i) {
        if (this.f756i) {
            if (LayoutInflaterFactory2C0160p.f901a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f749b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f749b.get(i2);
                if (aVar.f770b != null) {
                    aVar.f770b.f849z += i;
                    if (LayoutInflaterFactory2C0160p.f901a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f770b + " to " + aVar.f770b.f849z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m841a(a aVar) {
        this.f749b.add(aVar);
        aVar.f771c = this.f750c;
        aVar.f772d = this.f751d;
        aVar.f773e = this.f752e;
        aVar.f774f = this.f753f;
    }

    /* JADX INFO: renamed from: a */
    void m842a(ComponentCallbacksC0154j.c cVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f749b.size()) {
                return;
            }
            a aVar = this.f749b.get(i2);
            if (m833b(aVar)) {
                aVar.f770b.m930a(cVar);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m843a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m844a(str, printWriter, true);
    }

    /* JADX INFO: renamed from: a */
    public void m844a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f758k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f760m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f759l);
            if (this.f754g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f754g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f755h));
            }
            if (this.f750c != 0 || this.f751d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f750c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f751d));
            }
            if (this.f752e != 0 || this.f753f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f752e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f753f));
            }
            if (this.f761n != 0 || this.f762o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f761n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f762o);
            }
            if (this.f763p != 0 || this.f764q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f763p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f764q);
            }
        }
        if (this.f749b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.f749b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f749b.get(i);
            switch (aVar.f769a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f769a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f770b);
            if (z) {
                if (aVar.f771c != 0 || aVar.f772d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f771c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f772d));
                }
                if (aVar.f773e != 0 || aVar.f774f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f773e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f774f));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m845a(ArrayList<C0148d> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.f749b.size();
        int i4 = -1;
        int i5 = 0;
        while (i5 < size) {
            a aVar = this.f749b.get(i5);
            int i6 = aVar.f770b != null ? aVar.f770b.f810G : 0;
            if (i6 == 0 || i6 == i4) {
                i3 = i4;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    C0148d c0148d = arrayList.get(i7);
                    int size2 = c0148d.f749b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        a aVar2 = c0148d.f749b.get(i8);
                        if ((aVar2.f770b != null ? aVar2.f770b.f810G : 0) == i6) {
                            return true;
                        }
                    }
                }
                i3 = i6;
            }
            i5++;
            i4 = i3;
        }
        return false;
    }

    @Override // android.support.v4.p006a.LayoutInflaterFactory2C0160p.f
    /* JADX INFO: renamed from: a */
    public boolean mo846a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflaterFactory2C0160p.f901a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f756i) {
            return true;
        }
        this.f748a.m1151b(this);
        return true;
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: b */
    public int mo847b() {
        return m834a(false);
    }

    /* JADX INFO: renamed from: b */
    ComponentCallbacksC0154j m848b(ArrayList<ComponentCallbacksC0154j> arrayList, ComponentCallbacksC0154j componentCallbacksC0154j) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f749b.size()) {
                return componentCallbacksC0154j;
            }
            a aVar = this.f749b.get(i2);
            switch (aVar.f769a) {
                case 1:
                case 7:
                    arrayList.remove(aVar.f770b);
                    break;
                case 3:
                case 6:
                    arrayList.add(aVar.f770b);
                    break;
                case 8:
                    componentCallbacksC0154j = null;
                    break;
                case 9:
                    componentCallbacksC0154j = aVar.f770b;
                    break;
            }
            i = i2 + 1;
        }
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: b */
    public AbstractC0164t mo849b(ComponentCallbacksC0154j componentCallbacksC0154j) {
        m841a(new a(4, componentCallbacksC0154j));
        return this;
    }

    /* JADX INFO: renamed from: b */
    void m850b(boolean z) {
        for (int size = this.f749b.size() - 1; size >= 0; size--) {
            a aVar = this.f749b.get(size);
            ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f770b;
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m918a(LayoutInflaterFactory2C0160p.m1122d(this.f754g), this.f755h);
            }
            switch (aVar.f769a) {
                case 1:
                    componentCallbacksC0154j.m942b(aVar.f774f);
                    this.f748a.m1176h(componentCallbacksC0154j);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f769a);
                case 3:
                    componentCallbacksC0154j.m942b(aVar.f773e);
                    this.f748a.m1140a(componentCallbacksC0154j, false);
                    break;
                case 4:
                    componentCallbacksC0154j.m942b(aVar.f773e);
                    this.f748a.m1181j(componentCallbacksC0154j);
                    break;
                case 5:
                    componentCallbacksC0154j.m942b(aVar.f774f);
                    this.f748a.m1179i(componentCallbacksC0154j);
                    break;
                case 6:
                    componentCallbacksC0154j.m942b(aVar.f773e);
                    this.f748a.m1185l(componentCallbacksC0154j);
                    break;
                case 7:
                    componentCallbacksC0154j.m942b(aVar.f774f);
                    this.f748a.m1183k(componentCallbacksC0154j);
                    break;
                case 8:
                    this.f748a.m1191o(null);
                    break;
                case 9:
                    this.f748a.m1191o(componentCallbacksC0154j);
                    break;
            }
            if (!this.f767t && aVar.f769a != 3 && componentCallbacksC0154j != null) {
                this.f748a.m1167e(componentCallbacksC0154j);
            }
        }
        if (this.f767t || !z) {
            return;
        }
        this.f748a.m1131a(this.f748a.f918l, true);
    }

    /* JADX INFO: renamed from: b */
    boolean m851b(int i) {
        int size = this.f749b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f749b.get(i2);
            int i3 = aVar.f770b != null ? aVar.f770b.f810G : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: c */
    public int mo852c() {
        return m834a(true);
    }

    @Override // android.support.v4.p006a.AbstractC0164t
    /* JADX INFO: renamed from: c */
    public AbstractC0164t mo853c(ComponentCallbacksC0154j componentCallbacksC0154j) {
        m841a(new a(5, componentCallbacksC0154j));
        return this;
    }

    /* JADX INFO: renamed from: d */
    void m854d() {
        int size = this.f749b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f749b.get(i);
            ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f770b;
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m918a(this.f754g, this.f755h);
            }
            switch (aVar.f769a) {
                case 1:
                    componentCallbacksC0154j.m942b(aVar.f771c);
                    this.f748a.m1140a(componentCallbacksC0154j, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f769a);
                case 3:
                    componentCallbacksC0154j.m942b(aVar.f772d);
                    this.f748a.m1176h(componentCallbacksC0154j);
                    break;
                case 4:
                    componentCallbacksC0154j.m942b(aVar.f772d);
                    this.f748a.m1179i(componentCallbacksC0154j);
                    break;
                case 5:
                    componentCallbacksC0154j.m942b(aVar.f771c);
                    this.f748a.m1181j(componentCallbacksC0154j);
                    break;
                case 6:
                    componentCallbacksC0154j.m942b(aVar.f772d);
                    this.f748a.m1183k(componentCallbacksC0154j);
                    break;
                case 7:
                    componentCallbacksC0154j.m942b(aVar.f771c);
                    this.f748a.m1185l(componentCallbacksC0154j);
                    break;
                case 8:
                    this.f748a.m1191o(componentCallbacksC0154j);
                    break;
                case 9:
                    this.f748a.m1191o(null);
                    break;
            }
            if (!this.f767t && aVar.f769a != 1 && componentCallbacksC0154j != null) {
                this.f748a.m1167e(componentCallbacksC0154j);
            }
        }
        if (this.f767t) {
            return;
        }
        this.f748a.m1131a(this.f748a.f918l, true);
    }

    /* JADX INFO: renamed from: e */
    boolean m855e() {
        for (int i = 0; i < this.f749b.size(); i++) {
            if (m833b(this.f749b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m856f() {
        return this.f758k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f760m >= 0) {
            sb.append(" #");
            sb.append(this.f760m);
        }
        if (this.f758k != null) {
            sb.append(" ");
            sb.append(this.f758k);
        }
        sb.append("}");
        return sb.toString();
    }
}
