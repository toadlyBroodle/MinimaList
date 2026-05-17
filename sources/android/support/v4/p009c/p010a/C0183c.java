package android.support.v4.p009c.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: android.support.v4.c.a.c */
/* JADX INFO: loaded from: classes.dex */
class C0183c extends Drawable implements Drawable.Callback, InterfaceC0182b, InterfaceC0186f {

    /* JADX INFO: renamed from: a */
    static final PorterDuff.Mode f1125a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    a f1126b;

    /* JADX INFO: renamed from: c */
    Drawable f1127c;

    /* JADX INFO: renamed from: d */
    private int f1128d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f1129e;

    /* JADX INFO: renamed from: f */
    private boolean f1130f;

    /* JADX INFO: renamed from: g */
    private boolean f1131g;

    /* JADX INFO: renamed from: android.support.v4.c.a.c$a */
    protected static abstract class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f1132a;

        /* JADX INFO: renamed from: b */
        Drawable.ConstantState f1133b;

        /* JADX INFO: renamed from: c */
        ColorStateList f1134c;

        /* JADX INFO: renamed from: d */
        PorterDuff.Mode f1135d;

        a(a aVar, Resources resources) {
            this.f1134c = null;
            this.f1135d = C0183c.f1125a;
            if (aVar != null) {
                this.f1132a = aVar.f1132a;
                this.f1133b = aVar.f1133b;
                this.f1134c = aVar.f1134c;
                this.f1135d = aVar.f1135d;
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m1409a() {
            return this.f1133b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return (this.f1133b != null ? this.f1133b.getChangingConfigurations() : 0) | this.f1132a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: renamed from: android.support.v4.c.a.c$b */
    private static class b extends a {
        b(a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.p009c.p010a.C0183c.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0183c(this, resources);
        }
    }

    C0183c(Drawable drawable) {
        this.f1126b = mo1407b();
        mo1403a(drawable);
    }

    C0183c(a aVar, Resources resources) {
        this.f1126b = aVar;
        m1404a(resources);
    }

    /* JADX INFO: renamed from: a */
    private void m1404a(Resources resources) {
        if (this.f1126b == null || this.f1126b.f1133b == null) {
            return;
        }
        mo1403a(m1406a(this.f1126b.f1133b, resources));
    }

    /* JADX INFO: renamed from: a */
    private boolean m1405a(int[] iArr) {
        if (!mo1408c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1126b.f1134c;
        PorterDuff.Mode mode = this.f1126b.f1135d;
        if (colorStateList == null || mode == null) {
            this.f1130f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1130f && colorForState == this.f1128d && mode == this.f1129e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f1128d = colorForState;
        this.f1129e = mode;
        this.f1130f = true;
        return true;
    }

    @Override // android.support.v4.p009c.p010a.InterfaceC0182b
    /* JADX INFO: renamed from: a */
    public final Drawable mo1402a() {
        return this.f1127c;
    }

    /* JADX INFO: renamed from: a */
    protected Drawable m1406a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    @Override // android.support.v4.p009c.p010a.InterfaceC0182b
    /* JADX INFO: renamed from: a */
    public final void mo1403a(Drawable drawable) {
        if (this.f1127c != null) {
            this.f1127c.setCallback(null);
        }
        this.f1127c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1126b != null) {
                this.f1126b.f1133b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    a mo1407b() {
        return new b(this.f1126b, null);
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo1408c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f1127c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return (this.f1126b != null ? this.f1126b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.f1127c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1126b == null || !this.f1126b.m1409a()) {
            return null;
        }
        this.f1126b.f1132a = getChangingConfigurations();
        return this.f1126b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1127c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1127c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1127c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f1127c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f1127c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1127c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f1127c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f1127c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f1127c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1408c() || this.f1126b == null) ? null : this.f1126b.f1134c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1127c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1127c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1131g && super.mutate() == this) {
            this.f1126b = mo1407b();
            if (this.f1127c != null) {
                this.f1127c.mutate();
            }
            if (this.f1126b != null) {
                this.f1126b.f1133b = this.f1127c != null ? this.f1127c.getConstantState() : null;
            }
            this.f1131g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f1127c != null) {
            this.f1127c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f1127c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1127c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f1127c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1127c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1127c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1127c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1405a(iArr) || this.f1127c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintList(ColorStateList colorStateList) {
        this.f1126b.f1134c = colorStateList;
        m1405a(getState());
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1126b.f1135d = mode;
        m1405a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1127c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
