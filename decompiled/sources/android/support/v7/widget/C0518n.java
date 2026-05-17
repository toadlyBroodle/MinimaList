package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.widget.EditText;

/* JADX INFO: renamed from: android.support.v7.widget.n */
/* JADX INFO: loaded from: classes.dex */
public class C0518n extends EditText implements InterfaceC0245p {

    /* JADX INFO: renamed from: a */
    private final C0512h f3633a;

    /* JADX INFO: renamed from: b */
    private final C0530z f3634b;

    public C0518n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.editTextStyle);
    }

    public C0518n(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3633a = new C0512h(this);
        this.f3633a.m4651a(attributeSet, i);
        this.f3634b = C0530z.m4729a(this);
        this.f3634b.mo3746a(attributeSet, i);
        this.f3634b.mo3745a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3633a != null) {
            this.f3633a.m4654c();
        }
        if (this.f3634b != null) {
            this.f3634b.mo3745a();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3633a != null) {
            return this.f3633a.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3633a != null) {
            return this.f3633a.m4652b();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3633a != null) {
            this.f3633a.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3633a != null) {
            this.f3633a.m4647a(i);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3633a != null) {
            this.f3633a.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3633a != null) {
            this.f3633a.m4649a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3634b != null) {
            this.f3634b.m4737a(context, i);
        }
    }
}
