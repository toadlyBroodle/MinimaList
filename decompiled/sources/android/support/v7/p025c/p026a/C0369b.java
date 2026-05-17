package android.support.v7.p025c.p026a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v7.p022a.C0333a;

/* JADX INFO: renamed from: android.support.v7.c.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0369b extends Drawable {

    /* JADX INFO: renamed from: b */
    private static final float f2119b = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: c */
    private float f2121c;

    /* JADX INFO: renamed from: d */
    private float f2122d;

    /* JADX INFO: renamed from: e */
    private float f2123e;

    /* JADX INFO: renamed from: f */
    private float f2124f;

    /* JADX INFO: renamed from: g */
    private boolean f2125g;

    /* JADX INFO: renamed from: i */
    private final int f2127i;

    /* JADX INFO: renamed from: k */
    private float f2129k;

    /* JADX INFO: renamed from: l */
    private float f2130l;

    /* JADX INFO: renamed from: a */
    private final Paint f2120a = new Paint();

    /* JADX INFO: renamed from: h */
    private final Path f2126h = new Path();

    /* JADX INFO: renamed from: j */
    private boolean f2128j = false;

    /* JADX INFO: renamed from: m */
    private int f2131m = 2;

    public C0369b(Context context) {
        this.f2120a.setStyle(Paint.Style.STROKE);
        this.f2120a.setStrokeJoin(Paint.Join.MITER);
        this.f2120a.setStrokeCap(Paint.Cap.BUTT);
        this.f2120a.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0333a.j.DrawerArrowToggle, C0333a.a.drawerArrowStyle, C0333a.i.Base_Widget_AppCompat_DrawerArrowToggle);
        m2801a(typedArrayObtainStyledAttributes.getColor(C0333a.j.DrawerArrowToggle_color, 0));
        m2800a(typedArrayObtainStyledAttributes.getDimension(C0333a.j.DrawerArrowToggle_thickness, 0.0f));
        m2802a(typedArrayObtainStyledAttributes.getBoolean(C0333a.j.DrawerArrowToggle_spinBars, true));
        m2803b(Math.round(typedArrayObtainStyledAttributes.getDimension(C0333a.j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f2127i = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0333a.j.DrawerArrowToggle_drawableSize, 0);
        this.f2122d = Math.round(typedArrayObtainStyledAttributes.getDimension(C0333a.j.DrawerArrowToggle_barLength, 0.0f));
        this.f2121c = Math.round(typedArrayObtainStyledAttributes.getDimension(C0333a.j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2123e = typedArrayObtainStyledAttributes.getDimension(C0333a.j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private static float m2799a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: a */
    public void m2800a(float f) {
        if (this.f2120a.getStrokeWidth() != f) {
            this.f2120a.setStrokeWidth(f);
            this.f2130l = (float) (((double) (f / 2.0f)) * Math.cos(f2119b));
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2801a(int i) {
        if (i != this.f2120a.getColor()) {
            this.f2120a.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2802a(boolean z) {
        if (this.f2125g != z) {
            this.f2125g = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2803b(float f) {
        if (f != this.f2124f) {
            this.f2124f = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2804b(boolean z) {
        if (this.f2128j != z) {
            this.f2128j = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2805c(float f) {
        if (this.f2129k != f) {
            this.f2129k = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        switch (this.f2131m) {
            case 0:
                z = false;
                break;
            case 1:
                z = true;
                break;
            case 2:
            default:
                z = C0181a.m1401g(this) == 1;
                break;
            case 3:
                z = C0181a.m1401g(this) == 0;
                break;
        }
        float fM2799a = m2799a(this.f2122d, (float) Math.sqrt(this.f2121c * this.f2121c * 2.0f), this.f2129k);
        float fM2799a2 = m2799a(this.f2122d, this.f2123e, this.f2129k);
        float fRound = Math.round(m2799a(0.0f, this.f2130l, this.f2129k));
        float fM2799a3 = m2799a(0.0f, f2119b, this.f2129k);
        float fM2799a4 = m2799a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f2129k);
        float fRound2 = Math.round(((double) fM2799a) * Math.cos(fM2799a3));
        float fRound3 = Math.round(((double) fM2799a) * Math.sin(fM2799a3));
        this.f2126h.rewind();
        float fM2799a5 = m2799a(this.f2124f + this.f2120a.getStrokeWidth(), -this.f2130l, this.f2129k);
        float f = (-fM2799a2) / 2.0f;
        this.f2126h.moveTo(f + fRound, 0.0f);
        this.f2126h.rLineTo(fM2799a2 - (fRound * 2.0f), 0.0f);
        this.f2126h.moveTo(f, fM2799a5);
        this.f2126h.rLineTo(fRound2, fRound3);
        this.f2126h.moveTo(f, -fM2799a5);
        this.f2126h.rLineTo(fRound2, -fRound3);
        this.f2126h.close();
        canvas.save();
        canvas.translate(bounds.centerX(), (this.f2120a.getStrokeWidth() * 1.5f) + this.f2124f + ((((int) ((bounds.height() - (3.0f * r2)) - (this.f2124f * 2.0f))) / 4) * 2));
        if (this.f2125g) {
            canvas.rotate((z ^ this.f2128j ? -1 : 1) * fM2799a4);
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f2126h, this.f2120a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2127i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2127i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f2120a.getAlpha()) {
            this.f2120a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2120a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
