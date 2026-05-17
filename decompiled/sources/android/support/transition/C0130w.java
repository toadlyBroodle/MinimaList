package android.support.transition;

import android.support.v4.p018i.C0207a;
import android.support.v4.p019j.C0246q;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.transition.w */
/* JADX INFO: loaded from: classes.dex */
public class C0130w {

    /* JADX INFO: renamed from: a */
    private static AbstractC0128u f651a = new C0112e();

    /* JADX INFO: renamed from: b */
    private static ThreadLocal<WeakReference<C0207a<ViewGroup, ArrayList<AbstractC0128u>>>> f652b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    private static ArrayList<ViewGroup> f653c = new ArrayList<>();

    /* JADX INFO: renamed from: android.support.transition.w$a */
    private static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        AbstractC0128u f654a;

        /* JADX INFO: renamed from: b */
        ViewGroup f655b;

        a(AbstractC0128u abstractC0128u, ViewGroup viewGroup) {
            this.f654a = abstractC0128u;
            this.f655b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        private void m735a() {
            this.f655b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f655b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrayList<AbstractC0128u> arrayList;
            ArrayList arrayList2;
            m735a();
            if (C0130w.f653c.remove(this.f655b)) {
                final C0207a<ViewGroup, ArrayList<AbstractC0128u>> c0207aM730a = C0130w.m730a();
                ArrayList<AbstractC0128u> arrayList3 = c0207aM730a.get(this.f655b);
                if (arrayList3 == null) {
                    ArrayList<AbstractC0128u> arrayList4 = new ArrayList<>();
                    c0207aM730a.put(this.f655b, arrayList4);
                    arrayList = arrayList4;
                    arrayList2 = null;
                } else if (arrayList3.size() > 0) {
                    arrayList = arrayList3;
                    arrayList2 = new ArrayList(arrayList3);
                } else {
                    arrayList = arrayList3;
                    arrayList2 = null;
                }
                arrayList.add(this.f654a);
                this.f654a.mo700a(new C0129v() { // from class: android.support.transition.w.a.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
                    /* JADX INFO: renamed from: a */
                    public void mo583a(AbstractC0128u abstractC0128u) {
                        ((ArrayList) c0207aM730a.get(a.this.f655b)).remove(abstractC0128u);
                    }
                });
                this.f654a.m706a(this.f655b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0128u) it.next()).mo720e(this.f655b);
                    }
                }
                this.f654a.m704a(this.f655b);
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m735a();
            C0130w.f653c.remove(this.f655b);
            ArrayList<AbstractC0128u> arrayList = C0130w.m730a().get(this.f655b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0128u> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo720e(this.f655b);
                }
            }
            this.f654a.m707a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    static C0207a<ViewGroup, ArrayList<AbstractC0128u>> m730a() {
        WeakReference<C0207a<ViewGroup, ArrayList<AbstractC0128u>>> weakReference = f652b.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new C0207a());
            f652b.set(weakReference);
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: a */
    public static void m731a(ViewGroup viewGroup, AbstractC0128u abstractC0128u) {
        if (f653c.contains(viewGroup) || !C0246q.m1777w(viewGroup)) {
            return;
        }
        f653c.add(viewGroup);
        if (abstractC0128u == null) {
            abstractC0128u = f651a;
        }
        AbstractC0128u abstractC0128uClone = abstractC0128u.clone();
        m734c(viewGroup, abstractC0128uClone);
        C0127t.m684a(viewGroup, null);
        m733b(viewGroup, abstractC0128uClone);
    }

    /* JADX INFO: renamed from: b */
    private static void m733b(ViewGroup viewGroup, AbstractC0128u abstractC0128u) {
        if (abstractC0128u == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0128u, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: renamed from: c */
    private static void m734c(ViewGroup viewGroup, AbstractC0128u abstractC0128u) {
        ArrayList<AbstractC0128u> arrayList = m730a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0128u> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo718d(viewGroup);
            }
        }
        if (abstractC0128u != null) {
            abstractC0128u.m706a(viewGroup, true);
        }
        C0127t c0127tM683a = C0127t.m683a(viewGroup);
        if (c0127tM683a != null) {
            c0127tM683a.m685a();
        }
    }
}
