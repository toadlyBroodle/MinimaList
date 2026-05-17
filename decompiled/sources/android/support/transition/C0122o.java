package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.o */
/* JADX INFO: loaded from: classes.dex */
class C0122o implements InterfaceC0124q {
    C0122o() {
    }

    @Override // android.support.transition.InterfaceC0124q
    /* JADX INFO: renamed from: a */
    public PropertyValuesHolder mo681a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0120m(property, path), 0.0f, 1.0f);
    }
}
