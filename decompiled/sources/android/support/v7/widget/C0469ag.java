package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.p019j.C0246q;
import android.support.v7.widget.C0484av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.widget.ag */
/* JADX INFO: loaded from: classes.dex */
public class C0469ag extends AbstractC0491bb {

    /* JADX INFO: renamed from: i */
    private static TimeInterpolator f2989i;

    /* JADX INFO: renamed from: j */
    private ArrayList<C0484av.w> f2997j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    private ArrayList<C0484av.w> f2998k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private ArrayList<b> f2999l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    private ArrayList<a> f3000m = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    ArrayList<ArrayList<C0484av.w>> f2990a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    ArrayList<ArrayList<b>> f2991b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    ArrayList<ArrayList<a>> f2992c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    ArrayList<C0484av.w> f2993d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    ArrayList<C0484av.w> f2994e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    ArrayList<C0484av.w> f2995f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    ArrayList<C0484av.w> f2996g = new ArrayList<>();

    /* JADX INFO: renamed from: android.support.v7.widget.ag$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        public C0484av.w f3029a;

        /* JADX INFO: renamed from: b */
        public C0484av.w f3030b;

        /* JADX INFO: renamed from: c */
        public int f3031c;

        /* JADX INFO: renamed from: d */
        public int f3032d;

        /* JADX INFO: renamed from: e */
        public int f3033e;

        /* JADX INFO: renamed from: f */
        public int f3034f;

        private a(C0484av.w wVar, C0484av.w wVar2) {
            this.f3029a = wVar;
            this.f3030b = wVar2;
        }

        a(C0484av.w wVar, C0484av.w wVar2, int i, int i2, int i3, int i4) {
            this(wVar, wVar2);
            this.f3031c = i;
            this.f3032d = i2;
            this.f3033e = i3;
            this.f3034f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3029a + ", newHolder=" + this.f3030b + ", fromX=" + this.f3031c + ", fromY=" + this.f3032d + ", toX=" + this.f3033e + ", toY=" + this.f3034f + '}';
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ag$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        public C0484av.w f3035a;

        /* JADX INFO: renamed from: b */
        public int f3036b;

        /* JADX INFO: renamed from: c */
        public int f3037c;

        /* JADX INFO: renamed from: d */
        public int f3038d;

        /* JADX INFO: renamed from: e */
        public int f3039e;

        b(C0484av.w wVar, int i, int i2, int i3, int i4) {
            this.f3035a = wVar;
            this.f3036b = i;
            this.f3037c = i2;
            this.f3038d = i3;
            this.f3039e = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3844a(List<a> list, C0484av.w wVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (m3845a(aVar, wVar) && aVar.f3029a == null && aVar.f3030b == null) {
                list.remove(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3845a(a aVar, C0484av.w wVar) {
        boolean z = false;
        if (aVar.f3030b == wVar) {
            aVar.f3030b = null;
        } else {
            if (aVar.f3029a != wVar) {
                return false;
            }
            aVar.f3029a = null;
            z = true;
        }
        wVar.f3381a.setAlpha(1.0f);
        wVar.f3381a.setTranslationX(0.0f);
        wVar.f3381a.setTranslationY(0.0f);
        m4464a(wVar, z);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m3846b(a aVar) {
        if (aVar.f3029a != null) {
            m3845a(aVar, aVar.f3029a);
        }
        if (aVar.f3030b != null) {
            m3845a(aVar, aVar.f3030b);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m3847u(final C0484av.w wVar) {
        final View view = wVar.f3381a;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2995f.add(wVar);
        viewPropertyAnimatorAnimate.setDuration(m4178g()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ag.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                C0469ag.this.m4468i(wVar);
                C0469ag.this.f2995f.remove(wVar);
                C0469ag.this.m3859c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C0469ag.this.m4471l(wVar);
            }
        }).start();
    }

    /* JADX INFO: renamed from: v */
    private void m3848v(C0484av.w wVar) {
        if (f2989i == null) {
            f2989i = new ValueAnimator().getInterpolator();
        }
        wVar.f3381a.animate().setInterpolator(f2989i);
        mo3862d(wVar);
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: a */
    public void mo3849a() {
        boolean z = !this.f2997j.isEmpty();
        boolean z2 = !this.f2999l.isEmpty();
        boolean z3 = !this.f3000m.isEmpty();
        boolean z4 = !this.f2998k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<C0484av.w> it = this.f2997j.iterator();
            while (it.hasNext()) {
                m3847u(it.next());
            }
            this.f2997j.clear();
            if (z2) {
                final ArrayList<b> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2999l);
                this.f2991b.add(arrayList);
                this.f2999l.clear();
                Runnable runnable = new Runnable() { // from class: android.support.v7.widget.ag.1
                    @Override // java.lang.Runnable
                    public void run() {
                        for (b bVar : arrayList) {
                            C0469ag.this.m3856b(bVar.f3035a, bVar.f3036b, bVar.f3037c, bVar.f3038d, bVar.f3039e);
                        }
                        arrayList.clear();
                        C0469ag.this.f2991b.remove(arrayList);
                    }
                };
                if (z) {
                    C0246q.m1748a(arrayList.get(0).f3035a.f3381a, runnable, m4178g());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3000m);
                this.f2992c.add(arrayList2);
                this.f3000m.clear();
                Runnable runnable2 = new Runnable() { // from class: android.support.v7.widget.ag.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C0469ag.this.m3850a((a) it2.next());
                        }
                        arrayList2.clear();
                        C0469ag.this.f2992c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0246q.m1748a(arrayList2.get(0).f3029a.f3381a, runnable2, m4178g());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<C0484av.w> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2998k);
                this.f2990a.add(arrayList3);
                this.f2998k.clear();
                Runnable runnable3 = new Runnable() { // from class: android.support.v7.widget.ag.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C0469ag.this.m3860c((C0484av.w) it2.next());
                        }
                        arrayList3.clear();
                        C0469ag.this.f2990a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    C0246q.m1748a(arrayList3.get(0).f3381a, runnable3, (z ? m4178g() : 0L) + Math.max(z2 ? m4175e() : 0L, z3 ? m4180h() : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3850a(final a aVar) {
        C0484av.w wVar = aVar.f3029a;
        final View view = wVar == null ? null : wVar.f3381a;
        C0484av.w wVar2 = aVar.f3030b;
        final View view2 = wVar2 != null ? wVar2.f3381a : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(m4180h());
            this.f2996g.add(aVar.f3029a);
            duration.translationX(aVar.f3033e - aVar.f3031c);
            duration.translationY(aVar.f3034f - aVar.f3032d);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ag.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C0469ag.this.m4464a(aVar.f3029a, true);
                    C0469ag.this.f2996g.remove(aVar.f3029a);
                    C0469ag.this.m3859c();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C0469ag.this.m4465b(aVar.f3029a, true);
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f2996g.add(aVar.f3030b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m4180h()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ag.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C0469ag.this.m4464a(aVar.f3030b, false);
                    C0469ag.this.f2996g.remove(aVar.f3030b);
                    C0469ag.this.m3859c();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C0469ag.this.m4465b(aVar.f3030b, false);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: a */
    void m3851a(List<C0484av.w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3381a.animate().cancel();
        }
    }

    @Override // android.support.v7.widget.AbstractC0491bb
    /* JADX INFO: renamed from: a */
    public boolean mo3852a(C0484av.w wVar) {
        m3848v(wVar);
        this.f2997j.add(wVar);
        return true;
    }

    @Override // android.support.v7.widget.AbstractC0491bb
    /* JADX INFO: renamed from: a */
    public boolean mo3853a(C0484av.w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.f3381a;
        int translationX = i + ((int) wVar.f3381a.getTranslationX());
        int translationY = i2 + ((int) wVar.f3381a.getTranslationY());
        m3848v(wVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m4469j(wVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f2999l.add(new b(wVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // android.support.v7.widget.AbstractC0491bb
    /* JADX INFO: renamed from: a */
    public boolean mo3854a(C0484av.w wVar, C0484av.w wVar2, int i, int i2, int i3, int i4) {
        if (wVar == wVar2) {
            return mo3853a(wVar, i, i2, i3, i4);
        }
        float translationX = wVar.f3381a.getTranslationX();
        float translationY = wVar.f3381a.getTranslationY();
        float alpha = wVar.f3381a.getAlpha();
        m3848v(wVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        wVar.f3381a.setTranslationX(translationX);
        wVar.f3381a.setTranslationY(translationY);
        wVar.f3381a.setAlpha(alpha);
        if (wVar2 != null) {
            m3848v(wVar2);
            wVar2.f3381a.setTranslationX(-i5);
            wVar2.f3381a.setTranslationY(-i6);
            wVar2.f3381a.setAlpha(0.0f);
        }
        this.f3000m.add(new a(wVar, wVar2, i, i2, i3, i4));
        return true;
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: a */
    public boolean mo3855a(C0484av.w wVar, List<Object> list) {
        return !list.isEmpty() || super.mo3855a(wVar, list);
    }

    /* JADX INFO: renamed from: b */
    void m3856b(final C0484av.w wVar, int i, int i2, int i3, int i4) {
        final View view = wVar.f3381a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2994e.add(wVar);
        viewPropertyAnimatorAnimate.setDuration(m4175e()).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ag.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                C0469ag.this.m4469j(wVar);
                C0469ag.this.f2994e.remove(wVar);
                C0469ag.this.m3859c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C0469ag.this.m4472m(wVar);
            }
        }).start();
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: b */
    public boolean mo3857b() {
        return (this.f2998k.isEmpty() && this.f3000m.isEmpty() && this.f2999l.isEmpty() && this.f2997j.isEmpty() && this.f2994e.isEmpty() && this.f2995f.isEmpty() && this.f2993d.isEmpty() && this.f2996g.isEmpty() && this.f2991b.isEmpty() && this.f2990a.isEmpty() && this.f2992c.isEmpty()) ? false : true;
    }

    @Override // android.support.v7.widget.AbstractC0491bb
    /* JADX INFO: renamed from: b */
    public boolean mo3858b(C0484av.w wVar) {
        m3848v(wVar);
        wVar.f3381a.setAlpha(0.0f);
        this.f2998k.add(wVar);
        return true;
    }

    /* JADX INFO: renamed from: c */
    void m3859c() {
        if (mo3857b()) {
            return;
        }
        m4182i();
    }

    /* JADX INFO: renamed from: c */
    void m3860c(final C0484av.w wVar) {
        final View view = wVar.f3381a;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2993d.add(wVar);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m4176f()).setListener(new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ag.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                C0469ag.this.m4470k(wVar);
                C0469ag.this.f2993d.remove(wVar);
                C0469ag.this.m3859c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C0469ag.this.m4473n(wVar);
            }
        }).start();
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: d */
    public void mo3861d() {
        for (int size = this.f2999l.size() - 1; size >= 0; size--) {
            b bVar = this.f2999l.get(size);
            View view = bVar.f3035a.f3381a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4469j(bVar.f3035a);
            this.f2999l.remove(size);
        }
        for (int size2 = this.f2997j.size() - 1; size2 >= 0; size2--) {
            m4468i(this.f2997j.get(size2));
            this.f2997j.remove(size2);
        }
        for (int size3 = this.f2998k.size() - 1; size3 >= 0; size3--) {
            C0484av.w wVar = this.f2998k.get(size3);
            wVar.f3381a.setAlpha(1.0f);
            m4470k(wVar);
            this.f2998k.remove(size3);
        }
        for (int size4 = this.f3000m.size() - 1; size4 >= 0; size4--) {
            m3846b(this.f3000m.get(size4));
        }
        this.f3000m.clear();
        if (mo3857b()) {
            for (int size5 = this.f2991b.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList = this.f2991b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f3035a.f3381a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4469j(bVar2.f3035a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2991b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2990a.size() - 1; size7 >= 0; size7--) {
                ArrayList<C0484av.w> arrayList2 = this.f2990a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0484av.w wVar2 = arrayList2.get(size8);
                    wVar2.f3381a.setAlpha(1.0f);
                    m4470k(wVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2990a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2992c.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList3 = this.f2992c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3846b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2992c.remove(arrayList3);
                    }
                }
            }
            m3851a(this.f2995f);
            m3851a(this.f2994e);
            m3851a(this.f2993d);
            m3851a(this.f2996g);
            m4182i();
        }
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: d */
    public void mo3862d(C0484av.w wVar) {
        View view = wVar.f3381a;
        view.animate().cancel();
        for (int size = this.f2999l.size() - 1; size >= 0; size--) {
            if (this.f2999l.get(size).f3035a == wVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4469j(wVar);
                this.f2999l.remove(size);
            }
        }
        m3844a(this.f3000m, wVar);
        if (this.f2997j.remove(wVar)) {
            view.setAlpha(1.0f);
            m4468i(wVar);
        }
        if (this.f2998k.remove(wVar)) {
            view.setAlpha(1.0f);
            m4470k(wVar);
        }
        for (int size2 = this.f2992c.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.f2992c.get(size2);
            m3844a(arrayList, wVar);
            if (arrayList.isEmpty()) {
                this.f2992c.remove(size2);
            }
        }
        for (int size3 = this.f2991b.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.f2991b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3035a == wVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4469j(wVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2991b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2990a.size() - 1; size5 >= 0; size5--) {
            ArrayList<C0484av.w> arrayList3 = this.f2990a.get(size5);
            if (arrayList3.remove(wVar)) {
                view.setAlpha(1.0f);
                m4470k(wVar);
                if (arrayList3.isEmpty()) {
                    this.f2990a.remove(size5);
                }
            }
        }
        if (this.f2995f.remove(wVar)) {
        }
        if (this.f2993d.remove(wVar)) {
        }
        if (this.f2996g.remove(wVar)) {
        }
        if (this.f2994e.remove(wVar)) {
        }
        m3859c();
    }
}
