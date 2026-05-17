package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.p013e.p014a.InterfaceMenuC0195a;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p013e.p014a.InterfaceSubMenuC0197c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: android.support.v7.view.menu.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0414q {
    /* JADX INFO: renamed from: a */
    public static Menu m3337a(Context context, InterfaceMenuC0195a interfaceMenuC0195a) {
        return new MenuC0415r(context, interfaceMenuC0195a);
    }

    /* JADX INFO: renamed from: a */
    public static MenuItem m3338a(Context context, InterfaceMenuItemC0196b interfaceMenuItemC0196b) {
        return Build.VERSION.SDK_INT >= 16 ? new C0409l(context, interfaceMenuItemC0196b) : new MenuItemC0408k(context, interfaceMenuItemC0196b);
    }

    /* JADX INFO: renamed from: a */
    public static SubMenu m3339a(Context context, InterfaceSubMenuC0197c interfaceSubMenuC0197c) {
        return new SubMenuC0419v(context, interfaceSubMenuC0197c);
    }
}
