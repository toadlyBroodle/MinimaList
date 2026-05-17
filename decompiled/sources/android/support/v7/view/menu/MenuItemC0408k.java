package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.view.InterfaceC0389c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v7.view.menu.k */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC0408k extends AbstractC0400c<InterfaceMenuItemC0196b> implements MenuItem {

    /* JADX INFO: renamed from: c */
    private Method f2581c;

    /* JADX INFO: renamed from: android.support.v7.view.menu.k$a */
    class a extends AbstractC0232c {

        /* JADX INFO: renamed from: a */
        final ActionProvider f2582a;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2582a = actionProvider;
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: a */
        public View mo1679a() {
            return this.f2582a.onCreateActionView();
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: a */
        public void mo1683a(SubMenu subMenu) {
            this.f2582a.onPrepareSubMenu(MenuItemC0408k.this.m3190a(subMenu));
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: d */
        public boolean mo1687d() {
            return this.f2582a.onPerformDefaultAction();
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: e */
        public boolean mo1688e() {
            return this.f2582a.hasSubMenu();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.k$b */
    static class b extends FrameLayout implements InterfaceC0389c {

        /* JADX INFO: renamed from: a */
        final CollapsibleActionView f2584a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f2584a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // android.support.v7.view.InterfaceC0389c
        /* JADX INFO: renamed from: a */
        public void mo3134a() {
            this.f2584a.onActionViewExpanded();
        }

        @Override // android.support.v7.view.InterfaceC0389c
        /* JADX INFO: renamed from: b */
        public void mo3135b() {
            this.f2584a.onActionViewCollapsed();
        }

        /* JADX INFO: renamed from: c */
        View m3317c() {
            return (View) this.f2584a;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.k$c */
    private class c extends C0401d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2460b).onMenuItemActionCollapse(MenuItemC0408k.this.m3189a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2460b).onMenuItemActionExpand(MenuItemC0408k.this.m3189a(menuItem));
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.k$d */
    private class d extends C0401d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f2460b).onMenuItemClick(MenuItemC0408k.this.m3189a(menuItem));
        }
    }

    MenuItemC0408k(Context context, InterfaceMenuItemC0196b interfaceMenuItemC0196b) {
        super(context, interfaceMenuItemC0196b);
    }

    /* JADX INFO: renamed from: a */
    a mo3315a(ActionProvider actionProvider) {
        return new a(this.f2457a, actionProvider);
    }

    /* JADX INFO: renamed from: a */
    public void m3316a(boolean z) {
        try {
            if (this.f2581c == null) {
                this.f2581c = ((InterfaceMenuItemC0196b) this.f2460b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2581c.invoke(this.f2460b, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemC0196b) this.f2460b).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemC0196b) this.f2460b).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0232c abstractC0232cMo1462a = ((InterfaceMenuItemC0196b) this.f2460b).mo1462a();
        if (abstractC0232cMo1462a instanceof a) {
            return ((a) abstractC0232cMo1462a).f2582a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemC0196b) this.f2460b).getActionView();
        return actionView instanceof b ? ((b) actionView).m3317c() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m3190a(((InterfaceMenuItemC0196b) this.f2460b).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((InterfaceMenuItemC0196b) this.f2460b).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemC0196b) this.f2460b).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemC0196b) this.f2460b).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemC0196b) this.f2460b).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemC0196b) this.f2460b).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemC0196b) this.f2460b).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemC0196b) this.f2460b).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((InterfaceMenuItemC0196b) this.f2460b).mo1460a(actionProvider != null ? mo3315a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setActionView(i);
        View actionView = ((InterfaceMenuItemC0196b) this.f2460b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemC0196b) this.f2460b).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((InterfaceMenuItemC0196b) this.f2460b).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((InterfaceMenuItemC0196b) this.f2460b).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((InterfaceMenuItemC0196b) this.f2460b).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((InterfaceMenuItemC0196b) this.f2460b).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((InterfaceMenuItemC0196b) this.f2460b).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((InterfaceMenuItemC0196b) this.f2460b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((InterfaceMenuItemC0196b) this.f2460b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((InterfaceMenuItemC0196b) this.f2460b).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((InterfaceMenuItemC0196b) this.f2460b).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemC0196b) this.f2460b).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((InterfaceMenuItemC0196b) this.f2460b).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((InterfaceMenuItemC0196b) this.f2460b).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((InterfaceMenuItemC0196b) this.f2460b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((InterfaceMenuItemC0196b) this.f2460b).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((InterfaceMenuItemC0196b) this.f2460b).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((InterfaceMenuItemC0196b) this.f2460b).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((InterfaceMenuItemC0196b) this.f2460b).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((InterfaceMenuItemC0196b) this.f2460b).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((InterfaceMenuItemC0196b) this.f2460b).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((InterfaceMenuItemC0196b) this.f2460b).setVisible(z);
    }
}
