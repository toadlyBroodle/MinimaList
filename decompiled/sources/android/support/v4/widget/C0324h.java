package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: renamed from: android.support.v4.widget.h */
/* JADX INFO: loaded from: classes.dex */
public class C0324h {

    /* JADX INFO: renamed from: a */
    static final b f1732a;

    /* JADX INFO: renamed from: android.support.v4.widget.h$a */
    static class a implements b {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public ColorStateList mo2456a(ImageView imageView) {
            if (imageView instanceof InterfaceC0331o) {
                return ((InterfaceC0331o) imageView).getSupportImageTintList();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public void mo2457a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof InterfaceC0331o) {
                ((InterfaceC0331o) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public void mo2458a(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof InterfaceC0331o) {
                ((InterfaceC0331o) imageView).setSupportImageTintMode(mode);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo2459b(ImageView imageView) {
            if (imageView instanceof InterfaceC0331o) {
                return ((InterfaceC0331o) imageView).getSupportImageTintMode();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.h$b */
    interface b {
        /* JADX INFO: renamed from: a */
        ColorStateList mo2456a(ImageView imageView);

        /* JADX INFO: renamed from: a */
        void mo2457a(ImageView imageView, ColorStateList colorStateList);

        /* JADX INFO: renamed from: a */
        void mo2458a(ImageView imageView, PorterDuff.Mode mode);

        /* JADX INFO: renamed from: b */
        PorterDuff.Mode mo2459b(ImageView imageView);
    }

    /* JADX INFO: renamed from: android.support.v4.widget.h$c */
    static class c extends a {
        c() {
        }

        @Override // android.support.v4.widget.C0324h.a, android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public ColorStateList mo2456a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @Override // android.support.v4.widget.C0324h.a, android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public void mo2457a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.v4.widget.C0324h.a, android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: a */
        public void mo2458a(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable == null || !z) {
                    return;
                }
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // android.support.v4.widget.C0324h.a, android.support.v4.widget.C0324h.b
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo2459b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1732a = new c();
        } else {
            f1732a = new a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2452a(ImageView imageView) {
        return f1732a.mo2456a(imageView);
    }

    /* JADX INFO: renamed from: a */
    public static void m2453a(ImageView imageView, ColorStateList colorStateList) {
        f1732a.mo2457a(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: a */
    public static void m2454a(ImageView imageView, PorterDuff.Mode mode) {
        f1732a.mo2458a(imageView, mode);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m2455b(ImageView imageView) {
        return f1732a.mo2459b(imageView);
    }
}
