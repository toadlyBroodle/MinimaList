package android.support.p003b.p004a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p009c.p010a.InterfaceC0186f;

/* JADX INFO: renamed from: android.support.b.a.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0019h extends Drawable implements InterfaceC0186f {

    /* JADX INFO: renamed from: b */
    Drawable f68b;

    AbstractC0019h() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f68b != null) {
            C0181a.m1391a(this.f68b, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.f68b != null) {
            this.f68b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.f68b != null) {
            return C0181a.m1399e(this.f68b);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f68b != null ? this.f68b.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f68b != null ? this.f68b.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f68b != null ? this.f68b.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f68b != null ? this.f68b.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f68b != null ? this.f68b.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f68b != null ? this.f68b.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (this.f68b != null) {
            C0181a.m1386a(this.f68b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f68b != null) {
            this.f68b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f68b != null ? this.f68b.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.f68b != null) {
            this.f68b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f68b != null) {
            this.f68b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.f68b != null) {
            this.f68b.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.f68b != null) {
            C0181a.m1387a(this.f68b, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f68b != null) {
            C0181a.m1389a(this.f68b, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f68b != null ? this.f68b.setState(iArr) : super.setState(iArr);
    }
}
