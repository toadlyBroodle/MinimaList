package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.p019j.C0246q;
import android.support.v4.widget.C0332p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0045a<V> {

    /* JADX INFO: renamed from: a */
    private boolean f324a;

    /* JADX INFO: renamed from: b */
    C0332p f325b;

    /* JADX INFO: renamed from: c */
    InterfaceC0059a f326c;

    /* JADX INFO: renamed from: i */
    private boolean f332i;

    /* JADX INFO: renamed from: h */
    private float f331h = 0.0f;

    /* JADX INFO: renamed from: d */
    int f327d = 2;

    /* JADX INFO: renamed from: e */
    float f328e = 0.5f;

    /* JADX INFO: renamed from: f */
    float f329f = 0.0f;

    /* JADX INFO: renamed from: g */
    float f330g = 0.5f;

    /* JADX INFO: renamed from: j */
    private final C0332p.a f333j = new C0332p.a() { // from class: android.support.design.widget.SwipeDismissBehavior.1

        /* JADX INFO: renamed from: b */
        private int f335b;

        /* JADX INFO: renamed from: c */
        private int f336c = -1;

        /* JADX INFO: renamed from: a */
        private boolean m439a(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f335b) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f328e);
            }
            boolean z = C0246q.m1759e(view) == 1;
            if (SwipeDismissBehavior.this.f327d == 2) {
                return true;
            }
            if (SwipeDismissBehavior.this.f327d == 0) {
                return z ? f < 0.0f : f > 0.0f;
            }
            if (SwipeDismissBehavior.this.f327d == 1) {
                return z ? f > 0.0f : f < 0.0f;
            }
            return false;
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public int mo300a(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo301a(int i) {
            if (SwipeDismissBehavior.this.f326c != null) {
                SwipeDismissBehavior.this.f326c.mo442a(i);
            }
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo302a(View view, float f, float f2) {
            int i;
            this.f336c = -1;
            int width = view.getWidth();
            boolean z = false;
            if (m439a(view, f)) {
                i = view.getLeft() < this.f335b ? this.f335b - width : this.f335b + width;
                z = true;
            } else {
                i = this.f335b;
            }
            if (SwipeDismissBehavior.this.f325b.m2496a(i, view.getTop())) {
                C0246q.m1747a(view, new RunnableC0060b(view, z));
            } else {
                if (!z || SwipeDismissBehavior.this.f326c == null) {
                    return;
                }
                SwipeDismissBehavior.this.f326c.mo443a(view);
            }
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo303a(View view, int i, int i2, int i3, int i4) {
            float width = this.f335b + (view.getWidth() * SwipeDismissBehavior.this.f329f);
            float width2 = this.f335b + (view.getWidth() * SwipeDismissBehavior.this.f330g);
            if (i <= width) {
                view.setAlpha(1.0f);
            } else if (i >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m430a(0.0f, 1.0f - SwipeDismissBehavior.m433b(width, width2, i), 1.0f));
            }
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public boolean mo304a(View view, int i) {
            return this.f336c == -1 && SwipeDismissBehavior.this.mo437a(view);
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public int mo440b(View view) {
            return view.getWidth();
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public int mo305b(View view, int i, int i2) {
            int width;
            int width2;
            boolean z = C0246q.m1759e(view) == 1;
            if (SwipeDismissBehavior.this.f327d == 0) {
                if (z) {
                    width = this.f335b - view.getWidth();
                    width2 = this.f335b;
                } else {
                    width = this.f335b;
                    width2 = this.f335b + view.getWidth();
                }
            } else if (SwipeDismissBehavior.this.f327d != 1) {
                width = this.f335b - view.getWidth();
                width2 = this.f335b + view.getWidth();
            } else if (z) {
                width = this.f335b;
                width2 = this.f335b + view.getWidth();
            } else {
                width = this.f335b - view.getWidth();
                width2 = this.f335b;
            }
            return SwipeDismissBehavior.m431a(width, i, width2);
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public void mo441b(View view, int i) {
            this.f336c = i;
            this.f335b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    };

    /* JADX INFO: renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface InterfaceC0059a {
        /* JADX INFO: renamed from: a */
        void mo442a(int i);

        /* JADX INFO: renamed from: a */
        void mo443a(View view);
    }

    /* JADX INFO: renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class RunnableC0060b implements Runnable {

        /* JADX INFO: renamed from: b */
        private final View f338b;

        /* JADX INFO: renamed from: c */
        private final boolean f339c;

        RunnableC0060b(View view, boolean z) {
            this.f338b = view;
            this.f339c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwipeDismissBehavior.this.f325b != null && SwipeDismissBehavior.this.f325b.m2499a(true)) {
                C0246q.m1747a(this.f338b, this);
            } else {
                if (!this.f339c || SwipeDismissBehavior.this.f326c == null) {
                    return;
                }
                SwipeDismissBehavior.this.f326c.mo443a(this.f338b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static float m430a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* JADX INFO: renamed from: a */
    static int m431a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: renamed from: a */
    private void m432a(ViewGroup viewGroup) {
        if (this.f325b == null) {
            this.f325b = this.f332i ? C0332p.m2474a(viewGroup, this.f331h, this.f333j) : C0332p.m2475a(viewGroup, this.f333j);
        }
    }

    /* JADX INFO: renamed from: b */
    static float m433b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* JADX INFO: renamed from: a */
    public void m434a(float f) {
        this.f329f = m430a(0.0f, f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m435a(int i) {
        this.f327d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m436a(InterfaceC0059a interfaceC0059a) {
        this.f326c = interfaceC0059a;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo290a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f324a;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f324a = coordinatorLayout.m347a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f324a;
                break;
            case 1:
            case 3:
                this.f324a = false;
                break;
        }
        if (!z) {
            return false;
        }
        m432a((ViewGroup) coordinatorLayout);
        return this.f325b.m2497a(motionEvent);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo437a(View view) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m438b(float f) {
        this.f330g = m430a(0.0f, f, 1.0f);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: b */
    public boolean mo296b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f325b == null) {
            return false;
        }
        this.f325b.m2501b(motionEvent);
        return true;
    }
}
