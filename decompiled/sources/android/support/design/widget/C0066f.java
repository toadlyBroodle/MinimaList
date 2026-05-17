package android.support.design.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.design.C0025a;
import android.support.v4.p007b.C0175b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p019j.C0246q;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.design.widget.f */
/* JADX INFO: loaded from: classes.dex */
class C0066f {

    /* JADX INFO: renamed from: a */
    static final Interpolator f387a = C0061a.f342c;

    /* JADX INFO: renamed from: j */
    static final int[] f388j = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: k */
    static final int[] f389k = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: l */
    static final int[] f390l = {R.attr.state_enabled};

    /* JADX INFO: renamed from: m */
    static final int[] f391m = new int[0];

    /* JADX INFO: renamed from: c */
    C0070j f393c;

    /* JADX INFO: renamed from: d */
    Drawable f394d;

    /* JADX INFO: renamed from: e */
    Drawable f395e;

    /* JADX INFO: renamed from: f */
    C0063c f396f;

    /* JADX INFO: renamed from: g */
    Drawable f397g;

    /* JADX INFO: renamed from: h */
    float f398h;

    /* JADX INFO: renamed from: i */
    float f399i;

    /* JADX INFO: renamed from: n */
    final C0080t f400n;

    /* JADX INFO: renamed from: o */
    final InterfaceC0071k f401o;

    /* JADX INFO: renamed from: q */
    private float f403q;

    /* JADX INFO: renamed from: s */
    private ViewTreeObserver.OnPreDrawListener f405s;

    /* JADX INFO: renamed from: b */
    int f392b = 0;

    /* JADX INFO: renamed from: r */
    private final Rect f404r = new Rect();

    /* JADX INFO: renamed from: p */
    private final C0073m f402p = new C0073m();

    /* JADX INFO: renamed from: android.support.design.widget.f$a */
    private class a extends e {
        a() {
            super();
        }

        @Override // android.support.design.widget.C0066f.e
        /* JADX INFO: renamed from: a */
        protected float mo509a() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.f$b */
    private class b extends e {
        b() {
            super();
        }

        @Override // android.support.design.widget.C0066f.e
        /* JADX INFO: renamed from: a */
        protected float mo509a() {
            return C0066f.this.f398h + C0066f.this.f399i;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.f$c */
    interface c {
        /* JADX INFO: renamed from: a */
        void mo405a();

        /* JADX INFO: renamed from: b */
        void mo406b();
    }

    /* JADX INFO: renamed from: android.support.design.widget.f$d */
    private class d extends e {
        d() {
            super();
        }

        @Override // android.support.design.widget.C0066f.e
        /* JADX INFO: renamed from: a */
        protected float mo509a() {
            return C0066f.this.f398h;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.f$e */
    private abstract class e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        private boolean f417a;

        /* JADX INFO: renamed from: c */
        private float f419c;

        /* JADX INFO: renamed from: d */
        private float f420d;

        private e() {
        }

        /* JADX INFO: renamed from: a */
        protected abstract float mo509a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0066f.this.f393c.m530b(this.f420d);
            this.f417a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f417a) {
                this.f419c = C0066f.this.f393c.m526a();
                this.f420d = mo509a();
                this.f417a = true;
            }
            C0066f.this.f393c.m530b(this.f419c + ((this.f420d - this.f419c) * valueAnimator.getAnimatedFraction()));
        }
    }

    C0066f(C0080t c0080t, InterfaceC0071k interfaceC0071k) {
        this.f400n = c0080t;
        this.f401o = interfaceC0071k;
        this.f402p.m551a(f388j, m477a(new b()));
        this.f402p.m551a(f389k, m477a(new b()));
        this.f402p.m551a(f390l, m477a(new d()));
        this.f402p.m551a(f391m, m477a(new a()));
        this.f403q = this.f400n.getRotation();
    }

    /* JADX INFO: renamed from: a */
    private ValueAnimator m477a(e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f387a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: b */
    private static ColorStateList m478b(int i) {
        return new ColorStateList(new int[][]{f389k, f388j, new int[0]}, new int[]{i, i, 0});
    }

    /* JADX INFO: renamed from: o */
    private void m479o() {
        if (this.f405s == null) {
            this.f405s = new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.design.widget.f.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    C0066f.this.m504j();
                    return true;
                }
            };
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m480p() {
        return C0246q.m1777w(this.f400n) && !this.f400n.isInEditMode();
    }

    /* JADX INFO: renamed from: q */
    private void m481q() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f403q % 90.0f != 0.0f) {
                if (this.f400n.getLayerType() != 1) {
                    this.f400n.setLayerType(1, null);
                }
            } else if (this.f400n.getLayerType() != 0) {
                this.f400n.setLayerType(0, null);
            }
        }
        if (this.f393c != null) {
            this.f393c.m527a(-this.f403q);
        }
        if (this.f396f != null) {
            this.f396f.m465b(-this.f403q);
        }
    }

    /* JADX INFO: renamed from: a */
    float mo482a() {
        return this.f398h;
    }

    /* JADX INFO: renamed from: a */
    C0063c m483a(int i, ColorStateList colorStateList) {
        Context context = this.f400n.getContext();
        C0063c c0063cMo503i = mo503i();
        c0063cMo503i.m463a(C0175b.m1341c(context, C0025a.c.design_fab_stroke_top_outer_color), C0175b.m1341c(context, C0025a.c.design_fab_stroke_top_inner_color), C0175b.m1341c(context, C0025a.c.design_fab_stroke_end_inner_color), C0175b.m1341c(context, C0025a.c.design_fab_stroke_end_outer_color));
        c0063cMo503i.m462a(i);
        c0063cMo503i.m464a(colorStateList);
        return c0063cMo503i;
    }

    /* JADX INFO: renamed from: a */
    final void m484a(float f) {
        if (this.f398h != f) {
            this.f398h = f;
            mo485a(f, this.f399i);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo485a(float f, float f2) {
        if (this.f393c != null) {
            this.f393c.m528a(f, this.f399i + f);
            m499e();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo486a(int i) {
        if (this.f395e != null) {
            C0181a.m1390a(this.f395e, m478b(i));
        }
    }

    /* JADX INFO: renamed from: a */
    void m487a(ColorStateList colorStateList) {
        if (this.f394d != null) {
            C0181a.m1390a(this.f394d, colorStateList);
        }
        if (this.f396f != null) {
            this.f396f.m464a(colorStateList);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo488a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.f394d = C0181a.m1400f(m505k());
        C0181a.m1390a(this.f394d, colorStateList);
        if (mode != null) {
            C0181a.m1393a(this.f394d, mode);
        }
        this.f395e = C0181a.m1400f(m505k());
        C0181a.m1390a(this.f395e, m478b(i));
        if (i2 > 0) {
            this.f396f = m483a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f396f, this.f394d, this.f395e};
        } else {
            this.f396f = null;
            drawableArr = new Drawable[]{this.f394d, this.f395e};
        }
        this.f397g = new LayerDrawable(drawableArr);
        this.f393c = new C0070j(this.f400n.getContext(), this.f397g, this.f401o.mo417a(), this.f398h, this.f398h + this.f399i);
        this.f393c.m529a(false);
        this.f401o.mo419a(this.f393c);
    }

    /* JADX INFO: renamed from: a */
    void m489a(PorterDuff.Mode mode) {
        if (this.f394d != null) {
            C0181a.m1393a(this.f394d, mode);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo490a(Rect rect) {
        this.f393c.getPadding(rect);
    }

    /* JADX INFO: renamed from: a */
    void m491a(final c cVar, final boolean z) {
        if (m508n()) {
            return;
        }
        this.f400n.animate().cancel();
        if (m480p()) {
            this.f392b = 1;
            this.f400n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(C0061a.f342c).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.f.1

                /* JADX INFO: renamed from: d */
                private boolean f409d;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.f409d = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C0066f.this.f392b = 0;
                    if (this.f409d) {
                        return;
                    }
                    C0066f.this.f400n.m565a(z ? 8 : 4, z);
                    if (cVar != null) {
                        cVar.mo406b();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C0066f.this.f400n.m565a(0, z);
                    this.f409d = false;
                }
            });
        } else {
            this.f400n.m565a(z ? 8 : 4, z);
            if (cVar != null) {
                cVar.mo406b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo492a(int[] iArr) {
        this.f402p.m550a(iArr);
    }

    /* JADX INFO: renamed from: b */
    void mo493b() {
        this.f402p.m549a();
    }

    /* JADX INFO: renamed from: b */
    final void m494b(float f) {
        if (this.f399i != f) {
            this.f399i = f;
            mo485a(this.f398h, f);
        }
    }

    /* JADX INFO: renamed from: b */
    void mo495b(Rect rect) {
    }

    /* JADX INFO: renamed from: b */
    void m496b(final c cVar, final boolean z) {
        if (m507m()) {
            return;
        }
        this.f400n.animate().cancel();
        if (m480p()) {
            this.f392b = 2;
            if (this.f400n.getVisibility() != 0) {
                this.f400n.setAlpha(0.0f);
                this.f400n.setScaleY(0.0f);
                this.f400n.setScaleX(0.0f);
            }
            this.f400n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).setInterpolator(C0061a.f343d).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.f.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C0066f.this.f392b = 0;
                    if (cVar != null) {
                        cVar.mo405a();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C0066f.this.f400n.m565a(0, z);
                }
            });
            return;
        }
        this.f400n.m565a(0, z);
        this.f400n.setAlpha(1.0f);
        this.f400n.setScaleY(1.0f);
        this.f400n.setScaleX(1.0f);
        if (cVar != null) {
            cVar.mo405a();
        }
    }

    /* JADX INFO: renamed from: c */
    final Drawable m497c() {
        return this.f397g;
    }

    /* JADX INFO: renamed from: d */
    void mo498d() {
    }

    /* JADX INFO: renamed from: e */
    final void m499e() {
        Rect rect = this.f404r;
        mo490a(rect);
        mo495b(rect);
        this.f401o.mo418a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: f */
    void m500f() {
        if (mo502h()) {
            m479o();
            this.f400n.getViewTreeObserver().addOnPreDrawListener(this.f405s);
        }
    }

    /* JADX INFO: renamed from: g */
    void m501g() {
        if (this.f405s != null) {
            this.f400n.getViewTreeObserver().removeOnPreDrawListener(this.f405s);
            this.f405s = null;
        }
    }

    /* JADX INFO: renamed from: h */
    boolean mo502h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    C0063c mo503i() {
        return new C0063c();
    }

    /* JADX INFO: renamed from: j */
    void m504j() {
        float rotation = this.f400n.getRotation();
        if (this.f403q != rotation) {
            this.f403q = rotation;
            m481q();
        }
    }

    /* JADX INFO: renamed from: k */
    GradientDrawable m505k() {
        GradientDrawable gradientDrawableMo506l = mo506l();
        gradientDrawableMo506l.setShape(1);
        gradientDrawableMo506l.setColor(-1);
        return gradientDrawableMo506l;
    }

    /* JADX INFO: renamed from: l */
    GradientDrawable mo506l() {
        return new GradientDrawable();
    }

    /* JADX INFO: renamed from: m */
    boolean m507m() {
        return this.f400n.getVisibility() != 0 ? this.f392b == 2 : this.f392b != 1;
    }

    /* JADX INFO: renamed from: n */
    boolean m508n() {
        return this.f400n.getVisibility() == 0 ? this.f392b == 1 : this.f392b != 2;
    }
}
