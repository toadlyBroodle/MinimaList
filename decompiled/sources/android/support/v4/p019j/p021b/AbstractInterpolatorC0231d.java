package android.support.v4.p019j.p021b;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.v4.j.b.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractInterpolatorC0231d implements Interpolator {

    /* JADX INFO: renamed from: a */
    private final float[] f1331a;

    /* JADX INFO: renamed from: b */
    private final float f1332b;

    public AbstractInterpolatorC0231d(float[] fArr) {
        this.f1331a = fArr;
        this.f1332b = 1.0f / (this.f1331a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) ((this.f1331a.length - 1) * f), this.f1331a.length - 2);
        return ((this.f1331a[iMin + 1] - this.f1331a[iMin]) * ((f - (iMin * this.f1332b)) / this.f1332b)) + this.f1331a[iMin];
    }
}
