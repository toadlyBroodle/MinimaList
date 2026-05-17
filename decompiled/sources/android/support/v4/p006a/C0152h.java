package android.support.v4.p006a;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v4.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0152h {

    /* JADX INFO: renamed from: android.support.v4.a.h$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private static Method f789a;

        /* JADX INFO: renamed from: b */
        private static boolean f790b;

        /* JADX INFO: renamed from: c */
        private static Method f791c;

        /* JADX INFO: renamed from: d */
        private static boolean f792d;

        /* JADX INFO: renamed from: a */
        public static IBinder m864a(Bundle bundle, String str) {
            if (!f790b) {
                try {
                    f789a = Bundle.class.getMethod("getIBinder", String.class);
                    f789a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f790b = true;
            }
            if (f789a != null) {
                try {
                    return (IBinder) f789a.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f789a = null;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static void m865a(Bundle bundle, String str, IBinder iBinder) {
            if (!f792d) {
                try {
                    f791c = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f791c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f792d = true;
            }
            if (f791c != null) {
                try {
                    f791c.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f791c = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static IBinder m862a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.m864a(bundle, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m863a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.m865a(bundle, str, iBinder);
        }
    }
}
