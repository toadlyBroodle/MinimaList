package android.support.v7.p027d;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: android.support.v7.d.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0372c {

    /* JADX INFO: renamed from: a */
    private final Context f2139a;

    /* JADX INFO: renamed from: b */
    private final c f2140b;

    /* JADX INFO: renamed from: c */
    private final b f2141c = new b();

    /* JADX INFO: renamed from: d */
    private a f2142d;

    /* JADX INFO: renamed from: e */
    private C0371b f2143e;

    /* JADX INFO: renamed from: f */
    private boolean f2144f;

    /* JADX INFO: renamed from: g */
    private C0373d f2145g;

    /* JADX INFO: renamed from: h */
    private boolean f2146h;

    /* JADX INFO: renamed from: android.support.v7.d.c$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo2864a(AbstractC0372c abstractC0372c, C0373d c0373d) {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.c$b */
    private final class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    AbstractC0372c.this.m2863g();
                    break;
                case 2:
                    AbstractC0372c.this.m2861e();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final ComponentName f2148a;

        c(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f2148a = componentName;
        }

        /* JADX INFO: renamed from: a */
        public String m2865a() {
            return this.f2148a.getPackageName();
        }

        /* JADX INFO: renamed from: b */
        public ComponentName m2866b() {
            return this.f2148a;
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f2148a.flattenToShortString() + " }";
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.c$d */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public void mo2867a() {
        }

        /* JADX INFO: renamed from: a */
        public void mo2868a(int i) {
            mo2871c();
        }

        /* JADX INFO: renamed from: b */
        public void mo2869b() {
        }

        /* JADX INFO: renamed from: b */
        public void mo2870b(int i) {
        }

        /* JADX INFO: renamed from: c */
        public void mo2871c() {
        }

        /* JADX INFO: renamed from: c */
        public void mo2872c(int i) {
        }
    }

    AbstractC0372c(Context context, c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f2139a = context;
        if (cVar == null) {
            this.f2140b = new c(new ComponentName(context, getClass()));
        } else {
            this.f2140b = cVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m2851a() {
        return this.f2139a;
    }

    /* JADX INFO: renamed from: a */
    public d mo2852a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public d mo2853a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return mo2852a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m2854a(C0371b c0371b) {
        C0376g.m2895d();
        if (this.f2143e != c0371b) {
            if (this.f2143e == null || !this.f2143e.equals(c0371b)) {
                this.f2143e = c0371b;
                if (this.f2144f) {
                    return;
                }
                this.f2144f = true;
                this.f2141c.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2855a(a aVar) {
        C0376g.m2895d();
        this.f2142d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m2856a(C0373d c0373d) {
        C0376g.m2895d();
        if (this.f2145g != c0373d) {
            this.f2145g = c0373d;
            if (this.f2146h) {
                return;
            }
            this.f2146h = true;
            this.f2141c.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Handler m2857b() {
        return this.f2141c;
    }

    /* JADX INFO: renamed from: b */
    public void mo2858b(C0371b c0371b) {
    }

    /* JADX INFO: renamed from: c */
    public final c m2859c() {
        return this.f2140b;
    }

    /* JADX INFO: renamed from: d */
    public final C0371b m2860d() {
        return this.f2143e;
    }

    /* JADX INFO: renamed from: e */
    void m2861e() {
        this.f2144f = false;
        mo2858b(this.f2143e);
    }

    /* JADX INFO: renamed from: f */
    public final C0373d m2862f() {
        return this.f2145g;
    }

    /* JADX INFO: renamed from: g */
    void m2863g() {
        this.f2146h = false;
        if (this.f2142d != null) {
            this.f2142d.mo2864a(this, this.f2145g);
        }
    }
}
