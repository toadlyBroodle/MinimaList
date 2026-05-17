package android.support.v7.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.C0322f;
import android.support.v7.app.C0346c;
import android.support.v7.p025c.p026a.C0369b;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.app.b */
/* JADX INFO: loaded from: classes.dex */
public class C0345b implements C0322f.c {

    /* JADX INFO: renamed from: a */
    boolean f1901a;

    /* JADX INFO: renamed from: b */
    View.OnClickListener f1902b;

    /* JADX INFO: renamed from: c */
    private final a f1903c;

    /* JADX INFO: renamed from: d */
    private final C0322f f1904d;

    /* JADX INFO: renamed from: e */
    private C0369b f1905e;

    /* JADX INFO: renamed from: f */
    private boolean f1906f;

    /* JADX INFO: renamed from: g */
    private Drawable f1907g;

    /* JADX INFO: renamed from: h */
    private boolean f1908h;

    /* JADX INFO: renamed from: i */
    private final int f1909i;

    /* JADX INFO: renamed from: j */
    private final int f1910j;

    /* JADX INFO: renamed from: k */
    private boolean f1911k;

    /* JADX INFO: renamed from: android.support.v7.app.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Drawable mo2580a();

        /* JADX INFO: renamed from: a */
        void mo2581a(int i);

        /* JADX INFO: renamed from: a */
        void mo2582a(Drawable drawable, int i);

        /* JADX INFO: renamed from: b */
        Context mo2583b();

        /* JADX INFO: renamed from: c */
        boolean mo2584c();
    }

    /* JADX INFO: renamed from: android.support.v7.app.b$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        a mo2585b();
    }

    /* JADX INFO: renamed from: android.support.v7.app.b$c */
    private static class c implements a {

        /* JADX INFO: renamed from: a */
        final Activity f1913a;

        /* JADX INFO: renamed from: b */
        C0346c.a f1914b;

        c(Activity activity) {
            this.f1913a = activity;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public Drawable mo2580a() {
            return C0346c.m2586a(this.f1913a);
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2581a(int i) {
            this.f1914b = C0346c.m2587a(this.f1914b, this.f1913a, i);
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2582a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1913a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f1914b = C0346c.m2588a(this.f1914b, this.f1913a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: b */
        public Context mo2583b() {
            ActionBar actionBar = this.f1913a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1913a;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2584c() {
            ActionBar actionBar = this.f1913a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.b$d */
    private static class d implements a {

        /* JADX INFO: renamed from: a */
        final Activity f1915a;

        d(Activity activity) {
            this.f1915a = activity;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public Drawable mo2580a() {
            TypedArray typedArrayObtainStyledAttributes = mo2583b().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2581a(int i) {
            ActionBar actionBar = this.f1915a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2582a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1915a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: b */
        public Context mo2583b() {
            ActionBar actionBar = this.f1915a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1915a;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2584c() {
            ActionBar actionBar = this.f1915a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.b$e */
    static class e implements a {

        /* JADX INFO: renamed from: a */
        final Toolbar f1916a;

        /* JADX INFO: renamed from: b */
        final Drawable f1917b;

        /* JADX INFO: renamed from: c */
        final CharSequence f1918c;

        e(Toolbar toolbar) {
            this.f1916a = toolbar;
            this.f1917b = toolbar.getNavigationIcon();
            this.f1918c = toolbar.getNavigationContentDescription();
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public Drawable mo2580a() {
            return this.f1917b;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2581a(int i) {
            if (i == 0) {
                this.f1916a.setNavigationContentDescription(this.f1918c);
            } else {
                this.f1916a.setNavigationContentDescription(i);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2582a(Drawable drawable, int i) {
            this.f1916a.setNavigationIcon(drawable);
            mo2581a(i);
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: b */
        public Context mo2583b() {
            return this.f1916a.getContext();
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2584c() {
            return true;
        }
    }

    public C0345b(Activity activity, C0322f c0322f, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, c0322f, null, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    C0345b(Activity activity, Toolbar toolbar, C0322f c0322f, C0369b c0369b, int i, int i2) {
        this.f1906f = true;
        this.f1901a = true;
        this.f1911k = false;
        if (toolbar != null) {
            this.f1903c = new e(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C0345b.this.f1901a) {
                        C0345b.this.m2577b();
                    } else if (C0345b.this.f1902b != null) {
                        C0345b.this.f1902b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof b) {
            this.f1903c = ((b) activity).mo2585b();
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f1903c = new d(activity);
        } else {
            this.f1903c = new c(activity);
        }
        this.f1904d = c0322f;
        this.f1909i = i;
        this.f1910j = i2;
        if (c0369b == null) {
            this.f1905e = new C0369b(this.f1903c.mo2583b());
        } else {
            this.f1905e = c0369b;
        }
        this.f1907g = m2579c();
    }

    /* JADX INFO: renamed from: a */
    private void m2572a(float f) {
        if (f == 1.0f) {
            this.f1905e.m2804b(true);
        } else if (f == 0.0f) {
            this.f1905e.m2804b(false);
        }
        this.f1905e.m2805c(f);
    }

    /* JADX INFO: renamed from: a */
    public void m2573a() {
        if (this.f1904d.m2427g(8388611)) {
            m2572a(1.0f);
        } else {
            m2572a(0.0f);
        }
        if (this.f1901a) {
            m2575a(this.f1905e, this.f1904d.m2427g(8388611) ? this.f1910j : this.f1909i);
        }
    }

    @Override // android.support.v4.widget.C0322f.c
    /* JADX INFO: renamed from: a */
    public void mo2436a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public void m2574a(Configuration configuration) {
        if (!this.f1908h) {
            this.f1907g = m2579c();
        }
        m2573a();
    }

    /* JADX INFO: renamed from: a */
    void m2575a(Drawable drawable, int i) {
        if (!this.f1911k && !this.f1903c.mo2584c()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f1911k = true;
        }
        this.f1903c.mo2582a(drawable, i);
    }

    @Override // android.support.v4.widget.C0322f.c
    /* JADX INFO: renamed from: a */
    public void mo2437a(View view) {
        m2572a(1.0f);
        if (this.f1901a) {
            m2578b(this.f1910j);
        }
    }

    @Override // android.support.v4.widget.C0322f.c
    /* JADX INFO: renamed from: a */
    public void mo2438a(View view, float f) {
        if (this.f1906f) {
            m2572a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2572a(0.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2576a(boolean z) {
        if (z != this.f1901a) {
            if (z) {
                m2575a(this.f1905e, this.f1904d.m2427g(8388611) ? this.f1910j : this.f1909i);
            } else {
                m2575a(this.f1907g, 0);
            }
            this.f1901a = z;
        }
    }

    /* JADX INFO: renamed from: b */
    void m2577b() {
        int iM2398a = this.f1904d.m2398a(8388611);
        if (this.f1904d.m2430h(8388611) && iM2398a != 2) {
            this.f1904d.m2425f(8388611);
        } else if (iM2398a != 1) {
            this.f1904d.m2424e(8388611);
        }
    }

    /* JADX INFO: renamed from: b */
    void m2578b(int i) {
        this.f1903c.mo2581a(i);
    }

    @Override // android.support.v4.widget.C0322f.c
    /* JADX INFO: renamed from: b */
    public void mo2439b(View view) {
        m2572a(0.0f);
        if (this.f1901a) {
            m2578b(this.f1909i);
        }
    }

    /* JADX INFO: renamed from: c */
    Drawable m2579c() {
        return this.f1903c.mo2580a();
    }
}
