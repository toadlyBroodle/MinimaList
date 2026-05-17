package android.support.design.widget;

import android.content.Context;
import android.support.v4.p015f.C0198a;
import android.support.v4.p019j.C0246q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* JADX INFO: renamed from: android.support.design.widget.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0068h<V extends View> extends C0076p<V> {

    /* JADX INFO: renamed from: a */
    OverScroller f422a;

    /* JADX INFO: renamed from: b */
    private Runnable f423b;

    /* JADX INFO: renamed from: c */
    private boolean f424c;

    /* JADX INFO: renamed from: d */
    private int f425d;

    /* JADX INFO: renamed from: e */
    private int f426e;

    /* JADX INFO: renamed from: f */
    private int f427f;

    /* JADX INFO: renamed from: g */
    private VelocityTracker f428g;

    /* JADX INFO: renamed from: android.support.design.widget.h$a */
    private class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private final CoordinatorLayout f430b;

        /* JADX INFO: renamed from: c */
        private final V f431c;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.f430b = coordinatorLayout;
            this.f431c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f431c == null || AbstractC0068h.this.f422a == null) {
                return;
            }
            if (!AbstractC0068h.this.f422a.computeScrollOffset()) {
                AbstractC0068h.this.mo247a(this.f430b, this.f431c);
            } else {
                AbstractC0068h.this.m512a_(this.f430b, this.f431c, AbstractC0068h.this.f422a.getCurrY());
                C0246q.m1747a(this.f431c, this);
            }
        }
    }

    public AbstractC0068h() {
        this.f425d = -1;
        this.f427f = -1;
    }

    public AbstractC0068h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f425d = -1;
        this.f427f = -1;
    }

    /* JADX INFO: renamed from: d */
    private void m510d() {
        if (this.f428g == null) {
            this.f428g = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: a */
    int mo238a() {
        return mo260b();
    }

    /* JADX INFO: renamed from: a */
    int mo240a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iM1464a;
        int iB = mo260b();
        if (i2 == 0 || iB < i2 || iB > i3 || iB == (iM1464a = C0198a.m1464a(i, i2, i3))) {
            return 0;
        }
        mo252a(iM1464a);
        return iB - iM1464a;
    }

    /* JADX INFO: renamed from: a */
    int mo241a(V v) {
        return v.getHeight();
    }

    /* JADX INFO: renamed from: a */
    void mo247a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: renamed from: a */
    final boolean m511a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        if (this.f423b != null) {
            v.removeCallbacks(this.f423b);
            this.f423b = null;
        }
        if (this.f422a == null) {
            this.f422a = new OverScroller(v.getContext());
        }
        this.f422a.fling(0, mo260b(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f422a.computeScrollOffset()) {
            mo247a(coordinatorLayout, v);
            return false;
        }
        this.f423b = new a(coordinatorLayout, v);
        C0246q.m1747a(v, this.f423b);
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo290a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f427f < 0) {
            this.f427f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f424c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f424c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo266c(v) && coordinatorLayout.m347a(v, x, y)) {
                    this.f426e = y;
                    this.f425d = motionEvent.getPointerId(0);
                    m510d();
                }
                break;
            case 1:
            case 3:
                this.f424c = false;
                this.f425d = -1;
                if (this.f428g != null) {
                    this.f428g.recycle();
                    this.f428g = null;
                }
                break;
            case 2:
                int i = this.f425d;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f426e) > this.f427f) {
                        this.f424c = true;
                        this.f426e = y2;
                    }
                }
                break;
        }
        if (this.f428g != null) {
            this.f428g.addMovement(motionEvent);
        }
        return this.f424c;
    }

    /* JADX INFO: renamed from: a_ */
    int m512a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo240a(coordinatorLayout, (View) v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    final int m513b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo240a(coordinatorLayout, (View) v, mo238a() - i, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    int mo262b(V v) {
        return -v.getHeight();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo296b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f427f < 0) {
            this.f427f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (!coordinatorLayout.m347a(v, x, y) || !mo266c(v)) {
                    return false;
                }
                this.f426e = y;
                this.f425d = motionEvent.getPointerId(0);
                m510d();
                if (this.f428g != null) {
                    this.f428g.addMovement(motionEvent);
                }
                return true;
            case 1:
                if (this.f428g != null) {
                    this.f428g.addMovement(motionEvent);
                    this.f428g.computeCurrentVelocity(1000);
                    m511a(coordinatorLayout, v, -mo241a(v), 0, this.f428g.getYVelocity(this.f425d));
                }
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f425d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.f426e - y2;
                if (!this.f424c && Math.abs(i) > this.f427f) {
                    this.f424c = true;
                    i = i > 0 ? i - this.f427f : i + this.f427f;
                }
                if (this.f424c) {
                    this.f426e = y2;
                    m513b(coordinatorLayout, v, i, mo262b(v), 0);
                }
                if (this.f428g != null) {
                }
                return true;
            case 3:
                break;
            default:
                if (this.f428g != null) {
                }
                return true;
        }
        this.f424c = false;
        this.f425d = -1;
        if (this.f428g != null) {
            this.f428g.recycle();
            this.f428g = null;
        }
        if (this.f428g != null) {
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    boolean mo266c(V v) {
        return false;
    }
}
