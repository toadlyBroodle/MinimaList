package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.transition.ah */
/* JADX INFO: loaded from: classes.dex */
class C0093ah extends C0092ag {

    /* JADX INFO: renamed from: a */
    private static Method f512a;

    /* JADX INFO: renamed from: b */
    private static boolean f513b;

    C0093ah() {
    }

    /* JADX INFO: renamed from: a */
    private void m600a() {
        if (f513b) {
            return;
        }
        try {
            f512a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
            f512a.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
        }
        f513b = true;
    }

    @Override // android.support.transition.C0092ag, android.support.transition.InterfaceC0094ai
    /* JADX INFO: renamed from: a */
    public InterfaceC0090ae mo598a(ViewGroup viewGroup) {
        return new C0089ad(viewGroup);
    }

    @Override // android.support.transition.C0092ag, android.support.transition.InterfaceC0094ai
    /* JADX INFO: renamed from: a */
    public void mo599a(ViewGroup viewGroup, boolean z) {
        m600a();
        if (f512a != null) {
            try {
                f512a.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e2);
            }
        }
    }
}
