package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v4.widget.InterfaceC0318b;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v7.widget.ab */
/* JADX INFO: loaded from: classes.dex */
public class C0464ab extends TextView implements InterfaceC0245p, InterfaceC0318b {

    /* JADX INFO: renamed from: b */
    private final C0512h f2970b;

    /* JADX INFO: renamed from: c */
    private final C0530z f2971c;

    public C0464ab(Context context) {
        this(context, null);
    }

    public C0464ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0464ab(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f2970b = new C0512h(this);
        this.f2970b.m4651a(attributeSet, i);
        this.f2971c = C0530z.m4729a(this);
        this.f2971c.mo3746a(attributeSet, i);
        this.f2971c.mo3745a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2970b != null) {
            this.f2970b.m4654c();
        }
        if (this.f2971c != null) {
            this.f2971c.mo3745a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1659a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2971c != null) {
            return this.f2971c.m4747g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1659a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2971c != null) {
            return this.f2971c.m4746f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1659a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f2971c != null) {
            return this.f2971c.m4745e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return f1659a ? super.getAutoSizeTextAvailableSizes() : this.f2971c != null ? this.f2971c.m4748h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1659a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f2971c != null) {
            return this.f2971c.m4744d();
        }
        return 0;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2970b != null) {
            return this.f2970b.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2970b != null) {
            return this.f2970b.m4652b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2971c != null) {
            this.f2971c.m4740a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2971c == null || f1659a || !this.f2971c.m4743c()) {
            return;
        }
        this.f2971c.m4742b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1659a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2971c != null) {
            this.f2971c.m4736a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1659a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2971c != null) {
            this.f2971c.m4741a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1659a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2971c != null) {
            this.f2971c.m4734a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2970b != null) {
            this.f2970b.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2970b != null) {
            this.f2970b.m4647a(i);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2970b != null) {
            this.f2970b.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2970b != null) {
            this.f2970b.m4649a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2971c != null) {
            this.f2971c.m4737a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (f1659a) {
            super.setTextSize(i, f);
        } else if (this.f2971c != null) {
            this.f2971c.m4735a(i, f);
        }
    }
}
