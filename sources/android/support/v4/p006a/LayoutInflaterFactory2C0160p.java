package android.support.v4.p006a;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.p006a.AbstractC0159o;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v4.p018i.C0208b;
import android.support.v4.p018i.C0210d;
import android.support.v4.p018i.C0211e;
import android.support.v4.p018i.C0216j;
import android.support.v4.p019j.C0246q;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: android.support.v4.a.p */
/* JADX INFO: loaded from: classes.dex */
final class LayoutInflaterFactory2C0160p extends AbstractC0159o implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: B */
    ArrayList<h> f904B;

    /* JADX INFO: renamed from: C */
    C0161q f905C;

    /* JADX INFO: renamed from: b */
    ArrayList<f> f908b;

    /* JADX INFO: renamed from: c */
    boolean f909c;

    /* JADX INFO: renamed from: f */
    SparseArray<ComponentCallbacksC0154j> f912f;

    /* JADX INFO: renamed from: g */
    ArrayList<C0148d> f913g;

    /* JADX INFO: renamed from: h */
    ArrayList<ComponentCallbacksC0154j> f914h;

    /* JADX INFO: renamed from: i */
    ArrayList<C0148d> f915i;

    /* JADX INFO: renamed from: j */
    ArrayList<Integer> f916j;

    /* JADX INFO: renamed from: k */
    ArrayList<AbstractC0159o.b> f917k;

    /* JADX INFO: renamed from: m */
    AbstractC0158n f919m;

    /* JADX INFO: renamed from: n */
    AbstractC0156l f920n;

    /* JADX INFO: renamed from: o */
    ComponentCallbacksC0154j f921o;

    /* JADX INFO: renamed from: p */
    ComponentCallbacksC0154j f922p;

    /* JADX INFO: renamed from: r */
    boolean f923r;

    /* JADX INFO: renamed from: s */
    boolean f924s;

    /* JADX INFO: renamed from: t */
    boolean f925t;

    /* JADX INFO: renamed from: u */
    String f926u;

    /* JADX INFO: renamed from: v */
    boolean f927v;

    /* JADX INFO: renamed from: w */
    ArrayList<C0148d> f928w;

    /* JADX INFO: renamed from: x */
    ArrayList<Boolean> f929x;

    /* JADX INFO: renamed from: y */
    ArrayList<ComponentCallbacksC0154j> f930y;

    /* JADX INFO: renamed from: a */
    static boolean f901a = false;

    /* JADX INFO: renamed from: q */
    static Field f902q = null;

    /* JADX INFO: renamed from: E */
    static final Interpolator f897E = new DecelerateInterpolator(2.5f);

    /* JADX INFO: renamed from: F */
    static final Interpolator f898F = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: G */
    static final Interpolator f899G = new AccelerateInterpolator(2.5f);

    /* JADX INFO: renamed from: H */
    static final Interpolator f900H = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: d */
    int f910d = 0;

    /* JADX INFO: renamed from: e */
    final ArrayList<ComponentCallbacksC0154j> f911e = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    private final CopyOnWriteArrayList<C0216j<AbstractC0159o.a, Boolean>> f907I = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: l */
    int f918l = 0;

    /* JADX INFO: renamed from: z */
    Bundle f931z = null;

    /* JADX INFO: renamed from: A */
    SparseArray<Parcelable> f903A = null;

    /* JADX INFO: renamed from: D */
    Runnable f906D = new Runnable() { // from class: android.support.v4.a.p.1
        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0160p.this.m1171f();
        }
    };

    /* JADX INFO: renamed from: android.support.v4.a.p$a */
    private static class a extends b {

        /* JADX INFO: renamed from: a */
        View f946a;

        a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f946a = view;
        }

        @Override // android.support.v4.p006a.LayoutInflaterFactory2C0160p.b, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C0246q.m1780z(this.f946a) || Build.VERSION.SDK_INT >= 24) {
                this.f946a.post(new Runnable() { // from class: android.support.v4.a.p.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f946a.setLayerType(0, null);
                    }
                });
            } else {
                this.f946a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$b */
    private static class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        private final Animation.AnimationListener f948a;

        private b(Animation.AnimationListener animationListener) {
            this.f948a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f948a != null) {
                this.f948a.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            if (this.f948a != null) {
                this.f948a.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f948a != null) {
                this.f948a.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        public final Animation f949a;

        /* JADX INFO: renamed from: b */
        public final Animator f950b;

        private c(Animator animator) {
            this.f949a = null;
            this.f950b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private c(Animation animation) {
            this.f949a = animation;
            this.f950b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$d */
    private static class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        View f951a;

        d(View view) {
            this.f951a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f951a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f951a.setLayerType(2, null);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$e */
    static class e {

        /* JADX INFO: renamed from: a */
        public static final int[] f952a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$f */
    interface f {
        /* JADX INFO: renamed from: a */
        boolean mo846a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$g */
    private class g implements f {

        /* JADX INFO: renamed from: a */
        final String f953a;

        /* JADX INFO: renamed from: b */
        final int f954b;

        /* JADX INFO: renamed from: c */
        final int f955c;

        g(String str, int i, int i2) {
            this.f953a = str;
            this.f954b = i;
            this.f955c = i2;
        }

        @Override // android.support.v4.p006a.LayoutInflaterFactory2C0160p.f
        /* JADX INFO: renamed from: a */
        public boolean mo846a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0159o abstractC0159oM977o;
            if (LayoutInflaterFactory2C0160p.this.f922p == null || this.f954b >= 0 || this.f953a != null || (abstractC0159oM977o = LayoutInflaterFactory2C0160p.this.f922p.m977o()) == null || !abstractC0159oM977o.mo1076b()) {
                return LayoutInflaterFactory2C0160p.this.m1148a(arrayList, arrayList2, this.f953a, this.f954b, this.f955c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.p$h */
    static class h implements ComponentCallbacksC0154j.c {

        /* JADX INFO: renamed from: a */
        private final boolean f957a;

        /* JADX INFO: renamed from: b */
        private final C0148d f958b;

        /* JADX INFO: renamed from: c */
        private int f959c;

        h(C0148d c0148d, boolean z) {
            this.f957a = z;
            this.f958b = c0148d;
        }

        @Override // android.support.v4.p006a.ComponentCallbacksC0154j.c
        /* JADX INFO: renamed from: a */
        public void mo1000a() {
            this.f959c--;
            if (this.f959c != 0) {
                return;
            }
            this.f958b.f748a.m1126z();
        }

        @Override // android.support.v4.p006a.ComponentCallbacksC0154j.c
        /* JADX INFO: renamed from: b */
        public void mo1001b() {
            this.f959c++;
        }

        /* JADX INFO: renamed from: c */
        public boolean m1203c() {
            return this.f959c == 0;
        }

        /* JADX INFO: renamed from: d */
        public void m1204d() {
            boolean z = this.f959c > 0;
            LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p = this.f958b.f748a;
            int size = layoutInflaterFactory2C0160p.f911e.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0154j componentCallbacksC0154j = layoutInflaterFactory2C0160p.f911e.get(i);
                componentCallbacksC0154j.m930a((ComponentCallbacksC0154j.c) null);
                if (z && componentCallbacksC0154j.m938aa()) {
                    componentCallbacksC0154j.m893G();
                }
            }
            this.f958b.f748a.m1102a(this.f958b, this.f957a, z ? false : true, true);
        }

        /* JADX INFO: renamed from: e */
        public void m1205e() {
            this.f958b.f748a.m1102a(this.f958b, this.f957a, false, false);
        }
    }

    LayoutInflaterFactory2C0160p() {
    }

    /* JADX INFO: renamed from: A */
    private void m1094A() {
        this.f909c = false;
        this.f929x.clear();
        this.f928w.clear();
    }

    /* JADX INFO: renamed from: B */
    private void m1095B() {
        if (this.f904B != null) {
            while (!this.f904B.isEmpty()) {
                this.f904B.remove(0).m1204d();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m1096C() {
        int size = this.f912f == null ? 0 : this.f912f.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
            if (componentCallbacksC0154jValueAt != null) {
                if (componentCallbacksC0154jValueAt.m910X() != null) {
                    int iM912Z = componentCallbacksC0154jValueAt.m912Z();
                    View viewM910X = componentCallbacksC0154jValueAt.m910X();
                    Animation animation = viewM910X.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewM910X.clearAnimation();
                    }
                    componentCallbacksC0154jValueAt.m944b((View) null);
                    m1136a(componentCallbacksC0154jValueAt, iM912Z, 0, 0, false);
                } else if (componentCallbacksC0154jValueAt.m911Y() != null) {
                    componentCallbacksC0154jValueAt.m911Y().end();
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m1097D() {
        if (this.f912f != null) {
            for (int size = this.f912f.size() - 1; size >= 0; size--) {
                if (this.f912f.valueAt(size) == null) {
                    this.f912f.delete(this.f912f.keyAt(size));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private int m1098a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0208b<ComponentCallbacksC0154j> c0208b) {
        int i3;
        int i4 = i2 - 1;
        int i5 = i2;
        while (i4 >= i) {
            C0148d c0148d = arrayList.get(i4);
            boolean zBooleanValue = arrayList2.get(i4).booleanValue();
            if (c0148d.m855e() && !c0148d.m845a(arrayList, i4 + 1, i2)) {
                if (this.f904B == null) {
                    this.f904B = new ArrayList<>();
                }
                h hVar = new h(c0148d, zBooleanValue);
                this.f904B.add(hVar);
                c0148d.m842a(hVar);
                if (zBooleanValue) {
                    c0148d.m854d();
                } else {
                    c0148d.m850b(false);
                }
                int i6 = i5 - 1;
                if (i4 != i6) {
                    arrayList.remove(i4);
                    arrayList.add(i6, c0148d);
                }
                m1116b(c0208b);
                i3 = i6;
            } else {
                i3 = i5;
            }
            i4--;
            i5 = i3;
        }
        return i5;
    }

    /* JADX INFO: renamed from: a */
    static c m1099a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f898F);
        alphaAnimation.setDuration(220L);
        return new c(alphaAnimation);
    }

    /* JADX INFO: renamed from: a */
    static c m1100a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f897E);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f898F);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet);
    }

    /* JADX INFO: renamed from: a */
    private static Animation.AnimationListener m1101a(Animation animation) {
        try {
            if (f902q == null) {
                f902q = Animation.class.getDeclaredField("mListener");
                f902q.setAccessible(true);
            }
            return (Animation.AnimationListener) f902q.get(animation);
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e3);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1102a(C0148d c0148d, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0148d.m850b(z3);
        } else {
            c0148d.m854d();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0148d);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0165u.m1229a(this, (ArrayList<C0148d>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m1131a(this.f918l, true);
        }
        if (this.f912f != null) {
            int size = this.f912f.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
                if (componentCallbacksC0154jValueAt != null && componentCallbacksC0154jValueAt.f820Q != null && componentCallbacksC0154jValueAt.f828Y && c0148d.m851b(componentCallbacksC0154jValueAt.f810G)) {
                    if (componentCallbacksC0154jValueAt.f830aa > 0.0f) {
                        componentCallbacksC0154jValueAt.f820Q.setAlpha(componentCallbacksC0154jValueAt.f830aa);
                    }
                    if (z3) {
                        componentCallbacksC0154jValueAt.f830aa = 0.0f;
                    } else {
                        componentCallbacksC0154jValueAt.f830aa = -1.0f;
                        componentCallbacksC0154jValueAt.f828Y = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1103a(final ComponentCallbacksC0154j componentCallbacksC0154j, c cVar, int i) {
        final View view = componentCallbacksC0154j.f820Q;
        final ViewGroup viewGroup = componentCallbacksC0154j.f819P;
        viewGroup.startViewTransition(view);
        componentCallbacksC0154j.m947c(i);
        if (cVar.f949a != null) {
            Animation animation = cVar.f949a;
            componentCallbacksC0154j.m944b(componentCallbacksC0154j.f820Q);
            animation.setAnimationListener(new b(m1101a(animation)) { // from class: android.support.v4.a.p.2
                @Override // android.support.v4.p006a.LayoutInflaterFactory2C0160p.b, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation2) {
                    super.onAnimationEnd(animation2);
                    viewGroup.post(new Runnable() { // from class: android.support.v4.a.p.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            viewGroup.endViewTransition(view);
                            if (componentCallbacksC0154j.m910X() != null) {
                                componentCallbacksC0154j.m944b((View) null);
                                LayoutInflaterFactory2C0160p.this.m1136a(componentCallbacksC0154j, componentCallbacksC0154j.m912Z(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m1117b(view, cVar);
            componentCallbacksC0154j.f820Q.startAnimation(animation);
            return;
        }
        Animator animator = cVar.f950b;
        componentCallbacksC0154j.m922a(cVar.f950b);
        animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.v4.a.p.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                viewGroup.endViewTransition(view);
                Animator animatorM911Y = componentCallbacksC0154j.m911Y();
                componentCallbacksC0154j.m922a((Animator) null);
                if (animatorM911Y == null || viewGroup.indexOfChild(view) >= 0) {
                    return;
                }
                LayoutInflaterFactory2C0160p.this.m1136a(componentCallbacksC0154j, componentCallbacksC0154j.m912Z(), 0, 0, false);
            }
        });
        animator.setTarget(componentCallbacksC0154j.f820Q);
        m1117b(componentCallbacksC0154j.f820Q, cVar);
        animator.start();
    }

    /* JADX INFO: renamed from: a */
    private static void m1106a(C0161q c0161q) {
        if (c0161q == null) {
            return;
        }
        List<ComponentCallbacksC0154j> listM1206a = c0161q.m1206a();
        if (listM1206a != null) {
            Iterator<ComponentCallbacksC0154j> it = listM1206a.iterator();
            while (it.hasNext()) {
                it.next().f815L = true;
            }
        }
        List<C0161q> listM1207b = c0161q.m1207b();
        if (listM1207b != null) {
            Iterator<C0161q> it2 = listM1207b.iterator();
            while (it2.hasNext()) {
                m1106a(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1107a(C0208b<ComponentCallbacksC0154j> c0208b) {
        int size = c0208b.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0154j componentCallbacksC0154jM1527b = c0208b.m1527b(i);
            if (!componentCallbacksC0154jM1527b.f843t) {
                View viewM981s = componentCallbacksC0154jM1527b.m981s();
                componentCallbacksC0154jM1527b.f830aa = viewM981s.getAlpha();
                viewM981s.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1108a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0211e("FragmentManager"));
        if (this.f919m != null) {
            try {
                this.f919m.mo1015a("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            mo1075a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1109a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        int i = 0;
        int size = this.f904B == null ? 0 : this.f904B.size();
        while (i < size) {
            h hVar = this.f904B.get(i);
            if (arrayList != null && !hVar.f957a && (iIndexOf2 = arrayList.indexOf(hVar.f958b)) != -1 && arrayList2.get(iIndexOf2).booleanValue()) {
                hVar.m1205e();
            } else if (hVar.m1203c() || (arrayList != null && hVar.f958b.m845a(arrayList, 0, arrayList.size()))) {
                this.f904B.remove(i);
                i--;
                size--;
                if (arrayList == null || hVar.f957a || (iIndexOf = arrayList.indexOf(hVar.f958b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                    hVar.m1204d();
                } else {
                    hVar.m1205e();
                }
            }
            i++;
            size = size;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1110a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int iM1098a;
        boolean z = arrayList.get(i).f767t;
        if (this.f930y == null) {
            this.f930y = new ArrayList<>();
        } else {
            this.f930y.clear();
        }
        this.f930y.addAll(this.f911e);
        int i3 = i;
        ComponentCallbacksC0154j componentCallbacksC0154jM1199w = m1199w();
        boolean z2 = false;
        while (i3 < i2) {
            C0148d c0148d = arrayList.get(i3);
            ComponentCallbacksC0154j componentCallbacksC0154jM835a = !arrayList2.get(i3).booleanValue() ? c0148d.m835a(this.f930y, componentCallbacksC0154jM1199w) : c0148d.m848b(this.f930y, componentCallbacksC0154jM1199w);
            i3++;
            componentCallbacksC0154jM1199w = componentCallbacksC0154jM835a;
            z2 = z2 || c0148d.f756i;
        }
        this.f930y.clear();
        if (!z) {
            C0165u.m1229a(this, arrayList, arrayList2, i, i2, false);
        }
        m1119b(arrayList, arrayList2, i, i2);
        if (z) {
            C0208b<ComponentCallbacksC0154j> c0208b = new C0208b<>();
            m1116b(c0208b);
            iM1098a = m1098a(arrayList, arrayList2, i, i2, c0208b);
            m1107a(c0208b);
        } else {
            iM1098a = i2;
        }
        if (iM1098a != i && z) {
            C0165u.m1229a(this, arrayList, arrayList2, i, iM1098a, true);
            m1131a(this.f918l, true);
        }
        while (i < i2) {
            C0148d c0148d2 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && c0148d2.f760m >= 0) {
                m1159c(c0148d2.f760m);
                c0148d2.f760m = -1;
            }
            c0148d2.m839a();
            i++;
        }
        if (z2) {
            m1175h();
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m1111a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
            return false;
        }
        if (!(animator instanceof AnimatorSet)) {
            return false;
        }
        ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
        for (int i = 0; i < childAnimations.size(); i++) {
            if (m1111a(childAnimations.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    static boolean m1112a(c cVar) {
        if (cVar.f949a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f949a instanceof AnimationSet)) {
            return m1111a(cVar.f950b);
        }
        List<Animation> animations = ((AnimationSet) cVar.f949a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    static boolean m1113a(View view, c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0246q.m1771q(view) && m1112a(cVar);
    }

    /* JADX INFO: renamed from: a */
    private boolean m1114a(String str, int i, int i2) {
        AbstractC0159o abstractC0159oM977o;
        m1171f();
        m1120c(true);
        if (this.f922p != null && i < 0 && str == null && (abstractC0159oM977o = this.f922p.m977o()) != null && abstractC0159oM977o.mo1076b()) {
            return true;
        }
        boolean zM1148a = m1148a(this.f928w, this.f929x, str, i, i2);
        if (zM1148a) {
            this.f909c = true;
            try {
                m1118b(this.f928w, this.f929x);
            } finally {
                m1094A();
            }
        }
        m1172g();
        m1097D();
        return zM1148a;
    }

    /* JADX INFO: renamed from: b */
    public static int m1115b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1116b(C0208b<ComponentCallbacksC0154j> c0208b) {
        if (this.f918l < 1) {
            return;
        }
        int iMin = Math.min(this.f918l, 4);
        int size = this.f911e.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j.f834k < iMin) {
                m1136a(componentCallbacksC0154j, iMin, componentCallbacksC0154j.m905S(), componentCallbacksC0154j.m906T(), false);
                if (componentCallbacksC0154j.f820Q != null && !componentCallbacksC0154j.f812I && componentCallbacksC0154j.f828Y) {
                    c0208b.add(componentCallbacksC0154j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1117b(View view, c cVar) {
        if (view == null || cVar == null || !m1113a(view, cVar)) {
            return;
        }
        if (cVar.f950b != null) {
            cVar.f950b.addListener(new d(view));
            return;
        }
        Animation.AnimationListener animationListenerM1101a = m1101a(cVar.f949a);
        view.setLayerType(2, null);
        cVar.f949a.setAnimationListener(new a(view, animationListenerM1101a));
    }

    /* JADX INFO: renamed from: b */
    private void m1118b(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int i2 = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1109a(arrayList, arrayList2);
        int size = arrayList.size();
        int i3 = 0;
        while (i2 < size) {
            if (arrayList.get(i2).f767t) {
                i = i2;
            } else {
                if (i3 != i2) {
                    m1110a(arrayList, arrayList2, i3, i2);
                }
                int i4 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i4 < size && arrayList2.get(i4).booleanValue() && !arrayList.get(i4).f767t) {
                        i4++;
                    }
                }
                int i5 = i4;
                m1110a(arrayList, arrayList2, i2, i5);
                i3 = i5;
                i = i5 - 1;
            }
            i2 = i + 1;
        }
        if (i3 != size) {
            m1110a(arrayList, arrayList2, i3, size);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1119b(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0148d c0148d = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0148d.m840a(-1);
                c0148d.m850b(i == i2 + (-1));
            } else {
                c0148d.m840a(1);
                c0148d.m854d();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1120c(boolean z) {
        if (this.f909c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (Looper.myLooper() != this.f919m.m1064h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m1125y();
        }
        if (this.f928w == null) {
            this.f928w = new ArrayList<>();
            this.f929x = new ArrayList<>();
        }
        this.f909c = true;
        try {
            m1109a((ArrayList<C0148d>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f909c = false;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m1121c(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f908b == null || this.f908b.size() == 0) {
                return false;
            }
            int size = this.f908b.size();
            boolean zMo846a = false;
            for (int i = 0; i < size; i++) {
                zMo846a |= this.f908b.get(i).mo846a(arrayList, arrayList2);
            }
            this.f908b.clear();
            this.f919m.m1064h().removeCallbacks(this.f906D);
            return zMo846a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1122d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1123e(int i) {
        try {
            this.f909c = true;
            m1131a(i, false);
            this.f909c = false;
            m1171f();
        } catch (Throwable th) {
            this.f909c = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    private ComponentCallbacksC0154j m1124p(ComponentCallbacksC0154j componentCallbacksC0154j) {
        ViewGroup viewGroup = componentCallbacksC0154j.f819P;
        View view = componentCallbacksC0154j.f820Q;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int iIndexOf = this.f911e.indexOf(componentCallbacksC0154j) - 1; iIndexOf >= 0; iIndexOf--) {
            ComponentCallbacksC0154j componentCallbacksC0154j2 = this.f911e.get(iIndexOf);
            if (componentCallbacksC0154j2.f819P == viewGroup && componentCallbacksC0154j2.f820Q != null) {
                return componentCallbacksC0154j2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private void m1125y() {
        if (this.f924s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f926u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f926u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m1126z() {
        synchronized (this) {
            boolean z = (this.f904B == null || this.f904B.isEmpty()) ? false : true;
            boolean z2 = this.f908b != null && this.f908b.size() == 1;
            if (z || z2) {
                this.f919m.m1064h().removeCallbacks(this.f906D);
                this.f919m.m1064h().post(this.f906D);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1127a(C0148d c0148d) {
        int size;
        synchronized (this) {
            if (this.f916j == null || this.f916j.size() <= 0) {
                if (this.f915i == null) {
                    this.f915i = new ArrayList<>();
                }
                size = this.f915i.size();
                if (f901a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0148d);
                }
                this.f915i.add(c0148d);
            } else {
                size = this.f916j.remove(this.f916j.size() - 1).intValue();
                if (f901a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + c0148d);
                }
                this.f915i.set(size, c0148d);
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0154j m1128a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        ComponentCallbacksC0154j componentCallbacksC0154j = this.f912f.get(i);
        if (componentCallbacksC0154j != null) {
            return componentCallbacksC0154j;
        }
        m1108a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return componentCallbacksC0154j;
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0154j mo1072a(String str) {
        if (str != null) {
            for (int size = this.f911e.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(size);
                if (componentCallbacksC0154j != null && str.equals(componentCallbacksC0154j.f811H)) {
                    return componentCallbacksC0154j;
                }
            }
        }
        if (this.f912f != null && str != null) {
            for (int size2 = this.f912f.size() - 1; size2 >= 0; size2--) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(size2);
                if (componentCallbacksC0154jValueAt != null && str.equals(componentCallbacksC0154jValueAt.f811H)) {
                    return componentCallbacksC0154jValueAt;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    c m1129a(ComponentCallbacksC0154j componentCallbacksC0154j, int i, boolean z, int i2) {
        int iM1115b;
        boolean z2;
        int iM905S = componentCallbacksC0154j.m905S();
        Animation animationM915a = componentCallbacksC0154j.m915a(i, z, iM905S);
        if (animationM915a != null) {
            return new c(animationM915a);
        }
        Animator animatorM940b = componentCallbacksC0154j.m940b(i, z, iM905S);
        if (animatorM940b != null) {
            return new c(animatorM940b);
        }
        if (iM905S != 0) {
            boolean zEquals = "anim".equals(this.f919m.m1063g().getResources().getResourceTypeName(iM905S));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f919m.m1063g(), iM905S);
                    if (animationLoadAnimation != null) {
                        return new c(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f919m.m1063g(), iM905S);
                    if (animatorLoadAnimator != null) {
                        return new c(animatorLoadAnimator);
                    }
                } catch (RuntimeException e4) {
                    if (zEquals) {
                        throw e4;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.f919m.m1063g(), iM905S);
                    if (animationLoadAnimation2 != null) {
                        return new c(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i != 0 && (iM1115b = m1115b(i, z)) >= 0) {
            switch (iM1115b) {
                case 1:
                    return m1100a(this.f919m.m1063g(), 1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    return m1100a(this.f919m.m1063g(), 1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    return m1100a(this.f919m.m1063g(), 0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    return m1100a(this.f919m.m1063g(), 1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    return m1099a(this.f919m.m1063g(), 0.0f, 1.0f);
                case 6:
                    return m1099a(this.f919m.m1063g(), 1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.f919m.mo1020d()) {
                        i2 = this.f919m.mo1021e();
                    }
                    return i2 == 0 ? null : null;
            }
        }
        return null;
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: a */
    public AbstractC0164t mo1073a() {
        return new C0148d(this);
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: a */
    public void mo1074a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m1142a((f) new g(null, i, i2), false);
    }

    /* JADX INFO: renamed from: a */
    public void m1130a(int i, C0148d c0148d) {
        synchronized (this) {
            if (this.f915i == null) {
                this.f915i = new ArrayList<>();
            }
            int size = this.f915i.size();
            if (i < size) {
                if (f901a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0148d);
                }
                this.f915i.set(i, c0148d);
            } else {
                while (size < i) {
                    this.f915i.add(null);
                    if (this.f916j == null) {
                        this.f916j = new ArrayList<>();
                    }
                    if (f901a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f916j.add(Integer.valueOf(size));
                    size++;
                }
                if (f901a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0148d);
                }
                this.f915i.add(c0148d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m1131a(int i, boolean z) {
        boolean zMo1260a;
        if (this.f919m == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f918l) {
            this.f918l = i;
            if (this.f912f != null) {
                int size = this.f911e.size();
                int i2 = 0;
                boolean zMo1260a2 = false;
                while (i2 < size) {
                    ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i2);
                    m1167e(componentCallbacksC0154j);
                    i2++;
                    zMo1260a2 = componentCallbacksC0154j.f824U != null ? componentCallbacksC0154j.f824U.mo1260a() | zMo1260a2 : zMo1260a2;
                }
                int size2 = this.f912f.size();
                int i3 = 0;
                while (i3 < size2) {
                    ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i3);
                    if (componentCallbacksC0154jValueAt == null || (!(componentCallbacksC0154jValueAt.f844u || componentCallbacksC0154jValueAt.f813J) || componentCallbacksC0154jValueAt.f828Y)) {
                        zMo1260a = zMo1260a2;
                    } else {
                        m1167e(componentCallbacksC0154jValueAt);
                        if (componentCallbacksC0154jValueAt.f824U != null) {
                            zMo1260a = componentCallbacksC0154jValueAt.f824U.mo1260a() | zMo1260a2;
                        }
                    }
                    i3++;
                    zMo1260a2 = zMo1260a;
                }
                if (!zMo1260a2) {
                    m1166e();
                }
                if (this.f923r && this.f919m != null && this.f918l == 5) {
                    this.f919m.mo1019c();
                    this.f923r = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1132a(Configuration configuration) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f911e.size()) {
                return;
            }
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i2);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m929a(configuration);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1133a(Bundle bundle, String str, ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f837n < 0) {
            m1108a(new IllegalStateException("Fragment " + componentCallbacksC0154j + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, componentCallbacksC0154j.f837n);
    }

    /* JADX INFO: renamed from: a */
    void m1134a(Parcelable parcelable, C0161q c0161q) {
        List<C0161q> list;
        if (parcelable == null) {
            return;
        }
        C0162r c0162r = (C0162r) parcelable;
        if (c0162r.f962a != null) {
            if (c0161q != null) {
                List<ComponentCallbacksC0154j> listM1206a = c0161q.m1206a();
                List<C0161q> listM1207b = c0161q.m1207b();
                int size = listM1206a != null ? listM1206a.size() : 0;
                for (int i = 0; i < size; i++) {
                    ComponentCallbacksC0154j componentCallbacksC0154j = listM1206a.get(i);
                    if (f901a) {
                        Log.v("FragmentManager", "restoreAllState: re-attaching retained " + componentCallbacksC0154j);
                    }
                    int i2 = 0;
                    while (i2 < c0162r.f962a.length && c0162r.f962a[i2].f968b != componentCallbacksC0154j.f837n) {
                        i2++;
                    }
                    if (i2 == c0162r.f962a.length) {
                        m1108a(new IllegalStateException("Could not find active fragment with index " + componentCallbacksC0154j.f837n));
                    }
                    C0163s c0163s = c0162r.f962a[i2];
                    c0163s.f978l = componentCallbacksC0154j;
                    componentCallbacksC0154j.f836m = null;
                    componentCallbacksC0154j.f849z = 0;
                    componentCallbacksC0154j.f846w = false;
                    componentCallbacksC0154j.f843t = false;
                    componentCallbacksC0154j.f840q = null;
                    if (c0163s.f977k != null) {
                        c0163s.f977k.setClassLoader(this.f919m.m1063g().getClassLoader());
                        componentCallbacksC0154j.f836m = c0163s.f977k.getSparseParcelableArray("android:view_state");
                        componentCallbacksC0154j.f835l = c0163s.f977k;
                    }
                }
                list = listM1207b;
            } else {
                list = null;
            }
            this.f912f = new SparseArray<>(c0162r.f962a.length);
            int i3 = 0;
            while (i3 < c0162r.f962a.length) {
                C0163s c0163s2 = c0162r.f962a[i3];
                if (c0163s2 != null) {
                    ComponentCallbacksC0154j componentCallbacksC0154jM1210a = c0163s2.m1210a(this.f919m, this.f920n, this.f921o, (list == null || i3 >= list.size()) ? null : list.get(i3));
                    if (f901a) {
                        Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + componentCallbacksC0154jM1210a);
                    }
                    this.f912f.put(componentCallbacksC0154jM1210a.f837n, componentCallbacksC0154jM1210a);
                    c0163s2.f978l = null;
                }
                i3++;
            }
            if (c0161q != null) {
                List<ComponentCallbacksC0154j> listM1206a2 = c0161q.m1206a();
                int size2 = listM1206a2 != null ? listM1206a2.size() : 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    ComponentCallbacksC0154j componentCallbacksC0154j2 = listM1206a2.get(i4);
                    if (componentCallbacksC0154j2.f841r >= 0) {
                        componentCallbacksC0154j2.f840q = this.f912f.get(componentCallbacksC0154j2.f841r);
                        if (componentCallbacksC0154j2.f840q == null) {
                            Log.w("FragmentManager", "Re-attaching retained fragment " + componentCallbacksC0154j2 + " target no longer exists: " + componentCallbacksC0154j2.f841r);
                        }
                    }
                }
            }
            this.f911e.clear();
            if (c0162r.f963b != null) {
                for (int i5 = 0; i5 < c0162r.f963b.length; i5++) {
                    ComponentCallbacksC0154j componentCallbacksC0154j3 = this.f912f.get(c0162r.f963b[i5]);
                    if (componentCallbacksC0154j3 == null) {
                        m1108a(new IllegalStateException("No instantiated fragment for index #" + c0162r.f963b[i5]));
                    }
                    componentCallbacksC0154j3.f843t = true;
                    if (f901a) {
                        Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + componentCallbacksC0154j3);
                    }
                    if (this.f911e.contains(componentCallbacksC0154j3)) {
                        throw new IllegalStateException("Already added!");
                    }
                    synchronized (this.f911e) {
                        this.f911e.add(componentCallbacksC0154j3);
                    }
                }
            }
            if (c0162r.f964c != null) {
                this.f913g = new ArrayList<>(c0162r.f964c.length);
                for (int i6 = 0; i6 < c0162r.f964c.length; i6++) {
                    C0148d c0148dM857a = c0162r.f964c[i6].m857a(this);
                    if (f901a) {
                        Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + c0148dM857a.f760m + "): " + c0148dM857a);
                        PrintWriter printWriter = new PrintWriter(new C0211e("FragmentManager"));
                        c0148dM857a.m844a("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f913g.add(c0148dM857a);
                    if (c0148dM857a.f760m >= 0) {
                        m1130a(c0148dM857a.f760m, c0148dM857a);
                    }
                }
            } else {
                this.f913g = null;
            }
            if (c0162r.f965d >= 0) {
                this.f922p = this.f912f.get(c0162r.f965d);
            }
            this.f910d = c0162r.f966e;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1135a(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f822S) {
            if (this.f909c) {
                this.f927v = true;
            } else {
                componentCallbacksC0154j.f822S = false;
                m1136a(componentCallbacksC0154j, this.f918l, 0, 0, false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: a */
    void m1136a(android.support.v4.p006a.ComponentCallbacksC0154j r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.p006a.LayoutInflaterFactory2C0160p.m1136a(android.support.v4.a.j, int, int, int, boolean):void");
    }

    /* JADX INFO: renamed from: a */
    void m1137a(ComponentCallbacksC0154j componentCallbacksC0154j, Context context, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1137a(componentCallbacksC0154j, context, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1080a(this, componentCallbacksC0154j, context);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m1138a(ComponentCallbacksC0154j componentCallbacksC0154j, Bundle bundle, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1138a(componentCallbacksC0154j, bundle, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1081a(this, componentCallbacksC0154j, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m1139a(ComponentCallbacksC0154j componentCallbacksC0154j, View view, Bundle bundle, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1139a(componentCallbacksC0154j, view, bundle, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1082a(this, componentCallbacksC0154j, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1140a(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (f901a) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0154j);
        }
        m1169f(componentCallbacksC0154j);
        if (componentCallbacksC0154j.f813J) {
            return;
        }
        if (this.f911e.contains(componentCallbacksC0154j)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0154j);
        }
        synchronized (this.f911e) {
            this.f911e.add(componentCallbacksC0154j);
        }
        componentCallbacksC0154j.f843t = true;
        componentCallbacksC0154j.f844u = false;
        if (componentCallbacksC0154j.f820Q == null) {
            componentCallbacksC0154j.f829Z = false;
        }
        if (componentCallbacksC0154j.f816M && componentCallbacksC0154j.f817N) {
            this.f923r = true;
        }
        if (z) {
            m1152b(componentCallbacksC0154j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1141a(AbstractC0158n abstractC0158n, AbstractC0156l abstractC0156l, ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (this.f919m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f919m = abstractC0158n;
        this.f920n = abstractC0156l;
        this.f921o = componentCallbacksC0154j;
    }

    /* JADX INFO: renamed from: a */
    public void m1142a(f fVar, boolean z) {
        if (!z) {
            m1125y();
        }
        synchronized (this) {
            if (this.f925t || this.f919m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                if (this.f908b == null) {
                    this.f908b = new ArrayList<>();
                }
                this.f908b.add(fVar);
                m1126z();
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: a */
    public void mo1075a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        if (this.f912f != null && (size5 = this.f912f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0154jValueAt);
                if (componentCallbacksC0154jValueAt != null) {
                    componentCallbacksC0154jValueAt.mo936a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f911e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0154j.toString());
            }
        }
        if (this.f914h != null && (size4 = this.f914h.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                ComponentCallbacksC0154j componentCallbacksC0154j2 = this.f914h.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0154j2.toString());
            }
        }
        if (this.f913g != null && (size3 = this.f913g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0148d c0148d = this.f913g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0148d.toString());
                c0148d.m843a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f915i != null && (size2 = this.f915i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (C0148d) this.f915i.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f916j != null && this.f916j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f916j.toArray()));
            }
        }
        if (this.f908b != null && (size = this.f908b.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (f) this.f908b.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f919m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f920n);
        if (this.f921o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f921o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f918l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f924s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f925t);
        if (this.f923r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f923r);
        }
        if (this.f926u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f926u);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1143a(boolean z) {
        for (int size = this.f911e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(size);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m962h(z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m1144a(int i) {
        return this.f918l >= i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1145a(Menu menu) {
        if (this.f918l < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f911e.size(); i++) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j != null && componentCallbacksC0154j.m949c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1146a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.f918l < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0154j> arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (i < this.f911e.size()) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j == null || !componentCallbacksC0154j.m945b(menu, menuInflater)) {
                z = z2;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0154j);
                z = true;
            }
            i++;
            z2 = z;
        }
        if (this.f914h != null) {
            for (int i2 = 0; i2 < this.f914h.size(); i2++) {
                ComponentCallbacksC0154j componentCallbacksC0154j2 = this.f914h.get(i2);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0154j2)) {
                    componentCallbacksC0154j2.m986x();
                }
            }
        }
        this.f914h = arrayList;
        return z2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1147a(MenuItem menuItem) {
        if (this.f918l < 1) {
            return false;
        }
        for (int i = 0; i < this.f911e.size(); i++) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j != null && componentCallbacksC0154j.m950c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    boolean m1148a(ArrayList<C0148d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.f913g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f913g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f913g.remove(size));
            arrayList2.add(true);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f913g.size() - 1;
                while (size2 >= 0) {
                    C0148d c0148d = this.f913g.get(size2);
                    if ((str != null && str.equals(c0148d.m856f())) || (i >= 0 && i == c0148d.f760m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        C0148d c0148d2 = this.f913g.get(size2);
                        if ((str == null || !str.equals(c0148d2.m856f())) && (i < 0 || i != c0148d2.f760m)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f913g.size() - 1) {
                return false;
            }
            for (int size3 = this.f913g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f913g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public ComponentCallbacksC0154j m1149b(int i) {
        for (int size = this.f911e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(size);
            if (componentCallbacksC0154j != null && componentCallbacksC0154j.f809F == i) {
                return componentCallbacksC0154j;
            }
        }
        if (this.f912f != null) {
            for (int size2 = this.f912f.size() - 1; size2 >= 0; size2--) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(size2);
                if (componentCallbacksC0154jValueAt != null && componentCallbacksC0154jValueAt.f809F == i) {
                    return componentCallbacksC0154jValueAt;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public ComponentCallbacksC0154j m1150b(String str) {
        ComponentCallbacksC0154j componentCallbacksC0154jM913a;
        if (this.f912f != null && str != null) {
            for (int size = this.f912f.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(size);
                if (componentCallbacksC0154jValueAt != null && (componentCallbacksC0154jM913a = componentCallbacksC0154jValueAt.m913a(str)) != null) {
                    return componentCallbacksC0154jM913a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    void m1151b(C0148d c0148d) {
        if (this.f913g == null) {
            this.f913g = new ArrayList<>();
        }
        this.f913g.add(c0148d);
    }

    /* JADX INFO: renamed from: b */
    void m1152b(ComponentCallbacksC0154j componentCallbacksC0154j) {
        m1136a(componentCallbacksC0154j, this.f918l, 0, 0, false);
    }

    /* JADX INFO: renamed from: b */
    void m1153b(ComponentCallbacksC0154j componentCallbacksC0154j, Context context, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1153b(componentCallbacksC0154j, context, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1084b(this, componentCallbacksC0154j, context);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void m1154b(ComponentCallbacksC0154j componentCallbacksC0154j, Bundle bundle, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1154b(componentCallbacksC0154j, bundle, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1085b(this, componentCallbacksC0154j, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void m1155b(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1155b(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1079a(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1156b(Menu menu) {
        if (this.f918l < 1) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f911e.size()) {
                return;
            }
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i2);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m951d(menu);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1157b(boolean z) {
        for (int size = this.f911e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(size);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m964i(z);
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: b */
    public boolean mo1076b() {
        m1125y();
        return m1114a((String) null, -1, 0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1158b(MenuItem menuItem) {
        if (this.f918l < 1) {
            return false;
        }
        for (int i = 0; i < this.f911e.size(); i++) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j != null && componentCallbacksC0154j.m953d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: c */
    public List<ComponentCallbacksC0154j> mo1077c() {
        List<ComponentCallbacksC0154j> list;
        if (this.f911e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f911e) {
            list = (List) this.f911e.clone();
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public void m1159c(int i) {
        synchronized (this) {
            this.f915i.set(i, null);
            if (this.f916j == null) {
                this.f916j = new ArrayList<>();
            }
            if (f901a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f916j.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: c */
    void m1160c(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (!componentCallbacksC0154j.f845v || componentCallbacksC0154j.f848y) {
            return;
        }
        componentCallbacksC0154j.f820Q = componentCallbacksC0154j.m941b(componentCallbacksC0154j.m960h(componentCallbacksC0154j.f835l), (ViewGroup) null, componentCallbacksC0154j.f835l);
        if (componentCallbacksC0154j.f820Q == null) {
            componentCallbacksC0154j.f821R = null;
            return;
        }
        componentCallbacksC0154j.f821R = componentCallbacksC0154j.f820Q;
        componentCallbacksC0154j.f820Q.setSaveFromParentEnabled(false);
        if (componentCallbacksC0154j.f812I) {
            componentCallbacksC0154j.f820Q.setVisibility(8);
        }
        componentCallbacksC0154j.mo935a(componentCallbacksC0154j.f820Q, componentCallbacksC0154j.f835l);
        m1139a(componentCallbacksC0154j, componentCallbacksC0154j.f820Q, componentCallbacksC0154j.f835l, false);
    }

    /* JADX INFO: renamed from: c */
    void m1161c(ComponentCallbacksC0154j componentCallbacksC0154j, Bundle bundle, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1161c(componentCallbacksC0154j, bundle, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1087c(this, componentCallbacksC0154j, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m1162c(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1162c(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1083b(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m1163d(final ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f820Q != null) {
            c cVarM1129a = m1129a(componentCallbacksC0154j, componentCallbacksC0154j.m906T(), !componentCallbacksC0154j.f812I, componentCallbacksC0154j.m907U());
            if (cVarM1129a == null || cVarM1129a.f950b == null) {
                if (cVarM1129a != null) {
                    m1117b(componentCallbacksC0154j.f820Q, cVarM1129a);
                    componentCallbacksC0154j.f820Q.startAnimation(cVarM1129a.f949a);
                    cVarM1129a.f949a.start();
                }
                componentCallbacksC0154j.f820Q.setVisibility((!componentCallbacksC0154j.f812I || componentCallbacksC0154j.m939ab()) ? 0 : 8);
                if (componentCallbacksC0154j.m939ab()) {
                    componentCallbacksC0154j.m968j(false);
                }
            } else {
                cVarM1129a.f950b.setTarget(componentCallbacksC0154j.f820Q);
                if (!componentCallbacksC0154j.f812I) {
                    componentCallbacksC0154j.f820Q.setVisibility(0);
                } else if (componentCallbacksC0154j.m939ab()) {
                    componentCallbacksC0154j.m968j(false);
                } else {
                    final ViewGroup viewGroup = componentCallbacksC0154j.f819P;
                    final View view = componentCallbacksC0154j.f820Q;
                    viewGroup.startViewTransition(view);
                    cVarM1129a.f950b.addListener(new AnimatorListenerAdapter() { // from class: android.support.v4.a.p.4
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (componentCallbacksC0154j.f820Q != null) {
                                componentCallbacksC0154j.f820Q.setVisibility(8);
                            }
                        }
                    });
                }
                m1117b(componentCallbacksC0154j.f820Q, cVarM1129a);
                cVarM1129a.f950b.start();
            }
        }
        if (componentCallbacksC0154j.f843t && componentCallbacksC0154j.f816M && componentCallbacksC0154j.f817N) {
            this.f923r = true;
        }
        componentCallbacksC0154j.f829Z = false;
        componentCallbacksC0154j.m948c(componentCallbacksC0154j.f812I);
    }

    /* JADX INFO: renamed from: d */
    void m1164d(ComponentCallbacksC0154j componentCallbacksC0154j, Bundle bundle, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1164d(componentCallbacksC0154j, bundle, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1089d(this, componentCallbacksC0154j, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m1165d(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1165d(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1086c(this, componentCallbacksC0154j);
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0159o
    /* JADX INFO: renamed from: d */
    public boolean mo1078d() {
        return this.f924s;
    }

    /* JADX INFO: renamed from: e */
    void m1166e() {
        if (this.f912f == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f912f.size()) {
                return;
            }
            ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i2);
            if (componentCallbacksC0154jValueAt != null) {
                m1135a(componentCallbacksC0154jValueAt);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: e */
    void m1167e(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j == null) {
            return;
        }
        int iMin = this.f918l;
        if (componentCallbacksC0154j.f844u) {
            iMin = componentCallbacksC0154j.m959g() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        m1136a(componentCallbacksC0154j, iMin, componentCallbacksC0154j.m906T(), componentCallbacksC0154j.m907U(), false);
        if (componentCallbacksC0154j.f820Q != null) {
            ComponentCallbacksC0154j componentCallbacksC0154jM1124p = m1124p(componentCallbacksC0154j);
            if (componentCallbacksC0154jM1124p != null) {
                View view = componentCallbacksC0154jM1124p.f820Q;
                ViewGroup viewGroup = componentCallbacksC0154j.f819P;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(componentCallbacksC0154j.f820Q);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(componentCallbacksC0154j.f820Q, iIndexOfChild);
                }
            }
            if (componentCallbacksC0154j.f828Y && componentCallbacksC0154j.f819P != null) {
                if (componentCallbacksC0154j.f830aa > 0.0f) {
                    componentCallbacksC0154j.f820Q.setAlpha(componentCallbacksC0154j.f830aa);
                }
                componentCallbacksC0154j.f830aa = 0.0f;
                componentCallbacksC0154j.f828Y = false;
                c cVarM1129a = m1129a(componentCallbacksC0154j, componentCallbacksC0154j.m906T(), true, componentCallbacksC0154j.m907U());
                if (cVarM1129a != null) {
                    m1117b(componentCallbacksC0154j.f820Q, cVarM1129a);
                    if (cVarM1129a.f949a != null) {
                        componentCallbacksC0154j.f820Q.startAnimation(cVarM1129a.f949a);
                    } else {
                        cVarM1129a.f950b.setTarget(componentCallbacksC0154j.f820Q);
                        cVarM1129a.f950b.start();
                    }
                }
            }
        }
        if (componentCallbacksC0154j.f829Z) {
            m1163d(componentCallbacksC0154j);
        }
    }

    /* JADX INFO: renamed from: e */
    void m1168e(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1168e(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1088d(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m1169f(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f837n >= 0) {
            return;
        }
        int i = this.f910d;
        this.f910d = i + 1;
        componentCallbacksC0154j.m920a(i, this.f921o);
        if (this.f912f == null) {
            this.f912f = new SparseArray<>();
        }
        this.f912f.put(componentCallbacksC0154j.f837n, componentCallbacksC0154j);
        if (f901a) {
            Log.v("FragmentManager", "Allocated fragment index " + componentCallbacksC0154j);
        }
    }

    /* JADX INFO: renamed from: f */
    void m1170f(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1170f(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1090e(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m1171f() {
        m1120c(true);
        boolean z = false;
        while (m1121c(this.f928w, this.f929x)) {
            this.f909c = true;
            try {
                m1118b(this.f928w, this.f929x);
                m1094A();
                z = true;
            } catch (Throwable th) {
                m1094A();
                throw th;
            }
        }
        m1172g();
        m1097D();
        return z;
    }

    /* JADX INFO: renamed from: g */
    void m1172g() {
        if (this.f927v) {
            boolean zMo1260a = false;
            for (int i = 0; i < this.f912f.size(); i++) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
                if (componentCallbacksC0154jValueAt != null && componentCallbacksC0154jValueAt.f824U != null) {
                    zMo1260a |= componentCallbacksC0154jValueAt.f824U.mo1260a();
                }
            }
            if (zMo1260a) {
                return;
            }
            this.f927v = false;
            m1166e();
        }
    }

    /* JADX INFO: renamed from: g */
    void m1173g(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f837n < 0) {
            return;
        }
        if (f901a) {
            Log.v("FragmentManager", "Freeing fragment index " + componentCallbacksC0154j);
        }
        this.f912f.put(componentCallbacksC0154j.f837n, null);
        this.f919m.m1059a(componentCallbacksC0154j.f838o);
        componentCallbacksC0154j.m985w();
    }

    /* JADX INFO: renamed from: g */
    void m1174g(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1174g(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1091f(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    void m1175h() {
        if (this.f917k == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f917k.size()) {
                return;
            }
            this.f917k.get(i2).m1093a();
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1176h(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (f901a) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0154j + " nesting=" + componentCallbacksC0154j.f849z);
        }
        boolean z = !componentCallbacksC0154j.m959g();
        if (!componentCallbacksC0154j.f813J || z) {
            synchronized (this.f911e) {
                this.f911e.remove(componentCallbacksC0154j);
            }
            if (componentCallbacksC0154j.f816M && componentCallbacksC0154j.f817N) {
                this.f923r = true;
            }
            componentCallbacksC0154j.f843t = false;
            componentCallbacksC0154j.f844u = true;
        }
    }

    /* JADX INFO: renamed from: h */
    void m1177h(ComponentCallbacksC0154j componentCallbacksC0154j, boolean z) {
        if (this.f921o != null) {
            AbstractC0159o abstractC0159oM973m = this.f921o.m973m();
            if (abstractC0159oM973m instanceof LayoutInflaterFactory2C0160p) {
                ((LayoutInflaterFactory2C0160p) abstractC0159oM973m).m1177h(componentCallbacksC0154j, true);
            }
        }
        for (C0216j<AbstractC0159o.a, Boolean> c0216j : this.f907I) {
            if (!z || c0216j.f1263b.booleanValue()) {
                c0216j.f1262a.m1092g(this, componentCallbacksC0154j);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    C0161q m1178i() {
        m1106a(this.f905C);
        return this.f905C;
    }

    /* JADX INFO: renamed from: i */
    public void m1179i(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (f901a) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0154j);
        }
        if (componentCallbacksC0154j.f812I) {
            return;
        }
        componentCallbacksC0154j.f812I = true;
        componentCallbacksC0154j.f829Z = componentCallbacksC0154j.f829Z ? false : true;
    }

    /* JADX INFO: renamed from: j */
    void m1180j() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0161q c0161q;
        if (this.f912f != null) {
            int i = 0;
            arrayList = null;
            arrayList2 = null;
            while (i < this.f912f.size()) {
                ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
                if (componentCallbacksC0154jValueAt != null) {
                    if (componentCallbacksC0154jValueAt.f814K) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(componentCallbacksC0154jValueAt);
                        componentCallbacksC0154jValueAt.f841r = componentCallbacksC0154jValueAt.f840q != null ? componentCallbacksC0154jValueAt.f840q.f837n : -1;
                        if (f901a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + componentCallbacksC0154jValueAt);
                        }
                    }
                    if (componentCallbacksC0154jValueAt.f806C != null) {
                        componentCallbacksC0154jValueAt.f806C.m1180j();
                        c0161q = componentCallbacksC0154jValueAt.f806C.f905C;
                    } else {
                        c0161q = componentCallbacksC0154jValueAt.f807D;
                    }
                    if (arrayList == null && c0161q != null) {
                        arrayList = new ArrayList(this.f912f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add(null);
                        }
                    }
                    arrayList3 = arrayList;
                    if (arrayList3 != null) {
                        arrayList3.add(c0161q);
                    }
                } else {
                    arrayList3 = arrayList;
                }
                i++;
                arrayList2 = arrayList2;
                arrayList = arrayList3;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        if (arrayList2 == null && arrayList == null) {
            this.f905C = null;
        } else {
            this.f905C = new C0161q(arrayList2, arrayList);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1181j(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (f901a) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0154j);
        }
        if (componentCallbacksC0154j.f812I) {
            componentCallbacksC0154j.f812I = false;
            componentCallbacksC0154j.f829Z = componentCallbacksC0154j.f829Z ? false : true;
        }
    }

    /* JADX INFO: renamed from: k */
    Parcelable m1182k() {
        int[] iArr;
        int size;
        boolean z;
        C0149e[] c0149eArr = null;
        m1095B();
        m1096C();
        m1171f();
        this.f924s = true;
        this.f905C = null;
        if (this.f912f == null || this.f912f.size() <= 0) {
            return null;
        }
        int size2 = this.f912f.size();
        C0163s[] c0163sArr = new C0163s[size2];
        int i = 0;
        boolean z2 = false;
        while (i < size2) {
            ComponentCallbacksC0154j componentCallbacksC0154jValueAt = this.f912f.valueAt(i);
            if (componentCallbacksC0154jValueAt != null) {
                if (componentCallbacksC0154jValueAt.f837n < 0) {
                    m1108a(new IllegalStateException("Failure saving state: active " + componentCallbacksC0154jValueAt + " has cleared index: " + componentCallbacksC0154jValueAt.f837n));
                }
                C0163s c0163s = new C0163s(componentCallbacksC0154jValueAt);
                c0163sArr[i] = c0163s;
                if (componentCallbacksC0154jValueAt.f834k <= 0 || c0163s.f977k != null) {
                    c0163s.f977k = componentCallbacksC0154jValueAt.f835l;
                } else {
                    c0163s.f977k = m1188n(componentCallbacksC0154jValueAt);
                    if (componentCallbacksC0154jValueAt.f840q != null) {
                        if (componentCallbacksC0154jValueAt.f840q.f837n < 0) {
                            m1108a(new IllegalStateException("Failure saving state: " + componentCallbacksC0154jValueAt + " has target not in fragment manager: " + componentCallbacksC0154jValueAt.f840q));
                        }
                        if (c0163s.f977k == null) {
                            c0163s.f977k = new Bundle();
                        }
                        m1133a(c0163s.f977k, "android:target_state", componentCallbacksC0154jValueAt.f840q);
                        if (componentCallbacksC0154jValueAt.f842s != 0) {
                            c0163s.f977k.putInt("android:target_req_state", componentCallbacksC0154jValueAt.f842s);
                        }
                    }
                }
                if (f901a) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0154jValueAt + ": " + c0163s.f977k);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            if (!f901a) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        int size3 = this.f911e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i2 = 0; i2 < size3; i2++) {
                iArr[i2] = this.f911e.get(i2).f837n;
                if (iArr[i2] < 0) {
                    m1108a(new IllegalStateException("Failure saving state: active " + this.f911e.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f901a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f911e.get(i2));
                }
            }
        } else {
            iArr = null;
        }
        if (this.f913g != null && (size = this.f913g.size()) > 0) {
            c0149eArr = new C0149e[size];
            for (int i3 = 0; i3 < size; i3++) {
                c0149eArr[i3] = new C0149e(this.f913g.get(i3));
                if (f901a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f913g.get(i3));
                }
            }
        }
        C0162r c0162r = new C0162r();
        c0162r.f962a = c0163sArr;
        c0162r.f963b = iArr;
        c0162r.f964c = c0149eArr;
        if (this.f922p != null) {
            c0162r.f965d = this.f922p.f837n;
        }
        c0162r.f966e = this.f910d;
        m1180j();
        return c0162r;
    }

    /* JADX INFO: renamed from: k */
    public void m1183k(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (f901a) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0154j);
        }
        if (componentCallbacksC0154j.f813J) {
            return;
        }
        componentCallbacksC0154j.f813J = true;
        if (componentCallbacksC0154j.f843t) {
            if (f901a) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0154j);
            }
            synchronized (this.f911e) {
                this.f911e.remove(componentCallbacksC0154j);
            }
            if (componentCallbacksC0154j.f816M && componentCallbacksC0154j.f817N) {
                this.f923r = true;
            }
            componentCallbacksC0154j.f843t = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1184l() {
        this.f905C = null;
        this.f924s = false;
        int size = this.f911e.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m897K();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1185l(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (f901a) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0154j);
        }
        if (componentCallbacksC0154j.f813J) {
            componentCallbacksC0154j.f813J = false;
            if (componentCallbacksC0154j.f843t) {
                return;
            }
            if (this.f911e.contains(componentCallbacksC0154j)) {
                throw new IllegalStateException("Fragment already added: " + componentCallbacksC0154j);
            }
            if (f901a) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0154j);
            }
            synchronized (this.f911e) {
                this.f911e.add(componentCallbacksC0154j);
            }
            componentCallbacksC0154j.f843t = true;
            if (componentCallbacksC0154j.f816M && componentCallbacksC0154j.f817N) {
                this.f923r = true;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1186m() {
        this.f924s = false;
        m1123e(1);
    }

    /* JADX INFO: renamed from: m */
    void m1187m(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.f821R == null) {
            return;
        }
        if (this.f903A == null) {
            this.f903A = new SparseArray<>();
        } else {
            this.f903A.clear();
        }
        componentCallbacksC0154j.f821R.saveHierarchyState(this.f903A);
        if (this.f903A.size() > 0) {
            componentCallbacksC0154j.f836m = this.f903A;
            this.f903A = null;
        }
    }

    /* JADX INFO: renamed from: n */
    Bundle m1188n(ComponentCallbacksC0154j componentCallbacksC0154j) {
        Bundle bundle;
        if (this.f931z == null) {
            this.f931z = new Bundle();
        }
        componentCallbacksC0154j.m976n(this.f931z);
        m1164d(componentCallbacksC0154j, this.f931z, false);
        if (this.f931z.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f931z;
            this.f931z = null;
        }
        if (componentCallbacksC0154j.f820Q != null) {
            m1187m(componentCallbacksC0154j);
        }
        if (componentCallbacksC0154j.f836m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC0154j.f836m);
        }
        if (!componentCallbacksC0154j.f823T) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC0154j.f823T);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public void m1189n() {
        this.f924s = false;
        m1123e(2);
    }

    /* JADX INFO: renamed from: o */
    public void m1190o() {
        this.f924s = false;
        m1123e(4);
    }

    /* JADX INFO: renamed from: o */
    public void m1191o(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j != null && (this.f912f.get(componentCallbacksC0154j.f837n) != componentCallbacksC0154j || (componentCallbacksC0154j.f805B != null && componentCallbacksC0154j.m973m() != this))) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC0154j + " is not an active fragment of FragmentManager " + this);
        }
        this.f922p = componentCallbacksC0154j;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ComponentCallbacksC0154j componentCallbacksC0154j;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f952a);
        String string = attributeValue == null ? typedArrayObtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!ComponentCallbacksC0154j.m883a(this.f919m.m1063g(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        ComponentCallbacksC0154j componentCallbacksC0154jM1149b = resourceId != -1 ? m1149b(resourceId) : null;
        if (componentCallbacksC0154jM1149b == null && string2 != null) {
            componentCallbacksC0154jM1149b = mo1072a(string2);
        }
        if (componentCallbacksC0154jM1149b == null && id != -1) {
            componentCallbacksC0154jM1149b = m1149b(id);
        }
        if (f901a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + componentCallbacksC0154jM1149b);
        }
        if (componentCallbacksC0154jM1149b == null) {
            ComponentCallbacksC0154j componentCallbacksC0154jMo989a = this.f920n.mo989a(context, string, null);
            componentCallbacksC0154jMo989a.f845v = true;
            componentCallbacksC0154jMo989a.f809F = resourceId != 0 ? resourceId : id;
            componentCallbacksC0154jMo989a.f810G = id;
            componentCallbacksC0154jMo989a.f811H = string2;
            componentCallbacksC0154jMo989a.f846w = true;
            componentCallbacksC0154jMo989a.f804A = this;
            componentCallbacksC0154jMo989a.f805B = this.f919m;
            componentCallbacksC0154jMo989a.m925a(this.f919m.m1063g(), attributeSet, componentCallbacksC0154jMo989a.f835l);
            m1140a(componentCallbacksC0154jMo989a, true);
            componentCallbacksC0154j = componentCallbacksC0154jMo989a;
        } else {
            if (componentCallbacksC0154jM1149b.f846w) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
            }
            componentCallbacksC0154jM1149b.f846w = true;
            componentCallbacksC0154jM1149b.f805B = this.f919m;
            if (!componentCallbacksC0154jM1149b.f815L) {
                componentCallbacksC0154jM1149b.m925a(this.f919m.m1063g(), attributeSet, componentCallbacksC0154jM1149b.f835l);
            }
            componentCallbacksC0154j = componentCallbacksC0154jM1149b;
        }
        if (this.f918l >= 1 || !componentCallbacksC0154j.f845v) {
            m1152b(componentCallbacksC0154j);
        } else {
            m1136a(componentCallbacksC0154j, 1, 0, 0, false);
        }
        if (componentCallbacksC0154j.f820Q == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            componentCallbacksC0154j.f820Q.setId(resourceId);
        }
        if (componentCallbacksC0154j.f820Q.getTag() == null) {
            componentCallbacksC0154j.f820Q.setTag(string2);
        }
        return componentCallbacksC0154j.f820Q;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: p */
    public void m1192p() {
        this.f924s = false;
        m1123e(5);
    }

    /* JADX INFO: renamed from: q */
    public void m1193q() {
        m1123e(4);
    }

    /* JADX INFO: renamed from: r */
    public void m1194r() {
        this.f924s = true;
        m1123e(3);
    }

    /* JADX INFO: renamed from: s */
    public void m1195s() {
        m1123e(2);
    }

    /* JADX INFO: renamed from: t */
    public void m1196t() {
        m1123e(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f921o != null) {
            C0210d.m1535a(this.f921o, sb);
        } else {
            C0210d.m1535a(this.f919m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m1197u() {
        this.f925t = true;
        m1171f();
        m1123e(0);
        this.f919m = null;
        this.f920n = null;
        this.f921o = null;
    }

    /* JADX INFO: renamed from: v */
    public void m1198v() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f911e.size()) {
                return;
            }
            ComponentCallbacksC0154j componentCallbacksC0154j = this.f911e.get(i2);
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.m898L();
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: w */
    public ComponentCallbacksC0154j m1199w() {
        return this.f922p;
    }

    /* JADX INFO: renamed from: x */
    LayoutInflater.Factory2 m1200x() {
        return this;
    }
}
