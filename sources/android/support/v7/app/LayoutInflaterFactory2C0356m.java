package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.design.C0025a;
import android.support.v4.p006a.C0170z;
import android.support.v4.p019j.C0234e;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0250u;
import android.support.v4.p019j.C0252w;
import android.support.v4.p019j.C0254y;
import android.support.v4.p019j.InterfaceC0244o;
import android.support.v4.p019j.InterfaceC0251v;
import android.support.v4.widget.C0327k;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.C0390d;
import android.support.v7.view.C0391e;
import android.support.v7.view.menu.C0403f;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.C0503bn;
import android.support.v7.widget.C0506bq;
import android.support.v7.widget.C0517m;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.InterfaceC0467ae;
import android.support.v7.widget.InterfaceC0473ak;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: android.support.v7.app.m */
/* JADX INFO: loaded from: classes.dex */
class LayoutInflaterFactory2C0356m extends AbstractC0351h implements C0405h.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: t */
    private static final boolean f1966t;

    /* JADX INFO: renamed from: A */
    private View f1967A;

    /* JADX INFO: renamed from: B */
    private boolean f1968B;

    /* JADX INFO: renamed from: C */
    private boolean f1969C;

    /* JADX INFO: renamed from: D */
    private boolean f1970D;

    /* JADX INFO: renamed from: E */
    private d[] f1971E;

    /* JADX INFO: renamed from: F */
    private d f1972F;

    /* JADX INFO: renamed from: G */
    private boolean f1973G;

    /* JADX INFO: renamed from: H */
    private final Runnable f1974H;

    /* JADX INFO: renamed from: I */
    private boolean f1975I;

    /* JADX INFO: renamed from: J */
    private Rect f1976J;

    /* JADX INFO: renamed from: K */
    private Rect f1977K;

    /* JADX INFO: renamed from: L */
    private C0358o f1978L;

    /* JADX INFO: renamed from: m */
    AbstractC0388b f1979m;

    /* JADX INFO: renamed from: n */
    ActionBarContextView f1980n;

    /* JADX INFO: renamed from: o */
    PopupWindow f1981o;

    /* JADX INFO: renamed from: p */
    Runnable f1982p;

    /* JADX INFO: renamed from: q */
    C0250u f1983q;

    /* JADX INFO: renamed from: r */
    boolean f1984r;

    /* JADX INFO: renamed from: s */
    int f1985s;

    /* JADX INFO: renamed from: u */
    private InterfaceC0467ae f1986u;

    /* JADX INFO: renamed from: v */
    private a f1987v;

    /* JADX INFO: renamed from: w */
    private e f1988w;

    /* JADX INFO: renamed from: x */
    private boolean f1989x;

    /* JADX INFO: renamed from: y */
    private ViewGroup f1990y;

    /* JADX INFO: renamed from: z */
    private TextView f1991z;

    /* JADX INFO: renamed from: android.support.v7.app.m$a */
    private final class a implements InterfaceC0412o.a {
        a() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public void mo2706a(C0405h c0405h, boolean z) {
            LayoutInflaterFactory2C0356m.this.m2693b(c0405h);
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public boolean mo2707a(C0405h c0405h) {
            Window.Callback callbackR = LayoutInflaterFactory2C0356m.this.m2656r();
            if (callbackR == null) {
                return true;
            }
            callbackR.onMenuOpened(108, c0405h);
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.m$b */
    class b implements AbstractC0388b.a {

        /* JADX INFO: renamed from: b */
        private AbstractC0388b.a f2001b;

        public b(AbstractC0388b.a aVar) {
            this.f2001b = aVar;
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public void mo2708a(AbstractC0388b abstractC0388b) {
            this.f2001b.mo2708a(abstractC0388b);
            if (LayoutInflaterFactory2C0356m.this.f1981o != null) {
                LayoutInflaterFactory2C0356m.this.f1935b.getDecorView().removeCallbacks(LayoutInflaterFactory2C0356m.this.f1982p);
            }
            if (LayoutInflaterFactory2C0356m.this.f1980n != null) {
                LayoutInflaterFactory2C0356m.this.m2700u();
                LayoutInflaterFactory2C0356m.this.f1983q = C0246q.m1765k(LayoutInflaterFactory2C0356m.this.f1980n).m1853a(0.0f);
                LayoutInflaterFactory2C0356m.this.f1983q.m1855a(new C0252w() { // from class: android.support.v7.app.m.b.1
                    @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
                    /* JADX INFO: renamed from: b */
                    public void mo1863b(View view) {
                        LayoutInflaterFactory2C0356m.this.f1980n.setVisibility(8);
                        if (LayoutInflaterFactory2C0356m.this.f1981o != null) {
                            LayoutInflaterFactory2C0356m.this.f1981o.dismiss();
                        } else if (LayoutInflaterFactory2C0356m.this.f1980n.getParent() instanceof View) {
                            C0246q.m1769o((View) LayoutInflaterFactory2C0356m.this.f1980n.getParent());
                        }
                        LayoutInflaterFactory2C0356m.this.f1980n.removeAllViews();
                        LayoutInflaterFactory2C0356m.this.f1983q.m1855a((InterfaceC0251v) null);
                        LayoutInflaterFactory2C0356m.this.f1983q = null;
                    }
                });
            }
            if (LayoutInflaterFactory2C0356m.this.f1938e != null) {
                LayoutInflaterFactory2C0356m.this.f1938e.mo2612b(LayoutInflaterFactory2C0356m.this.f1979m);
            }
            LayoutInflaterFactory2C0356m.this.f1979m = null;
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2709a(AbstractC0388b abstractC0388b, Menu menu) {
            return this.f2001b.mo2709a(abstractC0388b, menu);
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2710a(AbstractC0388b abstractC0388b, MenuItem menuItem) {
            return this.f2001b.mo2710a(abstractC0388b, menuItem);
        }

        @Override // android.support.v7.view.AbstractC0388b.a
        /* JADX INFO: renamed from: b */
        public boolean mo2711b(AbstractC0388b abstractC0388b, Menu menu) {
            return this.f2001b.mo2711b(abstractC0388b, menu);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.m$c */
    private class c extends ContentFrameLayout {
        public c(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        private boolean m2712a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0356m.this.mo2648a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2712a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0356m.this.m2696e(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0366b.m2790b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.m$d */
    protected static final class d {

        /* JADX INFO: renamed from: a */
        int f2004a;

        /* JADX INFO: renamed from: b */
        int f2005b;

        /* JADX INFO: renamed from: c */
        int f2006c;

        /* JADX INFO: renamed from: d */
        int f2007d;

        /* JADX INFO: renamed from: e */
        int f2008e;

        /* JADX INFO: renamed from: f */
        int f2009f;

        /* JADX INFO: renamed from: g */
        ViewGroup f2010g;

        /* JADX INFO: renamed from: h */
        View f2011h;

        /* JADX INFO: renamed from: i */
        View f2012i;

        /* JADX INFO: renamed from: j */
        C0405h f2013j;

        /* JADX INFO: renamed from: k */
        C0403f f2014k;

        /* JADX INFO: renamed from: l */
        Context f2015l;

        /* JADX INFO: renamed from: m */
        boolean f2016m;

        /* JADX INFO: renamed from: n */
        boolean f2017n;

        /* JADX INFO: renamed from: o */
        boolean f2018o;

        /* JADX INFO: renamed from: p */
        public boolean f2019p;

        /* JADX INFO: renamed from: q */
        boolean f2020q = false;

        /* JADX INFO: renamed from: r */
        boolean f2021r;

        /* JADX INFO: renamed from: s */
        Bundle f2022s;

        d(int i) {
            this.f2004a = i;
        }

        /* JADX INFO: renamed from: a */
        InterfaceC0413p m2713a(InterfaceC0412o.a aVar) {
            if (this.f2013j == null) {
                return null;
            }
            if (this.f2014k == null) {
                this.f2014k = new C0403f(this.f2015l, C0333a.g.abc_list_menu_item_layout);
                this.f2014k.mo172a(aVar);
                this.f2013j.m3251a(this.f2014k);
            }
            return this.f2014k.m3220a(this.f2010g);
        }

        /* JADX INFO: renamed from: a */
        void m2714a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C0333a.a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(C0333a.a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(C0333a.i.Theme_AppCompat_CompactMenu, true);
            }
            C0390d c0390d = new C0390d(context, 0);
            c0390d.getTheme().setTo(themeNewTheme);
            this.f2015l = c0390d;
            TypedArray typedArrayObtainStyledAttributes = c0390d.obtainStyledAttributes(C0333a.j.AppCompatTheme);
            this.f2005b = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AppCompatTheme_panelBackground, 0);
            this.f2009f = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        void m2715a(C0405h c0405h) {
            if (c0405h == this.f2013j) {
                return;
            }
            if (this.f2013j != null) {
                this.f2013j.m3261b(this.f2014k);
            }
            this.f2013j = c0405h;
            if (c0405h == null || this.f2014k == null) {
                return;
            }
            c0405h.m3251a(this.f2014k);
        }

        /* JADX INFO: renamed from: a */
        public boolean m2716a() {
            if (this.f2011h == null) {
                return false;
            }
            return this.f2012i != null || this.f2014k.m3223d().getCount() > 0;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.m$e */
    private final class e implements InterfaceC0412o.a {
        e() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public void mo2706a(C0405h c0405h, boolean z) {
            C0405h c0405hMo3285p = c0405h.mo3285p();
            boolean z2 = c0405hMo3285p != c0405h;
            LayoutInflaterFactory2C0356m layoutInflaterFactory2C0356m = LayoutInflaterFactory2C0356m.this;
            if (z2) {
                c0405h = c0405hMo3285p;
            }
            d dVarM2687a = layoutInflaterFactory2C0356m.m2687a((Menu) c0405h);
            if (dVarM2687a != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0356m.this.m2689a(dVarM2687a, z);
                } else {
                    LayoutInflaterFactory2C0356m.this.m2688a(dVarM2687a.f2004a, dVarM2687a, c0405hMo3285p);
                    LayoutInflaterFactory2C0356m.this.m2689a(dVarM2687a, true);
                }
            }
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public boolean mo2707a(C0405h c0405h) {
            Window.Callback callbackR;
            if (c0405h != null || !LayoutInflaterFactory2C0356m.this.f1941h || (callbackR = LayoutInflaterFactory2C0356m.this.m2656r()) == null || LayoutInflaterFactory2C0356m.this.m2655q()) {
                return true;
            }
            callbackR.onMenuOpened(108, c0405h);
            return true;
        }
    }

    static {
        f1966t = Build.VERSION.SDK_INT < 21;
    }

    LayoutInflaterFactory2C0356m(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        super(context, window, interfaceC0349f);
        this.f1983q = null;
        this.f1974H = new Runnable() { // from class: android.support.v7.app.m.1
            @Override // java.lang.Runnable
            public void run() {
                if ((LayoutInflaterFactory2C0356m.this.f1985s & 1) != 0) {
                    LayoutInflaterFactory2C0356m.this.m2697f(0);
                }
                if ((LayoutInflaterFactory2C0356m.this.f1985s & 4096) != 0) {
                    LayoutInflaterFactory2C0356m.this.m2697f(108);
                }
                LayoutInflaterFactory2C0356m.this.f1984r = false;
                LayoutInflaterFactory2C0356m.this.f1985s = 0;
            }
        };
    }

    /* JADX INFO: renamed from: A */
    private void m2670A() {
        if (this.f1989x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2671a(d dVar, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (dVar.f2018o || m2655q()) {
            return;
        }
        if (dVar.f2004a == 0) {
            if ((this.f1934a.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackR = m2656r();
        if (callbackR != null && !callbackR.onMenuOpened(dVar.f2004a, dVar.f2013j)) {
            m2689a(dVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1934a.getSystemService("window");
        if (windowManager == null || !m2677b(dVar, keyEvent)) {
            return;
        }
        if (dVar.f2010g == null || dVar.f2020q) {
            if (dVar.f2010g == null) {
                if (!m2673a(dVar) || dVar.f2010g == null) {
                    return;
                }
            } else if (dVar.f2020q && dVar.f2010g.getChildCount() > 0) {
                dVar.f2010g.removeAllViews();
            }
            if (!m2678c(dVar) || !dVar.m2716a()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = dVar.f2011h.getLayoutParams();
            ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
            dVar.f2010g.setBackgroundResource(dVar.f2005b);
            ViewParent parent = dVar.f2011h.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(dVar.f2011h);
            }
            dVar.f2010g.addView(dVar.f2011h, layoutParams3);
            if (!dVar.f2011h.hasFocus()) {
                dVar.f2011h.requestFocus();
            }
            i = -2;
        } else if (dVar.f2012i == null || (layoutParams = dVar.f2012i.getLayoutParams()) == null || layoutParams.width != -1) {
            i = -2;
        }
        dVar.f2017n = false;
        WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, dVar.f2007d, dVar.f2008e, 1002, 8519680, -3);
        layoutParams4.gravity = dVar.f2006c;
        layoutParams4.windowAnimations = dVar.f2009f;
        windowManager.addView(dVar.f2010g, layoutParams4);
        dVar.f2018o = true;
    }

    /* JADX INFO: renamed from: a */
    private void m2672a(C0405h c0405h, boolean z) {
        if (this.f1986u == null || !this.f1986u.mo3370e() || (ViewConfiguration.get(this.f1934a).hasPermanentMenuKey() && !this.f1986u.mo3372g())) {
            d dVarM2686a = m2686a(0, true);
            dVarM2686a.f2020q = true;
            m2689a(dVarM2686a, false);
            m2671a(dVarM2686a, (KeyEvent) null);
            return;
        }
        Window.Callback callbackR = m2656r();
        if (this.f1986u.mo3371f() && z) {
            this.f1986u.mo3374i();
            if (m2655q()) {
                return;
            }
            callbackR.onPanelClosed(108, m2686a(0, true).f2013j);
            return;
        }
        if (callbackR == null || m2655q()) {
            return;
        }
        if (this.f1984r && (this.f1985s & 1) != 0) {
            this.f1935b.getDecorView().removeCallbacks(this.f1974H);
            this.f1974H.run();
        }
        d dVarM2686a2 = m2686a(0, true);
        if (dVarM2686a2.f2013j == null || dVarM2686a2.f2021r || !callbackR.onPreparePanel(0, dVarM2686a2.f2012i, dVarM2686a2.f2013j)) {
            return;
        }
        callbackR.onMenuOpened(108, dVarM2686a2.f2013j);
        this.f1986u.mo3373h();
    }

    /* JADX INFO: renamed from: a */
    private boolean m2673a(d dVar) {
        dVar.m2714a(m2653o());
        dVar.f2010g = new c(dVar.f2015l);
        dVar.f2006c = 81;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2674a(d dVar, int i, KeyEvent keyEvent, int i2) {
        boolean zPerformShortcut = false;
        if (!keyEvent.isSystem()) {
            if ((dVar.f2016m || m2677b(dVar, keyEvent)) && dVar.f2013j != null) {
                zPerformShortcut = dVar.f2013j.performShortcut(i, keyEvent, i2);
            }
            if (zPerformShortcut && (i2 & 1) == 0 && this.f1986u == null) {
                m2689a(dVar, true);
            }
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2675a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1935b.getDecorView();
        for (ViewParent parent = viewParent; parent != null; parent = parent.getParent()) {
            if (parent == decorView || !(parent instanceof View) || C0246q.m1780z((View) parent)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m2676b(d dVar) {
        Context c0390d;
        Context context = this.f1934a;
        if ((dVar.f2004a == 0 || dVar.f2004a == 108) && this.f1986u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0333a.a.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C0333a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0333a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            Resources.Theme theme2 = themeNewTheme;
            if (theme2 != null) {
                c0390d = new C0390d(context, 0);
                c0390d.getTheme().setTo(theme2);
            } else {
                c0390d = context;
            }
        }
        C0405h c0405h = new C0405h(c0390d);
        c0405h.mo3249a(this);
        dVar.m2715a(c0405h);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m2677b(d dVar, KeyEvent keyEvent) {
        if (m2655q()) {
            return false;
        }
        if (dVar.f2016m) {
            return true;
        }
        if (this.f1972F != null && this.f1972F != dVar) {
            m2689a(this.f1972F, false);
        }
        Window.Callback callbackR = m2656r();
        if (callbackR != null) {
            dVar.f2012i = callbackR.onCreatePanelView(dVar.f2004a);
        }
        boolean z = dVar.f2004a == 0 || dVar.f2004a == 108;
        if (z && this.f1986u != null) {
            this.f1986u.mo3375j();
        }
        if (dVar.f2012i == null && (!z || !(m2652n() instanceof C0361r))) {
            if (dVar.f2013j == null || dVar.f2021r) {
                if (dVar.f2013j == null && (!m2676b(dVar) || dVar.f2013j == null)) {
                    return false;
                }
                if (z && this.f1986u != null) {
                    if (this.f1987v == null) {
                        this.f1987v = new a();
                    }
                    this.f1986u.mo3365a(dVar.f2013j, this.f1987v);
                }
                dVar.f2013j.m3276g();
                if (!callbackR.onCreatePanelMenu(dVar.f2004a, dVar.f2013j)) {
                    dVar.m2715a((C0405h) null);
                    if (!z || this.f1986u == null) {
                        return false;
                    }
                    this.f1986u.mo3365a(null, this.f1987v);
                    return false;
                }
                dVar.f2021r = false;
            }
            dVar.f2013j.m3276g();
            if (dVar.f2022s != null) {
                dVar.f2013j.m3271d(dVar.f2022s);
                dVar.f2022s = null;
            }
            if (!callbackR.onPreparePanel(0, dVar.f2012i, dVar.f2013j)) {
                if (z && this.f1986u != null) {
                    this.f1986u.mo3365a(null, this.f1987v);
                }
                dVar.f2013j.m3277h();
                return false;
            }
            dVar.f2019p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dVar.f2013j.setQwertyMode(dVar.f2019p);
            dVar.f2013j.m3277h();
        }
        dVar.f2016m = true;
        dVar.f2017n = false;
        this.f1972F = dVar;
        return true;
    }

    /* JADX INFO: renamed from: c */
    private boolean m2678c(d dVar) {
        if (dVar.f2012i != null) {
            dVar.f2011h = dVar.f2012i;
            return true;
        }
        if (dVar.f2013j == null) {
            return false;
        }
        if (this.f1988w == null) {
            this.f1988w = new e();
        }
        dVar.f2011h = (View) dVar.m2713a(this.f1988w);
        return dVar.f2011h != null;
    }

    /* JADX INFO: renamed from: d */
    private void m2679d(int i) {
        this.f1985s |= 1 << i;
        if (this.f1984r) {
            return;
        }
        C0246q.m1747a(this.f1935b.getDecorView(), this.f1974H);
        this.f1984r = true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m2680d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            d dVarM2686a = m2686a(i, true);
            if (!dVarM2686a.f2018o) {
                return m2677b(dVarM2686a, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m2681e(int i, KeyEvent keyEvent) {
        boolean zM2677b;
        boolean zMo3374i = true;
        if (this.f1979m != null) {
            return false;
        }
        d dVarM2686a = m2686a(i, true);
        if (i != 0 || this.f1986u == null || !this.f1986u.mo3370e() || ViewConfiguration.get(this.f1934a).hasPermanentMenuKey()) {
            if (dVarM2686a.f2018o || dVarM2686a.f2017n) {
                boolean z = dVarM2686a.f2018o;
                m2689a(dVarM2686a, true);
                zMo3374i = z;
            } else if (dVarM2686a.f2016m) {
                if (dVarM2686a.f2021r) {
                    dVarM2686a.f2016m = false;
                    zM2677b = m2677b(dVarM2686a, keyEvent);
                } else {
                    zM2677b = true;
                }
                if (zM2677b) {
                    m2671a(dVarM2686a, keyEvent);
                }
            } else {
                zMo3374i = false;
            }
        } else if (this.f1986u.mo3371f()) {
            zMo3374i = this.f1986u.mo3374i();
        } else if (!m2655q() && m2677b(dVarM2686a, keyEvent)) {
            zMo3374i = this.f1986u.mo3373h();
        }
        if (zMo3374i) {
            AudioManager audioManager = (AudioManager) this.f1934a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zMo3374i;
    }

    /* JADX INFO: renamed from: h */
    private int m2682h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return C0025a.j.AppCompatTheme_windowActionBar;
    }

    /* JADX INFO: renamed from: x */
    private void m2683x() {
        if (this.f1989x) {
            return;
        }
        this.f1990y = m2684y();
        CharSequence charSequenceS = m2657s();
        if (!TextUtils.isEmpty(charSequenceS)) {
            mo2649b(charSequenceS);
        }
        m2685z();
        m2690a(this.f1990y);
        this.f1989x = true;
        d dVarM2686a = m2686a(0, false);
        if (m2655q()) {
            return;
        }
        if (dVarM2686a == null || dVarM2686a.f2013j == null) {
            m2679d(108);
        }
    }

    /* JADX INFO: renamed from: y */
    private ViewGroup m2684y() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f1934a.obtainStyledAttributes(C0333a.j.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AppCompatTheme_windowNoTitle, false)) {
            mo2636c(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AppCompatTheme_windowActionBar, false)) {
            mo2636c(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo2636c(C0025a.j.AppCompatTheme_windowActionBar);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo2636c(10);
        }
        this.f1944k = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f1935b.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1934a);
        if (this.f1945l) {
            ViewGroup viewGroup2 = this.f1943j ? (ViewGroup) layoutInflaterFrom.inflate(C0333a.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C0333a.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0246q.m1746a(viewGroup2, new InterfaceC0244o() { // from class: android.support.v7.app.m.2
                    @Override // android.support.v4.p019j.InterfaceC0244o
                    /* JADX INFO: renamed from: a */
                    public C0254y mo213a(View view, C0254y c0254y) {
                        int iM1870b = c0254y.m1870b();
                        int iM2698g = LayoutInflaterFactory2C0356m.this.m2698g(iM1870b);
                        if (iM1870b != iM2698g) {
                            c0254y = c0254y.m1869a(c0254y.m1868a(), iM2698g, c0254y.m1871c(), c0254y.m1872d());
                        }
                        return C0246q.m1736a(view, c0254y);
                    }
                });
                viewGroup = viewGroup2;
            } else {
                ((InterfaceC0473ak) viewGroup2).setOnFitSystemWindowsListener(new InterfaceC0473ak.a() { // from class: android.support.v7.app.m.3
                    @Override // android.support.v7.widget.InterfaceC0473ak.a
                    /* JADX INFO: renamed from: a */
                    public void mo2703a(Rect rect) {
                        rect.top = LayoutInflaterFactory2C0356m.this.m2698g(rect.top);
                    }
                });
                viewGroup = viewGroup2;
            }
        } else if (this.f1944k) {
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(C0333a.g.abc_dialog_title_material, (ViewGroup) null);
            this.f1942i = false;
            this.f1941h = false;
            viewGroup = viewGroup3;
        } else if (this.f1941h) {
            TypedValue typedValue = new TypedValue();
            this.f1934a.getTheme().resolveAttribute(C0333a.a.actionBarTheme, typedValue, true);
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0390d(this.f1934a, typedValue.resourceId) : this.f1934a).inflate(C0333a.g.abc_screen_toolbar, (ViewGroup) null);
            this.f1986u = (InterfaceC0467ae) viewGroup4.findViewById(C0333a.f.decor_content_parent);
            this.f1986u.setWindowCallback(m2656r());
            if (this.f1942i) {
                this.f1986u.mo3364a(C0025a.j.AppCompatTheme_windowActionBar);
            }
            if (this.f1968B) {
                this.f1986u.mo3364a(2);
            }
            if (this.f1969C) {
                this.f1986u.mo3364a(5);
            }
            viewGroup = viewGroup4;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1941h + ", windowActionBarOverlay: " + this.f1942i + ", android:windowIsFloating: " + this.f1944k + ", windowActionModeOverlay: " + this.f1943j + ", windowNoTitle: " + this.f1945l + " }");
        }
        if (this.f1986u == null) {
            this.f1991z = (TextView) viewGroup.findViewById(C0333a.f.title);
        }
        C0506bq.m4583b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0333a.f.action_bar_activity_content);
        ViewGroup viewGroup5 = (ViewGroup) this.f1935b.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.f1935b.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.InterfaceC0433a() { // from class: android.support.v7.app.m.4
            @Override // android.support.v7.widget.ContentFrameLayout.InterfaceC0433a
            /* JADX INFO: renamed from: a */
            public void mo2704a() {
            }

            @Override // android.support.v7.widget.ContentFrameLayout.InterfaceC0433a
            /* JADX INFO: renamed from: b */
            public void mo2705b() {
                LayoutInflaterFactory2C0356m.this.m2702w();
            }
        });
        return viewGroup;
    }

    /* JADX INFO: renamed from: z */
    private void m2685z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1990y.findViewById(R.id.content);
        View decorView = this.f1935b.getDecorView();
        contentFrameLayout.m3416a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f1934a.obtainStyledAttributes(C0333a.j.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(C0333a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: renamed from: a */
    protected d m2686a(int i, boolean z) {
        d[] dVarArr = this.f1971E;
        if (dVarArr == null || dVarArr.length <= i) {
            d[] dVarArr2 = new d[i + 1];
            if (dVarArr != null) {
                System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
            }
            this.f1971E = dVarArr2;
            dVarArr = dVarArr2;
        }
        d dVar = dVarArr[i];
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(i);
        dVarArr[i] = dVar2;
        return dVar2;
    }

    /* JADX INFO: renamed from: a */
    d m2687a(Menu menu) {
        d[] dVarArr = this.f1971E;
        int length = dVarArr != null ? dVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            d dVar = dVarArr[i];
            if (dVar != null && dVar.f2013j == menu) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    AbstractC0388b mo2644a(AbstractC0388b.a aVar) {
        AbstractC0388b abstractC0388bMo2605a;
        Context c0390d;
        m2700u();
        if (this.f1979m != null) {
            this.f1979m.mo2775c();
        }
        if (!(aVar instanceof b)) {
            aVar = new b(aVar);
        }
        if (this.f1938e == null || m2655q()) {
            abstractC0388bMo2605a = null;
        } else {
            try {
                abstractC0388bMo2605a = this.f1938e.mo2605a(aVar);
            } catch (AbstractMethodError e2) {
                abstractC0388bMo2605a = null;
            }
        }
        if (abstractC0388bMo2605a != null) {
            this.f1979m = abstractC0388bMo2605a;
        } else {
            if (this.f1980n == null) {
                if (this.f1944k) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f1934a.getTheme();
                    theme.resolveAttribute(C0333a.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f1934a.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c0390d = new C0390d(this.f1934a, 0);
                        c0390d.getTheme().setTo(themeNewTheme);
                    } else {
                        c0390d = this.f1934a;
                    }
                    this.f1980n = new ActionBarContextView(c0390d);
                    this.f1981o = new PopupWindow(c0390d, (AttributeSet) null, C0333a.a.actionModePopupWindowStyle);
                    C0327k.m2461a(this.f1981o, 2);
                    this.f1981o.setContentView(this.f1980n);
                    this.f1981o.setWidth(-1);
                    c0390d.getTheme().resolveAttribute(C0333a.a.actionBarSize, typedValue, true);
                    this.f1980n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0390d.getResources().getDisplayMetrics()));
                    this.f1981o.setHeight(-2);
                    this.f1982p = new Runnable() { // from class: android.support.v7.app.m.5
                        @Override // java.lang.Runnable
                        public void run() {
                            LayoutInflaterFactory2C0356m.this.f1981o.showAtLocation(LayoutInflaterFactory2C0356m.this.f1980n, 55, 0, 0);
                            LayoutInflaterFactory2C0356m.this.m2700u();
                            if (!LayoutInflaterFactory2C0356m.this.m2699t()) {
                                LayoutInflaterFactory2C0356m.this.f1980n.setAlpha(1.0f);
                                LayoutInflaterFactory2C0356m.this.f1980n.setVisibility(0);
                            } else {
                                LayoutInflaterFactory2C0356m.this.f1980n.setAlpha(0.0f);
                                LayoutInflaterFactory2C0356m.this.f1983q = C0246q.m1765k(LayoutInflaterFactory2C0356m.this.f1980n).m1853a(1.0f);
                                LayoutInflaterFactory2C0356m.this.f1983q.m1855a(new C0252w() { // from class: android.support.v7.app.m.5.1
                                    @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
                                    /* JADX INFO: renamed from: a */
                                    public void mo1862a(View view) {
                                        LayoutInflaterFactory2C0356m.this.f1980n.setVisibility(0);
                                    }

                                    @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
                                    /* JADX INFO: renamed from: b */
                                    public void mo1863b(View view) {
                                        LayoutInflaterFactory2C0356m.this.f1980n.setAlpha(1.0f);
                                        LayoutInflaterFactory2C0356m.this.f1983q.m1855a((InterfaceC0251v) null);
                                        LayoutInflaterFactory2C0356m.this.f1983q = null;
                                    }
                                });
                            }
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f1990y.findViewById(C0333a.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m2653o()));
                        this.f1980n = (ActionBarContextView) viewStubCompat.m3737a();
                    }
                }
            }
            if (this.f1980n != null) {
                m2700u();
                this.f1980n.m3353c();
                C0391e c0391e = new C0391e(this.f1980n.getContext(), this.f1980n, aVar, this.f1981o == null);
                if (aVar.mo2709a(c0391e, c0391e.mo2772b())) {
                    c0391e.mo2776d();
                    this.f1980n.m3350a(c0391e);
                    this.f1979m = c0391e;
                    if (m2699t()) {
                        this.f1980n.setAlpha(0.0f);
                        this.f1983q = C0246q.m1765k(this.f1980n).m1853a(1.0f);
                        this.f1983q.m1855a(new C0252w() { // from class: android.support.v7.app.m.6
                            @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
                            /* JADX INFO: renamed from: a */
                            public void mo1862a(View view) {
                                LayoutInflaterFactory2C0356m.this.f1980n.setVisibility(0);
                                LayoutInflaterFactory2C0356m.this.f1980n.sendAccessibilityEvent(32);
                                if (LayoutInflaterFactory2C0356m.this.f1980n.getParent() instanceof View) {
                                    C0246q.m1769o((View) LayoutInflaterFactory2C0356m.this.f1980n.getParent());
                                }
                            }

                            @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
                            /* JADX INFO: renamed from: b */
                            public void mo1863b(View view) {
                                LayoutInflaterFactory2C0356m.this.f1980n.setAlpha(1.0f);
                                LayoutInflaterFactory2C0356m.this.f1983q.m1855a((InterfaceC0251v) null);
                                LayoutInflaterFactory2C0356m.this.f1983q = null;
                            }
                        });
                    } else {
                        this.f1980n.setAlpha(1.0f);
                        this.f1980n.setVisibility(0);
                        this.f1980n.sendAccessibilityEvent(32);
                        if (this.f1980n.getParent() instanceof View) {
                            C0246q.m1769o((View) this.f1980n.getParent());
                        }
                    }
                    if (this.f1981o != null) {
                        this.f1935b.getDecorView().post(this.f1982p);
                    }
                } else {
                    this.f1979m = null;
                }
            }
        }
        if (this.f1979m != null && this.f1938e != null) {
            this.f1938e.mo2607a(this.f1979m);
        }
        return this.f1979m;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public <T extends View> T mo2623a(int i) {
        m2683x();
        return (T) this.f1935b.findViewById(i);
    }

    /* JADX INFO: renamed from: a */
    View mo2659a(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView;
        if (!(this.f1936c instanceof LayoutInflater.Factory) || (viewOnCreateView = ((LayoutInflater.Factory) this.f1936c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return viewOnCreateView;
    }

    /* JADX INFO: renamed from: a */
    void m2688a(int i, d dVar, Menu menu) {
        if (menu == null) {
            if (dVar == null && i >= 0 && i < this.f1971E.length) {
                dVar = this.f1971E[i];
            }
            if (dVar != null) {
                menu = dVar.f2013j;
            }
        }
        if ((dVar == null || dVar.f2018o) && !m2655q()) {
            this.f1936c.onPanelClosed(i, menu);
        }
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    void mo2646a(int i, Menu menu) {
        if (i == 108) {
            AbstractC0344a abstractC0344aA = mo2622a();
            if (abstractC0344aA != null) {
                abstractC0344aA.mo2562e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            d dVarM2686a = m2686a(i, true);
            if (dVarM2686a.f2018o) {
                m2689a(dVarM2686a, false);
            }
        }
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2624a(Configuration configuration) {
        AbstractC0344a abstractC0344aA;
        if (this.f1941h && this.f1989x && (abstractC0344aA = mo2622a()) != null) {
            abstractC0344aA.mo2550a(configuration);
        }
        C0517m.m4669a().m4691a(this.f1934a);
        mo2643j();
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2625a(Bundle bundle) {
        if (!(this.f1936c instanceof Activity) || C0170z.m1289b((Activity) this.f1936c) == null) {
            return;
        }
        AbstractC0344a abstractC0344aN = m2652n();
        if (abstractC0344aN == null) {
            this.f1975I = true;
        } else {
            abstractC0344aN.mo2558c(true);
        }
    }

    /* JADX INFO: renamed from: a */
    void m2689a(d dVar, boolean z) {
        if (z && dVar.f2004a == 0 && this.f1986u != null && this.f1986u.mo3371f()) {
            m2693b(dVar.f2013j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1934a.getSystemService("window");
        if (windowManager != null && dVar.f2018o && dVar.f2010g != null) {
            windowManager.removeView(dVar.f2010g);
            if (z) {
                m2688a(dVar.f2004a, dVar, (Menu) null);
            }
        }
        dVar.f2016m = false;
        dVar.f2017n = false;
        dVar.f2018o = false;
        dVar.f2011h = null;
        dVar.f2020q = true;
        if (this.f1972F == dVar) {
            this.f1972F = null;
        }
    }

    @Override // android.support.v7.view.menu.C0405h.a
    /* JADX INFO: renamed from: a */
    public void mo424a(C0405h c0405h) {
        m2672a(c0405h, true);
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2626a(Toolbar toolbar) {
        if (this.f1936c instanceof Activity) {
            AbstractC0344a abstractC0344aA = mo2622a();
            if (abstractC0344aA instanceof C0364u) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f1940g = null;
            if (abstractC0344aA != null) {
                abstractC0344aA.mo2565g();
            }
            if (toolbar != null) {
                C0361r c0361r = new C0361r(toolbar, ((Activity) this.f1936c).getTitle(), this.f1937d);
                this.f1939f = c0361r;
                this.f1935b.setCallback(c0361r.m2735h());
            } else {
                this.f1939f = null;
                this.f1935b.setCallback(this.f1937d);
            }
            mo2639f();
        }
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2627a(View view) {
        m2683x();
        ViewGroup viewGroup = (ViewGroup) this.f1990y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1936c.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2628a(View view, ViewGroup.LayoutParams layoutParams) {
        m2683x();
        ViewGroup viewGroup = (ViewGroup) this.f1990y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1936c.onContentChanged();
    }

    /* JADX INFO: renamed from: a */
    void m2690a(ViewGroup viewGroup) {
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    boolean mo2647a(int i, KeyEvent keyEvent) {
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA != null && abstractC0344aA.mo2554a(i, keyEvent)) {
            return true;
        }
        if (this.f1972F != null && m2674a(this.f1972F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1972F == null) {
                return true;
            }
            this.f1972F.f2017n = true;
            return true;
        }
        if (this.f1972F == null) {
            d dVarM2686a = m2686a(0, true);
            m2677b(dVarM2686a, keyEvent);
            boolean zM2674a = m2674a(dVarM2686a, keyEvent.getKeyCode(), keyEvent, 1);
            dVarM2686a.f2016m = false;
            if (zM2674a) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.C0405h.a
    /* JADX INFO: renamed from: a */
    public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
        d dVarM2687a;
        Window.Callback callbackR = m2656r();
        if (callbackR == null || m2655q() || (dVarM2687a = m2687a((Menu) c0405h.mo3285p())) == null) {
            return false;
        }
        return callbackR.onMenuItemSelected(dVarM2687a.f2004a, menuItem);
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    boolean mo2648a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.f1936c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m2695c(keyCode, keyEvent) : m2694b(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0388b m2691b(AbstractC0388b.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f1979m != null) {
            this.f1979m.mo2775c();
        }
        b bVar = new b(aVar);
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA != null) {
            this.f1979m = abstractC0344aA.mo2547a(bVar);
            if (this.f1979m != null && this.f1938e != null) {
                this.f1938e.mo2607a(this.f1979m);
            }
        }
        if (this.f1979m == null) {
            this.f1979m = mo2644a(bVar);
        }
        return this.f1979m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public View m2692b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zM2675a;
        if (this.f1978L == null) {
            this.f1978L = new C0358o();
        }
        if (f1966t) {
            zM2675a = attributeSet instanceof XmlPullParser ? ((XmlPullParser) attributeSet).getDepth() > 1 : m2675a((ViewParent) view);
        } else {
            zM2675a = false;
        }
        return this.f1978L.m2724a(view, str, context, attributeSet, zM2675a, f1966t, true, C0503bn.m4552a());
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: b */
    public void mo2631b(int i) {
        m2683x();
        ViewGroup viewGroup = (ViewGroup) this.f1990y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1934a).inflate(i, viewGroup);
        this.f1936c.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: b */
    public void mo2632b(Bundle bundle) {
        m2683x();
    }

    /* JADX INFO: renamed from: b */
    void m2693b(C0405h c0405h) {
        if (this.f1970D) {
            return;
        }
        this.f1970D = true;
        this.f1986u.mo3376k();
        Window.Callback callbackR = m2656r();
        if (callbackR != null && !m2655q()) {
            callbackR.onPanelClosed(108, c0405h);
        }
        this.f1970D = false;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: b */
    public void mo2633b(View view, ViewGroup.LayoutParams layoutParams) {
        m2683x();
        ((ViewGroup) this.f1990y.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1936c.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: b */
    void mo2649b(CharSequence charSequence) {
        if (this.f1986u != null) {
            this.f1986u.setWindowTitle(charSequence);
        } else if (m2652n() != null) {
            m2652n().mo2552a(charSequence);
        } else if (this.f1991z != null) {
            this.f1991z.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: b */
    boolean m2694b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                boolean z = this.f1973G;
                this.f1973G = false;
                d dVarM2686a = m2686a(0, false);
                if (dVarM2686a != null && dVarM2686a.f2018o) {
                    if (z) {
                        return true;
                    }
                    m2689a(dVarM2686a, true);
                    return true;
                }
                if (m2701v()) {
                    return true;
                }
                break;
            case 82:
                m2681e(0, keyEvent);
                return true;
        }
        return false;
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: b */
    boolean mo2650b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA == null) {
            return true;
        }
        abstractC0344aA.mo2562e(true);
        return true;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: c */
    public boolean mo2636c(int i) {
        int iM2682h = m2682h(i);
        if (this.f1945l && iM2682h == 108) {
            return false;
        }
        if (this.f1941h && iM2682h == 1) {
            this.f1941h = false;
        }
        switch (iM2682h) {
            case 1:
                m2670A();
                this.f1945l = true;
                return true;
            case 2:
                m2670A();
                this.f1968B = true;
                return true;
            case 5:
                m2670A();
                this.f1969C = true;
                return true;
            case 10:
                m2670A();
                this.f1943j = true;
                return true;
            case 108:
                m2670A();
                this.f1941h = true;
                return true;
            case C0025a.j.AppCompatTheme_windowActionBar /* 109 */:
                m2670A();
                this.f1942i = true;
                return true;
            default:
                return this.f1935b.requestFeature(iM2682h);
        }
    }

    /* JADX INFO: renamed from: c */
    boolean m2695c(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                this.f1973G = (keyEvent.getFlags() & 128) != 0;
                break;
            case 82:
                m2680d(0, keyEvent);
                return true;
        }
        return false;
    }

    @Override // android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: d */
    public void mo2637d() {
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA != null) {
            abstractC0344aA.mo2560d(false);
        }
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: e */
    public void mo2638e() {
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA != null) {
            abstractC0344aA.mo2560d(true);
        }
    }

    /* JADX INFO: renamed from: e */
    void m2696e(int i) {
        m2689a(m2686a(i, true), true);
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: f */
    public void mo2639f() {
        AbstractC0344a abstractC0344aA = mo2622a();
        if (abstractC0344aA == null || !abstractC0344aA.mo2563e()) {
            m2679d(0);
        }
    }

    /* JADX INFO: renamed from: f */
    void m2697f(int i) {
        d dVarM2686a;
        d dVarM2686a2 = m2686a(i, true);
        if (dVarM2686a2.f2013j != null) {
            Bundle bundle = new Bundle();
            dVarM2686a2.f2013j.m3265c(bundle);
            if (bundle.size() > 0) {
                dVarM2686a2.f2022s = bundle;
            }
            dVarM2686a2.f2013j.m3276g();
            dVarM2686a2.f2013j.clear();
        }
        dVarM2686a2.f2021r = true;
        dVarM2686a2.f2020q = true;
        if ((i != 108 && i != 0) || this.f1986u == null || (dVarM2686a = m2686a(0, false)) == null) {
            return;
        }
        dVarM2686a.f2016m = false;
        m2677b(dVarM2686a, (KeyEvent) null);
    }

    /* JADX INFO: renamed from: g */
    int m2698g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f1980n == null || !(this.f1980n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1980n.getLayoutParams();
            if (this.f1980n.isShown()) {
                if (this.f1976J == null) {
                    this.f1976J = new Rect();
                    this.f1977K = new Rect();
                }
                Rect rect = this.f1976J;
                Rect rect2 = this.f1977K;
                rect.set(0, i, 0, 0);
                C0506bq.m4581a(this.f1990y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f1967A == null) {
                        this.f1967A = new View(this.f1934a);
                        this.f1967A.setBackgroundColor(this.f1934a.getResources().getColor(C0333a.c.abc_input_method_navigation_guard));
                        this.f1990y.addView(this.f1967A, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f1967A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1967A.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                z = this.f1967A != null;
                if (!this.f1943j && z) {
                    i = 0;
                }
                boolean z4 = z3;
                z2 = z;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                this.f1980n.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.f1967A != null) {
            this.f1967A.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    @Override // android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: g */
    public void mo2640g() {
        if (this.f1984r) {
            this.f1935b.getDecorView().removeCallbacks(this.f1974H);
        }
        super.mo2640g();
        if (this.f1939f != null) {
            this.f1939f.mo2565g();
        }
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: i */
    public void mo2642i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1934a);
        if (layoutInflaterFrom.getFactory() == null) {
            C0234e.m1695b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0356m) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: m */
    public void mo2651m() {
        m2683x();
        if (this.f1941h && this.f1939f == null) {
            if (this.f1936c instanceof Activity) {
                this.f1939f = new C0364u((Activity) this.f1936c, this.f1942i);
            } else if (this.f1936c instanceof Dialog) {
                this.f1939f = new C0364u((Dialog) this.f1936c);
            }
            if (this.f1939f != null) {
                this.f1939f.mo2558c(this.f1975I);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewMo2659a = mo2659a(view, str, context, attributeSet);
        return viewMo2659a != null ? viewMo2659a : m2692b(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: t */
    final boolean m2699t() {
        return this.f1989x && this.f1990y != null && C0246q.m1777w(this.f1990y);
    }

    /* JADX INFO: renamed from: u */
    void m2700u() {
        if (this.f1983q != null) {
            this.f1983q.m1860b();
        }
    }

    /* JADX INFO: renamed from: v */
    boolean m2701v() {
        if (this.f1979m != null) {
            this.f1979m.mo2775c();
            return true;
        }
        AbstractC0344a abstractC0344aA = mo2622a();
        return abstractC0344aA != null && abstractC0344aA.mo2564f();
    }

    /* JADX INFO: renamed from: w */
    void m2702w() {
        if (this.f1986u != null) {
            this.f1986u.mo3376k();
        }
        if (this.f1981o != null) {
            this.f1935b.getDecorView().removeCallbacks(this.f1982p);
            if (this.f1981o.isShowing()) {
                try {
                    this.f1981o.dismiss();
                } catch (IllegalArgumentException e2) {
                }
            }
            this.f1981o = null;
        }
        m2700u();
        d dVarM2686a = m2686a(0, false);
        if (dVarM2686a == null || dVarM2686a.f2013j == null) {
            return;
        }
        dVarM2686a.f2013j.close();
    }
}
