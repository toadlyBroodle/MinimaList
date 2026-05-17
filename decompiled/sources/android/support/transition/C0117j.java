package android.support.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.j */
/* JADX INFO: loaded from: classes.dex */
class C0117j implements InterfaceC0118k {
    C0117j() {
    }

    @Override // android.support.transition.InterfaceC0118k
    /* JADX INFO: renamed from: a */
    public <T> ObjectAnimator mo676a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
