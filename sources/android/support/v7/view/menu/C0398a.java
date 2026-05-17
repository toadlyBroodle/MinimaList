package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.p007b.C0175b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p019j.AbstractC0232c;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
public class C0398a implements InterfaceMenuItemC0196b {

    /* JADX INFO: renamed from: a */
    private final int f2425a;

    /* JADX INFO: renamed from: b */
    private final int f2426b;

    /* JADX INFO: renamed from: c */
    private final int f2427c;

    /* JADX INFO: renamed from: d */
    private final int f2428d;

    /* JADX INFO: renamed from: e */
    private CharSequence f2429e;

    /* JADX INFO: renamed from: f */
    private CharSequence f2430f;

    /* JADX INFO: renamed from: g */
    private Intent f2431g;

    /* JADX INFO: renamed from: h */
    private char f2432h;

    /* JADX INFO: renamed from: j */
    private char f2434j;

    /* JADX INFO: renamed from: l */
    private Drawable f2436l;

    /* JADX INFO: renamed from: n */
    private Context f2438n;

    /* JADX INFO: renamed from: o */
    private MenuItem.OnMenuItemClickListener f2439o;

    /* JADX INFO: renamed from: p */
    private CharSequence f2440p;

    /* JADX INFO: renamed from: q */
    private CharSequence f2441q;

    /* JADX INFO: renamed from: i */
    private int f2433i = 4096;

    /* JADX INFO: renamed from: k */
    private int f2435k = 4096;

    /* JADX INFO: renamed from: m */
    private int f2437m = 0;

    /* JADX INFO: renamed from: r */
    private ColorStateList f2442r = null;

    /* JADX INFO: renamed from: s */
    private PorterDuff.Mode f2443s = null;

    /* JADX INFO: renamed from: t */
    private boolean f2444t = false;

    /* JADX INFO: renamed from: u */
    private boolean f2445u = false;

    /* JADX INFO: renamed from: v */
    private int f2446v = 16;

    public C0398a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2438n = context;
        this.f2425a = i2;
        this.f2426b = i;
        this.f2427c = i3;
        this.f2428d = i4;
        this.f2429e = charSequence;
    }

    /* JADX INFO: renamed from: b */
    private void m3176b() {
        if (this.f2436l != null) {
            if (this.f2444t || this.f2445u) {
                this.f2436l = C0181a.m1400f(this.f2436l);
                this.f2436l = this.f2436l.mutate();
                if (this.f2444t) {
                    C0181a.m1390a(this.f2436l, this.f2442r);
                }
                if (this.f2445u) {
                    C0181a.m1393a(this.f2436l, this.f2443s);
                }
            }
        }
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0196b mo1460a(AbstractC0232c abstractC0232c) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0196b setContentDescription(CharSequence charSequence) {
        this.f2440p = charSequence;
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b
    /* JADX INFO: renamed from: a */
    public AbstractC0232c mo1462a() {
        return null;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: b */
    public InterfaceMenuItemC0196b setTooltipText(CharSequence charSequence) {
        this.f2441q = charSequence;
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2435k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2434j;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2440p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2426b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2436l;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2442r;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2443s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2431g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2425a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2433i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2432h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2428d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2429e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f2430f != null ? this.f2430f : this.f2429e;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2441q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2446v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2446v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2446v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2446v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f2434j = Character.toLowerCase(c);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2434j = Character.toLowerCase(c);
        this.f2435k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f2446v = (z ? 1 : 0) | (this.f2446v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f2446v = (z ? 2 : 0) | (this.f2446v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f2446v = (z ? 16 : 0) | (this.f2446v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2437m = i;
        this.f2436l = C0175b.m1337a(this.f2438n, i);
        m3176b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2436l = drawable;
        this.f2437m = 0;
        m3176b();
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2442r = colorStateList;
        this.f2444t = true;
        m3176b();
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2443s = mode;
        this.f2445u = true;
        m3176b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2431g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f2432h = c;
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f2432h = c;
        this.f2433i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2439o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2432h = c;
        this.f2434j = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2432h = c;
        this.f2433i = KeyEvent.normalizeMetaState(i);
        this.f2434j = Character.toLowerCase(c2);
        this.f2435k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f2429e = this.f2438n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2429e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2430f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f2446v = (z ? 0 : 8) | (this.f2446v & 8);
        return this;
    }
}
