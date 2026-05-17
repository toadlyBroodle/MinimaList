package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    private final Paint f5278a;

    /* JADX INFO: renamed from: b */
    private float f5279b;

    /* JADX INFO: renamed from: c */
    private float f5280c;

    /* JADX INFO: renamed from: d */
    private float f5281d;

    /* JADX INFO: renamed from: e */
    private float f5282e;

    /* JADX INFO: renamed from: f */
    private float f5283f;

    /* JADX INFO: renamed from: g */
    private float f5284g;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f5281d + this.f5283f, this.f5282e + this.f5284g, this.f5279b * this.f5280c, this.f5278a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5278a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5278a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5278a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f5280c = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.f5283f = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.f5284g = f;
        invalidateSelf();
    }
}
