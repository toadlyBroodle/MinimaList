package android.support.v4.p006a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p018i.C0219m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.a.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0158n<E> extends AbstractC0156l {

    /* JADX INFO: renamed from: a */
    private final Activity f887a;

    /* JADX INFO: renamed from: b */
    final Context f888b;

    /* JADX INFO: renamed from: c */
    final int f889c;

    /* JADX INFO: renamed from: d */
    final LayoutInflaterFactory2C0160p f890d;

    /* JADX INFO: renamed from: e */
    private final Handler f891e;

    /* JADX INFO: renamed from: f */
    private C0219m<String, AbstractC0168x> f892f;

    /* JADX INFO: renamed from: g */
    private boolean f893g;

    /* JADX INFO: renamed from: h */
    private C0169y f894h;

    /* JADX INFO: renamed from: i */
    private boolean f895i;

    /* JADX INFO: renamed from: j */
    private boolean f896j;

    AbstractC0158n(Activity activity, Context context, Handler handler, int i) {
        this.f890d = new LayoutInflaterFactory2C0160p();
        this.f887a = activity;
        this.f888b = context;
        this.f891e = handler;
        this.f889c = i;
    }

    AbstractC0158n(ActivityC0155k activityC0155k) {
        this(activityC0155k, activityC0155k, activityC0155k.f871c, 0);
    }

    /* JADX INFO: renamed from: a */
    C0169y m1057a(String str, boolean z, boolean z2) {
        if (this.f892f == null) {
            this.f892f = new C0219m<>();
        }
        C0169y c0169y = (C0169y) this.f892f.get(str);
        if (c0169y == null && z2) {
            C0169y c0169y2 = new C0169y(str, this, z);
            this.f892f.put(str, c0169y2);
            return c0169y2;
        }
        if (!z || c0169y == null || c0169y.f1046e) {
            return c0169y;
        }
        c0169y.m1269b();
        return c0169y;
    }

    @Override // android.support.v4.p006a.AbstractC0156l
    /* JADX INFO: renamed from: a */
    public View mo990a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo1014a(ComponentCallbacksC0154j componentCallbacksC0154j, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f888b.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    void m1058a(C0219m<String, AbstractC0168x> c0219m) {
        if (c0219m != null) {
            int size = c0219m.size();
            for (int i = 0; i < size; i++) {
                ((C0169y) c0219m.m1584c(i)).m1266a(this);
            }
        }
        this.f892f = c0219m;
    }

    /* JADX INFO: renamed from: a */
    void m1059a(String str) {
        C0169y c0169y;
        if (this.f892f == null || (c0169y = (C0169y) this.f892f.get(str)) == null || c0169y.f1047f) {
            return;
        }
        c0169y.m1275h();
        this.f892f.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public void mo1015a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: a */
    void m1060a(boolean z) {
        this.f893g = z;
        if (this.f894h != null && this.f896j) {
            this.f896j = false;
            if (z) {
                this.f894h.m1271d();
            } else {
                this.f894h.m1270c();
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0156l
    /* JADX INFO: renamed from: a */
    public boolean mo991a() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1016a(ComponentCallbacksC0154j componentCallbacksC0154j) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public LayoutInflater mo1017b() {
        return LayoutInflater.from(this.f888b);
    }

    /* JADX INFO: renamed from: b */
    void mo1018b(ComponentCallbacksC0154j componentCallbacksC0154j) {
    }

    /* JADX INFO: renamed from: b */
    void m1061b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f896j);
        if (this.f894h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f894h)));
            printWriter.println(":");
            this.f894h.m1268a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1019c() {
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1020d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int mo1021e() {
        return this.f889c;
    }

    /* JADX INFO: renamed from: f */
    Activity m1062f() {
        return this.f887a;
    }

    /* JADX INFO: renamed from: g */
    Context m1063g() {
        return this.f888b;
    }

    /* JADX INFO: renamed from: h */
    Handler m1064h() {
        return this.f891e;
    }

    /* JADX INFO: renamed from: i */
    LayoutInflaterFactory2C0160p m1065i() {
        return this.f890d;
    }

    /* JADX INFO: renamed from: j */
    C0169y m1066j() {
        if (this.f894h != null) {
            return this.f894h;
        }
        this.f895i = true;
        this.f894h = m1057a("(root)", this.f896j, true);
        return this.f894h;
    }

    /* JADX INFO: renamed from: k */
    boolean m1067k() {
        return this.f893g;
    }

    /* JADX INFO: renamed from: l */
    void m1068l() {
        if (this.f896j) {
            return;
        }
        this.f896j = true;
        if (this.f894h != null) {
            this.f894h.m1269b();
        } else if (!this.f895i) {
            this.f894h = m1057a("(root)", this.f896j, false);
            if (this.f894h != null && !this.f894h.f1046e) {
                this.f894h.m1269b();
            }
        }
        this.f895i = true;
    }

    /* JADX INFO: renamed from: m */
    void m1069m() {
        if (this.f894h == null) {
            return;
        }
        this.f894h.m1275h();
    }

    /* JADX INFO: renamed from: n */
    void m1070n() {
        if (this.f892f != null) {
            int size = this.f892f.size();
            C0169y[] c0169yArr = new C0169y[size];
            for (int i = size - 1; i >= 0; i--) {
                c0169yArr[i] = (C0169y) this.f892f.m1584c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0169y c0169y = c0169yArr[i2];
                c0169y.m1272e();
                c0169y.m1274g();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    C0219m<String, AbstractC0168x> m1071o() {
        boolean z;
        if (this.f892f != null) {
            int size = this.f892f.size();
            C0169y[] c0169yArr = new C0169y[size];
            for (int i = size - 1; i >= 0; i--) {
                c0169yArr[i] = (C0169y) this.f892f.m1584c(i);
            }
            boolean zM1067k = m1067k();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0169y c0169y = c0169yArr[i2];
                if (!c0169y.f1047f && zM1067k) {
                    if (!c0169y.f1046e) {
                        c0169y.m1269b();
                    }
                    c0169y.m1271d();
                }
                if (c0169y.f1047f) {
                    z = true;
                } else {
                    c0169y.m1275h();
                    this.f892f.remove(c0169y.f1045d);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return this.f892f;
        }
        return null;
    }
}
