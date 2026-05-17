package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p016g.C0199a;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v4.widget.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0329m {

    /* JADX INFO: renamed from: a */
    static final f f1741a;

    /* JADX INFO: renamed from: android.support.v4.widget.m$a */
    static class a extends f {
        a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.m$b */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.widget.C0329m.f
        /* JADX INFO: renamed from: a */
        public void mo2469a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.m$c */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.widget.C0329m.b, android.support.v4.widget.C0329m.f
        /* JADX INFO: renamed from: a */
        public void mo2469a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.m$d */
    static class d extends c {
        d() {
        }

        @Override // android.support.v4.widget.C0329m.f
        /* JADX INFO: renamed from: a */
        public void mo2470a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.m$e */
    static class e extends d {
        e() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.m$f */
    static class f {
        f() {
        }

        /* JADX INFO: renamed from: a */
        public void mo2470a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* JADX INFO: renamed from: a */
        public void mo2469a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    static {
        if (C0199a.m1465a()) {
            f1741a = new e();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            f1741a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            f1741a = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            f1741a = new b();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f1741a = new a();
        } else {
            f1741a = new f();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2467a(TextView textView, int i) {
        f1741a.mo2470a(textView, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m2468a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f1741a.mo2469a(textView, drawable, drawable2, drawable3, drawable4);
    }
}
