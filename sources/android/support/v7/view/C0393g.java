package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.p013e.p014a.InterfaceMenuC0195a;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v4.p019j.C0236g;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.MenuItemC0408k;
import android.support.v7.widget.C0470ah;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v7.view.g */
/* JADX INFO: loaded from: classes.dex */
public class C0393g extends MenuInflater {

    /* JADX INFO: renamed from: a */
    static final Class<?>[] f2344a = {Context.class};

    /* JADX INFO: renamed from: b */
    static final Class<?>[] f2345b = f2344a;

    /* JADX INFO: renamed from: c */
    final Object[] f2346c;

    /* JADX INFO: renamed from: d */
    final Object[] f2347d;

    /* JADX INFO: renamed from: e */
    Context f2348e;

    /* JADX INFO: renamed from: f */
    private Object f2349f;

    /* JADX INFO: renamed from: android.support.v7.view.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        private static final Class<?>[] f2350a = {MenuItem.class};

        /* JADX INFO: renamed from: b */
        private Object f2351b;

        /* JADX INFO: renamed from: c */
        private Method f2352c;

        public a(Object obj, String str) {
            this.f2351b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2352c = cls.getMethod(str, f2350a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2352c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2352c.invoke(this.f2351b, menuItem)).booleanValue();
                }
                this.f2352c.invoke(this.f2351b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.g$b */
    private class b {

        /* JADX INFO: renamed from: A */
        private String f2353A;

        /* JADX INFO: renamed from: B */
        private String f2354B;

        /* JADX INFO: renamed from: C */
        private CharSequence f2355C;

        /* JADX INFO: renamed from: D */
        private CharSequence f2356D;

        /* JADX INFO: renamed from: E */
        private ColorStateList f2357E = null;

        /* JADX INFO: renamed from: F */
        private PorterDuff.Mode f2358F = null;

        /* JADX INFO: renamed from: a */
        AbstractC0232c f2359a;

        /* JADX INFO: renamed from: c */
        private Menu f2361c;

        /* JADX INFO: renamed from: d */
        private int f2362d;

        /* JADX INFO: renamed from: e */
        private int f2363e;

        /* JADX INFO: renamed from: f */
        private int f2364f;

        /* JADX INFO: renamed from: g */
        private int f2365g;

        /* JADX INFO: renamed from: h */
        private boolean f2366h;

        /* JADX INFO: renamed from: i */
        private boolean f2367i;

        /* JADX INFO: renamed from: j */
        private boolean f2368j;

        /* JADX INFO: renamed from: k */
        private int f2369k;

        /* JADX INFO: renamed from: l */
        private int f2370l;

        /* JADX INFO: renamed from: m */
        private CharSequence f2371m;

        /* JADX INFO: renamed from: n */
        private CharSequence f2372n;

        /* JADX INFO: renamed from: o */
        private int f2373o;

        /* JADX INFO: renamed from: p */
        private char f2374p;

        /* JADX INFO: renamed from: q */
        private int f2375q;

        /* JADX INFO: renamed from: r */
        private char f2376r;

        /* JADX INFO: renamed from: s */
        private int f2377s;

        /* JADX INFO: renamed from: t */
        private int f2378t;

        /* JADX INFO: renamed from: u */
        private boolean f2379u;

        /* JADX INFO: renamed from: v */
        private boolean f2380v;

        /* JADX INFO: renamed from: w */
        private boolean f2381w;

        /* JADX INFO: renamed from: x */
        private int f2382x;

        /* JADX INFO: renamed from: y */
        private int f2383y;

        /* JADX INFO: renamed from: z */
        private String f2384z;

        public b(Menu menu) {
            this.f2361c = menu;
            m3148a();
        }

        /* JADX INFO: renamed from: a */
        private char m3145a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: a */
        private <T> T m3146a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0393g.this.f2348e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m3147a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f2379u).setVisible(this.f2380v).setEnabled(this.f2381w).setCheckable(this.f2378t >= 1).setTitleCondensed(this.f2372n).setIcon(this.f2373o);
            if (this.f2382x >= 0) {
                menuItem.setShowAsAction(this.f2382x);
            }
            if (this.f2354B != null) {
                if (C0393g.this.f2348e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0393g.this.m3144a(), this.f2354B));
            }
            if (menuItem instanceof C0407j) {
            }
            if (this.f2378t >= 2) {
                if (menuItem instanceof C0407j) {
                    ((C0407j) menuItem).m3296a(true);
                } else if (menuItem instanceof MenuItemC0408k) {
                    ((MenuItemC0408k) menuItem).m3316a(true);
                }
            }
            if (this.f2384z != null) {
                menuItem.setActionView((View) m3146a(this.f2384z, C0393g.f2344a, C0393g.this.f2346c));
            } else {
                z = false;
            }
            if (this.f2383y > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(this.f2383y);
                }
            }
            if (this.f2359a != null) {
                C0236g.m1699a(menuItem, this.f2359a);
            }
            C0236g.m1703a(menuItem, this.f2355C);
            C0236g.m1705b(menuItem, this.f2356D);
            C0236g.m1704b(menuItem, this.f2374p, this.f2375q);
            C0236g.m1700a(menuItem, this.f2376r, this.f2377s);
            if (this.f2358F != null) {
                C0236g.m1702a(menuItem, this.f2358F);
            }
            if (this.f2357E != null) {
                C0236g.m1701a(menuItem, this.f2357E);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3148a() {
            this.f2362d = 0;
            this.f2363e = 0;
            this.f2364f = 0;
            this.f2365g = 0;
            this.f2366h = true;
            this.f2367i = true;
        }

        /* JADX INFO: renamed from: a */
        public void m3149a(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C0393g.this.f2348e.obtainStyledAttributes(attributeSet, C0333a.j.MenuGroup);
            this.f2362d = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.MenuGroup_android_id, 0);
            this.f2363e = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuGroup_android_menuCategory, 0);
            this.f2364f = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuGroup_android_orderInCategory, 0);
            this.f2365g = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuGroup_android_checkableBehavior, 0);
            this.f2366h = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuGroup_android_visible, true);
            this.f2367i = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: b */
        public void m3150b() {
            this.f2368j = true;
            m3147a(this.f2361c.add(this.f2362d, this.f2369k, this.f2370l, this.f2371m));
        }

        /* JADX INFO: renamed from: b */
        public void m3151b(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C0393g.this.f2348e.obtainStyledAttributes(attributeSet, C0333a.j.MenuItem);
            this.f2369k = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.MenuItem_android_id, 0);
            this.f2370l = (typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_android_menuCategory, this.f2363e) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_android_orderInCategory, this.f2364f) & 65535);
            this.f2371m = typedArrayObtainStyledAttributes.getText(C0333a.j.MenuItem_android_title);
            this.f2372n = typedArrayObtainStyledAttributes.getText(C0333a.j.MenuItem_android_titleCondensed);
            this.f2373o = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.MenuItem_android_icon, 0);
            this.f2374p = m3145a(typedArrayObtainStyledAttributes.getString(C0333a.j.MenuItem_android_alphabeticShortcut));
            this.f2375q = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_alphabeticModifiers, 4096);
            this.f2376r = m3145a(typedArrayObtainStyledAttributes.getString(C0333a.j.MenuItem_android_numericShortcut));
            this.f2377s = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_numericModifiers, 4096);
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.MenuItem_android_checkable)) {
                this.f2378t = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f2378t = this.f2365g;
            }
            this.f2379u = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuItem_android_checked, false);
            this.f2380v = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuItem_android_visible, this.f2366h);
            this.f2381w = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.MenuItem_android_enabled, this.f2367i);
            this.f2382x = typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_showAsAction, -1);
            this.f2354B = typedArrayObtainStyledAttributes.getString(C0333a.j.MenuItem_android_onClick);
            this.f2383y = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.MenuItem_actionLayout, 0);
            this.f2384z = typedArrayObtainStyledAttributes.getString(C0333a.j.MenuItem_actionViewClass);
            this.f2353A = typedArrayObtainStyledAttributes.getString(C0333a.j.MenuItem_actionProviderClass);
            boolean z = this.f2353A != null;
            if (z && this.f2383y == 0 && this.f2384z == null) {
                this.f2359a = (AbstractC0232c) m3146a(this.f2353A, C0393g.f2345b, C0393g.this.f2347d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2359a = null;
            }
            this.f2355C = typedArrayObtainStyledAttributes.getText(C0333a.j.MenuItem_contentDescription);
            this.f2356D = typedArrayObtainStyledAttributes.getText(C0333a.j.MenuItem_tooltipText);
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.MenuItem_iconTintMode)) {
                this.f2358F = C0470ah.m3863a(typedArrayObtainStyledAttributes.getInt(C0333a.j.MenuItem_iconTintMode, -1), this.f2358F);
            } else {
                this.f2358F = null;
            }
            if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.MenuItem_iconTint)) {
                this.f2357E = typedArrayObtainStyledAttributes.getColorStateList(C0333a.j.MenuItem_iconTint);
            } else {
                this.f2357E = null;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f2368j = false;
        }

        /* JADX INFO: renamed from: c */
        public SubMenu m3152c() {
            this.f2368j = true;
            SubMenu subMenuAddSubMenu = this.f2361c.addSubMenu(this.f2362d, this.f2369k, this.f2370l, this.f2371m);
            m3147a(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: d */
        public boolean m3153d() {
            return this.f2368j;
        }
    }

    public C0393g(Context context) {
        super(context);
        this.f2348e = context;
        this.f2346c = new Object[]{context};
        this.f2347d = this.f2346c;
    }

    /* JADX INFO: renamed from: a */
    private Object m3142a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3142a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        switch(r3) {
            case 1: goto L58;
            case 2: goto L18;
            case 3: goto L30;
            default: goto L11;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r9 = r3;
        r3 = r11.next();
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r3 = r11.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r3.equals("group") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        r7.m3149a(r12);
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r3.equals("item") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r7.m3151b(r12);
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r3.equals("menu") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        m3143a(r11, r12, r7.m3152c());
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        r2 = r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r3 = r11.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r3.equals(r2) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r2 = null;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r3.equals("group") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r7.m3148a();
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r3.equals("item") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r7.m3153d() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r7.f2359a == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r7.f2359a.mo1688e() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        r7.m3152c();
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        r7.m3150b();
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        if (r3.equals("menu") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r0 = true;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r2 = null;
        r5 = false;
        r3 = r0;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != false) goto L57;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3143a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Object m3144a() {
        if (this.f2349f == null) {
            this.f2349f = m3142a(this.f2348e);
        }
        return this.f2349f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0195a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                layout = this.f2348e.getResources().getLayout(i);
                m3143a(layout, Xml.asAttributeSet(layout), menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
