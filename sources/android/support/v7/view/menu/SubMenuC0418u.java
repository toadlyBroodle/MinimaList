package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0405h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.view.menu.u */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC0418u extends C0405h implements SubMenu {

    /* JADX INFO: renamed from: d */
    private C0405h f2625d;

    /* JADX INFO: renamed from: e */
    private C0407j f2626e;

    public SubMenuC0418u(Context context, C0405h c0405h, C0407j c0407j) {
        super(context);
        this.f2625d = c0405h;
        this.f2626e = c0407j;
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: a */
    public String mo3247a() {
        int itemId = this.f2626e != null ? this.f2626e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo3247a() + ":" + itemId;
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: a */
    public void mo3249a(C0405h.a aVar) {
        this.f2625d.mo3249a(aVar);
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: a */
    boolean mo3255a(C0405h c0405h, MenuItem menuItem) {
        return super.mo3255a(c0405h, menuItem) || this.f2625d.mo3255a(c0405h, menuItem);
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: b */
    public boolean mo3263b() {
        return this.f2625d.mo3263b();
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: c */
    public boolean mo3267c() {
        return this.f2625d.mo3267c();
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: c */
    public boolean mo3268c(C0407j c0407j) {
        return this.f2625d.mo3268c(c0407j);
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: d */
    public boolean mo3272d(C0407j c0407j) {
        return this.f2625d.mo3272d(c0407j);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f2626e;
    }

    @Override // android.support.v7.view.menu.C0405h
    /* JADX INFO: renamed from: p */
    public C0405h mo3285p() {
        return this.f2625d.mo3285p();
    }

    /* JADX INFO: renamed from: s */
    public Menu m3344s() {
        return this.f2625d;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m3274e(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m3242a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m3270d(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m3244a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m3243a(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f2626e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2626e.setIcon(drawable);
        return this;
    }

    @Override // android.support.v7.view.menu.C0405h, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2625d.setQwertyMode(z);
    }
}
