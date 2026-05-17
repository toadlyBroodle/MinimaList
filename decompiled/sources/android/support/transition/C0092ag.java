package android.support.transition;

import android.animation.LayoutTransition;
import android.support.transition.C0125r;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.transition.ag */
/* JADX INFO: loaded from: classes.dex */
class C0092ag implements InterfaceC0094ai {

    /* JADX INFO: renamed from: a */
    private static LayoutTransition f506a;

    /* JADX INFO: renamed from: b */
    private static Field f507b;

    /* JADX INFO: renamed from: c */
    private static boolean f508c;

    /* JADX INFO: renamed from: d */
    private static Method f509d;

    /* JADX INFO: renamed from: e */
    private static boolean f510e;

    C0092ag() {
    }

    /* JADX INFO: renamed from: a */
    private static void m597a(LayoutTransition layoutTransition) {
        if (!f510e) {
            try {
                f509d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f509d.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f510e = true;
        }
        if (f509d != null) {
            try {
                f509d.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException e3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    @Override // android.support.transition.InterfaceC0094ai
    /* JADX INFO: renamed from: a */
    public InterfaceC0090ae mo598a(ViewGroup viewGroup) {
        return C0088ac.m590a(viewGroup);
    }

    @Override // android.support.transition.InterfaceC0094ai
    /* JADX INFO: renamed from: a */
    public void mo599a(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f506a == null) {
            f506a = new LayoutTransition() { // from class: android.support.transition.ag.1
                @Override // android.animation.LayoutTransition
                public boolean isChangingLayout() {
                    return true;
                }
            };
            f506a.setAnimator(2, null);
            f506a.setAnimator(0, null);
            f506a.setAnimator(1, null);
            f506a.setAnimator(3, null);
            f506a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m597a(layoutTransition);
                }
                if (layoutTransition != f506a) {
                    viewGroup.setTag(C0125r.a.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f506a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f508c) {
            try {
                f507b = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f507b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f508c = true;
        }
        if (f507b != null) {
            try {
                z2 = f507b.getBoolean(viewGroup);
                if (z2) {
                    f507b.setBoolean(viewGroup, false);
                }
            } catch (IllegalAccessException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(C0125r.a.transition_layout_save);
        if (layoutTransition2 != null) {
            viewGroup.setTag(C0125r.a.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
