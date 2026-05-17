package android.support.v4.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.design.C0025a;
import android.support.v4.p007b.C0175b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0248s;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v4.widget.C0332p;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C0322f extends ViewGroup {

    /* JADX INFO: renamed from: b */
    static final boolean f1676b;

    /* JADX INFO: renamed from: d */
    private static final boolean f1678d;

    /* JADX INFO: renamed from: A */
    private float f1679A;

    /* JADX INFO: renamed from: B */
    private Drawable f1680B;

    /* JADX INFO: renamed from: C */
    private Drawable f1681C;

    /* JADX INFO: renamed from: D */
    private Drawable f1682D;

    /* JADX INFO: renamed from: E */
    private CharSequence f1683E;

    /* JADX INFO: renamed from: F */
    private CharSequence f1684F;

    /* JADX INFO: renamed from: G */
    private Object f1685G;

    /* JADX INFO: renamed from: H */
    private boolean f1686H;

    /* JADX INFO: renamed from: I */
    private Drawable f1687I;

    /* JADX INFO: renamed from: J */
    private Drawable f1688J;

    /* JADX INFO: renamed from: K */
    private Drawable f1689K;

    /* JADX INFO: renamed from: L */
    private Drawable f1690L;

    /* JADX INFO: renamed from: M */
    private final ArrayList<View> f1691M;

    /* JADX INFO: renamed from: e */
    private final b f1692e;

    /* JADX INFO: renamed from: f */
    private float f1693f;

    /* JADX INFO: renamed from: g */
    private int f1694g;

    /* JADX INFO: renamed from: h */
    private int f1695h;

    /* JADX INFO: renamed from: i */
    private float f1696i;

    /* JADX INFO: renamed from: j */
    private Paint f1697j;

    /* JADX INFO: renamed from: k */
    private final C0332p f1698k;

    /* JADX INFO: renamed from: l */
    private final C0332p f1699l;

    /* JADX INFO: renamed from: m */
    private final f f1700m;

    /* JADX INFO: renamed from: n */
    private final f f1701n;

    /* JADX INFO: renamed from: o */
    private int f1702o;

    /* JADX INFO: renamed from: p */
    private boolean f1703p;

    /* JADX INFO: renamed from: q */
    private boolean f1704q;

    /* JADX INFO: renamed from: r */
    private int f1705r;

    /* JADX INFO: renamed from: s */
    private int f1706s;

    /* JADX INFO: renamed from: t */
    private int f1707t;

    /* JADX INFO: renamed from: u */
    private int f1708u;

    /* JADX INFO: renamed from: v */
    private boolean f1709v;

    /* JADX INFO: renamed from: w */
    private boolean f1710w;

    /* JADX INFO: renamed from: x */
    private c f1711x;

    /* JADX INFO: renamed from: y */
    private List<c> f1712y;

    /* JADX INFO: renamed from: z */
    private float f1713z;

    /* JADX INFO: renamed from: c */
    private static final int[] f1677c = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: a */
    static final int[] f1675a = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: android.support.v4.widget.f$a */
    class a extends C0227b {

        /* JADX INFO: renamed from: c */
        private final Rect f1716c = new Rect();

        a() {
        }

        /* JADX INFO: renamed from: a */
        private void m2434a(C0224b c0224b, C0224b c0224b2) {
            Rect rect = this.f1716c;
            c0224b2.m1616a(rect);
            c0224b.m1623b(rect);
            c0224b2.m1628c(rect);
            c0224b.m1633d(rect);
            c0224b.m1636e(c0224b2.m1641g());
            c0224b.m1618a(c0224b2.m1653o());
            c0224b.m1625b(c0224b2.m1654p());
            c0224b.m1630c(c0224b2.m1656r());
            c0224b.m1646j(c0224b2.m1650l());
            c0224b.m1642h(c0224b2.m1647j());
            c0224b.m1631c(c0224b2.m1637e());
            c0224b.m1634d(c0224b2.m1639f());
            c0224b.m1638f(c0224b2.m1643h());
            c0224b.m1640g(c0224b2.m1645i());
            c0224b.m1644i(c0224b2.m1649k());
            c0224b.m1615a(c0224b2.m1622b());
        }

        /* JADX INFO: renamed from: a */
        private void m2435a(C0224b c0224b, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C0322f.m2396l(childAt)) {
                    c0224b.m1624b(childAt);
                }
            }
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo157a(View view, C0224b c0224b) {
            if (C0322f.f1676b) {
                super.mo157a(view, c0224b);
            } else {
                C0224b c0224bM1611a = C0224b.m1611a(c0224b);
                super.mo157a(view, c0224bM1611a);
                c0224b.m1617a(view);
                Object objM1760f = C0246q.m1760f(view);
                if (objM1760f instanceof View) {
                    c0224b.m1629c((View) objM1760f);
                }
                m2434a(c0224b, c0224bM1611a);
                c0224bM1611a.m1657s();
                m2435a(c0224b, (ViewGroup) view);
            }
            c0224b.m1625b((CharSequence) C0322f.class.getName());
            c0224b.m1631c(false);
            c0224b.m1634d(false);
            c0224b.m1621a(C0224b.a.f1289a);
            c0224b.m1621a(C0224b.a.f1290b);
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo311a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo311a(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0322f.class.getName());
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public boolean mo1672a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C0322f.f1676b || C0322f.m2396l(view)) {
                return super.mo1672a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: c */
        public boolean mo1674c(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1674c(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM2417c = C0322f.this.m2417c();
            if (viewM2417c != null) {
                CharSequence charSequenceM2410b = C0322f.this.m2410b(C0322f.this.m2423e(viewM2417c));
                if (charSequenceM2410b != null) {
                    text.add(charSequenceM2410b);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.f$b */
    static final class b extends C0227b {
        b() {
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo157a(View view, C0224b c0224b) {
            super.mo157a(view, c0224b);
            if (C0322f.m2396l(view)) {
                return;
            }
            c0224b.m1629c((View) null);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2436a(int i);

        /* JADX INFO: renamed from: a */
        void mo2437a(View view);

        /* JADX INFO: renamed from: a */
        void mo2438a(View view, float f);

        /* JADX INFO: renamed from: b */
        void mo2439b(View view);
    }

    /* JADX INFO: renamed from: android.support.v4.widget.f$d */
    public static class d extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f1717a;

        /* JADX INFO: renamed from: b */
        float f1718b;

        /* JADX INFO: renamed from: c */
        boolean f1719c;

        /* JADX INFO: renamed from: d */
        int f1720d;

        public d(int i, int i2) {
            super(i, i2);
            this.f1717a = 0;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1717a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322f.f1675a);
            this.f1717a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f1717a = 0;
            this.f1717a = dVar.f1717a;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1717a = 0;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1717a = 0;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.f$e */
    protected static class e extends AbstractC0222a {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.ClassLoaderCreator<e>() { // from class: android.support.v4.widget.f.e.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i) {
                return new e[i];
            }
        };

        /* JADX INFO: renamed from: a */
        int f1721a;

        /* JADX INFO: renamed from: b */
        int f1722b;

        /* JADX INFO: renamed from: c */
        int f1723c;

        /* JADX INFO: renamed from: e */
        int f1724e;

        /* JADX INFO: renamed from: f */
        int f1725f;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1721a = 0;
            this.f1721a = parcel.readInt();
            this.f1722b = parcel.readInt();
            this.f1723c = parcel.readInt();
            this.f1724e = parcel.readInt();
            this.f1725f = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
            this.f1721a = 0;
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1721a);
            parcel.writeInt(this.f1722b);
            parcel.writeInt(this.f1723c);
            parcel.writeInt(this.f1724e);
            parcel.writeInt(this.f1725f);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.f$f */
    private class f extends C0332p.a {

        /* JADX INFO: renamed from: b */
        private final int f1727b;

        /* JADX INFO: renamed from: c */
        private C0332p f1728c;

        /* JADX INFO: renamed from: d */
        private final Runnable f1729d = new Runnable() { // from class: android.support.v4.widget.f.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.m2447b();
            }
        };

        f(int i) {
            this.f1727b = i;
        }

        /* JADX INFO: renamed from: c */
        private void m2443c() {
            View viewM2418c = C0322f.this.m2418c(this.f1727b == 3 ? 5 : 3);
            if (viewM2418c != null) {
                C0322f.this.m2431i(viewM2418c);
            }
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public int mo300a(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX INFO: renamed from: a */
        public void m2444a() {
            C0322f.this.removeCallbacks(this.f1729d);
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo301a(int i) {
            C0322f.this.m2402a(this.f1727b, i, this.f1728c.m2506c());
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo2445a(int i, int i2) {
            C0322f.this.postDelayed(this.f1729d, 160L);
        }

        /* JADX INFO: renamed from: a */
        public void m2446a(C0332p c0332p) {
            this.f1728c = c0332p;
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo302a(View view, float f, float f2) {
            int width;
            float fM2421d = C0322f.this.m2421d(view);
            int width2 = view.getWidth();
            if (C0322f.this.m2409a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && fM2421d > 0.5f)) ? 0 : -width2;
            } else {
                width = C0322f.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fM2421d > 0.5f)) {
                    width -= width2;
                }
            }
            this.f1728c.m2496a(width, view.getTop());
            C0322f.this.invalidate();
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public void mo303a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = C0322f.this.m2409a(view, 3) ? (width + i) / width : (C0322f.this.getWidth() - i) / width;
            C0322f.this.m2415b(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            C0322f.this.invalidate();
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: a */
        public boolean mo304a(View view, int i) {
            return C0322f.this.m2428g(view) && C0322f.this.m2409a(view, this.f1727b) && C0322f.this.m2399a(view) == 0;
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public int mo440b(View view) {
            if (C0322f.this.m2428g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public int mo305b(View view, int i, int i2) {
            if (C0322f.this.m2409a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = C0322f.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* JADX INFO: renamed from: b */
        void m2447b() {
            View view;
            int i;
            int iM2500b = this.f1728c.m2500b();
            boolean z = this.f1727b == 3;
            if (z) {
                View viewM2418c = C0322f.this.m2418c(3);
                int i2 = (viewM2418c != null ? -viewM2418c.getWidth() : 0) + iM2500b;
                view = viewM2418c;
                i = i2;
            } else {
                View viewM2418c2 = C0322f.this.m2418c(5);
                int width = C0322f.this.getWidth() - iM2500b;
                view = viewM2418c2;
                i = width;
            }
            if (view != null) {
                if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || C0322f.this.m2399a(view) != 0) {
                    return;
                }
                d dVar = (d) view.getLayoutParams();
                this.f1728c.m2498a(view, i, view.getTop());
                dVar.f1719c = true;
                C0322f.this.invalidate();
                m2443c();
                C0322f.this.m2422d();
            }
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public void mo2448b(int i, int i2) {
            View viewM2418c = (i & 1) == 1 ? C0322f.this.m2418c(3) : C0322f.this.m2418c(5);
            if (viewM2418c == null || C0322f.this.m2399a(viewM2418c) != 0) {
                return;
            }
            this.f1728c.m2495a(viewM2418c, i2);
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public void mo441b(View view, int i) {
            ((d) view.getLayoutParams()).f1719c = false;
            m2443c();
        }

        @Override // android.support.v4.widget.C0332p.a
        /* JADX INFO: renamed from: b */
        public boolean mo2449b(int i) {
            return false;
        }
    }

    static {
        f1676b = Build.VERSION.SDK_INT >= 19;
        f1678d = Build.VERSION.SDK_INT >= 21;
    }

    public C0322f(Context context) {
        this(context, null);
    }

    public C0322f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0322f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1692e = new b();
        this.f1695h = -1728053248;
        this.f1697j = new Paint();
        this.f1704q = true;
        this.f1705r = 3;
        this.f1706s = 3;
        this.f1707t = 3;
        this.f1708u = 3;
        this.f1687I = null;
        this.f1688J = null;
        this.f1689K = null;
        this.f1690L = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f1694g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.f1700m = new f(3);
        this.f1701n = new f(5);
        this.f1698k = C0332p.m2474a(this, 1.0f, this.f1700m);
        this.f1698k.m2494a(1);
        this.f1698k.m2493a(f3);
        this.f1700m.m2446a(this.f1698k);
        this.f1699l = C0332p.m2474a(this, 1.0f, this.f1701n);
        this.f1699l.m2494a(2);
        this.f1699l.m2493a(f3);
        this.f1701n.m2446a(this.f1699l);
        setFocusableInTouchMode(true);
        C0246q.m1738a((View) this, 1);
        C0246q.m1745a(this, new a());
        C0248s.m1834a(this, false);
        if (C0246q.m1770p(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.widget.f.1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    @TargetApi(21)
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((C0322f) view).m2407a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1677c);
                try {
                    this.f1680B = typedArrayObtainStyledAttributes.getDrawable(0);
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } else {
                this.f1680B = null;
            }
        }
        this.f1693f = f2 * 10.0f;
        this.f1691M = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    private boolean m2388a(Drawable drawable, int i) {
        if (drawable == null || !C0181a.m1395b(drawable)) {
            return false;
        }
        C0181a.m1396b(drawable, i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m2389c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2428g(childAt)) && !(z && childAt == view)) {
                C0246q.m1738a(childAt, 4);
            } else {
                C0246q.m1738a(childAt, 1);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    static String m2390d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* JADX INFO: renamed from: e */
    private void m2391e() {
        if (f1678d) {
            return;
        }
        this.f1681C = m2392f();
        this.f1682D = m2393g();
    }

    /* JADX INFO: renamed from: f */
    private Drawable m2392f() {
        int iM1759e = C0246q.m1759e(this);
        if (iM1759e == 0) {
            if (this.f1687I != null) {
                m2388a(this.f1687I, iM1759e);
                return this.f1687I;
            }
        } else if (this.f1688J != null) {
            m2388a(this.f1688J, iM1759e);
            return this.f1688J;
        }
        return this.f1689K;
    }

    /* JADX INFO: renamed from: g */
    private Drawable m2393g() {
        int iM1759e = C0246q.m1759e(this);
        if (iM1759e == 0) {
            if (this.f1688J != null) {
                m2388a(this.f1688J, iM1759e);
                return this.f1688J;
            }
        } else if (this.f1687I != null) {
            m2388a(this.f1687I, iM1759e);
            return this.f1687I;
        }
        return this.f1690L;
    }

    /* JADX INFO: renamed from: h */
    private boolean m2394h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).f1719c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private boolean m2395i() {
        return m2417c() != null;
    }

    /* JADX INFO: renamed from: l */
    static boolean m2396l(View view) {
        return (C0246q.m1758d(view) == 4 || C0246q.m1758d(view) == 2) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m2397m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m2398a(int i) {
        int iM1759e = C0246q.m1759e(this);
        switch (i) {
            case 3:
                if (this.f1705r != 3) {
                    return this.f1705r;
                }
                int i2 = iM1759e == 0 ? this.f1707t : this.f1708u;
                if (i2 != 3) {
                    return i2;
                }
                return 0;
            case 5:
                if (this.f1706s != 3) {
                    return this.f1706s;
                }
                int i3 = iM1759e == 0 ? this.f1708u : this.f1707t;
                if (i3 != 3) {
                    return i3;
                }
                break;
            case 8388611:
                if (this.f1707t != 3) {
                    return this.f1707t;
                }
                int i4 = iM1759e == 0 ? this.f1705r : this.f1706s;
                if (i4 != 3) {
                    return i4;
                }
                break;
            case 8388613:
                if (this.f1708u != 3) {
                    return this.f1708u;
                }
                int i5 = iM1759e == 0 ? this.f1706s : this.f1705r;
                if (i5 != 3) {
                    return i5;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2399a(View view) {
        if (m2428g(view)) {
            return m2398a(((d) view.getLayoutParams()).f1717a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: a */
    View m2400a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((d) childAt.getLayoutParams()).f1720d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m2401a(int i, int i2) {
        int iM1692a = C0233d.m1692a(i2, C0246q.m1759e(this));
        switch (i2) {
            case 3:
                this.f1705r = i;
                break;
            case 5:
                this.f1706s = i;
                break;
            case 8388611:
                this.f1707t = i;
                break;
            case 8388613:
                this.f1708u = i;
                break;
        }
        if (i != 0) {
            (iM1692a == 3 ? this.f1698k : this.f1699l).m2512e();
        }
        switch (i) {
            case 1:
                View viewM2418c = m2418c(iM1692a);
                if (viewM2418c != null) {
                    m2431i(viewM2418c);
                }
                break;
            case 2:
                View viewM2418c2 = m2418c(iM1692a);
                if (viewM2418c2 != null) {
                    m2429h(viewM2418c2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    void m2402a(int i, int i2, View view) {
        int iM2492a = this.f1698k.m2492a();
        int iM2492a2 = this.f1699l.m2492a();
        int i3 = (iM2492a == 1 || iM2492a2 == 1) ? 1 : (iM2492a == 2 || iM2492a2 == 2) ? 2 : 0;
        if (view != null && i2 == 0) {
            d dVar = (d) view.getLayoutParams();
            if (dVar.f1718b == 0.0f) {
                m2414b(view);
            } else if (dVar.f1718b == 1.0f) {
                m2419c(view);
            }
        }
        if (i3 != this.f1702o) {
            this.f1702o = i3;
            if (this.f1712y != null) {
                for (int size = this.f1712y.size() - 1; size >= 0; size--) {
                    this.f1712y.get(size).mo2436a(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2403a(int i, boolean z) {
        View viewM2418c = m2418c(i);
        if (viewM2418c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2390d(i));
        }
        m2406a(viewM2418c, z);
    }

    /* JADX INFO: renamed from: a */
    public void m2404a(c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f1712y == null) {
            this.f1712y = new ArrayList();
        }
        this.f1712y.add(cVar);
    }

    /* JADX INFO: renamed from: a */
    void m2405a(View view, float f2) {
        if (this.f1712y != null) {
            for (int size = this.f1712y.size() - 1; size >= 0; size--) {
                this.f1712y.get(size).mo2438a(view, f2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2406a(View view, boolean z) {
        if (!m2428g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1704q) {
            dVar.f1718b = 1.0f;
            dVar.f1720d = 1;
            m2389c(view, true);
        } else if (z) {
            dVar.f1720d |= 2;
            if (m2409a(view, 3)) {
                this.f1698k.m2498a(view, 0, view.getTop());
            } else {
                this.f1699l.m2498a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m2420c(view, 1.0f);
            m2402a(dVar.f1717a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m2407a(Object obj, boolean z) {
        this.f1685G = obj;
        this.f1686H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    void m2408a(boolean z) {
        int childCount = getChildCount();
        boolean zM2498a = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (m2428g(childAt) && (!z || dVar.f1719c)) {
                zM2498a = m2409a(childAt, 3) ? zM2498a | this.f1698k.m2498a(childAt, -childAt.getWidth(), childAt.getTop()) : zM2498a | this.f1699l.m2498a(childAt, getWidth(), childAt.getTop());
                dVar.f1719c = false;
            }
        }
        this.f1700m.m2444a();
        this.f1701n.m2444a();
        if (zM2498a) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m2409a(View view, int i) {
        return (m2423e(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m2428g(childAt)) {
                this.f1691M.add(childAt);
            } else if (m2432j(childAt)) {
                z = true;
                childAt.addFocusables(arrayList, i, i2);
            }
        }
        if (!z) {
            int size = this.f1691M.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f1691M.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f1691M.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2400a() != null || m2428g(view)) {
            C0246q.m1738a(view, 4);
        } else {
            C0246q.m1738a(view, 1);
        }
        if (f1676b) {
            return;
        }
        C0246q.m1745a(view, this.f1692e);
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m2410b(int i) {
        int iM1692a = C0233d.m1692a(i, C0246q.m1759e(this));
        if (iM1692a == 3) {
            return this.f1683E;
        }
        if (iM1692a == 5) {
            return this.f1684F;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m2411b() {
        m2408a(false);
    }

    /* JADX INFO: renamed from: b */
    public void m2412b(int i, boolean z) {
        View viewM2418c = m2418c(i);
        if (viewM2418c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2390d(i));
        }
        m2416b(viewM2418c, z);
    }

    /* JADX INFO: renamed from: b */
    public void m2413b(c cVar) {
        if (cVar == null || this.f1712y == null) {
            return;
        }
        this.f1712y.remove(cVar);
    }

    /* JADX INFO: renamed from: b */
    void m2414b(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1720d & 1) == 1) {
            dVar.f1720d = 0;
            if (this.f1712y != null) {
                for (int size = this.f1712y.size() - 1; size >= 0; size--) {
                    this.f1712y.get(size).mo2439b(view);
                }
            }
            m2389c(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: b */
    void m2415b(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f1718b) {
            return;
        }
        dVar.f1718b = f2;
        m2405a(view, f2);
    }

    /* JADX INFO: renamed from: b */
    public void m2416b(View view, boolean z) {
        if (!m2428g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1704q) {
            dVar.f1718b = 0.0f;
            dVar.f1720d = 0;
        } else if (z) {
            dVar.f1720d |= 4;
            if (m2409a(view, 3)) {
                this.f1698k.m2498a(view, -view.getWidth(), view.getTop());
            } else {
                this.f1699l.m2498a(view, getWidth(), view.getTop());
            }
        } else {
            m2420c(view, 0.0f);
            m2402a(dVar.f1717a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    View m2417c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2428g(childAt) && m2433k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    View m2418c(int i) {
        int iM1692a = C0233d.m1692a(i, C0246q.m1759e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2423e(childAt) & 7) == iM1692a) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    void m2419c(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1720d & 1) == 0) {
            dVar.f1720d = 1;
            if (this.f1712y != null) {
                for (int size = this.f1712y.size() - 1; size >= 0; size--) {
                    this.f1712y.get(size).mo2437a(view);
                }
            }
            m2389c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m2420c(View view, float f2) {
        float fM2421d = m2421d(view);
        int width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (fM2421d * width));
        if (!m2409a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m2415b(view, f2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((d) getChildAt(i).getLayoutParams()).f1718b);
        }
        this.f1696i = fMax;
        boolean zM2499a = this.f1698k.m2499a(true);
        boolean zM2499a2 = this.f1699l.m2499a(true);
        if (zM2499a || zM2499a2) {
            C0246q.m1756c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    float m2421d(View view) {
        return ((d) view.getLayoutParams()).f1718b;
    }

    /* JADX INFO: renamed from: d */
    void m2422d() {
        if (this.f1710w) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f1710w = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int left;
        int height = getHeight();
        boolean zM2426f = m2426f(view);
        int i = 0;
        int width = getWidth();
        int iSave = canvas.save();
        if (zM2426f) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt == view || childAt.getVisibility() != 0 || !m2397m(childAt) || !m2428g(childAt)) {
                    left = width;
                } else if (childAt.getHeight() < height) {
                    left = width;
                } else if (m2409a(childAt, 3)) {
                    int right = childAt.getRight();
                    if (right <= i) {
                        right = i;
                    }
                    i = right;
                    left = width;
                } else {
                    left = childAt.getLeft();
                    if (left >= width) {
                    }
                }
                i2++;
                width = left;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        int i3 = width;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.f1696i > 0.0f && zM2426f) {
            this.f1697j.setColor((((int) (((this.f1695h & (-16777216)) >>> 24) * this.f1696i)) << 24) | (this.f1695h & 16777215));
            canvas.drawRect(i, 0.0f, i3, getHeight(), this.f1697j);
        } else if (this.f1681C != null && m2409a(view, 3)) {
            int intrinsicWidth = this.f1681C.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f1698k.m2500b(), 1.0f));
            this.f1681C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f1681C.setAlpha((int) (255.0f * fMax));
            this.f1681C.draw(canvas);
        } else if (this.f1682D != null && m2409a(view, 5)) {
            int intrinsicWidth2 = this.f1682D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1699l.m2500b(), 1.0f));
            this.f1682D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f1682D.setAlpha((int) (255.0f * fMax2));
            this.f1682D.draw(canvas);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    int m2423e(View view) {
        return C0233d.m1692a(((d) view.getLayoutParams()).f1717a, C0246q.m1759e(this));
    }

    /* JADX INFO: renamed from: e */
    public void m2424e(int i) {
        m2403a(i, true);
    }

    /* JADX INFO: renamed from: f */
    public void m2425f(int i) {
        m2412b(i, true);
    }

    /* JADX INFO: renamed from: f */
    boolean m2426f(View view) {
        return ((d) view.getLayoutParams()).f1717a == 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m2427g(int i) {
        View viewM2418c = m2418c(i);
        if (viewM2418c != null) {
            return m2432j(viewM2418c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    boolean m2428g(View view) {
        int iM1692a = C0233d.m1692a(((d) view.getLayoutParams()).f1717a, C0246q.m1759e(view));
        return ((iM1692a & 3) == 0 && (iM1692a & 5) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1678d) {
            return this.f1693f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1680B;
    }

    /* JADX INFO: renamed from: h */
    public void m2429h(View view) {
        m2406a(view, true);
    }

    /* JADX INFO: renamed from: h */
    public boolean m2430h(int i) {
        View viewM2418c = m2418c(i);
        if (viewM2418c != null) {
            return m2433k(viewM2418c);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m2431i(View view) {
        m2416b(view, true);
    }

    /* JADX INFO: renamed from: j */
    public boolean m2432j(View view) {
        if (m2428g(view)) {
            return (((d) view.getLayoutParams()).f1720d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: k */
    public boolean m2433k(View view) {
        if (m2428g(view)) {
            return ((d) view.getLayoutParams()).f1718b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1704q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1704q = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1686H || this.f1680B == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || this.f1685G == null) ? 0 : ((WindowInsets) this.f1685G).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f1680B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1680B.draw(canvas);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM2510d;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM2497a = this.f1698k.m2497a(motionEvent) | this.f1699l.m2497a(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1713z = x;
                this.f1679A = y;
                z = this.f1696i > 0.0f && (viewM2510d = this.f1698k.m2510d((int) x, (int) y)) != null && m2426f(viewM2510d);
                this.f1709v = false;
                this.f1710w = false;
                break;
            case 1:
            case 3:
                m2408a(true);
                this.f1709v = false;
                this.f1710w = false;
                z = false;
                break;
            case 2:
                if (!this.f1698k.m2511d(3)) {
                    z = false;
                } else {
                    this.f1700m.m2444a();
                    this.f1701n.m2444a();
                    z = false;
                }
                break;
        }
        return zM2497a || z || m2394h() || this.f1710w;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2395i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM2417c = m2417c();
        if (viewM2417c != null && m2399a(viewM2417c) == 0) {
            m2411b();
        }
        return viewM2417c != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        this.f1703p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (m2426f(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2409a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * dVar.f1718b)) + (-measuredWidth);
                        f2 = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * dVar.f1718b));
                        f2 = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f2 != dVar.f1718b;
                    switch (dVar.f1717a & C0025a.j.AppCompatTheme_windowFixedHeightMajor) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < dVar.topMargin) {
                                i9 = dVar.topMargin;
                            } else if (i9 + measuredHeight > i8 - dVar.bottomMargin) {
                                i9 = (i8 - dVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - dVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, dVar.topMargin, measuredWidth + i5, measuredHeight + dVar.topMargin);
                            break;
                    }
                    if (z2) {
                        m2415b(childAt, f2);
                    }
                    int i11 = dVar.f1718b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f1703p = false;
        this.f1704q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe A[PHI: r2
      0x01fe: PHI (r2v55 int) = (r2v3 int), (r2v0 int) binds: [B:25:0x0060, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 == Integer.MIN_VALUE) {
                i3 = size2;
                i4 = size;
            } else if (mode2 == 0) {
                i3 = 300;
                i4 = size;
            } else {
                i3 = size2;
                i4 = size;
            }
        }
        setMeasuredDimension(i4, i3);
        boolean z3 = this.f1685G != null && C0246q.m1770p(this);
        int iM1759e = C0246q.m1759e(this);
        boolean z4 = false;
        boolean z5 = false;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z3) {
                    int iM1692a = C0233d.m1692a(dVar.f1717a, iM1759e);
                    if (C0246q.m1770p(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f1685G;
                            if (iM1692a == 3) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            } else if (iM1692a == 5) {
                                windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f1685G;
                        if (iM1692a == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM1692a == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m2426f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((i4 - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((i3 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else {
                    if (!m2428g(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1678d && C0246q.m1766l(childAt) != this.f1693f) {
                        C0246q.m1737a(childAt, this.f1693f);
                    }
                    int iM2423e = m2423e(childAt) & 7;
                    boolean z6 = iM2423e == 3;
                    if ((z6 && z4) || (!z6 && z5)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2390d(iM2423e) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z6) {
                        boolean z7 = z5;
                        z2 = true;
                        z = z7;
                    } else {
                        z = true;
                        z2 = z4;
                    }
                    childAt.measure(getChildMeasureSpec(i, this.f1694g + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                    z4 = z2;
                    z5 = z;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewM2418c;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.m1605a());
        if (eVar.f1721a != 0 && (viewM2418c = m2418c(eVar.f1721a)) != null) {
            m2429h(viewM2418c);
        }
        if (eVar.f1722b != 3) {
            m2401a(eVar.f1722b, 3);
        }
        if (eVar.f1723c != 3) {
            m2401a(eVar.f1723c, 5);
        }
        if (eVar.f1724e != 3) {
            m2401a(eVar.f1724e, 8388611);
        }
        if (eVar.f1725f != 3) {
            m2401a(eVar.f1725f, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m2391e();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            boolean z = dVar.f1720d == 1;
            boolean z2 = dVar.f1720d == 2;
            if (z || z2) {
                eVar.f1721a = dVar.f1717a;
                break;
            }
        }
        eVar.f1722b = this.f1705r;
        eVar.f1723c = this.f1706s;
        eVar.f1724e = this.f1707t;
        eVar.f1725f = this.f1708u;
        return eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM2400a;
        this.f1698k.m2501b(motionEvent);
        this.f1699l.m2501b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1713z = x;
                this.f1679A = y;
                this.f1709v = false;
                this.f1710w = false;
                return true;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewM2510d = this.f1698k.m2510d((int) x2, (int) y2);
                if (viewM2510d == null || !m2426f(viewM2510d)) {
                    z = true;
                    m2408a(z);
                    this.f1709v = false;
                } else {
                    float f2 = x2 - this.f1713z;
                    float f3 = y2 - this.f1679A;
                    int iM2509d = this.f1698k.m2509d();
                    z = (f2 * f2) + (f3 * f3) >= ((float) (iM2509d * iM2509d)) || (viewM2400a = m2400a()) == null || m2399a(viewM2400a) == 2;
                    m2408a(z);
                    this.f1709v = false;
                }
                return true;
            case 2:
            default:
                return true;
            case 3:
                m2408a(true);
                this.f1709v = false;
                this.f1710w = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1709v = z;
        if (z) {
            m2408a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1703p) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f1693f = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2428g(childAt)) {
                C0246q.m1737a(childAt, this.f1693f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        if (this.f1711x != null) {
            m2413b(this.f1711x);
        }
        if (cVar != null) {
            m2404a(cVar);
        }
        this.f1711x = cVar;
    }

    public void setDrawerLockMode(int i) {
        m2401a(i, 3);
        m2401a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1695h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1680B = i != 0 ? C0175b.m1337a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1680B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1680B = new ColorDrawable(i);
        invalidate();
    }
}
