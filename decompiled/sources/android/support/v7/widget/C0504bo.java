package android.support.v7.widget;

import android.support.design.C0025a;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.bo */
/* JADX INFO: loaded from: classes.dex */
class C0504bo {

    /* JADX INFO: renamed from: a */
    final b f3517a;

    /* JADX INFO: renamed from: b */
    a f3518b = new a();

    /* JADX INFO: renamed from: android.support.v7.widget.bo$a */
    static class a {

        /* JADX INFO: renamed from: a */
        int f3519a = 0;

        /* JADX INFO: renamed from: b */
        int f3520b;

        /* JADX INFO: renamed from: c */
        int f3521c;

        /* JADX INFO: renamed from: d */
        int f3522d;

        /* JADX INFO: renamed from: e */
        int f3523e;

        a() {
        }

        /* JADX INFO: renamed from: a */
        int m4556a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* JADX INFO: renamed from: a */
        void m4557a() {
            this.f3519a = 0;
        }

        /* JADX INFO: renamed from: a */
        void m4558a(int i) {
            this.f3519a |= i;
        }

        /* JADX INFO: renamed from: a */
        void m4559a(int i, int i2, int i3, int i4) {
            this.f3520b = i;
            this.f3521c = i2;
            this.f3522d = i3;
            this.f3523e = i4;
        }

        /* JADX INFO: renamed from: b */
        boolean m4560b() {
            if ((this.f3519a & 7) != 0 && (this.f3519a & (m4556a(this.f3522d, this.f3520b) << 0)) == 0) {
                return false;
            }
            if ((this.f3519a & C0025a.j.AppCompatTheme_windowFixedHeightMajor) != 0 && (this.f3519a & (m4556a(this.f3522d, this.f3521c) << 4)) == 0) {
                return false;
            }
            if ((this.f3519a & 1792) == 0 || (this.f3519a & (m4556a(this.f3523e, this.f3520b) << 8)) != 0) {
                return (this.f3519a & 28672) == 0 || (this.f3519a & (m4556a(this.f3523e, this.f3521c) << 12)) != 0;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.bo$b */
    interface b {
        /* JADX INFO: renamed from: a */
        int mo4292a();

        /* JADX INFO: renamed from: a */
        int mo4293a(View view);

        /* JADX INFO: renamed from: a */
        View mo4294a(int i);

        /* JADX INFO: renamed from: b */
        int mo4295b();

        /* JADX INFO: renamed from: b */
        int mo4296b(View view);
    }

    C0504bo(b bVar) {
        this.f3517a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View m4554a(int i, int i2, int i3, int i4) {
        int iMo4292a = this.f3517a.mo4292a();
        int iMo4295b = this.f3517a.mo4295b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo4294a = this.f3517a.mo4294a(i);
            this.f3518b.m4559a(iMo4292a, iMo4295b, this.f3517a.mo4293a(viewMo4294a), this.f3517a.mo4296b(viewMo4294a));
            if (i3 != 0) {
                this.f3518b.m4557a();
                this.f3518b.m4558a(i3);
                if (this.f3518b.m4560b()) {
                    return viewMo4294a;
                }
            }
            if (i4 != 0) {
                this.f3518b.m4557a();
                this.f3518b.m4558a(i4);
                if (!this.f3518b.m4560b()) {
                    viewMo4294a = view;
                }
            }
            i += i5;
            view = viewMo4294a;
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    boolean m4555a(View view, int i) {
        this.f3518b.m4559a(this.f3517a.mo4292a(), this.f3517a.mo4295b(), this.f3517a.mo4293a(view), this.f3517a.mo4296b(view));
        if (i == 0) {
            return false;
        }
        this.f3518b.m4557a();
        this.f3518b.m4558a(i);
        return this.f3518b.m4560b();
    }
}
