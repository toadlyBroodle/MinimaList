package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.menu.InterfaceC0413p;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: android.support.v7.view.menu.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0407j implements InterfaceMenuItemC0196b {

    /* JADX INFO: renamed from: F */
    private static String f2545F;

    /* JADX INFO: renamed from: G */
    private static String f2546G;

    /* JADX INFO: renamed from: H */
    private static String f2547H;

    /* JADX INFO: renamed from: I */
    private static String f2548I;

    /* JADX INFO: renamed from: A */
    private View f2549A;

    /* JADX INFO: renamed from: B */
    private AbstractC0232c f2550B;

    /* JADX INFO: renamed from: C */
    private MenuItem.OnActionExpandListener f2551C;

    /* JADX INFO: renamed from: E */
    private ContextMenu.ContextMenuInfo f2553E;

    /* JADX INFO: renamed from: a */
    C0405h f2554a;

    /* JADX INFO: renamed from: b */
    private final int f2555b;

    /* JADX INFO: renamed from: c */
    private final int f2556c;

    /* JADX INFO: renamed from: d */
    private final int f2557d;

    /* JADX INFO: renamed from: e */
    private final int f2558e;

    /* JADX INFO: renamed from: f */
    private CharSequence f2559f;

    /* JADX INFO: renamed from: g */
    private CharSequence f2560g;

    /* JADX INFO: renamed from: h */
    private Intent f2561h;

    /* JADX INFO: renamed from: i */
    private char f2562i;

    /* JADX INFO: renamed from: k */
    private char f2564k;

    /* JADX INFO: renamed from: m */
    private Drawable f2566m;

    /* JADX INFO: renamed from: o */
    private SubMenuC0418u f2568o;

    /* JADX INFO: renamed from: p */
    private Runnable f2569p;

    /* JADX INFO: renamed from: q */
    private MenuItem.OnMenuItemClickListener f2570q;

    /* JADX INFO: renamed from: r */
    private CharSequence f2571r;

    /* JADX INFO: renamed from: s */
    private CharSequence f2572s;

    /* JADX INFO: renamed from: z */
    private int f2579z;

    /* JADX INFO: renamed from: j */
    private int f2563j = 4096;

    /* JADX INFO: renamed from: l */
    private int f2565l = 4096;

    /* JADX INFO: renamed from: n */
    private int f2567n = 0;

    /* JADX INFO: renamed from: t */
    private ColorStateList f2573t = null;

    /* JADX INFO: renamed from: u */
    private PorterDuff.Mode f2574u = null;

    /* JADX INFO: renamed from: v */
    private boolean f2575v = false;

    /* JADX INFO: renamed from: w */
    private boolean f2576w = false;

    /* JADX INFO: renamed from: x */
    private boolean f2577x = false;

    /* JADX INFO: renamed from: y */
    private int f2578y = 16;

    /* JADX INFO: renamed from: D */
    private boolean f2552D = false;

    C0407j(C0405h c0405h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2579z = 0;
        this.f2554a = c0405h;
        this.f2555b = i2;
        this.f2556c = i;
        this.f2557d = i3;
        this.f2558e = i4;
        this.f2559f = charSequence;
        this.f2579z = i5;
    }

    /* JADX INFO: renamed from: a */
    private Drawable m3290a(Drawable drawable) {
        if (drawable != null && this.f2577x && (this.f2575v || this.f2576w)) {
            drawable = C0181a.m1400f(drawable).mutate();
            if (this.f2575v) {
                C0181a.m1390a(drawable, this.f2573t);
            }
            if (this.f2576w) {
                C0181a.m1393a(drawable, this.f2574u);
            }
            this.f2577x = false;
        }
        return drawable;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setActionView(int i) {
        Context contextM3273e = this.f2554a.m3273e();
        setActionView(LayoutInflater.from(contextM3273e).inflate(i, (ViewGroup) new LinearLayout(contextM3273e), false));
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b
    /* JADX INFO: renamed from: a */
    public InterfaceMenuItemC0196b mo1460a(AbstractC0232c abstractC0232c) {
        if (this.f2550B != null) {
            this.f2550B.m1689f();
        }
        this.f2549A = null;
        this.f2550B = abstractC0232c;
        this.f2554a.mo208a(true);
        if (this.f2550B != null) {
            this.f2550B.mo1682a(new AbstractC0232c.b() { // from class: android.support.v7.view.menu.j.1
                @Override // android.support.v4.p019j.AbstractC0232c.b
                /* JADX INFO: renamed from: a */
                public void mo1691a(boolean z) {
                    C0407j.this.f2554a.m3250a(C0407j.this);
                }
            });
        }
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setActionView(View view) {
        this.f2549A = view;
        this.f2550B = null;
        if (view != null && view.getId() == -1 && this.f2555b > 0) {
            view.setId(this.f2555b);
        }
        this.f2554a.m3260b(this);
        return this;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setContentDescription(CharSequence charSequence) {
        this.f2571r = charSequence;
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b
    /* JADX INFO: renamed from: a */
    public AbstractC0232c mo1462a() {
        return this.f2550B;
    }

    /* JADX INFO: renamed from: a */
    CharSequence m3293a(InterfaceC0413p.a aVar) {
        return (aVar == null || !aVar.mo156b()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: renamed from: a */
    public void m3294a(SubMenuC0418u subMenuC0418u) {
        this.f2568o = subMenuC0418u;
        subMenuC0418u.setHeaderTitle(getTitle());
    }

    /* JADX INFO: renamed from: a */
    void m3295a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2553E = contextMenuInfo;
    }

    /* JADX INFO: renamed from: a */
    public void m3296a(boolean z) {
        this.f2578y = (z ? 4 : 0) | (this.f2578y & (-5));
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0196b setTooltipText(CharSequence charSequence) {
        this.f2572s = charSequence;
        this.f2554a.mo208a(false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    void m3298b(boolean z) {
        int i = this.f2578y;
        this.f2578y = (z ? 2 : 0) | (this.f2578y & (-3));
        if (i != this.f2578y) {
            this.f2554a.mo208a(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m3299b() {
        if ((this.f2570q != null && this.f2570q.onMenuItemClick(this)) || this.f2554a.mo3255a(this.f2554a, this)) {
            return true;
        }
        if (this.f2569p != null) {
            this.f2569p.run();
            return true;
        }
        if (this.f2561h != null) {
            try {
                this.f2554a.m3273e().startActivity(this.f2561h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f2550B != null && this.f2550B.mo1687d();
    }

    /* JADX INFO: renamed from: c */
    public int m3300c() {
        return this.f2558e;
    }

    /* JADX INFO: renamed from: c */
    boolean m3301c(boolean z) {
        int i = this.f2578y;
        this.f2578y = (z ? 0 : 8) | (this.f2578y & (-9));
        return i != this.f2578y;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2579z & 8) == 0) {
            return false;
        }
        if (this.f2549A == null) {
            return true;
        }
        if (this.f2551C == null || this.f2551C.onMenuItemActionCollapse(this)) {
            return this.f2554a.mo3272d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    char m3302d() {
        return this.f2554a.mo3263b() ? this.f2564k : this.f2562i;
    }

    /* JADX INFO: renamed from: d */
    public void m3303d(boolean z) {
        if (z) {
            this.f2578y |= 32;
        } else {
            this.f2578y &= -33;
        }
    }

    /* JADX INFO: renamed from: e */
    String m3304e() {
        char cM3302d = m3302d();
        if (cM3302d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f2545F);
        switch (cM3302d) {
            case '\b':
                sb.append(f2547H);
                break;
            case '\n':
                sb.append(f2546G);
                break;
            case ' ':
                sb.append(f2548I);
                break;
            default:
                sb.append(cM3302d);
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m3305e(boolean z) {
        this.f2552D = z;
        this.f2554a.mo208a(false);
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m3314n()) {
            return false;
        }
        if (this.f2551C == null || this.f2551C.onMenuItemActionExpand(this)) {
            return this.f2554a.mo3268c(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    boolean m3306f() {
        return this.f2554a.mo3267c() && m3302d() != 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3307g() {
        return (this.f2578y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public View getActionView() {
        if (this.f2549A != null) {
            return this.f2549A;
        }
        if (this.f2550B == null) {
            return null;
        }
        this.f2549A = this.f2550B.mo1680a(this);
        return this.f2549A;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2565l;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2564k;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2571r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2556c;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        if (this.f2566m != null) {
            return m3290a(this.f2566m);
        }
        if (this.f2567n == 0) {
            return null;
        }
        Drawable drawableM2790b = C0366b.m2790b(this.f2554a.m3273e(), this.f2567n);
        this.f2567n = 0;
        this.f2566m = drawableM2790b;
        return m3290a(drawableM2790b);
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2573t;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2574u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2561h;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2555b;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2553E;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2563j;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2562i;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2557d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2568o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2559f;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2560g != null ? this.f2560g : this.f2559f;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2572s;
    }

    /* JADX INFO: renamed from: h */
    public void m3308h() {
        this.f2554a.m3260b(this);
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2568o != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3309i() {
        return this.f2554a.m3286q();
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2552D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2578y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2578y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2578y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2550B == null || !this.f2550B.mo1685b()) ? (this.f2578y & 8) == 0 : (this.f2578y & 8) == 0 && this.f2550B.mo1686c();
    }

    /* JADX INFO: renamed from: j */
    public boolean m3310j() {
        return (this.f2578y & 32) == 32;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3311k() {
        return (this.f2579z & 1) == 1;
    }

    /* JADX INFO: renamed from: l */
    public boolean m3312l() {
        return (this.f2579z & 2) == 2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m3313m() {
        return (this.f2579z & 4) == 4;
    }

    /* JADX INFO: renamed from: n */
    public boolean m3314n() {
        if ((this.f2579z & 8) == 0) {
            return false;
        }
        if (this.f2549A == null && this.f2550B != null) {
            this.f2549A = this.f2550B.mo1680a(this);
        }
        return this.f2549A != null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2564k != c) {
            this.f2564k = Character.toLowerCase(c);
            this.f2554a.mo208a(false);
        }
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2564k != c || this.f2565l != i) {
            this.f2564k = Character.toLowerCase(c);
            this.f2565l = KeyEvent.normalizeMetaState(i);
            this.f2554a.mo208a(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f2578y;
        this.f2578y = (z ? 1 : 0) | (this.f2578y & (-2));
        if (i != this.f2578y) {
            this.f2554a.mo208a(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f2578y & 4) != 0) {
            this.f2554a.m3253a((MenuItem) this);
        } else {
            m3298b(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2578y |= 16;
        } else {
            this.f2578y &= -17;
        }
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2566m = null;
        this.f2567n = i;
        this.f2577x = true;
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2567n = 0;
        this.f2566m = drawable;
        this.f2577x = true;
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2573t = colorStateList;
        this.f2575v = true;
        this.f2577x = true;
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2574u = mode;
        this.f2576w = true;
        this.f2577x = true;
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2561h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f2562i != c) {
            this.f2562i = c;
            this.f2554a.mo208a(false);
        }
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2562i != c || this.f2563j != i) {
            this.f2562i = c;
            this.f2563j = KeyEvent.normalizeMetaState(i);
            this.f2554a.mo208a(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2551C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2570q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2562i = c;
        this.f2564k = Character.toLowerCase(c2);
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2562i = c;
        this.f2563j = KeyEvent.normalizeMetaState(i);
        this.f2564k = Character.toLowerCase(c2);
        this.f2565l = KeyEvent.normalizeMetaState(i2);
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.support.v4.p013e.p014a.InterfaceMenuItemC0196b, android.view.MenuItem
    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2579z = i;
                this.f2554a.m3260b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f2554a.m3273e().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2559f = charSequence;
        this.f2554a.mo208a(false);
        if (this.f2568o != null) {
            this.f2568o.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2560g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f2559f;
        }
        this.f2554a.mo208a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m3301c(z)) {
            this.f2554a.m3250a(this);
        }
        return this;
    }

    public String toString() {
        if (this.f2559f != null) {
            return this.f2559f.toString();
        }
        return null;
    }
}
