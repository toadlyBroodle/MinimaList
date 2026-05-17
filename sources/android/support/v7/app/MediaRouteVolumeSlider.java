package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.p022a.C0333a;
import android.support.v7.widget.C0527w;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteVolumeSlider extends C0527w {

    /* JADX INFO: renamed from: a */
    private final float f1882a;

    /* JADX INFO: renamed from: b */
    private boolean f1883b;

    /* JADX INFO: renamed from: c */
    private Drawable f1884c;

    /* JADX INFO: renamed from: d */
    private int f1885d;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1882a = C0359p.m2726a(context);
    }

    @Override // android.support.v7.widget.C0527w, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (255.0f * this.f1882a);
        this.f1884c.setColorFilter(this.f1885d, PorterDuff.Mode.SRC_IN);
        this.f1884c.setAlpha(i);
        getProgressDrawable().setColorFilter(this.f1885d, PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f1884c = drawable;
        super.setThumb(this.f1883b ? null : this.f1884c);
    }
}
