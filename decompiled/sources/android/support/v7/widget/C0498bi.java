package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: android.support.v7.widget.bi */
/* JADX INFO: loaded from: classes.dex */
public class C0498bi {

    /* JADX INFO: renamed from: a */
    private final Context f3472a;

    /* JADX INFO: renamed from: b */
    private final TypedArray f3473b;

    /* JADX INFO: renamed from: c */
    private TypedValue f3474c;

    private C0498bi(Context context, TypedArray typedArray) {
        this.f3472a = context;
        this.f3473b = typedArray;
    }

    /* JADX INFO: renamed from: a */
    public static C0498bi m4508a(Context context, int i, int[] iArr) {
        return new C0498bi(context, context.obtainStyledAttributes(i, iArr));
    }

    /* JADX INFO: renamed from: a */
    public static C0498bi m4509a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0498bi(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: a */
    public static C0498bi m4510a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0498bi(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public float m4511a(int i, float f) {
        return this.f3473b.getFloat(i, f);
    }

    /* JADX INFO: renamed from: a */
    public int m4512a(int i, int i2) {
        return this.f3473b.getInt(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public Typeface m4513a(int i, int i2, C0173b.a aVar) {
        int resourceId = this.f3473b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3474c == null) {
            this.f3474c = new TypedValue();
        }
        return C0173b.m1320a(this.f3472a, resourceId, this.f3474c, i2, aVar);
    }

    /* JADX INFO: renamed from: a */
    public Drawable m4514a(int i) {
        int resourceId;
        return (!this.f3473b.hasValue(i) || (resourceId = this.f3473b.getResourceId(i, 0)) == 0) ? this.f3473b.getDrawable(i) : C0366b.m2790b(this.f3472a, resourceId);
    }

    /* JADX INFO: renamed from: a */
    public void m4515a() {
        this.f3473b.recycle();
    }

    /* JADX INFO: renamed from: a */
    public boolean m4516a(int i, boolean z) {
        return this.f3473b.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: b */
    public int m4517b(int i, int i2) {
        return this.f3473b.getColor(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public Drawable m4518b(int i) {
        int resourceId;
        if (!this.f3473b.hasValue(i) || (resourceId = this.f3473b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0517m.m4669a().m4689a(this.f3472a, resourceId, true);
    }

    /* JADX INFO: renamed from: c */
    public int m4519c(int i, int i2) {
        return this.f3473b.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m4520c(int i) {
        return this.f3473b.getText(i);
    }

    /* JADX INFO: renamed from: d */
    public int m4521d(int i, int i2) {
        return this.f3473b.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public String m4522d(int i) {
        return this.f3473b.getString(i);
    }

    /* JADX INFO: renamed from: e */
    public int m4523e(int i, int i2) {
        return this.f3473b.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public ColorStateList m4524e(int i) {
        int resourceId;
        ColorStateList colorStateListM2787a;
        return (!this.f3473b.hasValue(i) || (resourceId = this.f3473b.getResourceId(i, 0)) == 0 || (colorStateListM2787a = C0366b.m2787a(this.f3472a, resourceId)) == null) ? this.f3473b.getColorStateList(i) : colorStateListM2787a;
    }

    /* JADX INFO: renamed from: f */
    public int m4525f(int i, int i2) {
        return this.f3473b.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public CharSequence[] m4526f(int i) {
        return this.f3473b.getTextArray(i);
    }

    /* JADX INFO: renamed from: g */
    public int m4527g(int i, int i2) {
        return this.f3473b.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m4528g(int i) {
        return this.f3473b.hasValue(i);
    }
}
