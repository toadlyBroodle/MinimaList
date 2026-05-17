package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: android.support.v7.widget.r */
/* JADX INFO: loaded from: classes.dex */
public class C0522r extends MultiAutoCompleteTextView implements InterfaceC0245p {

    /* JADX INFO: renamed from: a */
    private static final int[] f3643a = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b */
    private final C0512h f3644b;

    /* JADX INFO: renamed from: c */
    private final C0530z f3645c;

    public C0522r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.autoCompleteTextViewStyle);
    }

    public C0522r(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        C0498bi c0498biM4510a = C0498bi.m4510a(getContext(), attributeSet, f3643a, i, 0);
        if (c0498biM4510a.m4528g(0)) {
            setDropDownBackgroundDrawable(c0498biM4510a.m4514a(0));
        }
        c0498biM4510a.m4515a();
        this.f3644b = new C0512h(this);
        this.f3644b.m4651a(attributeSet, i);
        this.f3645c = C0530z.m4729a(this);
        this.f3645c.mo3746a(attributeSet, i);
        this.f3645c.mo3745a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3644b != null) {
            this.f3644b.m4654c();
        }
        if (this.f3645c != null) {
            this.f3645c.mo3745a();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3644b != null) {
            return this.f3644b.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3644b != null) {
            return this.f3644b.m4652b();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3644b != null) {
            this.f3644b.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3644b != null) {
            this.f3644b.m4647a(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0366b.m2790b(getContext(), i));
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3644b != null) {
            this.f3644b.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3644b != null) {
            this.f3644b.m4649a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3645c != null) {
            this.f3645c.m4737a(context, i);
        }
    }
}
