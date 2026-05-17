package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.widget.C0319c;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: android.support.v7.widget.l */
/* JADX INFO: loaded from: classes.dex */
class C0516l {

    /* JADX INFO: renamed from: a */
    private final CompoundButton f3611a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f3612b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f3613c = null;

    /* JADX INFO: renamed from: d */
    private boolean f3614d = false;

    /* JADX INFO: renamed from: e */
    private boolean f3615e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3616f;

    C0516l(CompoundButton compoundButton) {
        this.f3611a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    int m4655a(int i) {
        Drawable drawableM2372a;
        return (Build.VERSION.SDK_INT >= 17 || (drawableM2372a = C0319c.m2372a(this.f3611a)) == null) ? i : i + drawableM2372a.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: a */
    ColorStateList m4656a() {
        return this.f3612b;
    }

    /* JADX INFO: renamed from: a */
    void m4657a(ColorStateList colorStateList) {
        this.f3612b = colorStateList;
        this.f3614d = true;
        m4662d();
    }

    /* JADX INFO: renamed from: a */
    void m4658a(PorterDuff.Mode mode) {
        this.f3613c = mode;
        this.f3615e = true;
        m4662d();
    }

    /* JADX INFO: renamed from: a */
    void m4659a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f3611a.getContext().obtainStyledAttributes(attributeSet, C0333a.j.CompoundButton, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.CompoundButton_android_button) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.CompoundButton_android_button, 0)) != 0) {
                this.f3611a.setButtonDrawable(C0366b.m2790b(this.f3611a.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.CompoundButton_buttonTint)) {
                C0319c.m2373a(this.f3611a, typedArrayObtainStyledAttributes.getColorStateList(C0333a.j.CompoundButton_buttonTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.CompoundButton_buttonTintMode)) {
                C0319c.m2374a(this.f3611a, C0470ah.m3863a(typedArrayObtainStyledAttributes.getInt(C0333a.j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    PorterDuff.Mode m4660b() {
        return this.f3613c;
    }

    /* JADX INFO: renamed from: c */
    void m4661c() {
        if (this.f3616f) {
            this.f3616f = false;
        } else {
            this.f3616f = true;
            m4662d();
        }
    }

    /* JADX INFO: renamed from: d */
    void m4662d() {
        Drawable drawableM2372a = C0319c.m2372a(this.f3611a);
        if (drawableM2372a != null) {
            if (this.f3614d || this.f3615e) {
                Drawable drawableMutate = C0181a.m1400f(drawableM2372a).mutate();
                if (this.f3614d) {
                    C0181a.m1390a(drawableMutate, this.f3612b);
                }
                if (this.f3615e) {
                    C0181a.m1393a(drawableMutate, this.f3613c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f3611a.getDrawableState());
                }
                this.f3611a.setButtonDrawable(drawableMutate);
            }
        }
    }
}
