package android.support.v4.p007b;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* JADX INFO: renamed from: android.support.v4.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0175b {

    /* JADX INFO: renamed from: a */
    private static final Object f1086a = new Object();

    /* JADX INFO: renamed from: b */
    private static TypedValue f1087b;

    /* JADX INFO: renamed from: a */
    public static final Drawable m1337a(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f1086a) {
            if (f1087b == null) {
                f1087b = new TypedValue();
            }
            context.getResources().getValue(i, f1087b, true);
            i2 = f1087b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1338a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1339a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final ColorStateList m1340b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* JADX INFO: renamed from: c */
    public static final int m1341c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }
}
