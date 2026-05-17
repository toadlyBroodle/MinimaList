package android.support.transition;

import android.graphics.Rect;
import android.support.transition.AbstractC0128u;
import android.support.v4.p006a.AbstractC0167w;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC0167w {
    /* JADX INFO: renamed from: a */
    private static boolean m566a(AbstractC0128u abstractC0128u) {
        return (m1250a((List) abstractC0128u.m721f()) && m1250a((List) abstractC0128u.m723h()) && m1250a((List) abstractC0128u.m724i())) ? false : true;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public Object mo567a(Object obj, Object obj2, Object obj3) {
        C0132y c0132y = new C0132y();
        if (obj != null) {
            c0132y.m746b((AbstractC0128u) obj);
        }
        if (obj2 != null) {
            c0132y.m746b((AbstractC0128u) obj2);
        }
        if (obj3 != null) {
            c0132y.m746b((AbstractC0128u) obj3);
        }
        return c0132y;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo568a(ViewGroup viewGroup, Object obj) {
        C0130w.m731a(viewGroup, (AbstractC0128u) obj);
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo569a(Object obj, final Rect rect) {
        if (obj != null) {
            ((AbstractC0128u) obj).mo703a(new AbstractC0128u.b() { // from class: android.support.transition.FragmentTransitionSupport.4
            });
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo570a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m1253a(view, rect);
            ((AbstractC0128u) obj).mo703a(new AbstractC0128u.b() { // from class: android.support.transition.FragmentTransitionSupport.1
            });
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo571a(Object obj, View view, ArrayList<View> arrayList) {
        C0132y c0132y = (C0132y) obj;
        List<View> listG = c0132y.m722g();
        listG.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1249a(listG, arrayList.get(i));
        }
        listG.add(view);
        arrayList.add(view);
        mo573a(c0132y, arrayList);
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo572a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((AbstractC0128u) obj).mo700a(new AbstractC0128u.c() { // from class: android.support.transition.FragmentTransitionSupport.3
            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: a */
            public void mo583a(AbstractC0128u abstractC0128u) {
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: b */
            public void mo584b(AbstractC0128u abstractC0128u) {
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: c */
            public void mo585c(AbstractC0128u abstractC0128u) {
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: d */
            public void mo586d(AbstractC0128u abstractC0128u) {
                if (obj2 != null) {
                    FragmentTransitionSupport.this.mo580b(obj2, arrayList, (ArrayList<View>) null);
                }
                if (obj3 != null) {
                    FragmentTransitionSupport.this.mo580b(obj3, arrayList2, (ArrayList<View>) null);
                }
                if (obj4 != null) {
                    FragmentTransitionSupport.this.mo580b(obj4, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo573a(Object obj, ArrayList<View> arrayList) {
        AbstractC0128u abstractC0128u = (AbstractC0128u) obj;
        if (abstractC0128u == null) {
            return;
        }
        if (abstractC0128u instanceof C0132y) {
            C0132y c0132y = (C0132y) abstractC0128u;
            int iM753o = c0132y.m753o();
            for (int i = 0; i < iM753o; i++) {
                mo573a(c0132y.m745b(i), arrayList);
            }
            return;
        }
        if (m566a(abstractC0128u) || !m1250a((List) abstractC0128u.m722g())) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            abstractC0128u.mo713b(arrayList.get(i2));
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public void mo574a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0132y c0132y = (C0132y) obj;
        if (c0132y != null) {
            c0132y.m722g().clear();
            c0132y.m722g().addAll(arrayList2);
            mo580b((Object) c0132y, arrayList, arrayList2);
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: a */
    public boolean mo575a(Object obj) {
        return obj instanceof AbstractC0128u;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public Object mo576b(Object obj) {
        if (obj != null) {
            return ((AbstractC0128u) obj).clone();
        }
        return null;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public Object mo577b(Object obj, Object obj2, Object obj3) {
        AbstractC0128u abstractC0128uM744a = null;
        AbstractC0128u abstractC0128u = (AbstractC0128u) obj;
        AbstractC0128u abstractC0128u2 = (AbstractC0128u) obj2;
        AbstractC0128u abstractC0128u3 = (AbstractC0128u) obj3;
        if (abstractC0128u != null && abstractC0128u2 != null) {
            abstractC0128uM744a = new C0132y().m746b(abstractC0128u).m746b(abstractC0128u2).m744a(1);
        } else if (abstractC0128u != null) {
            abstractC0128uM744a = abstractC0128u;
        } else if (abstractC0128u2 != null) {
            abstractC0128uM744a = abstractC0128u2;
        }
        if (abstractC0128u3 == null) {
            return abstractC0128uM744a;
        }
        C0132y c0132y = new C0132y();
        if (abstractC0128uM744a != null) {
            c0132y.m746b(abstractC0128uM744a);
        }
        c0132y.m746b(abstractC0128u3);
        return c0132y;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo578b(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0128u) obj).mo713b(view);
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo579b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((AbstractC0128u) obj).mo700a(new AbstractC0128u.c() { // from class: android.support.transition.FragmentTransitionSupport.2
            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: a */
            public void mo583a(AbstractC0128u abstractC0128u) {
                abstractC0128u.mo712b(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: b */
            public void mo584b(AbstractC0128u abstractC0128u) {
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: c */
            public void mo585c(AbstractC0128u abstractC0128u) {
            }

            @Override // android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: d */
            public void mo586d(AbstractC0128u abstractC0128u) {
            }
        });
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: b */
    public void mo580b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0128u abstractC0128u = (AbstractC0128u) obj;
        if (abstractC0128u instanceof C0132y) {
            C0132y c0132y = (C0132y) abstractC0128u;
            int iM753o = c0132y.m753o();
            for (int i = 0; i < iM753o; i++) {
                mo580b((Object) c0132y.m745b(i), arrayList, arrayList2);
            }
            return;
        }
        if (m566a(abstractC0128u)) {
            return;
        }
        List<View> listM722g = abstractC0128u.m722g();
        if (listM722g.size() == arrayList.size() && listM722g.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                abstractC0128u.mo713b(arrayList2.get(i2));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0128u.mo715c(arrayList.get(size2));
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: c */
    public Object mo581c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0132y c0132y = new C0132y();
        c0132y.m746b((AbstractC0128u) obj);
        return c0132y;
    }

    @Override // android.support.v4.p006a.AbstractC0167w
    /* JADX INFO: renamed from: c */
    public void mo582c(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0128u) obj).mo715c(view);
        }
    }
}
