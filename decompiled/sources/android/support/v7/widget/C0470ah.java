package android.support.v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.v4.p009c.p010a.InterfaceC0182b;
import android.support.v7.p025c.p026a.C0368a;

/* JADX INFO: renamed from: android.support.v7.widget.ah */
/* JADX INFO: loaded from: classes.dex */
public class C0470ah {

    /* JADX INFO: renamed from: a */
    public static final Rect f3040a = new Rect();

    /* JADX INFO: renamed from: b */
    private static Class<?> f3041b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f3041b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static PorterDuff.Mode m3863a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m3864a(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m3866c(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m3865b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                for (Drawable drawable2 : children) {
                    if (!m3865b(drawable2)) {
                        return false;
                    }
                }
            }
        } else {
            if (drawable instanceof InterfaceC0182b) {
                return m3865b(((InterfaceC0182b) drawable).mo1402a());
            }
            if (drawable instanceof C0368a) {
                return m3865b(((C0368a) drawable).m2798b());
            }
            if (drawable instanceof ScaleDrawable) {
                return m3865b(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static void m3866c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C0493bd.f3457e);
        } else {
            drawable.setState(C0493bd.f3460h);
        }
        drawable.setState(state);
    }
}
