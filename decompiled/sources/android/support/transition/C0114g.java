package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v4.p019j.C0246q;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.transition.g */
/* JADX INFO: loaded from: classes.dex */
public class C0114g extends AbstractC0105at {

    /* JADX INFO: renamed from: android.support.transition.g$a */
    private static class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        private final View f594a;

        /* JADX INFO: renamed from: b */
        private boolean f595b = false;

        a(View view) {
            this.f594a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0098am.m611a(this.f594a, 1.0f);
            if (this.f595b) {
                this.f594a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0246q.m1771q(this.f594a) && this.f594a.getLayerType() == 0) {
                this.f595b = true;
                this.f594a.setLayerType(2, null);
            }
        }
    }

    public C0114g() {
    }

    public C0114g(int i) {
        m643a(i);
    }

    /* JADX INFO: renamed from: a */
    private static float m673a(C0086aa c0086aa, float f) {
        Float f2;
        return (c0086aa == null || (f2 = (Float) c0086aa.f497a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: a */
    private Animator m674a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0098am.m611a(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C0098am.f521a, f2);
        objectAnimatorOfFloat.addListener(new a(view));
        mo700a(new C0129v() { // from class: android.support.transition.g.1
            @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
            /* JADX INFO: renamed from: a */
            public void mo583a(AbstractC0128u abstractC0128u) {
                C0098am.m611a(view, 1.0f);
                C0098am.m619e(view);
                abstractC0128u.mo712b(this);
            }
        });
        return objectAnimatorOfFloat;
    }

    @Override // android.support.transition.AbstractC0105at
    /* JADX INFO: renamed from: a */
    public Animator mo642a(ViewGroup viewGroup, View view, C0086aa c0086aa, C0086aa c0086aa2) {
        float fM673a = m673a(c0086aa, 0.0f);
        return m674a(view, fM673a != 1.0f ? fM673a : 0.0f, 1.0f);
    }

    @Override // android.support.transition.AbstractC0105at, android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public void mo644a(C0086aa c0086aa) {
        super.mo644a(c0086aa);
        c0086aa.f497a.put("android:fade:transitionAlpha", Float.valueOf(C0098am.m617c(c0086aa.f498b)));
    }

    @Override // android.support.transition.AbstractC0105at
    /* JADX INFO: renamed from: b */
    public Animator mo648b(ViewGroup viewGroup, View view, C0086aa c0086aa, C0086aa c0086aa2) {
        C0098am.m618d(view);
        return m674a(view, m673a(c0086aa, 1.0f), 0.0f);
    }
}
