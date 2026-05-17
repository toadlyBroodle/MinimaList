package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: android.support.v4.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0319c {

    /* JADX INFO: renamed from: a */
    private static final c f1660a;

    /* JADX INFO: renamed from: android.support.v4.widget.c$a */
    static class a extends c {
        a() {
        }

        @Override // android.support.v4.widget.C0319c.c
        /* JADX INFO: renamed from: a */
        public void mo2375a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @Override // android.support.v4.widget.C0319c.c
        /* JADX INFO: renamed from: a */
        public void mo2376a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.c$b */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.widget.C0319c.c
        /* JADX INFO: renamed from: a */
        public Drawable mo2377a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.c$c */
    static class c {

        /* JADX INFO: renamed from: a */
        private static Field f1661a;

        /* JADX INFO: renamed from: b */
        private static boolean f1662b;

        c() {
        }

        /* JADX INFO: renamed from: a */
        public Drawable mo2377a(CompoundButton compoundButton) {
            if (!f1662b) {
                try {
                    f1661a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f1661a.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f1662b = true;
            }
            if (f1661a != null) {
                try {
                    return (Drawable) f1661a.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f1661a = null;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public void mo2375a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof InterfaceC0330n) {
                ((InterfaceC0330n) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public void mo2376a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof InterfaceC0330n) {
                ((InterfaceC0330n) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f1660a = new b();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f1660a = new a();
        } else {
            f1660a = new c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m2372a(CompoundButton compoundButton) {
        return f1660a.mo2377a(compoundButton);
    }

    /* JADX INFO: renamed from: a */
    public static void m2373a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f1660a.mo2375a(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: a */
    public static void m2374a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f1660a.mo2376a(compoundButton, mode);
    }
}
