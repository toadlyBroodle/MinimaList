package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.p019j.C0246q;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: android.support.transition.am */
/* JADX INFO: loaded from: classes.dex */
class C0098am {

    /* JADX INFO: renamed from: a */
    static final Property<View, Float> f521a;

    /* JADX INFO: renamed from: b */
    static final Property<View, Rect> f522b;

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0104as f523c;

    /* JADX INFO: renamed from: d */
    private static Field f524d;

    /* JADX INFO: renamed from: e */
    private static boolean f525e;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            f523c = new C0103ar();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f523c = new C0102aq();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f523c = new C0101ap();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f523c = new C0100ao();
        } else {
            f523c = new C0099an();
        }
        f521a = new Property<View, Float>(Float.class, "translationAlpha") { // from class: android.support.transition.am.1
            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(View view) {
                return Float.valueOf(C0098am.m617c(view));
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void set(View view, Float f) {
                C0098am.m611a(view, f.floatValue());
            }
        };
        f522b = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: android.support.transition.am.2
            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Rect get(View view) {
                return C0246q.m1779y(view);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void set(View view, Rect rect) {
                C0246q.m1743a(view, rect);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC0097al m609a(View view) {
        return f523c.mo624a(view);
    }

    /* JADX INFO: renamed from: a */
    private static void m610a() {
        if (f525e) {
            return;
        }
        try {
            f524d = View.class.getDeclaredField("mViewFlags");
            f524d.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.i("ViewUtils", "fetchViewFlagsField: ");
        }
        f525e = true;
    }

    /* JADX INFO: renamed from: a */
    static void m611a(View view, float f) {
        f523c.mo625a(view, f);
    }

    /* JADX INFO: renamed from: a */
    static void m612a(View view, int i) {
        m610a();
        if (f524d != null) {
            try {
                f524d.setInt(view, (f524d.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static void m613a(View view, int i, int i2, int i3, int i4) {
        f523c.mo626a(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    static void m614a(View view, Matrix matrix) {
        f523c.mo627a(view, matrix);
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC0108aw m615b(View view) {
        return f523c.mo628b(view);
    }

    /* JADX INFO: renamed from: b */
    static void m616b(View view, Matrix matrix) {
        f523c.mo629b(view, matrix);
    }

    /* JADX INFO: renamed from: c */
    static float m617c(View view) {
        return f523c.mo630c(view);
    }

    /* JADX INFO: renamed from: d */
    static void m618d(View view) {
        f523c.mo631d(view);
    }

    /* JADX INFO: renamed from: e */
    static void m619e(View view) {
        f523c.mo632e(view);
    }
}
