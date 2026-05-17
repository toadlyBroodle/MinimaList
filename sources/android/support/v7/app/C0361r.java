package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.support.v7.app.AbstractC0344a;
import android.support.v7.view.WindowCallbackC0395i;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.widget.C0499bj;
import android.support.v7.widget.InterfaceC0468af;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.app.r */
/* JADX INFO: loaded from: classes.dex */
class C0361r extends AbstractC0344a {

    /* JADX INFO: renamed from: a */
    InterfaceC0468af f2042a;

    /* JADX INFO: renamed from: b */
    boolean f2043b;

    /* JADX INFO: renamed from: c */
    Window.Callback f2044c;

    /* JADX INFO: renamed from: d */
    private boolean f2045d;

    /* JADX INFO: renamed from: e */
    private boolean f2046e;

    /* JADX INFO: renamed from: f */
    private ArrayList<AbstractC0344a.b> f2047f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private final Runnable f2048g = new Runnable() { // from class: android.support.v7.app.r.1
        @Override // java.lang.Runnable
        public void run() {
            C0361r.this.m2736i();
        }
    };

    /* JADX INFO: renamed from: h */
    private final Toolbar.InterfaceC0459c f2049h = new Toolbar.InterfaceC0459c() { // from class: android.support.v7.app.r.2
        @Override // android.support.v7.widget.Toolbar.InterfaceC0459c
        /* JADX INFO: renamed from: a */
        public boolean mo2737a(MenuItem menuItem) {
            return C0361r.this.f2044c.onMenuItemSelected(0, menuItem);
        }
    };

    /* JADX INFO: renamed from: android.support.v7.app.r$a */
    private final class a implements InterfaceC0412o.a {

        /* JADX INFO: renamed from: b */
        private boolean f2053b;

        a() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public void mo2706a(C0405h c0405h, boolean z) {
            if (this.f2053b) {
                return;
            }
            this.f2053b = true;
            C0361r.this.f2042a.mo3840n();
            if (C0361r.this.f2044c != null) {
                C0361r.this.f2044c.onPanelClosed(108, c0405h);
            }
            this.f2053b = false;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public boolean mo2707a(C0405h c0405h) {
            if (C0361r.this.f2044c == null) {
                return false;
            }
            C0361r.this.f2044c.onMenuOpened(108, c0405h);
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.r$b */
    private final class b implements C0405h.a {
        b() {
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public void mo424a(C0405h c0405h) {
            if (C0361r.this.f2044c != null) {
                if (C0361r.this.f2042a.mo3835i()) {
                    C0361r.this.f2044c.onPanelClosed(108, c0405h);
                } else if (C0361r.this.f2044c.onPreparePanel(0, null, c0405h)) {
                    C0361r.this.f2044c.onMenuOpened(108, c0405h);
                }
            }
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.r$c */
    private class c extends WindowCallbackC0395i {
        public c(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0361r.this.f2042a.mo3822b()) : super.onCreatePanelView(i);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (zOnPreparePanel && !C0361r.this.f2043b) {
                C0361r.this.f2042a.mo3839m();
                C0361r.this.f2043b = true;
            }
            return zOnPreparePanel;
        }
    }

    C0361r(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f2042a = new C0499bj(toolbar, false);
        this.f2044c = new c(callback);
        this.f2042a.mo3819a(this.f2044c);
        toolbar.setOnMenuItemClickListener(this.f2049h);
        this.f2042a.mo3820a(charSequence);
    }

    /* JADX INFO: renamed from: j */
    private Menu m2734j() {
        if (!this.f2045d) {
            this.f2042a.mo3816a(new a(), new b());
            this.f2045d = true;
        }
        return this.f2042a.mo3843q();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public int mo2546a() {
        return this.f2042a.mo3841o();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2548a(float f) {
        C0246q.m1737a(this.f2042a.mo3813a(), f);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2549a(int i) {
        this.f2042a.mo3829d(i);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2550a(Configuration configuration) {
        super.mo2550a(configuration);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2551a(Drawable drawable) {
        this.f2042a.mo3824b(drawable);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2552a(CharSequence charSequence) {
        this.f2042a.mo3820a(charSequence);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public void mo2553a(boolean z) {
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public boolean mo2554a(int i, KeyEvent keyEvent) {
        Menu menuM2734j = m2734j();
        if (menuM2734j == null) {
            return false;
        }
        menuM2734j.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM2734j.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: a */
    public boolean mo2555a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2559c();
        }
        return true;
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: b */
    public Context mo2556b() {
        return this.f2042a.mo3822b();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: c */
    public void mo2558c(boolean z) {
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: c */
    public boolean mo2559c() {
        return this.f2042a.mo3837k();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: d */
    public void mo2560d(boolean z) {
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: d */
    public boolean mo2561d() {
        return this.f2042a.mo3838l();
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: e */
    public void mo2562e(boolean z) {
        if (z == this.f2046e) {
            return;
        }
        this.f2046e = z;
        int size = this.f2047f.size();
        for (int i = 0; i < size; i++) {
            this.f2047f.get(i).m2566a(z);
        }
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: e */
    public boolean mo2563e() {
        this.f2042a.mo3813a().removeCallbacks(this.f2048g);
        C0246q.m1747a(this.f2042a.mo3813a(), this.f2048g);
        return true;
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: f */
    public boolean mo2564f() {
        if (!this.f2042a.mo3827c()) {
            return false;
        }
        this.f2042a.mo3828d();
        return true;
    }

    @Override // android.support.v7.app.AbstractC0344a
    /* JADX INFO: renamed from: g */
    void mo2565g() {
        this.f2042a.mo3813a().removeCallbacks(this.f2048g);
    }

    /* JADX INFO: renamed from: h */
    public Window.Callback m2735h() {
        return this.f2044c;
    }

    /* JADX INFO: renamed from: i */
    void m2736i() {
        Menu menuM2734j = m2734j();
        C0405h c0405h = menuM2734j instanceof C0405h ? (C0405h) menuM2734j : null;
        if (c0405h != null) {
            c0405h.m3276g();
        }
        try {
            menuM2734j.clear();
            if (!this.f2044c.onCreatePanelMenu(0, menuM2734j) || !this.f2044c.onPreparePanel(0, null, menuM2734j)) {
                menuM2734j.clear();
            }
        } finally {
            if (c0405h != null) {
                c0405h.m3277h();
            }
        }
    }
}
