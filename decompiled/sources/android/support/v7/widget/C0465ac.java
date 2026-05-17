package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.p022a.C0333a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

/* JADX INFO: renamed from: android.support.v7.widget.ac */
/* JADX INFO: loaded from: classes.dex */
class C0465ac {

    /* JADX INFO: renamed from: a */
    private static final RectF f2972a = new RectF();

    /* JADX INFO: renamed from: b */
    private static Hashtable<String, Method> f2973b = new Hashtable<>();

    /* JADX INFO: renamed from: c */
    private int f2974c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f2975d = false;

    /* JADX INFO: renamed from: e */
    private float f2976e = -1.0f;

    /* JADX INFO: renamed from: f */
    private float f2977f = -1.0f;

    /* JADX INFO: renamed from: g */
    private float f2978g = -1.0f;

    /* JADX INFO: renamed from: h */
    private int[] f2979h = new int[0];

    /* JADX INFO: renamed from: i */
    private boolean f2980i = false;

    /* JADX INFO: renamed from: j */
    private TextPaint f2981j;

    /* JADX INFO: renamed from: k */
    private final TextView f2982k;

    /* JADX INFO: renamed from: l */
    private final Context f2983l;

    C0465ac(TextView textView) {
        this.f2982k = textView;
        this.f2983l = this.f2982k.getContext();
    }

    /* JADX INFO: renamed from: a */
    private int m3747a(RectF rectF) {
        int length = this.f2979h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 0;
        int i2 = 1;
        int i3 = length - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            if (m3755a(this.f2979h[i4], rectF)) {
                int i5 = i4 + 1;
                i = i2;
                i2 = i5;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f2979h[i];
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    private StaticLayout m3748a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float fFloatValue;
        float fFloatValue2;
        boolean zBooleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            fFloatValue = this.f2982k.getLineSpacingMultiplier();
            fFloatValue2 = this.f2982k.getLineSpacingExtra();
            zBooleanValue = this.f2982k.getIncludeFontPadding();
        } else {
            fFloatValue = ((Float) m3750a(this.f2982k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            fFloatValue2 = ((Float) m3750a(this.f2982k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            zBooleanValue = ((Boolean) m3750a(this.f2982k, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2981j, i, alignment, fFloatValue, fFloatValue2, zBooleanValue);
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: a */
    private StaticLayout m3749a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m3750a(this.f2982k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2981j, i).setAlignment(alignment).setLineSpacing(this.f2982k.getLineSpacingExtra(), this.f2982k.getLineSpacingMultiplier()).setIncludePad(this.f2982k.getIncludeFontPadding()).setBreakStrategy(this.f2982k.getBreakStrategy()).setHyphenationFrequency(this.f2982k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* JADX INFO: renamed from: a */
    private <T> T m3750a(Object obj, String str, T t) {
        boolean z = false;
        try {
            try {
                T t2 = (T) m3751a(str).invoke(obj, new Object[0]);
                if (t2 == null) {
                }
                return t2;
            } catch (Exception e) {
                z = true;
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
                if (0 != 0) {
                    return null;
                }
                return t;
            }
        } catch (Throwable th) {
            if (0 != 0 || z) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private Method m3751a(String str) {
        try {
            Method method = f2973b.get(str);
            if (method != null) {
                return method;
            }
            Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f2973b.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3752a(float f) {
        if (f != this.f2982k.getPaint().getTextSize()) {
            this.f2982k.getPaint().setTextSize(f);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2982k.isInLayout() : false;
            if (this.f2982k.getLayout() != null) {
                this.f2975d = false;
                try {
                    Method methodM3751a = m3751a("nullLayouts");
                    if (methodM3751a != null) {
                        methodM3751a.invoke(this.f2982k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.f2982k.forceLayout();
                } else {
                    this.f2982k.requestLayout();
                }
                this.f2982k.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3753a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f2974c = 1;
        this.f2977f = f;
        this.f2978g = f2;
        this.f2976e = f3;
        this.f2980i = false;
    }

    /* JADX INFO: renamed from: a */
    private void m3754a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2979h = m3756a(iArr);
            m3757h();
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3755a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2982k.getText();
        TransformationMethod transformationMethod = this.f2982k.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2982k)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2982k.getMaxLines() : -1;
        if (this.f2981j == null) {
            this.f2981j = new TextPaint();
        } else {
            this.f2981j.reset();
        }
        this.f2981j.set(this.f2982k.getPaint());
        this.f2981j.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) m3750a(this.f2982k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout staticLayoutM3749a = Build.VERSION.SDK_INT >= 23 ? m3749a(text, alignment, Math.round(rectF.right), maxLines) : m3748a(text, alignment, Math.round(rectF.right));
        if (maxLines == -1 || (staticLayoutM3749a.getLineCount() <= maxLines && staticLayoutM3749a.getLineEnd(staticLayoutM3749a.getLineCount() - 1) == text.length())) {
            return ((float) staticLayoutM3749a.getHeight()) <= rectF.bottom;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private int[] m3756a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    private boolean m3757h() {
        this.f2980i = this.f2979h.length > 0;
        if (this.f2980i) {
            this.f2974c = 1;
            this.f2977f = this.f2979h[0];
            this.f2978g = this.f2979h[r3 - 1];
            this.f2976e = -1.0f;
        }
        return this.f2980i;
    }

    /* JADX INFO: renamed from: i */
    private boolean m3758i() {
        if (m3760k() && this.f2974c == 1) {
            if (!this.f2980i || this.f2979h.length == 0) {
                float fRound = Math.round(this.f2977f);
                int i = 1;
                while (Math.round(this.f2976e + fRound) <= Math.round(this.f2978g)) {
                    i++;
                    fRound += this.f2976e;
                }
                int[] iArr = new int[i];
                float f = this.f2977f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f2976e;
                }
                this.f2979h = m3756a(iArr);
            }
            this.f2975d = true;
        } else {
            this.f2975d = false;
        }
        return this.f2975d;
    }

    /* JADX INFO: renamed from: j */
    private void m3759j() {
        this.f2974c = 0;
        this.f2977f = -1.0f;
        this.f2978g = -1.0f;
        this.f2976e = -1.0f;
        this.f2979h = new int[0];
        this.f2975d = false;
    }

    /* JADX INFO: renamed from: k */
    private boolean m3760k() {
        return !(this.f2982k instanceof C0518n);
    }

    /* JADX INFO: renamed from: a */
    int m3761a() {
        return this.f2974c;
    }

    /* JADX INFO: renamed from: a */
    void m3762a(int i) {
        if (m3760k()) {
            switch (i) {
                case 0:
                    m3759j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f2983l.getResources().getDisplayMetrics();
                    m3753a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m3758i()) {
                        m3771f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3763a(int i, float f) {
        m3752a(TypedValue.applyDimension(i, f, (this.f2983l == null ? Resources.getSystem() : this.f2983l.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: a */
    void m3764a(int i, int i2, int i3, int i4) {
        if (m3760k()) {
            DisplayMetrics displayMetrics = this.f2983l.getResources().getDisplayMetrics();
            m3753a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m3758i()) {
                m3771f();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3765a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f2983l.obtainStyledAttributes(attributeSet, C0333a.j.AppCompatTextView, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextView_autoSizeTextType)) {
            this.f2974c = typedArrayObtainStyledAttributes.getInt(C0333a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(C0333a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(C0333a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(C0333a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m3754a(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m3760k()) {
            this.f2974c = 0;
            return;
        }
        if (this.f2974c == 1) {
            if (!this.f2980i) {
                DisplayMetrics displayMetrics = this.f2983l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m3753a(dimension2, dimension3, dimension);
            }
            m3758i();
        }
    }

    /* JADX INFO: renamed from: a */
    void m3766a(int[] iArr, int i) {
        if (m3760k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2983l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f2979h = m3756a(iArrCopyOf);
                if (!m3757h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2980i = false;
            }
            if (m3758i()) {
                m3771f();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    int m3767b() {
        return Math.round(this.f2976e);
    }

    /* JADX INFO: renamed from: c */
    int m3768c() {
        return Math.round(this.f2977f);
    }

    /* JADX INFO: renamed from: d */
    int m3769d() {
        return Math.round(this.f2978g);
    }

    /* JADX INFO: renamed from: e */
    int[] m3770e() {
        return this.f2979h;
    }

    /* JADX INFO: renamed from: f */
    void m3771f() {
        if (m3772g()) {
            if (this.f2975d) {
                if (this.f2982k.getMeasuredHeight() <= 0 || this.f2982k.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m3750a(this.f2982k, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.f2982k.getMeasuredWidth() - this.f2982k.getTotalPaddingLeft()) - this.f2982k.getTotalPaddingRight();
                int height = (this.f2982k.getHeight() - this.f2982k.getCompoundPaddingBottom()) - this.f2982k.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f2972a) {
                    f2972a.setEmpty();
                    f2972a.right = measuredWidth;
                    f2972a.bottom = height;
                    float fM3747a = m3747a(f2972a);
                    if (fM3747a != this.f2982k.getTextSize()) {
                        m3763a(0, fM3747a);
                    }
                }
            }
            this.f2975d = true;
        }
    }

    /* JADX INFO: renamed from: g */
    boolean m3772g() {
        return m3760k() && this.f2974c != 0;
    }
}
