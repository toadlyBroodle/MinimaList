package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.design.C0025a;
import android.support.v4.p007b.C0175b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p015f.C0198a;
import android.support.v4.p018i.C0215i;
import android.support.v4.p018i.C0217k;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0243n;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.support.v4.p019j.InterfaceC0242m;
import android.support.v4.p019j.InterfaceC0244o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0242m {

    /* JADX INFO: renamed from: a */
    static final String f251a;

    /* JADX INFO: renamed from: b */
    static final Class<?>[] f252b;

    /* JADX INFO: renamed from: c */
    static final ThreadLocal<Map<String, Constructor<AbstractC0045a>>> f253c;

    /* JADX INFO: renamed from: d */
    static final Comparator<View> f254d;

    /* JADX INFO: renamed from: f */
    private static final C0217k.a<Rect> f255f;

    /* JADX INFO: renamed from: e */
    ViewGroup.OnHierarchyChangeListener f256e;

    /* JADX INFO: renamed from: g */
    private final List<View> f257g;

    /* JADX INFO: renamed from: h */
    private final C0065e<View> f258h;

    /* JADX INFO: renamed from: i */
    private final List<View> f259i;

    /* JADX INFO: renamed from: j */
    private final List<View> f260j;

    /* JADX INFO: renamed from: k */
    private final int[] f261k;

    /* JADX INFO: renamed from: l */
    private Paint f262l;

    /* JADX INFO: renamed from: m */
    private boolean f263m;

    /* JADX INFO: renamed from: n */
    private boolean f264n;

    /* JADX INFO: renamed from: o */
    private int[] f265o;

    /* JADX INFO: renamed from: p */
    private View f266p;

    /* JADX INFO: renamed from: q */
    private View f267q;

    /* JADX INFO: renamed from: r */
    private ViewTreeObserverOnPreDrawListenerC0049e f268r;

    /* JADX INFO: renamed from: s */
    private boolean f269s;

    /* JADX INFO: renamed from: t */
    private C0254y f270t;

    /* JADX INFO: renamed from: u */
    private boolean f271u;

    /* JADX INFO: renamed from: v */
    private Drawable f272v;

    /* JADX INFO: renamed from: w */
    private InterfaceC0244o f273w;

    /* JADX INFO: renamed from: x */
    private final C0243n f274x;

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$a */
    public static abstract class AbstractC0045a<V extends View> {
        public AbstractC0045a() {
        }

        public AbstractC0045a(Context context, AttributeSet attributeSet) {
        }

        /* JADX INFO: renamed from: a */
        public C0254y m360a(CoordinatorLayout coordinatorLayout, V v, C0254y c0254y) {
            return c0254y;
        }

        /* JADX INFO: renamed from: a */
        public void mo361a(C0048d c0048d) {
        }

        /* JADX INFO: renamed from: a */
        public void mo248a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: a */
        public void mo249a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo298c(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m362a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* JADX INFO: renamed from: a */
        public void mo250a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m362a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public void mo288a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* JADX INFO: renamed from: a */
        public void mo251a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo288a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean mo257a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo258a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo363a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo275a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo290a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo276a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo291a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m364a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public boolean mo292a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo259a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo292a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public Parcelable mo264b(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public void m365b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* JADX INFO: renamed from: b */
        public void m366b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m365b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean mo296b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo279b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public int m367c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* JADX INFO: renamed from: c */
        public void m368c() {
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        public void mo298c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* JADX INFO: renamed from: d */
        public float m369d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* JADX INFO: renamed from: d */
        public void m370d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* JADX INFO: renamed from: e */
        public boolean m371e(CoordinatorLayout coordinatorLayout, V v) {
            return m369d(coordinatorLayout, v) > 0.0f;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$b */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0046b {
        /* JADX INFO: renamed from: a */
        Class<? extends AbstractC0045a> m372a();
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$c */
    private class ViewGroupOnHierarchyChangeListenerC0047c implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0047c() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f256e != null) {
                CoordinatorLayout.this.f256e.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m339a(2);
            if (CoordinatorLayout.this.f256e != null) {
                CoordinatorLayout.this.f256e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0048d extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        AbstractC0045a f277a;

        /* JADX INFO: renamed from: b */
        boolean f278b;

        /* JADX INFO: renamed from: c */
        public int f279c;

        /* JADX INFO: renamed from: d */
        public int f280d;

        /* JADX INFO: renamed from: e */
        public int f281e;

        /* JADX INFO: renamed from: f */
        int f282f;

        /* JADX INFO: renamed from: g */
        public int f283g;

        /* JADX INFO: renamed from: h */
        public int f284h;

        /* JADX INFO: renamed from: i */
        int f285i;

        /* JADX INFO: renamed from: j */
        int f286j;

        /* JADX INFO: renamed from: k */
        View f287k;

        /* JADX INFO: renamed from: l */
        View f288l;

        /* JADX INFO: renamed from: m */
        final Rect f289m;

        /* JADX INFO: renamed from: n */
        Object f290n;

        /* JADX INFO: renamed from: o */
        private boolean f291o;

        /* JADX INFO: renamed from: p */
        private boolean f292p;

        /* JADX INFO: renamed from: q */
        private boolean f293q;

        /* JADX INFO: renamed from: r */
        private boolean f294r;

        public C0048d(int i, int i2) {
            super(i, i2);
            this.f278b = false;
            this.f279c = 0;
            this.f280d = 0;
            this.f281e = -1;
            this.f282f = -1;
            this.f283g = 0;
            this.f284h = 0;
            this.f289m = new Rect();
        }

        C0048d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f278b = false;
            this.f279c = 0;
            this.f280d = 0;
            this.f281e = -1;
            this.f282f = -1;
            this.f283g = 0;
            this.f284h = 0;
            this.f289m = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.CoordinatorLayout_Layout);
            this.f279c = typedArrayObtainStyledAttributes.getInteger(C0025a.j.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f282f = typedArrayObtainStyledAttributes.getResourceId(C0025a.j.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f280d = typedArrayObtainStyledAttributes.getInteger(C0025a.j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f281e = typedArrayObtainStyledAttributes.getInteger(C0025a.j.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f283g = typedArrayObtainStyledAttributes.getInt(C0025a.j.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f284h = typedArrayObtainStyledAttributes.getInt(C0025a.j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f278b = typedArrayObtainStyledAttributes.hasValue(C0025a.j.CoordinatorLayout_Layout_layout_behavior);
            if (this.f278b) {
                this.f277a = CoordinatorLayout.m312a(context, attributeSet, typedArrayObtainStyledAttributes.getString(C0025a.j.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f277a != null) {
                this.f277a.mo361a(this);
            }
        }

        public C0048d(C0048d c0048d) {
            super((ViewGroup.MarginLayoutParams) c0048d);
            this.f278b = false;
            this.f279c = 0;
            this.f280d = 0;
            this.f281e = -1;
            this.f282f = -1;
            this.f283g = 0;
            this.f284h = 0;
            this.f289m = new Rect();
        }

        public C0048d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f278b = false;
            this.f279c = 0;
            this.f280d = 0;
            this.f281e = -1;
            this.f282f = -1;
            this.f283g = 0;
            this.f284h = 0;
            this.f289m = new Rect();
        }

        public C0048d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f278b = false;
            this.f279c = 0;
            this.f280d = 0;
            this.f281e = -1;
            this.f282f = -1;
            this.f283g = 0;
            this.f284h = 0;
            this.f289m = new Rect();
        }

        /* JADX INFO: renamed from: a */
        private void m373a(View view, CoordinatorLayout coordinatorLayout) {
            this.f287k = coordinatorLayout.findViewById(this.f282f);
            if (this.f287k == null) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f282f) + " to anchor view " + view);
                }
                this.f288l = null;
                this.f287k = null;
                return;
            }
            if (this.f287k == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f288l = null;
                this.f287k = null;
                return;
            }
            View view2 = this.f287k;
            for (ViewParent parent = this.f287k.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f288l = null;
                    this.f287k = null;
                    return;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f288l = view2;
        }

        /* JADX INFO: renamed from: a */
        private boolean m374a(View view, int i) {
            int iM1692a = C0233d.m1692a(((C0048d) view.getLayoutParams()).f283g, i);
            return iM1692a != 0 && (C0233d.m1692a(this.f284h, i) & iM1692a) == iM1692a;
        }

        /* JADX INFO: renamed from: b */
        private boolean m375b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f287k.getId() != this.f282f) {
                return false;
            }
            View view2 = this.f287k;
            for (ViewParent parent = this.f287k.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f288l = null;
                    this.f287k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f288l = view2;
            return true;
        }

        /* JADX INFO: renamed from: a */
        public int m376a() {
            return this.f282f;
        }

        /* JADX INFO: renamed from: a */
        void m377a(int i) {
            m378a(i, false);
        }

        /* JADX INFO: renamed from: a */
        void m378a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f292p = z;
                    break;
                case 1:
                    this.f293q = z;
                    break;
            }
        }

        /* JADX INFO: renamed from: a */
        void m379a(Rect rect) {
            this.f289m.set(rect);
        }

        /* JADX INFO: renamed from: a */
        public void m380a(AbstractC0045a abstractC0045a) {
            if (this.f277a != abstractC0045a) {
                if (this.f277a != null) {
                    this.f277a.m368c();
                }
                this.f277a = abstractC0045a;
                this.f290n = null;
                this.f278b = true;
                if (abstractC0045a != null) {
                    abstractC0045a.mo361a(this);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m381a(boolean z) {
            this.f294r = z;
        }

        /* JADX INFO: renamed from: a */
        boolean m382a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f291o) {
                return true;
            }
            boolean zM371e = (this.f277a != null ? this.f277a.m371e(coordinatorLayout, view) : false) | this.f291o;
            this.f291o = zM371e;
            return zM371e;
        }

        /* JADX INFO: renamed from: a */
        boolean m383a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 == this.f288l || m374a(view2, C0246q.m1759e(coordinatorLayout)) || (this.f277a != null && this.f277a.mo276a(coordinatorLayout, view, view2));
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0045a m384b() {
            return this.f277a;
        }

        /* JADX INFO: renamed from: b */
        View m385b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f282f == -1) {
                this.f288l = null;
                this.f287k = null;
                return null;
            }
            if (this.f287k == null || !m375b(view, coordinatorLayout)) {
                m373a(view, coordinatorLayout);
            }
            return this.f287k;
        }

        /* JADX INFO: renamed from: b */
        boolean m386b(int i) {
            switch (i) {
                case 0:
                    return this.f292p;
                case 1:
                    return this.f293q;
                default:
                    return false;
            }
        }

        /* JADX INFO: renamed from: c */
        Rect m387c() {
            return this.f289m;
        }

        /* JADX INFO: renamed from: d */
        boolean m388d() {
            return this.f287k == null && this.f282f != -1;
        }

        /* JADX INFO: renamed from: e */
        boolean m389e() {
            if (this.f277a == null) {
                this.f291o = false;
            }
            return this.f291o;
        }

        /* JADX INFO: renamed from: f */
        void m390f() {
            this.f291o = false;
        }

        /* JADX INFO: renamed from: g */
        boolean m391g() {
            return this.f294r;
        }

        /* JADX INFO: renamed from: h */
        void m392h() {
            this.f294r = false;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$e */
    class ViewTreeObserverOnPreDrawListenerC0049e implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0049e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m339a(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$f */
    protected static class C0050f extends AbstractC0222a {
        public static final Parcelable.Creator<C0050f> CREATOR = new Parcelable.ClassLoaderCreator<C0050f>() { // from class: android.support.design.widget.CoordinatorLayout.f.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0050f createFromParcel(Parcel parcel) {
                return new C0050f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0050f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0050f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0050f[] newArray(int i) {
                return new C0050f[i];
            }
        };

        /* JADX INFO: renamed from: a */
        SparseArray<Parcelable> f296a;

        public C0050f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f296a = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f296a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        public C0050f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f296a != null ? this.f296a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f296a.keyAt(i2);
                parcelableArr[i2] = this.f296a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX INFO: renamed from: android.support.design.widget.CoordinatorLayout$g */
    static class C0051g implements Comparator<View> {
        C0051g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM1778x = C0246q.m1778x(view);
            float fM1778x2 = C0246q.m1778x(view2);
            if (fM1778x > fM1778x2) {
                return -1;
            }
            return fM1778x < fM1778x2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f251a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f254d = new C0051g();
        } else {
            f254d = null;
        }
        f252b = new Class[]{Context.class, AttributeSet.class};
        f253c = new ThreadLocal<>();
        f255f = new C0217k.c(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f257g = new ArrayList();
        this.f258h = new C0065e<>();
        this.f259i = new ArrayList();
        this.f260j = new ArrayList();
        this.f261k = new int[2];
        this.f274x = new C0243n(this);
        C0074n.m552a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.CoordinatorLayout, i, C0025a.i.Widget_Design_CoordinatorLayout);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C0025a.j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f265o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f265o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f265o[i2] = (int) (this.f265o[i2] * f);
            }
        }
        this.f272v = typedArrayObtainStyledAttributes.getDrawable(C0025a.j.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        m333g();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0047c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static AbstractC0045a m312a(Context context, AttributeSet attributeSet, String str) {
        Map<String, Constructor<AbstractC0045a>> map;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f251a)) {
            str = f251a + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC0045a>> map2 = f253c.get();
            if (map2 == null) {
                HashMap map3 = new HashMap();
                f253c.set(map3);
                map = map3;
            } else {
                map = map2;
            }
            Constructor<AbstractC0045a> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(f252b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m313a(Rect rect) {
        rect.setEmpty();
        f255f.mo1570a(rect);
    }

    /* JADX INFO: renamed from: a */
    private void m314a(C0048d c0048d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + c0048d.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0048d.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + c0048d.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0048d.bottomMargin));
        rect.set(iMax, iMax2, iMax + i, iMax2 + i2);
    }

    /* JADX INFO: renamed from: a */
    private void m315a(View view, int i, Rect rect, Rect rect2, C0048d c0048d, int i2, int i3) {
        int iWidth;
        int iHeight;
        int iM1692a = C0233d.m1692a(m327e(c0048d.f279c), i);
        int iM1692a2 = C0233d.m1692a(m324c(c0048d.f280d), i);
        int i4 = iM1692a & 7;
        int i5 = iM1692a & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        int i6 = iM1692a2 & 7;
        int i7 = iM1692a2 & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        switch (i6) {
            case 1:
                iWidth = (rect.width() / 2) + rect.left;
                break;
            case 5:
                iWidth = rect.right;
                break;
            default:
                iWidth = rect.left;
                break;
        }
        switch (i7) {
            case 16:
                iHeight = rect.top + (rect.height() / 2);
                break;
            case 80:
                iHeight = rect.bottom;
                break;
            default:
                iHeight = rect.top;
                break;
        }
        switch (i4) {
            case 1:
                iWidth -= i2 / 2;
                break;
            case 5:
                break;
            default:
                iWidth -= i2;
                break;
        }
        switch (i5) {
            case 16:
                iHeight -= i3 / 2;
                break;
            case 80:
                break;
            default:
                iHeight -= i3;
                break;
        }
        rect2.set(iWidth, iHeight, iWidth + i2, iHeight + i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m316a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int height;
        int i3;
        if (C0246q.m1777w(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0048d c0048d = (C0048d) view.getLayoutParams();
            AbstractC0045a abstractC0045aM384b = c0048d.m384b();
            Rect rectM328e = m328e();
            Rect rectM328e2 = m328e();
            rectM328e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC0045aM384b == null || !abstractC0045aM384b.mo363a(this, view, rectM328e)) {
                rectM328e.set(rectM328e2);
            } else if (!rectM328e2.contains(rectM328e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM328e.toShortString() + " | Bounds:" + rectM328e2.toShortString());
            }
            m313a(rectM328e2);
            if (rectM328e.isEmpty()) {
                m313a(rectM328e);
                return;
            }
            int iM1692a = C0233d.m1692a(c0048d.f284h, i);
            if ((iM1692a & 48) != 48 || (i3 = (rectM328e.top - c0048d.topMargin) - c0048d.f286j) >= rect.top) {
                z = false;
            } else {
                m332f(view, rect.top - i3);
                z = true;
            }
            if ((iM1692a & 80) == 80 && (height = ((getHeight() - rectM328e.bottom) - c0048d.bottomMargin) + c0048d.f286j) < rect.bottom) {
                m332f(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                m332f(view, 0);
            }
            if ((iM1692a & 3) != 3 || (i2 = (rectM328e.left - c0048d.leftMargin) - c0048d.f285i) >= rect.left) {
                z2 = false;
            } else {
                m329e(view, rect.left - i2);
                z2 = true;
            }
            if ((iM1692a & 5) == 5) {
                int width = c0048d.f285i + ((getWidth() - rectM328e.right) - c0048d.rightMargin);
                if (width < rect.right) {
                    m329e(view, width - rect.right);
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            if (!z3) {
                m329e(view, 0);
            }
            m313a(rectM328e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m317a(View view, View view2, int i) {
        Rect rectM328e = m328e();
        Rect rectM328e2 = m328e();
        try {
            m345a(view2, rectM328e);
            m344a(view, i, rectM328e, rectM328e2);
            view.layout(rectM328e2.left, rectM328e2.top, rectM328e2.right, rectM328e2.bottom);
        } finally {
            m313a(rectM328e);
            m313a(rectM328e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m318a(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        if (f254d != null) {
            Collections.sort(list, f254d);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m319a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0045a abstractC0045aM384b = ((C0048d) childAt.getLayoutParams()).m384b();
            if (abstractC0045aM384b != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0045aM384b.mo290a(this, childAt, motionEventObtain);
                } else {
                    abstractC0045aM384b.mo296b(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0048d) getChildAt(i2).getLayoutParams()).m390f();
        }
        this.f263m = false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m320a(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEventObtain;
        boolean z2;
        boolean zMo296b = false;
        boolean z3 = false;
        MotionEvent motionEvent2 = null;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f259i;
        m318a(list);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View view = list.get(i2);
                C0048d c0048d = (C0048d) view.getLayoutParams();
                AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                if ((!zMo296b && !z3) || actionMasked == 0) {
                    if (!zMo296b && abstractC0045aM384b != null) {
                        switch (i) {
                            case 0:
                                zMo296b = abstractC0045aM384b.mo290a(this, view, motionEvent);
                                break;
                            case 1:
                                zMo296b = abstractC0045aM384b.mo296b(this, view, motionEvent);
                                break;
                        }
                        if (zMo296b) {
                            this.f266p = view;
                        }
                    }
                    z = zMo296b;
                    boolean zM389e = c0048d.m389e();
                    boolean zM382a = c0048d.m382a(this, view);
                    boolean z4 = zM382a && !zM389e;
                    if (!zM382a || z4) {
                        MotionEvent motionEvent3 = motionEvent2;
                        z2 = z4;
                        motionEventObtain = motionEvent3;
                    }
                } else if (abstractC0045aM384b != null) {
                    if (motionEvent2 == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        motionEventObtain = motionEvent2;
                    }
                    switch (i) {
                        case 0:
                            abstractC0045aM384b.mo290a(this, view, motionEventObtain);
                            break;
                        case 1:
                            abstractC0045aM384b.mo296b(this, view, motionEventObtain);
                            break;
                    }
                    z2 = z3;
                    z = zMo296b;
                } else {
                    motionEventObtain = motionEvent2;
                    z = zMo296b;
                    z2 = z3;
                }
                i2++;
                z3 = z2;
                zMo296b = z;
                motionEvent2 = motionEventObtain;
            } else {
                z = zMo296b;
            }
        }
        list.clear();
        return z;
    }

    /* JADX INFO: renamed from: b */
    private int m321b(int i) {
        if (this.f265o == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < this.f265o.length) {
            return this.f265o[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private C0254y m322b(C0254y c0254y) {
        C0254y c0254yM360a;
        AbstractC0045a abstractC0045aM384b;
        if (c0254y.m1874f()) {
            return c0254y;
        }
        int childCount = getChildCount();
        int i = 0;
        C0254y c0254y2 = c0254y;
        while (true) {
            if (i >= childCount) {
                c0254yM360a = c0254y2;
                break;
            }
            View childAt = getChildAt(i);
            if (!C0246q.m1770p(childAt) || (abstractC0045aM384b = ((C0048d) childAt.getLayoutParams()).m384b()) == null) {
                c0254yM360a = c0254y2;
            } else {
                c0254yM360a = abstractC0045aM384b.m360a(this, childAt, c0254y2);
                if (c0254yM360a.m1874f()) {
                    break;
                }
            }
            i++;
            c0254y2 = c0254yM360a;
        }
        return c0254yM360a;
    }

    /* JADX INFO: renamed from: b */
    private void m323b(View view, int i, int i2) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        int iM1692a = C0233d.m1692a(m325d(c0048d.f279c), i2);
        int i3 = iM1692a & 7;
        int i4 = iM1692a & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM321b = m321b(i) - measuredWidth;
        int i5 = 0;
        switch (i3) {
            case 1:
                iM321b += measuredWidth / 2;
                break;
            case 5:
                iM321b += measuredWidth;
                break;
        }
        switch (i4) {
            case 16:
                i5 = 0 + (measuredHeight / 2);
                break;
            case 80:
                i5 = 0 + measuredHeight;
                break;
        }
        int iMax = Math.max(getPaddingLeft() + c0048d.leftMargin, Math.min(iM321b, ((width - getPaddingRight()) - measuredWidth) - c0048d.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + c0048d.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - c0048d.bottomMargin));
        view.layout(iMax, iMax2, iMax + measuredWidth, iMax2 + measuredHeight);
    }

    /* JADX INFO: renamed from: c */
    private static int m324c(int i) {
        int i2 = (i & 7) == 0 ? 8388611 | i : i;
        return (i2 & C0025a.j.AppCompatTheme_windowFixedHeightMajor) == 0 ? i2 | 48 : i2;
    }

    /* JADX INFO: renamed from: d */
    private static int m325d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    private void m326d(View view, int i) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        Rect rectM328e = m328e();
        rectM328e.set(getPaddingLeft() + c0048d.leftMargin, getPaddingTop() + c0048d.topMargin, (getWidth() - getPaddingRight()) - c0048d.rightMargin, (getHeight() - getPaddingBottom()) - c0048d.bottomMargin);
        if (this.f270t != null && C0246q.m1770p(this) && !C0246q.m1770p(view)) {
            rectM328e.left += this.f270t.m1868a();
            rectM328e.top += this.f270t.m1870b();
            rectM328e.right -= this.f270t.m1871c();
            rectM328e.bottom -= this.f270t.m1872d();
        }
        Rect rectM328e2 = m328e();
        C0233d.m1693a(m324c(c0048d.f279c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM328e, rectM328e2, i);
        view.layout(rectM328e2.left, rectM328e2.top, rectM328e2.right, rectM328e2.bottom);
        m313a(rectM328e);
        m313a(rectM328e2);
    }

    /* JADX INFO: renamed from: e */
    private static int m327e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    private static Rect m328e() {
        Rect rectMo1569a = f255f.mo1569a();
        return rectMo1569a == null ? new Rect() : rectMo1569a;
    }

    /* JADX INFO: renamed from: e */
    private void m329e(View view, int i) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (c0048d.f285i != i) {
            C0246q.m1757c(view, i - c0048d.f285i);
            c0048d.f285i = i;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m330e(View view) {
        return this.f258h.m476e(view);
    }

    /* JADX INFO: renamed from: f */
    private void m331f() {
        this.f257g.clear();
        this.f258h.m469a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0048d c0048dM335a = m335a(childAt);
            c0048dM335a.m385b(this, childAt);
            this.f258h.m470a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (c0048dM335a.m383a(this, childAt, childAt2)) {
                        if (!this.f258h.m473b(childAt2)) {
                            this.f258h.m470a(childAt2);
                        }
                        this.f258h.m471a(childAt2, childAt);
                    }
                }
            }
        }
        this.f257g.addAll(this.f258h.m472b());
        Collections.reverse(this.f257g);
    }

    /* JADX INFO: renamed from: f */
    private void m332f(View view, int i) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (c0048d.f286j != i) {
            C0246q.m1753b(view, i - c0048d.f286j);
            c0048d.f286j = i;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m333g() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!C0246q.m1770p(this)) {
            C0246q.m1746a(this, (InterfaceC0244o) null);
            return;
        }
        if (this.f273w == null) {
            this.f273w = new InterfaceC0244o() { // from class: android.support.design.widget.CoordinatorLayout.1
                @Override // android.support.v4.p019j.InterfaceC0244o
                /* JADX INFO: renamed from: a */
                public C0254y mo213a(View view, C0254y c0254y) {
                    return CoordinatorLayout.this.m337a(c0254y);
                }
            };
        }
        C0246q.m1746a(this, this.f273w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0048d generateLayoutParams(AttributeSet attributeSet) {
        return new C0048d(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: a */
    C0048d m335a(View view) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (!c0048d.f278b) {
            InterfaceC0046b interfaceC0046b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0046b = (InterfaceC0046b) superclass.getAnnotation(InterfaceC0046b.class);
                if (interfaceC0046b != null) {
                    break;
                }
            }
            InterfaceC0046b interfaceC0046b2 = interfaceC0046b;
            if (interfaceC0046b2 != null) {
                try {
                    c0048d.m380a(interfaceC0046b2.m372a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0046b2.m372a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0048d.f278b = true;
        }
        return c0048d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0048d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0048d ? new C0048d((C0048d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0048d((ViewGroup.MarginLayoutParams) layoutParams) : new C0048d(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    final C0254y m337a(C0254y c0254y) {
        if (C0215i.m1567a(this.f270t, c0254y)) {
            return c0254y;
        }
        this.f270t = c0254y;
        this.f271u = c0254y != null && c0254y.m1870b() > 0;
        setWillNotDraw(!this.f271u && getBackground() == null);
        C0254y c0254yM322b = m322b(c0254y);
        requestLayout();
        return c0254yM322b;
    }

    /* JADX INFO: renamed from: a */
    void m338a() {
        boolean z = false;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (m330e(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.f269s) {
            if (z) {
                m349b();
            } else {
                m355c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m339a(int i) {
        int i2;
        boolean zMo279b;
        int iM1759e = C0246q.m1759e(this);
        int size = this.f257g.size();
        Rect rectM328e = m328e();
        Rect rectM328e2 = m328e();
        Rect rectM328e3 = m328e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f257g.get(i3);
            C0048d c0048d = (C0048d) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c0048d.f288l == this.f257g.get(i4)) {
                        m351b(view, iM1759e);
                    }
                }
                m346a(view, true, rectM328e2);
                if (c0048d.f283g != 0 && !rectM328e2.isEmpty()) {
                    int iM1692a = C0233d.m1692a(c0048d.f283g, iM1759e);
                    switch (iM1692a & C0025a.j.AppCompatTheme_windowFixedHeightMajor) {
                        case 48:
                            rectM328e.top = Math.max(rectM328e.top, rectM328e2.bottom);
                            break;
                        case 80:
                            rectM328e.bottom = Math.max(rectM328e.bottom, getHeight() - rectM328e2.top);
                            break;
                    }
                    switch (iM1692a & 7) {
                        case 3:
                            rectM328e.left = Math.max(rectM328e.left, rectM328e2.right);
                            break;
                        case 5:
                            rectM328e.right = Math.max(rectM328e.right, getWidth() - rectM328e2.left);
                            break;
                    }
                }
                if (c0048d.f284h != 0 && view.getVisibility() == 0) {
                    m316a(view, rectM328e, iM1759e);
                }
                if (i != 2) {
                    m357c(view, rectM328e3);
                    if (!rectM328e3.equals(rectM328e2)) {
                        m352b(view, rectM328e2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = this.f257g.get(i2);
                            C0048d c0048d2 = (C0048d) view2.getLayoutParams();
                            AbstractC0045a abstractC0045aM384b = c0048d2.m384b();
                            if (abstractC0045aM384b != null && abstractC0045aM384b.mo276a(this, view2, view)) {
                                if (i == 0 && c0048d2.m391g()) {
                                    c0048d2.m392h();
                                } else {
                                    switch (i) {
                                        case 2:
                                            abstractC0045aM384b.m370d(this, view2, view);
                                            zMo279b = true;
                                            break;
                                        default:
                                            zMo279b = abstractC0045aM384b.mo279b(this, view2, view);
                                            break;
                                    }
                                    if (i == 1) {
                                        c0048d2.m381a(zMo279b);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                    }
                }
            }
        }
        m313a(rectM328e);
        m313a(rectM328e2);
        m313a(rectM328e3);
    }

    /* JADX INFO: renamed from: a */
    public void m340a(View view, int i) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (c0048d.m388d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (c0048d.f287k != null) {
            m317a(view, c0048d.f287k, i);
        } else if (c0048d.f281e >= 0) {
            m323b(view, c0048d.f281e, i);
        } else {
            m326d(view, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m341a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.support.v4.p019j.InterfaceC0242m
    /* JADX INFO: renamed from: a */
    public void mo342a(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                z = z2;
            } else {
                C0048d c0048d = (C0048d) childAt.getLayoutParams();
                if (c0048d.m386b(i5)) {
                    AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                    if (abstractC0045aM384b != null) {
                        abstractC0045aM384b.mo250a(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    } else {
                        z = z2;
                    }
                } else {
                    z = z2;
                }
            }
            i6++;
            z2 = z;
        }
        if (z2) {
            m339a(1);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0242m
    /* JADX INFO: renamed from: a */
    public void mo343a(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        int iMax;
        int iMax2;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                z = z2;
                iMax = i4;
                iMax2 = i5;
            } else {
                C0048d c0048d = (C0048d) childAt.getLayoutParams();
                if (c0048d.m386b(i3)) {
                    AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                    if (abstractC0045aM384b != null) {
                        int[] iArr2 = this.f261k;
                        this.f261k[1] = 0;
                        iArr2[0] = 0;
                        abstractC0045aM384b.mo251a(this, childAt, view, i, i2, this.f261k, i3);
                        iMax = i > 0 ? Math.max(i4, this.f261k[0]) : Math.min(i4, this.f261k[0]);
                        iMax2 = i2 > 0 ? Math.max(i5, this.f261k[1]) : Math.min(i5, this.f261k[1]);
                        z = true;
                    } else {
                        z = z2;
                        iMax = i4;
                        iMax2 = i5;
                    }
                } else {
                    z = z2;
                    iMax = i4;
                    iMax2 = i5;
                }
            }
            i6++;
            i5 = iMax2;
            i4 = iMax;
            z2 = z;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            m339a(1);
        }
    }

    /* JADX INFO: renamed from: a */
    void m344a(View view, int i, Rect rect, Rect rect2) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m315a(view, i, rect, rect2, c0048d, measuredWidth, measuredHeight);
        m314a(c0048d, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: a */
    void m345a(View view, Rect rect) {
        C0075o.m555b(this, view, rect);
    }

    /* JADX INFO: renamed from: a */
    void m346a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m345a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m347a(View view, int i, int i2) {
        Rect rectM328e = m328e();
        m345a(view, rectM328e);
        try {
            return rectM328e.contains(i, i2);
        } finally {
            m313a(rectM328e);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0242m
    /* JADX INFO: renamed from: a */
    public boolean mo348a(View view, View view2, int i, int i2) {
        boolean z;
        boolean z2 = false;
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 8) {
                z = z2;
            } else {
                C0048d c0048d = (C0048d) childAt.getLayoutParams();
                AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                if (abstractC0045aM384b != null) {
                    boolean zMo259a = abstractC0045aM384b.mo259a(this, childAt, view, view2, i, i2);
                    z = z2 | zMo259a;
                    c0048d.m378a(i2, zMo259a);
                } else {
                    c0048d.m378a(i2, false);
                    z = z2;
                }
            }
            i3++;
            z2 = z;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    void m349b() {
        if (this.f264n) {
            if (this.f268r == null) {
                this.f268r = new ViewTreeObserverOnPreDrawListenerC0049e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f268r);
        }
        this.f269s = true;
    }

    /* JADX INFO: renamed from: b */
    public void m350b(View view) {
        List listM474c = this.f258h.m474c(view);
        if (listM474c == null || listM474c.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= listM474c.size()) {
                return;
            }
            View view2 = (View) listM474c.get(i2);
            AbstractC0045a abstractC0045aM384b = ((C0048d) view2.getLayoutParams()).m384b();
            if (abstractC0045aM384b != null) {
                abstractC0045aM384b.mo279b(this, view2, view);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    void m351b(View view, int i) {
        AbstractC0045a abstractC0045aM384b;
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (c0048d.f287k != null) {
            Rect rectM328e = m328e();
            Rect rectM328e2 = m328e();
            Rect rectM328e3 = m328e();
            m345a(c0048d.f287k, rectM328e);
            m346a(view, false, rectM328e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m315a(view, i, rectM328e, rectM328e3, c0048d, measuredWidth, measuredHeight);
            boolean z = (rectM328e3.left == rectM328e2.left && rectM328e3.top == rectM328e2.top) ? false : true;
            m314a(c0048d, rectM328e3, measuredWidth, measuredHeight);
            int i2 = rectM328e3.left - rectM328e2.left;
            int i3 = rectM328e3.top - rectM328e2.top;
            if (i2 != 0) {
                C0246q.m1757c(view, i2);
            }
            if (i3 != 0) {
                C0246q.m1753b(view, i3);
            }
            if (z && (abstractC0045aM384b = c0048d.m384b()) != null) {
                abstractC0045aM384b.mo279b(this, view, c0048d.f287k);
            }
            m313a(rectM328e);
            m313a(rectM328e2);
            m313a(rectM328e3);
        }
    }

    /* JADX INFO: renamed from: b */
    void m352b(View view, Rect rect) {
        ((C0048d) view.getLayoutParams()).m379a(rect);
    }

    @Override // android.support.v4.p019j.InterfaceC0242m
    /* JADX INFO: renamed from: b */
    public void mo353b(View view, View view2, int i, int i2) {
        AbstractC0045a abstractC0045aM384b;
        this.f274x.m1733a(view, view2, i, i2);
        this.f267q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0048d c0048d = (C0048d) childAt.getLayoutParams();
            if (c0048d.m386b(i2) && (abstractC0045aM384b = c0048d.m384b()) != null) {
                abstractC0045aM384b.m366b(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public List<View> m354c(View view) {
        List<View> listM475d = this.f258h.m475d(view);
        this.f260j.clear();
        if (listM475d != null) {
            this.f260j.addAll(listM475d);
        }
        return this.f260j;
    }

    /* JADX INFO: renamed from: c */
    void m355c() {
        if (this.f264n && this.f268r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f268r);
        }
        this.f269s = false;
    }

    @Override // android.support.v4.p019j.InterfaceC0242m
    /* JADX INFO: renamed from: c */
    public void mo356c(View view, int i) {
        this.f274x.m1731a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0048d c0048d = (C0048d) childAt.getLayoutParams();
            if (c0048d.m386b(i)) {
                AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                if (abstractC0045aM384b != null) {
                    abstractC0045aM384b.mo249a(this, childAt, view, i);
                }
                c0048d.m377a(i);
                c0048d.m392h();
            }
        }
        this.f267q = null;
    }

    /* JADX INFO: renamed from: c */
    void m357c(View view, Rect rect) {
        rect.set(((C0048d) view.getLayoutParams()).m387c());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0048d) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0048d generateDefaultLayoutParams() {
        return new C0048d(-2, -2);
    }

    /* JADX INFO: renamed from: d */
    public List<View> m359d(View view) {
        List listM474c = this.f258h.m474c(view);
        this.f260j.clear();
        if (listM474c != null) {
            this.f260j.addAll(listM474c);
        }
        return this.f260j;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0048d c0048d = (C0048d) view.getLayoutParams();
        if (c0048d.f277a != null) {
            float fM369d = c0048d.f277a.m369d(this, view);
            if (fM369d > 0.0f) {
                if (this.f262l == null) {
                    this.f262l = new Paint();
                }
                this.f262l.setColor(c0048d.f277a.m367c(this, view));
                this.f262l.setAlpha(C0198a.m1464a(Math.round(fM369d * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f262l);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean state = false;
        Drawable drawable = this.f272v;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    final List<View> getDependencySortedChildren() {
        m331f();
        return Collections.unmodifiableList(this.f257g);
    }

    final C0254y getLastWindowInsets() {
        return this.f270t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f274x.m1729a();
    }

    public Drawable getStatusBarBackground() {
        return this.f272v;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m319a(false);
        if (this.f269s) {
            if (this.f268r == null) {
                this.f268r = new ViewTreeObserverOnPreDrawListenerC0049e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f268r);
        }
        if (this.f270t == null && C0246q.m1770p(this)) {
            C0246q.m1769o(this);
        }
        this.f264n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m319a(false);
        if (this.f269s && this.f268r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f268r);
        }
        if (this.f267q != null) {
            onStopNestedScroll(this.f267q);
        }
        this.f264n = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f271u || this.f272v == null) {
            return;
        }
        int iM1870b = this.f270t != null ? this.f270t.m1870b() : 0;
        if (iM1870b > 0) {
            this.f272v.setBounds(0, 0, getWidth(), iM1870b);
            this.f272v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = null;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m319a(true);
        }
        boolean zM320a = m320a(motionEvent, 0);
        if (0 != 0) {
            motionEvent2.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            m319a(true);
        }
        return zM320a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0045a abstractC0045aM384b;
        int iM1759e = C0246q.m1759e(this);
        int size = this.f257g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f257g.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0045aM384b = ((C0048d) view.getLayoutParams()).m384b()) == null || !abstractC0045aM384b.mo257a(this, view, iM1759e))) {
                m340a(view, iM1759e);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iCombineMeasuredStates;
        int i3;
        m331f();
        m338a();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iM1759e = C0246q.m1759e(this);
        boolean z = iM1759e == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = paddingLeft + paddingRight;
        int i5 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int i6 = 0;
        boolean z2 = this.f270t != null && C0246q.m1770p(this);
        int size3 = this.f257g.size();
        int i7 = 0;
        while (i7 < size3) {
            View view = this.f257g.get(i7);
            if (view.getVisibility() == 8) {
                iCombineMeasuredStates = i6;
                iMax = suggestedMinimumHeight;
                i3 = suggestedMinimumWidth;
            } else {
                C0048d c0048d = (C0048d) view.getLayoutParams();
                int iMax2 = 0;
                if (c0048d.f281e >= 0 && mode != 0) {
                    int iM321b = m321b(c0048d.f281e);
                    int iM1692a = C0233d.m1692a(m325d(c0048d.f279c), iM1759e) & 7;
                    if ((iM1692a == 3 && !z) || (iM1692a == 5 && z)) {
                        iMax2 = Math.max(0, (size - paddingRight) - iM321b);
                    } else if ((iM1692a == 5 && !z) || (iM1692a == 3 && z)) {
                        iMax2 = Math.max(0, iM321b - paddingLeft);
                    }
                }
                if (!z2 || C0246q.m1770p(view)) {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i;
                } else {
                    int iM1868a = this.f270t.m1868a() + this.f270t.m1871c();
                    int iM1870b = this.f270t.m1870b() + this.f270t.m1872d();
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - iM1868a, mode);
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 - iM1870b, mode2);
                }
                AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                if (abstractC0045aM384b == null || !abstractC0045aM384b.mo258a(this, view, iMakeMeasureSpec2, iMax2, iMakeMeasureSpec, 0)) {
                    m341a(view, iMakeMeasureSpec2, iMax2, iMakeMeasureSpec, 0);
                }
                int iMax3 = Math.max(suggestedMinimumWidth, view.getMeasuredWidth() + i4 + c0048d.leftMargin + c0048d.rightMargin);
                iMax = Math.max(suggestedMinimumHeight, view.getMeasuredHeight() + i5 + c0048d.topMargin + c0048d.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                i3 = iMax3;
            }
            i7++;
            i6 = iCombineMeasuredStates;
            suggestedMinimumHeight = iMax;
            suggestedMinimumWidth = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i6), View.resolveSizeAndState(suggestedMinimumHeight, i2, i6 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean zM364a;
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                zM364a = z2;
            } else {
                C0048d c0048d = (C0048d) childAt.getLayoutParams();
                if (c0048d.m386b(0)) {
                    AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                    zM364a = abstractC0045aM384b != null ? abstractC0045aM384b.m364a(this, childAt, view, f, f2, z) | z2 : z2;
                } else {
                    zM364a = z2;
                }
            }
            i++;
            z2 = zM364a;
        }
        if (z2) {
            m339a(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedPreFling(View view, float f, float f2) {
        boolean zMo291a;
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                zMo291a = z;
            } else {
                C0048d c0048d = (C0048d) childAt.getLayoutParams();
                if (c0048d.m386b(0)) {
                    AbstractC0045a abstractC0045aM384b = c0048d.m384b();
                    zMo291a = abstractC0045aM384b != null ? abstractC0045aM384b.mo291a(this, childAt, view, f, f2) | z : z;
                } else {
                    zMo291a = z;
                }
            }
            i++;
            z = zMo291a;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo343a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo342a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo353b(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0050f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0050f c0050f = (C0050f) parcelable;
        super.onRestoreInstanceState(c0050f.m1605a());
        SparseArray<Parcelable> sparseArray = c0050f.f296a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0045a abstractC0045aM384b = m335a(childAt).m384b();
            if (id != -1 && abstractC0045aM384b != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0045aM384b.mo248a(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableMo264b;
        C0050f c0050f = new C0050f(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0045a abstractC0045aM384b = ((C0048d) childAt.getLayoutParams()).m384b();
            if (id != -1 && abstractC0045aM384b != null && (parcelableMo264b = abstractC0045aM384b.mo264b(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo264b);
            }
        }
        c0050f.f296a = sparseArray;
        return c0050f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo348a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onStopNestedScroll(View view) {
        mo356c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        MotionEvent motionEvent2 = null;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f266p == null) {
            boolean zM320a = m320a(motionEvent, 1);
            if (!zM320a) {
                z = zM320a;
                zOnTouchEvent = false;
                if (this.f266p != null) {
                    zOnTouchEvent |= super.onTouchEvent(motionEvent);
                } else if (z) {
                    if (0 == 0) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        motionEventObtain = null;
                    }
                    super.onTouchEvent(motionEventObtain);
                    motionEvent2 = motionEventObtain;
                }
                if (!zOnTouchEvent || actionMasked == 0) {
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (actionMasked != 1 || actionMasked == 3) {
                    m319a(false);
                }
                return zOnTouchEvent;
            }
            z = zM320a;
        } else {
            z = false;
        }
        AbstractC0045a abstractC0045aM384b = ((C0048d) this.f266p.getLayoutParams()).m384b();
        zOnTouchEvent = abstractC0045aM384b != null ? abstractC0045aM384b.mo296b(this, this.f266p, motionEvent) : false;
        if (this.f266p != null) {
        }
        if (!zOnTouchEvent) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
            m319a(false);
        }
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0045a abstractC0045aM384b = ((C0048d) view.getLayoutParams()).m384b();
        if (abstractC0045aM384b == null || !abstractC0045aM384b.mo275a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f263m) {
            return;
        }
        m319a(false);
        this.f263m = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m333g();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f256e = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f272v != drawable) {
            if (this.f272v != null) {
                this.f272v.setCallback(null);
            }
            this.f272v = drawable != null ? drawable.mutate() : null;
            if (this.f272v != null) {
                if (this.f272v.isStateful()) {
                    this.f272v.setState(getDrawableState());
                }
                C0181a.m1396b(this.f272v, C0246q.m1759e(this));
                this.f272v.setVisible(getVisibility() == 0, false);
                this.f272v.setCallback(this);
            }
            C0246q.m1756c(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0175b.m1337a(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f272v == null || this.f272v.isVisible() == z) {
            return;
        }
        this.f272v.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f272v;
    }
}
