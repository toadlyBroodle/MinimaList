package android.support.v7.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.p019j.C0246q;
import android.support.v7.widget.C0484av;
import android.view.MotionEvent;

/* JADX INFO: renamed from: android.support.v7.widget.aj */
/* JADX INFO: loaded from: classes.dex */
class C0472aj extends C0484av.g implements C0484av.l {

    /* JADX INFO: renamed from: g */
    private static final int[] f3047g = {R.attr.state_pressed};

    /* JADX INFO: renamed from: h */
    private static final int[] f3048h = new int[0];

    /* JADX INFO: renamed from: a */
    int f3054a;

    /* JADX INFO: renamed from: b */
    int f3055b;

    /* JADX INFO: renamed from: c */
    float f3056c;

    /* JADX INFO: renamed from: d */
    int f3057d;

    /* JADX INFO: renamed from: e */
    int f3058e;

    /* JADX INFO: renamed from: f */
    float f3059f;

    /* JADX INFO: renamed from: i */
    private final int f3060i;

    /* JADX INFO: renamed from: j */
    private final int f3061j;

    /* JADX INFO: renamed from: k */
    private final StateListDrawable f3062k;

    /* JADX INFO: renamed from: l */
    private final Drawable f3063l;

    /* JADX INFO: renamed from: m */
    private final int f3064m;

    /* JADX INFO: renamed from: n */
    private final int f3065n;

    /* JADX INFO: renamed from: o */
    private final StateListDrawable f3066o;

    /* JADX INFO: renamed from: p */
    private final Drawable f3067p;

    /* JADX INFO: renamed from: q */
    private final int f3068q;

    /* JADX INFO: renamed from: r */
    private final int f3069r;

    /* JADX INFO: renamed from: u */
    private C0484av f3072u;

    /* JADX INFO: renamed from: s */
    private int f3070s = 0;

    /* JADX INFO: renamed from: t */
    private int f3071t = 0;

    /* JADX INFO: renamed from: v */
    private boolean f3073v = false;

    /* JADX INFO: renamed from: w */
    private boolean f3074w = false;

    /* JADX INFO: renamed from: x */
    private int f3075x = 0;

    /* JADX INFO: renamed from: y */
    private int f3076y = 0;

    /* JADX INFO: renamed from: z */
    private final int[] f3077z = new int[2];

    /* JADX INFO: renamed from: A */
    private final int[] f3049A = new int[2];

    /* JADX INFO: renamed from: B */
    private final ValueAnimator f3050B = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* JADX INFO: renamed from: C */
    private int f3051C = 0;

    /* JADX INFO: renamed from: D */
    private final Runnable f3052D = new Runnable() { // from class: android.support.v7.widget.aj.1
        @Override // java.lang.Runnable
        public void run() {
            C0472aj.this.m3893a(500);
        }
    };

    /* JADX INFO: renamed from: E */
    private final C0484av.m f3053E = new C0484av.m() { // from class: android.support.v7.widget.aj.2
        @Override // android.support.v7.widget.C0484av.m
        /* JADX INFO: renamed from: a */
        public void mo3902a(C0484av c0484av, int i, int i2) {
            C0472aj.this.m3894a(c0484av.computeHorizontalScrollOffset(), c0484av.computeVerticalScrollOffset());
        }
    };

    /* JADX INFO: renamed from: android.support.v7.widget.aj$a */
    private class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        private boolean f3081b;

        private a() {
            this.f3081b = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3081b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3081b) {
                this.f3081b = false;
            } else if (((Float) C0472aj.this.f3050B.getAnimatedValue()).floatValue() == 0.0f) {
                C0472aj.this.f3051C = 0;
                C0472aj.this.m3879b(0);
            } else {
                C0472aj.this.f3051C = 2;
                C0472aj.this.m3887d();
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.aj$b */
    private class b implements ValueAnimator.AnimatorUpdateListener {
        private b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0472aj.this.f3062k.setAlpha(iFloatValue);
            C0472aj.this.f3063l.setAlpha(iFloatValue);
            C0472aj.this.m3887d();
        }
    }

    C0472aj(C0484av c0484av, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3062k = stateListDrawable;
        this.f3063l = drawable;
        this.f3066o = stateListDrawable2;
        this.f3067p = drawable2;
        this.f3064m = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3065n = Math.max(i, drawable.getIntrinsicWidth());
        this.f3068q = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3069r = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3060i = i2;
        this.f3061j = i3;
        this.f3062k.setAlpha(255);
        this.f3063l.setAlpha(255);
        this.f3050B.addListener(new a());
        this.f3050B.addUpdateListener(new b());
        m3896a(c0484av);
    }

    /* JADX INFO: renamed from: a */
    private int m3872a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: renamed from: a */
    private void m3875a(float f) {
        int[] iArrM3890g = m3890g();
        float fMax = Math.max(iArrM3890g[0], Math.min(iArrM3890g[1], f));
        if (Math.abs(this.f3055b - fMax) < 2.0f) {
            return;
        }
        int iM3872a = m3872a(this.f3056c, fMax, iArrM3890g, this.f3072u.computeVerticalScrollRange(), this.f3072u.computeVerticalScrollOffset(), this.f3071t);
        if (iM3872a != 0) {
            this.f3072u.scrollBy(0, iM3872a);
        }
        this.f3056c = fMax;
    }

    /* JADX INFO: renamed from: a */
    private void m3876a(Canvas canvas) {
        int i = this.f3070s - this.f3064m;
        int i2 = this.f3055b - (this.f3054a / 2);
        this.f3062k.setBounds(0, 0, this.f3064m, this.f3054a);
        this.f3063l.setBounds(0, 0, this.f3065n, this.f3071t);
        if (!m3888e()) {
            canvas.translate(i, 0.0f);
            this.f3063l.draw(canvas);
            canvas.translate(0.0f, i2);
            this.f3062k.draw(canvas);
            canvas.translate(-i, -i2);
            return;
        }
        this.f3063l.draw(canvas);
        canvas.translate(this.f3064m, i2);
        canvas.scale(-1.0f, 1.0f);
        this.f3062k.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f3064m, -i2);
    }

    /* JADX INFO: renamed from: b */
    private void m3877b() {
        this.f3072u.m4068a((C0484av.g) this);
        this.f3072u.m4070a((C0484av.l) this);
        this.f3072u.m4071a(this.f3053E);
    }

    /* JADX INFO: renamed from: b */
    private void m3878b(float f) {
        int[] iArrM3891h = m3891h();
        float fMax = Math.max(iArrM3891h[0], Math.min(iArrM3891h[1], f));
        if (Math.abs(this.f3058e - fMax) < 2.0f) {
            return;
        }
        int iM3872a = m3872a(this.f3059f, fMax, iArrM3891h, this.f3072u.computeHorizontalScrollRange(), this.f3072u.computeHorizontalScrollOffset(), this.f3070s);
        if (iM3872a != 0) {
            this.f3072u.scrollBy(iM3872a, 0);
        }
        this.f3059f = fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3879b(int i) {
        if (i == 2 && this.f3075x != 2) {
            this.f3062k.setState(f3047g);
            m3889f();
        }
        if (i == 0) {
            m3887d();
        } else {
            m3892a();
        }
        if (this.f3075x == 2 && i != 2) {
            this.f3062k.setState(f3048h);
            m3885c(1200);
        } else if (i == 1) {
            m3885c(1500);
        }
        this.f3075x = i;
    }

    /* JADX INFO: renamed from: b */
    private void m3880b(Canvas canvas) {
        int i = this.f3071t - this.f3068q;
        int i2 = this.f3058e - (this.f3057d / 2);
        this.f3066o.setBounds(0, 0, this.f3057d, this.f3068q);
        this.f3067p.setBounds(0, 0, this.f3070s, this.f3069r);
        canvas.translate(0.0f, i);
        this.f3067p.draw(canvas);
        canvas.translate(i2, 0.0f);
        this.f3066o.draw(canvas);
        canvas.translate(-i2, -i);
    }

    /* JADX INFO: renamed from: c */
    private void m3884c() {
        this.f3072u.m4086b((C0484av.g) this);
        this.f3072u.m4087b((C0484av.l) this);
        this.f3072u.m4088b(this.f3053E);
        m3889f();
    }

    /* JADX INFO: renamed from: c */
    private void m3885c(int i) {
        m3889f();
        this.f3072u.postDelayed(this.f3052D, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3887d() {
        this.f3072u.invalidate();
    }

    /* JADX INFO: renamed from: e */
    private boolean m3888e() {
        return C0246q.m1759e(this.f3072u) == 1;
    }

    /* JADX INFO: renamed from: f */
    private void m3889f() {
        this.f3072u.removeCallbacks(this.f3052D);
    }

    /* JADX INFO: renamed from: g */
    private int[] m3890g() {
        this.f3077z[0] = this.f3061j;
        this.f3077z[1] = this.f3071t - this.f3061j;
        return this.f3077z;
    }

    /* JADX INFO: renamed from: h */
    private int[] m3891h() {
        this.f3049A[0] = this.f3061j;
        this.f3049A[1] = this.f3070s - this.f3061j;
        return this.f3049A;
    }

    /* JADX INFO: renamed from: a */
    public void m3892a() {
        switch (this.f3051C) {
            case 0:
                break;
            case 1:
            case 2:
            default:
                return;
            case 3:
                this.f3050B.cancel();
                break;
        }
        this.f3051C = 1;
        this.f3050B.setFloatValues(((Float) this.f3050B.getAnimatedValue()).floatValue(), 1.0f);
        this.f3050B.setDuration(500L);
        this.f3050B.setStartDelay(0L);
        this.f3050B.start();
    }

    /* JADX INFO: renamed from: a */
    void m3893a(int i) {
        switch (this.f3051C) {
            case 1:
                this.f3050B.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f3051C = 3;
        this.f3050B.setFloatValues(((Float) this.f3050B.getAnimatedValue()).floatValue(), 0.0f);
        this.f3050B.setDuration(i);
        this.f3050B.start();
    }

    /* JADX INFO: renamed from: a */
    void m3894a(int i, int i2) {
        int iComputeVerticalScrollRange = this.f3072u.computeVerticalScrollRange();
        int i3 = this.f3071t;
        this.f3073v = iComputeVerticalScrollRange - i3 > 0 && this.f3071t >= this.f3060i;
        int iComputeHorizontalScrollRange = this.f3072u.computeHorizontalScrollRange();
        int i4 = this.f3070s;
        this.f3074w = iComputeHorizontalScrollRange - i4 > 0 && this.f3070s >= this.f3060i;
        if (!this.f3073v && !this.f3074w) {
            if (this.f3075x != 0) {
                m3879b(0);
                return;
            }
            return;
        }
        if (this.f3073v) {
            this.f3055b = (int) (((i2 + (i3 / 2.0f)) * i3) / iComputeVerticalScrollRange);
            this.f3054a = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f3074w) {
            this.f3058e = (int) (((i + (i4 / 2.0f)) * i4) / iComputeHorizontalScrollRange);
            this.f3057d = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        if (this.f3075x == 0 || this.f3075x == 1) {
            m3879b(1);
        }
    }

    @Override // android.support.v7.widget.C0484av.g
    /* JADX INFO: renamed from: a */
    public void mo3895a(Canvas canvas, C0484av c0484av, C0484av.t tVar) {
        if (this.f3070s != this.f3072u.getWidth() || this.f3071t != this.f3072u.getHeight()) {
            this.f3070s = this.f3072u.getWidth();
            this.f3071t = this.f3072u.getHeight();
            m3879b(0);
        } else if (this.f3051C != 0) {
            if (this.f3073v) {
                m3876a(canvas);
            }
            if (this.f3074w) {
                m3880b(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3896a(C0484av c0484av) {
        if (this.f3072u == c0484av) {
            return;
        }
        if (this.f3072u != null) {
            m3884c();
        }
        this.f3072u = c0484av;
        if (this.f3072u != null) {
            m3877b();
        }
    }

    @Override // android.support.v7.widget.C0484av.l
    /* JADX INFO: renamed from: a */
    public void mo3897a(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    boolean m3898a(float f, float f2) {
        if (!m3888e() ? f >= this.f3070s - this.f3064m : f <= this.f3064m / 2) {
            if (f2 >= this.f3055b - (this.f3054a / 2) && f2 <= this.f3055b + (this.f3054a / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.C0484av.l
    /* JADX INFO: renamed from: a */
    public boolean mo3899a(C0484av c0484av, MotionEvent motionEvent) {
        if (this.f3075x != 1) {
            return this.f3075x == 2;
        }
        boolean zM3898a = m3898a(motionEvent.getX(), motionEvent.getY());
        boolean zM3901b = m3901b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zM3898a && !zM3901b)) {
            return false;
        }
        if (zM3901b) {
            this.f3076y = 1;
            this.f3059f = (int) motionEvent.getX();
        } else if (zM3898a) {
            this.f3076y = 2;
            this.f3056c = (int) motionEvent.getY();
        }
        m3879b(2);
        return true;
    }

    @Override // android.support.v7.widget.C0484av.l
    /* JADX INFO: renamed from: b */
    public void mo3900b(C0484av c0484av, MotionEvent motionEvent) {
        if (this.f3075x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM3898a = m3898a(motionEvent.getX(), motionEvent.getY());
            boolean zM3901b = m3901b(motionEvent.getX(), motionEvent.getY());
            if (zM3898a || zM3901b) {
                if (zM3901b) {
                    this.f3076y = 1;
                    this.f3059f = (int) motionEvent.getX();
                } else if (zM3898a) {
                    this.f3076y = 2;
                    this.f3056c = (int) motionEvent.getY();
                }
                m3879b(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3075x == 2) {
            this.f3056c = 0.0f;
            this.f3059f = 0.0f;
            m3879b(1);
            this.f3076y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3075x == 2) {
            m3892a();
            if (this.f3076y == 1) {
                m3878b(motionEvent.getX());
            }
            if (this.f3076y == 2) {
                m3875a(motionEvent.getY());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    boolean m3901b(float f, float f2) {
        return f2 >= ((float) (this.f3071t - this.f3068q)) && f >= ((float) (this.f3058e - (this.f3057d / 2))) && f <= ((float) (this.f3058e + (this.f3057d / 2)));
    }
}
