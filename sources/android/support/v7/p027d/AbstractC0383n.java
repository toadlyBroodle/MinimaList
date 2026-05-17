package android.support.v7.p027d;

import android.content.Context;
import android.os.Build;
import android.support.v7.p027d.C0378i;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v7.d.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0383n {

    /* JADX INFO: renamed from: a */
    protected final Context f2281a;

    /* JADX INFO: renamed from: b */
    protected final Object f2282b;

    /* JADX INFO: renamed from: c */
    protected d f2283c;

    /* JADX INFO: renamed from: android.support.v7.d.n$a */
    static class a extends AbstractC0383n {

        /* JADX INFO: renamed from: d */
        private final Object f2284d;

        /* JADX INFO: renamed from: e */
        private final Object f2285e;

        /* JADX INFO: renamed from: f */
        private final Object f2286f;

        /* JADX INFO: renamed from: g */
        private boolean f2287g;

        /* JADX INFO: renamed from: android.support.v7.d.n$a$a, reason: collision with other inner class name */
        private static final class C2327a implements C0378i.g {

            /* JADX INFO: renamed from: a */
            private final WeakReference<a> f2288a;

            public C2327a(a aVar) {
                this.f2288a = new WeakReference<>(aVar);
            }

            @Override // android.support.v7.p027d.C0378i.g
            /* JADX INFO: renamed from: a */
            public void mo3041a(Object obj, int i) {
                a aVar = this.f2288a.get();
                if (aVar == null || aVar.f2283c == null) {
                    return;
                }
                aVar.f2283c.mo2961a(i);
            }

            @Override // android.support.v7.p027d.C0378i.g
            /* JADX INFO: renamed from: b */
            public void mo3042b(Object obj, int i) {
                a aVar = this.f2288a.get();
                if (aVar == null || aVar.f2283c == null) {
                    return;
                }
                aVar.f2283c.mo2963b(i);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            this.f2284d = C0378i.m3000a(context);
            this.f2285e = C0378i.m3004a(this.f2284d, "", false);
            this.f2286f = C0378i.m3008b(this.f2284d, this.f2285e);
        }

        @Override // android.support.v7.p027d.AbstractC0383n
        /* JADX INFO: renamed from: a */
        public void mo3097a(c cVar) {
            C0378i.f.m3038c(this.f2286f, cVar.f2289a);
            C0378i.f.m3039d(this.f2286f, cVar.f2290b);
            C0378i.f.m3040e(this.f2286f, cVar.f2291c);
            C0378i.f.m3036b(this.f2286f, cVar.f2292d);
            C0378i.f.m3033a(this.f2286f, cVar.f2293e);
            if (this.f2287g) {
                return;
            }
            this.f2287g = true;
            C0378i.f.m3035a(this.f2286f, C0378i.m3002a((C0378i.g) new C2327a(this)));
            C0378i.f.m3037b(this.f2286f, this.f2282b);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.n$b */
    static class b extends AbstractC0383n {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.n$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public int f2289a;

        /* JADX INFO: renamed from: b */
        public int f2290b;

        /* JADX INFO: renamed from: c */
        public int f2291c = 0;

        /* JADX INFO: renamed from: d */
        public int f2292d = 3;

        /* JADX INFO: renamed from: e */
        public int f2293e = 1;
    }

    /* JADX INFO: renamed from: android.support.v7.d.n$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2961a(int i);

        /* JADX INFO: renamed from: b */
        void mo2963b(int i);
    }

    protected AbstractC0383n(Context context, Object obj) {
        this.f2281a = context;
        this.f2282b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0383n m3095a(Context context, Object obj) {
        return Build.VERSION.SDK_INT >= 16 ? new a(context, obj) : new b(context, obj);
    }

    /* JADX INFO: renamed from: a */
    public Object m3096a() {
        return this.f2282b;
    }

    /* JADX INFO: renamed from: a */
    public void mo3097a(c cVar) {
    }

    /* JADX INFO: renamed from: a */
    public void m3098a(d dVar) {
        this.f2283c = dVar;
    }
}
