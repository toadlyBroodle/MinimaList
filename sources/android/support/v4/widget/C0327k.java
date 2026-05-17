package android.support.v4.widget;

import android.os.Build;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v4.widget.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0327k {

    /* JADX INFO: renamed from: a */
    static final d f1734a;

    /* JADX INFO: renamed from: android.support.v4.widget.k$a */
    static class a extends d {
        a() {
        }

        @Override // android.support.v4.widget.C0327k.d
        /* JADX INFO: renamed from: a */
        public void mo2464a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.k$b */
    static class b extends a {

        /* JADX INFO: renamed from: a */
        private static Field f1735a;

        static {
            try {
                f1735a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1735a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        b() {
        }

        @Override // android.support.v4.widget.C0327k.d
        /* JADX INFO: renamed from: a */
        public void mo2465a(PopupWindow popupWindow, boolean z) {
            if (f1735a != null) {
                try {
                    f1735a.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.k$c */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.widget.C0327k.d
        /* JADX INFO: renamed from: a */
        public void mo2466a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        @Override // android.support.v4.widget.C0327k.b, android.support.v4.widget.C0327k.d
        /* JADX INFO: renamed from: a */
        public void mo2465a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.k$d */
    static class d {

        /* JADX INFO: renamed from: a */
        private static Method f1736a;

        /* JADX INFO: renamed from: b */
        private static boolean f1737b;

        d() {
        }

        /* JADX INFO: renamed from: a */
        public void mo2466a(PopupWindow popupWindow, int i) {
            if (!f1737b) {
                try {
                    f1736a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    f1736a.setAccessible(true);
                } catch (Exception e) {
                }
                f1737b = true;
            }
            if (f1736a != null) {
                try {
                    f1736a.invoke(popupWindow, Integer.valueOf(i));
                } catch (Exception e2) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo2464a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0233d.m1692a(i3, C0246q.m1759e(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* JADX INFO: renamed from: a */
        public void mo2465a(PopupWindow popupWindow, boolean z) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f1734a = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f1734a = new b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f1734a = new a();
        } else {
            f1734a = new d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2461a(PopupWindow popupWindow, int i) {
        f1734a.mo2466a(popupWindow, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m2462a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f1734a.mo2464a(popupWindow, view, i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public static void m2463a(PopupWindow popupWindow, boolean z) {
        f1734a.mo2465a(popupWindow, z);
    }
}
