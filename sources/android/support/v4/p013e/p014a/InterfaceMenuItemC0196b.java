package android.support.v4.p013e.p014a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.v4.p019j.AbstractC0232c;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.e.a.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC0196b extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC0196b mo1460a(AbstractC0232c abstractC0232c);

    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC0196b mo1461a(CharSequence charSequence);

    /* JADX INFO: renamed from: a */
    AbstractC0232c mo1462a();

    /* JADX INFO: renamed from: b */
    InterfaceMenuItemC0196b mo1463b(CharSequence charSequence);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i);
}
