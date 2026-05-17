package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: android.support.v7.widget.x */
/* JADX INFO: loaded from: classes.dex */
class C0528x extends C0524t {

    /* JADX INFO: renamed from: a */
    private final SeekBar f3655a;

    /* JADX INFO: renamed from: b */
    private Drawable f3656b;

    /* JADX INFO: renamed from: c */
    private ColorStateList f3657c;

    /* JADX INFO: renamed from: d */
    private PorterDuff.Mode f3658d;

    /* JADX INFO: renamed from: e */
    private boolean f3659e;

    /* JADX INFO: renamed from: f */
    private boolean f3660f;

    C0528x(SeekBar seekBar) {
        super(seekBar);
        this.f3657c = null;
        this.f3658d = null;
        this.f3659e = false;
        this.f3660f = false;
        this.f3655a = seekBar;
    }

    /* JADX INFO: renamed from: d */
    private void m4714d() {
        if (this.f3656b != null) {
            if (this.f3659e || this.f3660f) {
                this.f3656b = C0181a.m1400f(this.f3656b.mutate());
                if (this.f3659e) {
                    C0181a.m1390a(this.f3656b, this.f3657c);
                }
                if (this.f3660f) {
                    C0181a.m1393a(this.f3656b, this.f3658d);
                }
                if (this.f3656b.isStateful()) {
                    this.f3656b.setState(this.f3655a.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m4715a(Canvas canvas) {
        int max;
        if (this.f3656b == null || (max = this.f3655a.getMax()) <= 1) {
            return;
        }
        int intrinsicWidth = this.f3656b.getIntrinsicWidth();
        int intrinsicHeight = this.f3656b.getIntrinsicHeight();
        int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
        int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
        this.f3656b.setBounds(-i, -i2, i, i2);
        float width = ((this.f3655a.getWidth() - this.f3655a.getPaddingLeft()) - this.f3655a.getPaddingRight()) / max;
        int iSave = canvas.save();
        canvas.translate(this.f3655a.getPaddingLeft(), this.f3655a.getHeight() / 2);
        for (int i3 = 0; i3 <= max; i3++) {
            this.f3656b.draw(canvas);
            canvas.translate(width, 0.0f);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: a */
    void m4716a(Drawable drawable) {
        if (this.f3656b != null) {
            this.f3656b.setCallback(null);
        }
        this.f3656b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3655a);
            C0181a.m1396b(drawable, C0246q.m1759e(this.f3655a));
            if (drawable.isStateful()) {
                drawable.setState(this.f3655a.getDrawableState());
            }
            m4714d();
        }
        this.f3655a.invalidate();
    }

    @Override // android.support.v7.widget.C0524t
    /* JADX INFO: renamed from: a */
    void mo4713a(AttributeSet attributeSet, int i) {
        super.mo4713a(attributeSet, i);
        C0498bi c0498biM4510a = C0498bi.m4510a(this.f3655a.getContext(), attributeSet, C0333a.j.AppCompatSeekBar, i, 0);
        Drawable drawableM4518b = c0498biM4510a.m4518b(C0333a.j.AppCompatSeekBar_android_thumb);
        if (drawableM4518b != null) {
            this.f3655a.setThumb(drawableM4518b);
        }
        m4716a(c0498biM4510a.m4514a(C0333a.j.AppCompatSeekBar_tickMark));
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3658d = C0470ah.m3863a(c0498biM4510a.m4512a(C0333a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3658d);
            this.f3660f = true;
        }
        if (c0498biM4510a.m4528g(C0333a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f3657c = c0498biM4510a.m4524e(C0333a.j.AppCompatSeekBar_tickMarkTint);
            this.f3659e = true;
        }
        c0498biM4510a.m4515a();
        m4714d();
    }

    /* JADX INFO: renamed from: b */
    void m4717b() {
        if (this.f3656b != null) {
            this.f3656b.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: c */
    void m4718c() {
        Drawable drawable = this.f3656b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3655a.getDrawableState())) {
            this.f3655a.invalidateDrawable(drawable);
        }
    }
}
