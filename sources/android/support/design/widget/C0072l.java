package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.design.widget.l */
/* JADX INFO: loaded from: classes.dex */
class C0072l {

    /* JADX INFO: renamed from: a */
    private static C0072l f453a;

    /* JADX INFO: renamed from: b */
    private final Object f454b = new Object();

    /* JADX INFO: renamed from: c */
    private final Handler f455c = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.l.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0072l.this.m539a((b) message.obj);
                    return true;
                default:
                    return false;
            }
        }
    });

    /* JADX INFO: renamed from: d */
    private b f456d;

    /* JADX INFO: renamed from: e */
    private b f457e;

    /* JADX INFO: renamed from: android.support.design.widget.l$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void m544a();

        /* JADX INFO: renamed from: a */
        void m545a(int i);
    }

    /* JADX INFO: renamed from: android.support.design.widget.l$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final WeakReference<a> f459a;

        /* JADX INFO: renamed from: b */
        int f460b;

        /* JADX INFO: renamed from: c */
        boolean f461c;

        /* JADX INFO: renamed from: a */
        boolean m546a(a aVar) {
            return aVar != null && this.f459a.get() == aVar;
        }
    }

    private C0072l() {
    }

    /* JADX INFO: renamed from: a */
    static C0072l m531a() {
        if (f453a == null) {
            f453a = new C0072l();
        }
        return f453a;
    }

    /* JADX INFO: renamed from: a */
    private boolean m532a(b bVar, int i) {
        a aVar = bVar.f459a.get();
        if (aVar == null) {
            return false;
        }
        this.f455c.removeCallbacksAndMessages(bVar);
        aVar.m545a(i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m533b() {
        if (this.f457e != null) {
            this.f456d = this.f457e;
            this.f457e = null;
            a aVar = this.f456d.f459a.get();
            if (aVar != null) {
                aVar.m544a();
            } else {
                this.f456d = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m534b(b bVar) {
        if (bVar.f460b == -2) {
            return;
        }
        int i = 2750;
        if (bVar.f460b > 0) {
            i = bVar.f460b;
        } else if (bVar.f460b == -1) {
            i = 1500;
        }
        this.f455c.removeCallbacksAndMessages(bVar);
        this.f455c.sendMessageDelayed(Message.obtain(this.f455c, 0, bVar), i);
    }

    /* JADX INFO: renamed from: f */
    private boolean m535f(a aVar) {
        return this.f456d != null && this.f456d.m546a(aVar);
    }

    /* JADX INFO: renamed from: g */
    private boolean m536g(a aVar) {
        return this.f457e != null && this.f457e.m546a(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m537a(a aVar) {
        synchronized (this.f454b) {
            if (m535f(aVar)) {
                this.f456d = null;
                if (this.f457e != null) {
                    m533b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m538a(a aVar, int i) {
        synchronized (this.f454b) {
            if (m535f(aVar)) {
                m532a(this.f456d, i);
            } else if (m536g(aVar)) {
                m532a(this.f457e, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m539a(b bVar) {
        synchronized (this.f454b) {
            if (this.f456d == bVar || this.f457e == bVar) {
                m532a(bVar, 2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m540b(a aVar) {
        synchronized (this.f454b) {
            if (m535f(aVar)) {
                m534b(this.f456d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m541c(a aVar) {
        synchronized (this.f454b) {
            if (m535f(aVar) && !this.f456d.f461c) {
                this.f456d.f461c = true;
                this.f455c.removeCallbacksAndMessages(this.f456d);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m542d(a aVar) {
        synchronized (this.f454b) {
            if (m535f(aVar) && this.f456d.f461c) {
                this.f456d.f461c = false;
                m534b(this.f456d);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m543e(a aVar) {
        boolean z;
        synchronized (this.f454b) {
            z = m535f(aVar) || m536g(aVar);
        }
        return z;
    }
}
