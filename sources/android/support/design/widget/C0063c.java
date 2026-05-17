package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.C0180a;

/* JADX INFO: renamed from: android.support.design.widget.c */
/* JADX INFO: loaded from: classes.dex */
class C0063c extends Drawable {

    /* JADX INFO: renamed from: d */
    float f374d;

    /* JADX INFO: renamed from: e */
    private int f375e;

    /* JADX INFO: renamed from: f */
    private int f376f;

    /* JADX INFO: renamed from: g */
    private int f377g;

    /* JADX INFO: renamed from: h */
    private int f378h;

    /* JADX INFO: renamed from: i */
    private ColorStateList f379i;

    /* JADX INFO: renamed from: j */
    private int f380j;

    /* JADX INFO: renamed from: l */
    private float f382l;

    /* JADX INFO: renamed from: b */
    final Rect f372b = new Rect();

    /* JADX INFO: renamed from: c */
    final RectF f373c = new RectF();

    /* JADX INFO: renamed from: k */
    private boolean f381k = true;

    /* JADX INFO: renamed from: a */
    final Paint f371a = new Paint(1);

    public C0063c() {
        this.f371a.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    private Shader m461a() {
        copyBounds(this.f372b);
        float fHeight = this.f374d / r3.height();
        return new LinearGradient(0.0f, r3.top, 0.0f, r3.bottom, new int[]{C0180a.m1378a(this.f375e, this.f380j), C0180a.m1378a(this.f376f, this.f380j), C0180a.m1378a(C0180a.m1384c(this.f376f, 0), this.f380j), C0180a.m1378a(C0180a.m1384c(this.f378h, 0), this.f380j), C0180a.m1378a(this.f378h, this.f380j), C0180a.m1378a(this.f377g, this.f380j)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: a */
    void m462a(float f) {
        if (this.f374d != f) {
            this.f374d = f;
            this.f371a.setStrokeWidth(1.3333f * f);
            this.f381k = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    void m463a(int i, int i2, int i3, int i4) {
        this.f375e = i;
        this.f376f = i2;
        this.f377g = i3;
        this.f378h = i4;
    }

    /* JADX INFO: renamed from: a */
    void m464a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f380j = colorStateList.getColorForState(getState(), this.f380j);
        }
        this.f379i = colorStateList;
        this.f381k = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    final void m465b(float f) {
        if (f != this.f382l) {
            this.f382l = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f381k) {
            this.f371a.setShader(m461a());
            this.f381k = false;
        }
        float strokeWidth = this.f371a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f373c;
        copyBounds(this.f372b);
        rectF.set(this.f372b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f382l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f371a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f374d > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iRound = Math.round(this.f374d);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return (this.f379i != null && this.f379i.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f381k = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        if (this.f379i != null && (colorForState = this.f379i.getColorForState(iArr, this.f380j)) != this.f380j) {
            this.f381k = true;
            this.f380j = colorForState;
        }
        if (this.f381k) {
            invalidateSelf();
        }
        return this.f381k;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f371a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f371a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
