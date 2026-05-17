package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.transition.ap */
/* JADX INFO: loaded from: classes.dex */
class C0101ap extends C0100ao {

    /* JADX INFO: renamed from: a */
    private static Method f526a;

    /* JADX INFO: renamed from: b */
    private static boolean f527b;

    /* JADX INFO: renamed from: c */
    private static Method f528c;

    /* JADX INFO: renamed from: d */
    private static boolean f529d;

    C0101ap() {
    }

    /* JADX INFO: renamed from: a */
    private void m633a() {
        if (f527b) {
            return;
        }
        try {
            f526a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
            f526a.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
        }
        f527b = true;
    }

    /* JADX INFO: renamed from: b */
    private void m634b() {
        if (f529d) {
            return;
        }
        try {
            f528c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
            f528c.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
        }
        f529d = true;
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo625a(View view, float f) {
        m633a();
        if (f526a == null) {
            view.setAlpha(f);
            return;
        }
        try {
            f526a.invoke(view, Float.valueOf(f));
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: c */
    public float mo630c(View view) {
        m634b();
        if (f528c != null) {
            try {
                return ((Float) f528c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.mo630c(view);
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: d */
    public void mo631d(View view) {
    }

    @Override // android.support.transition.C0099an, android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: e */
    public void mo632e(View view) {
    }
}
