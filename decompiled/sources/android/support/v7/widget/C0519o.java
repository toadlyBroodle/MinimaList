package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v4.widget.InterfaceC0331o;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: android.support.v7.widget.o */
/* JADX INFO: loaded from: classes.dex */
public class C0519o extends ImageButton implements InterfaceC0245p, InterfaceC0331o {

    /* JADX INFO: renamed from: a */
    private final C0512h f3635a;

    /* JADX INFO: renamed from: b */
    private final C0520p f3636b;

    public C0519o(Context context) {
        this(context, null);
    }

    public C0519o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.imageButtonStyle);
    }

    public C0519o(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3635a = new C0512h(this);
        this.f3635a.m4651a(attributeSet, i);
        this.f3636b = new C0520p(this);
        this.f3636b.m4702a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3635a != null) {
            this.f3635a.m4654c();
        }
        if (this.f3636b != null) {
            this.f3636b.m4706d();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3635a != null) {
            return this.f3635a.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3635a != null) {
            return this.f3635a.m4652b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public ColorStateList getSupportImageTintList() {
        if (this.f3636b != null) {
            return this.f3636b.m4704b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f3636b != null) {
            return this.f3636b.m4705c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f3636b.m4703a() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3635a != null) {
            this.f3635a.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3635a != null) {
            this.f3635a.m4647a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f3636b != null) {
            this.f3636b.m4706d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f3636b != null) {
            this.f3636b.m4706d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f3636b.m4699a(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f3636b != null) {
            this.f3636b.m4706d();
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3635a != null) {
            this.f3635a.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3635a != null) {
            this.f3635a.m4649a(mode);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3636b != null) {
            this.f3636b.m4700a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0331o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3636b != null) {
            this.f3636b.m4701a(mode);
        }
    }
}
