package android.support.v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.p009c.p010a.C0183c;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v4.c.a.e */
/* JADX INFO: loaded from: classes.dex */
class C0185e extends C0184d {

    /* JADX INFO: renamed from: d */
    private static Method f1136d;

    /* JADX INFO: renamed from: android.support.v4.c.a.e$a */
    private static class a extends C0183c.a {
        a(C0183c.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.p009c.p010a.C0183c.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0185e(this, resources);
        }
    }

    C0185e(Drawable drawable) {
        super(drawable);
        m1410d();
    }

    C0185e(C0183c.a aVar, Resources resources) {
        super(aVar, resources);
        m1410d();
    }

    /* JADX INFO: renamed from: d */
    private void m1410d() {
        if (f1136d == null) {
            try {
                f1136d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.support.v4.p009c.p010a.C0184d, android.support.v4.p009c.p010a.C0183c
    /* JADX INFO: renamed from: b */
    C0183c.a mo1407b() {
        return new a(this.f1126b, null);
    }

    @Override // android.support.v4.p009c.p010a.C0183c
    /* JADX INFO: renamed from: c */
    protected boolean mo1408c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1127c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f1127c.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1127c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f1127c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1127c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.v4.p009c.p010a.C0183c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.support.v4.p009c.p010a.C0183c, android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTint(int i) {
        if (mo1408c()) {
            super.setTint(i);
        } else {
            this.f1127c.setTint(i);
        }
    }

    @Override // android.support.v4.p009c.p010a.C0183c, android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintList(ColorStateList colorStateList) {
        if (mo1408c()) {
            super.setTintList(colorStateList);
        } else {
            this.f1127c.setTintList(colorStateList);
        }
    }

    @Override // android.support.v4.p009c.p010a.C0183c, android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1408c()) {
            super.setTintMode(mode);
        } else {
            this.f1127c.setTintMode(mode);
        }
    }
}
