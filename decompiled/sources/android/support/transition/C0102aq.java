package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.transition.aq */
/* JADX INFO: loaded from: classes.dex */
class C0102aq extends C0101ap {

    /* JADX INFO: renamed from: a */
    private static Method f530a;

    /* JADX INFO: renamed from: b */
    private static boolean f531b;

    /* JADX INFO: renamed from: c */
    private static Method f532c;

    /* JADX INFO: renamed from: d */
    private static boolean f533d;

    C0102aq() {
    }

    /* JADX INFO: renamed from: a */
    private void m635a() {
        if (f531b) {
            return;
        }
        try {
            f530a = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
            f530a.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
        }
        f531b = true;
    }

    /* JADX INFO: renamed from: b */
    private void m636b() {
        if (f533d) {
            return;
        }
        try {
            f532c = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
            f532c.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
        }
        f533d = true;
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo627a(View view, Matrix matrix) {
        m635a();
        if (f530a != null) {
            try {
                f530a.invoke(view, matrix);
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: b */
    public void mo629b(View view, Matrix matrix) {
        m636b();
        if (f532c != null) {
            try {
                f532c.invoke(view, matrix);
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
