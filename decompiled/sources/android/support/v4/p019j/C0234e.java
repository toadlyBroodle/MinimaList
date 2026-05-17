package android.support.v4.p019j;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: android.support.v4.j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0234e {

    /* JADX INFO: renamed from: a */
    static final b f1336a;

    /* JADX INFO: renamed from: b */
    private static Field f1337b;

    /* JADX INFO: renamed from: c */
    private static boolean f1338c;

    /* JADX INFO: renamed from: android.support.v4.j.e$a */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.p019j.C0234e.b
        /* JADX INFO: renamed from: a */
        public void mo1696a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.e$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        public void mo1696a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                C0234e.m1694a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                C0234e.m1694a(layoutInflater, factory2);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1336a = new a();
        } else {
            f1336a = new b();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m1694a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1338c) {
            try {
                f1337b = LayoutInflater.class.getDeclaredField("mFactory2");
                f1337b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1338c = true;
        }
        if (f1337b != null) {
            try {
                f1337b.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1695b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        f1336a.mo1696a(layoutInflater, factory2);
    }
}
