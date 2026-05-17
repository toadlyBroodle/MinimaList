package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.C0345b;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.C0393g;
import android.support.v7.view.WindowCallbackC0395i;
import android.support.v7.view.menu.C0405h;
import android.support.v7.widget.C0498bi;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;

/* JADX INFO: renamed from: android.support.v7.app.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0351h extends AbstractC0350g {

    /* JADX INFO: renamed from: m */
    private static boolean f1931m;

    /* JADX INFO: renamed from: n */
    private static final boolean f1932n;

    /* JADX INFO: renamed from: o */
    private static final int[] f1933o;

    /* JADX INFO: renamed from: a */
    final Context f1934a;

    /* JADX INFO: renamed from: b */
    final Window f1935b;

    /* JADX INFO: renamed from: c */
    final Window.Callback f1936c;

    /* JADX INFO: renamed from: d */
    final Window.Callback f1937d;

    /* JADX INFO: renamed from: e */
    final InterfaceC0349f f1938e;

    /* JADX INFO: renamed from: f */
    AbstractC0344a f1939f;

    /* JADX INFO: renamed from: g */
    MenuInflater f1940g;

    /* JADX INFO: renamed from: h */
    boolean f1941h;

    /* JADX INFO: renamed from: i */
    boolean f1942i;

    /* JADX INFO: renamed from: j */
    boolean f1943j;

    /* JADX INFO: renamed from: k */
    boolean f1944k;

    /* JADX INFO: renamed from: l */
    boolean f1945l;

    /* JADX INFO: renamed from: p */
    private CharSequence f1946p;

    /* JADX INFO: renamed from: q */
    private boolean f1947q;

    /* JADX INFO: renamed from: r */
    private boolean f1948r;

    /* JADX INFO: renamed from: android.support.v7.app.h$a */
    private class a implements C0345b.a {
        a() {
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public Drawable mo2580a() {
            C0498bi c0498biM4509a = C0498bi.m4509a(mo2583b(), (AttributeSet) null, new int[]{C0333a.a.homeAsUpIndicator});
            Drawable drawableM4514a = c0498biM4509a.m4514a(0);
            c0498biM4509a.m4515a();
            return drawableM4514a;
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2581a(int i) {
            AbstractC0344a abstractC0344aMo2622a = AbstractC0351h.this.mo2622a();
            if (abstractC0344aMo2622a != null) {
                abstractC0344aMo2622a.mo2549a(i);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: a */
        public void mo2582a(Drawable drawable, int i) {
            AbstractC0344a abstractC0344aMo2622a = AbstractC0351h.this.mo2622a();
            if (abstractC0344aMo2622a != null) {
                abstractC0344aMo2622a.mo2551a(drawable);
                abstractC0344aMo2622a.mo2549a(i);
            }
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: b */
        public Context mo2583b() {
            return AbstractC0351h.this.m2653o();
        }

        @Override // android.support.v7.app.C0345b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2584c() {
            AbstractC0344a abstractC0344aMo2622a = AbstractC0351h.this.mo2622a();
            return (abstractC0344aMo2622a == null || (abstractC0344aMo2622a.mo2546a() & 4) == 0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.h$b */
    class b extends WindowCallbackC0395i {
        b(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AbstractC0351h.this.mo2648a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AbstractC0351h.this.mo2647a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0405h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AbstractC0351h.this.mo2650b(i, menu);
            return true;
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AbstractC0351h.this.mo2646a(i, menu);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0405h c0405h = menu instanceof C0405h ? (C0405h) menu : null;
            if (i == 0 && c0405h == null) {
                return false;
            }
            if (c0405h != null) {
                c0405h.m3266c(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0405h == null) {
                return zOnPreparePanel;
            }
            c0405h.m3266c(false);
            return zOnPreparePanel;
        }
    }

    static {
        f1932n = Build.VERSION.SDK_INT < 21;
        if (f1932n && !f1931m) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: android.support.v7.app.h.1
                /* JADX INFO: renamed from: a */
                private boolean m2658a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    return message.contains("drawable") || message.contains("Drawable");
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    if (!m2658a(th)) {
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                }
            });
            f1931m = true;
        }
        f1933o = new int[]{R.attr.windowBackground};
    }

    AbstractC0351h(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        this.f1934a = context;
        this.f1935b = window;
        this.f1938e = interfaceC0349f;
        this.f1936c = this.f1935b.getCallback();
        if (this.f1936c instanceof b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1937d = mo2645a(this.f1936c);
        this.f1935b.setCallback(this.f1937d);
        C0498bi c0498biM4509a = C0498bi.m4509a(context, (AttributeSet) null, f1933o);
        Drawable drawableM4518b = c0498biM4509a.m4518b(0);
        if (drawableM4518b != null) {
            this.f1935b.setBackgroundDrawable(drawableM4518b);
        }
        c0498biM4509a.m4515a();
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public AbstractC0344a mo2622a() {
        mo2651m();
        return this.f1939f;
    }

    /* JADX INFO: renamed from: a */
    abstract AbstractC0388b mo2644a(AbstractC0388b.a aVar);

    /* JADX INFO: renamed from: a */
    Window.Callback mo2645a(Window.Callback callback) {
        return new b(callback);
    }

    /* JADX INFO: renamed from: a */
    abstract void mo2646a(int i, Menu menu);

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public final void mo2629a(CharSequence charSequence) {
        this.f1946p = charSequence;
        mo2649b(charSequence);
    }

    /* JADX INFO: renamed from: a */
    abstract boolean mo2647a(int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: a */
    abstract boolean mo2648a(KeyEvent keyEvent);

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: b */
    public MenuInflater mo2630b() {
        if (this.f1940g == null) {
            mo2651m();
            this.f1940g = new C0393g(this.f1939f != null ? this.f1939f.mo2556b() : this.f1934a);
        }
        return this.f1940g;
    }

    /* JADX INFO: renamed from: b */
    abstract void mo2649b(CharSequence charSequence);

    /* JADX INFO: renamed from: b */
    abstract boolean mo2650b(int i, Menu menu);

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: c */
    public void mo2634c() {
        this.f1947q = true;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: c */
    public void mo2635c(Bundle bundle) {
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: d */
    public void mo2637d() {
        this.f1947q = false;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: g */
    public void mo2640g() {
        this.f1948r = true;
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: h */
    public final C0345b.a mo2641h() {
        return new a();
    }

    @Override // android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: j */
    public boolean mo2643j() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    abstract void mo2651m();

    /* JADX INFO: renamed from: n */
    final AbstractC0344a m2652n() {
        return this.f1939f;
    }

    /* JADX INFO: renamed from: o */
    final Context m2653o() {
        AbstractC0344a abstractC0344aMo2622a = mo2622a();
        Context contextMo2556b = abstractC0344aMo2622a != null ? abstractC0344aMo2622a.mo2556b() : null;
        return contextMo2556b == null ? this.f1934a : contextMo2556b;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo2654p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    final boolean m2655q() {
        return this.f1948r;
    }

    /* JADX INFO: renamed from: r */
    final Window.Callback m2656r() {
        return this.f1935b.getCallback();
    }

    /* JADX INFO: renamed from: s */
    final CharSequence m2657s() {
        return this.f1936c instanceof Activity ? ((Activity) this.f1936c).getTitle() : this.f1946p;
    }
}
