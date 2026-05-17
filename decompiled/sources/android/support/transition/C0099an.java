package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.C0125r;
import android.view.View;

/* JADX INFO: renamed from: android.support.transition.an */
/* JADX INFO: loaded from: classes.dex */
class C0099an implements InterfaceC0104as {
    C0099an() {
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public InterfaceC0097al mo624a(View view) {
        return C0095aj.m602d(view);
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo625a(View view, float f) {
        Float f2 = (Float) view.getTag(C0125r.a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo626a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: a */
    public void mo627a(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo627a((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: b */
    public InterfaceC0108aw mo628b(View view) {
        return new C0106au(view.getWindowToken());
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: b */
    public void mo629b(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo629b((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: c */
    public float mo630c(View view) {
        Float f = (Float) view.getTag(C0125r.a.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: d */
    public void mo631d(View view) {
        if (view.getTag(C0125r.a.save_non_transition_alpha) == null) {
            view.setTag(C0125r.a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    @Override // android.support.transition.InterfaceC0104as
    /* JADX INFO: renamed from: e */
    public void mo632e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0125r.a.save_non_transition_alpha, null);
        }
    }
}
