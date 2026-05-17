package android.support.v4.p019j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.util.Log;
import android.view.MenuItem;

/* JADX INFO: renamed from: android.support.v4.j.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0236g {

    /* JADX INFO: renamed from: a */
    static final c f1339a;

    /* JADX INFO: renamed from: android.support.v4.j.g$a */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1706a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1707a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1708a(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1709a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: b */
        public void mo1710b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        @Override // android.support.v4.p019j.C0236g.b, android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: b */
        public void mo1711b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.g$b */
    static class b implements c {
        b() {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1706a(MenuItem menuItem, char c, int i) {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1707a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1708a(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: a */
        public void mo1709a(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: b */
        public void mo1710b(MenuItem menuItem, char c, int i) {
        }

        @Override // android.support.v4.p019j.C0236g.c
        /* JADX INFO: renamed from: b */
        public void mo1711b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.g$c */
    interface c {
        /* JADX INFO: renamed from: a */
        void mo1706a(MenuItem menuItem, char c, int i);

        /* JADX INFO: renamed from: a */
        void mo1707a(MenuItem menuItem, ColorStateList colorStateList);

        /* JADX INFO: renamed from: a */
        void mo1708a(MenuItem menuItem, PorterDuff.Mode mode);

        /* JADX INFO: renamed from: a */
        void mo1709a(MenuItem menuItem, CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        void mo1710b(MenuItem menuItem, char c, int i);

        /* JADX INFO: renamed from: b */
        void mo1711b(MenuItem menuItem, CharSequence charSequence);
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f1339a = new a();
        } else {
            f1339a = new b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static MenuItem m1699a(MenuItem menuItem, AbstractC0232c abstractC0232c) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            return ((InterfaceMenuItemC0196b) menuItem).mo1460a(abstractC0232c);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* JADX INFO: renamed from: a */
    public static void m1700a(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).setNumericShortcut(c2, i);
        } else {
            f1339a.mo1710b(menuItem, c2, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1701a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).setIconTintList(colorStateList);
        } else {
            f1339a.mo1707a(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1702a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).setIconTintMode(mode);
        } else {
            f1339a.mo1708a(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1703a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).mo1461a(charSequence);
        } else {
            f1339a.mo1709a(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1704b(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).setAlphabeticShortcut(c2, i);
        } else {
            f1339a.mo1706a(menuItem, c2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1705b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0196b) {
            ((InterfaceMenuItemC0196b) menuItem).mo1463b(charSequence);
        } else {
            f1339a.mo1711b(menuItem, charSequence);
        }
    }
}
