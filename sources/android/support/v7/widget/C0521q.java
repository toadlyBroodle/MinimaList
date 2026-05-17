package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v4.widget.InterfaceC0331o;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: android.support.v7.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C0521q extends ImageView implements InterfaceC0245p, InterfaceC0331o {

    /* JADX INFO: renamed from: a */
    private final C0512h f3641a;

    /* JADX INFO: renamed from: b */
    private final C0520p f3642b;

    public C0521q(Context context) {
        this(context, null);
    }

    public C0521q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0521q(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3641a = new C0512h(this);
        this.f3641a.m4651a(attributeSet, i);
        this.f3642b = new C0520p(this);
        this.f3642b.m4702a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3641a != null) {
            this.f3641a.m4654c();
        }
        if (this.f3642b != null) {
            this.f3642b.m4706d();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3641a != null) {
            return this.f3641a.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3641a != null) {
            return this.f3641a.m4652b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public ColorStateList getSupportImageTintList() {
        if (this.f3642b != null) {
            return this.f3642b.m4704b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f3642b != null) {
            return this.f3642b.m4705c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f3642b.m4703a() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3641a != null) {
            this.f3641a.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3641a != null) {
            this.f3641a.m4647a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f3642b != null) {
            this.f3642b.m4706d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f3642b != null) {
            this.f3642b.m4706d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f3642b != null) {
            this.f3642b.m4699a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f3642b != null) {
            this.f3642b.m4706d();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3641a != null) {
            this.f3641a.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3641a != null) {
            this.f3641a.m4649a(mode);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3642b != null) {
            this.f3642b.m4700a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3642b != null) {
            this.f3642b.m4701a(mode);
        }
    }
}
