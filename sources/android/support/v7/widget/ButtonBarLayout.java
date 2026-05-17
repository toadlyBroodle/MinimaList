package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private boolean f2725a;

    /* JADX INFO: renamed from: b */
    private int f2726b;

    /* JADX INFO: renamed from: c */
    private int f2727c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2726b = -1;
        this.f2727c = 0;
        boolean z = getResources().getConfiguration().screenHeightDp >= 320;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ButtonBarLayout);
        this.f2725a = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.ButtonBarLayout_allowStacking, z);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private int m3414a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3415a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(C0333a.f.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f2727c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i);
        if (this.f2725a) {
            if (size > this.f2726b && m3415a()) {
                setStacked(false);
            }
            this.f2726b = size;
        }
        if (m3415a() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f2725a && !m3415a()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM3414a = m3414a(0);
        if (iM3414a >= 0) {
            View childAt = getChildAt(iM3414a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            measuredHeight = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + 0;
            if (m3415a()) {
                int iM3414a2 = m3414a(iM3414a + 1);
                if (iM3414a2 >= 0) {
                    measuredHeight += getChildAt(iM3414a2).getPaddingTop() + ((int) (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                measuredHeight += getPaddingBottom();
            }
        } else {
            measuredHeight = 0;
        }
        if (C0246q.m1764j(this) != measuredHeight) {
            setMinimumHeight(measuredHeight);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f2725a != z) {
            this.f2725a = z;
            if (!this.f2725a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
