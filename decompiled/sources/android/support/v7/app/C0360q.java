package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v7.app.q */
/* JADX INFO: loaded from: classes.dex */
class C0360q {

    /* JADX INFO: renamed from: a */
    private static Field f2034a;

    /* JADX INFO: renamed from: b */
    private static boolean f2035b;

    /* JADX INFO: renamed from: c */
    private static Class f2036c;

    /* JADX INFO: renamed from: d */
    private static boolean f2037d;

    /* JADX INFO: renamed from: e */
    private static Field f2038e;

    /* JADX INFO: renamed from: f */
    private static boolean f2039f;

    /* JADX INFO: renamed from: g */
    private static Field f2040g;

    /* JADX INFO: renamed from: h */
    private static boolean f2041h;

    /* JADX INFO: renamed from: a */
    static boolean m2729a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m2733d(resources);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return m2732c(resources);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return m2731b(resources);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2730a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2037d) {
            try {
                f2036c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2037d = true;
        }
        if (f2036c == null) {
            return false;
        }
        if (!f2039f) {
            try {
                f2038e = f2036c.getDeclaredField("mUnthemedEntries");
                f2038e.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2039f = true;
        }
        if (f2038e == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) f2038e.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m2731b(Resources resources) {
        Map map;
        if (!f2035b) {
            try {
                f2034a = Resources.class.getDeclaredField("mDrawableCache");
                f2034a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2035b = true;
        }
        if (f2034a != null) {
            try {
                map = (Map) f2034a.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m2732c(Resources resources) {
        Object obj;
        if (!f2035b) {
            try {
                f2034a = Resources.class.getDeclaredField("mDrawableCache");
                f2034a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2035b = true;
        }
        if (f2034a != null) {
            try {
                obj = f2034a.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        return obj != null && m2730a(obj);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m2733d(Resources resources) throws IllegalAccessException {
        Object obj;
        Object obj2;
        if (!f2041h) {
            try {
                f2040g = Resources.class.getDeclaredField("mResourcesImpl");
                f2040g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2041h = true;
        }
        if (f2040g == null) {
            return false;
        }
        try {
            obj = f2040g.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f2035b) {
            try {
                f2034a = obj.getClass().getDeclaredField("mDrawableCache");
                f2034a.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2035b = true;
        }
        if (f2034a != null) {
            try {
                obj2 = f2034a.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        return obj2 != null && m2730a(obj2);
    }
}
