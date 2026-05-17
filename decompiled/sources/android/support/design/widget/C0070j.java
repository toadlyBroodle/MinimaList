package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.design.C0025a;
import android.support.v4.p007b.C0175b;
import android.support.v7.p025c.p026a.C0368a;

/* JADX INFO: renamed from: android.support.design.widget.j */
/* JADX INFO: loaded from: classes.dex */
class C0070j extends C0368a {

    /* JADX INFO: renamed from: a */
    static final double f436a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: b */
    final Paint f437b;

    /* JADX INFO: renamed from: c */
    final Paint f438c;

    /* JADX INFO: renamed from: d */
    final RectF f439d;

    /* JADX INFO: renamed from: e */
    float f440e;

    /* JADX INFO: renamed from: f */
    Path f441f;

    /* JADX INFO: renamed from: g */
    float f442g;

    /* JADX INFO: renamed from: h */
    float f443h;

    /* JADX INFO: renamed from: i */
    float f444i;

    /* JADX INFO: renamed from: j */
    float f445j;

    /* JADX INFO: renamed from: k */
    private boolean f446k;

    /* JADX INFO: renamed from: l */
    private final int f447l;

    /* JADX INFO: renamed from: m */
    private final int f448m;

    /* JADX INFO: renamed from: n */
    private final int f449n;

    /* JADX INFO: renamed from: o */
    private boolean f450o;

    /* JADX INFO: renamed from: p */
    private float f451p;

    /* JADX INFO: renamed from: q */
    private boolean f452q;

    public C0070j(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f446k = true;
        this.f450o = true;
        this.f452q = false;
        this.f447l = C0175b.m1341c(context, C0025a.c.design_fab_shadow_start_color);
        this.f448m = C0175b.m1341c(context, C0025a.c.design_fab_shadow_mid_color);
        this.f449n = C0175b.m1341c(context, C0025a.c.design_fab_shadow_end_color);
        this.f437b = new Paint(5);
        this.f437b.setStyle(Paint.Style.FILL);
        this.f440e = Math.round(f);
        this.f439d = new RectF();
        this.f438c = new Paint(this.f437b);
        this.f438c.setAntiAlias(false);
        m528a(f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public static float m520a(float f, float f2, boolean z) {
        return z ? (float) (((double) (1.5f * f)) + ((1.0d - f436a) * ((double) f2))) : 1.5f * f;
    }

    /* JADX INFO: renamed from: a */
    private void m521a(Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(this.f451p, this.f439d.centerX(), this.f439d.centerY());
        float f = (-this.f440e) - this.f444i;
        float f2 = this.f440e;
        boolean z = this.f439d.width() - (2.0f * f2) > 0.0f;
        boolean z2 = this.f439d.height() - (2.0f * f2) > 0.0f;
        float f3 = this.f445j - (this.f445j * 0.25f);
        float f4 = f2 / ((this.f445j - (this.f445j * 0.5f)) + f2);
        float f5 = f2 / (f3 + f2);
        float f6 = f2 / (f2 + (this.f445j - (this.f445j * 1.0f)));
        int iSave2 = canvas.save();
        canvas.translate(this.f439d.left + f2, this.f439d.top + f2);
        canvas.scale(f4, f5);
        canvas.drawPath(this.f441f, this.f437b);
        if (z) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f, this.f439d.width() - (2.0f * f2), -this.f440e, this.f438c);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(this.f439d.right - f2, this.f439d.bottom - f2);
        canvas.scale(f4, f6);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f441f, this.f437b);
        if (z) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f, this.f439d.width() - (2.0f * f2), this.f444i + (-this.f440e), this.f438c);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(this.f439d.left + f2, this.f439d.bottom - f2);
        canvas.scale(f4, f6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f441f, this.f437b);
        if (z2) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f, this.f439d.height() - (2.0f * f2), -this.f440e, this.f438c);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        canvas.translate(this.f439d.right - f2, this.f439d.top + f2);
        canvas.scale(f4, f5);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f441f, this.f437b);
        if (z2) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f, this.f439d.height() - (2.0f * f2), -this.f440e, this.f438c);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: a */
    private void m522a(Rect rect) {
        float f = this.f443h * 1.5f;
        this.f439d.set(rect.left + this.f443h, rect.top + f, rect.right - this.f443h, rect.bottom - f);
        m2798b().setBounds((int) this.f439d.left, (int) this.f439d.top, (int) this.f439d.right, (int) this.f439d.bottom);
        m525c();
    }

    /* JADX INFO: renamed from: b */
    public static float m523b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f436a) * ((double) f2))) : f;
    }

    /* JADX INFO: renamed from: c */
    private static int m524c(float f) {
        int iRound = Math.round(f);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    /* JADX INFO: renamed from: c */
    private void m525c() {
        RectF rectF = new RectF(-this.f440e, -this.f440e, this.f440e, this.f440e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f444i, -this.f444i);
        if (this.f441f == null) {
            this.f441f = new Path();
        } else {
            this.f441f.reset();
        }
        this.f441f.setFillType(Path.FillType.EVEN_ODD);
        this.f441f.moveTo(-this.f440e, 0.0f);
        this.f441f.rLineTo(-this.f444i, 0.0f);
        this.f441f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f441f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f441f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = this.f440e / f;
            this.f437b.setShader(new RadialGradient(0.0f, 0.0f, f, new int[]{0, this.f447l, this.f448m, this.f449n}, new float[]{0.0f, f2, f2 + ((1.0f - f2) / 2.0f), 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f438c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f447l, this.f448m, this.f449n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f438c.setAntiAlias(false);
    }

    /* JADX INFO: renamed from: a */
    public float m526a() {
        return this.f445j;
    }

    /* JADX INFO: renamed from: a */
    final void m527a(float f) {
        if (this.f451p != f) {
            this.f451p = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    void m528a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fM524c = m524c(f);
        float fM524c2 = m524c(f2);
        if (fM524c > fM524c2) {
            if (!this.f452q) {
                this.f452q = true;
            }
            fM524c = fM524c2;
        }
        if (this.f445j == fM524c && this.f443h == fM524c2) {
            return;
        }
        this.f445j = fM524c;
        this.f443h = fM524c2;
        this.f444i = Math.round(fM524c * 1.5f);
        this.f442g = fM524c2;
        this.f446k = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a */
    public void m529a(boolean z) {
        this.f450o = z;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public void m530b(float f) {
        m528a(f, this.f443h);
    }

    @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f446k) {
            m522a(getBounds());
            this.f446k = false;
        }
        m521a(canvas);
        super.draw(canvas);
    }

    @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m520a(this.f443h, this.f440e, this.f450o));
        int iCeil2 = (int) Math.ceil(m523b(this.f443h, this.f440e, this.f450o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f446k = true;
    }

    @Override // android.support.v7.p025c.p026a.C0368a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f437b.setAlpha(i);
        this.f438c.setAlpha(i);
    }
}
