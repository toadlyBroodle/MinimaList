package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0025a;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.p015f.C0198a;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0246q;
import android.support.v4.widget.C0332p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0045a<V> {

    /* JADX INFO: renamed from: a */
    int f221a;

    /* JADX INFO: renamed from: b */
    int f222b;

    /* JADX INFO: renamed from: c */
    boolean f223c;

    /* JADX INFO: renamed from: d */
    int f224d;

    /* JADX INFO: renamed from: e */
    C0332p f225e;

    /* JADX INFO: renamed from: f */
    int f226f;

    /* JADX INFO: renamed from: g */
    WeakReference<V> f227g;

    /* JADX INFO: renamed from: h */
    WeakReference<View> f228h;

    /* JADX INFO: renamed from: i */
    int f229i;

    /* JADX INFO: renamed from: j */
    boolean f230j;

    /* JADX INFO: renamed from: k */
    private float f231k;

    /* JADX INFO: renamed from: l */
    private int f232l;

    /* JADX INFO: renamed from: m */
    private boolean f233m;

    /* JADX INFO: renamed from: n */
    private int f234n;

    /* JADX INFO: renamed from: o */
    private boolean f235o;

    /* JADX INFO: renamed from: p */
    private boolean f236p;

    /* JADX INFO: renamed from: q */
    private int f237q;

    /* JADX INFO: renamed from: r */
    private boolean f238r;

    /* JADX INFO: renamed from: s */
    private AbstractC0040a f239s;

    /* JADX INFO: renamed from: t */
    private VelocityTracker f240t;

    /* JADX INFO: renamed from: u */
    private int f241u;

    /* JADX INFO: renamed from: v */
    private final C0332p.a f242v;

    /* JADX INFO: renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class AbstractC0040a {
        /* JADX INFO: renamed from: a */
        public abstract void m306a(View view, float f);

        /* JADX INFO: renamed from: a */
        public abstract void m307a(View view, int i);
    }

    /* JADX INFO: renamed from: android.support.design.widget.BottomSheetBehavior$b */
    protected static class C0041b extends AbstractC0222a {
        public static final Parcelable.Creator<C0041b> CREATOR = new Parcelable.ClassLoaderCreator<C0041b>() { // from class: android.support.design.widget.BottomSheetBehavior.b.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0041b createFromParcel(Parcel parcel) {
                return new C0041b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0041b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0041b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0041b[] newArray(int i) {
                return new C0041b[i];
            }
        };

        /* JADX INFO: renamed from: a */
        final int f244a;

        public C0041b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f244a = parcel.readInt();
        }

        public C0041b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f244a = i;
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f244a);
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.BottomSheetBehavior$c */
    private class RunnableC0042c implements Runnable {

        /* JADX INFO: renamed from: b */
        private final View f246b;

        /* JADX INFO: renamed from: c */
        private final int f247c;

        RunnableC0042c(View view, int i) {
            this.f246b = view;
            this.f247c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BottomSheetBehavior.this.f225e == null || !BottomSheetBehavior.this.f225e.m2499a(true)) {
                BottomSheetBehavior.this.m294b(this.f247c);
            } else {
                C0246q.m1747a(this.f246b, this);
            }
        }
    }

    public BottomSheetBehavior() {
        this.f224d = 4;
        this.f242v = new C0332p.a() { // from class: android.support.design.widget.BottomSheetBehavior.1
            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public int mo299a(View view) {
                return BottomSheetBehavior.this.f223c ? BottomSheetBehavior.this.f226f - BottomSheetBehavior.this.f221a : BottomSheetBehavior.this.f222b - BottomSheetBehavior.this.f221a;
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public int mo300a(View view, int i, int i2) {
                return C0198a.m1464a(i, BottomSheetBehavior.this.f221a, BottomSheetBehavior.this.f223c ? BottomSheetBehavior.this.f226f : BottomSheetBehavior.this.f222b);
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo301a(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.m294b(1);
                }
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo302a(View view, float f, float f2) {
                int i;
                int i2 = 3;
                if (f2 < 0.0f) {
                    i = BottomSheetBehavior.this.f221a;
                } else if (BottomSheetBehavior.this.f223c && BottomSheetBehavior.this.m293a(view, f2)) {
                    i = BottomSheetBehavior.this.f226f;
                    i2 = 5;
                } else if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - BottomSheetBehavior.this.f221a) < Math.abs(top - BottomSheetBehavior.this.f222b)) {
                        i = BottomSheetBehavior.this.f221a;
                    } else {
                        i = BottomSheetBehavior.this.f222b;
                        i2 = 4;
                    }
                } else {
                    i = BottomSheetBehavior.this.f222b;
                    i2 = 4;
                }
                if (!BottomSheetBehavior.this.f225e.m2496a(view.getLeft(), i)) {
                    BottomSheetBehavior.this.m294b(i2);
                } else {
                    BottomSheetBehavior.this.m294b(2);
                    C0246q.m1747a(view, new RunnableC0042c(view, i2));
                }
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo303a(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.m297c(i2);
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public boolean mo304a(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.f224d == 1 || BottomSheetBehavior.this.f230j) {
                    return false;
                }
                if (BottomSheetBehavior.this.f224d == 3 && BottomSheetBehavior.this.f229i == i && (view2 = BottomSheetBehavior.this.f228h.get()) != null && view2.canScrollVertically(-1)) {
                    return false;
                }
                return BottomSheetBehavior.this.f227g != null && BottomSheetBehavior.this.f227g.get() == view;
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: b */
            public int mo305b(View view, int i, int i2) {
                return view.getLeft();
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f224d = 4;
        this.f242v = new C0332p.a() { // from class: android.support.design.widget.BottomSheetBehavior.1
            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public int mo299a(View view) {
                return BottomSheetBehavior.this.f223c ? BottomSheetBehavior.this.f226f - BottomSheetBehavior.this.f221a : BottomSheetBehavior.this.f222b - BottomSheetBehavior.this.f221a;
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public int mo300a(View view, int i, int i2) {
                return C0198a.m1464a(i, BottomSheetBehavior.this.f221a, BottomSheetBehavior.this.f223c ? BottomSheetBehavior.this.f226f : BottomSheetBehavior.this.f222b);
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo301a(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.m294b(1);
                }
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo302a(View view, float f, float f2) {
                int i;
                int i2 = 3;
                if (f2 < 0.0f) {
                    i = BottomSheetBehavior.this.f221a;
                } else if (BottomSheetBehavior.this.f223c && BottomSheetBehavior.this.m293a(view, f2)) {
                    i = BottomSheetBehavior.this.f226f;
                    i2 = 5;
                } else if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - BottomSheetBehavior.this.f221a) < Math.abs(top - BottomSheetBehavior.this.f222b)) {
                        i = BottomSheetBehavior.this.f221a;
                    } else {
                        i = BottomSheetBehavior.this.f222b;
                        i2 = 4;
                    }
                } else {
                    i = BottomSheetBehavior.this.f222b;
                    i2 = 4;
                }
                if (!BottomSheetBehavior.this.f225e.m2496a(view.getLeft(), i)) {
                    BottomSheetBehavior.this.m294b(i2);
                } else {
                    BottomSheetBehavior.this.m294b(2);
                    C0246q.m1747a(view, new RunnableC0042c(view, i2));
                }
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public void mo303a(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.m297c(i2);
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: a */
            public boolean mo304a(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.f224d == 1 || BottomSheetBehavior.this.f230j) {
                    return false;
                }
                if (BottomSheetBehavior.this.f224d == 3 && BottomSheetBehavior.this.f229i == i && (view2 = BottomSheetBehavior.this.f228h.get()) != null && view2.canScrollVertically(-1)) {
                    return false;
                }
                return BottomSheetBehavior.this.f227g != null && BottomSheetBehavior.this.f227g.get() == view;
            }

            @Override // android.support.v4.widget.C0332p.a
            /* JADX INFO: renamed from: b */
            public int mo305b(View view, int i, int i2) {
                return view.getLeft();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.BottomSheetBehavior_Layout);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C0025a.j.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            m287a(typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m287a(typedValuePeekValue.data);
        }
        m289a(typedArrayObtainStyledAttributes.getBoolean(C0025a.j.BottomSheetBehavior_Layout_behavior_hideable, false));
        m295b(typedArrayObtainStyledAttributes.getBoolean(C0025a.j.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f231k = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: a */
    private void m284a() {
        this.f229i = -1;
        if (this.f240t != null) {
            this.f240t.recycle();
            this.f240t = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private float m285b() {
        this.f240t.computeCurrentVelocity(1000, this.f231k);
        return this.f240t.getYVelocity(this.f229i);
    }

    /* JADX INFO: renamed from: a */
    View m286a(View view) {
        if (C0246q.m1775u(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM286a = m286a(viewGroup.getChildAt(i));
                if (viewM286a != null) {
                    return viewM286a;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m287a(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (this.f233m) {
                z = false;
            } else {
                this.f233m = true;
            }
        } else if (this.f233m || this.f232l != i) {
            this.f233m = false;
            this.f232l = Math.max(0, i);
            this.f222b = this.f226f - i;
        }
        if (!z || this.f224d != 4 || this.f227g == null || (v = this.f227g.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public void mo248a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0041b c0041b = (C0041b) parcelable;
        super.mo248a(coordinatorLayout, v, c0041b.m1605a());
        if (c0041b.f244a == 1 || c0041b.f244a == 2) {
            this.f224d = 4;
        } else {
            this.f224d = c0041b.f244a;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public void mo288a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.f228h.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            if (i3 < this.f221a) {
                iArr[1] = top - this.f221a;
                C0246q.m1753b(v, -iArr[1]);
                m294b(3);
            } else {
                iArr[1] = i2;
                C0246q.m1753b(v, -i2);
                m294b(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i3 <= this.f222b || this.f223c) {
                iArr[1] = i2;
                C0246q.m1753b(v, -i2);
                m294b(1);
            } else {
                iArr[1] = top - this.f222b;
                C0246q.m1753b(v, -iArr[1]);
                m294b(4);
            }
        }
        m297c(v.getTop());
        this.f237q = i2;
        this.f238r = true;
    }

    /* JADX INFO: renamed from: a */
    public void m289a(boolean z) {
        this.f223c = z;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo257a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int iMax;
        if (C0246q.m1770p(coordinatorLayout) && !C0246q.m1770p(v)) {
            C0246q.m1754b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.m340a(v, i);
        this.f226f = coordinatorLayout.getHeight();
        if (this.f233m) {
            if (this.f234n == 0) {
                this.f234n = coordinatorLayout.getResources().getDimensionPixelSize(C0025a.d.design_bottom_sheet_peek_height_min);
            }
            iMax = Math.max(this.f234n, this.f226f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            iMax = this.f232l;
        }
        this.f221a = Math.max(0, this.f226f - v.getHeight());
        this.f222b = Math.max(this.f226f - iMax, this.f221a);
        if (this.f224d == 3) {
            C0246q.m1753b(v, this.f221a);
        } else if (this.f223c && this.f224d == 5) {
            C0246q.m1753b(v, this.f226f);
        } else if (this.f224d == 4) {
            C0246q.m1753b(v, this.f222b);
        } else if (this.f224d == 1 || this.f224d == 2) {
            C0246q.m1753b(v, top - v.getTop());
        }
        if (this.f225e == null) {
            this.f225e = C0332p.m2475a(coordinatorLayout, this.f242v);
        }
        this.f227g = new WeakReference<>(v);
        this.f228h = new WeakReference<>(m286a(v));
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo290a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.f236p = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m284a();
        }
        if (this.f240t == null) {
            this.f240t = VelocityTracker.obtain();
        }
        this.f240t.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                int x = (int) motionEvent.getX();
                this.f241u = (int) motionEvent.getY();
                View view = this.f228h != null ? this.f228h.get() : null;
                if (view != null && coordinatorLayout.m347a(view, x, this.f241u)) {
                    this.f229i = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f230j = true;
                }
                this.f236p = this.f229i == -1 && !coordinatorLayout.m347a(v, x, this.f241u);
                break;
            case 1:
            case 3:
                this.f230j = false;
                this.f229i = -1;
                if (this.f236p) {
                    this.f236p = false;
                    return false;
                }
                break;
        }
        if (!this.f236p && this.f225e.m2497a(motionEvent)) {
            return true;
        }
        View view2 = this.f228h.get();
        return (actionMasked != 2 || view2 == null || this.f236p || this.f224d == 1 || coordinatorLayout.m347a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f241u) - motionEvent.getY()) <= ((float) this.f225e.m2509d())) ? false : true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo291a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f228h.get() && (this.f224d != 3 || super.mo291a(coordinatorLayout, v, view, f, f2));
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo292a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f237q = 0;
        this.f238r = false;
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: a */
    boolean m293a(View view, float f) {
        if (this.f235o) {
            return true;
        }
        return view.getTop() >= this.f222b && Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f222b)) / ((float) this.f232l) > 0.5f;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: b */
    public Parcelable mo264b(CoordinatorLayout coordinatorLayout, V v) {
        return new C0041b(super.mo264b(coordinatorLayout, v), this.f224d);
    }

    /* JADX INFO: renamed from: b */
    void m294b(int i) {
        if (this.f224d == i) {
            return;
        }
        this.f224d = i;
        V v = this.f227g.get();
        if (v == null || this.f239s == null) {
            return;
        }
        this.f239s.m307a((View) v, i);
    }

    /* JADX INFO: renamed from: b */
    public void m295b(boolean z) {
        this.f235o = z;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: b */
    public boolean mo296b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f224d == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f225e != null) {
            this.f225e.m2501b(motionEvent);
        }
        if (actionMasked == 0) {
            m284a();
        }
        if (this.f240t == null) {
            this.f240t = VelocityTracker.obtain();
        }
        this.f240t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f236p && Math.abs(this.f241u - motionEvent.getY()) > this.f225e.m2509d()) {
            this.f225e.m2495a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f236p;
    }

    /* JADX INFO: renamed from: c */
    void m297c(int i) {
        V v = this.f227g.get();
        if (v == null || this.f239s == null) {
            return;
        }
        if (i > this.f222b) {
            this.f239s.m306a(v, (this.f222b - i) / (this.f226f - this.f222b));
        } else {
            this.f239s.m306a(v, (this.f222b - i) / (this.f222b - this.f221a));
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: c */
    public void mo298c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f221a) {
            m294b(3);
            return;
        }
        if (this.f228h != null && view == this.f228h.get() && this.f238r) {
            if (this.f237q > 0) {
                i = this.f221a;
            } else if (this.f223c && m293a(v, m285b())) {
                i = this.f226f;
                i2 = 5;
            } else if (this.f237q == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.f221a) < Math.abs(top - this.f222b)) {
                    i = this.f221a;
                } else {
                    i = this.f222b;
                    i2 = 4;
                }
            } else {
                i = this.f222b;
                i2 = 4;
            }
            if (this.f225e.m2498a((View) v, v.getLeft(), i)) {
                m294b(2);
                C0246q.m1747a(v, new RunnableC0042c(v, i2));
            } else {
                m294b(i2);
            }
            this.f238r = false;
        }
    }
}
