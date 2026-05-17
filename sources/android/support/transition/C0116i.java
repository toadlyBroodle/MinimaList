package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.i */
/* JADX INFO: loaded from: classes.dex */
class C0116i implements InterfaceC0118k {
    C0116i() {
    }

    @Override // android.support.transition.InterfaceC0118k
    /* JADX INFO: renamed from: a */
    public <T> ObjectAnimator mo676a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0120m(property, path), 0.0f, 1.0f);
    }
}
