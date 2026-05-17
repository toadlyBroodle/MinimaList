package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.widget.C0324h;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: android.support.v7.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C0520p {

    /* JADX INFO: renamed from: a */
    private final ImageView f3637a;

    /* JADX INFO: renamed from: b */
    private C0496bg f3638b;

    /* JADX INFO: renamed from: c */
    private C0496bg f3639c;

    /* JADX INFO: renamed from: d */
    private C0496bg f3640d;

    public C0520p(ImageView imageView) {
        this.f3637a = imageView;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4697a(Drawable drawable) {
        if (this.f3640d == null) {
            this.f3640d = new C0496bg();
        }
        C0496bg c0496bg = this.f3640d;
        c0496bg.m4507a();
        ColorStateList colorStateListM2452a = C0324h.m2452a(this.f3637a);
        if (colorStateListM2452a != null) {
            c0496bg.f3470d = true;
            c0496bg.f3467a = colorStateListM2452a;
        }
        PorterDuff.Mode modeM2455b = C0324h.m2455b(this.f3637a);
        if (modeM2455b != null) {
            c0496bg.f3469c = true;
            c0496bg.f3468b = modeM2455b;
        }
        if (!c0496bg.f3470d && !c0496bg.f3469c) {
            return false;
        }
        C0517m.m4672a(drawable, c0496bg, this.f3637a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m4698e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3638b != null : i == 21;
    }

    /* JADX INFO: renamed from: a */
    public void m4699a(int i) {
        if (i != 0) {
            Drawable drawableM2790b = C0366b.m2790b(this.f3637a.getContext(), i);
            if (drawableM2790b != null) {
                C0470ah.m3864a(drawableM2790b);
            }
            this.f3637a.setImageDrawable(drawableM2790b);
        } else {
            this.f3637a.setImageDrawable(null);
        }
        m4706d();
    }

    /* JADX INFO: renamed from: a */
    void m4700a(ColorStateList colorStateList) {
        if (this.f3639c == null) {
            this.f3639c = new C0496bg();
        }
        this.f3639c.f3467a = colorStateList;
        this.f3639c.f3470d = true;
        m4706d();
    }

    /* JADX INFO: renamed from: a */
    void m4701a(PorterDuff.Mode mode) {
        if (this.f3639c == null) {
            this.f3639c = new C0496bg();
        }
        this.f3639c.f3468b = mode;
        this.f3639c.f3469c = true;
        m4706d();
    }

    /* JADX INFO: renamed from: a */
    public void m4702a(AttributeSet attributeSet, int i) {
        int iM4527g;
        C0498bi c0498biM4510a = C0498bi.m4510a(this.f3637a.getContext(), attributeSet, C0333a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3637a.getDrawable();
            if (drawable == null && (iM4527g = c0498biM4510a.m4527g(C0333a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0366b.m2790b(this.f3637a.getContext(), iM4527g)) != null) {
                this.f3637a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0470ah.m3864a(drawable);
            }
            if (c0498biM4510a.m4528g(C0333a.j.AppCompatImageView_tint)) {
                C0324h.m2453a(this.f3637a, c0498biM4510a.m4524e(C0333a.j.AppCompatImageView_tint));
            }
            if (c0498biM4510a.m4528g(C0333a.j.AppCompatImageView_tintMode)) {
                C0324h.m2454a(this.f3637a, C0470ah.m3863a(c0498biM4510a.m4512a(C0333a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            c0498biM4510a.m4515a();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m4703a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3637a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m4704b() {
        if (this.f3639c != null) {
            return this.f3639c.f3467a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    PorterDuff.Mode m4705c() {
        if (this.f3639c != null) {
            return this.f3639c.f3468b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    void m4706d() {
        Drawable drawable = this.f3637a.getDrawable();
        if (drawable != null) {
            C0470ah.m3864a(drawable);
        }
        if (drawable != null) {
            if (m4698e() && m4697a(drawable)) {
                return;
            }
            if (this.f3639c != null) {
                C0517m.m4672a(drawable, this.f3639c, this.f3637a.getDrawableState());
            } else if (this.f3638b != null) {
                C0517m.m4672a(drawable, this.f3638b, this.f3637a.getDrawableState());
            }
        }
    }
}
