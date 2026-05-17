package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0025a;
import android.support.v7.widget.C0477ao;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: renamed from: android.support.design.internal.a */
/* JADX INFO: loaded from: classes.dex */
public class C0027a extends C0477ao {

    /* JADX INFO: renamed from: a */
    protected boolean f161a;

    /* JADX INFO: renamed from: b */
    boolean f162b;

    /* JADX INFO: renamed from: c */
    private Drawable f163c;

    /* JADX INFO: renamed from: d */
    private final Rect f164d;

    /* JADX INFO: renamed from: e */
    private final Rect f165e;

    /* JADX INFO: renamed from: f */
    private int f166f;

    public C0027a(Context context) {
        this(context, null);
    }

    public C0027a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0027a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164d = new Rect();
        this.f165e = new Rect();
        this.f166f = 119;
        this.f161a = true;
        this.f162b = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.ForegroundLinearLayout, i, 0);
        this.f166f = typedArrayObtainStyledAttributes.getInt(C0025a.j.ForegroundLinearLayout_android_foregroundGravity, this.f166f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0025a.j.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f161a = typedArrayObtainStyledAttributes.getBoolean(C0025a.j.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f163c != null) {
            Drawable drawable = this.f163c;
            if (this.f162b) {
                this.f162b = false;
                Rect rect = this.f164d;
                Rect rect2 = this.f165e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f161a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f166f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f163c != null) {
            this.f163c.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f163c == null || !this.f163c.isStateful()) {
            return;
        }
        this.f163c.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f163c;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f166f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f163c != null) {
            this.f163c.jumpToCurrentState();
        }
    }

    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f162b |= z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f162b = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        if (this.f163c != drawable) {
            if (this.f163c != null) {
                this.f163c.setCallback(null);
                unscheduleDrawable(this.f163c);
            }
            this.f163c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f166f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f166f != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & C0025a.j.AppCompatTheme_windowFixedHeightMajor) == 0) {
                i2 |= 48;
            }
            this.f166f = i2;
            if (this.f166f == 119 && this.f163c != null) {
                this.f163c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f163c;
    }
}
