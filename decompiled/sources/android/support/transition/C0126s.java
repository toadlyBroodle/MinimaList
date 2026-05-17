package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: android.support.transition.s */
/* JADX INFO: loaded from: classes.dex */
class C0126s implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a */
    private Rect f604a;

    C0126s() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = ((int) ((rect2.left - rect.left) * f)) + rect.left;
        int i2 = ((int) ((rect2.top - rect.top) * f)) + rect.top;
        int i3 = ((int) ((rect2.right - rect.right) * f)) + rect.right;
        int i4 = ((int) ((rect2.bottom - rect.bottom) * f)) + rect.bottom;
        if (this.f604a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f604a.set(i, i2, i3, i4);
        return this.f604a;
    }
}
