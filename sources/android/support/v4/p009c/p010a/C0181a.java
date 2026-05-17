package android.support.v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v4.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0181a {

    /* JADX INFO: renamed from: a */
    private static Method f1121a;

    /* JADX INFO: renamed from: b */
    private static boolean f1122b;

    /* JADX INFO: renamed from: c */
    private static Method f1123c;

    /* JADX INFO: renamed from: d */
    private static boolean f1124d;

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m1386a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: a */
    public static void m1387a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1388a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0186f) {
            ((InterfaceC0186f) drawable).setTint(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1389a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1390a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0186f) {
            ((InterfaceC0186f) drawable).setTintList(colorStateList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1391a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1392a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1393a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0186f) {
            ((InterfaceC0186f) drawable).setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1394a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1395b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1396b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f1122b) {
            try {
                f1121a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f1121a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f1122b = true;
        }
        if (f1121a != null) {
            try {
                f1121a.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f1121a = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static int m1397c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1398d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static ColorFilter m1399e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m1400f(Drawable drawable) {
        return Build.VERSION.SDK_INT >= 23 ? drawable : Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof InterfaceC0186f) ? new C0185e(drawable) : drawable : Build.VERSION.SDK_INT >= 19 ? !(drawable instanceof InterfaceC0186f) ? new C0184d(drawable) : drawable : !(drawable instanceof InterfaceC0186f) ? new C0183c(drawable) : drawable;
    }

    /* JADX INFO: renamed from: g */
    public static int m1401g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f1124d) {
            try {
                f1123c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1123c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f1124d = true;
        }
        if (f1123c != null) {
            try {
                return ((Integer) f1123c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f1123c = null;
            }
        }
        return 0;
    }
}
