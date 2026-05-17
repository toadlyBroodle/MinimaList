package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0250u;
import android.support.v4.p019j.C0252w;
import android.support.v4.p019j.InterfaceC0251v;
import android.support.v4.p019j.InterfaceC0253x;
import android.support.v7.app.AbstractC0344a;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.C0387a;
import android.support.v7.view.C0393g;
import android.support.v7.view.C0394h;
import android.support.v7.view.menu.C0405h;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.C0490ba;
import android.support.v7.widget.InterfaceC0468af;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.app.u */
/* JADX INFO: loaded from: classes.dex */
public class C0364u extends AbstractC0344a implements ActionBarOverlayLayout.InterfaceC0424a {

    /* JADX INFO: renamed from: s */
    static final /* synthetic */ boolean f2070s;

    /* JADX INFO: renamed from: t */
    private static final Interpolator f2071t;

    /* JADX INFO: renamed from: u */
    private static final Interpolator f2072u;

    /* JADX INFO: renamed from: A */
    private boolean f2073A;

    /* JADX INFO: renamed from: B */
    private boolean f2074B;

    /* JADX INFO: renamed from: D */
    private boolean f2076D;

    /* JADX INFO: renamed from: F */
    private boolean f2078F;

    /* JADX INFO: renamed from: H */
    private boolean f2080H;

    /* JADX INFO: renamed from: a */
    Context f2081a;

    /* JADX INFO: renamed from: b */
    ActionBarOverlayLayout f2082b;

    /* JADX INFO: renamed from: c */
    ActionBarContainer f2083c;

    /* JADX INFO: renamed from: d */
    InterfaceC0468af f2084d;

    /* JADX INFO: renamed from: e */
    ActionBarContextView f2085e;

    /* JADX INFO: renamed from: f */
    View f2086f;

    /* JADX INFO: renamed from: g */
    C0490ba f2087g;

    /* JADX INFO: renamed from: h */
    a f2088h;

    /* JADX INFO: renamed from: i */
    AbstractC0388b f2089i;

    /* JADX INFO: renamed from: j */
    AbstractC0388b.a f2090j;

    /* JADX INFO: renamed from: l */
    boolean f2092l;

    /* JADX INFO: renamed from: m */
    boolean f2093m;

    /* JADX INFO: renamed from: n */
    C0394h f2094n;

    /* JADX INFO: renamed from: o */
    boolean f2095o;

    /* JADX INFO: renamed from: v */
    private Context f2099v;

    /* JADX INFO: renamed from: w */
    private Activity f2100w;

    /* JADX INFO: renamed from: x */
    private Dialog f2101x;

    /* JADX INFO: renamed from: y */
    private ArrayList<Object> f2102y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    private int f2103z = -1;

    /* JADX INFO: renamed from: C */
    private ArrayList<AbstractC0344a.b> f2075C = new ArrayList<>();

    /* JADX INFO: renamed from: E */
    private int f2077E = 0;

    /* JADX INFO: renamed from: k */
    boolean f2091k = true;

    /* JADX INFO: renamed from: G */
    private boolean f2079G = true;

    /* JADX INFO: renamed from: p */
    final InterfaceC0251v f2096p = new C0252w() { // from class: android.support.v7.app.u.1
        @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: b */
        public void mo1863b(View view) {
            if (C0364u.this.f2091k && C0364u.this.f2086f != null) {
                C0364u.this.f2086f.setTranslationY(0.0f);
                C0364u.this.f2083c.setTranslationY(0.0f);
            }
            C0364u.this.f2083c.setVisibility(8);
            C0364u.this.f2083c.setTransitioning(false);
            C0364u.this.f2094n = null;
            C0364u.this.m2758h();
            if (C0364u.this.f2082b != null) {
                C0246q.m1769o(C0364u.this.f2082b);
            }
        }
    };

    /* JADX INFO: renamed from: q */
    final InterfaceC0251v f2097q = new C0252w() { // from class: android.support.v7.app.u.2
        @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: b */
        public void mo1863b(View view) {
            C0364u.this.f2094n = null;
            C0364u.this.f2083c.requestLayout();
        }
    };

    /* JADX INFO: renamed from: r */
    final InterfaceC0253x f2098r = new InterfaceC0253x() { // from class: android.support.v7.app.u.3
        @Override // android.support.v4.p019j.InterfaceC0253x
        /* JADX INFO: renamed from: a */
        public void mo1865a(View view) {
            ((View) C0364u.this.f2083c.getParent()).invalidate();
        }
    };

    /* JADX INFO: renamed from: android.support.v7.app.u$a */
    public class a extends AbstractC0388b implements C0405h.a {

        /* JADX INFO: renamed from: b */
        private final Context f2108b;

        /* JADX INFO: renamed from: c */
        private final C0405h f2109c;

        /* JADX INFO: renamed from: d */
        private AbstractC0388b.a f2110d;

        /* JADX INFO: renamed from: e */
        private WeakReference<View> f2111e;

        public a(Context context, AbstractC0388b.a aVar) {
            this.f2108b = context;
            this.f2110d = aVar;
            this.f2109c = new C0405h(context).m3241a(1);
            this.f2109c.mo3249a(this);
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: a */
        public MenuInflater mo2767a() {
            return new C0393g(this.f2108b);
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: a */
        public void mo2768a(int i) {
            mo2774b(C0364u.this.f2081a.getResources().getString(i));
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public void mo424a(C0405h c0405h) {
            if (this.f2110d == null) {
                return;
            }
            mo2776d();
            C0364u.this.f2085e.mo3351a();
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: a */
        public void mo2769a(View view) {
            C0364u.this.f2085e.setCustomView(view);
            this.f2111e = new WeakReference<>(view);
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: a */
        public void mo2770a(CharSequence charSequence) {
            C0364u.this.f2085e.setSubtitle(charSequence);
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: a */
        public void mo2771a(boolean z) {
            super.mo2771a(z);
            C0364u.this.f2085e.setTitleOptional(z);
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
            if (this.f2110d != null) {
                return this.f2110d.mo2710a(this, menuItem);
            }
            return false;
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: b */
        public Menu mo2772b() {
            return this.f2109c;
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: b */
        public void mo2773b(int i) {
            mo2770a((CharSequence) C0364u.this.f2081a.getResources().getString(i));
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: b */
        public void mo2774b(CharSequence charSequence) {
            C0364u.this.f2085e.setTitle(charSequence);
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: c */
        public void mo2775c() {
            if (C0364u.this.f2088h != this) {
                return;
            }
            if (C0364u.m2747a(C0364u.this.f2092l, C0364u.this.f2093m, false)) {
                this.f2110d.mo2708a(this);
            } else {
                C0364u.this.f2089i = this;
                C0364u.this.f2090j = this.f2110d;
            }
            this.f2110d = null;
            C0364u.this.m2763j(false);
            C0364u.this.f2085e.m3352b();
            C0364u.this.f2084d.mo3813a().sendAccessibilityEvent(32);
            C0364u.this.f2082b.setHideOnContentScrollEnabled(C0364u.this.f2095o);
            C0364u.this.f2088h = null;
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: d */
        public void mo2776d() {
            if (C0364u.this.f2088h != this) {
                return;
            }
            this.f2109c.m3276g();
            try {
                this.f2110d.mo2711b(this, this.f2109c);
            } finally {
                this.f2109c.m3277h();
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m2777e() {
            this.f2109c.m3276g();
            try {
                return this.f2110d.mo2709a(this, this.f2109c);
            } finally {
                this.f2109c.m3277h();
            }
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: f */
        public CharSequence mo2778f() {
            return C0364u.this.f2085e.getTitle();
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: g */
        public CharSequence mo2779g() {
            return C0364u.this.f2085e.getSubtitle();
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: h */
        public boolean mo2780h() {
            return C0364u.this.f2085e.m3354d();
        }

        @Override // android.support.v7.view.AbstractC0388b
        /* JADX INFO: renamed from: i */
        public View mo2781i() {
            if (this.f2111e != null) {
                return this.f2111e.get();
            }
            return null;
        }
    }

    static {
        f2070s = !C0364u.class.desiredAssertionStatus();
        f2071t = new AccelerateInterpolator();
        f2072u = new DecelerateInterpolator();
    }

    public C0364u(Activity activity, boolean z) {
        this.f2100w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2746a(decorView);
        if (z) {
            return;
        }
        this.f2086f = decorView.findViewById(R.id.content);
    }

    public C0364u(Dialog dialog) {
        this.f2101x = dialog;
        m2746a(dialog.getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: a */
    private void m2746a(View view) {
        this.f2082b = (ActionBarOverlayLayout) view.findViewById(C0333a.f.decor_content_parent);
        if (this.f2082b != null) {
            this.f2082b.setActionBarVisibilityCallback(this);
        }
        this.f2084d = m2748b(view.findViewById(C0333a.f.action_bar));
        this.f2085e = (ActionBarContextView) view.findViewById(C0333a.f.action_context_bar);
        this.f2083c = (ActionBarContainer) view.findViewById(C0333a.f.action_bar_container);
        if (this.f2084d == null || this.f2085e == null || this.f2083c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2081a = this.f2084d.mo3822b();
        boolean z = (this.f2084d.mo3841o() & 4) != 0;
        if (z) {
            this.f2073A = true;
        }
        C0387a c0387aM3123a = C0387a.m3123a(this.f2081a);
        mo2553a(c0387aM3123a.m3129f() || z);
        m2749k(c0387aM3123a.m3127d());
        TypedArray typedArrayObtainStyledAttributes = this.f2081a.obtainStyledAttributes(null, C0333a.j.ActionBar, C0333a.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C0333a.j.ActionBar_hideOnContentScroll, false)) {
            mo2557b(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0333a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2548a(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    static boolean m2747a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private InterfaceC0468af m2748b(View view) {
        if (view instanceof InterfaceC0468af) {
            return (InterfaceC0468af) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* JADX INFO: renamed from: k */
    private void m2749k(boolean z) {
        this.f2076D = z;
        if (this.f2076D) {
            this.f2083c.setTabContainer(null);
            this.f2084d.mo3817a(this.f2087g);
        } else {
            this.f2084d.mo3817a((C0490ba) null);
            this.f2083c.setTabContainer(this.f2087g);
        }
        boolean z2 = m2760i() == 2;
        if (this.f2087g != null) {
            if (z2) {
                this.f2087g.setVisibility(0);
                if (this.f2082b != null) {
                    C0246q.m1769o(this.f2082b);
                }
            } else {
                this.f2087g.setVisibility(8);
            }
        }
        this.f2084d.mo3821a(!this.f2076D && z2);
        this.f2082b.setHasNonEmbeddedTabs(!this.f2076D && z2);
    }

    /* JADX INFO: renamed from: l */
    private void m2750l(boolean z) {
        if (m2747a(this.f2092l, this.f2093m, this.f2078F)) {
            if (this.f2079G) {
                return;
            }
            this.f2079G = true;
            m2759h(z);
            return;
        }
        if (this.f2079G) {
            this.f2079G = false;
            m2761i(z);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m2751n() {
        if (this.f2078F) {
            return;
        }
        this.f2078F = true;
        if (this.f2082b != null) {
            this.f2082b.setShowingForActionMode(true);
        }
        m2750l(false);
    }

    /* JADX INFO: renamed from: o */
    private void m2752o() {
        if (this.f2078F) {
            this.f2078F = false;
            if (this.f2082b != null) {
                this.f2082b.setShowingForActionMode(false);
            }
            m2750l(false);
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m2753p() {
        return C0246q.m1777w(this.f2083c);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public int mo2546a() {
        return this.f2084d.mo3841o();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public AbstractC0388b mo2547a(AbstractC0388b.a aVar) {
        if (this.f2088h != null) {
            this.f2088h.mo2775c();
        }
        this.f2082b.setHideOnContentScrollEnabled(false);
        this.f2085e.m3353c();
        a aVar2 = new a(this.f2085e.getContext(), aVar);
        if (!aVar2.m2777e()) {
            return null;
        }
        this.f2088h = aVar2;
        aVar2.mo2776d();
        this.f2085e.m3350a(aVar2);
        m2763j(true);
        this.f2085e.sendAccessibilityEvent(32);
        return aVar2;
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2548a(float f) {
        C0246q.m1737a(this.f2083c, f);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2549a(int i) {
        this.f2084d.mo3829d(i);
    }

    /* JADX INFO: renamed from: a */
    public void m2754a(int i, int i2) {
        int iMo3841o = this.f2084d.mo3841o();
        if ((i2 & 4) != 0) {
            this.f2073A = true;
        }
        this.f2084d.mo3826c((iMo3841o & (i2 ^ (-1))) | (i & i2));
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2550a(Configuration configuration) {
        m2749k(C0387a.m3123a(this.f2081a).m3127d());
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2551a(Drawable drawable) {
        this.f2084d.mo3824b(drawable);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2552a(CharSequence charSequence) {
        this.f2084d.mo3820a(charSequence);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2553a(boolean z) {
        this.f2084d.mo3825b(z);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public boolean mo2554a(int i, KeyEvent keyEvent) {
        Menu menuMo2772b;
        if (this.f2088h == null || (menuMo2772b = this.f2088h.mo2772b()) == null) {
            return false;
        }
        menuMo2772b.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo2772b.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: b */
    public Context mo2556b() {
        if (this.f2099v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2081a.getTheme().resolveAttribute(C0333a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2099v = new ContextThemeWrapper(this.f2081a, i);
            } else {
                this.f2099v = this.f2081a;
            }
        }
        return this.f2099v;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: b */
    public void mo2755b(int i) {
        this.f2077E = i;
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: b */
    public void mo2557b(boolean z) {
        if (z && !this.f2082b.m3366a()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f2095o = z;
        this.f2082b.setHideOnContentScrollEnabled(z);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: c */
    public void mo2558c(boolean z) {
        if (this.f2073A) {
            return;
        }
        m2756f(z);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: d */
    public void mo2560d(boolean z) {
        this.f2080H = z;
        if (z || this.f2094n == null) {
            return;
        }
        this.f2094n.m3161c();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: e */
    public void mo2562e(boolean z) {
        if (z == this.f2074B) {
            return;
        }
        this.f2074B = z;
        int size = this.f2075C.size();
        for (int i = 0; i < size; i++) {
            this.f2075C.get(i).m2566a(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2756f(boolean z) {
        m2754a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: f */
    public boolean mo2564f() {
        if (this.f2084d == null || !this.f2084d.mo3827c()) {
            return false;
        }
        this.f2084d.mo3828d();
        return true;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: g */
    public void mo2757g(boolean z) {
        this.f2091k = z;
    }

    /* JADX INFO: renamed from: h */
    void m2758h() {
        if (this.f2090j != null) {
            this.f2090j.mo2708a(this.f2089i);
            this.f2089i = null;
            this.f2090j = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2759h(boolean z) {
        if (this.f2094n != null) {
            this.f2094n.m3161c();
        }
        this.f2083c.setVisibility(0);
        if (this.f2077E == 0 && (this.f2080H || z)) {
            this.f2083c.setTranslationY(0.0f);
            float f = -this.f2083c.getHeight();
            if (z) {
                this.f2083c.getLocationInWindow(new int[]{0, 0});
                f -= r1[1];
            }
            this.f2083c.setTranslationY(f);
            C0394h c0394h = new C0394h();
            C0250u c0250uM1858b = C0246q.m1765k(this.f2083c).m1858b(0.0f);
            c0250uM1858b.m1856a(this.f2098r);
            c0394h.m3155a(c0250uM1858b);
            if (this.f2091k && this.f2086f != null) {
                this.f2086f.setTranslationY(f);
                c0394h.m3155a(C0246q.m1765k(this.f2086f).m1858b(0.0f));
            }
            c0394h.m3158a(f2072u);
            c0394h.m3154a(250L);
            c0394h.m3157a(this.f2097q);
            this.f2094n = c0394h;
            c0394h.m3159a();
        } else {
            this.f2083c.setAlpha(1.0f);
            this.f2083c.setTranslationY(0.0f);
            if (this.f2091k && this.f2086f != null) {
                this.f2086f.setTranslationY(0.0f);
            }
            this.f2097q.mo1863b(null);
        }
        if (this.f2082b != null) {
            C0246q.m1769o(this.f2082b);
        }
    }

    /* JADX INFO: renamed from: i */
    public int m2760i() {
        return this.f2084d.mo3842p();
    }

    /* JADX INFO: renamed from: i */
    public void m2761i(boolean z) {
        if (this.f2094n != null) {
            this.f2094n.m3161c();
        }
        if (this.f2077E != 0 || (!this.f2080H && !z)) {
            this.f2096p.mo1863b(null);
            return;
        }
        this.f2083c.setAlpha(1.0f);
        this.f2083c.setTransitioning(true);
        C0394h c0394h = new C0394h();
        float f = -this.f2083c.getHeight();
        if (z) {
            this.f2083c.getLocationInWindow(new int[]{0, 0});
            f -= r2[1];
        }
        C0250u c0250uM1858b = C0246q.m1765k(this.f2083c).m1858b(f);
        c0250uM1858b.m1856a(this.f2098r);
        c0394h.m3155a(c0250uM1858b);
        if (this.f2091k && this.f2086f != null) {
            c0394h.m3155a(C0246q.m1765k(this.f2086f).m1858b(f));
        }
        c0394h.m3158a(f2071t);
        c0394h.m3154a(250L);
        c0394h.m3157a(this.f2096p);
        this.f2094n = c0394h;
        c0394h.m3159a();
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: j */
    public void mo2762j() {
        if (this.f2093m) {
            this.f2093m = false;
            m2750l(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2763j(boolean z) {
        C0250u c0250uMo3812a;
        C0250u c0250uMo3349a;
        if (z) {
            m2751n();
        } else {
            m2752o();
        }
        if (!m2753p()) {
            if (z) {
                this.f2084d.mo3831e(4);
                this.f2085e.setVisibility(0);
                return;
            } else {
                this.f2084d.mo3831e(0);
                this.f2085e.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0250uMo3349a = this.f2084d.mo3812a(4, 100L);
            c0250uMo3812a = this.f2085e.mo3349a(0, 200L);
        } else {
            c0250uMo3812a = this.f2084d.mo3812a(0, 200L);
            c0250uMo3349a = this.f2085e.mo3349a(8, 100L);
        }
        C0394h c0394h = new C0394h();
        c0394h.m3156a(c0250uMo3349a, c0250uMo3812a);
        c0394h.m3159a();
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: k */
    public void mo2764k() {
        if (this.f2093m) {
            return;
        }
        this.f2093m = true;
        m2750l(true);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: l */
    public void mo2765l() {
        if (this.f2094n != null) {
            this.f2094n.m3161c();
            this.f2094n = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0424a
    /* JADX INFO: renamed from: m */
    public void mo2766m() {
    }
}
