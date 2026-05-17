package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: android.support.transition.m */
/* JADX INFO: loaded from: classes.dex */
class C0120m<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a */
    private final Property<T, PointF> f597a;

    /* JADX INFO: renamed from: b */
    private final PathMeasure f598b;

    /* JADX INFO: renamed from: c */
    private final float f599c;

    /* JADX INFO: renamed from: d */
    private final float[] f600d;

    /* JADX INFO: renamed from: e */
    private final PointF f601e;

    /* JADX INFO: renamed from: f */
    private float f602f;

    C0120m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f600d = new float[2];
        this.f601e = new PointF();
        this.f597a = property;
        this.f598b = new PathMeasure(path, false);
        this.f599c = this.f598b.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f602f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f) {
        this.f602f = f.floatValue();
        this.f598b.getPosTan(this.f599c * f.floatValue(), this.f600d, null);
        this.f601e.x = this.f600d[0];
        this.f601e.y = this.f600d[1];
        this.f597a.set(t, this.f601e);
    }
}
