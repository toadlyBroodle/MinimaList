package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.InterfaceC0330n;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: renamed from: android.support.v7.widget.u */
/* JADX INFO: loaded from: classes.dex */
public class C0525u extends RadioButton implements InterfaceC0330n {

    /* JADX INFO: renamed from: a */
    private final C0516l f3651a;

    /* JADX INFO: renamed from: b */
    private final C0530z f3652b;

    public C0525u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.radioButtonStyle);
    }

    public C0525u(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3651a = new C0516l(this);
        this.f3651a.m4659a(attributeSet, i);
        this.f3652b = new C0530z(this);
        this.f3652b.mo3746a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f3651a != null ? this.f3651a.m4655a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f3651a != null) {
            return this.f3651a.m4656a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f3651a != null) {
            return this.f3651a.m4660b();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0366b.m2790b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f3651a != null) {
            this.f3651a.m4661c();
        }
    }

    @Override // android.support.v4.widget.InterfaceC0330n
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f3651a != null) {
            this.f3651a.m4657a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0330n
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f3651a != null) {
            this.f3651a.m4658a(mode);
        }
    }
}
