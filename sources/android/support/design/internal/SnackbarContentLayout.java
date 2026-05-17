package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0025a;
import android.support.design.widget.AbstractC0062b;
import android.support.v4.p019j.C0246q;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements AbstractC0062b.c {

    /* JADX INFO: renamed from: a */
    private TextView f157a;

    /* JADX INFO: renamed from: b */
    private Button f158b;

    /* JADX INFO: renamed from: c */
    private int f159c;

    /* JADX INFO: renamed from: d */
    private int f160d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.SnackbarLayout);
        this.f159c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.SnackbarLayout_android_maxWidth, -1);
        this.f160d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0025a.j.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private static void m159a(View view, int i, int i2) {
        if (C0246q.m1772r(view)) {
            C0246q.m1740a(view, C0246q.m1761g(view), i, C0246q.m1762h(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m160a(int i, int i2, int i3) {
        boolean z = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        }
        if (this.f157a.getPaddingTop() == i2 && this.f157a.getPaddingBottom() == i3) {
            return z;
        }
        m159a(this.f157a, i2, i3);
        return true;
    }

    @Override // android.support.design.widget.AbstractC0062b.c
    /* JADX INFO: renamed from: a */
    public void mo161a(int i, int i2) {
        this.f157a.setAlpha(0.0f);
        this.f157a.animate().alpha(1.0f).setDuration(i2).setStartDelay(i).start();
        if (this.f158b.getVisibility() == 0) {
            this.f158b.setAlpha(0.0f);
            this.f158b.animate().alpha(1.0f).setDuration(i2).setStartDelay(i).start();
        }
    }

    @Override // android.support.design.widget.AbstractC0062b.c
    /* JADX INFO: renamed from: b */
    public void mo162b(int i, int i2) {
        this.f157a.setAlpha(1.0f);
        this.f157a.animate().alpha(0.0f).setDuration(i2).setStartDelay(i).start();
        if (this.f158b.getVisibility() == 0) {
            this.f158b.setAlpha(1.0f);
            this.f158b.animate().alpha(0.0f).setDuration(i2).setStartDelay(i).start();
        }
    }

    public Button getActionView() {
        return this.f158b;
    }

    public TextView getMessageView() {
        return this.f157a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f157a = (TextView) findViewById(C0025a.f.snackbar_text);
        this.f158b = (Button) findViewById(C0025a.f.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.f159c > 0 && getMeasuredWidth() > this.f159c) {
            i = View.MeasureSpec.makeMeasureSpec(this.f159c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0025a.d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0025a.d.design_snackbar_padding_vertical);
        boolean z2 = this.f157a.getLayout().getLineCount() > 1;
        if (!z2 || this.f160d <= 0 || this.f158b.getMeasuredWidth() <= this.f160d) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            z = m160a(0, dimensionPixelSize, dimensionPixelSize);
        } else if (m160a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
