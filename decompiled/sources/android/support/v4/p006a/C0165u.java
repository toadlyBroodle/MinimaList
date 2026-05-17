package android.support.v4.p006a;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.p006a.C0148d;
import android.support.v4.p018i.C0207a;
import android.support.v4.p019j.C0246q;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.a.u */
/* JADX INFO: loaded from: classes.dex */
class C0165u {

    /* JADX INFO: renamed from: a */
    private static final int[] f979a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* JADX INFO: renamed from: b */
    private static final AbstractC0167w f980b;

    /* JADX INFO: renamed from: c */
    private static final AbstractC0167w f981c;

    /* JADX INFO: renamed from: android.support.v4.a.u$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public ComponentCallbacksC0154j f1010a;

        /* JADX INFO: renamed from: b */
        public boolean f1011b;

        /* JADX INFO: renamed from: c */
        public C0148d f1012c;

        /* JADX INFO: renamed from: d */
        public ComponentCallbacksC0154j f1013d;

        /* JADX INFO: renamed from: e */
        public boolean f1014e;

        /* JADX INFO: renamed from: f */
        public C0148d f1015f;

        a() {
        }
    }

    static {
        f980b = Build.VERSION.SDK_INT >= 21 ? new C0166v() : null;
        f981c = m1214a();
    }

    /* JADX INFO: renamed from: a */
    private static a m1213a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0167w m1214a() {
        try {
            return (AbstractC0167w) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0167w m1215a(ComponentCallbacksC0154j componentCallbacksC0154j, ComponentCallbacksC0154j componentCallbacksC0154j2) {
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0154j != null) {
            Object objM887A = componentCallbacksC0154j.m887A();
            if (objM887A != null) {
                arrayList.add(objM887A);
            }
            Object objM988z = componentCallbacksC0154j.m988z();
            if (objM988z != null) {
                arrayList.add(objM988z);
            }
            Object objM890D = componentCallbacksC0154j.m890D();
            if (objM890D != null) {
                arrayList.add(objM890D);
            }
        }
        if (componentCallbacksC0154j2 != null) {
            Object objM987y = componentCallbacksC0154j2.m987y();
            if (objM987y != null) {
                arrayList.add(objM987y);
            }
            Object objM888B = componentCallbacksC0154j2.m888B();
            if (objM888B != null) {
                arrayList.add(objM888B);
            }
            Object objM889C = componentCallbacksC0154j2.m889C();
            if (objM889C != null) {
                arrayList.add(objM889C);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f980b != null && m1236a(f980b, arrayList)) {
            return f980b;
        }
        if (f981c != null && m1236a(f981c, arrayList)) {
            return f981c;
        }
        if (f980b == null && f981c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* JADX INFO: renamed from: a */
    private static C0207a<String, String> m1216a(int i, ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0207a<String, String> c0207a = new C0207a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0148d c0148d = arrayList.get(i4);
            if (c0148d.m851b(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                if (c0148d.f765r != null) {
                    int size = c0148d.f765r.size();
                    if (zBooleanValue) {
                        arrayList3 = c0148d.f765r;
                        arrayList4 = c0148d.f766s;
                    } else {
                        ArrayList<String> arrayList5 = c0148d.f765r;
                        arrayList3 = c0148d.f766s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String strRemove = c0207a.remove(str2);
                        if (strRemove != null) {
                            c0207a.put(str, strRemove);
                        } else {
                            c0207a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0207a;
    }

    /* JADX INFO: renamed from: a */
    private static Object m1219a(AbstractC0167w abstractC0167w, ComponentCallbacksC0154j componentCallbacksC0154j, ComponentCallbacksC0154j componentCallbacksC0154j2, boolean z) {
        if (componentCallbacksC0154j == null || componentCallbacksC0154j2 == null) {
            return null;
        }
        return abstractC0167w.mo581c(abstractC0167w.mo576b(z ? componentCallbacksC0154j2.m890D() : componentCallbacksC0154j.m889C()));
    }

    /* JADX INFO: renamed from: a */
    private static Object m1220a(AbstractC0167w abstractC0167w, ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (componentCallbacksC0154j == null) {
            return null;
        }
        return abstractC0167w.mo576b(z ? componentCallbacksC0154j.m888B() : componentCallbacksC0154j.m987y());
    }

    /* JADX INFO: renamed from: a */
    private static Object m1221a(final AbstractC0167w abstractC0167w, ViewGroup viewGroup, View view, C0207a<String, String> c0207a, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final View viewM1238b;
        final ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f1010a;
        final ComponentCallbacksC0154j componentCallbacksC0154j2 = aVar.f1013d;
        if (componentCallbacksC0154j != null) {
            componentCallbacksC0154j.m981s().setVisibility(0);
        }
        if (componentCallbacksC0154j == null || componentCallbacksC0154j2 == null) {
            return null;
        }
        final boolean z = aVar.f1011b;
        Object objM1219a = c0207a.isEmpty() ? null : m1219a(abstractC0167w, componentCallbacksC0154j, componentCallbacksC0154j2, z);
        C0207a<String, View> c0207aM1237b = m1237b(abstractC0167w, c0207a, objM1219a, aVar);
        final C0207a<String, View> c0207aM1246c = m1246c(abstractC0167w, c0207a, objM1219a, aVar);
        if (c0207a.isEmpty()) {
            obj3 = null;
            if (c0207aM1237b != null) {
                c0207aM1237b.clear();
            }
            if (c0207aM1246c != null) {
                c0207aM1246c.clear();
            }
        } else {
            m1235a(arrayList, c0207aM1237b, c0207a.keySet());
            m1235a(arrayList2, c0207aM1246c, c0207a.values());
            obj3 = objM1219a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1243b(componentCallbacksC0154j, componentCallbacksC0154j2, z, c0207aM1237b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0167w.mo571a(obj3, view, arrayList);
            m1232a(abstractC0167w, obj3, obj2, c0207aM1237b, aVar.f1014e, aVar.f1015f);
            rect = new Rect();
            viewM1238b = m1238b(c0207aM1246c, aVar, obj, z);
            if (viewM1238b != null) {
                abstractC0167w.mo569a(obj, rect);
            }
        } else {
            rect = null;
            viewM1238b = null;
        }
        ViewOnAttachStateChangeListenerC0139ae.m805a(viewGroup, new Runnable() { // from class: android.support.v4.a.u.3
            @Override // java.lang.Runnable
            public void run() {
                C0165u.m1243b(componentCallbacksC0154j, componentCallbacksC0154j2, z, (C0207a<String, View>) c0207aM1246c, false);
                if (viewM1238b != null) {
                    abstractC0167w.m1253a(viewM1238b, rect);
                }
            }
        });
        return obj3;
    }

    /* JADX INFO: renamed from: a */
    private static Object m1222a(AbstractC0167w abstractC0167w, Object obj, Object obj2, Object obj3, ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        boolean zM892F = true;
        if (obj != null && obj2 != null && componentCallbacksC0154j != null) {
            zM892F = z ? componentCallbacksC0154j.m892F() : componentCallbacksC0154j.m891E();
        }
        return zM892F ? abstractC0167w.mo567a(obj2, obj, obj3) : abstractC0167w.mo577b(obj2, obj, obj3);
    }

    /* JADX INFO: renamed from: a */
    private static String m1223a(C0207a<String, String> c0207a, String str) {
        int size = c0207a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0207a.m1584c(i))) {
                return c0207a.m1583b(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m1225a(C0148d c0148d, C0148d.a aVar, SparseArray<a> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        a aVarM1213a;
        a aVarM1213a2;
        ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f770b;
        if (componentCallbacksC0154j == null || (i = componentCallbacksC0154j.f810G) == 0) {
            return;
        }
        switch (z ? f979a[aVar.f769a] : aVar.f769a) {
            case 1:
            case 7:
                z3 = true;
                z4 = false;
                z5 = false;
                z6 = z2 ? componentCallbacksC0154j.f828Y : (componentCallbacksC0154j.f843t || componentCallbacksC0154j.f812I) ? false : true;
                break;
            case 2:
            default:
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
                break;
            case 3:
            case 6:
                z3 = false;
                z4 = z2 ? !componentCallbacksC0154j.f843t && componentCallbacksC0154j.f820Q != null && componentCallbacksC0154j.f820Q.getVisibility() == 0 && componentCallbacksC0154j.f830aa >= 0.0f : componentCallbacksC0154j.f843t && !componentCallbacksC0154j.f812I;
                z5 = true;
                z6 = false;
                break;
            case 4:
                z3 = false;
                z4 = z2 ? componentCallbacksC0154j.f829Z && componentCallbacksC0154j.f843t && componentCallbacksC0154j.f812I : componentCallbacksC0154j.f843t && !componentCallbacksC0154j.f812I;
                z5 = true;
                z6 = false;
                break;
            case 5:
                z3 = true;
                z4 = false;
                z5 = false;
                z6 = z2 ? componentCallbacksC0154j.f829Z && !componentCallbacksC0154j.f812I && componentCallbacksC0154j.f843t : componentCallbacksC0154j.f812I;
                break;
        }
        a aVar2 = sparseArray.get(i);
        if (z6) {
            aVarM1213a = m1213a(aVar2, sparseArray, i);
            aVarM1213a.f1010a = componentCallbacksC0154j;
            aVarM1213a.f1011b = z;
            aVarM1213a.f1012c = c0148d;
        } else {
            aVarM1213a = aVar2;
        }
        if (!z2 && z3) {
            if (aVarM1213a != null && aVarM1213a.f1013d == componentCallbacksC0154j) {
                aVarM1213a.f1013d = null;
            }
            LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p = c0148d.f748a;
            if (componentCallbacksC0154j.f834k < 1 && layoutInflaterFactory2C0160p.f918l >= 1 && !c0148d.f767t) {
                layoutInflaterFactory2C0160p.m1169f(componentCallbacksC0154j);
                layoutInflaterFactory2C0160p.m1136a(componentCallbacksC0154j, 1, 0, 0, false);
            }
        }
        if (z4 && (aVarM1213a == null || aVarM1213a.f1013d == null)) {
            aVarM1213a2 = m1213a(aVarM1213a, sparseArray, i);
            aVarM1213a2.f1013d = componentCallbacksC0154j;
            aVarM1213a2.f1014e = z;
            aVarM1213a2.f1015f = c0148d;
        } else {
            aVarM1213a2 = aVarM1213a;
        }
        if (z2 || !z5 || aVarM1213a2 == null || aVarM1213a2.f1010a != componentCallbacksC0154j) {
            return;
        }
        aVarM1213a2.f1010a = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1226a(C0148d c0148d, SparseArray<a> sparseArray, boolean z) {
        int size = c0148d.f749b.size();
        for (int i = 0; i < size; i++) {
            m1225a(c0148d, c0148d.f749b.get(i), sparseArray, false, z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1228a(LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p, int i, a aVar, View view, C0207a<String, String> c0207a) {
        ComponentCallbacksC0154j componentCallbacksC0154j;
        ComponentCallbacksC0154j componentCallbacksC0154j2;
        AbstractC0167w abstractC0167wM1215a;
        ViewGroup viewGroup = layoutInflaterFactory2C0160p.f920n.mo991a() ? (ViewGroup) layoutInflaterFactory2C0160p.f920n.mo990a(i) : null;
        if (viewGroup == null || (abstractC0167wM1215a = m1215a((componentCallbacksC0154j2 = aVar.f1013d), (componentCallbacksC0154j = aVar.f1010a))) == null) {
            return;
        }
        boolean z = aVar.f1011b;
        boolean z2 = aVar.f1014e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM1220a = m1220a(abstractC0167wM1215a, componentCallbacksC0154j, z);
        Object objM1239b = m1239b(abstractC0167wM1215a, componentCallbacksC0154j2, z2);
        Object objM1221a = m1221a(abstractC0167wM1215a, viewGroup, view, c0207a, aVar, arrayList2, arrayList, objM1220a, objM1239b);
        if (objM1220a == null && objM1221a == null && objM1239b == null) {
            return;
        }
        ArrayList<View> arrayListM1241b = m1241b(abstractC0167wM1215a, objM1239b, componentCallbacksC0154j2, arrayList2, view);
        ArrayList<View> arrayListM1241b2 = m1241b(abstractC0167wM1215a, objM1220a, componentCallbacksC0154j, arrayList, view);
        m1245b(arrayListM1241b2, 4);
        Object objM1222a = m1222a(abstractC0167wM1215a, objM1220a, objM1239b, objM1221a, componentCallbacksC0154j, z);
        if (objM1222a != null) {
            m1231a(abstractC0167wM1215a, objM1239b, componentCallbacksC0154j2, arrayListM1241b);
            ArrayList<String> arrayListM1252a = abstractC0167wM1215a.m1252a(arrayList);
            abstractC0167wM1215a.mo572a(objM1222a, objM1220a, arrayListM1241b2, objM1239b, arrayListM1241b, objM1221a, arrayList);
            abstractC0167wM1215a.mo568a(viewGroup, objM1222a);
            abstractC0167wM1215a.m1254a(viewGroup, arrayList2, arrayList, arrayListM1252a, c0207a);
            m1245b(arrayListM1241b2, 0);
            abstractC0167wM1215a.mo574a(objM1221a, arrayList2, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m1229a(LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p, ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (layoutInflaterFactory2C0160p.f918l < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0148d c0148d = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m1242b(c0148d, (SparseArray<a>) sparseArray, z);
            } else {
                m1226a(c0148d, (SparseArray<a>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(layoutInflaterFactory2C0160p.f919m.m1063g());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                C0207a<String, String> c0207aM1216a = m1216a(iKeyAt, arrayList, arrayList2, i, i2);
                a aVar = (a) sparseArray.valueAt(i4);
                if (z) {
                    m1228a(layoutInflaterFactory2C0160p, iKeyAt, aVar, view, c0207aM1216a);
                } else {
                    m1244b(layoutInflaterFactory2C0160p, iKeyAt, aVar, view, c0207aM1216a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1230a(final AbstractC0167w abstractC0167w, ViewGroup viewGroup, final ComponentCallbacksC0154j componentCallbacksC0154j, final View view, final ArrayList<View> arrayList, final Object obj, final ArrayList<View> arrayList2, final Object obj2, final ArrayList<View> arrayList3) {
        ViewOnAttachStateChangeListenerC0139ae.m805a(viewGroup, new Runnable() { // from class: android.support.v4.a.u.2
            @Override // java.lang.Runnable
            public void run() {
                if (obj != null) {
                    abstractC0167w.mo582c(obj, view);
                    arrayList2.addAll(C0165u.m1241b(abstractC0167w, obj, componentCallbacksC0154j, (ArrayList<View>) arrayList, view));
                }
                if (arrayList3 != null) {
                    if (obj2 != null) {
                        ArrayList<View> arrayList4 = new ArrayList<>();
                        arrayList4.add(view);
                        abstractC0167w.mo580b(obj2, arrayList3, arrayList4);
                    }
                    arrayList3.clear();
                    arrayList3.add(view);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m1231a(AbstractC0167w abstractC0167w, Object obj, ComponentCallbacksC0154j componentCallbacksC0154j, final ArrayList<View> arrayList) {
        if (componentCallbacksC0154j != null && obj != null && componentCallbacksC0154j.f843t && componentCallbacksC0154j.f812I && componentCallbacksC0154j.f829Z) {
            componentCallbacksC0154j.m968j(true);
            abstractC0167w.mo579b(obj, componentCallbacksC0154j.m981s(), arrayList);
            ViewOnAttachStateChangeListenerC0139ae.m805a(componentCallbacksC0154j.f819P, new Runnable() { // from class: android.support.v4.a.u.1
                @Override // java.lang.Runnable
                public void run() {
                    C0165u.m1245b(arrayList, 4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1232a(AbstractC0167w abstractC0167w, Object obj, Object obj2, C0207a<String, View> c0207a, boolean z, C0148d c0148d) {
        if (c0148d.f765r == null || c0148d.f765r.isEmpty()) {
            return;
        }
        View view = c0207a.get(z ? c0148d.f766s.get(0) : c0148d.f765r.get(0));
        abstractC0167w.mo570a(obj, view);
        if (obj2 != null) {
            abstractC0167w.mo570a(obj2, view);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1233a(C0207a<String, String> c0207a, C0207a<String, View> c0207a2) {
        for (int size = c0207a.size() - 1; size >= 0; size--) {
            if (!c0207a2.containsKey(c0207a.m1584c(size))) {
                c0207a.m1585d(size);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1235a(ArrayList<View> arrayList, C0207a<String, View> c0207a, Collection<String> collection) {
        for (int size = c0207a.size() - 1; size >= 0; size--) {
            View viewC = c0207a.m1584c(size);
            if (collection.contains(C0246q.m1767m(viewC))) {
                arrayList.add(viewC);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1236a(AbstractC0167w abstractC0167w, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0167w.mo575a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static C0207a<String, View> m1237b(AbstractC0167w abstractC0167w, C0207a<String, String> c0207a, Object obj, a aVar) {
        ArrayList<String> arrayList;
        AbstractC0142ah abstractC0142ah;
        if (c0207a.isEmpty() || obj == null) {
            c0207a.clear();
            return null;
        }
        ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f1013d;
        C0207a<String, View> c0207a2 = new C0207a<>();
        abstractC0167w.m1258a((Map<String, View>) c0207a2, componentCallbacksC0154j.m981s());
        C0148d c0148d = aVar.f1015f;
        if (aVar.f1014e) {
            AbstractC0142ah abstractC0142ahM908V = componentCallbacksC0154j.m908V();
            arrayList = c0148d.f766s;
            abstractC0142ah = abstractC0142ahM908V;
        } else {
            AbstractC0142ah abstractC0142ahM909W = componentCallbacksC0154j.m909W();
            arrayList = c0148d.f765r;
            abstractC0142ah = abstractC0142ahM909W;
        }
        c0207a2.m1510a((Collection<?>) arrayList);
        if (abstractC0142ah != null) {
            abstractC0142ah.m816a(arrayList, c0207a2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0207a2.get(str);
                if (view == null) {
                    c0207a.remove(str);
                } else if (!str.equals(C0246q.m1767m(view))) {
                    c0207a.put(C0246q.m1767m(view), c0207a.remove(str));
                }
            }
        } else {
            c0207a.m1510a((Collection<?>) c0207a2.keySet());
        }
        return c0207a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static View m1238b(C0207a<String, View> c0207a, a aVar, Object obj, boolean z) {
        C0148d c0148d = aVar.f1012c;
        if (obj == null || c0207a == null || c0148d.f765r == null || c0148d.f765r.isEmpty()) {
            return null;
        }
        return c0207a.get(z ? c0148d.f765r.get(0) : c0148d.f766s.get(0));
    }

    /* JADX INFO: renamed from: b */
    private static Object m1239b(AbstractC0167w abstractC0167w, ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (componentCallbacksC0154j == null) {
            return null;
        }
        return abstractC0167w.mo576b(z ? componentCallbacksC0154j.m988z() : componentCallbacksC0154j.m887A());
    }

    /* JADX INFO: renamed from: b */
    private static Object m1240b(final AbstractC0167w abstractC0167w, ViewGroup viewGroup, final View view, final C0207a<String, String> c0207a, final a aVar, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f1010a;
        final ComponentCallbacksC0154j componentCallbacksC0154j2 = aVar.f1013d;
        if (componentCallbacksC0154j == null || componentCallbacksC0154j2 == null) {
            return null;
        }
        final boolean z = aVar.f1011b;
        Object objM1219a = c0207a.isEmpty() ? null : m1219a(abstractC0167w, componentCallbacksC0154j, componentCallbacksC0154j2, z);
        C0207a<String, View> c0207aM1237b = m1237b(abstractC0167w, c0207a, objM1219a, aVar);
        if (c0207a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(c0207aM1237b.values());
            obj3 = objM1219a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1243b(componentCallbacksC0154j, componentCallbacksC0154j2, z, c0207aM1237b, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0167w.mo571a(obj3, view, arrayList);
            m1232a(abstractC0167w, obj3, obj2, c0207aM1237b, aVar.f1014e, aVar.f1015f);
            if (obj != null) {
                abstractC0167w.mo569a(obj, rect);
            }
        } else {
            rect = null;
        }
        final Object obj4 = obj3;
        ViewOnAttachStateChangeListenerC0139ae.m805a(viewGroup, new Runnable() { // from class: android.support.v4.a.u.4
            @Override // java.lang.Runnable
            public void run() {
                C0207a c0207aM1246c = C0165u.m1246c(abstractC0167w, c0207a, obj4, aVar);
                if (c0207aM1246c != null) {
                    arrayList2.addAll(c0207aM1246c.values());
                    arrayList2.add(view);
                }
                C0165u.m1243b(componentCallbacksC0154j, componentCallbacksC0154j2, z, (C0207a<String, View>) c0207aM1246c, false);
                if (obj4 != null) {
                    abstractC0167w.mo574a(obj4, arrayList, arrayList2);
                    View viewM1238b = C0165u.m1238b((C0207a<String, View>) c0207aM1246c, aVar, obj, z);
                    if (viewM1238b != null) {
                        abstractC0167w.m1253a(viewM1238b, rect);
                    }
                }
            }
        });
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static ArrayList<View> m1241b(AbstractC0167w abstractC0167w, Object obj, ComponentCallbacksC0154j componentCallbacksC0154j, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            View viewM981s = componentCallbacksC0154j.m981s();
            if (viewM981s != null) {
                abstractC0167w.m1257a(arrayList2, viewM981s);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC0167w.mo573a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1242b(C0148d c0148d, SparseArray<a> sparseArray, boolean z) {
        if (c0148d.f748a.f920n.mo991a()) {
            for (int size = c0148d.f749b.size() - 1; size >= 0; size--) {
                m1225a(c0148d, c0148d.f749b.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m1243b(ComponentCallbacksC0154j componentCallbacksC0154j, ComponentCallbacksC0154j componentCallbacksC0154j2, boolean z, C0207a<String, View> c0207a, boolean z2) {
        AbstractC0142ah abstractC0142ahM908V = z ? componentCallbacksC0154j2.m908V() : componentCallbacksC0154j.m908V();
        if (abstractC0142ahM908V != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0207a == null ? 0 : c0207a.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0207a.m1583b(i));
                arrayList.add(c0207a.m1584c(i));
            }
            if (z2) {
                abstractC0142ahM908V.m815a(arrayList2, arrayList, null);
            } else {
                abstractC0142ahM908V.m817b(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1244b(LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p, int i, a aVar, View view, C0207a<String, String> c0207a) {
        ComponentCallbacksC0154j componentCallbacksC0154j;
        ComponentCallbacksC0154j componentCallbacksC0154j2;
        AbstractC0167w abstractC0167wM1215a;
        ViewGroup viewGroup = layoutInflaterFactory2C0160p.f920n.mo991a() ? (ViewGroup) layoutInflaterFactory2C0160p.f920n.mo990a(i) : null;
        if (viewGroup == null || (abstractC0167wM1215a = m1215a((componentCallbacksC0154j2 = aVar.f1013d), (componentCallbacksC0154j = aVar.f1010a))) == null) {
            return;
        }
        boolean z = aVar.f1011b;
        boolean z2 = aVar.f1014e;
        Object objM1220a = m1220a(abstractC0167wM1215a, componentCallbacksC0154j, z);
        Object objM1239b = m1239b(abstractC0167wM1215a, componentCallbacksC0154j2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM1240b = m1240b(abstractC0167wM1215a, viewGroup, view, c0207a, aVar, arrayList, arrayList2, objM1220a, objM1239b);
        if (objM1220a == null && objM1240b == null && objM1239b == null) {
            return;
        }
        ArrayList<View> arrayListM1241b = m1241b(abstractC0167wM1215a, objM1239b, componentCallbacksC0154j2, (ArrayList<View>) arrayList, view);
        Object obj = (arrayListM1241b == null || arrayListM1241b.isEmpty()) ? null : objM1239b;
        abstractC0167wM1215a.mo578b(objM1220a, view);
        Object objM1222a = m1222a(abstractC0167wM1215a, objM1220a, obj, objM1240b, componentCallbacksC0154j, aVar.f1011b);
        if (objM1222a != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            abstractC0167wM1215a.mo572a(objM1222a, objM1220a, arrayList3, obj, arrayListM1241b, objM1240b, arrayList2);
            m1230a(abstractC0167wM1215a, viewGroup, componentCallbacksC0154j, view, arrayList2, objM1220a, arrayList3, obj, arrayListM1241b);
            abstractC0167wM1215a.m1255a((View) viewGroup, arrayList2, (Map<String, String>) c0207a);
            abstractC0167wM1215a.mo568a(viewGroup, objM1222a);
            abstractC0167wM1215a.m1256a(viewGroup, arrayList2, (Map<String, String>) c0207a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m1245b(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static C0207a<String, View> m1246c(AbstractC0167w abstractC0167w, C0207a<String, String> c0207a, Object obj, a aVar) {
        ArrayList<String> arrayList;
        AbstractC0142ah abstractC0142ah;
        String strM1223a;
        ComponentCallbacksC0154j componentCallbacksC0154j = aVar.f1010a;
        View viewM981s = componentCallbacksC0154j.m981s();
        if (c0207a.isEmpty() || obj == null || viewM981s == null) {
            c0207a.clear();
            return null;
        }
        C0207a<String, View> c0207a2 = new C0207a<>();
        abstractC0167w.m1258a((Map<String, View>) c0207a2, viewM981s);
        C0148d c0148d = aVar.f1012c;
        if (aVar.f1011b) {
            AbstractC0142ah abstractC0142ahM909W = componentCallbacksC0154j.m909W();
            arrayList = c0148d.f765r;
            abstractC0142ah = abstractC0142ahM909W;
        } else {
            AbstractC0142ah abstractC0142ahM908V = componentCallbacksC0154j.m908V();
            arrayList = c0148d.f766s;
            abstractC0142ah = abstractC0142ahM908V;
        }
        if (arrayList != null) {
            c0207a2.m1510a((Collection<?>) arrayList);
        }
        if (abstractC0142ah != null) {
            abstractC0142ah.m816a(arrayList, c0207a2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0207a2.get(str);
                if (view == null) {
                    String strM1223a2 = m1223a(c0207a, str);
                    if (strM1223a2 != null) {
                        c0207a.remove(strM1223a2);
                    }
                } else if (!str.equals(C0246q.m1767m(view)) && (strM1223a = m1223a(c0207a, str)) != null) {
                    c0207a.put(strM1223a, C0246q.m1767m(view));
                }
            }
        } else {
            m1233a(c0207a, c0207a2);
        }
        return c0207a2;
    }
}
