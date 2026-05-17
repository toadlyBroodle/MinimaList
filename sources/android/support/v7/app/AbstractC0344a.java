package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.AbstractC0388b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v7.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0344a {

    /* JADX INFO: renamed from: android.support.v7.app.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f1900a;

        public a(int i, int i2) {
            super(i, i2);
            this.f1900a = 0;
            this.f1900a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1900a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ActionBarLayout);
            this.f1900a = typedArrayObtainStyledAttributes.getInt(C0333a.j.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1900a = 0;
            this.f1900a = aVar.f1900a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1900a = 0;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m2566a(boolean z);
    }

    /* JADX INFO: renamed from: android.support.v7.app.a$c */
    @Deprecated
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract Drawable m2567a();

        /* JADX INFO: renamed from: b */
        public abstract CharSequence m2568b();

        /* JADX INFO: renamed from: c */
        public abstract View m2569c();

        /* JADX INFO: renamed from: d */
        public abstract void m2570d();

        /* JADX INFO: renamed from: e */
        public abstract CharSequence m2571e();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2546a();

    /* JADX INFO: renamed from: a */
    public AbstractC0388b mo2547a(AbstractC0388b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo2548a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo2549a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public void mo2550a(Configuration configuration) {
    }

    /* JADX INFO: renamed from: a */
    public void mo2551a(Drawable drawable) {
    }

    /* JADX INFO: renamed from: a */
    public void mo2552a(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: a */
    public void mo2553a(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo2554a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo2555a(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Context mo2556b() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo2557b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo2558c(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean mo2559c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2560d(boolean z) {
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2561d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void mo2562e(boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2563e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2564f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    void mo2565g() {
    }
}
