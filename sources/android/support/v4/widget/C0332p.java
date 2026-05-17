package android.support.v4.widget;

import android.content.Context;
import android.support.v4.p019j.C0246q;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: android.support.v4.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C0332p {

    /* JADX INFO: renamed from: v */
    private static final Interpolator f1742v = new Interpolator() { // from class: android.support.v4.widget.p.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* JADX INFO: renamed from: a */
    private int f1743a;

    /* JADX INFO: renamed from: b */
    private int f1744b;

    /* JADX INFO: renamed from: d */
    private float[] f1746d;

    /* JADX INFO: renamed from: e */
    private float[] f1747e;

    /* JADX INFO: renamed from: f */
    private float[] f1748f;

    /* JADX INFO: renamed from: g */
    private float[] f1749g;

    /* JADX INFO: renamed from: h */
    private int[] f1750h;

    /* JADX INFO: renamed from: i */
    private int[] f1751i;

    /* JADX INFO: renamed from: j */
    private int[] f1752j;

    /* JADX INFO: renamed from: k */
    private int f1753k;

    /* JADX INFO: renamed from: l */
    private VelocityTracker f1754l;

    /* JADX INFO: renamed from: m */
    private float f1755m;

    /* JADX INFO: renamed from: n */
    private float f1756n;

    /* JADX INFO: renamed from: o */
    private int f1757o;

    /* JADX INFO: renamed from: p */
    private int f1758p;

    /* JADX INFO: renamed from: q */
    private OverScroller f1759q;

    /* JADX INFO: renamed from: r */
    private final a f1760r;

    /* JADX INFO: renamed from: s */
    private View f1761s;

    /* JADX INFO: renamed from: t */
    private boolean f1762t;

    /* JADX INFO: renamed from: u */
    private final ViewGroup f1763u;

    /* JADX INFO: renamed from: c */
    private int f1745c = -1;

    /* JADX INFO: renamed from: w */
    private final Runnable f1764w = new Runnable() { // from class: android.support.v4.widget.p.2
        @Override // java.lang.Runnable
        public void run() {
            C0332p.this.m2507c(0);
        }
    };

    /* JADX INFO: renamed from: android.support.v4.widget.p$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public int mo299a(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public int mo300a(View view, int i, int i2) {
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public void mo301a(int i) {
        }

        /* JADX INFO: renamed from: a */
        public void mo2445a(int i, int i2) {
        }

        /* JADX INFO: renamed from: a */
        public void mo302a(View view, float f, float f2) {
        }

        /* JADX INFO: renamed from: a */
        public void mo303a(View view, int i, int i2, int i3, int i4) {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo304a(View view, int i);

        /* JADX INFO: renamed from: b */
        public int mo440b(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int mo305b(View view, int i, int i2) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public void mo2448b(int i, int i2) {
        }

        /* JADX INFO: renamed from: b */
        public void mo441b(View view, int i) {
        }

        /* JADX INFO: renamed from: b */
        public boolean mo2449b(int i) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public int m2513c(int i) {
            return i;
        }
    }

    private C0332p(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1763u = viewGroup;
        this.f1760r = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1757o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1744b = viewConfiguration.getScaledTouchSlop();
        this.f1755m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1756n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1759q = new OverScroller(context, f1742v);
    }

    /* JADX INFO: renamed from: a */
    private float m2471a(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    /* JADX INFO: renamed from: a */
    private int m2472a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1763u.getWidth();
        int i4 = width / 2;
        float fM2481b = (m2481b(Math.min(1.0f, Math.abs(i) / width)) * i4) + i4;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM2481b / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: a */
    private int m2473a(View view, int i, int i2, int i3, int i4) {
        int iM2482b = m2482b(i3, (int) this.f1756n, (int) this.f1755m);
        int iM2482b2 = m2482b(i4, (int) this.f1756n, (int) this.f1755m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM2482b);
        int iAbs4 = Math.abs(iM2482b2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        return (int) (((iM2482b2 != 0 ? iAbs4 / i5 : iAbs2 / i6) * m2472a(i2, iM2482b2, this.f1760r.mo299a(view))) + ((iM2482b != 0 ? iAbs3 / i5 : iAbs / i6) * m2472a(i, iM2482b, this.f1760r.mo440b(view))));
    }

    /* JADX INFO: renamed from: a */
    public static C0332p m2474a(ViewGroup viewGroup, float f, a aVar) {
        C0332p c0332pM2475a = m2475a(viewGroup, aVar);
        c0332pM2475a.f1744b = (int) (c0332pM2475a.f1744b * (1.0f / f));
        return c0332pM2475a;
    }

    /* JADX INFO: renamed from: a */
    public static C0332p m2475a(ViewGroup viewGroup, a aVar) {
        return new C0332p(viewGroup.getContext(), viewGroup, aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m2476a(float f, float f2) {
        this.f1762t = true;
        this.f1760r.mo302a(this.f1761s, f, f2);
        this.f1762t = false;
        if (this.f1743a == 1) {
            m2507c(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2477a(float f, float f2, int i) {
        m2489f(i);
        float[] fArr = this.f1746d;
        this.f1748f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1747e;
        this.f1749g[i] = f2;
        fArr2[i] = f2;
        this.f1750h[i] = m2486e((int) f, (int) f2);
        this.f1753k |= 1 << i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2478a(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f1750h[i] & i2) != i2 || (this.f1758p & i2) == 0 || (this.f1752j[i] & i2) == i2 || (this.f1751i[i] & i2) == i2) {
            return false;
        }
        if (fAbs <= this.f1744b && fAbs2 <= this.f1744b) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f1760r.mo2449b(i2)) {
            return (this.f1751i[i] & i2) == 0 && fAbs > ((float) this.f1744b);
        }
        int[] iArr = this.f1752j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2479a(int i, int i2, int i3, int i4) {
        int left = this.f1761s.getLeft();
        int top = this.f1761s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1759q.abortAnimation();
            m2507c(0);
            return false;
        }
        this.f1759q.startScroll(left, top, i5, i6, m2473a(this.f1761s, i5, i6, i3, i4));
        m2507c(2);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2480a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1760r.mo440b(view) > 0;
        boolean z2 = this.f1760r.mo299a(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f1744b * this.f1744b)) : z ? Math.abs(f) > ((float) this.f1744b) : z2 && Math.abs(f2) > ((float) this.f1744b);
    }

    /* JADX INFO: renamed from: b */
    private float m2481b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: b */
    private int m2482b(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    /* JADX INFO: renamed from: b */
    private void m2483b(float f, float f2, int i) {
        int i2 = m2478a(f, f2, i, 1) ? 1 : 0;
        if (m2478a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2478a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2478a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1751i;
            iArr[i] = iArr[i] | i2;
            this.f1760r.mo2448b(i2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2484b(int i, int i2, int i3, int i4) {
        int iMo305b;
        int iMo300a;
        int left = this.f1761s.getLeft();
        int top = this.f1761s.getTop();
        if (i3 != 0) {
            iMo305b = this.f1760r.mo305b(this.f1761s, i, i3);
            C0246q.m1757c(this.f1761s, iMo305b - left);
        } else {
            iMo305b = i;
        }
        if (i4 != 0) {
            iMo300a = this.f1760r.mo300a(this.f1761s, i2, i4);
            C0246q.m1753b(this.f1761s, iMo300a - top);
        } else {
            iMo300a = i2;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f1760r.mo303a(this.f1761s, iMo305b, iMo300a, iMo305b - left, iMo300a - top);
    }

    /* JADX INFO: renamed from: c */
    private void m2485c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2491g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1748f[pointerId] = x;
                this.f1749g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private int m2486e(int i, int i2) {
        int i3 = i < this.f1763u.getLeft() + this.f1757o ? 1 : 0;
        if (i2 < this.f1763u.getTop() + this.f1757o) {
            i3 |= 4;
        }
        if (i > this.f1763u.getRight() - this.f1757o) {
            i3 |= 2;
        }
        return i2 > this.f1763u.getBottom() - this.f1757o ? i3 | 8 : i3;
    }

    /* JADX INFO: renamed from: e */
    private void m2487e(int i) {
        if (this.f1746d == null || !m2502b(i)) {
            return;
        }
        this.f1746d[i] = 0.0f;
        this.f1747e[i] = 0.0f;
        this.f1748f[i] = 0.0f;
        this.f1749g[i] = 0.0f;
        this.f1750h[i] = 0;
        this.f1751i[i] = 0;
        this.f1752j[i] = 0;
        this.f1753k &= (1 << i) ^ (-1);
    }

    /* JADX INFO: renamed from: f */
    private void m2488f() {
        if (this.f1746d == null) {
            return;
        }
        Arrays.fill(this.f1746d, 0.0f);
        Arrays.fill(this.f1747e, 0.0f);
        Arrays.fill(this.f1748f, 0.0f);
        Arrays.fill(this.f1749g, 0.0f);
        Arrays.fill(this.f1750h, 0);
        Arrays.fill(this.f1751i, 0);
        Arrays.fill(this.f1752j, 0);
        this.f1753k = 0;
    }

    /* JADX INFO: renamed from: f */
    private void m2489f(int i) {
        if (this.f1746d == null || this.f1746d.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.f1746d != null) {
                System.arraycopy(this.f1746d, 0, fArr, 0, this.f1746d.length);
                System.arraycopy(this.f1747e, 0, fArr2, 0, this.f1747e.length);
                System.arraycopy(this.f1748f, 0, fArr3, 0, this.f1748f.length);
                System.arraycopy(this.f1749g, 0, fArr4, 0, this.f1749g.length);
                System.arraycopy(this.f1750h, 0, iArr, 0, this.f1750h.length);
                System.arraycopy(this.f1751i, 0, iArr2, 0, this.f1751i.length);
                System.arraycopy(this.f1752j, 0, iArr3, 0, this.f1752j.length);
            }
            this.f1746d = fArr;
            this.f1747e = fArr2;
            this.f1748f = fArr3;
            this.f1749g = fArr4;
            this.f1750h = iArr;
            this.f1751i = iArr2;
            this.f1752j = iArr3;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2490g() {
        this.f1754l.computeCurrentVelocity(1000, this.f1755m);
        m2476a(m2471a(this.f1754l.getXVelocity(this.f1745c), this.f1756n, this.f1755m), m2471a(this.f1754l.getYVelocity(this.f1745c), this.f1756n, this.f1755m));
    }

    /* JADX INFO: renamed from: g */
    private boolean m2491g(int i) {
        if (m2502b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public int m2492a() {
        return this.f1743a;
    }

    /* JADX INFO: renamed from: a */
    public void m2493a(float f) {
        this.f1756n = f;
    }

    /* JADX INFO: renamed from: a */
    public void m2494a(int i) {
        this.f1758p = i;
    }

    /* JADX INFO: renamed from: a */
    public void m2495a(View view, int i) {
        if (view.getParent() != this.f1763u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1763u + ")");
        }
        this.f1761s = view;
        this.f1745c = i;
        this.f1760r.mo441b(view, i);
        m2507c(1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2496a(int i, int i2) {
        if (this.f1762t) {
            return m2479a(i, i2, (int) this.f1754l.getXVelocity(this.f1745c), (int) this.f1754l.getYVelocity(this.f1745c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2497a(MotionEvent motionEvent) {
        View viewM2510d;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2512e();
        }
        if (this.f1754l == null) {
            this.f1754l = VelocityTracker.obtain();
        }
        this.f1754l.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                m2477a(x, y, pointerId);
                View viewM2510d2 = m2510d((int) x, (int) y);
                if (viewM2510d2 == this.f1761s && this.f1743a == 2) {
                    m2504b(viewM2510d2, pointerId);
                }
                int i = this.f1750h[pointerId];
                if ((this.f1758p & i) != 0) {
                    this.f1760r.mo2445a(i & this.f1758p, pointerId);
                }
                break;
            case 1:
            case 3:
                m2512e();
                break;
            case 2:
                if (this.f1746d != null && this.f1747e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2491g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1746d[pointerId2];
                            float f2 = y2 - this.f1747e[pointerId2];
                            View viewM2510d3 = m2510d((int) x2, (int) y2);
                            boolean z = viewM2510d3 != null && m2480a(viewM2510d3, f, f2);
                            if (z) {
                                int left = viewM2510d3.getLeft();
                                int iMo305b = this.f1760r.mo305b(viewM2510d3, ((int) f) + left, (int) f);
                                int top = viewM2510d3.getTop();
                                int iMo300a = this.f1760r.mo300a(viewM2510d3, ((int) f2) + top, (int) f2);
                                int iMo440b = this.f1760r.mo440b(viewM2510d3);
                                int iMo299a = this.f1760r.mo299a(viewM2510d3);
                                if ((iMo440b != 0 && (iMo440b <= 0 || iMo305b != left)) || (iMo299a != 0 && (iMo299a <= 0 || iMo300a != top))) {
                                    m2483b(f, f2, pointerId2);
                                    if (this.f1743a == 1 || (z && m2504b(viewM2510d3, pointerId2))) {
                                    }
                                }
                                m2485c(motionEvent);
                                break;
                            }
                        }
                    }
                    m2485c(motionEvent);
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m2477a(x3, y3, pointerId3);
                if (this.f1743a == 0) {
                    int i3 = this.f1750h[pointerId3];
                    if ((this.f1758p & i3) != 0) {
                        this.f1760r.mo2445a(i3 & this.f1758p, pointerId3);
                    }
                } else if (this.f1743a == 2 && (viewM2510d = m2510d((int) x3, (int) y3)) == this.f1761s) {
                    m2504b(viewM2510d, pointerId3);
                }
                break;
            case 6:
                m2487e(motionEvent.getPointerId(actionIndex));
                break;
        }
        return this.f1743a == 1;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2498a(View view, int i, int i2) {
        this.f1761s = view;
        this.f1745c = -1;
        boolean zM2479a = m2479a(i, i2, 0, 0);
        if (!zM2479a && this.f1743a == 0 && this.f1761s != null) {
            this.f1761s = null;
        }
        return zM2479a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2499a(boolean z) {
        boolean z2;
        if (this.f1743a == 2) {
            boolean zComputeScrollOffset = this.f1759q.computeScrollOffset();
            int currX = this.f1759q.getCurrX();
            int currY = this.f1759q.getCurrY();
            int left = currX - this.f1761s.getLeft();
            int top = currY - this.f1761s.getTop();
            if (left != 0) {
                C0246q.m1757c(this.f1761s, left);
            }
            if (top != 0) {
                C0246q.m1753b(this.f1761s, top);
            }
            if (left != 0 || top != 0) {
                this.f1760r.mo303a(this.f1761s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f1759q.getFinalX() && currY == this.f1759q.getFinalY()) {
                this.f1759q.abortAnimation();
                z2 = false;
            } else {
                z2 = zComputeScrollOffset;
            }
            if (!z2) {
                if (z) {
                    this.f1763u.post(this.f1764w);
                } else {
                    m2507c(0);
                }
            }
        }
        return this.f1743a == 2;
    }

    /* JADX INFO: renamed from: b */
    public int m2500b() {
        return this.f1757o;
    }

    /* JADX INFO: renamed from: b */
    public void m2501b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2512e();
        }
        if (this.f1754l == null) {
            this.f1754l = VelocityTracker.obtain();
        }
        this.f1754l.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View viewM2510d = m2510d((int) x, (int) y);
                m2477a(x, y, pointerId);
                m2504b(viewM2510d, pointerId);
                int i3 = this.f1750h[pointerId];
                if ((this.f1758p & i3) != 0) {
                    this.f1760r.mo2445a(i3 & this.f1758p, pointerId);
                }
                break;
            case 1:
                if (this.f1743a == 1) {
                    m2490g();
                }
                m2512e();
                break;
            case 2:
                if (this.f1743a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2491g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1746d[pointerId2];
                            float f2 = y2 - this.f1747e[pointerId2];
                            m2483b(f, f2, pointerId2);
                            if (this.f1743a != 1) {
                                View viewM2510d2 = m2510d((int) x2, (int) y2);
                                if (!m2480a(viewM2510d2, f, f2) || !m2504b(viewM2510d2, pointerId2)) {
                                }
                            }
                            m2485c(motionEvent);
                            break;
                        }
                        i2++;
                    }
                    m2485c(motionEvent);
                } else if (m2491g(this.f1745c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1745c);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    int i4 = (int) (x3 - this.f1748f[this.f1745c]);
                    int i5 = (int) (y3 - this.f1749g[this.f1745c]);
                    m2484b(this.f1761s.getLeft() + i4, this.f1761s.getTop() + i5, i4, i5);
                    m2485c(motionEvent);
                }
                break;
            case 3:
                if (this.f1743a == 1) {
                    m2476a(0.0f, 0.0f);
                }
                m2512e();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m2477a(x4, y4, pointerId3);
                if (this.f1743a == 0) {
                    m2504b(m2510d((int) x4, (int) y4), pointerId3);
                    int i6 = this.f1750h[pointerId3];
                    if ((this.f1758p & i6) != 0) {
                        this.f1760r.mo2445a(i6 & this.f1758p, pointerId3);
                    }
                } else if (m2508c((int) x4, (int) y4)) {
                    m2504b(this.f1761s, pointerId3);
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1743a == 1 && pointerId4 == this.f1745c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                        } else {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f1745c) {
                                if (m2510d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f1761s && m2504b(this.f1761s, pointerId5)) {
                                    i = this.f1745c;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m2490g();
                    }
                }
                m2487e(pointerId4);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m2502b(int i) {
        return (this.f1753k & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2503b(int i, int i2) {
        if (!m2502b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f1748f[i2] - this.f1746d[i2];
        float f2 = this.f1749g[i2] - this.f1747e[i2];
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f1744b * this.f1744b)) : z ? Math.abs(f) > ((float) this.f1744b) : z2 && Math.abs(f2) > ((float) this.f1744b);
    }

    /* JADX INFO: renamed from: b */
    boolean m2504b(View view, int i) {
        if (view == this.f1761s && this.f1745c == i) {
            return true;
        }
        if (view == null || !this.f1760r.mo304a(view, i)) {
            return false;
        }
        this.f1745c = i;
        m2495a(view, i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2505b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: c */
    public View m2506c() {
        return this.f1761s;
    }

    /* JADX INFO: renamed from: c */
    void m2507c(int i) {
        this.f1763u.removeCallbacks(this.f1764w);
        if (this.f1743a != i) {
            this.f1743a = i;
            this.f1760r.mo301a(i);
            if (this.f1743a == 0) {
                this.f1761s = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m2508c(int i, int i2) {
        return m2505b(this.f1761s, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public int m2509d() {
        return this.f1744b;
    }

    /* JADX INFO: renamed from: d */
    public View m2510d(int i, int i2) {
        for (int childCount = this.f1763u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1763u.getChildAt(this.f1760r.m2513c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2511d(int i) {
        int length = this.f1746d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m2503b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m2512e() {
        this.f1745c = -1;
        m2488f();
        if (this.f1754l != null) {
            this.f1754l.recycle();
            this.f1754l = null;
        }
    }
}
