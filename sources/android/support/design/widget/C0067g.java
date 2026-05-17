package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.p009c.p010a.C0181a;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.design.widget.g */
/* JADX INFO: loaded from: classes.dex */
class C0067g extends C0066f {

    /* JADX INFO: renamed from: p */
    private InsetDrawable f421p;

    /* JADX INFO: renamed from: android.support.design.widget.g$a */
    static class a extends GradientDrawable {
        a() {
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    C0067g(C0080t c0080t, InterfaceC0071k interfaceC0071k) {
        super(c0080t, interfaceC0071k);
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    public float mo482a() {
        return this.f400n.getElevation();
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    void mo485a(float f, float f2) {
        if (Build.VERSION.SDK_INT != 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f400n, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f400n, (Property<C0080t, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet.setInterpolator(f387a);
            stateListAnimator.addState(f388j, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.f400n, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f400n, (Property<C0080t, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet2.setInterpolator(f387a);
            stateListAnimator.addState(f389k, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f400n, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f400n, (Property<C0080t, Float>) View.TRANSLATION_Z, this.f400n.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f400n, (Property<C0080t, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(f387a);
            stateListAnimator.addState(f390l, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.f400n, "elevation", 0.0f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f400n, (Property<C0080t, Float>) View.TRANSLATION_Z, 0.0f).setDuration(0L));
            animatorSet4.setInterpolator(f387a);
            stateListAnimator.addState(f391m, animatorSet4);
            this.f400n.setStateListAnimator(stateListAnimator);
        } else if (this.f400n.isEnabled()) {
            this.f400n.setElevation(f);
            if (this.f400n.isFocused() || this.f400n.isPressed()) {
                this.f400n.setTranslationZ(f2);
            } else {
                this.f400n.setTranslationZ(0.0f);
            }
        } else {
            this.f400n.setElevation(0.0f);
            this.f400n.setTranslationZ(0.0f);
        }
        if (this.f401o.mo420b()) {
            m499e();
        }
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    void mo486a(int i) {
        if (this.f395e instanceof RippleDrawable) {
            ((RippleDrawable) this.f395e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo486a(i);
        }
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    void mo488a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable layerDrawable;
        this.f394d = C0181a.m1400f(m505k());
        C0181a.m1390a(this.f394d, colorStateList);
        if (mode != null) {
            C0181a.m1393a(this.f394d, mode);
        }
        if (i2 > 0) {
            this.f396f = m483a(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.f396f, this.f394d});
        } else {
            this.f396f = null;
            layerDrawable = this.f394d;
        }
        this.f395e = new RippleDrawable(ColorStateList.valueOf(i), layerDrawable, null);
        this.f397g = this.f395e;
        this.f401o.mo419a(this.f395e);
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    void mo490a(Rect rect) {
        if (!this.f401o.mo420b()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        float fMo417a = this.f401o.mo417a();
        float fMo482a = mo482a() + this.f399i;
        int iCeil = (int) Math.ceil(C0070j.m523b(fMo482a, fMo417a, false));
        int iCeil2 = (int) Math.ceil(C0070j.m520a(fMo482a, fMo417a, false));
        rect.set(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: a */
    void mo492a(int[] iArr) {
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: b */
    void mo493b() {
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: b */
    void mo495b(Rect rect) {
        if (!this.f401o.mo420b()) {
            this.f401o.mo419a(this.f395e);
        } else {
            this.f421p = new InsetDrawable(this.f395e, rect.left, rect.top, rect.right, rect.bottom);
            this.f401o.mo419a(this.f421p);
        }
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: d */
    void mo498d() {
        m499e();
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: h */
    boolean mo502h() {
        return false;
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: i */
    C0063c mo503i() {
        return new C0064d();
    }

    @Override // android.support.design.widget.C0066f
    /* JADX INFO: renamed from: l */
    GradientDrawable mo506l() {
        return new a();
    }
}
