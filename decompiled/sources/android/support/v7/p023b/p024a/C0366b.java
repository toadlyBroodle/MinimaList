package android.support.v7.p023b.p024a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p007b.C0175b;
import android.support.v7.widget.C0517m;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: android.support.v7.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0366b {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal<TypedValue> f2112a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f2113b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    private static final Object f2114c = new Object();

    /* JADX INFO: renamed from: android.support.v7.b.a.b$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        final ColorStateList f2115a;

        /* JADX INFO: renamed from: b */
        final Configuration f2116b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f2115a = colorStateList;
            this.f2116b = configuration;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2787a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList colorStateListM2792d = m2792d(context, i);
        if (colorStateListM2792d != null) {
            return colorStateListM2792d;
        }
        ColorStateList colorStateListM2791c = m2791c(context, i);
        if (colorStateListM2791c == null) {
            return C0175b.m1340b(context, i);
        }
        m2789a(context, i, colorStateListM2791c);
        return colorStateListM2791c;
    }

    /* JADX INFO: renamed from: a */
    private static TypedValue m2788a() {
        TypedValue typedValue = f2112a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2112a.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: a */
    private static void m2789a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2114c) {
            SparseArray<a> sparseArray = f2113b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f2113b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2790b(Context context, int i) {
        return C0517m.m4669a().m4688a(context, i);
    }

    /* JADX INFO: renamed from: c */
    private static ColorStateList m2791c(Context context, int i) {
        if (m2793e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0365a.m2783a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static ColorStateList m2792d(Context context, int i) {
        a aVar;
        synchronized (f2114c) {
            SparseArray<a> sparseArray = f2113b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f2116b.equals(context.getResources().getConfiguration())) {
                    return aVar.f2115a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m2793e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValueM2788a = m2788a();
        resources.getValue(i, typedValueM2788a, true);
        return typedValueM2788a.type >= 28 && typedValueM2788a.type <= 31;
    }
}
