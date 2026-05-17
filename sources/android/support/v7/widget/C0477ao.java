package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.C0025a;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: android.support.v7.widget.ao */
/* JADX INFO: loaded from: classes.dex */
public class C0477ao extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private boolean f3118a;

    /* JADX INFO: renamed from: b */
    private int f3119b;

    /* JADX INFO: renamed from: c */
    private int f3120c;

    /* JADX INFO: renamed from: d */
    private int f3121d;

    /* JADX INFO: renamed from: e */
    private int f3122e;

    /* JADX INFO: renamed from: f */
    private int f3123f;

    /* JADX INFO: renamed from: g */
    private float f3124g;

    /* JADX INFO: renamed from: h */
    private boolean f3125h;

    /* JADX INFO: renamed from: i */
    private int[] f3126i;

    /* JADX INFO: renamed from: j */
    private int[] f3127j;

    /* JADX INFO: renamed from: k */
    private Drawable f3128k;

    /* JADX INFO: renamed from: l */
    private int f3129l;

    /* JADX INFO: renamed from: m */
    private int f3130m;

    /* JADX INFO: renamed from: n */
    private int f3131n;

    /* JADX INFO: renamed from: o */
    private int f3132o;

    /* JADX INFO: renamed from: android.support.v7.widget.ao$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: g */
        public float f3133g;

        /* JADX INFO: renamed from: h */
        public int f3134h;

        public a(int i, int i2) {
            super(i, i2);
            this.f3134h = -1;
            this.f3133g = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3134h = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.LinearLayoutCompat_Layout);
            this.f3133g = typedArrayObtainStyledAttributes.getFloat(C0333a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f3134h = typedArrayObtainStyledAttributes.getInt(C0333a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3134h = -1;
        }
    }

    public C0477ao(Context context) {
        this(context, null);
    }

    public C0477ao(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0477ao(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3118a = true;
        this.f3119b = -1;
        this.f3120c = 0;
        this.f3122e = 8388659;
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0333a.j.LinearLayoutCompat, i, 0);
        int iM4512a = c0498biM4510a.m4512a(C0333a.j.LinearLayoutCompat_android_orientation, -1);
        if (iM4512a >= 0) {
            setOrientation(iM4512a);
        }
        int iM4512a2 = c0498biM4510a.m4512a(C0333a.j.LinearLayoutCompat_android_gravity, -1);
        if (iM4512a2 >= 0) {
            setGravity(iM4512a2);
        }
        boolean zM4516a = c0498biM4510a.m4516a(C0333a.j.LinearLayoutCompat_android_baselineAligned, true);
        if (!zM4516a) {
            setBaselineAligned(zM4516a);
        }
        this.f3124g = c0498biM4510a.m4511a(C0333a.j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3119b = c0498biM4510a.m4512a(C0333a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3125h = c0498biM4510a.m4516a(C0333a.j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(c0498biM4510a.m4514a(C0333a.j.LinearLayoutCompat_divider));
        this.f3131n = c0498biM4510a.m4512a(C0333a.j.LinearLayoutCompat_showDividers, 0);
        this.f3132o = c0498biM4510a.m4523e(C0333a.j.LinearLayoutCompat_dividerPadding, 0);
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: a */
    private void m3930a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* JADX INFO: renamed from: c */
    private void m3931c(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewM3941b = m3941b(i3);
            if (viewM3941b.getVisibility() != 8) {
                a aVar = (a) viewM3941b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = viewM3941b.getMeasuredHeight();
                    measureChildWithMargins(viewM3941b, iMakeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3932d(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewM3941b = m3941b(i3);
            if (viewM3941b.getVisibility() != 8) {
                a aVar = (a) viewM3941b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = viewM3941b.getMeasuredWidth();
                    measureChildWithMargins(viewM3941b, i2, 0, iMakeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    int m3933a(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    int m3934a(View view, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    void m3935a(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int iCombineMeasuredStates;
        boolean z;
        int i6;
        int i7;
        int i8;
        int iM3934a;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        boolean z4;
        int i9;
        int i10;
        int i11;
        this.f3123f = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = true;
        float f2 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i16 = this.f3119b;
        boolean z8 = this.f3125h;
        int iMax3 = 0;
        int iM3934a2 = 0;
        while (iM3934a2 < virtualChildCount) {
            View viewM3941b = m3941b(iM3934a2);
            if (viewM3941b == null) {
                this.f3123f += m3947d(iM3934a2);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else if (viewM3941b.getVisibility() == 8) {
                iM3934a2 += m3934a(viewM3941b, iM3934a2);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else {
                if (m3946c(iM3934a2)) {
                    this.f3123f += this.f3130m;
                }
                a aVar = (a) viewM3941b.getLayoutParams();
                float f3 = f2 + aVar.f3133g;
                if (mode2 == 1073741824 && aVar.height == 0 && aVar.f3133g > 0.0f) {
                    int i17 = this.f3123f;
                    this.f3123f = Math.max(i17, aVar.topMargin + i17 + aVar.bottomMargin);
                    z7 = true;
                } else {
                    int i18 = Integer.MIN_VALUE;
                    if (aVar.height == 0 && aVar.f3133g > 0.0f) {
                        i18 = 0;
                        aVar.height = -2;
                    }
                    int i19 = i18;
                    m3939a(viewM3941b, iM3934a2, i, 0, i2, f3 == 0.0f ? this.f3123f : 0);
                    if (i19 != Integer.MIN_VALUE) {
                        aVar.height = i19;
                    }
                    int measuredHeight = viewM3941b.getMeasuredHeight();
                    int i20 = this.f3123f;
                    this.f3123f = Math.max(i20, i20 + measuredHeight + aVar.topMargin + aVar.bottomMargin + m3940b(viewM3941b));
                    if (z8) {
                        iMax3 = Math.max(measuredHeight, iMax3);
                    }
                }
                if (i16 >= 0 && i16 == iM3934a2 + 1) {
                    this.f3120c = this.f3123f;
                }
                if (iM3934a2 < i16 && aVar.f3133g > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                boolean z9 = false;
                if (mode == 1073741824 || aVar.width != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z9 = true;
                }
                int i21 = aVar.rightMargin + aVar.leftMargin;
                int measuredWidth = viewM3941b.getMeasuredWidth() + i21;
                int iMax4 = Math.max(i12, measuredWidth);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i13, viewM3941b.getMeasuredState());
                z3 = z5 && aVar.width == -1;
                if (aVar.f3133g > 0.0f) {
                    iMax2 = Math.max(i15, z9 ? i21 : measuredWidth);
                    iMax = i14;
                } else {
                    if (!z9) {
                        i21 = measuredWidth;
                    }
                    iMax = Math.max(i14, i21);
                    iMax2 = i15;
                }
                iM3934a2 += m3934a(viewM3941b, iM3934a2);
                z4 = z7;
                i15 = iMax2;
                i14 = iMax;
                i9 = iMax4;
                i10 = iMax3;
                i11 = iCombineMeasuredStates2;
                z6 = z2;
                f2 = f3;
            }
            iM3934a2++;
            iMax3 = i10;
            z7 = z4;
            z5 = z3;
            i13 = i11;
            i12 = i9;
        }
        if (this.f3123f > 0 && m3946c(virtualChildCount)) {
            this.f3123f += this.f3130m;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f3123f = 0;
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View viewM3941b2 = m3941b(i22);
                if (viewM3941b2 == null) {
                    this.f3123f += m3947d(i22);
                    iM3934a = i22;
                } else if (viewM3941b2.getVisibility() == 8) {
                    iM3934a = m3934a(viewM3941b2, i22) + i22;
                } else {
                    a aVar2 = (a) viewM3941b2.getLayoutParams();
                    int i23 = this.f3123f;
                    this.f3123f = Math.max(i23, aVar2.bottomMargin + i23 + iMax3 + aVar2.topMargin + m3940b(viewM3941b2));
                    iM3934a = i22;
                }
                i22 = iM3934a + 1;
            }
        }
        this.f3123f += getPaddingTop() + getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(this.f3123f, getSuggestedMinimumHeight()), i2, 0);
        int i24 = (16777215 & iResolveSizeAndState) - this.f3123f;
        if (z7 || (i24 != 0 && f2 > 0.0f)) {
            if (this.f3124g > 0.0f) {
                f2 = this.f3124g;
            }
            this.f3123f = 0;
            int i25 = 0;
            float f4 = f2;
            boolean z10 = z5;
            int i26 = i14;
            int i27 = i13;
            int i28 = i12;
            int i29 = i24;
            while (i25 < virtualChildCount) {
                View viewM3941b3 = m3941b(i25);
                if (viewM3941b3.getVisibility() == 8) {
                    i6 = i26;
                    i8 = i27;
                    i7 = i28;
                    z = z10;
                } else {
                    a aVar3 = (a) viewM3941b3.getLayoutParams();
                    float f5 = aVar3.f3133g;
                    if (f5 > 0.0f) {
                        int i30 = (int) ((i29 * f5) / f4);
                        float f6 = f4 - f5;
                        int i31 = i29 - i30;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + aVar3.leftMargin + aVar3.rightMargin, aVar3.width);
                        if (aVar3.height == 0 && mode2 == 1073741824) {
                            if (i30 <= 0) {
                                i30 = 0;
                            }
                            viewM3941b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                        } else {
                            int measuredHeight2 = i30 + viewM3941b3.getMeasuredHeight();
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            viewM3941b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        }
                        i5 = i31;
                        iCombineMeasuredStates = View.combineMeasuredStates(i27, viewM3941b3.getMeasuredState() & (-256));
                        f = f6;
                    } else {
                        f = f4;
                        i5 = i29;
                        iCombineMeasuredStates = i27;
                    }
                    int i32 = aVar3.leftMargin + aVar3.rightMargin;
                    int measuredWidth2 = viewM3941b3.getMeasuredWidth() + i32;
                    int iMax5 = Math.max(i28, measuredWidth2);
                    if (!(mode != 1073741824 && aVar3.width == -1)) {
                        i32 = measuredWidth2;
                    }
                    int iMax6 = Math.max(i26, i32);
                    z = z10 && aVar3.width == -1;
                    int i33 = this.f3123f;
                    this.f3123f = Math.max(i33, aVar3.bottomMargin + viewM3941b3.getMeasuredHeight() + i33 + aVar3.topMargin + m3940b(viewM3941b3));
                    i6 = iMax6;
                    i7 = iMax5;
                    float f7 = f;
                    i8 = iCombineMeasuredStates;
                    i29 = i5;
                    f4 = f7;
                }
                i25++;
                i26 = i6;
                i28 = i7;
                z10 = z;
                i27 = i8;
            }
            this.f3123f += getPaddingTop() + getPaddingBottom();
            z5 = z10;
            i3 = i26;
            i13 = i27;
            i4 = i28;
        } else {
            int iMax7 = Math.max(i14, i15);
            if (z8 && mode2 != 1073741824) {
                int i34 = 0;
                while (true) {
                    int i35 = i34;
                    if (i35 >= virtualChildCount) {
                        break;
                    }
                    View viewM3941b4 = m3941b(i35);
                    if (viewM3941b4 != null && viewM3941b4.getVisibility() != 8 && ((a) viewM3941b4.getLayoutParams()).f3133g > 0.0f) {
                        viewM3941b4.measure(View.MeasureSpec.makeMeasureSpec(viewM3941b4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824));
                    }
                    i34 = i35 + 1;
                }
            }
            i3 = iMax7;
            i4 = i12;
        }
        if (z5 || mode == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i13), iResolveSizeAndState);
        if (z6) {
            m3931c(virtualChildCount, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    void m3936a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int iM3934a;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i7 = this.f3122e & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        int i8 = this.f3122e & 8388615;
        switch (i7) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f3123f) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f3123f;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i9 = 0;
        int iM3940b = paddingTop;
        while (i9 < virtualChildCount) {
            View viewM3941b = m3941b(i9);
            if (viewM3941b == null) {
                iM3940b += m3947d(i9);
                iM3934a = i9;
            } else if (viewM3941b.getVisibility() != 8) {
                int measuredWidth = viewM3941b.getMeasuredWidth();
                int measuredHeight = viewM3941b.getMeasuredHeight();
                a aVar = (a) viewM3941b.getLayoutParams();
                int i10 = aVar.f3134h;
                if (i10 < 0) {
                    i10 = i8;
                }
                switch (C0233d.m1692a(i10, C0246q.m1759e(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - aVar.rightMargin;
                        break;
                    default:
                        i5 = paddingLeft + aVar.leftMargin;
                        break;
                }
                int i11 = (m3946c(i9) ? this.f3130m + iM3940b : iM3940b) + aVar.topMargin;
                m3930a(viewM3941b, i5, i11 + m3933a(viewM3941b), measuredWidth, measuredHeight);
                iM3940b = i11 + aVar.bottomMargin + measuredHeight + m3940b(viewM3941b);
                iM3934a = m3934a(viewM3941b, i9) + i9;
            } else {
                iM3934a = i9;
            }
            i9 = iM3934a + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    void m3937a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewM3941b = m3941b(i);
            if (viewM3941b != null && viewM3941b.getVisibility() != 8 && m3946c(i)) {
                m3938a(canvas, (viewM3941b.getTop() - ((a) viewM3941b.getLayoutParams()).topMargin) - this.f3130m);
            }
        }
        if (m3946c(virtualChildCount)) {
            View viewM3941b2 = m3941b(virtualChildCount - 1);
            m3938a(canvas, viewM3941b2 == null ? (getHeight() - getPaddingBottom()) - this.f3130m : ((a) viewM3941b2.getLayoutParams()).bottomMargin + viewM3941b2.getBottom());
        }
    }

    /* JADX INFO: renamed from: a */
    void m3938a(Canvas canvas, int i) {
        this.f3128k.setBounds(getPaddingLeft() + this.f3132o, i, (getWidth() - getPaddingRight()) - this.f3132o, this.f3130m + i);
        this.f3128k.draw(canvas);
    }

    /* JADX INFO: renamed from: a */
    void m3939a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    int m3940b(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    View m3941b(int i) {
        return getChildAt(i);
    }

    /* JADX INFO: renamed from: b */
    void m3942b(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int iCombineMeasuredStates;
        float f2;
        int baseline;
        int iM3934a;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        boolean z4;
        int i9;
        int i10;
        int i11;
        this.f3123f = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.f3126i == null || this.f3127j == null) {
            this.f3126i = new int[4];
            this.f3127j = new int[4];
        }
        int[] iArr = this.f3126i;
        int[] iArr2 = this.f3127j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.f3118a;
        boolean z9 = this.f3125h;
        boolean z10 = mode == 1073741824;
        int iMax3 = 0;
        int iM3934a2 = 0;
        while (iM3934a2 < virtualChildCount) {
            View viewM3941b = m3941b(iM3934a2);
            if (viewM3941b == null) {
                this.f3123f += m3947d(iM3934a2);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else if (viewM3941b.getVisibility() == 8) {
                iM3934a2 += m3934a(viewM3941b, iM3934a2);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else {
                if (m3946c(iM3934a2)) {
                    this.f3123f += this.f3129l;
                }
                a aVar = (a) viewM3941b.getLayoutParams();
                float f4 = f3 + aVar.f3133g;
                if (mode == 1073741824 && aVar.width == 0 && aVar.f3133g > 0.0f) {
                    if (z10) {
                        this.f3123f += aVar.leftMargin + aVar.rightMargin;
                    } else {
                        int i16 = this.f3123f;
                        this.f3123f = Math.max(i16, aVar.leftMargin + i16 + aVar.rightMargin);
                    }
                    if (z8) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewM3941b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    int i17 = Integer.MIN_VALUE;
                    if (aVar.width == 0 && aVar.f3133g > 0.0f) {
                        i17 = 0;
                        aVar.width = -2;
                    }
                    int i18 = i17;
                    m3939a(viewM3941b, iM3934a2, i, f4 == 0.0f ? this.f3123f : 0, i2, 0);
                    if (i18 != Integer.MIN_VALUE) {
                        aVar.width = i18;
                    }
                    int measuredWidth = viewM3941b.getMeasuredWidth();
                    if (z10) {
                        this.f3123f += aVar.leftMargin + measuredWidth + aVar.rightMargin + m3940b(viewM3941b);
                    } else {
                        int i19 = this.f3123f;
                        this.f3123f = Math.max(i19, i19 + measuredWidth + aVar.leftMargin + aVar.rightMargin + m3940b(viewM3941b));
                    }
                    if (z9) {
                        iMax3 = Math.max(measuredWidth, iMax3);
                    }
                }
                boolean z11 = false;
                if (mode2 == 1073741824 || aVar.height != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z11 = true;
                }
                int i20 = aVar.bottomMargin + aVar.topMargin;
                int measuredHeight = viewM3941b.getMeasuredHeight() + i20;
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i13, viewM3941b.getMeasuredState());
                if (z8) {
                    int baseline2 = viewM3941b.getBaseline();
                    if (baseline2 != -1) {
                        int i21 = ((((aVar.f3134h < 0 ? this.f3122e : aVar.f3134h) & C0025a.j.AppCompatTheme_windowFixedHeightMajor) >> 4) & (-2)) >> 1;
                        iArr[i21] = Math.max(iArr[i21], baseline2);
                        iArr2[i21] = Math.max(iArr2[i21], measuredHeight - baseline2);
                    }
                }
                int iMax4 = Math.max(i12, measuredHeight);
                z3 = z5 && aVar.height == -1;
                if (aVar.f3133g > 0.0f) {
                    iMax2 = Math.max(i15, z11 ? i20 : measuredHeight);
                    iMax = i14;
                } else {
                    if (!z11) {
                        i20 = measuredHeight;
                    }
                    iMax = Math.max(i14, i20);
                    iMax2 = i15;
                }
                iM3934a2 += m3934a(viewM3941b, iM3934a2);
                z4 = z7;
                i15 = iMax2;
                i14 = iMax;
                i9 = iMax4;
                i10 = iMax3;
                i11 = iCombineMeasuredStates2;
                z6 = z2;
                f3 = f4;
            }
            iM3934a2++;
            iMax3 = i10;
            z7 = z4;
            z5 = z3;
            i13 = i11;
            i12 = i9;
        }
        if (this.f3123f > 0 && m3946c(virtualChildCount)) {
            this.f3123f += this.f3129l;
        }
        int iMax5 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i12 : Math.max(i12, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f3123f = 0;
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View viewM3941b2 = m3941b(i22);
                if (viewM3941b2 == null) {
                    this.f3123f += m3947d(i22);
                    iM3934a = i22;
                } else if (viewM3941b2.getVisibility() == 8) {
                    iM3934a = m3934a(viewM3941b2, i22) + i22;
                } else {
                    a aVar2 = (a) viewM3941b2.getLayoutParams();
                    if (z10) {
                        this.f3123f = aVar2.rightMargin + aVar2.leftMargin + iMax3 + m3940b(viewM3941b2) + this.f3123f;
                        iM3934a = i22;
                    } else {
                        int i23 = this.f3123f;
                        this.f3123f = Math.max(i23, aVar2.rightMargin + i23 + iMax3 + aVar2.leftMargin + m3940b(viewM3941b2));
                        iM3934a = i22;
                    }
                }
                i22 = iM3934a + 1;
            }
        }
        this.f3123f += getPaddingLeft() + getPaddingRight();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(this.f3123f, getSuggestedMinimumWidth()), i, 0);
        int i24 = (16777215 & iResolveSizeAndState) - this.f3123f;
        if (z7 || (i24 != 0 && f3 > 0.0f)) {
            if (this.f3124g > 0.0f) {
                f3 = this.f3124g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f3123f = 0;
            int i25 = 0;
            float f5 = f3;
            boolean z12 = z5;
            int i26 = i14;
            int i27 = i13;
            int i28 = i24;
            int iMax6 = -1;
            while (i25 < virtualChildCount) {
                View viewM3941b3 = m3941b(i25);
                if (viewM3941b3 == null) {
                    f = f5;
                    i5 = i28;
                    i6 = iMax6;
                    i7 = i26;
                    z = z12;
                } else if (viewM3941b3.getVisibility() == 8) {
                    f = f5;
                    i5 = i28;
                    i6 = iMax6;
                    i7 = i26;
                    z = z12;
                } else {
                    a aVar3 = (a) viewM3941b3.getLayoutParams();
                    float f6 = aVar3.f3133g;
                    if (f6 > 0.0f) {
                        int i29 = (int) ((i28 * f6) / f5);
                        float f7 = f5 - f6;
                        i8 = i28 - i29;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + aVar3.topMargin + aVar3.bottomMargin, aVar3.height);
                        if (aVar3.width == 0 && mode == 1073741824) {
                            if (i29 <= 0) {
                                i29 = 0;
                            }
                            viewM3941b3.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), childMeasureSpec);
                        } else {
                            int measuredWidth2 = i29 + viewM3941b3.getMeasuredWidth();
                            if (measuredWidth2 < 0) {
                                measuredWidth2 = 0;
                            }
                            viewM3941b3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), childMeasureSpec);
                        }
                        iCombineMeasuredStates = View.combineMeasuredStates(i27, viewM3941b3.getMeasuredState() & (-16777216));
                        f2 = f7;
                    } else {
                        i8 = i28;
                        iCombineMeasuredStates = i27;
                        f2 = f5;
                    }
                    if (z10) {
                        this.f3123f += viewM3941b3.getMeasuredWidth() + aVar3.leftMargin + aVar3.rightMargin + m3940b(viewM3941b3);
                    } else {
                        int i30 = this.f3123f;
                        this.f3123f = Math.max(i30, viewM3941b3.getMeasuredWidth() + i30 + aVar3.leftMargin + aVar3.rightMargin + m3940b(viewM3941b3));
                    }
                    boolean z13 = mode2 != 1073741824 && aVar3.height == -1;
                    int i31 = aVar3.topMargin + aVar3.bottomMargin;
                    int measuredHeight2 = viewM3941b3.getMeasuredHeight() + i31;
                    int iMax7 = Math.max(iMax6, measuredHeight2);
                    int iMax8 = Math.max(i26, z13 ? i31 : measuredHeight2);
                    boolean z14 = z12 && aVar3.height == -1;
                    if (z8 && (baseline = viewM3941b3.getBaseline()) != -1) {
                        int i32 = ((((aVar3.f3134h < 0 ? this.f3122e : aVar3.f3134h) & C0025a.j.AppCompatTheme_windowFixedHeightMajor) >> 4) & (-2)) >> 1;
                        iArr[i32] = Math.max(iArr[i32], baseline);
                        iArr2[i32] = Math.max(iArr2[i32], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i7 = iMax8;
                    z = z14;
                    i27 = iCombineMeasuredStates;
                    i5 = i8;
                    i6 = iMax7;
                }
                i25++;
                i26 = i7;
                iMax6 = i6;
                z12 = z;
                i28 = i5;
                f5 = f;
            }
            this.f3123f += getPaddingLeft() + getPaddingRight();
            if (iArr[1] != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z12;
            i3 = i26;
            i13 = i27;
            i4 = iMax6;
        } else {
            int iMax9 = Math.max(i14, i15);
            if (z9 && mode != 1073741824) {
                int i33 = 0;
                while (true) {
                    int i34 = i33;
                    if (i34 >= virtualChildCount) {
                        break;
                    }
                    View viewM3941b4 = m3941b(i34);
                    if (viewM3941b4 != null && viewM3941b4.getVisibility() != 8 && ((a) viewM3941b4.getLayoutParams()).f3133g > 0.0f) {
                        viewM3941b4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(viewM3941b4.getMeasuredHeight(), 1073741824));
                    }
                    i33 = i34 + 1;
                }
            }
            i3 = iMax9;
            i4 = iMax5;
        }
        if (z5 || mode2 == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(((-16777216) & i13) | iResolveSizeAndState, View.resolveSizeAndState(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i13 << 16));
        if (z6) {
            m3932d(virtualChildCount, i);
        }
    }

    /* JADX INFO: renamed from: b */
    void m3943b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int iM3934a;
        int measuredHeight;
        boolean zM4582a = C0506bq.m4582a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f3122e & 8388615;
        int i9 = this.f3122e & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        boolean z = this.f3118a;
        int[] iArr = this.f3126i;
        int[] iArr2 = this.f3127j;
        switch (C0233d.m1692a(i8, C0246q.m1759e(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f3123f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f3123f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (zM4582a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i10 = 0;
        while (i10 < virtualChildCount) {
            int i11 = i6 + (i5 * i10);
            View viewM3941b = m3941b(i11);
            if (viewM3941b == null) {
                paddingLeft += m3947d(i11);
                iM3934a = i10;
            } else if (viewM3941b.getVisibility() != 8) {
                int measuredWidth = viewM3941b.getMeasuredWidth();
                int measuredHeight2 = viewM3941b.getMeasuredHeight();
                a aVar = (a) viewM3941b.getLayoutParams();
                int baseline = (!z || aVar.height == -1) ? -1 : viewM3941b.getBaseline();
                int i12 = aVar.f3134h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (i12 & C0025a.j.AppCompatTheme_windowFixedHeightMajor) {
                    case 16:
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + aVar.topMargin) - aVar.bottomMargin;
                        break;
                    case 48:
                        measuredHeight = paddingTop + aVar.topMargin;
                        if (baseline != -1) {
                            measuredHeight += iArr[1] - baseline;
                        }
                        break;
                    case 80:
                        measuredHeight = (paddingBottom - measuredHeight2) - aVar.bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (viewM3941b.getMeasuredHeight() - baseline);
                        }
                        break;
                    default:
                        measuredHeight = paddingTop;
                        break;
                }
                int i13 = (m3946c(i11) ? this.f3129l + paddingLeft : paddingLeft) + aVar.leftMargin;
                m3930a(viewM3941b, i13 + m3933a(viewM3941b), measuredHeight, measuredWidth, measuredHeight2);
                paddingLeft = i13 + aVar.rightMargin + measuredWidth + m3940b(viewM3941b);
                iM3934a = m3934a(viewM3941b, i11) + i10;
            } else {
                iM3934a = i10;
            }
            i10 = iM3934a + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    void m3944b(Canvas canvas) {
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean zM4582a = C0506bq.m4582a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View viewM3941b = m3941b(i);
            if (viewM3941b != null && viewM3941b.getVisibility() != 8 && m3946c(i)) {
                a aVar = (a) viewM3941b.getLayoutParams();
                m3945b(canvas, zM4582a ? aVar.rightMargin + viewM3941b.getRight() : (viewM3941b.getLeft() - aVar.leftMargin) - this.f3129l);
            }
        }
        if (m3946c(virtualChildCount)) {
            View viewM3941b2 = m3941b(virtualChildCount - 1);
            if (viewM3941b2 == null) {
                left = zM4582a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f3129l;
            } else {
                a aVar2 = (a) viewM3941b2.getLayoutParams();
                left = zM4582a ? (viewM3941b2.getLeft() - aVar2.leftMargin) - this.f3129l : aVar2.rightMargin + viewM3941b2.getRight();
            }
            m3945b(canvas, left);
        }
    }

    /* JADX INFO: renamed from: b */
    void m3945b(Canvas canvas, int i) {
        this.f3128k.setBounds(i, getPaddingTop() + this.f3132o, this.f3129l + i, (getHeight() - getPaddingBottom()) - this.f3132o);
        this.f3128k.draw(canvas);
    }

    /* JADX INFO: renamed from: c */
    protected boolean m3946c(int i) {
        if (i == 0) {
            return (this.f3131n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f3131n & 4) != 0;
        }
        if ((this.f3131n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: d */
    int m3947d(int i) {
        return 0;
    }

    @Override // android.view.View
    public int getBaseline() {
        int bottom;
        int i;
        if (this.f3119b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f3119b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f3119b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3119b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i2 = this.f3120c;
        if (this.f3121d == 1 && (i = this.f3122e & C0025a.j.AppCompatTheme_windowFixedHeightMajor) != 48) {
            switch (i) {
                case 16:
                    bottom = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3123f) / 2);
                    break;
                case 80:
                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3123f;
                    break;
                default:
                    bottom = i2;
                    break;
            }
        } else {
            bottom = i2;
        }
        return ((a) childAt.getLayoutParams()).topMargin + bottom + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3119b;
    }

    public Drawable getDividerDrawable() {
        return this.f3128k;
    }

    public int getDividerPadding() {
        return this.f3132o;
    }

    public int getDividerWidth() {
        return this.f3129l;
    }

    public int getGravity() {
        return this.f3122e;
    }

    public int getOrientation() {
        return this.f3121d;
    }

    public int getShowDividers() {
        return this.f3131n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3124g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        if (this.f3121d == 0) {
            return new a(-2, -2);
        }
        if (this.f3121d == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f3128k == null) {
            return;
        }
        if (this.f3121d == 1) {
            m3937a(canvas);
        } else {
            m3944b(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0477ao.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0477ao.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3121d == 1) {
            m3936a(i, i2, i3, i4);
        } else {
            m3943b(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f3121d == 1) {
            m3935a(i, i2);
        } else {
            m3942b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f3118a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f3119b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3128k) {
            return;
        }
        this.f3128k = drawable;
        if (drawable != null) {
            this.f3129l = drawable.getIntrinsicWidth();
            this.f3130m = drawable.getIntrinsicHeight();
        } else {
            this.f3129l = 0;
            this.f3130m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f3132o = i;
    }

    public void setGravity(int i) {
        if (this.f3122e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & C0025a.j.AppCompatTheme_windowFixedHeightMajor) == 0) {
                i2 |= 48;
            }
            this.f3122e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.f3122e & 8388615) != i2) {
            this.f3122e = i2 | (this.f3122e & (-8388616));
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3125h = z;
    }

    public void setOrientation(int i) {
        if (this.f3121d != i) {
            this.f3121d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3131n) {
            requestLayout();
        }
        this.f3131n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        if ((this.f3122e & C0025a.j.AppCompatTheme_windowFixedHeightMajor) != i2) {
            this.f3122e = i2 | (this.f3122e & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3124g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
