package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p013e.p014a.InterfaceSubMenuC0197c;
import android.support.v4.p018i.C0207a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v7.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0400c<T> extends C0401d<T> {

    /* JADX INFO: renamed from: a */
    final Context f2457a;

    /* JADX INFO: renamed from: c */
    private Map<InterfaceMenuItemC0196b, MenuItem> f2458c;

    /* JADX INFO: renamed from: d */
    private Map<InterfaceSubMenuC0197c, SubMenu> f2459d;

    AbstractC0400c(Context context, T t) {
        super(t);
        this.f2457a = context;
    }

    /* JADX INFO: renamed from: a */
    final MenuItem m3189a(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0196b)) {
            return menuItem;
        }
        InterfaceMenuItemC0196b interfaceMenuItemC0196b = (InterfaceMenuItemC0196b) menuItem;
        if (this.f2458c == null) {
            this.f2458c = new C0207a();
        }
        MenuItem menuItem2 = this.f2458c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem menuItemM3338a = C0414q.m3338a(this.f2457a, interfaceMenuItemC0196b);
        this.f2458c.put(interfaceMenuItemC0196b, menuItemM3338a);
        return menuItemM3338a;
    }

    /* JADX INFO: renamed from: a */
    final SubMenu m3190a(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0197c)) {
            return subMenu;
        }
        InterfaceSubMenuC0197c interfaceSubMenuC0197c = (InterfaceSubMenuC0197c) subMenu;
        if (this.f2459d == null) {
            this.f2459d = new C0207a();
        }
        SubMenu subMenu2 = this.f2459d.get(interfaceSubMenuC0197c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu subMenuM3339a = C0414q.m3339a(this.f2457a, interfaceSubMenuC0197c);
        this.f2459d.put(interfaceSubMenuC0197c, subMenuM3339a);
        return subMenuM3339a;
    }

    /* JADX INFO: renamed from: a */
    final void m3191a() {
        if (this.f2458c != null) {
            this.f2458c.clear();
        }
        if (this.f2459d != null) {
            this.f2459d.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3192a(int i) {
        if (this.f2458c == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0196b> it = this.f2458c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m3193b(int i) {
        if (this.f2458c == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0196b> it = this.f2458c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
