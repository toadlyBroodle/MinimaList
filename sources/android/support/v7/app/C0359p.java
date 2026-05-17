package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.p009c.C0180a;
import android.support.v7.p022a.C0333a;
import android.util.TypedValue;

/* JADX INFO: renamed from: android.support.v7.app.p */
/* JADX INFO: loaded from: classes.dex */
final class C0359p {
    /* JADX INFO: renamed from: a */
    public static float m2726a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: a */
    public static int m2727a(Context context, int i) {
        return C0180a.m1383b(-1, m2728a(context, i, C0333a.a.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    /* JADX INFO: renamed from: a */
    private static int m2728a(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }
}
