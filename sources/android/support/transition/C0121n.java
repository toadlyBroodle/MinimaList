package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.n */
/* JADX INFO: loaded from: classes.dex */
class C0121n {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0124q f603a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f603a = new C0123p();
        } else {
            f603a = new C0122o();
        }
    }

    /* JADX INFO: renamed from: a */
    static PropertyValuesHolder m680a(Property<?, PointF> property, Path path) {
        return f603a.mo681a(property, path);
    }
}
