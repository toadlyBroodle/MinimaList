package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v4.widget.InterfaceC0318b;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: renamed from: android.support.v7.widget.i */
/* JADX INFO: loaded from: classes.dex */
public class C0513i extends Button implements InterfaceC0245p, InterfaceC0318b {

    /* JADX INFO: renamed from: b */
    private final C0512h f3606b;

    /* JADX INFO: renamed from: c */
    private final C0530z f3607c;

    public C0513i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.buttonStyle);
    }

    public C0513i(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3606b = new C0512h(this);
        this.f3606b.m4651a(attributeSet, i);
        this.f3607c = C0530z.m4729a(this);
        this.f3607c.mo3746a(attributeSet, i);
        this.f3607c.mo3745a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3606b != null) {
            this.f3606b.m4654c();
        }
        if (this.f3607c != null) {
            this.f3607c.mo3745a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1659a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f3607c != null) {
            return this.f3607c.m4747g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1659a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f3607c != null) {
            return this.f3607c.m4746f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1659a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f3607c != null) {
            return this.f3607c.m4745e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return f1659a ? super.getAutoSizeTextAvailableSizes() : this.f3607c != null ? this.f3607c.m4748h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1659a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f3607c != null) {
            return this.f3607c.m4744d();
        }
        return 0;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3606b != null) {
            return this.f3606b.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3606b != null) {
            return this.f3606b.m4652b();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3607c != null) {
            this.f3607c.m4740a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f3607c == null || f1659a || !this.f3607c.m4743c()) {
            return;
        }
        this.f3607c.m4742b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1659a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f3607c != null) {
            this.f3607c.m4736a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1659a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f3607c != null) {
            this.f3607c.m4741a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1659a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f3607c != null) {
            this.f3607c.m4734a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3606b != null) {
            this.f3606b.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3606b != null) {
            this.f3606b.m4647a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f3607c != null) {
            this.f3607c.m4739a(z);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3606b != null) {
            this.f3606b.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3606b != null) {
            this.f3606b.m4649a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3607c != null) {
            this.f3607c.m4737a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (f1659a) {
            super.setTextSize(i, f);
        } else if (this.f3607c != null) {
            this.f3607c.m4735a(i, f);
        }
    }
}
