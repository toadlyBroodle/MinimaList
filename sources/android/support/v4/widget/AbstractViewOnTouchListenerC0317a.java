package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.p019j.C0246q;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.v4.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0317a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    private static final int f1629r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b */
    final View f1631b;

    /* JADX INFO: renamed from: c */
    boolean f1632c;

    /* JADX INFO: renamed from: d */
    boolean f1633d;

    /* JADX INFO: renamed from: e */
    boolean f1634e;

    /* JADX INFO: renamed from: g */
    private Runnable f1636g;

    /* JADX INFO: renamed from: j */
    private int f1639j;

    /* JADX INFO: renamed from: k */
    private int f1640k;

    /* JADX INFO: renamed from: o */
    private boolean f1644o;

    /* JADX INFO: renamed from: p */
    private boolean f1645p;

    /* JADX INFO: renamed from: q */
    private boolean f1646q;

    /* JADX INFO: renamed from: a */
    final a f1630a = new a();

    /* JADX INFO: renamed from: f */
    private final Interpolator f1635f = new AccelerateInterpolator();

    /* JADX INFO: renamed from: h */
    private float[] f1637h = {0.0f, 0.0f};

    /* JADX INFO: renamed from: i */
    private float[] f1638i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: l */
    private float[] f1641l = {0.0f, 0.0f};

    /* JADX INFO: renamed from: m */
    private float[] f1642m = {0.0f, 0.0f};

    /* JADX INFO: renamed from: n */
    private float[] f1643n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: android.support.v4.widget.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private int f1647a;

        /* JADX INFO: renamed from: b */
        private int f1648b;

        /* JADX INFO: renamed from: c */
        private float f1649c;

        /* JADX INFO: renamed from: d */
        private float f1650d;

        /* JADX INFO: renamed from: j */
        private float f1656j;

        /* JADX INFO: renamed from: k */
        private int f1657k;

        /* JADX INFO: renamed from: e */
        private long f1651e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        private long f1655i = -1;

        /* JADX INFO: renamed from: f */
        private long f1652f = 0;

        /* JADX INFO: renamed from: g */
        private int f1653g = 0;

        /* JADX INFO: renamed from: h */
        private int f1654h = 0;

        a() {
        }

        /* JADX INFO: renamed from: a */
        private float m2359a(float f) {
            return ((-4.0f) * f * f) + (4.0f * f);
        }

        /* JADX INFO: renamed from: a */
        private float m2360a(long j) {
            if (j < this.f1651e) {
                return 0.0f;
            }
            if (this.f1655i < 0 || j < this.f1655i) {
                return AbstractViewOnTouchListenerC0317a.m2337a((j - this.f1651e) / this.f1647a, 0.0f, 1.0f) * 0.5f;
            }
            return (AbstractViewOnTouchListenerC0317a.m2337a((j - this.f1655i) / this.f1657k, 0.0f, 1.0f) * this.f1656j) + (1.0f - this.f1656j);
        }

        /* JADX INFO: renamed from: a */
        public void m2361a() {
            this.f1651e = AnimationUtils.currentAnimationTimeMillis();
            this.f1655i = -1L;
            this.f1652f = this.f1651e;
            this.f1656j = 0.5f;
            this.f1653g = 0;
            this.f1654h = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m2362a(float f, float f2) {
            this.f1649c = f;
            this.f1650d = f2;
        }

        /* JADX INFO: renamed from: a */
        public void m2363a(int i) {
            this.f1647a = i;
        }

        /* JADX INFO: renamed from: b */
        public void m2364b() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1657k = AbstractViewOnTouchListenerC0317a.m2340a((int) (jCurrentAnimationTimeMillis - this.f1651e), 0, this.f1648b);
            this.f1656j = m2360a(jCurrentAnimationTimeMillis);
            this.f1655i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: b */
        public void m2365b(int i) {
            this.f1648b = i;
        }

        /* JADX INFO: renamed from: c */
        public boolean m2366c() {
            return this.f1655i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1655i + ((long) this.f1657k);
        }

        /* JADX INFO: renamed from: d */
        public void m2367d() {
            if (this.f1652f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM2359a = m2359a(m2360a(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f1652f;
            this.f1652f = jCurrentAnimationTimeMillis;
            this.f1653g = (int) (j * fM2359a * this.f1649c);
            this.f1654h = (int) (j * fM2359a * this.f1650d);
        }

        /* JADX INFO: renamed from: e */
        public int m2368e() {
            return (int) (this.f1649c / Math.abs(this.f1649c));
        }

        /* JADX INFO: renamed from: f */
        public int m2369f() {
            return (int) (this.f1650d / Math.abs(this.f1650d));
        }

        /* JADX INFO: renamed from: g */
        public int m2370g() {
            return this.f1653g;
        }

        /* JADX INFO: renamed from: h */
        public int m2371h() {
            return this.f1654h;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractViewOnTouchListenerC0317a.this.f1634e) {
                if (AbstractViewOnTouchListenerC0317a.this.f1632c) {
                    AbstractViewOnTouchListenerC0317a.this.f1632c = false;
                    AbstractViewOnTouchListenerC0317a.this.f1630a.m2361a();
                }
                a aVar = AbstractViewOnTouchListenerC0317a.this.f1630a;
                if (aVar.m2366c() || !AbstractViewOnTouchListenerC0317a.this.m2348a()) {
                    AbstractViewOnTouchListenerC0317a.this.f1634e = false;
                    return;
                }
                if (AbstractViewOnTouchListenerC0317a.this.f1633d) {
                    AbstractViewOnTouchListenerC0317a.this.f1633d = false;
                    AbstractViewOnTouchListenerC0317a.this.m2351b();
                }
                aVar.m2367d();
                AbstractViewOnTouchListenerC0317a.this.mo2347a(aVar.m2370g(), aVar.m2371h());
                C0246q.m1747a(AbstractViewOnTouchListenerC0317a.this.f1631b, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0317a(View view) {
        this.f1631b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m2344a(i, i);
        m2349b(i2, i2);
        m2345a(1);
        m2356e(Float.MAX_VALUE, Float.MAX_VALUE);
        m2354d(0.2f, 0.2f);
        m2352c(1.0f, 1.0f);
        m2350b(f1629r);
        m2353c(500);
        m2355d(500);
    }

    /* JADX INFO: renamed from: a */
    static float m2337a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: a */
    private float m2338a(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM2337a = m2337a(f * f2, 0.0f, f3);
        float fM2343f = m2343f(f2 - f4, fM2337a) - m2343f(f4, fM2337a);
        if (fM2343f < 0.0f) {
            interpolation = -this.f1635f.getInterpolation(-fM2343f);
        } else {
            if (fM2343f <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1635f.getInterpolation(fM2343f);
        }
        return m2337a(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    private float m2339a(int i, float f, float f2, float f3) {
        float fM2338a = m2338a(this.f1637h[i], f2, this.f1638i[i], f);
        if (fM2338a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1641l[i];
        float f5 = this.f1642m[i];
        float f6 = this.f1643n[i];
        float f7 = f4 * f3;
        return fM2338a > 0.0f ? m2337a(fM2338a * f7, f5, f6) : -m2337a((-fM2338a) * f7, f5, f6);
    }

    /* JADX INFO: renamed from: a */
    static int m2340a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: c */
    private void m2341c() {
        if (this.f1636g == null) {
            this.f1636g = new b();
        }
        this.f1634e = true;
        this.f1632c = true;
        if (this.f1644o || this.f1640k <= 0) {
            this.f1636g.run();
        } else {
            C0246q.m1748a(this.f1631b, this.f1636g, this.f1640k);
        }
        this.f1644o = true;
    }

    /* JADX INFO: renamed from: d */
    private void m2342d() {
        if (this.f1632c) {
            this.f1634e = false;
        } else {
            this.f1630a.m2364b();
        }
    }

    /* JADX INFO: renamed from: f */
    private float m2343f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1639j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        break;
                    } else if (this.f1634e && this.f1639j == 1) {
                        break;
                    }
                }
                break;
            case 2:
                if (f < 0.0f) {
                }
                break;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public AbstractViewOnTouchListenerC0317a m2344a(float f, float f2) {
        this.f1643n[0] = f / 1000.0f;
        this.f1643n[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public AbstractViewOnTouchListenerC0317a m2345a(int i) {
        this.f1639j = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public AbstractViewOnTouchListenerC0317a m2346a(boolean z) {
        if (this.f1645p && !z) {
            m2342d();
        }
        this.f1645p = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2347a(int i, int i2);

    /* JADX INFO: renamed from: a */
    boolean m2348a() {
        a aVar = this.f1630a;
        int iM2369f = aVar.m2369f();
        int iM2368e = aVar.m2368e();
        return (iM2369f != 0 && mo2358f(iM2369f)) || (iM2368e != 0 && mo2357e(iM2368e));
    }

    /* JADX INFO: renamed from: b */
    public AbstractViewOnTouchListenerC0317a m2349b(float f, float f2) {
        this.f1642m[0] = f / 1000.0f;
        this.f1642m[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public AbstractViewOnTouchListenerC0317a m2350b(int i) {
        this.f1640k = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    void m2351b() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1631b.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: c */
    public AbstractViewOnTouchListenerC0317a m2352c(float f, float f2) {
        this.f1641l[0] = f / 1000.0f;
        this.f1641l[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public AbstractViewOnTouchListenerC0317a m2353c(int i) {
        this.f1630a.m2363a(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public AbstractViewOnTouchListenerC0317a m2354d(float f, float f2) {
        this.f1637h[0] = f;
        this.f1637h[1] = f2;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public AbstractViewOnTouchListenerC0317a m2355d(int i) {
        this.f1630a.m2365b(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public AbstractViewOnTouchListenerC0317a m2356e(float f, float f2) {
        this.f1638i[0] = f;
        this.f1638i[1] = f2;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2357e(int i);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2358f(int i);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1645p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1633d = true;
                this.f1644o = false;
                this.f1630a.m2362a(m2339a(0, motionEvent.getX(), view.getWidth(), this.f1631b.getWidth()), m2339a(1, motionEvent.getY(), view.getHeight(), this.f1631b.getHeight()));
                if (!this.f1634e && m2348a()) {
                    m2341c();
                }
                break;
            case 1:
            case 3:
                m2342d();
                break;
            case 2:
                this.f1630a.m2362a(m2339a(0, motionEvent.getX(), view.getWidth(), this.f1631b.getWidth()), m2339a(1, motionEvent.getY(), view.getHeight(), this.f1631b.getHeight()));
                if (!this.f1634e) {
                    m2341c();
                }
                break;
        }
        return this.f1646q && this.f1634e;
    }
}
