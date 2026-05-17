package android.support.v4.media;

import android.os.Build;
import android.support.v4.media.C0282h;

/* JADX INFO: renamed from: android.support.v4.media.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0281g {

    /* JADX INFO: renamed from: a */
    private final int f1459a;

    /* JADX INFO: renamed from: b */
    private final int f1460b;

    /* JADX INFO: renamed from: c */
    private int f1461c;

    /* JADX INFO: renamed from: d */
    private a f1462d;

    /* JADX INFO: renamed from: e */
    private Object f1463e;

    /* JADX INFO: renamed from: android.support.v4.media.g$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract void mo2010a(AbstractC0281g abstractC0281g);
    }

    public AbstractC0281g(int i, int i2, int i3) {
        this.f1459a = i;
        this.f1460b = i2;
        this.f1461c = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m2000a() {
        return this.f1461c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2001a(int i) {
        this.f1461c = i;
        Object objM2007d = m2007d();
        if (objM2007d != null && Build.VERSION.SDK_INT >= 21) {
            C0282h.m2012a(objM2007d, i);
        }
        if (this.f1462d != null) {
            this.f1462d.mo2010a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2002a(a aVar) {
        this.f1462d = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m2003b() {
        return this.f1459a;
    }

    /* JADX INFO: renamed from: b */
    public void mo2004b(int i) {
    }

    /* JADX INFO: renamed from: c */
    public final int m2005c() {
        return this.f1460b;
    }

    /* JADX INFO: renamed from: c */
    public void mo2006c(int i) {
    }

    /* JADX INFO: renamed from: d */
    public Object m2007d() {
        if (this.f1463e == null && Build.VERSION.SDK_INT >= 21) {
            this.f1463e = C0282h.m2011a(this.f1459a, this.f1460b, this.f1461c, new C0282h.a() { // from class: android.support.v4.media.g.1
                @Override // android.support.v4.media.C0282h.a
                /* JADX INFO: renamed from: a */
                public void mo2008a(int i) {
                    AbstractC0281g.this.mo2004b(i);
                }

                @Override // android.support.v4.media.C0282h.a
                /* JADX INFO: renamed from: b */
                public void mo2009b(int i) {
                    AbstractC0281g.this.mo2006c(i);
                }
            });
        }
        return this.f1463e;
    }
}
