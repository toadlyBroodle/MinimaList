package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0250u;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.menu.C0405h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0462a {

    /* JADX INFO: renamed from: g */
    private CharSequence f2637g;

    /* JADX INFO: renamed from: h */
    private CharSequence f2638h;

    /* JADX INFO: renamed from: i */
    private View f2639i;

    /* JADX INFO: renamed from: j */
    private View f2640j;

    /* JADX INFO: renamed from: k */
    private LinearLayout f2641k;

    /* JADX INFO: renamed from: l */
    private TextView f2642l;

    /* JADX INFO: renamed from: m */
    private TextView f2643m;

    /* JADX INFO: renamed from: n */
    private int f2644n;

    /* JADX INFO: renamed from: o */
    private int f2645o;

    /* JADX INFO: renamed from: p */
    private boolean f2646p;

    /* JADX INFO: renamed from: q */
    private int f2647q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0333a.j.ActionMode, i, 0);
        C0246q.m1744a(this, c0498biM4510a.m4514a(C0333a.j.ActionMode_background));
        this.f2644n = c0498biM4510a.m4527g(C0333a.j.ActionMode_titleTextStyle, 0);
        this.f2645o = c0498biM4510a.m4527g(C0333a.j.ActionMode_subtitleTextStyle, 0);
        this.f2961e = c0498biM4510a.m4525f(C0333a.j.ActionMode_height, 0);
        this.f2647q = c0498biM4510a.m4527g(C0333a.j.ActionMode_closeItemLayout, C0333a.g.abc_action_mode_close_item_material);
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: e */
    private void m3348e() {
        if (this.f2641k == null) {
            LayoutInflater.from(getContext()).inflate(C0333a.g.abc_action_bar_title_item, this);
            this.f2641k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2642l = (TextView) this.f2641k.findViewById(C0333a.f.action_bar_title);
            this.f2643m = (TextView) this.f2641k.findViewById(C0333a.f.action_bar_subtitle);
            if (this.f2644n != 0) {
                this.f2642l.setTextAppearance(getContext(), this.f2644n);
            }
            if (this.f2645o != 0) {
                this.f2643m.setTextAppearance(getContext(), this.f2645o);
            }
        }
        this.f2642l.setText(this.f2637g);
        this.f2643m.setText(this.f2638h);
        boolean z = !TextUtils.isEmpty(this.f2637g);
        boolean z2 = TextUtils.isEmpty(this.f2638h) ? false : true;
        this.f2643m.setVisibility(z2 ? 0 : 8);
        this.f2641k.setVisibility((z || z2) ? 0 : 8);
        if (this.f2641k.getParent() == null) {
            addView(this.f2641k);
        }
    }

    @Override // android.support.v7.widget.AbstractC0462a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ C0250u mo3349a(int i, long j) {
        return super.mo3349a(i, j);
    }

    /* JADX INFO: renamed from: a */
    public void m3350a(final AbstractC0388b abstractC0388b) {
        if (this.f2639i == null) {
            this.f2639i = LayoutInflater.from(getContext()).inflate(this.f2647q, (ViewGroup) this, false);
            addView(this.f2639i);
        } else if (this.f2639i.getParent() == null) {
            addView(this.f2639i);
        }
        this.f2639i.findViewById(C0333a.f.action_mode_close_button).setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                abstractC0388b.mo2775c();
            }
        });
        C0405h c0405h = (C0405h) abstractC0388b.mo2772b();
        if (this.f2960d != null) {
            this.f2960d.m4599h();
        }
        this.f2960d = new C0508d(getContext());
        this.f2960d.m4594c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0405h.m3252a(this.f2960d, this.f2958b);
        this.f2959c = (ActionMenuView) this.f2960d.mo3180a(this);
        C0246q.m1744a(this.f2959c, (Drawable) null);
        addView(this.f2959c, layoutParams);
    }

    @Override // android.support.v7.widget.AbstractC0462a
    /* JADX INFO: renamed from: a */
    public boolean mo3351a() {
        if (this.f2960d != null) {
            return this.f2960d.m4597f();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m3352b() {
        if (this.f2639i == null) {
            m3353c();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3353c() {
        removeAllViews();
        this.f2640j = null;
        this.f2959c = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3354d() {
        return this.f2646p;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.AbstractC0462a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.AbstractC0462a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2638h;
    }

    public CharSequence getTitle() {
        return this.f2637g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2960d != null) {
            this.f2960d.m4598g();
            this.f2960d.m4600i();
        }
    }

    @Override // android.support.v7.widget.AbstractC0462a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f2637g);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iA;
        boolean zM4582a = C0506bq.m4582a(this);
        int paddingRight = zM4582a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f2639i == null || this.f2639i.getVisibility() == 8) {
            iA = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2639i.getLayoutParams();
            int i5 = zM4582a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM4582a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA2 = m3739a(paddingRight, i5, zM4582a);
            iA = m3739a(m3743a(this.f2639i, iA2, paddingTop, paddingTop2, zM4582a) + iA2, i6, zM4582a);
        }
        if (this.f2641k != null && this.f2640j == null && this.f2641k.getVisibility() != 8) {
            iA += m3743a(this.f2641k, iA, paddingTop, paddingTop2, zM4582a);
        }
        if (this.f2640j != null) {
            int iA3 = m3743a(this.f2640j, iA, paddingTop, paddingTop2, zM4582a) + iA;
        }
        int paddingLeft = zM4582a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f2959c != null) {
            int iA4 = m3743a(this.f2959c, paddingLeft, paddingTop, paddingTop2, !zM4582a) + paddingLeft;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f2961e > 0 ? this.f2961e : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        if (this.f2639i != null) {
            int iA = m3742a(this.f2639i, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2639i.getLayoutParams();
            paddingLeft = iA - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
        }
        if (this.f2959c != null && this.f2959c.getParent() == this) {
            paddingLeft = m3742a(this.f2959c, paddingLeft, iMakeMeasureSpec, 0);
        }
        if (this.f2641k != null && this.f2640j == null) {
            if (this.f2646p) {
                this.f2641k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2641k.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2641k.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m3742a(this.f2641k, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        if (this.f2640j != null) {
            ViewGroup.LayoutParams layoutParams = this.f2640j.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            this.f2640j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i4) : i4, layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824));
        }
        if (this.f2961e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i3 < childCount) {
            int measuredHeight = getChildAt(i3).getMeasuredHeight() + paddingTop;
            if (measuredHeight <= i6) {
                measuredHeight = i6;
            }
            i3++;
            i6 = measuredHeight;
        }
        setMeasuredDimension(size, i6);
    }

    @Override // android.support.v7.widget.AbstractC0462a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AbstractC0462a
    public void setContentHeight(int i) {
        this.f2961e = i;
    }

    public void setCustomView(View view) {
        if (this.f2640j != null) {
            removeView(this.f2640j);
        }
        this.f2640j = view;
        if (view != null && this.f2641k != null) {
            removeView(this.f2641k);
            this.f2641k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2638h = charSequence;
        m3348e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2637g = charSequence;
        m3348e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2646p) {
            requestLayout();
        }
        this.f2646p = z;
    }

    @Override // android.support.v7.widget.AbstractC0462a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
