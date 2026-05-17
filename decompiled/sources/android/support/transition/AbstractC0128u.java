package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.v4.p018i.C0207a;
import android.support.v4.p018i.C0212f;
import android.support.v4.p019j.C0246q;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.transition.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0128u implements Cloneable {

    /* JADX INFO: renamed from: g */
    private static final int[] f607g = {2, 1, 3, 4};

    /* JADX INFO: renamed from: h */
    private static final AbstractC0119l f608h = new AbstractC0119l() { // from class: android.support.transition.u.1
        @Override // android.support.transition.AbstractC0119l
        /* JADX INFO: renamed from: a */
        public Path mo677a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* JADX INFO: renamed from: z */
    private static ThreadLocal<C0207a<Animator, a>> f609z = new ThreadLocal<>();

    /* JADX INFO: renamed from: H */
    private b f617H;

    /* JADX INFO: renamed from: I */
    private C0207a<String, String> f618I;

    /* JADX INFO: renamed from: f */
    AbstractC0131x f625f;

    /* JADX INFO: renamed from: x */
    private ArrayList<C0086aa> f641x;

    /* JADX INFO: renamed from: y */
    private ArrayList<C0086aa> f642y;

    /* JADX INFO: renamed from: i */
    private String f626i = getClass().getName();

    /* JADX INFO: renamed from: j */
    private long f627j = -1;

    /* JADX INFO: renamed from: a */
    long f620a = -1;

    /* JADX INFO: renamed from: k */
    private TimeInterpolator f628k = null;

    /* JADX INFO: renamed from: b */
    ArrayList<Integer> f621b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    ArrayList<View> f622c = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private ArrayList<String> f629l = null;

    /* JADX INFO: renamed from: m */
    private ArrayList<Class> f630m = null;

    /* JADX INFO: renamed from: n */
    private ArrayList<Integer> f631n = null;

    /* JADX INFO: renamed from: o */
    private ArrayList<View> f632o = null;

    /* JADX INFO: renamed from: p */
    private ArrayList<Class> f633p = null;

    /* JADX INFO: renamed from: q */
    private ArrayList<String> f634q = null;

    /* JADX INFO: renamed from: r */
    private ArrayList<Integer> f635r = null;

    /* JADX INFO: renamed from: s */
    private ArrayList<View> f636s = null;

    /* JADX INFO: renamed from: t */
    private ArrayList<Class> f637t = null;

    /* JADX INFO: renamed from: u */
    private C0087ab f638u = new C0087ab();

    /* JADX INFO: renamed from: v */
    private C0087ab f639v = new C0087ab();

    /* JADX INFO: renamed from: d */
    C0132y f623d = null;

    /* JADX INFO: renamed from: w */
    private int[] f640w = f607g;

    /* JADX INFO: renamed from: A */
    private ViewGroup f610A = null;

    /* JADX INFO: renamed from: e */
    boolean f624e = false;

    /* JADX INFO: renamed from: B */
    private ArrayList<Animator> f611B = new ArrayList<>();

    /* JADX INFO: renamed from: C */
    private int f612C = 0;

    /* JADX INFO: renamed from: D */
    private boolean f613D = false;

    /* JADX INFO: renamed from: E */
    private boolean f614E = false;

    /* JADX INFO: renamed from: F */
    private ArrayList<c> f615F = null;

    /* JADX INFO: renamed from: G */
    private ArrayList<Animator> f616G = new ArrayList<>();

    /* JADX INFO: renamed from: J */
    private AbstractC0119l f619J = f608h;

    /* JADX INFO: renamed from: android.support.transition.u$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        View f646a;

        /* JADX INFO: renamed from: b */
        String f647b;

        /* JADX INFO: renamed from: c */
        C0086aa f648c;

        /* JADX INFO: renamed from: d */
        InterfaceC0108aw f649d;

        /* JADX INFO: renamed from: e */
        AbstractC0128u f650e;

        a(View view, String str, AbstractC0128u abstractC0128u, InterfaceC0108aw interfaceC0108aw, C0086aa c0086aa) {
            this.f646a = view;
            this.f647b = str;
            this.f648c = c0086aa;
            this.f649d = interfaceC0108aw;
            this.f650e = abstractC0128u;
        }
    }

    /* JADX INFO: renamed from: android.support.transition.u$b */
    public static abstract class b {
    }

    /* JADX INFO: renamed from: android.support.transition.u$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo583a(AbstractC0128u abstractC0128u);

        /* JADX INFO: renamed from: b */
        void mo584b(AbstractC0128u abstractC0128u);

        /* JADX INFO: renamed from: c */
        void mo585c(AbstractC0128u abstractC0128u);

        /* JADX INFO: renamed from: d */
        void mo586d(AbstractC0128u abstractC0128u);
    }

    /* JADX INFO: renamed from: a */
    private void m687a(Animator animator, final C0207a<Animator, a> c0207a) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.u.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    c0207a.remove(animator2);
                    AbstractC0128u.this.f611B.remove(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    AbstractC0128u.this.f611B.add(animator2);
                }
            });
            m702a(animator);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m688a(C0087ab c0087ab, C0087ab c0087ab2) {
        C0207a<View, C0086aa> c0207a = new C0207a<>(c0087ab.f500a);
        C0207a<View, C0086aa> c0207a2 = new C0207a<>(c0087ab2.f500a);
        for (int i = 0; i < this.f640w.length; i++) {
            switch (this.f640w[i]) {
                case 1:
                    m690a(c0207a, c0207a2);
                    break;
                case 2:
                    m691a(c0207a, c0207a2, c0087ab.f503d, c0087ab2.f503d);
                    break;
                case 3:
                    m693a(c0207a, c0207a2, c0087ab.f501b, c0087ab2.f501b);
                    break;
                case 4:
                    m692a(c0207a, c0207a2, c0087ab.f502c, c0087ab2.f502c);
                    break;
            }
        }
        m695b(c0207a, c0207a2);
    }

    /* JADX INFO: renamed from: a */
    private static void m689a(C0087ab c0087ab, View view, C0086aa c0086aa) {
        c0087ab.f500a.put(view, c0086aa);
        int id = view.getId();
        if (id >= 0) {
            if (c0087ab.f501b.indexOfKey(id) >= 0) {
                c0087ab.f501b.put(id, null);
            } else {
                c0087ab.f501b.put(id, view);
            }
        }
        String strM1767m = C0246q.m1767m(view);
        if (strM1767m != null) {
            if (c0087ab.f503d.containsKey(strM1767m)) {
                c0087ab.f503d.put(strM1767m, null);
            } else {
                c0087ab.f503d.put(strM1767m, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0087ab.f502c.m1546c(itemIdAtPosition) < 0) {
                    C0246q.m1750a(view, true);
                    c0087ab.f502c.m1545b(itemIdAtPosition, view);
                    return;
                }
                View viewM1539a = c0087ab.f502c.m1539a(itemIdAtPosition);
                if (viewM1539a != null) {
                    C0246q.m1750a(viewM1539a, false);
                    c0087ab.f502c.m1545b(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m690a(C0207a<View, C0086aa> c0207a, C0207a<View, C0086aa> c0207a2) {
        C0086aa c0086aaRemove;
        for (int size = c0207a.size() - 1; size >= 0; size--) {
            View viewB = c0207a.m1583b(size);
            if (viewB != null && m708a(viewB) && (c0086aaRemove = c0207a2.remove(viewB)) != null && c0086aaRemove.f498b != null && m708a(c0086aaRemove.f498b)) {
                this.f641x.add(c0207a.m1585d(size));
                this.f642y.add(c0086aaRemove);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m691a(C0207a<View, C0086aa> c0207a, C0207a<View, C0086aa> c0207a2, C0207a<String, View> c0207a3, C0207a<String, View> c0207a4) {
        View view;
        int size = c0207a3.size();
        for (int i = 0; i < size; i++) {
            View viewC = c0207a3.m1584c(i);
            if (viewC != null && m708a(viewC) && (view = c0207a4.get(c0207a3.m1583b(i))) != null && m708a(view)) {
                C0086aa c0086aa = c0207a.get(viewC);
                C0086aa c0086aa2 = c0207a2.get(view);
                if (c0086aa != null && c0086aa2 != null) {
                    this.f641x.add(c0086aa);
                    this.f642y.add(c0086aa2);
                    c0207a.remove(viewC);
                    c0207a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m692a(C0207a<View, C0086aa> c0207a, C0207a<View, C0086aa> c0207a2, C0212f<View> c0212f, C0212f<View> c0212f2) {
        View viewM1539a;
        int iM1542b = c0212f.m1542b();
        for (int i = 0; i < iM1542b; i++) {
            View viewM1547c = c0212f.m1547c(i);
            if (viewM1547c != null && m708a(viewM1547c) && (viewM1539a = c0212f2.m1539a(c0212f.m1543b(i))) != null && m708a(viewM1539a)) {
                C0086aa c0086aa = c0207a.get(viewM1547c);
                C0086aa c0086aa2 = c0207a2.get(viewM1539a);
                if (c0086aa != null && c0086aa2 != null) {
                    this.f641x.add(c0086aa);
                    this.f642y.add(c0086aa2);
                    c0207a.remove(viewM1547c);
                    c0207a2.remove(viewM1539a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m693a(C0207a<View, C0086aa> c0207a, C0207a<View, C0086aa> c0207a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && m708a(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m708a(view)) {
                C0086aa c0086aa = c0207a.get(viewValueAt);
                C0086aa c0086aa2 = c0207a2.get(view);
                if (c0086aa != null && c0086aa2 != null) {
                    this.f641x.add(c0086aa);
                    this.f642y.add(c0086aa2);
                    c0207a.remove(viewValueAt);
                    c0207a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m694a(C0086aa c0086aa, C0086aa c0086aa2, String str) {
        Object obj = c0086aa.f497a.get(str);
        Object obj2 = c0086aa2.f497a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        return obj == null || obj2 == null || !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    private void m695b(C0207a<View, C0086aa> c0207a, C0207a<View, C0086aa> c0207a2) {
        for (int i = 0; i < c0207a.size(); i++) {
            C0086aa c0086aaC = c0207a.m1584c(i);
            if (m708a(c0086aaC.f498b)) {
                this.f641x.add(c0086aaC);
                this.f642y.add(null);
            }
        }
        for (int i2 = 0; i2 < c0207a2.size(); i2++) {
            C0086aa c0086aaC2 = c0207a2.m1584c(i2);
            if (m708a(c0086aaC2.f498b)) {
                this.f642y.add(c0086aaC2);
                this.f641x.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m696c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.f631n == null || !this.f631n.contains(Integer.valueOf(id))) {
            if (this.f632o == null || !this.f632o.contains(view)) {
                if (this.f633p != null) {
                    int size = this.f633p.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f633p.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0086aa c0086aa = new C0086aa();
                    c0086aa.f498b = view;
                    if (z) {
                        mo644a(c0086aa);
                    } else {
                        mo649b(c0086aa);
                    }
                    c0086aa.f499c.add(this);
                    mo716c(c0086aa);
                    if (z) {
                        m689a(this.f638u, view, c0086aa);
                    } else {
                        m689a(this.f639v, view, c0086aa);
                    }
                }
                if (view instanceof ViewGroup) {
                    if (this.f635r == null || !this.f635r.contains(Integer.valueOf(id))) {
                        if (this.f636s == null || !this.f636s.contains(view)) {
                            if (this.f637t != null) {
                                int size2 = this.f637t.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f637t.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m696c(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private static C0207a<Animator, a> m697o() {
        C0207a<Animator, a> c0207a = f609z.get();
        if (c0207a != null) {
            return c0207a;
        }
        C0207a<Animator, a> c0207a2 = new C0207a<>();
        f609z.set(c0207a2);
        return c0207a2;
    }

    /* JADX INFO: renamed from: a */
    public Animator mo641a(ViewGroup viewGroup, C0086aa c0086aa, C0086aa c0086aa2) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C0086aa m698a(View view, boolean z) {
        if (this.f623d != null) {
            return this.f623d.m698a(view, z);
        }
        return (z ? this.f638u : this.f639v).f500a.get(view);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0128u mo699a(long j) {
        this.f620a = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0128u mo700a(c cVar) {
        if (this.f615F == null) {
            this.f615F = new ArrayList<>();
        }
        this.f615F.add(cVar);
        return this;
    }

    /* JADX INFO: renamed from: a */
    String mo701a(String str) {
        String str2;
        String str3 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f620a != -1) {
            str3 = str3 + "dur(" + this.f620a + ") ";
        }
        if (this.f627j != -1) {
            str3 = str3 + "dly(" + this.f627j + ") ";
        }
        if (this.f628k != null) {
            str3 = str3 + "interp(" + this.f628k + ") ";
        }
        if (this.f621b.size() <= 0 && this.f622c.size() <= 0) {
            return str3;
        }
        String str4 = str3 + "tgts(";
        if (this.f621b.size() > 0) {
            str2 = str4;
            for (int i = 0; i < this.f621b.size(); i++) {
                if (i > 0) {
                    str2 = str2 + ", ";
                }
                str2 = str2 + this.f621b.get(i);
            }
        } else {
            str2 = str4;
        }
        if (this.f622c.size() > 0) {
            for (int i2 = 0; i2 < this.f622c.size(); i2++) {
                if (i2 > 0) {
                    str2 = str2 + ", ";
                }
                str2 = str2 + this.f622c.get(i2);
            }
        }
        return str2 + ")";
    }

    /* JADX INFO: renamed from: a */
    protected void m702a(Animator animator) {
        if (animator == null) {
            m726k();
            return;
        }
        if (m709b() >= 0) {
            animator.setDuration(m709b());
        }
        if (m714c() >= 0) {
            animator.setStartDelay(m714c());
        }
        if (m717d() != null) {
            animator.setInterpolator(m717d());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.u.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                AbstractC0128u.this.m726k();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo644a(C0086aa c0086aa);

    /* JADX INFO: renamed from: a */
    public void mo703a(b bVar) {
        this.f617H = bVar;
    }

    /* JADX INFO: renamed from: a */
    void m704a(ViewGroup viewGroup) {
        a aVar;
        this.f641x = new ArrayList<>();
        this.f642y = new ArrayList<>();
        m688a(this.f638u, this.f639v);
        C0207a<Animator, a> c0207aM697o = m697o();
        int size = c0207aM697o.size();
        InterfaceC0108aw interfaceC0108awM615b = C0098am.m615b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorB = c0207aM697o.m1583b(i);
            if (animatorB != null && (aVar = c0207aM697o.get(animatorB)) != null && aVar.f646a != null && interfaceC0108awM615b.equals(aVar.f649d)) {
                C0086aa c0086aa = aVar.f648c;
                View view = aVar.f646a;
                C0086aa c0086aaM698a = m698a(view, true);
                C0086aa c0086aaM710b = m710b(view, true);
                if (!(c0086aaM698a == null && c0086aaM710b == null) && aVar.f650e.mo645a(c0086aa, c0086aaM710b)) {
                    if (animatorB.isRunning() || animatorB.isStarted()) {
                        animatorB.cancel();
                    } else {
                        c0207aM697o.remove(animatorB);
                    }
                }
            }
        }
        mo705a(viewGroup, this.f638u, this.f639v, this.f641x, this.f642y);
        mo719e();
    }

    /* JADX INFO: renamed from: a */
    protected void mo705a(ViewGroup viewGroup, C0087ab c0087ab, C0087ab c0087ab2, ArrayList<C0086aa> arrayList, ArrayList<C0086aa> arrayList2) {
        Animator animatorMo641a;
        View view;
        C0086aa c0086aa;
        Animator animator;
        Animator animator2;
        C0207a<Animator, a> c0207aM697o = m697o();
        long jMin = Long.MAX_VALUE;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            C0086aa c0086aa2 = arrayList.get(i2);
            C0086aa c0086aa3 = arrayList2.get(i2);
            C0086aa c0086aa4 = (c0086aa2 == null || c0086aa2.f499c.contains(this)) ? c0086aa2 : null;
            C0086aa c0086aa5 = (c0086aa3 == null || c0086aa3.f499c.contains(this)) ? c0086aa3 : null;
            if (c0086aa4 != null || c0086aa5 != null) {
                if ((c0086aa4 == null || c0086aa5 == null || mo645a(c0086aa4, c0086aa5)) && (animatorMo641a = mo641a(viewGroup, c0086aa4, c0086aa5)) != null) {
                    C0086aa c0086aa6 = null;
                    if (c0086aa5 != null) {
                        View view2 = c0086aa5.f498b;
                        String[] strArrMo646a = mo646a();
                        if (view2 == null || strArrMo646a == null || strArrMo646a.length <= 0) {
                            animator2 = animatorMo641a;
                        } else {
                            C0086aa c0086aa7 = new C0086aa();
                            c0086aa7.f498b = view2;
                            C0086aa c0086aa8 = c0087ab2.f500a.get(view2);
                            if (c0086aa8 != null) {
                                for (int i3 = 0; i3 < strArrMo646a.length; i3++) {
                                    c0086aa7.f497a.put(strArrMo646a[i3], c0086aa8.f497a.get(strArrMo646a[i3]));
                                }
                            }
                            int size2 = c0207aM697o.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    c0086aa6 = c0086aa7;
                                    animator2 = animatorMo641a;
                                    break;
                                }
                                a aVar = c0207aM697o.get(c0207aM697o.m1583b(i4));
                                if (aVar.f648c != null && aVar.f646a == view2 && aVar.f647b.equals(m729n()) && aVar.f648c.equals(c0086aa7)) {
                                    animator2 = null;
                                    c0086aa6 = c0086aa7;
                                    break;
                                }
                                i4++;
                            }
                        }
                        c0086aa = c0086aa6;
                        animator = animator2;
                        view = view2;
                    } else {
                        view = c0086aa4.f498b;
                        c0086aa = null;
                        animator = animatorMo641a;
                    }
                    if (animator != null) {
                        if (this.f625f != null) {
                            long jM736a = this.f625f.m736a(viewGroup, this, c0086aa4, c0086aa5);
                            sparseIntArray.put(this.f616G.size(), (int) jM736a);
                            jMin = Math.min(jM736a, jMin);
                        }
                        c0207aM697o.put(animator, new a(view, m729n(), this, C0098am.m615b(viewGroup), c0086aa));
                        this.f616G.add(animator);
                    }
                }
            }
            i = i2 + 1;
        }
        if (jMin == 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= sparseIntArray.size()) {
                return;
            }
            Animator animator3 = this.f616G.get(sparseIntArray.keyAt(i6));
            animator3.setStartDelay((((long) sparseIntArray.valueAt(i6)) - jMin) + animator3.getStartDelay());
            i5 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    void m706a(ViewGroup viewGroup, boolean z) {
        m707a(z);
        if ((this.f621b.size() > 0 || this.f622c.size() > 0) && ((this.f629l == null || this.f629l.isEmpty()) && (this.f630m == null || this.f630m.isEmpty()))) {
            for (int i = 0; i < this.f621b.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.f621b.get(i).intValue());
                if (viewFindViewById != null) {
                    C0086aa c0086aa = new C0086aa();
                    c0086aa.f498b = viewFindViewById;
                    if (z) {
                        mo644a(c0086aa);
                    } else {
                        mo649b(c0086aa);
                    }
                    c0086aa.f499c.add(this);
                    mo716c(c0086aa);
                    if (z) {
                        m689a(this.f638u, viewFindViewById, c0086aa);
                    } else {
                        m689a(this.f639v, viewFindViewById, c0086aa);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f622c.size(); i2++) {
                View view = this.f622c.get(i2);
                C0086aa c0086aa2 = new C0086aa();
                c0086aa2.f498b = view;
                if (z) {
                    mo644a(c0086aa2);
                } else {
                    mo649b(c0086aa2);
                }
                c0086aa2.f499c.add(this);
                mo716c(c0086aa2);
                if (z) {
                    m689a(this.f638u, view, c0086aa2);
                } else {
                    m689a(this.f639v, view, c0086aa2);
                }
            }
        } else {
            m696c(viewGroup, z);
        }
        if (z || this.f618I == null) {
            return;
        }
        int size = this.f618I.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(this.f638u.f503d.remove(this.f618I.m1583b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList.get(i4);
            if (view2 != null) {
                this.f638u.f503d.put(this.f618I.m1584c(i4), view2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m707a(boolean z) {
        if (z) {
            this.f638u.f500a.clear();
            this.f638u.f501b.clear();
            this.f638u.f502c.m1548c();
        } else {
            this.f639v.f500a.clear();
            this.f639v.f501b.clear();
            this.f639v.f502c.m1548c();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo645a(C0086aa c0086aa, C0086aa c0086aa2) {
        boolean z;
        if (c0086aa == null || c0086aa2 == null) {
            return false;
        }
        String[] strArrMo646a = mo646a();
        if (strArrMo646a == null) {
            Iterator<String> it = c0086aa.f497a.keySet().iterator();
            while (it.hasNext()) {
                if (m694a(c0086aa, c0086aa2, it.next())) {
                    return true;
                }
            }
            return false;
        }
        int length = strArrMo646a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (m694a(c0086aa, c0086aa2, strArrMo646a[i])) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    boolean m708a(View view) {
        int id = view.getId();
        if (this.f631n != null && this.f631n.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f632o != null && this.f632o.contains(view)) {
            return false;
        }
        if (this.f633p != null) {
            int size = this.f633p.size();
            for (int i = 0; i < size; i++) {
                if (this.f633p.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f634q != null && C0246q.m1767m(view) != null && this.f634q.contains(C0246q.m1767m(view))) {
            return false;
        }
        if (this.f621b.size() == 0 && this.f622c.size() == 0 && ((this.f630m == null || this.f630m.isEmpty()) && (this.f629l == null || this.f629l.isEmpty()))) {
            return true;
        }
        if (this.f621b.contains(Integer.valueOf(id)) || this.f622c.contains(view)) {
            return true;
        }
        if (this.f629l != null && this.f629l.contains(C0246q.m1767m(view))) {
            return true;
        }
        if (this.f630m == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.f630m.size(); i2++) {
            if (this.f630m.get(i2).isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public String[] mo646a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public long m709b() {
        return this.f620a;
    }

    /* JADX INFO: renamed from: b */
    C0086aa m710b(View view, boolean z) {
        C0086aa c0086aa;
        if (this.f623d != null) {
            return this.f623d.m710b(view, z);
        }
        ArrayList<C0086aa> arrayList = z ? this.f641x : this.f642y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0086aa c0086aa2 = arrayList.get(i);
            if (c0086aa2 == null) {
                return null;
            }
            if (c0086aa2.f498b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            c0086aa = (z ? this.f642y : this.f641x).get(i);
        } else {
            c0086aa = null;
        }
        return c0086aa;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0128u mo711b(long j) {
        this.f627j = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0128u mo712b(c cVar) {
        if (this.f615F != null) {
            this.f615F.remove(cVar);
            if (this.f615F.size() == 0) {
                this.f615F = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0128u mo713b(View view) {
        this.f622c.add(view);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo649b(C0086aa c0086aa);

    /* JADX INFO: renamed from: c */
    public long m714c() {
        return this.f627j;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0128u mo715c(View view) {
        this.f622c.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: c */
    void mo716c(C0086aa c0086aa) {
        String[] strArrM738a;
        boolean z = false;
        if (this.f625f == null || c0086aa.f497a.isEmpty() || (strArrM738a = this.f625f.m738a()) == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= strArrM738a.length) {
                z = true;
                break;
            } else if (!c0086aa.f497a.containsKey(strArrM738a[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f625f.m737a(c0086aa);
    }

    /* JADX INFO: renamed from: d */
    public TimeInterpolator m717d() {
        return this.f628k;
    }

    /* JADX INFO: renamed from: d */
    public void mo718d(View view) {
        if (this.f614E) {
            return;
        }
        C0207a<Animator, a> c0207aM697o = m697o();
        int size = c0207aM697o.size();
        InterfaceC0108aw interfaceC0108awM615b = C0098am.m615b(view);
        for (int i = size - 1; i >= 0; i--) {
            a aVarC = c0207aM697o.m1584c(i);
            if (aVarC.f646a != null && interfaceC0108awM615b.equals(aVarC.f649d)) {
                C0085a.m587a(c0207aM697o.m1583b(i));
            }
        }
        if (this.f615F != null && this.f615F.size() > 0) {
            ArrayList arrayList = (ArrayList) this.f615F.clone();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((c) arrayList.get(i2)).mo584b(this);
            }
        }
        this.f613D = true;
    }

    /* JADX INFO: renamed from: e */
    protected void mo719e() {
        m725j();
        C0207a<Animator, a> c0207aM697o = m697o();
        for (Animator animator : this.f616G) {
            if (c0207aM697o.containsKey(animator)) {
                m725j();
                m687a(animator, c0207aM697o);
            }
        }
        this.f616G.clear();
        m726k();
    }

    /* JADX INFO: renamed from: e */
    public void mo720e(View view) {
        if (this.f613D) {
            if (!this.f614E) {
                C0207a<Animator, a> c0207aM697o = m697o();
                int size = c0207aM697o.size();
                InterfaceC0108aw interfaceC0108awM615b = C0098am.m615b(view);
                for (int i = size - 1; i >= 0; i--) {
                    a aVarC = c0207aM697o.m1584c(i);
                    if (aVarC.f646a != null && interfaceC0108awM615b.equals(aVarC.f649d)) {
                        C0085a.m589b(c0207aM697o.m1583b(i));
                    }
                }
                if (this.f615F != null && this.f615F.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f615F.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((c) arrayList.get(i2)).mo585c(this);
                    }
                }
            }
            this.f613D = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public List<Integer> m721f() {
        return this.f621b;
    }

    /* JADX INFO: renamed from: g */
    public List<View> m722g() {
        return this.f622c;
    }

    /* JADX INFO: renamed from: h */
    public List<String> m723h() {
        return this.f629l;
    }

    /* JADX INFO: renamed from: i */
    public List<Class> m724i() {
        return this.f630m;
    }

    /* JADX INFO: renamed from: j */
    protected void m725j() {
        if (this.f612C == 0) {
            if (this.f615F != null && this.f615F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f615F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).mo586d(this);
                }
            }
            this.f614E = false;
        }
        this.f612C++;
    }

    /* JADX INFO: renamed from: k */
    protected void m726k() {
        this.f612C--;
        if (this.f612C == 0) {
            if (this.f615F != null && this.f615F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f615F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).mo583a(this);
                }
            }
            for (int i2 = 0; i2 < this.f638u.f502c.m1542b(); i2++) {
                View viewM1547c = this.f638u.f502c.m1547c(i2);
                if (viewM1547c != null) {
                    C0246q.m1750a(viewM1547c, false);
                }
            }
            for (int i3 = 0; i3 < this.f639v.f502c.m1542b(); i3++) {
                View viewM1547c2 = this.f639v.f502c.m1547c(i3);
                if (viewM1547c2 != null) {
                    C0246q.m1750a(viewM1547c2, false);
                }
            }
            this.f614E = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public AbstractC0119l m727l() {
        return this.f619J;
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0128u clone() {
        try {
            AbstractC0128u abstractC0128u = (AbstractC0128u) super.clone();
            abstractC0128u.f616G = new ArrayList<>();
            abstractC0128u.f638u = new C0087ab();
            abstractC0128u.f639v = new C0087ab();
            abstractC0128u.f641x = null;
            abstractC0128u.f642y = null;
            return abstractC0128u;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public String m729n() {
        return this.f626i;
    }

    public String toString() {
        return mo701a("");
    }
}
