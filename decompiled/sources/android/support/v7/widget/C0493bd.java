package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.p009c.C0180a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: android.support.v7.widget.bd */
/* JADX INFO: loaded from: classes.dex */
class C0493bd {

    /* JADX INFO: renamed from: i */
    private static final ThreadLocal<TypedValue> f3461i = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    static final int[] f3453a = {-16842910};

    /* JADX INFO: renamed from: b */
    static final int[] f3454b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    static final int[] f3455c = {R.attr.state_activated};

    /* JADX INFO: renamed from: d */
    static final int[] f3456d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    static final int[] f3457e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    static final int[] f3458f = {R.attr.state_selected};

    /* JADX INFO: renamed from: g */
    static final int[] f3459g = {-16842919, -16842908};

    /* JADX INFO: renamed from: h */
    static final int[] f3460h = new int[0];

    /* JADX INFO: renamed from: j */
    private static final int[] f3462j = new int[1];

    /* JADX INFO: renamed from: a */
    public static int m4498a(Context context, int i) {
        f3462j[0] = i;
        C0498bi c0498biM4509a = C0498bi.m4509a(context, (AttributeSet) null, f3462j);
        try {
            return c0498biM4509a.m4517b(0, 0);
        } finally {
            c0498biM4509a.m4515a();
        }
    }

    /* JADX INFO: renamed from: a */
    static int m4499a(Context context, int i, float f) {
        return C0180a.m1384c(m4498a(context, i), Math.round(Color.alpha(r0) * f));
    }

    /* JADX INFO: renamed from: a */
    private static TypedValue m4500a() {
        TypedValue typedValue = f3461i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3461i.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m4501b(Context context, int i) {
        f3462j[0] = i;
        C0498bi c0498biM4509a = C0498bi.m4509a(context, (AttributeSet) null, f3462j);
        try {
            return c0498biM4509a.m4524e(0);
        } finally {
            c0498biM4509a.m4515a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4502c(Context context, int i) {
        ColorStateList colorStateListM4501b = m4501b(context, i);
        if (colorStateListM4501b != null && colorStateListM4501b.isStateful()) {
            return colorStateListM4501b.getColorForState(f3453a, colorStateListM4501b.getDefaultColor());
        }
        TypedValue typedValueM4500a = m4500a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM4500a, true);
        return m4499a(context, i, typedValueM4500a.getFloat());
    }
}
