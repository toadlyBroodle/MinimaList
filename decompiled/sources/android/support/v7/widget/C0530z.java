package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v4.widget.InterfaceC0318b;
import android.support.v7.p022a.C0333a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v7.widget.z */
/* JADX INFO: loaded from: classes.dex */
class C0530z {

    /* JADX INFO: renamed from: a */
    final TextView f3683a;

    /* JADX INFO: renamed from: b */
    private C0496bg f3684b;

    /* JADX INFO: renamed from: c */
    private C0496bg f3685c;

    /* JADX INFO: renamed from: d */
    private C0496bg f3686d;

    /* JADX INFO: renamed from: e */
    private C0496bg f3687e;

    /* JADX INFO: renamed from: f */
    private final C0465ac f3688f;

    /* JADX INFO: renamed from: g */
    private int f3689g = 0;

    /* JADX INFO: renamed from: h */
    private Typeface f3690h;

    /* JADX INFO: renamed from: i */
    private boolean f3691i;

    C0530z(TextView textView) {
        this.f3683a = textView;
        this.f3688f = new C0465ac(this.f3683a);
    }

    /* JADX INFO: renamed from: a */
    protected static C0496bg m4728a(Context context, C0517m c0517m, int i) {
        ColorStateList colorStateListM4692b = c0517m.m4692b(context, i);
        if (colorStateListM4692b == null) {
            return null;
        }
        C0496bg c0496bg = new C0496bg();
        c0496bg.f3470d = true;
        c0496bg.f3467a = colorStateListM4692b;
        return c0496bg;
    }

    /* JADX INFO: renamed from: a */
    static C0530z m4729a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new C0463aa(textView) : new C0530z(textView);
    }

    /* JADX INFO: renamed from: a */
    private void m4730a(Context context, C0498bi c0498bi) {
        String strM4522d;
        this.f3689g = c0498bi.m4512a(C0333a.j.TextAppearance_android_textStyle, this.f3689g);
        if (c0498bi.m4528g(C0333a.j.TextAppearance_android_fontFamily) || c0498bi.m4528g(C0333a.j.TextAppearance_fontFamily)) {
            this.f3690h = null;
            int i = c0498bi.m4528g(C0333a.j.TextAppearance_android_fontFamily) ? C0333a.j.TextAppearance_android_fontFamily : C0333a.j.TextAppearance_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f3683a);
                try {
                    this.f3690h = c0498bi.m4513a(i, this.f3689g, new C0173b.a() { // from class: android.support.v7.widget.z.1
                        @Override // android.support.v4.p007b.p008a.C0173b.a
                        /* JADX INFO: renamed from: a */
                        public void mo1324a(int i2) {
                        }

                        @Override // android.support.v4.p007b.p008a.C0173b.a
                        /* JADX INFO: renamed from: a */
                        public void mo1326a(Typeface typeface) {
                            C0530z.this.m4732a((WeakReference<TextView>) weakReference, typeface);
                        }
                    });
                    this.f3691i = this.f3690h == null;
                } catch (Resources.NotFoundException e) {
                } catch (UnsupportedOperationException e2) {
                }
            }
            if (this.f3690h != null || (strM4522d = c0498bi.m4522d(i)) == null) {
                return;
            }
            this.f3690h = Typeface.create(strM4522d, this.f3689g);
        }
        if (c0498bi.m4528g(C0333a.j.TextAppearance_android_typeface)) {
            this.f3691i = false;
            switch (c0498bi.m4512a(C0333a.j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f3690h = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.f3690h = Typeface.SERIF;
                    break;
                case 3:
                    this.f3690h = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4732a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f3691i) {
            this.f3690h = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f3689g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4733b(int i, float f) {
        this.f3688f.m3763a(i, f);
    }

    /* JADX INFO: renamed from: a */
    void mo3745a() {
        if (this.f3684b == null && this.f3685c == null && this.f3686d == null && this.f3687e == null) {
            return;
        }
        Drawable[] compoundDrawables = this.f3683a.getCompoundDrawables();
        m4738a(compoundDrawables[0], this.f3684b);
        m4738a(compoundDrawables[1], this.f3685c);
        m4738a(compoundDrawables[2], this.f3686d);
        m4738a(compoundDrawables[3], this.f3687e);
    }

    /* JADX INFO: renamed from: a */
    void m4734a(int i) {
        this.f3688f.m3762a(i);
    }

    /* JADX INFO: renamed from: a */
    void m4735a(int i, float f) {
        if (InterfaceC0318b.f1659a || m4743c()) {
            return;
        }
        m4733b(i, f);
    }

    /* JADX INFO: renamed from: a */
    void m4736a(int i, int i2, int i3, int i4) {
        this.f3688f.m3764a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    void m4737a(Context context, int i) {
        ColorStateList colorStateListM4524e;
        C0498bi c0498biM4508a = C0498bi.m4508a(context, i, C0333a.j.TextAppearance);
        if (c0498biM4508a.m4528g(C0333a.j.TextAppearance_textAllCaps)) {
            m4739a(c0498biM4508a.m4516a(C0333a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && c0498biM4508a.m4528g(C0333a.j.TextAppearance_android_textColor) && (colorStateListM4524e = c0498biM4508a.m4524e(C0333a.j.TextAppearance_android_textColor)) != null) {
            this.f3683a.setTextColor(colorStateListM4524e);
        }
        m4730a(context, c0498biM4508a);
        c0498biM4508a.m4515a();
        if (this.f3690h != null) {
            this.f3683a.setTypeface(this.f3690h, this.f3689g);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m4738a(Drawable drawable, C0496bg c0496bg) {
        if (drawable == null || c0496bg == null) {
            return;
        }
        C0517m.m4672a(drawable, c0496bg, this.f3683a.getDrawableState());
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    void mo3746a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM4524e;
        ColorStateList colorStateListM4524e2;
        boolean z;
        boolean zM4516a;
        ColorStateList colorStateListM4524e3 = null;
        Context context = this.f3683a.getContext();
        C0517m c0517mM4669a = C0517m.m4669a();
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0333a.j.AppCompatTextHelper, i, 0);
        int iM4527g = c0498biM4510a.m4527g(C0333a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3684b = m4728a(context, c0517mM4669a, c0498biM4510a.m4527g(C0333a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f3685c = m4728a(context, c0517mM4669a, c0498biM4510a.m4527g(C0333a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatTextHelper_android_drawableRight)) {
            this.f3686d = m4728a(context, c0517mM4669a, c0498biM4510a.m4527g(C0333a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3687e = m4728a(context, c0517mM4669a, c0498biM4510a.m4527g(C0333a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        c0498biM4510a.m4515a();
        boolean z2 = this.f3683a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM4527g != -1) {
            C0498bi c0498biM4508a = C0498bi.m4508a(context, iM4527g, C0333a.j.TextAppearance);
            if (z2 || !c0498biM4508a.m4528g(C0333a.j.TextAppearance_textAllCaps)) {
                z = false;
                zM4516a = false;
            } else {
                zM4516a = c0498biM4508a.m4516a(C0333a.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m4730a(context, c0498biM4508a);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateListM4524e2 = c0498biM4508a.m4528g(C0333a.j.TextAppearance_android_textColor) ? c0498biM4508a.m4524e(C0333a.j.TextAppearance_android_textColor) : null;
                colorStateListM4524e = c0498biM4508a.m4528g(C0333a.j.TextAppearance_android_textColorHint) ? c0498biM4508a.m4524e(C0333a.j.TextAppearance_android_textColorHint) : null;
                if (c0498biM4508a.m4528g(C0333a.j.TextAppearance_android_textColorLink)) {
                    colorStateListM4524e3 = c0498biM4508a.m4524e(C0333a.j.TextAppearance_android_textColorLink);
                }
            } else {
                colorStateListM4524e = null;
                colorStateListM4524e2 = null;
            }
            c0498biM4508a.m4515a();
        } else {
            colorStateListM4524e = null;
            colorStateListM4524e2 = null;
            z = false;
            zM4516a = false;
        }
        C0498bi c0498biM4510a2 = C0498bi.m4510a(context, attributeSet, C0333a.j.TextAppearance, i, 0);
        if (!z2 && c0498biM4510a2.m4528g(C0333a.j.TextAppearance_textAllCaps)) {
            zM4516a = c0498biM4510a2.m4516a(C0333a.j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (c0498biM4510a2.m4528g(C0333a.j.TextAppearance_android_textColor)) {
                colorStateListM4524e2 = c0498biM4510a2.m4524e(C0333a.j.TextAppearance_android_textColor);
            }
            if (c0498biM4510a2.m4528g(C0333a.j.TextAppearance_android_textColorHint)) {
                colorStateListM4524e = c0498biM4510a2.m4524e(C0333a.j.TextAppearance_android_textColorHint);
            }
            if (c0498biM4510a2.m4528g(C0333a.j.TextAppearance_android_textColorLink)) {
                colorStateListM4524e3 = c0498biM4510a2.m4524e(C0333a.j.TextAppearance_android_textColorLink);
            }
        }
        m4730a(context, c0498biM4510a2);
        c0498biM4510a2.m4515a();
        if (colorStateListM4524e2 != null) {
            this.f3683a.setTextColor(colorStateListM4524e2);
        }
        if (colorStateListM4524e != null) {
            this.f3683a.setHintTextColor(colorStateListM4524e);
        }
        if (colorStateListM4524e3 != null) {
            this.f3683a.setLinkTextColor(colorStateListM4524e3);
        }
        if (!z2 && z) {
            m4739a(zM4516a);
        }
        if (this.f3690h != null) {
            this.f3683a.setTypeface(this.f3690h, this.f3689g);
        }
        this.f3688f.m3765a(attributeSet, i);
        if (!InterfaceC0318b.f1659a || this.f3688f.m3761a() == 0) {
            return;
        }
        int[] iArrM3770e = this.f3688f.m3770e();
        if (iArrM3770e.length > 0) {
            if (this.f3683a.getAutoSizeStepGranularity() != -1.0f) {
                this.f3683a.setAutoSizeTextTypeUniformWithConfiguration(this.f3688f.m3768c(), this.f3688f.m3769d(), this.f3688f.m3767b(), 0);
            } else {
                this.f3683a.setAutoSizeTextTypeUniformWithPresetSizes(iArrM3770e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m4739a(boolean z) {
        this.f3683a.setAllCaps(z);
    }

    /* JADX INFO: renamed from: a */
    void m4740a(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC0318b.f1659a) {
            return;
        }
        m4742b();
    }

    /* JADX INFO: renamed from: a */
    void m4741a(int[] iArr, int i) {
        this.f3688f.m3766a(iArr, i);
    }

    /* JADX INFO: renamed from: b */
    void m4742b() {
        this.f3688f.m3771f();
    }

    /* JADX INFO: renamed from: c */
    boolean m4743c() {
        return this.f3688f.m3772g();
    }

    /* JADX INFO: renamed from: d */
    int m4744d() {
        return this.f3688f.m3761a();
    }

    /* JADX INFO: renamed from: e */
    int m4745e() {
        return this.f3688f.m3767b();
    }

    /* JADX INFO: renamed from: f */
    int m4746f() {
        return this.f3688f.m3768c();
    }

    /* JADX INFO: renamed from: g */
    int m4747g() {
        return this.f3688f.m3769d();
    }

    /* JADX INFO: renamed from: h */
    int[] m4748h() {
        return this.f3688f.m3770e();
    }
}
