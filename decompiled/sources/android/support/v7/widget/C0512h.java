package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.h */
/* JADX INFO: loaded from: classes.dex */
class C0512h {

    /* JADX INFO: renamed from: a */
    private final View f3600a;

    /* JADX INFO: renamed from: d */
    private C0496bg f3603d;

    /* JADX INFO: renamed from: e */
    private C0496bg f3604e;

    /* JADX INFO: renamed from: f */
    private C0496bg f3605f;

    /* JADX INFO: renamed from: c */
    private int f3602c = -1;

    /* JADX INFO: renamed from: b */
    private final C0517m f3601b = C0517m.m4669a();

    C0512h(View view) {
        this.f3600a = view;
    }

    /* JADX INFO: renamed from: b */
    private boolean m4644b(Drawable drawable) {
        if (this.f3605f == null) {
            this.f3605f = new C0496bg();
        }
        C0496bg c0496bg = this.f3605f;
        c0496bg.m4507a();
        ColorStateList colorStateListM1773s = C0246q.m1773s(this.f3600a);
        if (colorStateListM1773s != null) {
            c0496bg.f3470d = true;
            c0496bg.f3467a = colorStateListM1773s;
        }
        PorterDuff.Mode modeM1774t = C0246q.m1774t(this.f3600a);
        if (modeM1774t != null) {
            c0496bg.f3469c = true;
            c0496bg.f3468b = modeM1774t;
        }
        if (!c0496bg.f3470d && !c0496bg.f3469c) {
            return false;
        }
        C0517m.m4672a(drawable, c0496bg, this.f3600a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m4645d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3603d != null : i == 21;
    }

    /* JADX INFO: renamed from: a */
    ColorStateList m4646a() {
        if (this.f3604e != null) {
            return this.f3604e.f3467a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m4647a(int i) {
        this.f3602c = i;
        m4653b(this.f3601b != null ? this.f3601b.m4692b(this.f3600a.getContext(), i) : null);
        m4654c();
    }

    /* JADX INFO: renamed from: a */
    void m4648a(ColorStateList colorStateList) {
        if (this.f3604e == null) {
            this.f3604e = new C0496bg();
        }
        this.f3604e.f3467a = colorStateList;
        this.f3604e.f3470d = true;
        m4654c();
    }

    /* JADX INFO: renamed from: a */
    void m4649a(PorterDuff.Mode mode) {
        if (this.f3604e == null) {
            this.f3604e = new C0496bg();
        }
        this.f3604e.f3468b = mode;
        this.f3604e.f3469c = true;
        m4654c();
    }

    /* JADX INFO: renamed from: a */
    void m4650a(Drawable drawable) {
        this.f3602c = -1;
        m4653b((ColorStateList) null);
        m4654c();
    }

    /* JADX INFO: renamed from: a */
    void m4651a(AttributeSet attributeSet, int i) {
        C0498bi c0498biM4510a = C0498bi.m4510a(this.f3600a.getContext(), attributeSet, C0333a.j.ViewBackgroundHelper, i, 0);
        try {
            if (c0498biM4510a.m4528g(C0333a.j.ViewBackgroundHelper_android_background)) {
                this.f3602c = c0498biM4510a.m4527g(C0333a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListM4692b = this.f3601b.m4692b(this.f3600a.getContext(), this.f3602c);
                if (colorStateListM4692b != null) {
                    m4653b(colorStateListM4692b);
                }
            }
            if (c0498biM4510a.m4528g(C0333a.j.ViewBackgroundHelper_backgroundTint)) {
                C0246q.m1741a(this.f3600a, c0498biM4510a.m4524e(C0333a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (c0498biM4510a.m4528g(C0333a.j.ViewBackgroundHelper_backgroundTintMode)) {
                C0246q.m1742a(this.f3600a, C0470ah.m3863a(c0498biM4510a.m4512a(C0333a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            c0498biM4510a.m4515a();
        }
    }

    /* JADX INFO: renamed from: b */
    PorterDuff.Mode m4652b() {
        if (this.f3604e != null) {
            return this.f3604e.f3468b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    void m4653b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3603d == null) {
                this.f3603d = new C0496bg();
            }
            this.f3603d.f3467a = colorStateList;
            this.f3603d.f3470d = true;
        } else {
            this.f3603d = null;
        }
        m4654c();
    }

    /* JADX INFO: renamed from: c */
    void m4654c() {
        Drawable background = this.f3600a.getBackground();
        if (background != null) {
            if (m4645d() && m4644b(background)) {
                return;
            }
            if (this.f3604e != null) {
                C0517m.m4672a(background, this.f3604e, this.f3600a.getDrawableState());
            } else if (this.f3603d != null) {
                C0517m.m4672a(background, this.f3603d, this.f3600a.getDrawableState());
            }
        }
    }
}
