package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Drawable f2627a;

    /* JADX INFO: renamed from: b */
    Drawable f2628b;

    /* JADX INFO: renamed from: c */
    Drawable f2629c;

    /* JADX INFO: renamed from: d */
    boolean f2630d;

    /* JADX INFO: renamed from: e */
    boolean f2631e;

    /* JADX INFO: renamed from: f */
    private boolean f2632f;

    /* JADX INFO: renamed from: g */
    private View f2633g;

    /* JADX INFO: renamed from: h */
    private View f2634h;

    /* JADX INFO: renamed from: i */
    private View f2635i;

    /* JADX INFO: renamed from: j */
    private int f2636j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0246q.m1744a(this, Build.VERSION.SDK_INT >= 21 ? new C0507c(this) : new C0489b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ActionBar);
        this.f2627a = typedArrayObtainStyledAttributes.getDrawable(C0333a.j.ActionBar_background);
        this.f2628b = typedArrayObtainStyledAttributes.getDrawable(C0333a.j.ActionBar_backgroundStacked);
        this.f2636j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0333a.j.ActionBar_height, -1);
        if (getId() == C0333a.f.split_action_bar) {
            this.f2630d = true;
            this.f2629c = typedArrayObtainStyledAttributes.getDrawable(C0333a.j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(this.f2630d ? this.f2629c == null : this.f2627a == null && this.f2628b == null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3346a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* JADX INFO: renamed from: b */
    private int m3347b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + view.getMeasuredHeight() + layoutParams.topMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2627a != null && this.f2627a.isStateful()) {
            this.f2627a.setState(getDrawableState());
        }
        if (this.f2628b != null && this.f2628b.isStateful()) {
            this.f2628b.setState(getDrawableState());
        }
        if (this.f2629c == null || !this.f2629c.isStateful()) {
            return;
        }
        this.f2629c.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2633g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2627a != null) {
            this.f2627a.jumpToCurrentState();
        }
        if (this.f2628b != null) {
            this.f2628b.jumpToCurrentState();
        }
        if (this.f2629c != null) {
            this.f2629c.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2634h = findViewById(C0333a.f.action_bar);
        this.f2635i = findViewById(C0333a.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2632f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3 = true;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f2633g;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f2630d) {
            if (this.f2627a != null) {
                if (this.f2634h.getVisibility() == 0) {
                    this.f2627a.setBounds(this.f2634h.getLeft(), this.f2634h.getTop(), this.f2634h.getRight(), this.f2634h.getBottom());
                } else if (this.f2635i == null || this.f2635i.getVisibility() != 0) {
                    this.f2627a.setBounds(0, 0, 0, 0);
                } else {
                    this.f2627a.setBounds(this.f2635i.getLeft(), this.f2635i.getTop(), this.f2635i.getRight(), this.f2635i.getBottom());
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2631e = z4;
            if (!z4 || this.f2628b == null) {
                z3 = z2;
            } else {
                this.f2628b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f2629c != null) {
            this.f2629c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2634h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f2636j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f2636j, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2634h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (this.f2633g == null || this.f2633g.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m3346a(this.f2634h) ? m3347b(this.f2634h) : !m3346a(this.f2635i) ? m3347b(this.f2635i) : 0) + m3347b(this.f2633g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2627a != null) {
            this.f2627a.setCallback(null);
            unscheduleDrawable(this.f2627a);
        }
        this.f2627a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2634h != null) {
                this.f2627a.setBounds(this.f2634h.getLeft(), this.f2634h.getTop(), this.f2634h.getRight(), this.f2634h.getBottom());
            }
        }
        if (this.f2630d) {
            if (this.f2629c != null) {
                z = false;
            }
        } else if (this.f2627a != null || this.f2628b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2629c != null) {
            this.f2629c.setCallback(null);
            unscheduleDrawable(this.f2629c);
        }
        this.f2629c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2630d && this.f2629c != null) {
                this.f2629c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f2630d) {
            if (this.f2629c != null) {
                z = false;
            }
        } else if (this.f2627a != null || this.f2628b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2628b != null) {
            this.f2628b.setCallback(null);
            unscheduleDrawable(this.f2628b);
        }
        this.f2628b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2631e && this.f2628b != null) {
                this.f2628b.setBounds(this.f2633g.getLeft(), this.f2633g.getTop(), this.f2633g.getRight(), this.f2633g.getBottom());
            }
        }
        if (this.f2630d) {
            if (this.f2629c != null) {
                z = false;
            }
        } else if (this.f2627a != null || this.f2628b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0490ba c0490ba) {
        if (this.f2633g != null) {
            removeView(this.f2633g);
        }
        this.f2633g = c0490ba;
        if (c0490ba != null) {
            addView(c0490ba);
            ViewGroup.LayoutParams layoutParams = c0490ba.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0490ba.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2632f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f2627a != null) {
            this.f2627a.setVisible(z, false);
        }
        if (this.f2628b != null) {
            this.f2628b.setVisible(z, false);
        }
        if (this.f2629c != null) {
            this.f2629c.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2627a && !this.f2630d) || (drawable == this.f2628b && this.f2631e) || ((drawable == this.f2629c && this.f2630d) || super.verifyDrawable(drawable));
    }
}
