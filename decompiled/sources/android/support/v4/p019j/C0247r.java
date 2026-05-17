package android.support.v4.p019j;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v4.j.r */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0247r {

    /* JADX INFO: renamed from: a */
    private static Method f1359a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1359a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m1831a(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : m1833c(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: b */
    public static float m1832b(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : m1833c(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: c */
    private static float m1833c(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 25 && f1359a != null) {
            try {
                return ((Integer) f1359a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
