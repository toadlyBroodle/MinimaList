package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.design.widget.o */
/* JADX INFO: loaded from: classes.dex */
class C0075o {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal<Matrix> f470a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal<RectF> f471b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    static void m553a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        Matrix matrix2 = f470a.get();
        if (matrix2 == null) {
            Matrix matrix3 = new Matrix();
            f470a.set(matrix3);
            matrix = matrix3;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        m554a(viewGroup, view, matrix);
        RectF rectF = f471b.get();
        if (rectF == null) {
            rectF = new RectF();
            f471b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: a */
    private static void m554a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m554a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: b */
    static void m555b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m553a(viewGroup, view, rect);
    }
}
