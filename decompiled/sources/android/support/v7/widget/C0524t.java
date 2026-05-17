package android.support.v7.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.p009c.p010a.InterfaceC0182b;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: android.support.v7.widget.t */
/* JADX INFO: loaded from: classes.dex */
class C0524t {

    /* JADX INFO: renamed from: a */
    private static final int[] f3648a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: b */
    private final ProgressBar f3649b;

    /* JADX INFO: renamed from: c */
    private Bitmap f3650c;

    C0524t(ProgressBar progressBar) {
        this.f3649b = progressBar;
    }

    /* JADX INFO: renamed from: a */
    private Drawable m4709a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable drawableM4710a = m4710a(animationDrawable.getFrame(i), true);
            drawableM4710a.setLevel(10000);
            animationDrawable2.addFrame(drawableM4710a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private Drawable m4710a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0182b) {
            Drawable drawableMo1402a = ((InterfaceC0182b) drawable).mo1402a();
            if (drawableMo1402a != null) {
                ((InterfaceC0182b) drawable).mo1403a(m4710a(drawableMo1402a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m4710a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f3650c == null) {
                    this.f3650c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m4711b());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: b */
    private Shape m4711b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: a */
    Bitmap m4712a() {
        return this.f3650c;
    }

    /* JADX INFO: renamed from: a */
    void mo4713a(AttributeSet attributeSet, int i) {
        C0498bi c0498biM4510a = C0498bi.m4510a(this.f3649b.getContext(), attributeSet, f3648a, i, 0);
        Drawable drawableM4518b = c0498biM4510a.m4518b(0);
        if (drawableM4518b != null) {
            this.f3649b.setIndeterminateDrawable(m4709a(drawableM4518b));
        }
        Drawable drawableM4518b2 = c0498biM4510a.m4518b(1);
        if (drawableM4518b2 != null) {
            this.f3649b.setProgressDrawable(m4710a(drawableM4518b2, false));
        }
        c0498biM4510a.m4515a();
    }
}
