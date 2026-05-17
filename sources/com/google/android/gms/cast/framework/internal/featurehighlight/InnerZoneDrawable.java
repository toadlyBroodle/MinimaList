package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    private final Paint f5269a;

    /* JADX INFO: renamed from: b */
    private final Paint f5270b;

    /* JADX INFO: renamed from: c */
    private final int f5271c;

    /* JADX INFO: renamed from: d */
    private float f5272d;

    /* JADX INFO: renamed from: e */
    private float f5273e;

    /* JADX INFO: renamed from: f */
    private float f5274f;

    /* JADX INFO: renamed from: g */
    private float f5275g;

    /* JADX INFO: renamed from: h */
    private float f5276h;

    /* JADX INFO: renamed from: i */
    private float f5277i;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5277i > 0.0f) {
            float f = this.f5272d * this.f5276h;
            this.f5270b.setAlpha((int) (this.f5271c * this.f5277i));
            canvas.drawCircle(this.f5274f, this.f5275g, f, this.f5270b);
        }
        canvas.drawCircle(this.f5274f, this.f5275g, this.f5272d * this.f5273e, this.f5269a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5269a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5269a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f5277i = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.f5276h = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f5273e = f;
        invalidateSelf();
    }
}
