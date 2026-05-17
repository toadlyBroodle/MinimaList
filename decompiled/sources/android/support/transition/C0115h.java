package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.h */
/* JADX INFO: loaded from: classes.dex */
class C0115h {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0118k f596a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f596a = new C0117j();
        } else {
            f596a = new C0116i();
        }
    }

    /* JADX INFO: renamed from: a */
    static <T> ObjectAnimator m675a(T t, Property<T, PointF> property, Path path) {
        return f596a.mo676a(t, property, path);
    }
}
