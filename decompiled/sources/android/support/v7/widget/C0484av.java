package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.p016g.C0203e;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.C0237h;
import android.support.v4.p019j.C0240k;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0247r;
import android.support.v4.p019j.InterfaceC0239j;
import android.support.v4.p019j.p020a.C0223a;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v4.widget.C0323g;
import android.support.v7.p029f.C0386a;
import android.support.v7.widget.C0466ad;
import android.support.v7.widget.C0504bo;
import android.support.v7.widget.C0505bp;
import android.support.v7.widget.C0510f;
import android.support.v7.widget.RunnableC0475am;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.widget.av */
/* JADX INFO: loaded from: classes.dex */
public class C0484av extends ViewGroup implements InterfaceC0239j {

    /* JADX INFO: renamed from: H */
    static final Interpolator f3198H;

    /* JADX INFO: renamed from: I */
    private static final int[] f3199I = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: J */
    private static final int[] f3200J = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: K */
    private static final boolean f3201K;

    /* JADX INFO: renamed from: L */
    private static final boolean f3202L;

    /* JADX INFO: renamed from: M */
    private static final boolean f3203M;

    /* JADX INFO: renamed from: N */
    private static final Class<?>[] f3204N;

    /* JADX INFO: renamed from: a */
    static final boolean f3205a;

    /* JADX INFO: renamed from: b */
    static final boolean f3206b;

    /* JADX INFO: renamed from: c */
    static final boolean f3207c;

    /* JADX INFO: renamed from: A */
    RunnableC0475am.a f3208A;

    /* JADX INFO: renamed from: B */
    final t f3209B;

    /* JADX INFO: renamed from: C */
    boolean f3210C;

    /* JADX INFO: renamed from: D */
    boolean f3211D;

    /* JADX INFO: renamed from: E */
    boolean f3212E;

    /* JADX INFO: renamed from: F */
    C0485aw f3213F;

    /* JADX INFO: renamed from: G */
    final List<w> f3214G;

    /* JADX INFO: renamed from: O */
    private final q f3215O;

    /* JADX INFO: renamed from: P */
    private r f3216P;

    /* JADX INFO: renamed from: Q */
    private final Rect f3217Q;

    /* JADX INFO: renamed from: R */
    private final ArrayList<l> f3218R;

    /* JADX INFO: renamed from: S */
    private l f3219S;

    /* JADX INFO: renamed from: T */
    private int f3220T;

    /* JADX INFO: renamed from: U */
    private boolean f3221U;

    /* JADX INFO: renamed from: V */
    private int f3222V;

    /* JADX INFO: renamed from: W */
    private final AccessibilityManager f3223W;

    /* JADX INFO: renamed from: aA */
    private C0240k f3224aA;

    /* JADX INFO: renamed from: aB */
    private final int[] f3225aB;

    /* JADX INFO: renamed from: aC */
    private final int[] f3226aC;

    /* JADX INFO: renamed from: aD */
    private final int[] f3227aD;

    /* JADX INFO: renamed from: aE */
    private Runnable f3228aE;

    /* JADX INFO: renamed from: aF */
    private final C0505bp.b f3229aF;

    /* JADX INFO: renamed from: aa */
    private List<j> f3230aa;

    /* JADX INFO: renamed from: ab */
    private int f3231ab;

    /* JADX INFO: renamed from: ac */
    private int f3232ac;

    /* JADX INFO: renamed from: ad */
    private EdgeEffect f3233ad;

    /* JADX INFO: renamed from: ae */
    private EdgeEffect f3234ae;

    /* JADX INFO: renamed from: af */
    private EdgeEffect f3235af;

    /* JADX INFO: renamed from: ag */
    private EdgeEffect f3236ag;

    /* JADX INFO: renamed from: ah */
    private int f3237ah;

    /* JADX INFO: renamed from: ai */
    private int f3238ai;

    /* JADX INFO: renamed from: aj */
    private VelocityTracker f3239aj;

    /* JADX INFO: renamed from: ak */
    private int f3240ak;

    /* JADX INFO: renamed from: al */
    private int f3241al;

    /* JADX INFO: renamed from: am */
    private int f3242am;

    /* JADX INFO: renamed from: an */
    private int f3243an;

    /* JADX INFO: renamed from: ao */
    private int f3244ao;

    /* JADX INFO: renamed from: ap */
    private k f3245ap;

    /* JADX INFO: renamed from: aq */
    private final int f3246aq;

    /* JADX INFO: renamed from: ar */
    private final int f3247ar;

    /* JADX INFO: renamed from: as */
    private float f3248as;

    /* JADX INFO: renamed from: at */
    private float f3249at;

    /* JADX INFO: renamed from: au */
    private boolean f3250au;

    /* JADX INFO: renamed from: av */
    private m f3251av;

    /* JADX INFO: renamed from: aw */
    private List<m> f3252aw;

    /* JADX INFO: renamed from: ax */
    private e.b f3253ax;

    /* JADX INFO: renamed from: ay */
    private d f3254ay;

    /* JADX INFO: renamed from: az */
    private final int[] f3255az;

    /* JADX INFO: renamed from: d */
    final o f3256d;

    /* JADX INFO: renamed from: e */
    C0510f f3257e;

    /* JADX INFO: renamed from: f */
    C0466ad f3258f;

    /* JADX INFO: renamed from: g */
    final C0505bp f3259g;

    /* JADX INFO: renamed from: h */
    boolean f3260h;

    /* JADX INFO: renamed from: i */
    final Runnable f3261i;

    /* JADX INFO: renamed from: j */
    final Rect f3262j;

    /* JADX INFO: renamed from: k */
    final RectF f3263k;

    /* JADX INFO: renamed from: l */
    a f3264l;

    /* JADX INFO: renamed from: m */
    h f3265m;

    /* JADX INFO: renamed from: n */
    p f3266n;

    /* JADX INFO: renamed from: o */
    final ArrayList<g> f3267o;

    /* JADX INFO: renamed from: p */
    boolean f3268p;

    /* JADX INFO: renamed from: q */
    boolean f3269q;

    /* JADX INFO: renamed from: r */
    boolean f3270r;

    /* JADX INFO: renamed from: s */
    boolean f3271s;

    /* JADX INFO: renamed from: t */
    boolean f3272t;

    /* JADX INFO: renamed from: u */
    boolean f3273u;

    /* JADX INFO: renamed from: v */
    boolean f3274v;

    /* JADX INFO: renamed from: w */
    boolean f3275w;

    /* JADX INFO: renamed from: x */
    e f3276x;

    /* JADX INFO: renamed from: y */
    final v f3277y;

    /* JADX INFO: renamed from: z */
    RunnableC0475am f3278z;

    /* JADX INFO: renamed from: android.support.v7.widget.av$a */
    public static abstract class a<VH extends w> {

        /* JADX INFO: renamed from: a */
        private final b f3284a = new b();

        /* JADX INFO: renamed from: b */
        private boolean f3285b = false;

        /* JADX INFO: renamed from: a */
        public abstract int mo191a();

        /* JADX INFO: renamed from: a */
        public long mo192a(int i) {
            return -1L;
        }

        /* JADX INFO: renamed from: a */
        public void m4152a(c cVar) {
            this.f3284a.registerObserver(cVar);
        }

        /* JADX INFO: renamed from: a */
        public void mo198a(VH vh) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo199a(VH vh, int i);

        /* JADX INFO: renamed from: a */
        public void m4153a(VH vh, int i, List<Object> list) {
            mo199a(vh, i);
        }

        /* JADX INFO: renamed from: a */
        public void m4154a(C0484av c0484av) {
        }

        /* JADX INFO: renamed from: b */
        public int mo201b(int i) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public abstract VH mo202b(ViewGroup viewGroup, int i);

        /* JADX INFO: renamed from: b */
        public void m4155b(c cVar) {
            this.f3284a.unregisterObserver(cVar);
        }

        /* JADX INFO: renamed from: b */
        public final void m4156b(VH vh, int i) {
            vh.f3383c = i;
            if (m4162d()) {
                vh.f3385e = mo192a(i);
            }
            vh.m4412a(1, 519);
            C0203e.m1472a("RV OnBindView");
            m4153a(vh, i, vh.m4439u());
            vh.m4438t();
            ViewGroup.LayoutParams layoutParams = vh.f3381a.getLayoutParams();
            if (layoutParams instanceof i) {
                ((i) layoutParams).f3323e = true;
            }
            C0203e.m1471a();
        }

        /* JADX INFO: renamed from: b */
        public void m4157b(C0484av c0484av) {
        }

        /* JADX INFO: renamed from: b */
        public boolean m4158b(VH vh) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final VH m4159c(ViewGroup viewGroup, int i) {
            C0203e.m1472a("RV CreateView");
            VH vh = (VH) mo202b(viewGroup, i);
            vh.f3386f = i;
            C0203e.m1471a();
            return vh;
        }

        /* JADX INFO: renamed from: c */
        public void m4160c(VH vh) {
        }

        /* JADX INFO: renamed from: d */
        public void m4161d(VH vh) {
        }

        /* JADX INFO: renamed from: d */
        public final boolean m4162d() {
            return this.f3285b;
        }

        /* JADX INFO: renamed from: e */
        public final void m4163e() {
            this.f3284a.m4164a();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$b */
    static class b extends Observable<c> {
        b() {
        }

        /* JADX INFO: renamed from: a */
        public void m4164a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).mo4165a();
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public void mo4165a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        int m4166a(int i, int i2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        private b f3286a = null;

        /* JADX INFO: renamed from: b */
        private ArrayList<a> f3287b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        private long f3288c = 120;

        /* JADX INFO: renamed from: d */
        private long f3289d = 120;

        /* JADX INFO: renamed from: e */
        private long f3290e = 250;

        /* JADX INFO: renamed from: f */
        private long f3291f = 250;

        /* JADX INFO: renamed from: android.support.v7.widget.av$e$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m4184a();
        }

        /* JADX INFO: renamed from: android.support.v7.widget.av$e$b */
        interface b {
            /* JADX INFO: renamed from: a */
            void mo4185a(w wVar);
        }

        /* JADX INFO: renamed from: android.support.v7.widget.av$e$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f3292a;

            /* JADX INFO: renamed from: b */
            public int f3293b;

            /* JADX INFO: renamed from: c */
            public int f3294c;

            /* JADX INFO: renamed from: d */
            public int f3295d;

            /* JADX INFO: renamed from: a */
            public c m4186a(w wVar) {
                return m4187a(wVar, 0);
            }

            /* JADX INFO: renamed from: a */
            public c m4187a(w wVar, int i) {
                View view = wVar.f3381a;
                this.f3292a = view.getLeft();
                this.f3293b = view.getTop();
                this.f3294c = view.getRight();
                this.f3295d = view.getBottom();
                return this;
            }
        }

        /* JADX INFO: renamed from: e */
        static int m4167e(w wVar) {
            int i = wVar.f3394n & 14;
            if (wVar.m4432n()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int iM4424f = wVar.m4424f();
            int iM4423e = wVar.m4423e();
            return (iM4424f == -1 || iM4423e == -1 || iM4424f == iM4423e) ? i : i | 2048;
        }

        /* JADX INFO: renamed from: a */
        public c m4168a(t tVar, w wVar) {
            return m4183j().m4186a(wVar);
        }

        /* JADX INFO: renamed from: a */
        public c m4169a(t tVar, w wVar, int i, List<Object> list) {
            return m4183j().m4186a(wVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo3849a();

        /* JADX INFO: renamed from: a */
        void m4170a(b bVar) {
            this.f3286a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo4171a(w wVar, c cVar, c cVar2);

        /* JADX INFO: renamed from: a */
        public abstract boolean mo4172a(w wVar, w wVar2, c cVar, c cVar2);

        /* JADX INFO: renamed from: a */
        public boolean mo3855a(w wVar, List<Object> list) {
            return mo4181h(wVar);
        }

        /* JADX INFO: renamed from: b */
        public abstract boolean mo3857b();

        /* JADX INFO: renamed from: b */
        public abstract boolean mo4173b(w wVar, c cVar, c cVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo4174c(w wVar, c cVar, c cVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo3861d();

        /* JADX INFO: renamed from: d */
        public abstract void mo3862d(w wVar);

        /* JADX INFO: renamed from: e */
        public long m4175e() {
            return this.f3290e;
        }

        /* JADX INFO: renamed from: f */
        public long m4176f() {
            return this.f3288c;
        }

        /* JADX INFO: renamed from: f */
        public final void m4177f(w wVar) {
            m4179g(wVar);
            if (this.f3286a != null) {
                this.f3286a.mo4185a(wVar);
            }
        }

        /* JADX INFO: renamed from: g */
        public long m4178g() {
            return this.f3289d;
        }

        /* JADX INFO: renamed from: g */
        public void m4179g(w wVar) {
        }

        /* JADX INFO: renamed from: h */
        public long m4180h() {
            return this.f3291f;
        }

        /* JADX INFO: renamed from: h */
        public boolean mo4181h(w wVar) {
            return true;
        }

        /* JADX INFO: renamed from: i */
        public final void m4182i() {
            int size = this.f3287b.size();
            for (int i = 0; i < size; i++) {
                this.f3287b.get(i).m4184a();
            }
            this.f3287b.clear();
        }

        /* JADX INFO: renamed from: j */
        public c m4183j() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$f */
    private class f implements e.b {
        f() {
        }

        @Override // android.support.v7.widget.C0484av.e.b
        /* JADX INFO: renamed from: a */
        public void mo4185a(w wVar) {
            wVar.m4417a(true);
            if (wVar.f3388h != null && wVar.f3389i == null) {
                wVar.f3388h = null;
            }
            wVar.f3389i = null;
            if (wVar.m4410z() || C0484av.this.m4081a(wVar.f3381a) || !wVar.m4436r()) {
                return;
            }
            C0484av.this.removeDetachedView(wVar.f3381a, false);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$g */
    public static abstract class g {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m4188a(Canvas canvas, C0484av c0484av) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3895a(Canvas canvas, C0484av c0484av, t tVar) {
            m4191b(canvas, c0484av);
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m4189a(Rect rect, int i, C0484av c0484av) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: a */
        public void m4190a(Rect rect, View view, C0484av c0484av, t tVar) {
            m4189a(rect, ((i) view.getLayoutParams()).m4300f(), c0484av);
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public void m4191b(Canvas canvas, C0484av c0484av) {
        }

        /* JADX INFO: renamed from: b */
        public void m4192b(Canvas canvas, C0484av c0484av, t tVar) {
            m4188a(canvas, c0484av);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$h */
    public static abstract class h {

        /* JADX INFO: renamed from: e */
        private int f3301e;

        /* JADX INFO: renamed from: f */
        private int f3302f;

        /* JADX INFO: renamed from: g */
        private int f3303g;

        /* JADX INFO: renamed from: h */
        private int f3304h;

        /* JADX INFO: renamed from: p */
        C0466ad f3305p;

        /* JADX INFO: renamed from: q */
        C0484av f3306q;

        /* JADX INFO: renamed from: t */
        s f3309t;

        /* JADX INFO: renamed from: x */
        int f3313x;

        /* JADX INFO: renamed from: y */
        boolean f3314y;

        /* JADX INFO: renamed from: a */
        private final C0504bo.b f3297a = new C0504bo.b() { // from class: android.support.v7.widget.av.h.1
            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public int mo4292a() {
                return h.this.m4291z();
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public int mo4293a(View view) {
                return h.this.m4270h(view) - ((i) view.getLayoutParams()).leftMargin;
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public View mo4294a(int i) {
                return h.this.m4271h(i);
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: b */
            public int mo4295b() {
                return h.this.m4289x() - h.this.m4205B();
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: b */
            public int mo4296b(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.rightMargin + h.this.m4273j(view);
            }
        };

        /* JADX INFO: renamed from: b */
        private final C0504bo.b f3298b = new C0504bo.b() { // from class: android.support.v7.widget.av.h.2
            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public int mo4292a() {
                return h.this.m4204A();
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public int mo4293a(View view) {
                return h.this.m4272i(view) - ((i) view.getLayoutParams()).topMargin;
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: a */
            public View mo4294a(int i) {
                return h.this.m4271h(i);
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: b */
            public int mo4295b() {
                return h.this.m4290y() - h.this.m4206C();
            }

            @Override // android.support.v7.widget.C0504bo.b
            /* JADX INFO: renamed from: b */
            public int mo4296b(View view) {
                i iVar = (i) view.getLayoutParams();
                return iVar.bottomMargin + h.this.m4274k(view);
            }
        };

        /* JADX INFO: renamed from: r */
        C0504bo f3307r = new C0504bo(this.f3297a);

        /* JADX INFO: renamed from: s */
        C0504bo f3308s = new C0504bo(this.f3298b);

        /* JADX INFO: renamed from: u */
        boolean f3310u = false;

        /* JADX INFO: renamed from: v */
        boolean f3311v = false;

        /* JADX INFO: renamed from: w */
        boolean f3312w = false;

        /* JADX INFO: renamed from: c */
        private boolean f3299c = true;

        /* JADX INFO: renamed from: d */
        private boolean f3300d = true;

        /* JADX INFO: renamed from: android.support.v7.widget.av$h$a */
        public interface a {
            /* JADX INFO: renamed from: b */
            void mo3926b(int i, int i2);
        }

        /* JADX INFO: renamed from: android.support.v7.widget.av$h$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f3317a;

            /* JADX INFO: renamed from: b */
            public int f3318b;

            /* JADX INFO: renamed from: c */
            public boolean f3319c;

            /* JADX INFO: renamed from: d */
            public boolean f3320d;
        }

        /* JADX INFO: renamed from: a */
        public static int m4193a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                    return Math.min(size, Math.max(i2, i3));
                case 1073741824:
                    return size;
                default:
                    return Math.max(i2, i3);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m4194a(int i, int i2, int i3, int i4, boolean z) {
            int i5 = 0;
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i5 = 1073741824;
                    iMax = i4;
                } else if (i4 == -1) {
                    switch (i2) {
                        case Integer.MIN_VALUE:
                        case 1073741824:
                            i5 = iMax;
                            break;
                        case 0:
                            i2 = 0;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    iMax = i5;
                    i5 = i2;
                } else {
                    iMax = i4 == -2 ? 0 : 0;
                }
            } else if (i4 >= 0) {
                i5 = 1073741824;
                iMax = i4;
            } else if (i4 == -1) {
                i5 = i2;
            } else if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i5 = Integer.MIN_VALUE;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(iMax, i5);
        }

        /* JADX INFO: renamed from: a */
        public static b m4195a(Context context, AttributeSet attributeSet, int i, int i2) {
            b bVar = new b();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0386a.b.RecyclerView, i, i2);
            bVar.f3317a = typedArrayObtainStyledAttributes.getInt(C0386a.b.RecyclerView_android_orientation, 1);
            bVar.f3318b = typedArrayObtainStyledAttributes.getInt(C0386a.b.RecyclerView_spanCount, 1);
            bVar.f3319c = typedArrayObtainStyledAttributes.getBoolean(C0386a.b.RecyclerView_reverseLayout, false);
            bVar.f3320d = typedArrayObtainStyledAttributes.getBoolean(C0386a.b.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return bVar;
        }

        /* JADX INFO: renamed from: a */
        private void m4196a(int i, View view) {
            this.f3305p.m3790e(i);
        }

        /* JADX INFO: renamed from: a */
        private void m4198a(o oVar, int i, View view) {
            w wVarM4052e = C0484av.m4052e(view);
            if (wVarM4052e.m4421c()) {
                return;
            }
            if (wVarM4052e.m4432n() && !wVarM4052e.m4435q() && !this.f3306q.f3264l.m4162d()) {
                m4265f(i);
                oVar.m4338b(wVarM4052e);
            } else {
                m4269g(i);
                oVar.m4344c(view);
                this.f3306q.f3259g.m4577h(wVarM4052e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4199a(s sVar) {
            if (this.f3309t == sVar) {
                this.f3309t = null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m4200a(View view, int i, boolean z) {
            w wVarM4052e = C0484av.m4052e(view);
            if (z || wVarM4052e.m4435q()) {
                this.f3306q.f3259g.m4574e(wVarM4052e);
            } else {
                this.f3306q.f3259g.m4575f(wVarM4052e);
            }
            i iVar = (i) view.getLayoutParams();
            if (wVarM4052e.m4429k() || wVarM4052e.m4427i()) {
                if (wVarM4052e.m4427i()) {
                    wVarM4052e.m4428j();
                } else {
                    wVarM4052e.m4430l();
                }
                this.f3305p.m3779a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3306q) {
                int iM3783b = this.f3305p.m3783b(view);
                if (i == -1) {
                    i = this.f3305p.m3782b();
                }
                if (iM3783b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3306q.indexOfChild(view) + this.f3306q.m4061a());
                }
                if (iM3783b != i) {
                    this.f3306q.f3265m.m4261e(iM3783b, i);
                }
            } else {
                this.f3305p.m3780a(view, i, false);
                iVar.f3323e = true;
                if (this.f3309t != null && this.f3309t.m4370c()) {
                    this.f3309t.m4368b(view);
                }
            }
            if (iVar.f3324f) {
                wVarM4052e.f3381a.invalidate();
                iVar.f3324f = false;
            }
        }

        /* JADX INFO: renamed from: b */
        private static boolean m4201b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            switch (mode) {
                case Integer.MIN_VALUE:
                    return size >= i;
                case 0:
                    return true;
                case 1073741824:
                    return size == i;
                default:
                    return false;
            }
        }

        /* JADX INFO: renamed from: b */
        private int[] m4202b(C0484av c0484av, View view, Rect rect, boolean z) {
            int iMin;
            int[] iArr = new int[2];
            int iM4291z = m4291z();
            int iM4204A = m4204A();
            int iM4289x = m4289x() - m4205B();
            int iM4290y = m4290y() - m4206C();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = left + rect.width();
            int iHeight = top + rect.height();
            int iMin2 = Math.min(0, left - iM4291z);
            int iMin3 = Math.min(0, top - iM4204A);
            int iMax = Math.max(0, iWidth - iM4289x);
            int iMax2 = Math.max(0, iHeight - iM4290y);
            if (m4284s() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin2, iWidth - iM4289x);
                }
                iMin = iMax;
            } else {
                iMin = iMin2 != 0 ? iMin2 : Math.min(left - iM4291z, iMax);
            }
            int iMin4 = iMin3 != 0 ? iMin3 : Math.min(top - iM4204A, iMax2);
            iArr[0] = iMin;
            iArr[1] = iMin4;
            return iArr;
        }

        /* JADX INFO: renamed from: d */
        private boolean m4203d(C0484av c0484av, int i, int i2) {
            View focusedChild = c0484av.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iM4291z = m4291z();
            int iM4204A = m4204A();
            int iM4289x = m4289x() - m4205B();
            int iM4290y = m4290y() - m4206C();
            Rect rect = this.f3306q.f3262j;
            m4225a(focusedChild, rect);
            return rect.left - i < iM4289x && rect.right - i > iM4291z && rect.top - i2 < iM4290y && rect.bottom - i2 > iM4204A;
        }

        /* JADX INFO: renamed from: A */
        public int m4204A() {
            if (this.f3306q != null) {
                return this.f3306q.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: B */
        public int m4205B() {
            if (this.f3306q != null) {
                return this.f3306q.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: C */
        public int m4206C() {
            if (this.f3306q != null) {
                return this.f3306q.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: D */
        public View m4207D() {
            View focusedChild;
            if (this.f3306q == null || (focusedChild = this.f3306q.getFocusedChild()) == null || this.f3305p.m3787c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: renamed from: E */
        public int m4208E() {
            return C0246q.m1763i(this.f3306q);
        }

        /* JADX INFO: renamed from: F */
        public int m4209F() {
            return C0246q.m1764j(this.f3306q);
        }

        /* JADX INFO: renamed from: G */
        void m4210G() {
            if (this.f3309t != null) {
                this.f3309t.m4364a();
            }
        }

        /* JADX INFO: renamed from: H */
        public void m4211H() {
            this.f3310u = true;
        }

        /* JADX INFO: renamed from: I */
        boolean m4212I() {
            int iM4286u = m4286u();
            for (int i = 0; i < iM4286u; i++) {
                ViewGroup.LayoutParams layoutParams = m4271h(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public int mo3433a(int i, o oVar, t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public int mo3434a(o oVar, t tVar) {
            if (this.f3306q == null || this.f3306q.f3264l == null || !mo3518e()) {
                return 1;
            }
            return this.f3306q.f3264l.mo191a();
        }

        /* JADX INFO: renamed from: a */
        public abstract i mo3435a();

        /* JADX INFO: renamed from: a */
        public i mo3436a(Context context, AttributeSet attributeSet) {
            return new i(context, attributeSet);
        }

        /* JADX INFO: renamed from: a */
        public i mo3437a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof i ? new i((i) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new i((ViewGroup.MarginLayoutParams) layoutParams) : new i(layoutParams);
        }

        /* JADX INFO: renamed from: a */
        public View mo3439a(View view, int i, o oVar, t tVar) {
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void mo3499a(int i, int i2, t tVar, a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3500a(int i, a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public void m4213a(int i, o oVar) {
            View viewM4271h = m4271h(i);
            m4265f(i);
            oVar.m4332a(viewM4271h);
        }

        /* JADX INFO: renamed from: a */
        public void mo3441a(Rect rect, int i, int i2) {
            m4266f(m4193a(i, rect.width() + m4291z() + m4205B(), m4208E()), m4193a(i2, rect.height() + m4204A() + m4206C(), m4209F()));
        }

        /* JADX INFO: renamed from: a */
        public void mo3501a(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: a */
        void m4214a(C0224b c0224b) {
            m4218a(this.f3306q.f3256d, this.f3306q.f3209B, c0224b);
        }

        /* JADX INFO: renamed from: a */
        public void m4215a(a aVar, a aVar2) {
        }

        /* JADX INFO: renamed from: a */
        public void m4216a(o oVar) {
            for (int iM4286u = m4286u() - 1; iM4286u >= 0; iM4286u--) {
                m4198a(oVar, iM4286u, m4271h(iM4286u));
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4217a(o oVar, t tVar, int i, int i2) {
            this.f3306q.m4104e(i, i2);
        }

        /* JADX INFO: renamed from: a */
        public void m4218a(o oVar, t tVar, C0224b c0224b) {
            if (this.f3306q.canScrollVertically(-1) || this.f3306q.canScrollHorizontally(-1)) {
                c0224b.m1615a(8192);
                c0224b.m1648k(true);
            }
            if (this.f3306q.canScrollVertically(1) || this.f3306q.canScrollHorizontally(1)) {
                c0224b.m1615a(4096);
                c0224b.m1648k(true);
            }
            c0224b.m1619a(C0224b.b.m1659a(mo3434a(oVar, tVar), mo3454b(oVar, tVar), m4263e(oVar, tVar), m4255d(oVar, tVar)));
        }

        /* JADX INFO: renamed from: a */
        public void mo3444a(o oVar, t tVar, View view, C0224b c0224b) {
            c0224b.m1626b(C0224b.c.m1660a(mo3518e() ? m4256d(view) : 0, 1, mo3515d() ? m4256d(view) : 0, 1, false, false));
        }

        /* JADX INFO: renamed from: a */
        public void m4219a(o oVar, t tVar, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            if (this.f3306q == null || accessibilityEvent == null) {
                return;
            }
            if (!this.f3306q.canScrollVertically(1) && !this.f3306q.canScrollVertically(-1) && !this.f3306q.canScrollHorizontally(-1) && !this.f3306q.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.f3306q.f3264l != null) {
                accessibilityEvent.setItemCount(this.f3306q.f3264l.mo191a());
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo3445a(t tVar) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3447a(C0484av c0484av) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3448a(C0484av c0484av, int i, int i2) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3449a(C0484av c0484av, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3450a(C0484av c0484av, int i, int i2, Object obj) {
            m4251c(c0484av, i, i2);
        }

        /* JADX INFO: renamed from: a */
        public void mo3502a(C0484av c0484av, o oVar) {
            m4262e(c0484av);
        }

        /* JADX INFO: renamed from: a */
        public void m4220a(View view) {
            m4221a(view, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m4221a(View view, int i) {
            m4200a(view, i, true);
        }

        /* JADX INFO: renamed from: a */
        public void m4222a(View view, int i, int i2) {
            i iVar = (i) view.getLayoutParams();
            Rect rectM4117i = this.f3306q.m4117i(view);
            int i3 = rectM4117i.left + rectM4117i.right + i;
            int i4 = rectM4117i.bottom + rectM4117i.top + i2;
            int iM4194a = m4194a(m4289x(), m4287v(), i3 + m4291z() + m4205B() + iVar.leftMargin + iVar.rightMargin, iVar.width, mo3515d());
            int iM4194a2 = m4194a(m4290y(), m4288w(), i4 + m4204A() + m4206C() + iVar.topMargin + iVar.bottomMargin, iVar.height, mo3518e());
            if (m4247b(view, iM4194a, iM4194a2, iVar)) {
                view.measure(iM4194a, iM4194a2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4223a(View view, int i, int i2, int i3, int i4) {
            i iVar = (i) view.getLayoutParams();
            Rect rect = iVar.f3322d;
            view.layout(rect.left + i + iVar.leftMargin, rect.top + i2 + iVar.topMargin, (i3 - rect.right) - iVar.rightMargin, (i4 - rect.bottom) - iVar.bottomMargin);
        }

        /* JADX INFO: renamed from: a */
        public void m4224a(View view, int i, i iVar) {
            w wVarM4052e = C0484av.m4052e(view);
            if (wVarM4052e.m4435q()) {
                this.f3306q.f3259g.m4574e(wVarM4052e);
            } else {
                this.f3306q.f3259g.m4575f(wVarM4052e);
            }
            this.f3305p.m3779a(view, i, iVar, wVarM4052e.m4435q());
        }

        /* JADX INFO: renamed from: a */
        public void m4225a(View view, Rect rect) {
            C0484av.m4042a(view, rect);
        }

        /* JADX INFO: renamed from: a */
        void m4226a(View view, C0224b c0224b) {
            w wVarM4052e = C0484av.m4052e(view);
            if (wVarM4052e == null || wVarM4052e.m4435q() || this.f3305p.m3787c(wVarM4052e.f3381a)) {
                return;
            }
            mo3444a(this.f3306q.f3256d, this.f3306q.f3209B, view, c0224b);
        }

        /* JADX INFO: renamed from: a */
        public void m4227a(View view, o oVar) {
            m4252c(view);
            oVar.m4332a(view);
        }

        /* JADX INFO: renamed from: a */
        public void m4228a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((i) view.getLayoutParams()).f3322d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3306q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3306q.f3263k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: a */
        public void mo3503a(AccessibilityEvent accessibilityEvent) {
            m4219a(this.f3306q.f3256d, this.f3306q.f3209B, accessibilityEvent);
        }

        /* JADX INFO: renamed from: a */
        public void mo3504a(String str) {
            if (this.f3306q != null) {
                this.f3306q.m4075a(str);
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m4229a(int i, Bundle bundle) {
            return m4230a(this.f3306q.f3256d, this.f3306q.f3209B, i, bundle);
        }

        /* JADX INFO: renamed from: a */
        public boolean mo3452a(i iVar) {
            return iVar != null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[PHI: r0
          0x007a: PHI (r0v9 int) = (r0v4 int), (r0v14 int) binds: [B:20:0x0066, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m4230a(o oVar, t tVar, int i, Bundle bundle) {
            int iM4290y;
            int i2;
            int iM4289x;
            if (this.f3306q == null) {
                return false;
            }
            switch (i) {
                case 4096:
                    iM4290y = this.f3306q.canScrollVertically(1) ? (m4290y() - m4204A()) - m4206C() : 0;
                    if (!this.f3306q.canScrollHorizontally(1)) {
                        i2 = iM4290y;
                        iM4289x = 0;
                    } else {
                        i2 = iM4290y;
                        iM4289x = (m4289x() - m4291z()) - m4205B();
                    }
                    break;
                case 8192:
                    iM4290y = this.f3306q.canScrollVertically(-1) ? -((m4290y() - m4204A()) - m4206C()) : 0;
                    if (this.f3306q.canScrollHorizontally(-1)) {
                        i2 = iM4290y;
                        iM4289x = -((m4289x() - m4291z()) - m4205B());
                        break;
                    }
                    break;
                default:
                    iM4289x = 0;
                    i2 = 0;
                    break;
            }
            if (i2 == 0 && iM4289x == 0) {
                return false;
            }
            this.f3306q.scrollBy(iM4289x, i2);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4231a(o oVar, t tVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4232a(C0484av c0484av, t tVar, View view, View view2) {
            return m4235a(c0484av, view, view2);
        }

        /* JADX INFO: renamed from: a */
        public boolean m4233a(C0484av c0484av, View view, Rect rect, boolean z) {
            return m4234a(c0484av, view, rect, z, false);
        }

        /* JADX INFO: renamed from: a */
        public boolean m4234a(C0484av c0484av, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrM4202b = m4202b(c0484av, view, rect, z);
            int i = iArrM4202b[0];
            int i2 = iArrM4202b[1];
            if (z2 && !m4203d(c0484av, i, i2)) {
                return false;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            if (z) {
                c0484av.scrollBy(i, i2);
            } else {
                c0484av.m4063a(i, i2);
            }
            return true;
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public boolean m4235a(C0484av c0484av, View view, View view2) {
            return m4283r() || c0484av.m4128o();
        }

        /* JADX INFO: renamed from: a */
        public boolean m4236a(C0484av c0484av, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        boolean m4237a(View view, int i, int i2, i iVar) {
            return (this.f3299c && m4201b(view.getMeasuredWidth(), i, iVar.width) && m4201b(view.getMeasuredHeight(), i2, iVar.height)) ? false : true;
        }

        /* JADX INFO: renamed from: a */
        boolean m4238a(View view, int i, Bundle bundle) {
            return m4231a(this.f3306q.f3256d, this.f3306q.f3209B, view, i, bundle);
        }

        /* JADX INFO: renamed from: a */
        public boolean m4239a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3307r.m4555a(view, 24579) && this.f3308s.m4555a(view, 24579);
            return z ? z3 : !z3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4240a(Runnable runnable) {
            if (this.f3306q != null) {
                return this.f3306q.removeCallbacks(runnable);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public int mo3453b(int i, o oVar, t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int mo3454b(o oVar, t tVar) {
            if (this.f3306q == null || this.f3306q.f3264l == null || !mo3515d()) {
                return 1;
            }
            return this.f3306q.f3264l.mo191a();
        }

        /* JADX INFO: renamed from: b */
        void m4241b(o oVar) {
            int iM4348e = oVar.m4348e();
            for (int i = iM4348e - 1; i >= 0; i--) {
                View viewM4349e = oVar.m4349e(i);
                w wVarM4052e = C0484av.m4052e(viewM4349e);
                if (!wVarM4052e.m4421c()) {
                    wVarM4052e.m4417a(false);
                    if (wVarM4052e.m4436r()) {
                        this.f3306q.removeDetachedView(viewM4349e, false);
                    }
                    if (this.f3306q.f3276x != null) {
                        this.f3306q.f3276x.mo3862d(wVarM4052e);
                    }
                    wVarM4052e.m4417a(true);
                    oVar.m4339b(viewM4349e);
                }
            }
            oVar.m4351f();
            if (iM4348e > 0) {
                this.f3306q.invalidate();
            }
        }

        /* JADX INFO: renamed from: b */
        void m4242b(C0484av c0484av) {
            if (c0484av == null) {
                this.f3306q = null;
                this.f3305p = null;
                this.f3303g = 0;
                this.f3304h = 0;
            } else {
                this.f3306q = c0484av;
                this.f3305p = c0484av.f3258f;
                this.f3303g = c0484av.getWidth();
                this.f3304h = c0484av.getHeight();
            }
            this.f3301e = 1073741824;
            this.f3302f = 1073741824;
        }

        /* JADX INFO: renamed from: b */
        public void mo3455b(C0484av c0484av, int i, int i2) {
        }

        /* JADX INFO: renamed from: b */
        void m4243b(C0484av c0484av, o oVar) {
            this.f3311v = false;
            mo3502a(c0484av, oVar);
        }

        /* JADX INFO: renamed from: b */
        public void m4244b(View view) {
            m4245b(view, -1);
        }

        /* JADX INFO: renamed from: b */
        public void m4245b(View view, int i) {
            m4200a(view, i, false);
        }

        /* JADX INFO: renamed from: b */
        public void m4246b(View view, Rect rect) {
            if (this.f3306q == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f3306q.m4117i(view));
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean mo3456b() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        boolean m4247b(View view, int i, int i2, i iVar) {
            return (!view.isLayoutRequested() && this.f3299c && m4201b(view.getWidth(), i, iVar.width) && m4201b(view.getHeight(), i2, iVar.height)) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public int mo3510c(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public Parcelable mo3511c() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public View mo3512c(int i) {
            int iM4286u = m4286u();
            for (int i2 = 0; i2 < iM4286u; i2++) {
                View viewM4271h = m4271h(i2);
                w wVarM4052e = C0484av.m4052e(viewM4271h);
                if (wVarM4052e != null && wVarM4052e.m4422d() == i && !wVarM4052e.m4421c() && (this.f3306q.f3209B.m4379a() || !wVarM4052e.m4435q())) {
                    return viewM4271h;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        void m4248c(int i, int i2) {
            this.f3303g = View.MeasureSpec.getSize(i);
            this.f3301e = View.MeasureSpec.getMode(i);
            if (this.f3301e == 0 && !C0484av.f3206b) {
                this.f3303g = 0;
            }
            this.f3304h = View.MeasureSpec.getSize(i2);
            this.f3302f = View.MeasureSpec.getMode(i2);
            if (this.f3302f != 0 || C0484av.f3206b) {
                return;
            }
            this.f3304h = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m4249c(o oVar) {
            for (int iM4286u = m4286u() - 1; iM4286u >= 0; iM4286u--) {
                if (!C0484av.m4052e(m4271h(iM4286u)).m4421c()) {
                    m4213a(iM4286u, oVar);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo3457c(o oVar, t tVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: c */
        void m4250c(C0484av c0484av) {
            this.f3311v = true;
            m4259d(c0484av);
        }

        /* JADX INFO: renamed from: c */
        public void m4251c(C0484av c0484av, int i, int i2) {
        }

        /* JADX INFO: renamed from: c */
        public void m4252c(View view) {
            this.f3305p.m3778a(view);
        }

        /* JADX INFO: renamed from: c */
        public void m4253c(View view, int i) {
            m4224a(view, i, (i) view.getLayoutParams());
        }

        /* JADX INFO: renamed from: c */
        public void m4254c(boolean z) {
            this.f3312w = z;
        }

        /* JADX INFO: renamed from: d */
        public int m4255d(o oVar, t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int mo3513d(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int m4256d(View view) {
            return ((i) view.getLayoutParams()).m4300f();
        }

        /* JADX INFO: renamed from: d */
        public View m4257d(View view, int i) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public void mo3514d(int i) {
        }

        /* JADX INFO: renamed from: d */
        void m4258d(int i, int i2) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int iM4286u = m4286u();
            if (iM4286u == 0) {
                this.f3306q.m4104e(i, i2);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iM4286u; i7++) {
                View viewM4271h = m4271h(i7);
                Rect rect = this.f3306q.f3262j;
                m4225a(viewM4271h, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i3) {
                    i3 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f3306q.f3262j.set(i6, i3, i5, i4);
            mo3441a(this.f3306q.f3262j, i, i2);
        }

        /* JADX INFO: renamed from: d */
        public void m4259d(C0484av c0484av) {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo3515d() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public int mo3517e(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public View m4260e(View view) {
            View viewM4093c;
            if (this.f3306q == null || (viewM4093c = this.f3306q.m4093c(view)) == null || this.f3305p.m3787c(viewM4093c)) {
                return null;
            }
            return viewM4093c;
        }

        /* JADX INFO: renamed from: e */
        public void m4261e(int i, int i2) {
            View viewM4271h = m4271h(i);
            if (viewM4271h == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3306q.toString());
            }
            m4269g(i);
            m4253c(viewM4271h, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public void m4262e(C0484av c0484av) {
        }

        /* JADX INFO: renamed from: e */
        public boolean mo3518e() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m4263e(o oVar, t tVar) {
            return false;
        }

        /* JADX INFO: renamed from: f */
        public int mo3520f(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public int m4264f(View view) {
            Rect rect = ((i) view.getLayoutParams()).f3322d;
            return rect.right + view.getMeasuredWidth() + rect.left;
        }

        /* JADX INFO: renamed from: f */
        public void m4265f(int i) {
            if (m4271h(i) != null) {
                this.f3305p.m3777a(i);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m4266f(int i, int i2) {
            this.f3306q.setMeasuredDimension(i, i2);
        }

        /* JADX INFO: renamed from: f */
        void m4267f(C0484av c0484av) {
            m4248c(View.MeasureSpec.makeMeasureSpec(c0484av.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0484av.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: g */
        public int mo3521g(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public int m4268g(View view) {
            Rect rect = ((i) view.getLayoutParams()).f3322d;
            return rect.bottom + view.getMeasuredHeight() + rect.top;
        }

        /* JADX INFO: renamed from: g */
        public void m4269g(int i) {
            m4196a(i, m4271h(i));
        }

        /* JADX INFO: renamed from: h */
        public int mo3523h(t tVar) {
            return 0;
        }

        /* JADX INFO: renamed from: h */
        public int m4270h(View view) {
            return view.getLeft() - m4277n(view);
        }

        /* JADX INFO: renamed from: h */
        public View m4271h(int i) {
            if (this.f3305p != null) {
                return this.f3305p.m3784b(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public int m4272i(View view) {
            return view.getTop() - m4275l(view);
        }

        /* JADX INFO: renamed from: i */
        public void mo3636i(int i) {
            if (this.f3306q != null) {
                this.f3306q.m4100d(i);
            }
        }

        /* JADX INFO: renamed from: j */
        public int m4273j(View view) {
            return view.getRight() + m4279o(view);
        }

        /* JADX INFO: renamed from: j */
        public void mo3639j(int i) {
            if (this.f3306q != null) {
                this.f3306q.m4095c(i);
            }
        }

        /* JADX INFO: renamed from: k */
        public int m4274k(View view) {
            return view.getBottom() + m4276m(view);
        }

        /* JADX INFO: renamed from: k */
        public void mo3640k(int i) {
        }

        /* JADX INFO: renamed from: k */
        boolean mo3527k() {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public int m4275l(View view) {
            return ((i) view.getLayoutParams()).f3322d.top;
        }

        /* JADX INFO: renamed from: m */
        public int m4276m(View view) {
            return ((i) view.getLayoutParams()).f3322d.bottom;
        }

        /* JADX INFO: renamed from: n */
        public int m4277n(View view) {
            return ((i) view.getLayoutParams()).f3322d.left;
        }

        /* JADX INFO: renamed from: n */
        public void m4278n() {
            if (this.f3306q != null) {
                this.f3306q.requestLayout();
            }
        }

        /* JADX INFO: renamed from: o */
        public int m4279o(View view) {
            return ((i) view.getLayoutParams()).f3322d.right;
        }

        /* JADX INFO: renamed from: o */
        public final boolean m4280o() {
            return this.f3300d;
        }

        /* JADX INFO: renamed from: p */
        public boolean m4281p() {
            return this.f3311v;
        }

        /* JADX INFO: renamed from: q */
        public boolean m4282q() {
            return this.f3306q != null && this.f3306q.f3260h;
        }

        /* JADX INFO: renamed from: r */
        public boolean m4283r() {
            return this.f3309t != null && this.f3309t.m4370c();
        }

        /* JADX INFO: renamed from: s */
        public int m4284s() {
            return C0246q.m1759e(this.f3306q);
        }

        /* JADX INFO: renamed from: t */
        public int m4285t() {
            return -1;
        }

        /* JADX INFO: renamed from: u */
        public int m4286u() {
            if (this.f3305p != null) {
                return this.f3305p.m3782b();
            }
            return 0;
        }

        /* JADX INFO: renamed from: v */
        public int m4287v() {
            return this.f3301e;
        }

        /* JADX INFO: renamed from: w */
        public int m4288w() {
            return this.f3302f;
        }

        /* JADX INFO: renamed from: x */
        public int m4289x() {
            return this.f3303g;
        }

        /* JADX INFO: renamed from: y */
        public int m4290y() {
            return this.f3304h;
        }

        /* JADX INFO: renamed from: z */
        public int m4291z() {
            if (this.f3306q != null) {
                return this.f3306q.getPaddingLeft();
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$i */
    public static class i extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c */
        w f3321c;

        /* JADX INFO: renamed from: d */
        final Rect f3322d;

        /* JADX INFO: renamed from: e */
        boolean f3323e;

        /* JADX INFO: renamed from: f */
        boolean f3324f;

        public i(int i, int i2) {
            super(i, i2);
            this.f3322d = new Rect();
            this.f3323e = true;
            this.f3324f = false;
        }

        public i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3322d = new Rect();
            this.f3323e = true;
            this.f3324f = false;
        }

        public i(i iVar) {
            super((ViewGroup.LayoutParams) iVar);
            this.f3322d = new Rect();
            this.f3323e = true;
            this.f3324f = false;
        }

        public i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3322d = new Rect();
            this.f3323e = true;
            this.f3324f = false;
        }

        public i(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3322d = new Rect();
            this.f3323e = true;
            this.f3324f = false;
        }

        /* JADX INFO: renamed from: c */
        public boolean m4297c() {
            return this.f3321c.m4432n();
        }

        /* JADX INFO: renamed from: d */
        public boolean m4298d() {
            return this.f3321c.m4435q();
        }

        /* JADX INFO: renamed from: e */
        public boolean m4299e() {
            return this.f3321c.m4442x();
        }

        /* JADX INFO: renamed from: f */
        public int m4300f() {
            return this.f3321c.m4422d();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void m4301a(View view);

        /* JADX INFO: renamed from: b */
        void m4302b(View view);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$k */
    public static abstract class k {
        /* JADX INFO: renamed from: a */
        public abstract boolean m4303a(int i, int i2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$l */
    public interface l {
        /* JADX INFO: renamed from: a */
        void mo3897a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo3899a(C0484av c0484av, MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        void mo3900b(C0484av c0484av, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$m */
    public static abstract class m {
        /* JADX INFO: renamed from: a */
        public void m4304a(C0484av c0484av, int i) {
        }

        /* JADX INFO: renamed from: a */
        public void mo3902a(C0484av c0484av, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$n */
    public static class n {

        /* JADX INFO: renamed from: a */
        SparseArray<a> f3325a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        private int f3326b = 0;

        /* JADX INFO: renamed from: android.support.v7.widget.av$n$a */
        static class a {

            /* JADX INFO: renamed from: a */
            ArrayList<w> f3327a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            int f3328b = 5;

            /* JADX INFO: renamed from: c */
            long f3329c = 0;

            /* JADX INFO: renamed from: d */
            long f3330d = 0;

            a() {
            }
        }

        /* JADX INFO: renamed from: b */
        private a m4305b(int i) {
            a aVar = this.f3325a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3325a.put(i, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: a */
        long m4306a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* JADX INFO: renamed from: a */
        public w m4307a(int i) {
            a aVar = this.f3325a.get(i);
            if (aVar == null || aVar.f3327a.isEmpty()) {
                return null;
            }
            return aVar.f3327a.remove(r0.size() - 1);
        }

        /* JADX INFO: renamed from: a */
        public void m4308a() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f3325a.size()) {
                    return;
                }
                this.f3325a.valueAt(i2).f3327a.clear();
                i = i2 + 1;
            }
        }

        /* JADX INFO: renamed from: a */
        void m4309a(int i, long j) {
            a aVarM4305b = m4305b(i);
            aVarM4305b.f3329c = m4306a(aVarM4305b.f3329c, j);
        }

        /* JADX INFO: renamed from: a */
        void m4310a(a aVar) {
            this.f3326b++;
        }

        /* JADX INFO: renamed from: a */
        void m4311a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                m4314b();
            }
            if (!z && this.f3326b == 0) {
                m4308a();
            }
            if (aVar2 != null) {
                m4310a(aVar2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4312a(w wVar) {
            int iM4426h = wVar.m4426h();
            ArrayList<w> arrayList = m4305b(iM4426h).f3327a;
            if (this.f3325a.get(iM4426h).f3328b <= arrayList.size()) {
                return;
            }
            wVar.m4440v();
            arrayList.add(wVar);
        }

        /* JADX INFO: renamed from: a */
        boolean m4313a(int i, long j, long j2) {
            long j3 = m4305b(i).f3329c;
            return j3 == 0 || j3 + j < j2;
        }

        /* JADX INFO: renamed from: b */
        void m4314b() {
            this.f3326b--;
        }

        /* JADX INFO: renamed from: b */
        void m4315b(int i, long j) {
            a aVarM4305b = m4305b(i);
            aVarM4305b.f3330d = m4306a(aVarM4305b.f3330d, j);
        }

        /* JADX INFO: renamed from: b */
        boolean m4316b(int i, long j, long j2) {
            long j3 = m4305b(i).f3330d;
            return j3 == 0 || j3 + j < j2;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$o */
    public final class o {

        /* JADX INFO: renamed from: e */
        n f3335e;

        /* JADX INFO: renamed from: i */
        private u f3339i;

        /* JADX INFO: renamed from: a */
        final ArrayList<w> f3331a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        ArrayList<w> f3332b = null;

        /* JADX INFO: renamed from: c */
        final ArrayList<w> f3333c = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        private final List<w> f3337g = Collections.unmodifiableList(this.f3331a);

        /* JADX INFO: renamed from: h */
        private int f3338h = 2;

        /* JADX INFO: renamed from: d */
        int f3334d = 2;

        public o() {
        }

        /* JADX INFO: renamed from: a */
        private void m4317a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4317a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private boolean m4318a(w wVar, int i, int i2, long j) {
            wVar.f3393m = C0484av.this;
            int iM4426h = wVar.m4426h();
            long nanoTime = C0484av.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3335e.m4316b(iM4426h, nanoTime, j)) {
                return false;
            }
            C0484av.this.f3264l.m4156b(wVar, i);
            this.f3335e.m4315b(wVar.m4426h(), C0484av.this.getNanoTime() - nanoTime);
            m4319e(wVar);
            if (C0484av.this.f3209B.m4379a()) {
                wVar.f3387g = i2;
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        private void m4319e(w wVar) {
            if (C0484av.this.m4127n()) {
                View view = wVar.f3381a;
                if (C0246q.m1758d(view) == 0) {
                    C0246q.m1738a(view, 1);
                }
                if (C0246q.m1751a(view)) {
                    return;
                }
                wVar.m4420b(16384);
                C0246q.m1745a(view, C0484av.this.f3213F.m4444c());
            }
        }

        /* JADX INFO: renamed from: f */
        private void m4320f(w wVar) {
            if (wVar.f3381a instanceof ViewGroup) {
                m4317a((ViewGroup) wVar.f3381a, false);
            }
        }

        /* JADX INFO: renamed from: a */
        w m4321a(int i, boolean z, long j) {
            w wVarM4159c;
            boolean z2;
            w wVar;
            boolean z3;
            boolean zM4318a;
            i iVar;
            boolean z4;
            C0484av c0484avM4054j;
            View viewM4384a;
            if (i < 0 || i >= C0484av.this.f3209B.m4383e()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + C0484av.this.f3209B.m4383e() + C0484av.this.m4061a());
            }
            if (C0484av.this.f3209B.m4379a()) {
                w wVarM4350f = m4350f(i);
                z2 = wVarM4350f != null;
                wVarM4159c = wVarM4350f;
            } else {
                wVarM4159c = null;
                z2 = false;
            }
            if (wVarM4159c == null && (wVarM4159c = m4335b(i, z)) != null) {
                if (m4333a(wVarM4159c)) {
                    z2 = true;
                } else {
                    if (!z) {
                        wVarM4159c.m4420b(4);
                        if (wVarM4159c.m4427i()) {
                            C0484av.this.removeDetachedView(wVarM4159c.f3381a, false);
                            wVarM4159c.m4428j();
                        } else if (wVarM4159c.m4429k()) {
                            wVarM4159c.m4430l();
                        }
                        m4338b(wVarM4159c);
                    }
                    wVarM4159c = null;
                }
            }
            if (wVarM4159c == null) {
                int iM4636b = C0484av.this.f3257e.m4636b(i);
                if (iM4636b < 0 || iM4636b >= C0484av.this.f3264l.mo191a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM4636b + ").state:" + C0484av.this.f3209B.m4383e() + C0484av.this.m4061a());
                }
                int iMo201b = C0484av.this.f3264l.mo201b(iM4636b);
                if (!C0484av.this.f3264l.m4162d() || (wVarM4159c = m4322a(C0484av.this.f3264l.mo192a(iM4636b), iMo201b, z)) == null) {
                    z4 = z2;
                } else {
                    wVarM4159c.f3383c = iM4636b;
                    z4 = true;
                }
                if (wVarM4159c == null && this.f3339i != null && (viewM4384a = this.f3339i.m4384a(this, i, iMo201b)) != null) {
                    wVarM4159c = C0484av.this.m4084b(viewM4384a);
                    if (wVarM4159c == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + C0484av.this.m4061a());
                    }
                    if (wVarM4159c.m4421c()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + C0484av.this.m4061a());
                    }
                }
                if (wVarM4159c == null && (wVarM4159c = m4352g().m4307a(iMo201b)) != null) {
                    wVarM4159c.m4440v();
                    if (C0484av.f3205a) {
                        m4320f(wVarM4159c);
                    }
                }
                if (wVarM4159c == null) {
                    long nanoTime = C0484av.this.getNanoTime();
                    if (j != Long.MAX_VALUE && !this.f3335e.m4313a(iMo201b, nanoTime, j)) {
                        return null;
                    }
                    wVarM4159c = C0484av.this.f3264l.m4159c(C0484av.this, iMo201b);
                    if (C0484av.f3201K && (c0484avM4054j = C0484av.m4054j(wVarM4159c.f3381a)) != null) {
                        wVarM4159c.f3382b = new WeakReference<>(c0484avM4054j);
                    }
                    this.f3335e.m4309a(iMo201b, C0484av.this.getNanoTime() - nanoTime);
                }
                wVar = wVarM4159c;
                z3 = z4;
            } else {
                wVar = wVarM4159c;
                z3 = z2;
            }
            if (z3 && !C0484av.this.f3209B.m4379a() && wVar.m4418a(8192)) {
                wVar.m4412a(0, 8192);
                if (C0484av.this.f3209B.f3364i) {
                    C0484av.this.m4073a(wVar, C0484av.this.f3276x.m4169a(C0484av.this.f3209B, wVar, e.m4167e(wVar) | 4096, wVar.m4439u()));
                }
            }
            if (C0484av.this.f3209B.m4379a() && wVar.m4434p()) {
                wVar.f3387g = i;
                zM4318a = false;
            } else {
                zM4318a = (!wVar.m4434p() || wVar.m4433o() || wVar.m4432n()) ? m4318a(wVar, C0484av.this.f3257e.m4636b(i), i, j) : false;
            }
            ViewGroup.LayoutParams layoutParams = wVar.f3381a.getLayoutParams();
            if (layoutParams == null) {
                iVar = (i) C0484av.this.generateDefaultLayoutParams();
                wVar.f3381a.setLayoutParams(iVar);
            } else if (C0484av.this.checkLayoutParams(layoutParams)) {
                iVar = (i) layoutParams;
            } else {
                iVar = (i) C0484av.this.generateLayoutParams(layoutParams);
                wVar.f3381a.setLayoutParams(iVar);
            }
            iVar.f3321c = wVar;
            iVar.f3324f = z3 && zM4318a;
            return wVar;
        }

        /* JADX INFO: renamed from: a */
        w m4322a(long j, int i, boolean z) {
            for (int size = this.f3331a.size() - 1; size >= 0; size--) {
                w wVar = this.f3331a.get(size);
                if (wVar.m4425g() == j && !wVar.m4429k()) {
                    if (i == wVar.m4426h()) {
                        wVar.m4420b(32);
                        if (!wVar.m4435q() || C0484av.this.f3209B.m4379a()) {
                            return wVar;
                        }
                        wVar.m4412a(2, 14);
                        return wVar;
                    }
                    if (!z) {
                        this.f3331a.remove(size);
                        C0484av.this.removeDetachedView(wVar.f3381a, false);
                        m4339b(wVar.f3381a);
                    }
                }
            }
            for (int size2 = this.f3333c.size() - 1; size2 >= 0; size2--) {
                w wVar2 = this.f3333c.get(size2);
                if (wVar2.m4425g() == j) {
                    if (i == wVar2.m4426h()) {
                        if (z) {
                            return wVar2;
                        }
                        this.f3333c.remove(size2);
                        return wVar2;
                    }
                    if (!z) {
                        m4346d(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        View m4323a(int i, boolean z) {
            return m4321a(i, z, Long.MAX_VALUE).f3381a;
        }

        /* JADX INFO: renamed from: a */
        public void m4324a() {
            this.f3331a.clear();
            m4345d();
        }

        /* JADX INFO: renamed from: a */
        public void m4325a(int i) {
            this.f3338h = i;
            m4336b();
        }

        /* JADX INFO: renamed from: a */
        void m4326a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i3 = -1;
                i4 = i2;
                i5 = i;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f3333c.size();
            for (int i6 = 0; i6 < size; i6++) {
                w wVar = this.f3333c.get(i6);
                if (wVar != null && wVar.f3383c >= i5 && wVar.f3383c <= i4) {
                    if (wVar.f3383c == i) {
                        wVar.m4414a(i2 - i, false);
                    } else {
                        wVar.m4414a(i3, false);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m4327a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3333c.size() - 1; size >= 0; size--) {
                w wVar = this.f3333c.get(size);
                if (wVar != null) {
                    if (wVar.f3383c >= i3) {
                        wVar.m4414a(-i2, z);
                    } else if (wVar.f3383c >= i) {
                        wVar.m4420b(8);
                        m4346d(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m4328a(a aVar, a aVar2, boolean z) {
            m4324a();
            m4352g().m4311a(aVar, aVar2, z);
        }

        /* JADX INFO: renamed from: a */
        void m4329a(n nVar) {
            if (this.f3335e != null) {
                this.f3335e.m4314b();
            }
            this.f3335e = nVar;
            if (nVar != null) {
                this.f3335e.m4310a(C0484av.this.getAdapter());
            }
        }

        /* JADX INFO: renamed from: a */
        void m4330a(u uVar) {
            this.f3339i = uVar;
        }

        /* JADX INFO: renamed from: a */
        void m4331a(w wVar, boolean z) {
            C0484av.m4050c(wVar);
            if (wVar.m4418a(16384)) {
                wVar.m4412a(0, 16384);
                C0246q.m1745a(wVar.f3381a, (C0227b) null);
            }
            if (z) {
                m4347d(wVar);
            }
            wVar.f3393m = null;
            m4352g().m4312a(wVar);
        }

        /* JADX INFO: renamed from: a */
        public void m4332a(View view) {
            w wVarM4052e = C0484av.m4052e(view);
            if (wVarM4052e.m4436r()) {
                C0484av.this.removeDetachedView(view, false);
            }
            if (wVarM4052e.m4427i()) {
                wVarM4052e.m4428j();
            } else if (wVarM4052e.m4429k()) {
                wVarM4052e.m4430l();
            }
            m4338b(wVarM4052e);
        }

        /* JADX INFO: renamed from: a */
        boolean m4333a(w wVar) {
            if (wVar.m4435q()) {
                return C0484av.this.f3209B.m4379a();
            }
            if (wVar.f3383c < 0 || wVar.f3383c >= C0484av.this.f3264l.mo191a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + wVar + C0484av.this.m4061a());
            }
            if (C0484av.this.f3209B.m4379a() || C0484av.this.f3264l.mo201b(wVar.f3383c) == wVar.m4426h()) {
                return !C0484av.this.f3264l.m4162d() || wVar.m4425g() == C0484av.this.f3264l.mo192a(wVar.f3383c);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public int m4334b(int i) {
            if (i < 0 || i >= C0484av.this.f3209B.m4383e()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + C0484av.this.f3209B.m4383e() + C0484av.this.m4061a());
            }
            return !C0484av.this.f3209B.m4379a() ? i : C0484av.this.f3257e.m4636b(i);
        }

        /* JADX INFO: renamed from: b */
        w m4335b(int i, boolean z) {
            View viewM3786c;
            int size = this.f3331a.size();
            for (int i2 = 0; i2 < size; i2++) {
                w wVar = this.f3331a.get(i2);
                if (!wVar.m4429k() && wVar.m4422d() == i && !wVar.m4432n() && (C0484av.this.f3209B.f3361f || !wVar.m4435q())) {
                    wVar.m4420b(32);
                    return wVar;
                }
            }
            if (!z && (viewM3786c = C0484av.this.f3258f.m3786c(i)) != null) {
                w wVarM4052e = C0484av.m4052e(viewM3786c);
                C0484av.this.f3258f.m3791e(viewM3786c);
                int iM3783b = C0484av.this.f3258f.m3783b(viewM3786c);
                if (iM3783b == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + wVarM4052e + C0484av.this.m4061a());
                }
                C0484av.this.f3258f.m3790e(iM3783b);
                m4344c(viewM3786c);
                wVarM4052e.m4420b(8224);
                return wVarM4052e;
            }
            int size2 = this.f3333c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                w wVar2 = this.f3333c.get(i3);
                if (!wVar2.m4432n() && wVar2.m4422d() == i) {
                    if (z) {
                        return wVar2;
                    }
                    this.f3333c.remove(i3);
                    return wVar2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        void m4336b() {
            this.f3334d = (C0484av.this.f3265m != null ? C0484av.this.f3265m.f3313x : 0) + this.f3338h;
            for (int size = this.f3333c.size() - 1; size >= 0 && this.f3333c.size() > this.f3334d; size--) {
                m4346d(size);
            }
        }

        /* JADX INFO: renamed from: b */
        void m4337b(int i, int i2) {
            int size = this.f3333c.size();
            for (int i3 = 0; i3 < size; i3++) {
                w wVar = this.f3333c.get(i3);
                if (wVar != null && wVar.f3383c >= i) {
                    wVar.m4414a(i2, true);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m4338b(w wVar) {
            boolean z;
            boolean z2 = false;
            if (wVar.m4427i() || wVar.f3381a.getParent() != null) {
                throw new IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + wVar.m4427i() + " isAttached:" + (wVar.f3381a.getParent() != null) + C0484av.this.m4061a());
            }
            if (wVar.m4436r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + wVar + C0484av.this.m4061a());
            }
            if (wVar.m4421c()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + C0484av.this.m4061a());
            }
            boolean zM4398A = wVar.m4398A();
            if ((C0484av.this.f3264l != null && zM4398A && C0484av.this.f3264l.m4158b(wVar)) || wVar.m4441w()) {
                if (this.f3334d <= 0 || wVar.m4418a(526)) {
                    z = false;
                } else {
                    int size = this.f3333c.size();
                    if (size >= this.f3334d && size > 0) {
                        m4346d(0);
                        size--;
                    }
                    if (C0484av.f3201K && size > 0 && !C0484av.this.f3208A.m3925a(wVar.f3383c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!C0484av.this.f3208A.m3925a(this.f3333c.get(i).f3383c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f3333c.add(size, wVar);
                    z = true;
                }
                if (!z) {
                    m4331a(wVar, true);
                    z2 = true;
                }
            } else {
                z = false;
            }
            C0484av.this.f3259g.m4576g(wVar);
            if (z || z2 || !zM4398A) {
                return;
            }
            wVar.f3393m = null;
        }

        /* JADX INFO: renamed from: b */
        void m4339b(View view) {
            w wVarM4052e = C0484av.m4052e(view);
            wVarM4052e.f3396q = null;
            wVarM4052e.f3397r = false;
            wVarM4052e.m4430l();
            m4338b(wVarM4052e);
        }

        /* JADX INFO: renamed from: c */
        public View m4340c(int i) {
            return m4323a(i, false);
        }

        /* JADX INFO: renamed from: c */
        public List<w> m4341c() {
            return this.f3337g;
        }

        /* JADX INFO: renamed from: c */
        void m4342c(int i, int i2) {
            int i3;
            int i4 = i + i2;
            for (int size = this.f3333c.size() - 1; size >= 0; size--) {
                w wVar = this.f3333c.get(size);
                if (wVar != null && (i3 = wVar.f3383c) >= i && i3 < i4) {
                    wVar.m4420b(2);
                    m4346d(size);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m4343c(w wVar) {
            if (wVar.f3397r) {
                this.f3332b.remove(wVar);
            } else {
                this.f3331a.remove(wVar);
            }
            wVar.f3396q = null;
            wVar.f3397r = false;
            wVar.m4430l();
        }

        /* JADX INFO: renamed from: c */
        void m4344c(View view) {
            w wVarM4052e = C0484av.m4052e(view);
            if (!wVarM4052e.m4418a(12) && wVarM4052e.m4442x() && !C0484av.this.m4092b(wVarM4052e)) {
                if (this.f3332b == null) {
                    this.f3332b = new ArrayList<>();
                }
                wVarM4052e.m4415a(this, true);
                this.f3332b.add(wVarM4052e);
                return;
            }
            if (wVarM4052e.m4432n() && !wVarM4052e.m4435q() && !C0484av.this.f3264l.m4162d()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + C0484av.this.m4061a());
            }
            wVarM4052e.m4415a(this, false);
            this.f3331a.add(wVarM4052e);
        }

        /* JADX INFO: renamed from: d */
        void m4345d() {
            for (int size = this.f3333c.size() - 1; size >= 0; size--) {
                m4346d(size);
            }
            this.f3333c.clear();
            if (C0484av.f3201K) {
                C0484av.this.f3208A.m3922a();
            }
        }

        /* JADX INFO: renamed from: d */
        void m4346d(int i) {
            m4331a(this.f3333c.get(i), true);
            this.f3333c.remove(i);
        }

        /* JADX INFO: renamed from: d */
        void m4347d(w wVar) {
            if (C0484av.this.f3266n != null) {
                C0484av.this.f3266n.m4356a(wVar);
            }
            if (C0484av.this.f3264l != null) {
                C0484av.this.f3264l.mo198a(wVar);
            }
            if (C0484av.this.f3209B != null) {
                C0484av.this.f3259g.m4576g(wVar);
            }
        }

        /* JADX INFO: renamed from: e */
        int m4348e() {
            return this.f3331a.size();
        }

        /* JADX INFO: renamed from: e */
        View m4349e(int i) {
            return this.f3331a.get(i).f3381a;
        }

        /* JADX INFO: renamed from: f */
        w m4350f(int i) {
            int size;
            int iM4636b;
            if (this.f3332b == null || (size = this.f3332b.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < size; i2++) {
                w wVar = this.f3332b.get(i2);
                if (!wVar.m4429k() && wVar.m4422d() == i) {
                    wVar.m4420b(32);
                    return wVar;
                }
            }
            if (C0484av.this.f3264l.m4162d() && (iM4636b = C0484av.this.f3257e.m4636b(i)) > 0 && iM4636b < C0484av.this.f3264l.mo191a()) {
                long jMo192a = C0484av.this.f3264l.mo192a(iM4636b);
                for (int i3 = 0; i3 < size; i3++) {
                    w wVar2 = this.f3332b.get(i3);
                    if (!wVar2.m4429k() && wVar2.m4425g() == jMo192a) {
                        wVar2.m4420b(32);
                        return wVar2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        void m4351f() {
            this.f3331a.clear();
            if (this.f3332b != null) {
                this.f3332b.clear();
            }
        }

        /* JADX INFO: renamed from: g */
        n m4352g() {
            if (this.f3335e == null) {
                this.f3335e = new n();
            }
            return this.f3335e;
        }

        /* JADX INFO: renamed from: h */
        void m4353h() {
            if (C0484av.this.f3264l == null || !C0484av.this.f3264l.m4162d()) {
                m4345d();
                return;
            }
            int size = this.f3333c.size();
            for (int i = 0; i < size; i++) {
                w wVar = this.f3333c.get(i);
                if (wVar != null) {
                    wVar.m4420b(6);
                    wVar.m4416a((Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        void m4354i() {
            int size = this.f3333c.size();
            for (int i = 0; i < size; i++) {
                this.f3333c.get(i).m4411a();
            }
            int size2 = this.f3331a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3331a.get(i2).m4411a();
            }
            if (this.f3332b != null) {
                int size3 = this.f3332b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3332b.get(i3).m4411a();
                }
            }
        }

        /* JADX INFO: renamed from: j */
        void m4355j() {
            int size = this.f3333c.size();
            for (int i = 0; i < size; i++) {
                i iVar = (i) this.f3333c.get(i).f3381a.getLayoutParams();
                if (iVar != null) {
                    iVar.f3323e = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$p */
    public interface p {
        /* JADX INFO: renamed from: a */
        void m4356a(w wVar);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$q */
    private class q extends c {
        q() {
        }

        @Override // android.support.v7.widget.C0484av.c
        /* JADX INFO: renamed from: a */
        public void mo4165a() {
            C0484av.this.m4075a((String) null);
            C0484av.this.f3209B.f3360e = true;
            C0484av.this.m4134u();
            if (C0484av.this.f3257e.m4640d()) {
                return;
            }
            C0484av.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$r */
    public static class r extends AbstractC0222a {
        public static final Parcelable.Creator<r> CREATOR = new Parcelable.ClassLoaderCreator<r>() { // from class: android.support.v7.widget.av.r.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public r createFromParcel(Parcel parcel) {
                return new r(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public r createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new r(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public r[] newArray(int i) {
                return new r[i];
            }
        };

        /* JADX INFO: renamed from: a */
        Parcelable f3341a;

        r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3341a = parcel.readParcelable(classLoader == null ? h.class.getClassLoader() : classLoader);
        }

        r(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: a */
        void m4357a(r rVar) {
            this.f3341a = rVar.f3341a;
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3341a, 0);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$s */
    public static abstract class s {

        /* JADX INFO: renamed from: a */
        private int f3342a;

        /* JADX INFO: renamed from: b */
        private C0484av f3343b;

        /* JADX INFO: renamed from: c */
        private h f3344c;

        /* JADX INFO: renamed from: d */
        private boolean f3345d;

        /* JADX INFO: renamed from: e */
        private boolean f3346e;

        /* JADX INFO: renamed from: f */
        private View f3347f;

        /* JADX INFO: renamed from: g */
        private final a f3348g;

        /* JADX INFO: renamed from: android.support.v7.widget.av$s$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f3349a;

            /* JADX INFO: renamed from: b */
            private int f3350b;

            /* JADX INFO: renamed from: c */
            private int f3351c;

            /* JADX INFO: renamed from: d */
            private int f3352d;

            /* JADX INFO: renamed from: e */
            private Interpolator f3353e;

            /* JADX INFO: renamed from: f */
            private boolean f3354f;

            /* JADX INFO: renamed from: g */
            private int f3355g;

            /* JADX INFO: renamed from: b */
            private void m4373b() {
                if (this.f3353e != null && this.f3351c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3351c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* JADX INFO: renamed from: a */
            void m4374a(C0484av c0484av) {
                if (this.f3352d >= 0) {
                    int i = this.f3352d;
                    this.f3352d = -1;
                    c0484av.m4062a(i);
                    this.f3354f = false;
                    return;
                }
                if (!this.f3354f) {
                    this.f3355g = 0;
                    return;
                }
                m4373b();
                if (this.f3353e != null) {
                    c0484av.f3277y.m4394a(this.f3349a, this.f3350b, this.f3351c, this.f3353e);
                } else if (this.f3351c == Integer.MIN_VALUE) {
                    c0484av.f3277y.m4397b(this.f3349a, this.f3350b);
                } else {
                    c0484av.f3277y.m4392a(this.f3349a, this.f3350b, this.f3351c);
                }
                this.f3355g++;
                if (this.f3355g > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f3354f = false;
            }

            /* JADX INFO: renamed from: a */
            boolean m4375a() {
                return this.f3352d >= 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4361a(int i, int i2) {
            C0484av c0484av = this.f3343b;
            if (!this.f3346e || this.f3342a == -1 || c0484av == null) {
                m4364a();
            }
            this.f3345d = false;
            if (this.f3347f != null) {
                if (m4363a(this.f3347f) == this.f3342a) {
                    m4367a(this.f3347f, c0484av.f3209B, this.f3348g);
                    this.f3348g.m4374a(c0484av);
                    m4364a();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3347f = null;
                }
            }
            if (this.f3346e) {
                m4366a(i, i2, c0484av.f3209B, this.f3348g);
                boolean zM4375a = this.f3348g.m4375a();
                this.f3348g.m4374a(c0484av);
                if (zM4375a) {
                    if (!this.f3346e) {
                        m4364a();
                    } else {
                        this.f3345d = true;
                        c0484av.f3277y.m4390a();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public int m4363a(View view) {
            return this.f3343b.m4105f(view);
        }

        /* JADX INFO: renamed from: a */
        protected final void m4364a() {
            if (this.f3346e) {
                m4372e();
                this.f3343b.f3209B.f3371p = -1;
                this.f3347f = null;
                this.f3342a = -1;
                this.f3345d = false;
                this.f3346e = false;
                this.f3344c.m4199a(this);
                this.f3344c = null;
                this.f3343b = null;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4365a(int i) {
            this.f3342a = i;
        }

        /* JADX INFO: renamed from: a */
        protected abstract void m4366a(int i, int i2, t tVar, a aVar);

        /* JADX INFO: renamed from: a */
        protected abstract void m4367a(View view, t tVar, a aVar);

        /* JADX INFO: renamed from: b */
        protected void m4368b(View view) {
            if (m4363a(view) == m4371d()) {
                this.f3347f = view;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m4369b() {
            return this.f3345d;
        }

        /* JADX INFO: renamed from: c */
        public boolean m4370c() {
            return this.f3346e;
        }

        /* JADX INFO: renamed from: d */
        public int m4371d() {
            return this.f3342a;
        }

        /* JADX INFO: renamed from: e */
        protected abstract void m4372e();
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$t */
    public static class t {

        /* JADX INFO: renamed from: k */
        int f3366k;

        /* JADX INFO: renamed from: l */
        long f3367l;

        /* JADX INFO: renamed from: m */
        int f3368m;

        /* JADX INFO: renamed from: n */
        int f3369n;

        /* JADX INFO: renamed from: o */
        int f3370o;

        /* JADX INFO: renamed from: q */
        private SparseArray<Object> f3372q;

        /* JADX INFO: renamed from: p */
        private int f3371p = -1;

        /* JADX INFO: renamed from: a */
        int f3356a = 0;

        /* JADX INFO: renamed from: b */
        int f3357b = 0;

        /* JADX INFO: renamed from: c */
        int f3358c = 1;

        /* JADX INFO: renamed from: d */
        int f3359d = 0;

        /* JADX INFO: renamed from: e */
        boolean f3360e = false;

        /* JADX INFO: renamed from: f */
        boolean f3361f = false;

        /* JADX INFO: renamed from: g */
        boolean f3362g = false;

        /* JADX INFO: renamed from: h */
        boolean f3363h = false;

        /* JADX INFO: renamed from: i */
        boolean f3364i = false;

        /* JADX INFO: renamed from: j */
        boolean f3365j = false;

        /* JADX INFO: renamed from: a */
        void m4377a(int i) {
            if ((this.f3358c & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3358c));
            }
        }

        /* JADX INFO: renamed from: a */
        void m4378a(a aVar) {
            this.f3358c = 1;
            this.f3359d = aVar.mo191a();
            this.f3361f = false;
            this.f3362g = false;
            this.f3363h = false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m4379a() {
            return this.f3361f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m4380b() {
            return this.f3365j;
        }

        /* JADX INFO: renamed from: c */
        public int m4381c() {
            return this.f3371p;
        }

        /* JADX INFO: renamed from: d */
        public boolean m4382d() {
            return this.f3371p != -1;
        }

        /* JADX INFO: renamed from: e */
        public int m4383e() {
            return this.f3361f ? this.f3356a - this.f3357b : this.f3359d;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3371p + ", mData=" + this.f3372q + ", mItemCount=" + this.f3359d + ", mPreviousLayoutItemCount=" + this.f3356a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3357b + ", mStructureChanged=" + this.f3360e + ", mInPreLayout=" + this.f3361f + ", mRunSimpleAnimations=" + this.f3364i + ", mRunPredictiveAnimations=" + this.f3365j + '}';
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$u */
    public static abstract class u {
        /* JADX INFO: renamed from: a */
        public abstract View m4384a(o oVar, int i, int i2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$v */
    class v implements Runnable {

        /* JADX INFO: renamed from: c */
        private int f3375c;

        /* JADX INFO: renamed from: d */
        private int f3376d;

        /* JADX INFO: renamed from: e */
        private OverScroller f3377e;

        /* JADX INFO: renamed from: a */
        Interpolator f3373a = C0484av.f3198H;

        /* JADX INFO: renamed from: f */
        private boolean f3378f = false;

        /* JADX INFO: renamed from: g */
        private boolean f3379g = false;

        v() {
            this.f3377e = new OverScroller(C0484av.this.getContext(), C0484av.f3198H);
        }

        /* JADX INFO: renamed from: a */
        private float m4385a(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* JADX INFO: renamed from: b */
        private int m4387b(int i, int i2, int i3, int i4) {
            int iRound;
            boolean z = Math.abs(i) > Math.abs(i2);
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            int width = z ? C0484av.this.getWidth() : C0484av.this.getHeight();
            int i5 = width / 2;
            float fM4385a = (m4385a(Math.min(1.0f, (iSqrt2 * 1.0f) / width)) * i5) + i5;
            if (iSqrt > 0) {
                iRound = Math.round(1000.0f * Math.abs(fM4385a / iSqrt)) * 4;
            } else {
                iRound = (int) ((((z ? r2 : r3) / width) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        /* JADX INFO: renamed from: c */
        private void m4388c() {
            this.f3379g = false;
            this.f3378f = true;
        }

        /* JADX INFO: renamed from: d */
        private void m4389d() {
            this.f3378f = false;
            if (this.f3379g) {
                m4390a();
            }
        }

        /* JADX INFO: renamed from: a */
        void m4390a() {
            if (this.f3378f) {
                this.f3379g = true;
            } else {
                C0484av.this.removeCallbacks(this);
                C0246q.m1747a(C0484av.this, this);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4391a(int i, int i2) {
            C0484av.this.setScrollState(2);
            this.f3376d = 0;
            this.f3375c = 0;
            this.f3377e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m4390a();
        }

        /* JADX INFO: renamed from: a */
        public void m4392a(int i, int i2, int i3) {
            m4394a(i, i2, i3, C0484av.f3198H);
        }

        /* JADX INFO: renamed from: a */
        public void m4393a(int i, int i2, int i3, int i4) {
            m4392a(i, i2, m4387b(i, i2, i3, i4));
        }

        /* JADX INFO: renamed from: a */
        public void m4394a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3373a != interpolator) {
                this.f3373a = interpolator;
                this.f3377e = new OverScroller(C0484av.this.getContext(), interpolator);
            }
            C0484av.this.setScrollState(2);
            this.f3376d = 0;
            this.f3375c = 0;
            this.f3377e.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3377e.computeScrollOffset();
            }
            m4390a();
        }

        /* JADX INFO: renamed from: a */
        public void m4395a(int i, int i2, Interpolator interpolator) {
            int iM4387b = m4387b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = C0484av.f3198H;
            }
            m4394a(i, i2, iM4387b, interpolator);
        }

        /* JADX INFO: renamed from: b */
        public void m4396b() {
            C0484av.this.removeCallbacks(this);
            this.f3377e.abortAnimation();
        }

        /* JADX INFO: renamed from: b */
        public void m4397b(int i, int i2) {
            m4393a(i, i2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int iMo3433a;
            int i8;
            int iMo3453b;
            if (C0484av.this.f3265m == null) {
                m4396b();
                return;
            }
            m4388c();
            C0484av.this.m4099d();
            OverScroller overScroller = this.f3377e;
            s sVar = C0484av.this.f3265m.f3309t;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = C0484av.this.f3226aC;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i9 = currX - this.f3375c;
                int i10 = currY - this.f3376d;
                this.f3375c = currX;
                this.f3376d = currY;
                if (C0484av.this.m4079a(i9, i10, iArr, (int[]) null, 1)) {
                    int i11 = i9 - iArr[0];
                    i = i10 - iArr[1];
                    i2 = i11;
                } else {
                    i = i10;
                    i2 = i9;
                }
                if (C0484av.this.f3264l != null) {
                    C0484av.this.m4102e();
                    C0484av.this.m4124l();
                    C0203e.m1472a("RV Scroll");
                    C0484av.this.m4072a(C0484av.this.f3209B);
                    if (i2 != 0) {
                        iMo3433a = C0484av.this.f3265m.mo3433a(i2, C0484av.this.f3256d, C0484av.this.f3209B);
                        i4 = i2 - iMo3433a;
                    } else {
                        i4 = 0;
                        iMo3433a = 0;
                    }
                    if (i != 0) {
                        iMo3453b = C0484av.this.f3265m.mo3453b(i, C0484av.this.f3256d, C0484av.this.f3209B);
                        i8 = i - iMo3453b;
                    } else {
                        i8 = 0;
                        iMo3453b = 0;
                    }
                    C0203e.m1471a();
                    C0484av.this.m4137x();
                    C0484av.this.m4126m();
                    C0484av.this.m4076a(false);
                    if (sVar == null || sVar.m4369b() || !sVar.m4370c()) {
                        i3 = i8;
                        int i12 = iMo3453b;
                        i6 = iMo3433a;
                        i5 = i12;
                    } else {
                        int iM4383e = C0484av.this.f3209B.m4383e();
                        if (iM4383e == 0) {
                            sVar.m4364a();
                            i3 = i8;
                            int i13 = iMo3453b;
                            i6 = iMo3433a;
                            i5 = i13;
                        } else if (sVar.m4371d() >= iM4383e) {
                            sVar.m4365a(iM4383e - 1);
                            sVar.m4361a(i2 - i4, i - i8);
                            i3 = i8;
                            int i14 = iMo3453b;
                            i6 = iMo3433a;
                            i5 = i14;
                        } else {
                            sVar.m4361a(i2 - i4, i - i8);
                            i3 = i8;
                            int i122 = iMo3453b;
                            i6 = iMo3433a;
                            i5 = i122;
                        }
                    }
                } else {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                }
                if (!C0484av.this.f3267o.isEmpty()) {
                    C0484av.this.invalidate();
                }
                if (C0484av.this.getOverScrollMode() != 2) {
                    C0484av.this.m4096c(i2, i);
                }
                if (!C0484av.this.m4077a(i6, i5, i4, i3, (int[]) null, 1) && (i4 != 0 || i3 != 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i4 != currX) {
                        i7 = i4 < 0 ? -currVelocity : i4 > 0 ? currVelocity : 0;
                    } else {
                        i7 = 0;
                    }
                    if (i3 == currY) {
                        currVelocity = 0;
                    } else if (i3 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i3 <= 0) {
                        currVelocity = 0;
                    }
                    if (C0484av.this.getOverScrollMode() != 2) {
                        C0484av.this.m4101d(i7, currVelocity);
                    }
                    if ((i7 != 0 || i4 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i3 == currY || overScroller.getFinalY() == 0)) {
                        overScroller.abortAnimation();
                    }
                }
                if (i6 != 0 || i5 != 0) {
                    C0484av.this.m4119i(i6, i5);
                }
                if (!C0484av.this.awakenScrollBars()) {
                    C0484av.this.invalidate();
                }
                boolean z = (i2 == 0 && i == 0) || (i2 != 0 && C0484av.this.f3265m.mo3515d() && i6 == i2) || (i != 0 && C0484av.this.f3265m.mo3518e() && i5 == i);
                if (overScroller.isFinished() || !(z || C0484av.this.m4116h(1))) {
                    C0484av.this.setScrollState(0);
                    if (C0484av.f3201K) {
                        C0484av.this.f3208A.m3922a();
                    }
                    C0484av.this.m4110g(1);
                } else {
                    m4390a();
                    if (C0484av.this.f3278z != null) {
                        C0484av.this.f3278z.m3919a(C0484av.this, i2, i);
                    }
                }
            }
            if (sVar != null) {
                if (sVar.m4369b()) {
                    sVar.m4361a(0, 0);
                }
                if (!this.f3379g) {
                    sVar.m4364a();
                }
            }
            m4389d();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.av$w */
    public static abstract class w {

        /* JADX INFO: renamed from: o */
        private static final List<Object> f3380o = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        public final View f3381a;

        /* JADX INFO: renamed from: b */
        WeakReference<C0484av> f3382b;

        /* JADX INFO: renamed from: m */
        C0484av f3393m;

        /* JADX INFO: renamed from: n */
        private int f3394n;

        /* JADX INFO: renamed from: c */
        int f3383c = -1;

        /* JADX INFO: renamed from: d */
        int f3384d = -1;

        /* JADX INFO: renamed from: e */
        long f3385e = -1;

        /* JADX INFO: renamed from: f */
        int f3386f = -1;

        /* JADX INFO: renamed from: g */
        int f3387g = -1;

        /* JADX INFO: renamed from: h */
        w f3388h = null;

        /* JADX INFO: renamed from: i */
        w f3389i = null;

        /* JADX INFO: renamed from: j */
        List<Object> f3390j = null;

        /* JADX INFO: renamed from: k */
        List<Object> f3391k = null;

        /* JADX INFO: renamed from: p */
        private int f3395p = 0;

        /* JADX INFO: renamed from: q */
        private o f3396q = null;

        /* JADX INFO: renamed from: r */
        private boolean f3397r = false;

        /* JADX INFO: renamed from: s */
        private int f3398s = 0;

        /* JADX INFO: renamed from: l */
        int f3392l = -1;

        public w(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3381a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public boolean m4398A() {
            return (this.f3394n & 16) == 0 && C0246q.m1755b(this.f3381a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4401a(C0484av c0484av) {
            this.f3398s = C0246q.m1758d(this.f3381a);
            c0484av.m4080a(this, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m4405b(C0484av c0484av) {
            c0484av.m4080a(this, this.f3398s);
            this.f3398s = 0;
        }

        /* JADX INFO: renamed from: y */
        private void m4409y() {
            if (this.f3390j == null) {
                this.f3390j = new ArrayList();
                this.f3391k = Collections.unmodifiableList(this.f3390j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public boolean m4410z() {
            return (this.f3394n & 16) != 0;
        }

        /* JADX INFO: renamed from: a */
        void m4411a() {
            this.f3384d = -1;
            this.f3387g = -1;
        }

        /* JADX INFO: renamed from: a */
        void m4412a(int i, int i2) {
            this.f3394n = (this.f3394n & (i2 ^ (-1))) | (i & i2);
        }

        /* JADX INFO: renamed from: a */
        void m4413a(int i, int i2, boolean z) {
            m4420b(8);
            m4414a(i2, z);
            this.f3383c = i;
        }

        /* JADX INFO: renamed from: a */
        void m4414a(int i, boolean z) {
            if (this.f3384d == -1) {
                this.f3384d = this.f3383c;
            }
            if (this.f3387g == -1) {
                this.f3387g = this.f3383c;
            }
            if (z) {
                this.f3387g += i;
            }
            this.f3383c += i;
            if (this.f3381a.getLayoutParams() != null) {
                ((i) this.f3381a.getLayoutParams()).f3323e = true;
            }
        }

        /* JADX INFO: renamed from: a */
        void m4415a(o oVar, boolean z) {
            this.f3396q = oVar;
            this.f3397r = z;
        }

        /* JADX INFO: renamed from: a */
        void m4416a(Object obj) {
            if (obj == null) {
                m4420b(1024);
            } else if ((this.f3394n & 1024) == 0) {
                m4409y();
                this.f3390j.add(obj);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m4417a(boolean z) {
            this.f3395p = z ? this.f3395p - 1 : this.f3395p + 1;
            if (this.f3395p < 0) {
                this.f3395p = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && this.f3395p == 1) {
                this.f3394n |= 16;
            } else if (z && this.f3395p == 0) {
                this.f3394n &= -17;
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m4418a(int i) {
            return (this.f3394n & i) != 0;
        }

        /* JADX INFO: renamed from: b */
        void m4419b() {
            if (this.f3384d == -1) {
                this.f3384d = this.f3383c;
            }
        }

        /* JADX INFO: renamed from: b */
        void m4420b(int i) {
            this.f3394n |= i;
        }

        /* JADX INFO: renamed from: c */
        boolean m4421c() {
            return (this.f3394n & 128) != 0;
        }

        /* JADX INFO: renamed from: d */
        public final int m4422d() {
            return this.f3387g == -1 ? this.f3383c : this.f3387g;
        }

        /* JADX INFO: renamed from: e */
        public final int m4423e() {
            if (this.f3393m == null) {
                return -1;
            }
            return this.f3393m.m4097d(this);
        }

        /* JADX INFO: renamed from: f */
        public final int m4424f() {
            return this.f3384d;
        }

        /* JADX INFO: renamed from: g */
        public final long m4425g() {
            return this.f3385e;
        }

        /* JADX INFO: renamed from: h */
        public final int m4426h() {
            return this.f3386f;
        }

        /* JADX INFO: renamed from: i */
        boolean m4427i() {
            return this.f3396q != null;
        }

        /* JADX INFO: renamed from: j */
        void m4428j() {
            this.f3396q.m4343c(this);
        }

        /* JADX INFO: renamed from: k */
        boolean m4429k() {
            return (this.f3394n & 32) != 0;
        }

        /* JADX INFO: renamed from: l */
        void m4430l() {
            this.f3394n &= -33;
        }

        /* JADX INFO: renamed from: m */
        void m4431m() {
            this.f3394n &= -257;
        }

        /* JADX INFO: renamed from: n */
        boolean m4432n() {
            return (this.f3394n & 4) != 0;
        }

        /* JADX INFO: renamed from: o */
        boolean m4433o() {
            return (this.f3394n & 2) != 0;
        }

        /* JADX INFO: renamed from: p */
        boolean m4434p() {
            return (this.f3394n & 1) != 0;
        }

        /* JADX INFO: renamed from: q */
        boolean m4435q() {
            return (this.f3394n & 8) != 0;
        }

        /* JADX INFO: renamed from: r */
        boolean m4436r() {
            return (this.f3394n & 256) != 0;
        }

        /* JADX INFO: renamed from: s */
        boolean m4437s() {
            return (this.f3394n & 512) != 0 || m4432n();
        }

        /* JADX INFO: renamed from: t */
        void m4438t() {
            if (this.f3390j != null) {
                this.f3390j.clear();
            }
            this.f3394n &= -1025;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3383c + " id=" + this.f3385e + ", oldPos=" + this.f3384d + ", pLpos:" + this.f3387g);
            if (m4427i()) {
                sb.append(" scrap ").append(this.f3397r ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m4432n()) {
                sb.append(" invalid");
            }
            if (!m4434p()) {
                sb.append(" unbound");
            }
            if (m4433o()) {
                sb.append(" update");
            }
            if (m4435q()) {
                sb.append(" removed");
            }
            if (m4421c()) {
                sb.append(" ignored");
            }
            if (m4436r()) {
                sb.append(" tmpDetached");
            }
            if (!m4441w()) {
                sb.append(" not recyclable(" + this.f3395p + ")");
            }
            if (m4437s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3381a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        List<Object> m4439u() {
            return (this.f3394n & 1024) == 0 ? (this.f3390j == null || this.f3390j.size() == 0) ? f3380o : this.f3391k : f3380o;
        }

        /* JADX INFO: renamed from: v */
        void m4440v() {
            this.f3394n = 0;
            this.f3383c = -1;
            this.f3384d = -1;
            this.f3385e = -1L;
            this.f3387g = -1;
            this.f3395p = 0;
            this.f3388h = null;
            this.f3389i = null;
            m4438t();
            this.f3398s = 0;
            this.f3392l = -1;
            C0484av.m4050c(this);
        }

        /* JADX INFO: renamed from: w */
        public final boolean m4441w() {
            return (this.f3394n & 16) == 0 && !C0246q.m1755b(this.f3381a);
        }

        /* JADX INFO: renamed from: x */
        boolean m4442x() {
            return (this.f3394n & 2) != 0;
        }
    }

    static {
        f3205a = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        f3206b = Build.VERSION.SDK_INT >= 23;
        f3207c = Build.VERSION.SDK_INT >= 16;
        f3201K = Build.VERSION.SDK_INT >= 21;
        f3202L = Build.VERSION.SDK_INT <= 15;
        f3203M = Build.VERSION.SDK_INT <= 15;
        f3204N = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        f3198H = new Interpolator() { // from class: android.support.v7.widget.av.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };
    }

    public C0484av(Context context) {
        this(context, null);
    }

    public C0484av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0484av(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException {
        super(context, attributeSet, i2);
        boolean z = true;
        this.f3215O = new q();
        this.f3256d = new o();
        this.f3259g = new C0505bp();
        this.f3261i = new Runnable() { // from class: android.support.v7.widget.av.1
            @Override // java.lang.Runnable
            public void run() {
                if (!C0484av.this.f3271s || C0484av.this.isLayoutRequested()) {
                    return;
                }
                if (!C0484av.this.f3268p) {
                    C0484av.this.requestLayout();
                } else if (C0484av.this.f3273u) {
                    C0484av.this.f3272t = true;
                } else {
                    C0484av.this.m4099d();
                }
            }
        };
        this.f3262j = new Rect();
        this.f3217Q = new Rect();
        this.f3263k = new RectF();
        this.f3267o = new ArrayList<>();
        this.f3218R = new ArrayList<>();
        this.f3220T = 0;
        this.f3275w = false;
        this.f3231ab = 0;
        this.f3232ac = 0;
        this.f3276x = new C0469ag();
        this.f3237ah = 0;
        this.f3238ai = -1;
        this.f3248as = Float.MIN_VALUE;
        this.f3249at = Float.MIN_VALUE;
        this.f3250au = true;
        this.f3277y = new v();
        this.f3208A = f3201K ? new RunnableC0475am.a() : null;
        this.f3209B = new t();
        this.f3210C = false;
        this.f3211D = false;
        this.f3253ax = new f();
        this.f3212E = false;
        this.f3255az = new int[2];
        this.f3225aB = new int[2];
        this.f3226aC = new int[2];
        this.f3227aD = new int[2];
        this.f3214G = new ArrayList();
        this.f3228aE = new Runnable() { // from class: android.support.v7.widget.av.2
            @Override // java.lang.Runnable
            public void run() {
                if (C0484av.this.f3276x != null) {
                    C0484av.this.f3276x.mo3849a();
                }
                C0484av.this.f3212E = false;
            }
        };
        this.f3229aF = new C0505bp.b() { // from class: android.support.v7.widget.av.4
            @Override // android.support.v7.widget.C0505bp.b
            /* JADX INFO: renamed from: a */
            public void mo4139a(w wVar) {
                C0484av.this.f3265m.m4227a(wVar.f3381a, C0484av.this.f3256d);
            }

            @Override // android.support.v7.widget.C0505bp.b
            /* JADX INFO: renamed from: a */
            public void mo4140a(w wVar, e.c cVar, e.c cVar2) {
                C0484av.this.f3256d.m4343c(wVar);
                C0484av.this.m4089b(wVar, cVar, cVar2);
            }

            @Override // android.support.v7.widget.C0505bp.b
            /* JADX INFO: renamed from: b */
            public void mo4141b(w wVar, e.c cVar, e.c cVar2) {
                C0484av.this.m4074a(wVar, cVar, cVar2);
            }

            @Override // android.support.v7.widget.C0505bp.b
            /* JADX INFO: renamed from: c */
            public void mo4142c(w wVar, e.c cVar, e.c cVar2) {
                wVar.m4417a(false);
                if (C0484av.this.f3275w) {
                    if (C0484av.this.f3276x.mo4172a(wVar, wVar, cVar, cVar2)) {
                        C0484av.this.m4129p();
                    }
                } else if (C0484av.this.f3276x.mo4174c(wVar, cVar, cVar2)) {
                    C0484av.this.m4129p();
                }
            }
        };
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3200J, i2, 0);
            this.f3260h = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f3260h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3244ao = viewConfiguration.getScaledTouchSlop();
        this.f3248as = C0247r.m1831a(viewConfiguration, context);
        this.f3249at = C0247r.m1832b(viewConfiguration, context);
        this.f3246aq = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3247ar = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3276x.m4170a(this.f3253ax);
        m4085b();
        m4017A();
        if (C0246q.m1758d(this) == 0) {
            C0246q.m1738a((View) this, 1);
        }
        this.f3223W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0485aw(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0386a.b.RecyclerView, i2, 0);
            String string = typedArrayObtainStyledAttributes2.getString(C0386a.b.RecyclerView_layoutManager);
            if (typedArrayObtainStyledAttributes2.getInt(C0386a.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f3270r = typedArrayObtainStyledAttributes2.getBoolean(C0386a.b.RecyclerView_fastScrollEnabled, false);
            if (this.f3270r) {
                m4067a((StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(C0386a.b.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes2.getDrawable(C0386a.b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(C0386a.b.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes2.getDrawable(C0386a.b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            typedArrayObtainStyledAttributes2.recycle();
            m4036a(context, string, attributeSet, i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3199I, i2, 0);
                z = typedArrayObtainStyledAttributes3.getBoolean(0, true);
                typedArrayObtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: A */
    private void m4017A() {
        this.f3258f = new C0466ad(new C0466ad.b() { // from class: android.support.v7.widget.av.5
            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: a */
            public int mo3801a() {
                return C0484av.this.getChildCount();
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: a */
            public int mo3802a(View view) {
                return C0484av.this.indexOfChild(view);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: a */
            public void mo3803a(int i2) {
                View childAt = C0484av.this.getChildAt(i2);
                if (childAt != null) {
                    C0484av.this.m4123k(childAt);
                    childAt.clearAnimation();
                }
                C0484av.this.removeViewAt(i2);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: a */
            public void mo3804a(View view, int i2) {
                C0484av.this.addView(view, i2);
                C0484av.this.m4125l(view);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: a */
            public void mo3805a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                w wVarM4052e = C0484av.m4052e(view);
                if (wVarM4052e != null) {
                    if (!wVarM4052e.m4436r() && !wVarM4052e.m4421c()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + wVarM4052e + C0484av.this.m4061a());
                    }
                    wVarM4052e.m4431m();
                }
                C0484av.this.attachViewToParent(view, i2, layoutParams);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: b */
            public w mo3806b(View view) {
                return C0484av.m4052e(view);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: b */
            public View mo3807b(int i2) {
                return C0484av.this.getChildAt(i2);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: b */
            public void mo3808b() {
                int iMo3801a = mo3801a();
                for (int i2 = 0; i2 < iMo3801a; i2++) {
                    View viewMo3807b = mo3807b(i2);
                    C0484av.this.m4123k(viewMo3807b);
                    viewMo3807b.clearAnimation();
                }
                C0484av.this.removeAllViews();
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: c */
            public void mo3809c(int i2) {
                w wVarM4052e;
                View viewMo3807b = mo3807b(i2);
                if (viewMo3807b != null && (wVarM4052e = C0484av.m4052e(viewMo3807b)) != null) {
                    if (wVarM4052e.m4436r() && !wVarM4052e.m4421c()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + wVarM4052e + C0484av.this.m4061a());
                    }
                    wVarM4052e.m4420b(256);
                }
                C0484av.this.detachViewFromParent(i2);
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: c */
            public void mo3810c(View view) {
                w wVarM4052e = C0484av.m4052e(view);
                if (wVarM4052e != null) {
                    wVarM4052e.m4401a(C0484av.this);
                }
            }

            @Override // android.support.v7.widget.C0466ad.b
            /* JADX INFO: renamed from: d */
            public void mo3811d(View view) {
                w wVarM4052e = C0484av.m4052e(view);
                if (wVarM4052e != null) {
                    wVarM4052e.m4405b(C0484av.this);
                }
            }
        });
    }

    /* JADX INFO: renamed from: B */
    private boolean m4018B() {
        int iM3782b = this.f3258f.m3782b();
        for (int i2 = 0; i2 < iM3782b; i2++) {
            w wVarM4052e = m4052e(this.f3258f.m3784b(i2));
            if (wVarM4052e != null && !wVarM4052e.m4421c() && wVarM4052e.m4442x()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    private void m4019C() {
        this.f3277y.m4396b();
        if (this.f3265m != null) {
            this.f3265m.m4210G();
        }
    }

    /* JADX INFO: renamed from: D */
    private void m4020D() {
        boolean zIsFinished = false;
        if (this.f3233ad != null) {
            this.f3233ad.onRelease();
            zIsFinished = this.f3233ad.isFinished();
        }
        if (this.f3234ae != null) {
            this.f3234ae.onRelease();
            zIsFinished |= this.f3234ae.isFinished();
        }
        if (this.f3235af != null) {
            this.f3235af.onRelease();
            zIsFinished |= this.f3235af.isFinished();
        }
        if (this.f3236ag != null) {
            this.f3236ag.onRelease();
            zIsFinished |= this.f3236ag.isFinished();
        }
        if (zIsFinished) {
            C0246q.m1756c(this);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m4021E() {
        if (this.f3239aj != null) {
            this.f3239aj.clear();
        }
        m4110g(0);
        m4020D();
    }

    /* JADX INFO: renamed from: F */
    private void m4022F() {
        m4021E();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: G */
    private void m4023G() {
        int i2 = this.f3222V;
        this.f3222V = 0;
        if (i2 == 0 || !m4127n()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C0223a.m1610a(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: H */
    private boolean m4024H() {
        return this.f3276x != null && this.f3265m.mo3456b();
    }

    /* JADX INFO: renamed from: I */
    private void m4025I() {
        if (this.f3275w) {
            this.f3257e.m4632a();
            this.f3265m.mo3447a(this);
        }
        if (m4024H()) {
            this.f3257e.m4637b();
        } else {
            this.f3257e.m4641e();
        }
        boolean z = this.f3210C || this.f3211D;
        this.f3209B.f3364i = this.f3271s && this.f3276x != null && (this.f3275w || z || this.f3265m.f3310u) && (!this.f3275w || this.f3264l.m4162d());
        this.f3209B.f3365j = this.f3209B.f3364i && z && !this.f3275w && m4024H();
    }

    /* JADX INFO: renamed from: J */
    private void m4026J() {
        View focusedChild = (this.f3250au && hasFocus() && this.f3264l != null) ? getFocusedChild() : null;
        w wVarM4098d = focusedChild == null ? null : m4098d(focusedChild);
        if (wVarM4098d == null) {
            m4027K();
            return;
        }
        this.f3209B.f3367l = this.f3264l.m4162d() ? wVarM4098d.m4425g() : -1L;
        this.f3209B.f3366k = this.f3275w ? -1 : wVarM4098d.m4435q() ? wVarM4098d.f3384d : wVarM4098d.m4423e();
        this.f3209B.f3368m = m4056m(wVarM4098d.f3381a);
    }

    /* JADX INFO: renamed from: K */
    private void m4027K() {
        this.f3209B.f3367l = -1L;
        this.f3209B.f3366k = -1;
        this.f3209B.f3368m = -1;
    }

    /* JADX INFO: renamed from: L */
    private View m4028L() {
        int i2 = this.f3209B.f3366k != -1 ? this.f3209B.f3366k : 0;
        int iM4383e = this.f3209B.m4383e();
        for (int i3 = i2; i3 < iM4383e; i3++) {
            w wVarM4083b = m4083b(i3);
            if (wVarM4083b == null) {
                break;
            }
            if (wVarM4083b.f3381a.hasFocusable()) {
                return wVarM4083b.f3381a;
            }
        }
        for (int iMin = Math.min(iM4383e, i2) - 1; iMin >= 0; iMin--) {
            w wVarM4083b2 = m4083b(iMin);
            if (wVarM4083b2 == null) {
                return null;
            }
            if (wVarM4083b2.f3381a.hasFocusable()) {
                return wVarM4083b2.f3381a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    private void m4029M() {
        View viewFindViewById;
        View viewM4028L = null;
        if (!this.f3250au || this.f3264l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f3203M || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f3258f.m3787c(focusedChild)) {
                    return;
                }
            } else if (this.f3258f.m3782b() == 0) {
                requestFocus();
                return;
            }
        }
        w wVarM4060a = (this.f3209B.f3367l == -1 || !this.f3264l.m4162d()) ? null : m4060a(this.f3209B.f3367l);
        if (wVarM4060a != null && !this.f3258f.m3787c(wVarM4060a.f3381a) && wVarM4060a.f3381a.hasFocusable()) {
            viewM4028L = wVarM4060a.f3381a;
        } else if (this.f3258f.m3782b() > 0) {
            viewM4028L = m4028L();
        }
        if (viewM4028L != null) {
            if (this.f3209B.f3368m == -1 || (viewFindViewById = viewM4028L.findViewById(this.f3209B.f3368m)) == null || !viewFindViewById.isFocusable()) {
                viewFindViewById = viewM4028L;
            }
            viewFindViewById.requestFocus();
        }
    }

    /* JADX INFO: renamed from: N */
    private void m4030N() {
        this.f3209B.m4377a(1);
        m4072a(this.f3209B);
        this.f3209B.f3363h = false;
        m4102e();
        this.f3259g.m4563a();
        m4124l();
        m4025I();
        m4026J();
        this.f3209B.f3362g = this.f3209B.f3364i && this.f3211D;
        this.f3211D = false;
        this.f3210C = false;
        this.f3209B.f3361f = this.f3209B.f3365j;
        this.f3209B.f3359d = this.f3264l.mo191a();
        m4044a(this.f3255az);
        if (this.f3209B.f3364i) {
            int iM3782b = this.f3258f.m3782b();
            for (int i2 = 0; i2 < iM3782b; i2++) {
                w wVarM4052e = m4052e(this.f3258f.m3784b(i2));
                if (!wVarM4052e.m4421c() && (!wVarM4052e.m4432n() || this.f3264l.m4162d())) {
                    this.f3259g.m4565a(wVarM4052e, this.f3276x.m4169a(this.f3209B, wVarM4052e, e.m4167e(wVarM4052e), wVarM4052e.m4439u()));
                    if (this.f3209B.f3362g && wVarM4052e.m4442x() && !wVarM4052e.m4435q() && !wVarM4052e.m4421c() && !wVarM4052e.m4432n()) {
                        this.f3259g.m4564a(m4058a(wVarM4052e), wVarM4052e);
                    }
                }
            }
        }
        if (this.f3209B.f3365j) {
            m4132s();
            boolean z = this.f3209B.f3360e;
            this.f3209B.f3360e = false;
            this.f3265m.mo3457c(this.f3256d, this.f3209B);
            this.f3209B.f3360e = z;
            for (int i3 = 0; i3 < this.f3258f.m3782b(); i3++) {
                w wVarM4052e2 = m4052e(this.f3258f.m3784b(i3));
                if (!wVarM4052e2.m4421c() && !this.f3259g.m4573d(wVarM4052e2)) {
                    int iM4167e = e.m4167e(wVarM4052e2);
                    boolean zM4418a = wVarM4052e2.m4418a(8192);
                    if (!zM4418a) {
                        iM4167e |= 4096;
                    }
                    e.c cVarM4169a = this.f3276x.m4169a(this.f3209B, wVarM4052e2, iM4167e, wVarM4052e2.m4439u());
                    if (zM4418a) {
                        m4073a(wVarM4052e2, cVarM4169a);
                    } else {
                        this.f3259g.m4570b(wVarM4052e2, cVarM4169a);
                    }
                }
            }
            m4133t();
        } else {
            m4133t();
        }
        m4126m();
        m4076a(false);
        this.f3209B.f3358c = 2;
    }

    /* JADX INFO: renamed from: O */
    private void m4031O() {
        m4102e();
        m4124l();
        this.f3209B.m4377a(6);
        this.f3257e.m4641e();
        this.f3209B.f3359d = this.f3264l.mo191a();
        this.f3209B.f3357b = 0;
        this.f3209B.f3361f = false;
        this.f3265m.mo3457c(this.f3256d, this.f3209B);
        this.f3209B.f3360e = false;
        this.f3216P = null;
        this.f3209B.f3364i = this.f3209B.f3364i && this.f3276x != null;
        this.f3209B.f3358c = 4;
        m4126m();
        m4076a(false);
    }

    /* JADX INFO: renamed from: P */
    private void m4032P() {
        this.f3209B.m4377a(4);
        m4102e();
        m4124l();
        this.f3209B.f3358c = 1;
        if (this.f3209B.f3364i) {
            for (int iM3782b = this.f3258f.m3782b() - 1; iM3782b >= 0; iM3782b--) {
                w wVarM4052e = m4052e(this.f3258f.m3784b(iM3782b));
                if (!wVarM4052e.m4421c()) {
                    long jM4058a = m4058a(wVarM4052e);
                    e.c cVarM4168a = this.f3276x.m4168a(this.f3209B, wVarM4052e);
                    w wVarM4562a = this.f3259g.m4562a(jM4058a);
                    if (wVarM4562a == null || wVarM4562a.m4421c()) {
                        this.f3259g.m4572c(wVarM4052e, cVarM4168a);
                    } else {
                        boolean zM4567a = this.f3259g.m4567a(wVarM4562a);
                        boolean zM4567a2 = this.f3259g.m4567a(wVarM4052e);
                        if (zM4567a && wVarM4562a == wVarM4052e) {
                            this.f3259g.m4572c(wVarM4052e, cVarM4168a);
                        } else {
                            e.c cVarM4568b = this.f3259g.m4568b(wVarM4562a);
                            this.f3259g.m4572c(wVarM4052e, cVarM4168a);
                            e.c cVarM4571c = this.f3259g.m4571c(wVarM4052e);
                            if (cVarM4568b == null) {
                                m4035a(jM4058a, wVarM4052e, wVarM4562a);
                            } else {
                                m4038a(wVarM4562a, wVarM4052e, cVarM4568b, cVarM4571c, zM4567a, zM4567a2);
                            }
                        }
                    }
                }
            }
            this.f3259g.m4566a(this.f3229aF);
        }
        this.f3265m.m4241b(this.f3256d);
        this.f3209B.f3356a = this.f3209B.f3359d;
        this.f3275w = false;
        this.f3209B.f3364i = false;
        this.f3209B.f3365j = false;
        this.f3265m.f3310u = false;
        if (this.f3256d.f3332b != null) {
            this.f3256d.f3332b.clear();
        }
        if (this.f3265m.f3314y) {
            this.f3265m.f3313x = 0;
            this.f3265m.f3314y = false;
            this.f3256d.m4336b();
        }
        this.f3265m.mo3445a(this.f3209B);
        m4126m();
        m4076a(false);
        this.f3259g.m4563a();
        if (m4055k(this.f3255az[0], this.f3255az[1])) {
            m4119i(0, 0);
        }
        m4029M();
        m4027K();
    }

    /* JADX INFO: renamed from: a */
    private String m4033a(Context context, String str) {
        return str.charAt(0) == '.' ? context.getPackageName() + str : !str.contains(".") ? C0484av.class.getPackage().getName() + '.' + str : str;
    }

    /* JADX INFO: renamed from: a */
    private void m4034a(float f2, float f3, float f4, float f5) {
        boolean z = true;
        boolean z2 = false;
        if (f3 < 0.0f) {
            m4109g();
            C0323g.m2450a(this.f3233ad, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
            z2 = true;
        } else if (f3 > 0.0f) {
            m4113h();
            C0323g.m2450a(this.f3235af, f3 / getWidth(), f4 / getHeight());
            z2 = true;
        }
        if (f5 < 0.0f) {
            m4118i();
            C0323g.m2450a(this.f3234ae, (-f5) / getHeight(), f2 / getWidth());
        } else if (f5 > 0.0f) {
            m4120j();
            C0323g.m2450a(this.f3236ag, f5 / getHeight(), 1.0f - (f2 / getWidth()));
        } else {
            z = z2;
        }
        if (!z && f3 == 0.0f && f5 == 0.0f) {
            return;
        }
        C0246q.m1756c(this);
    }

    /* JADX INFO: renamed from: a */
    private void m4035a(long j2, w wVar, w wVar2) {
        int iM3782b = this.f3258f.m3782b();
        for (int i2 = 0; i2 < iM3782b; i2++) {
            w wVarM4052e = m4052e(this.f3258f.m3784b(i2));
            if (wVarM4052e != wVar && m4058a(wVarM4052e) == j2) {
                if (this.f3264l != null && this.f3264l.m4162d()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + wVarM4052e + " \n View Holder 2:" + wVar + m4061a());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + wVarM4052e + " \n View Holder 2:" + wVar + m4061a());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + wVar2 + " cannot be found but it is necessary for " + wVar + m4061a());
    }

    /* JADX INFO: renamed from: a */
    private void m4036a(Context context, String str, AttributeSet attributeSet, int i2, int i3) throws NoSuchMethodException {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM4033a = m4033a(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strM4033a).asSubclass(h.class);
                try {
                    Constructor constructor2 = clsAsSubclass.getConstructor(f3204N);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    constructor = constructor2;
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM4033a, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((h) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM4033a, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM4033a, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM4033a, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM4033a, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM4033a, e8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4037a(a aVar, boolean z, boolean z2) {
        if (this.f3264l != null) {
            this.f3264l.m4155b(this.f3215O);
            this.f3264l.m4157b(this);
        }
        if (!z || z2) {
            m4094c();
        }
        this.f3257e.m4632a();
        a aVar2 = this.f3264l;
        this.f3264l = aVar;
        if (aVar != null) {
            aVar.m4152a(this.f3215O);
            aVar.m4154a(this);
        }
        if (this.f3265m != null) {
            this.f3265m.m4215a(aVar2, this.f3264l);
        }
        this.f3256d.m4328a(aVar2, this.f3264l, z);
        this.f3209B.f3360e = true;
        m4134u();
    }

    /* JADX INFO: renamed from: a */
    private void m4038a(w wVar, w wVar2, e.c cVar, e.c cVar2, boolean z, boolean z2) {
        wVar.m4417a(false);
        if (z) {
            m4053e(wVar);
        }
        if (wVar != wVar2) {
            if (z2) {
                m4053e(wVar2);
            }
            wVar.f3388h = wVar2;
            m4053e(wVar);
            this.f3256d.m4343c(wVar);
            wVar2.m4417a(false);
            wVar2.f3389i = wVar;
        }
        if (this.f3276x.mo4172a(wVar, wVar2, cVar, cVar2)) {
            m4129p();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m4042a(View view, Rect rect) {
        i iVar = (i) view.getLayoutParams();
        Rect rect2 = iVar.f3322d;
        rect.set((view.getLeft() - rect2.left) - iVar.leftMargin, (view.getTop() - rect2.top) - iVar.topMargin, view.getRight() + rect2.right + iVar.rightMargin, iVar.bottomMargin + rect2.bottom + view.getBottom());
    }

    /* JADX INFO: renamed from: a */
    private void m4043a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3262j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof i) {
            i iVar = (i) layoutParams;
            if (!iVar.f3323e) {
                Rect rect = iVar.f3322d;
                this.f3262j.left -= rect.left;
                this.f3262j.right += rect.right;
                this.f3262j.top -= rect.top;
                Rect rect2 = this.f3262j;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3262j);
            offsetRectIntoDescendantCoords(view, this.f3262j);
        }
        this.f3265m.m4234a(this, view, this.f3262j, !this.f3271s, view2 == null);
    }

    /* JADX INFO: renamed from: a */
    private void m4044a(int[] iArr) {
        int iM3782b = this.f3258f.m3782b();
        if (iM3782b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        while (i4 < iM3782b) {
            w wVarM4052e = m4052e(this.f3258f.m3784b(i4));
            if (!wVarM4052e.m4421c()) {
                int iM4422d = wVarM4052e.m4422d();
                if (iM4422d < i2) {
                    i2 = iM4422d;
                }
                if (iM4422d > i3) {
                    i3 = iM4422d;
                }
            }
            i4++;
            i2 = i2;
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4045a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f3219S = null;
        }
        int size = this.f3218R.size();
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = this.f3218R.get(i2);
            if (lVar.mo3899a(this, motionEvent) && action != 3) {
                this.f3219S = lVar;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4046a(View view, View view2, int i2) {
        byte b2 = -1;
        boolean z = false;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        this.f3262j.set(0, 0, view.getWidth(), view.getHeight());
        this.f3217Q.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3262j);
        offsetDescendantRectToMyCoords(view2, this.f3217Q);
        int i3 = this.f3265m.m4284s() == 1 ? -1 : 1;
        int i4 = ((this.f3262j.left < this.f3217Q.left || this.f3262j.right <= this.f3217Q.left) && this.f3262j.right < this.f3217Q.right) ? 1 : ((this.f3262j.right > this.f3217Q.right || this.f3262j.left >= this.f3217Q.right) && this.f3262j.left > this.f3217Q.left) ? -1 : 0;
        if ((this.f3262j.top < this.f3217Q.top || this.f3262j.bottom <= this.f3217Q.top) && this.f3262j.bottom < this.f3217Q.bottom) {
            b2 = 1;
        } else if ((this.f3262j.bottom <= this.f3217Q.bottom && this.f3262j.top < this.f3217Q.bottom) || this.f3262j.top <= this.f3217Q.top) {
            b2 = 0;
        }
        switch (i2) {
            case 1:
                if (b2 < 0 || (b2 == 0 && i3 * i4 <= 0)) {
                    z = true;
                }
                return z;
            case 2:
                if (b2 > 0 || (b2 == 0 && i3 * i4 >= 0)) {
                    z = true;
                }
                return z;
            case 17:
                return i4 < 0;
            case 33:
                return b2 < 0;
            case 66:
                return i4 > 0;
            case 130:
                return b2 > 0;
            default:
                throw new IllegalArgumentException("Invalid direction: " + i2 + m4061a());
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m4049b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f3219S != null) {
            if (action != 0) {
                this.f3219S.mo3900b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f3219S = null;
                }
                return true;
            }
            this.f3219S = null;
        }
        if (action != 0) {
            int size = this.f3218R.size();
            for (int i2 = 0; i2 < size; i2++) {
                l lVar = this.f3218R.get(i2);
                if (lVar.mo3899a(this, motionEvent)) {
                    this.f3219S = lVar;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    static void m4050c(w wVar) {
        if (wVar.f3382b != null) {
            C0484av c0484av = wVar.f3382b.get();
            while (c0484av != null) {
                if (c0484av == wVar.f3381a) {
                    return;
                }
                Object parent = c0484av.getParent();
                c0484av = parent instanceof View ? (View) parent : null;
            }
            wVar.f3382b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m4051c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3238ai) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f3238ai = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.f3242am = x;
            this.f3240ak = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.f3243an = y;
            this.f3241al = y;
        }
    }

    /* JADX INFO: renamed from: e */
    static w m4052e(View view) {
        if (view == null) {
            return null;
        }
        return ((i) view.getLayoutParams()).f3321c;
    }

    /* JADX INFO: renamed from: e */
    private void m4053e(w wVar) {
        View view = wVar.f3381a;
        boolean z = view.getParent() == this;
        this.f3256d.m4343c(m4084b(view));
        if (wVar.m4436r()) {
            this.f3258f.m3779a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.f3258f.m3789d(view);
        } else {
            this.f3258f.m3781a(view, true);
        }
    }

    private C0240k getScrollingChildHelper() {
        if (this.f3224aA == null) {
            this.f3224aA = new C0240k(this);
        }
        return this.f3224aA;
    }

    /* JADX INFO: renamed from: j */
    static C0484av m4054j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C0484av) {
            return (C0484av) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0484av c0484avM4054j = m4054j(viewGroup.getChildAt(i2));
            if (c0484avM4054j != null) {
                return c0484avM4054j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4055k(int i2, int i3) {
        m4044a(this.f3255az);
        return (this.f3255az[0] == i2 && this.f3255az[1] == i3) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private int m4056m(View view) {
        int i2;
        int id = view.getId();
        while (true) {
            i2 = id;
            View view2 = view;
            if (view2.isFocused() || !(view2 instanceof ViewGroup) || !view2.hasFocus()) {
                break;
            }
            view = ((ViewGroup) view2).getFocusedChild();
            id = view.getId() != -1 ? view.getId() : i2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    long m4058a(w wVar) {
        return this.f3264l.m4162d() ? wVar.m4425g() : wVar.f3383c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    w m4059a(int i2, boolean z) {
        int iM3785c = this.f3258f.m3785c();
        w wVar = null;
        for (int i3 = 0; i3 < iM3785c; i3++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i3));
            if (wVarM4052e != null && !wVarM4052e.m4435q()) {
                if (z) {
                    if (wVarM4052e.f3383c != i2) {
                        continue;
                    } else {
                        if (!this.f3258f.m3787c(wVarM4052e.f3381a)) {
                            return wVarM4052e;
                        }
                        wVar = wVarM4052e;
                    }
                } else if (wVarM4052e.m4422d() != i2) {
                    continue;
                }
            }
        }
        return wVar;
    }

    /* JADX INFO: renamed from: a */
    public w m4060a(long j2) {
        if (this.f3264l == null || !this.f3264l.m4162d()) {
            return null;
        }
        int iM3785c = this.f3258f.m3785c();
        int i2 = 0;
        w wVar = null;
        while (i2 < iM3785c) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i2));
            if (wVarM4052e == null || wVarM4052e.m4435q() || wVarM4052e.m4425g() != j2) {
                wVarM4052e = wVar;
            } else if (!this.f3258f.m3787c(wVarM4052e.f3381a)) {
                return wVarM4052e;
            }
            i2++;
            wVar = wVarM4052e;
        }
        return wVar;
    }

    /* JADX INFO: renamed from: a */
    String m4061a() {
        return " " + super.toString() + ", adapter:" + this.f3264l + ", layout:" + this.f3265m + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: a */
    void m4062a(int i2) {
        if (this.f3265m == null) {
            return;
        }
        this.f3265m.mo3514d(i2);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: a */
    public void m4063a(int i2, int i3) {
        m4064a(i2, i3, (Interpolator) null);
    }

    /* JADX INFO: renamed from: a */
    public void m4064a(int i2, int i3, Interpolator interpolator) {
        if (this.f3265m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3273u) {
            return;
        }
        if (!this.f3265m.mo3515d()) {
            i2 = 0;
        }
        int i4 = this.f3265m.mo3518e() ? i3 : 0;
        if (i2 == 0 && i4 == 0) {
            return;
        }
        this.f3277y.m4395a(i2, i4, interpolator);
    }

    /* JADX INFO: renamed from: a */
    void m4065a(int i2, int i3, Object obj) {
        int iM3785c = this.f3258f.m3785c();
        int i4 = i2 + i3;
        for (int i5 = 0; i5 < iM3785c; i5++) {
            View viewM3788d = this.f3258f.m3788d(i5);
            w wVarM4052e = m4052e(viewM3788d);
            if (wVarM4052e != null && !wVarM4052e.m4421c() && wVarM4052e.f3383c >= i2 && wVarM4052e.f3383c < i4) {
                wVarM4052e.m4420b(2);
                wVarM4052e.m4416a(obj);
                ((i) viewM3788d.getLayoutParams()).f3323e = true;
            }
        }
        this.f3256d.m4342c(i2, i3);
    }

    /* JADX INFO: renamed from: a */
    void m4066a(int i2, int i3, boolean z) {
        int i4 = i2 + i3;
        int iM3785c = this.f3258f.m3785c();
        for (int i5 = 0; i5 < iM3785c; i5++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i5));
            if (wVarM4052e != null && !wVarM4052e.m4421c()) {
                if (wVarM4052e.f3383c >= i4) {
                    wVarM4052e.m4414a(-i3, z);
                    this.f3209B.f3360e = true;
                } else if (wVarM4052e.f3383c >= i2) {
                    wVarM4052e.m4413a(i2 - 1, -i3, z);
                    this.f3209B.f3360e = true;
                }
            }
        }
        this.f3256d.m4327a(i2, i3, z);
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    void m4067a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m4061a());
        }
        Resources resources = getContext().getResources();
        new C0472aj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0386a.a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0386a.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0386a.a.fastscroll_margin));
    }

    /* JADX INFO: renamed from: a */
    public void m4068a(g gVar) {
        m4069a(gVar, -1);
    }

    /* JADX INFO: renamed from: a */
    public void m4069a(g gVar, int i2) {
        if (this.f3265m != null) {
            this.f3265m.mo3504a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3267o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.f3267o.add(gVar);
        } else {
            this.f3267o.add(i2, gVar);
        }
        m4131r();
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public void m4070a(l lVar) {
        this.f3218R.add(lVar);
    }

    /* JADX INFO: renamed from: a */
    public void m4071a(m mVar) {
        if (this.f3252aw == null) {
            this.f3252aw = new ArrayList();
        }
        this.f3252aw.add(mVar);
    }

    /* JADX INFO: renamed from: a */
    final void m4072a(t tVar) {
        if (getScrollState() != 2) {
            tVar.f3369n = 0;
            tVar.f3370o = 0;
        } else {
            OverScroller overScroller = this.f3277y.f3377e;
            tVar.f3369n = overScroller.getFinalX() - overScroller.getCurrX();
            tVar.f3370o = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX INFO: renamed from: a */
    void m4073a(w wVar, e.c cVar) {
        wVar.m4412a(0, 8192);
        if (this.f3209B.f3362g && wVar.m4442x() && !wVar.m4435q() && !wVar.m4421c()) {
            this.f3259g.m4564a(m4058a(wVar), wVar);
        }
        this.f3259g.m4565a(wVar, cVar);
    }

    /* JADX INFO: renamed from: a */
    void m4074a(w wVar, e.c cVar, e.c cVar2) {
        wVar.m4417a(false);
        if (this.f3276x.mo4173b(wVar, cVar, cVar2)) {
            m4129p();
        }
    }

    /* JADX INFO: renamed from: a */
    void m4075a(String str) {
        if (m4128o()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m4061a());
        }
        if (this.f3232ac > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m4061a()));
        }
    }

    /* JADX INFO: renamed from: a */
    void m4076a(boolean z) {
        if (this.f3220T < 1) {
            this.f3220T = 1;
        }
        if (!z) {
            this.f3272t = false;
        }
        if (this.f3220T == 1) {
            if (z && this.f3272t && !this.f3273u && this.f3265m != null && this.f3264l != null) {
                m4130q();
            }
            if (!this.f3273u) {
                this.f3272t = false;
            }
        }
        this.f3220T--;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4077a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().m1722a(i2, i3, i4, i5, iArr, i6);
    }

    /* JADX INFO: renamed from: a */
    boolean m4078a(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iMo3433a;
        int iMo3453b;
        int i8;
        m4099d();
        if (this.f3264l != null) {
            m4102e();
            m4124l();
            C0203e.m1472a("RV Scroll");
            m4072a(this.f3209B);
            if (i2 != 0) {
                iMo3433a = this.f3265m.mo3433a(i2, this.f3256d, this.f3209B);
                i7 = i2 - iMo3433a;
            } else {
                iMo3433a = 0;
                i7 = 0;
            }
            if (i3 != 0) {
                iMo3453b = this.f3265m.mo3453b(i3, this.f3256d, this.f3209B);
                i8 = i3 - iMo3453b;
            } else {
                iMo3453b = 0;
                i8 = 0;
            }
            C0203e.m1471a();
            m4137x();
            m4126m();
            m4076a(false);
            i6 = i8;
            i5 = iMo3433a;
            i4 = iMo3453b;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f3267o.isEmpty()) {
            invalidate();
        }
        if (m4077a(i5, i4, i7, i6, this.f3225aB, 0)) {
            this.f3242am -= this.f3225aB[0];
            this.f3243an -= this.f3225aB[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.f3225aB[0], this.f3225aB[1]);
            }
            int[] iArr = this.f3227aD;
            iArr[0] = iArr[0] + this.f3225aB[0];
            int[] iArr2 = this.f3227aD;
            iArr2[1] = iArr2[1] + this.f3225aB[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0237h.m1712a(motionEvent, 8194)) {
                m4034a(motionEvent.getX(), i7, motionEvent.getY(), i6);
            }
            m4096c(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            m4119i(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i4 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4079a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m1724a(i2, i3, iArr, iArr2, i4);
    }

    /* JADX INFO: renamed from: a */
    boolean m4080a(w wVar, int i2) {
        if (!m4128o()) {
            C0246q.m1738a(wVar.f3381a, i2);
            return true;
        }
        wVar.f3392l = i2;
        this.f3214G.add(wVar);
        return false;
    }

    /* JADX INFO: renamed from: a */
    boolean m4081a(View view) {
        m4102e();
        boolean zM3792f = this.f3258f.m3792f(view);
        if (zM3792f) {
            w wVarM4052e = m4052e(view);
            this.f3256d.m4343c(wVarM4052e);
            this.f3256d.m4338b(wVarM4052e);
        }
        m4076a(!zM3792f);
        return zM3792f;
    }

    /* JADX INFO: renamed from: a */
    boolean m4082a(AccessibilityEvent accessibilityEvent) {
        if (!m4128o()) {
            return false;
        }
        int iM1609a = accessibilityEvent != null ? C0223a.m1609a(accessibilityEvent) : 0;
        this.f3222V = (iM1609a != 0 ? iM1609a : 0) | this.f3222V;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (this.f3265m == null || !this.f3265m.m4236a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public w m4083b(int i2) {
        if (this.f3275w) {
            return null;
        }
        int iM3785c = this.f3258f.m3785c();
        int i3 = 0;
        w wVar = null;
        while (i3 < iM3785c) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i3));
            if (wVarM4052e == null || wVarM4052e.m4435q() || m4097d(wVarM4052e) != i2) {
                wVarM4052e = wVar;
            } else if (!this.f3258f.m3787c(wVarM4052e.f3381a)) {
                return wVarM4052e;
            }
            i3++;
            wVar = wVarM4052e;
        }
        return wVar;
    }

    /* JADX INFO: renamed from: b */
    public w m4084b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4052e(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: b */
    void m4085b() {
        this.f3257e = new C0510f(new C0510f.a() { // from class: android.support.v7.widget.av.6
            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: a */
            public w mo4143a(int i2) {
                w wVarM4059a = C0484av.this.m4059a(i2, true);
                if (wVarM4059a == null || C0484av.this.f3258f.m3787c(wVarM4059a.f3381a)) {
                    return null;
                }
                return wVarM4059a;
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: a */
            public void mo4144a(int i2, int i3) {
                C0484av.this.m4066a(i2, i3, true);
                C0484av.this.f3210C = true;
                C0484av.this.f3209B.f3357b += i3;
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: a */
            public void mo4145a(int i2, int i3, Object obj) {
                C0484av.this.m4065a(i2, i3, obj);
                C0484av.this.f3211D = true;
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: a */
            public void mo4146a(C0510f.b bVar) {
                m4150c(bVar);
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: b */
            public void mo4147b(int i2, int i3) {
                C0484av.this.m4066a(i2, i3, false);
                C0484av.this.f3210C = true;
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: b */
            public void mo4148b(C0510f.b bVar) {
                m4150c(bVar);
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: c */
            public void mo4149c(int i2, int i3) {
                C0484av.this.m4111g(i2, i3);
                C0484av.this.f3210C = true;
            }

            /* JADX INFO: renamed from: c */
            void m4150c(C0510f.b bVar) {
                switch (bVar.f3593a) {
                    case 1:
                        C0484av.this.f3265m.mo3448a(C0484av.this, bVar.f3594b, bVar.f3596d);
                        break;
                    case 2:
                        C0484av.this.f3265m.mo3455b(C0484av.this, bVar.f3594b, bVar.f3596d);
                        break;
                    case 4:
                        C0484av.this.f3265m.mo3450a(C0484av.this, bVar.f3594b, bVar.f3596d, bVar.f3595c);
                        break;
                    case 8:
                        C0484av.this.f3265m.mo3449a(C0484av.this, bVar.f3594b, bVar.f3596d, 1);
                        break;
                }
            }

            @Override // android.support.v7.widget.C0510f.a
            /* JADX INFO: renamed from: d */
            public void mo4151d(int i2, int i3) {
                C0484av.this.m4108f(i2, i3);
                C0484av.this.f3210C = true;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m4086b(g gVar) {
        if (this.f3265m != null) {
            this.f3265m.mo3504a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3267o.remove(gVar);
        if (this.f3267o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m4131r();
        requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public void m4087b(l lVar) {
        this.f3218R.remove(lVar);
        if (this.f3219S == lVar) {
            this.f3219S = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4088b(m mVar) {
        if (this.f3252aw != null) {
            this.f3252aw.remove(mVar);
        }
    }

    /* JADX INFO: renamed from: b */
    void m4089b(w wVar, e.c cVar, e.c cVar2) {
        m4053e(wVar);
        wVar.m4417a(false);
        if (this.f3276x.mo4171a(wVar, cVar, cVar2)) {
            m4129p();
        }
    }

    /* JADX INFO: renamed from: b */
    void m4090b(boolean z) {
        this.f3231ab--;
        if (this.f3231ab < 1) {
            this.f3231ab = 0;
            if (z) {
                m4023G();
                m4138y();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m4091b(int i2, int i3) {
        if (this.f3265m == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f3273u) {
            return false;
        }
        boolean zMo3515d = this.f3265m.mo3515d();
        boolean zMo3518e = this.f3265m.mo3518e();
        if (!zMo3515d || Math.abs(i2) < this.f3246aq) {
            i2 = 0;
        }
        if (!zMo3518e || Math.abs(i3) < this.f3246aq) {
            i3 = 0;
        }
        if ((i2 == 0 && i3 == 0) || dispatchNestedPreFling(i2, i3)) {
            return false;
        }
        boolean z = zMo3515d || zMo3518e;
        dispatchNestedFling(i2, i3, z);
        if (this.f3245ap != null && this.f3245ap.m4303a(i2, i3)) {
            return true;
        }
        if (!z) {
            return false;
        }
        int i4 = zMo3515d ? 1 : 0;
        if (zMo3518e) {
            i4 |= 2;
        }
        m4121j(i4, 1);
        this.f3277y.m4391a(Math.max(-this.f3247ar, Math.min(i2, this.f3247ar)), Math.max(-this.f3247ar, Math.min(i3, this.f3247ar)));
        return true;
    }

    /* JADX INFO: renamed from: b */
    boolean m4092b(w wVar) {
        return this.f3276x == null || this.f3276x.mo3855a(wVar, wVar.m4439u());
    }

    /* JADX INFO: renamed from: c */
    public View m4093c(View view) {
        Object parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = (View) parent;
            view2 = view3;
            parent = view3.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    void m4094c() {
        if (this.f3276x != null) {
            this.f3276x.mo3861d();
        }
        if (this.f3265m != null) {
            this.f3265m.m4249c(this.f3256d);
            this.f3265m.m4241b(this.f3256d);
        }
        this.f3256d.m4324a();
    }

    /* JADX INFO: renamed from: c */
    public void m4095c(int i2) {
        int iM3782b = this.f3258f.m3782b();
        for (int i3 = 0; i3 < iM3782b; i3++) {
            this.f3258f.m3784b(i3).offsetTopAndBottom(i2);
        }
    }

    /* JADX INFO: renamed from: c */
    void m4096c(int i2, int i3) {
        boolean zIsFinished = false;
        if (this.f3233ad != null && !this.f3233ad.isFinished() && i2 > 0) {
            this.f3233ad.onRelease();
            zIsFinished = this.f3233ad.isFinished();
        }
        if (this.f3235af != null && !this.f3235af.isFinished() && i2 < 0) {
            this.f3235af.onRelease();
            zIsFinished |= this.f3235af.isFinished();
        }
        if (this.f3234ae != null && !this.f3234ae.isFinished() && i3 > 0) {
            this.f3234ae.onRelease();
            zIsFinished |= this.f3234ae.isFinished();
        }
        if (this.f3236ag != null && !this.f3236ag.isFinished() && i3 < 0) {
            this.f3236ag.onRelease();
            zIsFinished |= this.f3236ag.isFinished();
        }
        if (zIsFinished) {
            C0246q.m1756c(this);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof i) && this.f3265m.mo3452a((i) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        if (this.f3265m != null && this.f3265m.mo3515d()) {
            return this.f3265m.mo3517e(this.f3209B);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        if (this.f3265m != null && this.f3265m.mo3515d()) {
            return this.f3265m.mo3510c(this.f3209B);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        if (this.f3265m != null && this.f3265m.mo3515d()) {
            return this.f3265m.mo3521g(this.f3209B);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        if (this.f3265m != null && this.f3265m.mo3518e()) {
            return this.f3265m.mo3520f(this.f3209B);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        if (this.f3265m != null && this.f3265m.mo3518e()) {
            return this.f3265m.mo3513d(this.f3209B);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        if (this.f3265m != null && this.f3265m.mo3518e()) {
            return this.f3265m.mo3523h(this.f3209B);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    int m4097d(w wVar) {
        if (wVar.m4418a(524) || !wVar.m4434p()) {
            return -1;
        }
        return this.f3257e.m4638c(wVar.f3383c);
    }

    /* JADX INFO: renamed from: d */
    public w m4098d(View view) {
        View viewM4093c = m4093c(view);
        if (viewM4093c == null) {
            return null;
        }
        return m4084b(viewM4093c);
    }

    /* JADX INFO: renamed from: d */
    void m4099d() {
        if (!this.f3271s || this.f3275w) {
            C0203e.m1472a("RV FullInvalidate");
            m4130q();
            C0203e.m1471a();
            return;
        }
        if (this.f3257e.m4640d()) {
            if (!this.f3257e.m4635a(4) || this.f3257e.m4635a(11)) {
                if (this.f3257e.m4640d()) {
                    C0203e.m1472a("RV FullInvalidate");
                    m4130q();
                    C0203e.m1471a();
                    return;
                }
                return;
            }
            C0203e.m1472a("RV PartialInvalidate");
            m4102e();
            m4124l();
            this.f3257e.m4637b();
            if (!this.f3272t) {
                if (m4018B()) {
                    m4130q();
                } else {
                    this.f3257e.m4639c();
                }
            }
            m4076a(true);
            m4126m();
            C0203e.m1471a();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4100d(int i2) {
        int iM3782b = this.f3258f.m3782b();
        for (int i3 = 0; i3 < iM3782b; i3++) {
            this.f3258f.m3784b(i3).offsetLeftAndRight(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    void m4101d(int i2, int i3) {
        if (i2 < 0) {
            m4109g();
            this.f3233ad.onAbsorb(-i2);
        } else if (i2 > 0) {
            m4113h();
            this.f3235af.onAbsorb(i2);
        }
        if (i3 < 0) {
            m4118i();
            this.f3234ae.onAbsorb(-i3);
        } else if (i3 > 0) {
            m4120j();
            this.f3236ag.onAbsorb(i3);
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        C0246q.m1756c(this);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().m1718a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m1717a(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1723a(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m1721a(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = false;
        super.draw(canvas);
        int size = this.f3267o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3267o.get(i2).mo3895a(canvas, this, this.f3209B);
        }
        if (this.f3233ad == null || this.f3233ad.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f3260h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate(paddingBottom + (-getHeight()), 0.0f);
            z = this.f3233ad != null && this.f3233ad.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.f3234ae != null && !this.f3234ae.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3260h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            z |= this.f3234ae != null && this.f3234ae.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (this.f3235af != null && !this.f3235af.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3260h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            z |= this.f3235af != null && this.f3235af.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        if (this.f3236ag != null && !this.f3236ag.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3260h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            if (this.f3236ag != null && this.f3236ag.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f3276x == null || this.f3267o.size() <= 0 || !this.f3276x.mo3857b()) ? z : true) {
            C0246q.m1756c(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX INFO: renamed from: e */
    void m4102e() {
        this.f3220T++;
        if (this.f3220T != 1 || this.f3273u) {
            return;
        }
        this.f3272t = false;
    }

    /* JADX INFO: renamed from: e */
    public void m4103e(int i2) {
    }

    /* JADX INFO: renamed from: e */
    void m4104e(int i2, int i3) {
        setMeasuredDimension(h.m4193a(i2, getPaddingLeft() + getPaddingRight(), C0246q.m1763i(this)), h.m4193a(i3, getPaddingTop() + getPaddingBottom(), C0246q.m1764j(this)));
    }

    /* JADX INFO: renamed from: f */
    public int m4105f(View view) {
        w wVarM4052e = m4052e(view);
        if (wVarM4052e != null) {
            return wVarM4052e.m4422d();
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public void m4106f() {
        setScrollState(0);
        m4019C();
    }

    /* JADX INFO: renamed from: f */
    void m4107f(int i2) {
        if (this.f3265m != null) {
            this.f3265m.mo3640k(i2);
        }
        m4103e(i2);
        if (this.f3251av != null) {
            this.f3251av.m4304a(this, i2);
        }
        if (this.f3252aw != null) {
            for (int size = this.f3252aw.size() - 1; size >= 0; size--) {
                this.f3252aw.get(size).m4304a(this, i2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m4108f(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int iM3785c = this.f3258f.m3785c();
        if (i2 < i3) {
            i4 = -1;
            i5 = i3;
            i6 = i2;
        } else {
            i4 = 1;
            i5 = i2;
            i6 = i3;
        }
        for (int i7 = 0; i7 < iM3785c; i7++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i7));
            if (wVarM4052e != null && wVarM4052e.f3383c >= i6 && wVarM4052e.f3383c <= i5) {
                if (wVarM4052e.f3383c == i2) {
                    wVarM4052e.m4414a(i3 - i2, false);
                } else {
                    wVarM4052e.m4414a(i4, false);
                }
                this.f3209B.f3360e = true;
            }
        }
        this.f3256d.m4326a(i2, i3);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewMo3439a;
        boolean z;
        boolean z2;
        View viewM4257d = this.f3265m.m4257d(view, i2);
        if (viewM4257d != null) {
            return viewM4257d;
        }
        boolean z3 = (this.f3264l == null || this.f3265m == null || m4128o() || this.f3273u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.f3265m.mo3518e()) {
                int i3 = i2 == 2 ? 130 : 33;
                boolean z4 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f3202L) {
                    i2 = i3;
                    z = z4;
                } else {
                    z = z4;
                }
            } else {
                z = false;
            }
            if (z || !this.f3265m.mo3515d()) {
                z2 = z;
            } else {
                int i4 = (i2 == 2) ^ (this.f3265m.m4284s() == 1) ? 66 : 17;
                z2 = focusFinder.findNextFocus(this, view, i4) == null;
                if (f3202L) {
                    i2 = i4;
                }
            }
            if (z2) {
                m4099d();
                if (m4093c(view) == null) {
                    return null;
                }
                m4102e();
                this.f3265m.mo3439a(view, i2, this.f3256d, this.f3209B);
                m4076a(false);
            }
            viewMo3439a = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                m4099d();
                if (m4093c(view) == null) {
                    return null;
                }
                m4102e();
                viewMo3439a = this.f3265m.mo3439a(view, i2, this.f3256d, this.f3209B);
                m4076a(false);
            } else {
                viewMo3439a = viewFindNextFocus;
            }
        }
        if (viewMo3439a == null || viewMo3439a.hasFocusable()) {
            if (!m4046a(view, viewMo3439a, i2)) {
                viewMo3439a = super.focusSearch(view, i2);
            }
            return viewMo3439a;
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        m4043a(viewMo3439a, (View) null);
        return view;
    }

    /* JADX INFO: renamed from: g */
    void m4109g() {
        if (this.f3233ad != null) {
            return;
        }
        this.f3233ad = new EdgeEffect(getContext());
        if (this.f3260h) {
            this.f3233ad.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.f3233ad.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4110g(int i2) {
        getScrollingChildHelper().m1728c(i2);
    }

    /* JADX INFO: renamed from: g */
    void m4111g(int i2, int i3) {
        int iM3785c = this.f3258f.m3785c();
        for (int i4 = 0; i4 < iM3785c; i4++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i4));
            if (wVarM4052e != null && !wVarM4052e.m4421c() && wVarM4052e.f3383c >= i2) {
                wVarM4052e.m4414a(i3, false);
                this.f3209B.f3360e = true;
            }
        }
        this.f3256d.m4337b(i2, i3);
        requestLayout();
    }

    /* JADX INFO: renamed from: g */
    public void m4112g(View view) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.f3265m == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + m4061a());
        }
        return this.f3265m.mo3435a();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f3265m == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + m4061a());
        }
        return this.f3265m.mo3436a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.f3265m == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + m4061a());
        }
        return this.f3265m.mo3437a(layoutParams);
    }

    public a getAdapter() {
        return this.f3264l;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f3265m != null ? this.f3265m.m4285t() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        return this.f3254ay == null ? super.getChildDrawingOrder(i2, i3) : this.f3254ay.m4166a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3260h;
    }

    public C0485aw getCompatAccessibilityDelegate() {
        return this.f3213F;
    }

    public e getItemAnimator() {
        return this.f3276x;
    }

    public int getItemDecorationCount() {
        return this.f3267o.size();
    }

    public h getLayoutManager() {
        return this.f3265m;
    }

    public int getMaxFlingVelocity() {
        return this.f3247ar;
    }

    public int getMinFlingVelocity() {
        return this.f3246aq;
    }

    long getNanoTime() {
        if (f3201K) {
            return System.nanoTime();
        }
        return 0L;
    }

    public k getOnFlingListener() {
        return this.f3245ap;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3250au;
    }

    public n getRecycledViewPool() {
        return this.f3256d.m4352g();
    }

    public int getScrollState() {
        return this.f3237ah;
    }

    /* JADX INFO: renamed from: h */
    void m4113h() {
        if (this.f3235af != null) {
            return;
        }
        this.f3235af = new EdgeEffect(getContext());
        if (this.f3260h) {
            this.f3235af.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.f3235af.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4114h(int i2, int i3) {
    }

    /* JADX INFO: renamed from: h */
    public void m4115h(View view) {
    }

    /* JADX INFO: renamed from: h */
    public boolean m4116h(int i2) {
        return getScrollingChildHelper().m1719a(i2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1725b();
    }

    /* JADX INFO: renamed from: i */
    Rect m4117i(View view) {
        i iVar = (i) view.getLayoutParams();
        if (!iVar.f3323e) {
            return iVar.f3322d;
        }
        if (this.f3209B.m4379a() && (iVar.m4299e() || iVar.m4297c())) {
            return iVar.f3322d;
        }
        Rect rect = iVar.f3322d;
        rect.set(0, 0, 0, 0);
        int size = this.f3267o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3262j.set(0, 0, 0, 0);
            this.f3267o.get(i2).m4190a(this.f3262j, view, this, this.f3209B);
            rect.left += this.f3262j.left;
            rect.top += this.f3262j.top;
            rect.right += this.f3262j.right;
            rect.bottom += this.f3262j.bottom;
        }
        iVar.f3323e = false;
        return rect;
    }

    /* JADX INFO: renamed from: i */
    void m4118i() {
        if (this.f3234ae != null) {
            return;
        }
        this.f3234ae = new EdgeEffect(getContext());
        if (this.f3260h) {
            this.f3234ae.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.f3234ae.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: i */
    void m4119i(int i2, int i3) {
        this.f3232ac++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        m4114h(i2, i3);
        if (this.f3251av != null) {
            this.f3251av.mo3902a(this, i2, i3);
        }
        if (this.f3252aw != null) {
            for (int size = this.f3252aw.size() - 1; size >= 0; size--) {
                this.f3252aw.get(size).mo3902a(this, i2, i3);
            }
        }
        this.f3232ac--;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3268p;
    }

    @Override // android.view.View, android.support.v4.p019j.InterfaceC0238i
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m1716a();
    }

    /* JADX INFO: renamed from: j */
    void m4120j() {
        if (this.f3236ag != null) {
            return;
        }
        this.f3236ag = new EdgeEffect(getContext());
        if (this.f3260h) {
            this.f3236ag.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.f3236ag.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m4121j(int i2, int i3) {
        return getScrollingChildHelper().m1720a(i2, i3);
    }

    /* JADX INFO: renamed from: k */
    void m4122k() {
        this.f3236ag = null;
        this.f3234ae = null;
        this.f3235af = null;
        this.f3233ad = null;
    }

    /* JADX INFO: renamed from: k */
    void m4123k(View view) {
        w wVarM4052e = m4052e(view);
        m4115h(view);
        if (this.f3264l != null && wVarM4052e != null) {
            this.f3264l.m4161d(wVarM4052e);
        }
        if (this.f3230aa != null) {
            for (int size = this.f3230aa.size() - 1; size >= 0; size--) {
                this.f3230aa.get(size).m4302b(view);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    void m4124l() {
        this.f3231ab++;
    }

    /* JADX INFO: renamed from: l */
    void m4125l(View view) {
        w wVarM4052e = m4052e(view);
        m4112g(view);
        if (this.f3264l != null && wVarM4052e != null) {
            this.f3264l.m4160c(wVarM4052e);
        }
        if (this.f3230aa != null) {
            for (int size = this.f3230aa.size() - 1; size >= 0; size--) {
                this.f3230aa.get(size).m4301a(view);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    void m4126m() {
        m4090b(true);
    }

    /* JADX INFO: renamed from: n */
    boolean m4127n() {
        return this.f3223W != null && this.f3223W.isEnabled();
    }

    /* JADX INFO: renamed from: o */
    public boolean m4128o() {
        return this.f3231ab > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f3231ab = 0;
        this.f3268p = true;
        this.f3271s = this.f3271s && !isLayoutRequested();
        if (this.f3265m != null) {
            this.f3265m.m4250c(this);
        }
        this.f3212E = false;
        if (f3201K) {
            this.f3278z = RunnableC0475am.f3094a.get();
            if (this.f3278z == null) {
                this.f3278z = new RunnableC0475am();
                Display displayM1735B = C0246q.m1735B(this);
                if (isInEditMode() || displayM1735B == null) {
                    refreshRate = 60.0f;
                    this.f3278z.f3098d = (long) (1.0E9f / refreshRate);
                    RunnableC0475am.f3094a.set(this.f3278z);
                } else {
                    refreshRate = displayM1735B.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    this.f3278z.f3098d = (long) (1.0E9f / refreshRate);
                    RunnableC0475am.f3094a.set(this.f3278z);
                }
            }
            this.f3278z.m3918a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3276x != null) {
            this.f3276x.mo3861d();
        }
        m4106f();
        this.f3268p = false;
        if (this.f3265m != null) {
            this.f3265m.m4243b(this, this.f3256d);
        }
        this.f3214G.clear();
        removeCallbacks(this.f3228aE);
        this.f3259g.m4569b();
        if (f3201K) {
            this.f3278z.m3920b(this);
            this.f3278z = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3267o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3267o.get(i2).m4192b(canvas, this, this.f3209B);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        float f2;
        if (this.f3265m != null && !this.f3273u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.f3265m.mo3518e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3265m.mo3515d()) {
                    f2 = f3;
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    f2 = f3;
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f3265m.mo3518e()) {
                    f2 = -axisValue;
                    axisValue = 0.0f;
                } else if (this.f3265m.mo3515d()) {
                    f2 = 0.0f;
                } else {
                    axisValue = 0.0f;
                    f2 = 0.0f;
                }
            } else {
                axisValue = 0.0f;
                f2 = 0.0f;
            }
            if (f2 != 0.0f || axisValue != 0.0f) {
                m4078a((int) (axisValue * this.f3248as), (int) (this.f3249at * f2), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3273u) {
            return false;
        }
        if (m4045a(motionEvent)) {
            m4022F();
            return true;
        }
        if (this.f3265m == null) {
            return false;
        }
        boolean zMo3515d = this.f3265m.mo3515d();
        boolean zMo3518e = this.f3265m.mo3518e();
        if (this.f3239aj == null) {
            this.f3239aj = VelocityTracker.obtain();
        }
        this.f3239aj.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.f3221U) {
                    this.f3221U = false;
                }
                this.f3238ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f3242am = x;
                this.f3240ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f3243an = y;
                this.f3241al = y;
                if (this.f3237ah == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.f3227aD;
                this.f3227aD[1] = 0;
                iArr[0] = 0;
                int i2 = zMo3515d ? 1 : 0;
                if (zMo3518e) {
                    i2 |= 2;
                }
                m4121j(i2, 0);
                break;
            case 1:
                this.f3239aj.clear();
                m4110g(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3238ai);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3238ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                if (this.f3237ah != 1) {
                    int i3 = x2 - this.f3240ak;
                    int i4 = y2 - this.f3241al;
                    if (!zMo3515d || Math.abs(i3) <= this.f3244ao) {
                        z = false;
                    } else {
                        this.f3242am = x2;
                        z = true;
                    }
                    if (zMo3518e && Math.abs(i4) > this.f3244ao) {
                        this.f3243an = y2;
                        z = true;
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                break;
            case 3:
                m4022F();
                break;
            case 5:
                this.f3238ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3242am = x3;
                this.f3240ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3243an = y3;
                this.f3241al = y3;
                break;
            case 6:
                m4051c(motionEvent);
                break;
        }
        return this.f3237ah == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        C0203e.m1472a("RV OnLayout");
        m4130q();
        C0203e.m1471a();
        this.f3271s = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z = false;
        if (this.f3265m == null) {
            m4104e(i2, i3);
            return;
        }
        if (this.f3265m.f3312w) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f3265m.m4217a(this.f3256d, this.f3209B, i2, i3);
            if (z || this.f3264l == null) {
                return;
            }
            if (this.f3209B.f3358c == 1) {
                m4030N();
            }
            this.f3265m.m4248c(i2, i3);
            this.f3209B.f3363h = true;
            m4031O();
            this.f3265m.m4258d(i2, i3);
            if (this.f3265m.mo3527k()) {
                this.f3265m.m4248c(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f3209B.f3363h = true;
                m4031O();
                this.f3265m.m4258d(i2, i3);
                return;
            }
            return;
        }
        if (this.f3269q) {
            this.f3265m.m4217a(this.f3256d, this.f3209B, i2, i3);
            return;
        }
        if (this.f3274v) {
            m4102e();
            m4124l();
            m4025I();
            m4126m();
            if (this.f3209B.f3365j) {
                this.f3209B.f3361f = true;
            } else {
                this.f3257e.m4641e();
                this.f3209B.f3361f = false;
            }
            this.f3274v = false;
            m4076a(false);
        } else if (this.f3209B.f3365j) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.f3264l != null) {
            this.f3209B.f3359d = this.f3264l.mo191a();
        } else {
            this.f3209B.f3359d = 0;
        }
        m4102e();
        this.f3265m.m4217a(this.f3256d, this.f3209B, i2, i3);
        m4076a(false);
        this.f3209B.f3361f = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m4128o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f3216P = (r) parcelable;
        super.onRestoreInstanceState(this.f3216P.m1605a());
        if (this.f3265m == null || this.f3216P.f3341a == null) {
            return;
        }
        this.f3265m.mo3501a(this.f3216P.f3341a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        r rVar = new r(super.onSaveInstanceState());
        if (this.f3216P != null) {
            rVar.m4357a(this.f3216P);
        } else if (this.f3265m != null) {
            rVar.f3341a = this.f3265m.mo3511c();
        } else {
            rVar.f3341a = null;
        }
        return rVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        m4122k();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f3273u || this.f3221U) {
            return false;
        }
        if (m4049b(motionEvent)) {
            m4022F();
            return true;
        }
        if (this.f3265m == null) {
            return false;
        }
        boolean zMo3515d = this.f3265m.mo3515d();
        boolean zMo3518e = this.f3265m.mo3518e();
        if (this.f3239aj == null) {
            this.f3239aj = VelocityTracker.obtain();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f3227aD;
            this.f3227aD[1] = 0;
            iArr[0] = 0;
        }
        motionEventObtain.offsetLocation(this.f3227aD[0], this.f3227aD[1]);
        switch (actionMasked) {
            case 0:
                this.f3238ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f3242am = x;
                this.f3240ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f3243an = y;
                this.f3241al = y;
                int i2 = zMo3515d ? 1 : 0;
                if (zMo3518e) {
                    i2 |= 2;
                }
                m4121j(i2, 0);
                break;
            case 1:
                this.f3239aj.addMovement(motionEventObtain);
                this.f3239aj.computeCurrentVelocity(1000, this.f3247ar);
                float f2 = zMo3515d ? -this.f3239aj.getXVelocity(this.f3238ai) : 0.0f;
                float f3 = zMo3518e ? -this.f3239aj.getYVelocity(this.f3238ai) : 0.0f;
                if ((f2 == 0.0f && f3 == 0.0f) || !m4091b((int) f2, (int) f3)) {
                    setScrollState(0);
                }
                m4021E();
                z2 = true;
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3238ai);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3238ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int i3 = this.f3242am - x2;
                int i4 = this.f3243an - y2;
                if (m4079a(i3, i4, this.f3226aC, this.f3225aB, 0)) {
                    i3 -= this.f3226aC[0];
                    i4 -= this.f3226aC[1];
                    motionEventObtain.offsetLocation(this.f3225aB[0], this.f3225aB[1]);
                    int[] iArr2 = this.f3227aD;
                    iArr2[0] = iArr2[0] + this.f3225aB[0];
                    int[] iArr3 = this.f3227aD;
                    iArr3[1] = iArr3[1] + this.f3225aB[1];
                }
                if (this.f3237ah != 1) {
                    if (!zMo3515d || Math.abs(i3) <= this.f3244ao) {
                        z = false;
                    } else {
                        i3 = i3 > 0 ? i3 - this.f3244ao : this.f3244ao + i3;
                        z = true;
                    }
                    if (zMo3518e && Math.abs(i4) > this.f3244ao) {
                        i4 = i4 > 0 ? i4 - this.f3244ao : this.f3244ao + i4;
                        z = true;
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                if (this.f3237ah == 1) {
                    this.f3242am = x2 - this.f3225aB[0];
                    this.f3243an = y2 - this.f3225aB[1];
                    if (m4078a(zMo3515d ? i3 : 0, zMo3518e ? i4 : 0, motionEventObtain)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (this.f3278z != null && (i3 != 0 || i4 != 0)) {
                        this.f3278z.m3919a(this, i3, i4);
                    }
                }
                break;
            case 3:
                m4022F();
                break;
            case 5:
                this.f3238ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3242am = x3;
                this.f3240ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3243an = y3;
                this.f3241al = y3;
                break;
            case 6:
                m4051c(motionEvent);
                break;
        }
        if (!z2) {
            this.f3239aj.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    void m4129p() {
        if (this.f3212E || !this.f3268p) {
            return;
        }
        C0246q.m1747a(this, this.f3228aE);
        this.f3212E = true;
    }

    /* JADX INFO: renamed from: q */
    void m4130q() {
        if (this.f3264l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f3265m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f3209B.f3363h = false;
        if (this.f3209B.f3358c == 1) {
            m4030N();
            this.f3265m.m4267f(this);
            m4031O();
        } else if (!this.f3257e.m4642f() && this.f3265m.m4289x() == getWidth() && this.f3265m.m4290y() == getHeight()) {
            this.f3265m.m4267f(this);
        } else {
            this.f3265m.m4267f(this);
            m4031O();
        }
        m4032P();
    }

    /* JADX INFO: renamed from: r */
    void m4131r() {
        int iM3785c = this.f3258f.m3785c();
        for (int i2 = 0; i2 < iM3785c; i2++) {
            ((i) this.f3258f.m3788d(i2).getLayoutParams()).f3323e = true;
        }
        this.f3256d.m4355j();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        w wVarM4052e = m4052e(view);
        if (wVarM4052e != null) {
            if (wVarM4052e.m4436r()) {
                wVarM4052e.m4431m();
            } else if (!wVarM4052e.m4421c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + wVarM4052e + m4061a());
            }
        }
        view.clearAnimation();
        m4123k(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3265m.m4232a(this, this.f3209B, view, view2) && view2 != null) {
            m4043a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3265m.m4233a(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3218R.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3218R.get(i2).mo3897a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3220T != 0 || this.f3273u) {
            this.f3272t = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    void m4132s() {
        int iM3785c = this.f3258f.m3785c();
        for (int i2 = 0; i2 < iM3785c; i2++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i2));
            if (!wVarM4052e.m4421c()) {
                wVarM4052e.m4419b();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        if (this.f3265m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3273u) {
            return;
        }
        boolean zMo3515d = this.f3265m.mo3515d();
        boolean zMo3518e = this.f3265m.mo3518e();
        if (zMo3515d || zMo3518e) {
            if (!zMo3515d) {
                i2 = 0;
            }
            if (!zMo3518e) {
                i3 = 0;
            }
            m4078a(i2, i3, (MotionEvent) null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m4082a(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0485aw c0485aw) {
        this.f3213F = c0485aw;
        C0246q.m1745a(this, this.f3213F);
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        m4037a(aVar, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar == this.f3254ay) {
            return;
        }
        this.f3254ay = dVar;
        setChildrenDrawingOrderEnabled(this.f3254ay != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f3260h) {
            m4122k();
        }
        this.f3260h = z;
        super.setClipToPadding(z);
        if (this.f3271s) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.f3269q = z;
    }

    public void setItemAnimator(e eVar) {
        if (this.f3276x != null) {
            this.f3276x.mo3861d();
            this.f3276x.m4170a(null);
        }
        this.f3276x = eVar;
        if (this.f3276x != null) {
            this.f3276x.m4170a(this.f3253ax);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f3256d.m4325a(i2);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f3273u) {
            m4075a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3273u = true;
                this.f3221U = true;
                m4106f();
                return;
            }
            this.f3273u = false;
            if (this.f3272t && this.f3265m != null && this.f3264l != null) {
                requestLayout();
            }
            this.f3272t = false;
        }
    }

    public void setLayoutManager(h hVar) {
        if (hVar == this.f3265m) {
            return;
        }
        m4106f();
        if (this.f3265m != null) {
            if (this.f3276x != null) {
                this.f3276x.mo3861d();
            }
            this.f3265m.m4249c(this.f3256d);
            this.f3265m.m4241b(this.f3256d);
            this.f3256d.m4324a();
            if (this.f3268p) {
                this.f3265m.m4243b(this, this.f3256d);
            }
            this.f3265m.m4242b((C0484av) null);
            this.f3265m = null;
        } else {
            this.f3256d.m4324a();
        }
        this.f3258f.m3776a();
        this.f3265m = hVar;
        if (hVar != null) {
            if (hVar.f3306q != null) {
                throw new IllegalArgumentException("LayoutManager " + hVar + " is already attached to a RecyclerView:" + hVar.f3306q.m4061a());
            }
            this.f3265m.m4242b(this);
            if (this.f3268p) {
                this.f3265m.m4250c(this);
            }
        }
        this.f3256d.m4336b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m1715a(z);
    }

    public void setOnFlingListener(k kVar) {
        this.f3245ap = kVar;
    }

    @Deprecated
    public void setOnScrollListener(m mVar) {
        this.f3251av = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3250au = z;
    }

    public void setRecycledViewPool(n nVar) {
        this.f3256d.m4329a(nVar);
    }

    public void setRecyclerListener(p pVar) {
        this.f3266n = pVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.f3237ah) {
            return;
        }
        this.f3237ah = i2;
        if (i2 != 2) {
            m4019C();
        }
        m4107f(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i2) {
            case 0:
                break;
            case 1:
                this.f3244ao = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
                break;
        }
        this.f3244ao = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(u uVar) {
        this.f3256d.m4330a(uVar);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m1726b(i2);
    }

    @Override // android.view.View, android.support.v4.p019j.InterfaceC0238i
    public void stopNestedScroll() {
        getScrollingChildHelper().m1727c();
    }

    /* JADX INFO: renamed from: t */
    void m4133t() {
        int iM3785c = this.f3258f.m3785c();
        for (int i2 = 0; i2 < iM3785c; i2++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i2));
            if (!wVarM4052e.m4421c()) {
                wVarM4052e.m4411a();
            }
        }
        this.f3256d.m4354i();
    }

    /* JADX INFO: renamed from: u */
    void m4134u() {
        this.f3275w = true;
        m4135v();
    }

    /* JADX INFO: renamed from: v */
    void m4135v() {
        int iM3785c = this.f3258f.m3785c();
        for (int i2 = 0; i2 < iM3785c; i2++) {
            w wVarM4052e = m4052e(this.f3258f.m3788d(i2));
            if (wVarM4052e != null && !wVarM4052e.m4421c()) {
                wVarM4052e.m4420b(6);
            }
        }
        m4131r();
        this.f3256d.m4353h();
    }

    /* JADX INFO: renamed from: w */
    public boolean m4136w() {
        return !this.f3271s || this.f3275w || this.f3257e.m4640d();
    }

    /* JADX INFO: renamed from: x */
    void m4137x() {
        int iM3782b = this.f3258f.m3782b();
        for (int i2 = 0; i2 < iM3782b; i2++) {
            View viewM3784b = this.f3258f.m3784b(i2);
            w wVarM4084b = m4084b(viewM3784b);
            if (wVarM4084b != null && wVarM4084b.f3389i != null) {
                View view = wVarM4084b.f3389i.f3381a;
                int left = viewM3784b.getLeft();
                int top = viewM3784b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    void m4138y() {
        int i2;
        for (int size = this.f3214G.size() - 1; size >= 0; size--) {
            w wVar = this.f3214G.get(size);
            if (wVar.f3381a.getParent() == this && !wVar.m4421c() && (i2 = wVar.f3392l) != -1) {
                C0246q.m1738a(wVar.f3381a, i2);
                wVar.f3392l = -1;
            }
        }
        this.f3214G.clear();
    }
}
