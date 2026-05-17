package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0025a;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.support.v4.p019j.InterfaceC0244o;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: android.support.design.internal.f */
/* JADX INFO: loaded from: classes.dex */
public class C0032f extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Drawable f191a;

    /* JADX INFO: renamed from: b */
    Rect f192b;

    /* JADX INFO: renamed from: c */
    private Rect f193c;

    public C0032f(Context context) {
        this(context, null);
    }

    public C0032f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0032f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f193c = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0025a.j.ScrimInsetsFrameLayout, i, C0025a.i.Widget_Design_ScrimInsetsFrameLayout);
        this.f191a = typedArrayObtainStyledAttributes.getDrawable(C0025a.j.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0246q.m1746a(this, new InterfaceC0244o() { // from class: android.support.design.internal.f.1
            @Override // android.support.v4.p019j.InterfaceC0244o
            /* JADX INFO: renamed from: a */
            public C0254y mo213a(View view, C0254y c0254y) {
                if (C0032f.this.f192b == null) {
                    C0032f.this.f192b = new Rect();
                }
                C0032f.this.f192b.set(c0254y.m1868a(), c0254y.m1870b(), c0254y.m1871c(), c0254y.m1872d());
                C0032f.this.mo212a(c0254y);
                C0032f.this.setWillNotDraw(!c0254y.m1873e() || C0032f.this.f191a == null);
                C0246q.m1756c(C0032f.this);
                return c0254y.m1875g();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    protected void mo212a(C0254y c0254y) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f192b == null || this.f191a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        this.f193c.set(0, 0, width, this.f192b.top);
        this.f191a.setBounds(this.f193c);
        this.f191a.draw(canvas);
        this.f193c.set(0, height - this.f192b.bottom, width, height);
        this.f191a.setBounds(this.f193c);
        this.f191a.draw(canvas);
        this.f193c.set(0, this.f192b.top, this.f192b.left, height - this.f192b.bottom);
        this.f191a.setBounds(this.f193c);
        this.f191a.draw(canvas);
        this.f193c.set(width - this.f192b.right, this.f192b.top, width, height - this.f192b.bottom);
        this.f191a.setBounds(this.f193c);
        this.f191a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f191a != null) {
            this.f191a.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f191a != null) {
            this.f191a.setCallback(null);
        }
    }
}
