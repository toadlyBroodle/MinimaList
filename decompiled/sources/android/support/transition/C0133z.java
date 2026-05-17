package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: android.support.transition.z */
/* JADX INFO: loaded from: classes.dex */
class C0133z {
    /* JADX INFO: renamed from: a */
    static Animator m754a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m755a(View view, Matrix matrix, RectF rectF) {
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (iRound * fMin), (int) (iRound2 * fMin), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(matrix);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    static View m756a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C0098am.m614a(view, matrix);
        C0098am.m616b(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapM755a = m755a(view, matrix, rectF);
        if (bitmapM755a != null) {
            imageView.setImageBitmap(bitmapM755a);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }
}
