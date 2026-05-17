package android.support.v4.p019j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v4.j.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0250u {

    /* JADX INFO: renamed from: a */
    Runnable f1362a = null;

    /* JADX INFO: renamed from: b */
    Runnable f1363b = null;

    /* JADX INFO: renamed from: c */
    int f1364c = -1;

    /* JADX INFO: renamed from: d */
    private WeakReference<View> f1365d;

    /* JADX INFO: renamed from: android.support.v4.j.u$a */
    static class a implements InterfaceC0251v {

        /* JADX INFO: renamed from: a */
        C0250u f1372a;

        /* JADX INFO: renamed from: b */
        boolean f1373b;

        a(C0250u c0250u) {
            this.f1372a = c0250u;
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: a */
        public void mo1862a(View view) {
            this.f1373b = false;
            if (this.f1372a.f1364c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f1372a.f1362a != null) {
                Runnable runnable = this.f1372a.f1362a;
                this.f1372a.f1362a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0251v interfaceC0251v = tag instanceof InterfaceC0251v ? (InterfaceC0251v) tag : null;
            if (interfaceC0251v != null) {
                interfaceC0251v.mo1862a(view);
            }
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: b */
        public void mo1863b(View view) {
            if (this.f1372a.f1364c > -1) {
                view.setLayerType(this.f1372a.f1364c, null);
                this.f1372a.f1364c = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1373b) {
                if (this.f1372a.f1363b != null) {
                    Runnable runnable = this.f1372a.f1363b;
                    this.f1372a.f1363b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0251v interfaceC0251v = tag instanceof InterfaceC0251v ? (InterfaceC0251v) tag : null;
                if (interfaceC0251v != null) {
                    interfaceC0251v.mo1863b(view);
                }
                this.f1373b = true;
            }
        }

        @Override // android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: c */
        public void mo1864c(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0251v interfaceC0251v = tag instanceof InterfaceC0251v ? (InterfaceC0251v) tag : null;
            if (interfaceC0251v != null) {
                interfaceC0251v.mo1864c(view);
            }
        }
    }

    C0250u(View view) {
        this.f1365d = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    private void m1851a(final View view, final InterfaceC0251v interfaceC0251v) {
        if (interfaceC0251v != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: android.support.v4.j.u.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    interfaceC0251v.mo1864c(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    interfaceC0251v.mo1863b(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    interfaceC0251v.mo1862a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m1852a() {
        View view = this.f1365d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public C0250u m1853a(float f) {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0250u m1854a(long j) {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0250u m1855a(InterfaceC0251v interfaceC0251v) {
        View view = this.f1365d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m1851a(view, interfaceC0251v);
            } else {
                view.setTag(2113929216, interfaceC0251v);
                m1851a(view, new a(this));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0250u m1856a(final InterfaceC0253x interfaceC0253x) {
        final View view = this.f1365d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0253x != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v4.j.u.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC0253x.mo1865a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0250u m1857a(Interpolator interpolator) {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0250u m1858b(float f) {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0250u m1859b(long j) {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m1860b() {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1861c() {
        View view = this.f1365d.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
