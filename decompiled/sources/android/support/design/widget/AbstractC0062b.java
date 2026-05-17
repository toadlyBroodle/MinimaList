package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0025a;
import android.support.design.widget.AbstractC0062b;
import android.support.design.widget.C0072l;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v4.p019j.C0246q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: android.support.design.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0062b<B extends AbstractC0062b<B>> {

    /* JADX INFO: renamed from: a */
    static final Handler f345a;

    /* JADX INFO: renamed from: d */
    private static final boolean f346d;

    /* JADX INFO: renamed from: b */
    final f f347b;

    /* JADX INFO: renamed from: c */
    final C0072l.a f348c;

    /* JADX INFO: renamed from: e */
    private final ViewGroup f349e;

    /* JADX INFO: renamed from: f */
    private final c f350f;

    /* JADX INFO: renamed from: g */
    private List<a<B>> f351g;

    /* JADX INFO: renamed from: h */
    private final AccessibilityManager f352h;

    /* JADX INFO: renamed from: android.support.design.widget.b$a */
    public static abstract class a<B> {
        /* JADX INFO: renamed from: a */
        public void m458a(B b) {
        }

        /* JADX INFO: renamed from: a */
        public void m459a(B b, int i) {
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.b$b */
    final class b extends SwipeDismissBehavior<f> {
        b() {
        }

        @Override // android.support.design.widget.SwipeDismissBehavior, android.support.design.widget.CoordinatorLayout.AbstractC0045a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo290a(CoordinatorLayout coordinatorLayout, f fVar, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.m347a(fVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        C0072l.m531a().m541c(AbstractC0062b.this.f348c);
                    }
                    break;
                case 1:
                case 3:
                    C0072l.m531a().m542d(AbstractC0062b.this.f348c);
                    break;
            }
            return super.mo290a(coordinatorLayout, fVar, motionEvent);
        }

        @Override // android.support.design.widget.SwipeDismissBehavior
        /* JADX INFO: renamed from: a */
        public boolean mo437a(View view) {
            return view instanceof f;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo161a(int i, int i2);

        /* JADX INFO: renamed from: b */
        void mo162b(int i, int i2);
    }

    /* JADX INFO: renamed from: android.support.design.widget.b$d */
    interface d {
        /* JADX INFO: renamed from: a */
        void mo455a(View view);

        /* JADX INFO: renamed from: b */
        void mo456b(View view);
    }

    /* JADX INFO: renamed from: android.support.design.widget.b$e */
    interface e {
        /* JADX INFO: renamed from: a */
        void mo457a(View view, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: android.support.design.widget.b$f */
    static class f extends FrameLayout {

        /* JADX INFO: renamed from: a */
        private e f369a;

        /* JADX INFO: renamed from: b */
        private d f370b;

        f(Context context) {
            this(context, null);
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(C0025a.j.SnackbarLayout_elevation)) {
                C0246q.m1737a(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.SnackbarLayout_elevation, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            setClickable(true);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f370b != null) {
                this.f370b.mo455a(this);
            }
            C0246q.m1769o(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f370b != null) {
                this.f370b.mo456b(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f369a != null) {
                this.f369a.mo457a(this, i, i2, i3, i4);
            }
        }

        void setOnAttachStateChangeListener(d dVar) {
            this.f370b = dVar;
        }

        void setOnLayoutChangeListener(e eVar) {
            this.f369a = eVar;
        }
    }

    static {
        f346d = Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19;
        f345a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.b.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        ((AbstractC0062b) message.obj).m449b();
                        break;
                    case 1:
                        ((AbstractC0062b) message.obj).m450b(message.arg1);
                        break;
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private void m445d(final int i) {
        if (Build.VERSION.SDK_INT < 12) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f347b.getContext(), C0025a.a.design_snackbar_out);
            animationLoadAnimation.setInterpolator(C0061a.f341b);
            animationLoadAnimation.setDuration(250L);
            animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.b.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    AbstractC0062b.this.m452c(i);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.f347b.startAnimation(animationLoadAnimation);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, this.f347b.getHeight());
        valueAnimator.setInterpolator(C0061a.f341b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.b.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC0062b.this.m452c(i);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC0062b.this.f350f.mo162b(0, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.b.3

            /* JADX INFO: renamed from: b */
            private int f357b = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (AbstractC0062b.f346d) {
                    C0246q.m1753b(AbstractC0062b.this.f347b, iIntValue - this.f357b);
                } else {
                    AbstractC0062b.this.f347b.setTranslationY(iIntValue);
                }
                this.f357b = iIntValue;
            }
        });
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: a */
    void m447a(int i) {
        C0072l.m531a().m538a(this.f348c, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m448a() {
        return C0072l.m531a().m543e(this.f348c);
    }

    /* JADX INFO: renamed from: b */
    final void m449b() {
        if (this.f347b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f347b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0048d) {
                CoordinatorLayout.C0048d c0048d = (CoordinatorLayout.C0048d) layoutParams;
                b bVar = new b();
                bVar.m434a(0.1f);
                bVar.m438b(0.6f);
                bVar.m435a(0);
                bVar.m436a(new SwipeDismissBehavior.InterfaceC0059a() { // from class: android.support.design.widget.b.5
                    @Override // android.support.design.widget.SwipeDismissBehavior.InterfaceC0059a
                    /* JADX INFO: renamed from: a */
                    public void mo442a(int i) {
                        switch (i) {
                            case 0:
                                C0072l.m531a().m542d(AbstractC0062b.this.f348c);
                                break;
                            case 1:
                            case 2:
                                C0072l.m531a().m541c(AbstractC0062b.this.f348c);
                                break;
                        }
                    }

                    @Override // android.support.design.widget.SwipeDismissBehavior.InterfaceC0059a
                    /* JADX INFO: renamed from: a */
                    public void mo443a(View view) {
                        view.setVisibility(8);
                        AbstractC0062b.this.m447a(0);
                    }
                });
                c0048d.m380a(bVar);
                c0048d.f283g = 80;
            }
            this.f349e.addView(this.f347b);
        }
        this.f347b.setOnAttachStateChangeListener(new d() { // from class: android.support.design.widget.b.6
            @Override // android.support.design.widget.AbstractC0062b.d
            /* JADX INFO: renamed from: a */
            public void mo455a(View view) {
            }

            @Override // android.support.design.widget.AbstractC0062b.d
            /* JADX INFO: renamed from: b */
            public void mo456b(View view) {
                if (AbstractC0062b.this.m448a()) {
                    AbstractC0062b.f345a.post(new Runnable() { // from class: android.support.design.widget.b.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AbstractC0062b.this.m452c(3);
                        }
                    });
                }
            }
        });
        if (!C0246q.m1777w(this.f347b)) {
            this.f347b.setOnLayoutChangeListener(new e() { // from class: android.support.design.widget.b.7
                @Override // android.support.design.widget.AbstractC0062b.e
                /* JADX INFO: renamed from: a */
                public void mo457a(View view, int i, int i2, int i3, int i4) {
                    AbstractC0062b.this.f347b.setOnLayoutChangeListener(null);
                    if (AbstractC0062b.this.m454e()) {
                        AbstractC0062b.this.m451c();
                    } else {
                        AbstractC0062b.this.m453d();
                    }
                }
            });
        } else if (m454e()) {
            m451c();
        } else {
            m453d();
        }
    }

    /* JADX INFO: renamed from: b */
    final void m450b(int i) {
        if (m454e() && this.f347b.getVisibility() == 0) {
            m445d(i);
        } else {
            m452c(i);
        }
    }

    /* JADX INFO: renamed from: c */
    void m451c() {
        if (Build.VERSION.SDK_INT < 12) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f347b.getContext(), C0025a.a.design_snackbar_in);
            animationLoadAnimation.setInterpolator(C0061a.f341b);
            animationLoadAnimation.setDuration(250L);
            animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.b.10
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    AbstractC0062b.this.m453d();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.f347b.startAnimation(animationLoadAnimation);
            return;
        }
        final int height = this.f347b.getHeight();
        if (f346d) {
            C0246q.m1753b(this.f347b, height);
        } else {
            this.f347b.setTranslationY(height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(C0061a.f341b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.b.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC0062b.this.m453d();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC0062b.this.f350f.mo161a(70, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.b.9

            /* JADX INFO: renamed from: c */
            private int f367c;

            {
                this.f367c = height;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (AbstractC0062b.f346d) {
                    C0246q.m1753b(AbstractC0062b.this.f347b, iIntValue - this.f367c);
                } else {
                    AbstractC0062b.this.f347b.setTranslationY(iIntValue);
                }
                this.f367c = iIntValue;
            }
        });
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: c */
    void m452c(int i) {
        C0072l.m531a().m537a(this.f348c);
        if (this.f351g != null) {
            for (int size = this.f351g.size() - 1; size >= 0; size--) {
                this.f351g.get(size).m459a(this, i);
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.f347b.setVisibility(8);
        }
        ViewParent parent = this.f347b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f347b);
        }
    }

    /* JADX INFO: renamed from: d */
    void m453d() {
        C0072l.m531a().m540b(this.f348c);
        if (this.f351g != null) {
            for (int size = this.f351g.size() - 1; size >= 0; size--) {
                this.f351g.get(size).m458a(this);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    boolean m454e() {
        return !this.f352h.isEnabled();
    }
}
