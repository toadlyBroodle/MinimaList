package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p013e.p014a.InterfaceSubMenuC0197c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.view.menu.v */
/* JADX INFO: loaded from: classes.dex */
class SubMenuC0419v extends MenuC0415r implements SubMenu {
    SubMenuC0419v(Context context, InterfaceSubMenuC0197c interfaceSubMenuC0197c) {
        super(context, interfaceSubMenuC0197c);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceSubMenuC0197c m3345b() {
        return (InterfaceSubMenuC0197c) this.f2460b;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m3345b().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m3189a(m3345b().getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m3345b().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m3345b().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m3345b().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m3345b().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m3345b().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m3345b().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m3345b().setIcon(drawable);
        return this;
    }
}
