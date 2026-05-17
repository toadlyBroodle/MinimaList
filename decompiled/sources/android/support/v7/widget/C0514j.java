package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.InterfaceC0330n;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: renamed from: android.support.v7.widget.j */
/* JADX INFO: loaded from: classes.dex */
public class C0514j extends CheckBox implements InterfaceC0330n {

    /* JADX INFO: renamed from: a */
    private final C0516l f3608a;

    public C0514j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.checkboxStyle);
    }

    public C0514j(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3608a = new C0516l(this);
        this.f3608a.m4659a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f3608a != null ? this.f3608a.m4655a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f3608a != null) {
            return this.f3608a.m4656a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f3608a != null) {
            return this.f3608a.m4660b();
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
        if (this.f3608a != null) {
            this.f3608a.m4661c();
        }
    }

    @Override // android.support.v4.widget.InterfaceC0330n
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f3608a != null) {
            this.f3608a.m4657a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0330n
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f3608a != null) {
            this.f3608a.m4658a(mode);
        }
    }
}
