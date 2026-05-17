package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.p */
/* JADX INFO: loaded from: classes.dex */
class C0123p implements InterfaceC0124q {
    C0123p() {
    }

    @Override // android.support.transition.InterfaceC0124q
    /* JADX INFO: renamed from: a */
    public PropertyValuesHolder mo681a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
