package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p013e.p014a.InterfaceMenuC0195a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: android.support.v7.view.menu.r */
/* JADX INFO: loaded from: classes.dex */
class MenuC0415r extends AbstractC0400c<InterfaceMenuC0195a> implements Menu {
    MenuC0415r(Context context, InterfaceMenuC0195a interfaceMenuC0195a) {
        super(context, interfaceMenuC0195a);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((InterfaceMenuC0195a) this.f2460b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m3189a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m3190a(((InterfaceMenuC0195a) this.f2460b).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m3190a(((InterfaceMenuC0195a) this.f2460b).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m3190a(((InterfaceMenuC0195a) this.f2460b).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m3190a(((InterfaceMenuC0195a) this.f2460b).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m3191a();
        ((InterfaceMenuC0195a) this.f2460b).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0195a) this.f2460b).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m3189a(((InterfaceMenuC0195a) this.f2460b).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0195a) this.f2460b).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0195a) this.f2460b).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0195a) this.f2460b).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0195a) this.f2460b).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m3192a(i);
        ((InterfaceMenuC0195a) this.f2460b).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m3193b(i);
        ((InterfaceMenuC0195a) this.f2460b).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0195a) this.f2460b).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0195a) this.f2460b).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0195a) this.f2460b).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0195a) this.f2460b).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0195a) this.f2460b).size();
    }
}
