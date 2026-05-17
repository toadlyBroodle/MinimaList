package android.support.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.transition.ar */
/* JADX INFO: loaded from: classes.dex */
class C0103ar extends C0102aq {

    /* JADX INFO: renamed from: a */
    private static Method f534a;

    /* JADX INFO: renamed from: b */
    private static boolean f535b;

    C0103ar() {
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: a */
    private void m637a() {
        if (f535b) {
            return;
        }
        try {
            f534a = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            f534a.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
        }
        f535b = true;
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo626a(View view, int i, int i2, int i3, int i4) {
        m637a();
        if (f534a != null) {
            try {
                f534a.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
