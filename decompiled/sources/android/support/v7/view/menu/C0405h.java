package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p007b.C0175b;
import android.support.v4.p013e.p014a.InterfaceMenuC0195a;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.p022a.C0333a;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: android.support.v7.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public class C0405h implements InterfaceMenuC0195a {

    /* JADX INFO: renamed from: d */
    private static final int[] f2515d = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    CharSequence f2516a;

    /* JADX INFO: renamed from: b */
    Drawable f2517b;

    /* JADX INFO: renamed from: c */
    View f2518c;

    /* JADX INFO: renamed from: e */
    private final Context f2519e;

    /* JADX INFO: renamed from: f */
    private final Resources f2520f;

    /* JADX INFO: renamed from: g */
    private boolean f2521g;

    /* JADX INFO: renamed from: h */
    private boolean f2522h;

    /* JADX INFO: renamed from: i */
    private a f2523i;

    /* JADX INFO: renamed from: q */
    private ContextMenu.ContextMenuInfo f2531q;

    /* JADX INFO: renamed from: y */
    private C0407j f2539y;

    /* JADX INFO: renamed from: z */
    private boolean f2540z;

    /* JADX INFO: renamed from: p */
    private int f2530p = 0;

    /* JADX INFO: renamed from: r */
    private boolean f2532r = false;

    /* JADX INFO: renamed from: s */
    private boolean f2533s = false;

    /* JADX INFO: renamed from: t */
    private boolean f2534t = false;

    /* JADX INFO: renamed from: u */
    private boolean f2535u = false;

    /* JADX INFO: renamed from: v */
    private boolean f2536v = false;

    /* JADX INFO: renamed from: w */
    private ArrayList<C0407j> f2537w = new ArrayList<>();

    /* JADX INFO: renamed from: x */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0412o>> f2538x = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: j */
    private ArrayList<C0407j> f2524j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    private ArrayList<C0407j> f2525k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    private boolean f2526l = true;

    /* JADX INFO: renamed from: m */
    private ArrayList<C0407j> f2527m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private ArrayList<C0407j> f2528n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    private boolean f2529o = true;

    /* JADX INFO: renamed from: android.support.v7.view.menu.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo424a(C0405h c0405h);

        /* JADX INFO: renamed from: a */
        boolean mo425a(C0405h c0405h, MenuItem menuItem);
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.h$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo3171a(C0407j c0407j);
    }

    public C0405h(Context context) {
        this.f2519e = context;
        this.f2520f = context.getResources();
        m3237e(true);
    }

    /* JADX INFO: renamed from: a */
    private static int m3230a(ArrayList<C0407j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m3300c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private C0407j m3231a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0407j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* JADX INFO: renamed from: a */
    private void m3232a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesM3269d = m3269d();
        if (view != null) {
            this.f2518c = view;
            this.f2516a = null;
            this.f2517b = null;
        } else {
            if (i > 0) {
                this.f2516a = resourcesM3269d.getText(i);
            } else if (charSequence != null) {
                this.f2516a = charSequence;
            }
            if (i2 > 0) {
                this.f2517b = C0175b.m1337a(m3273e(), i2);
            } else if (drawable != null) {
                this.f2517b = drawable;
            }
            this.f2518c = null;
        }
        mo208a(false);
    }

    /* JADX INFO: renamed from: a */
    private void m3233a(int i, boolean z) {
        if (i < 0 || i >= this.f2524j.size()) {
            return;
        }
        this.f2524j.remove(i);
        if (z) {
            mo208a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3234a(SubMenuC0418u subMenuC0418u, InterfaceC0412o interfaceC0412o) {
        if (this.f2538x.isEmpty()) {
            return false;
        }
        boolean zMo177a = interfaceC0412o != null ? interfaceC0412o.mo177a(subMenuC0418u) : false;
        Iterator<WeakReference<InterfaceC0412o>> it = this.f2538x.iterator();
        while (true) {
            boolean zMo177a2 = zMo177a;
            if (!it.hasNext()) {
                return zMo177a2;
            }
            WeakReference<InterfaceC0412o> next = it.next();
            InterfaceC0412o interfaceC0412o2 = next.get();
            if (interfaceC0412o2 == null) {
                this.f2538x.remove(next);
            } else if (!zMo177a2) {
                zMo177a2 = interfaceC0412o2.mo177a(subMenuC0418u);
            }
            zMo177a = zMo177a2;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3235d(boolean z) {
        if (this.f2538x.isEmpty()) {
            return;
        }
        m3276g();
        for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
            InterfaceC0412o interfaceC0412o = weakReference.get();
            if (interfaceC0412o == null) {
                this.f2538x.remove(weakReference);
            } else {
                interfaceC0412o.mo174a(z);
            }
        }
        m3277h();
    }

    /* JADX INFO: renamed from: e */
    private void m3236e(Bundle bundle) {
        Parcelable parcelableMo183c;
        if (this.f2538x.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
            InterfaceC0412o interfaceC0412o = weakReference.get();
            if (interfaceC0412o == null) {
                this.f2538x.remove(weakReference);
            } else {
                int iMo178b = interfaceC0412o.mo178b();
                if (iMo178b > 0 && (parcelableMo183c = interfaceC0412o.mo183c()) != null) {
                    sparseArray.put(iMo178b, parcelableMo183c);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* JADX INFO: renamed from: e */
    private void m3237e(boolean z) {
        this.f2522h = z && this.f2520f.getConfiguration().keyboard != 1 && this.f2520f.getBoolean(C0333a.b.abc_config_showMenuShortcutsWhenKeyboardPresent);
    }

    /* JADX INFO: renamed from: f */
    private static int m3238f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= f2515d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (f2515d[i2] << 16) | (65535 & i);
    }

    /* JADX INFO: renamed from: f */
    private void m3239f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f2538x.isEmpty()) {
            return;
        }
        for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
            InterfaceC0412o interfaceC0412o = weakReference.get();
            if (interfaceC0412o == null) {
                this.f2538x.remove(weakReference);
            } else {
                int iMo178b = interfaceC0412o.mo178b();
                if (iMo178b > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(iMo178b)) != null) {
                    interfaceC0412o.mo168a(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3240a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (this.f2524j.get(i3).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public C0405h m3241a(int i) {
        this.f2530p = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected C0405h m3242a(Drawable drawable) {
        m3232a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected C0405h m3243a(View view) {
        m3232a(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected C0405h m3244a(CharSequence charSequence) {
        m3232a(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    C0407j m3245a(int i, KeyEvent keyEvent) {
        ArrayList<C0407j> arrayList = this.f2537w;
        arrayList.clear();
        m3254a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo3263b = mo3263b();
        for (int i2 = 0; i2 < size; i2++) {
            C0407j c0407j = arrayList.get(i2);
            char alphabeticShortcut = zMo3263b ? c0407j.getAlphabeticShortcut() : c0407j.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0407j;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0407j;
            }
            if (zMo3263b && alphabeticShortcut == '\b' && i == 67) {
                return c0407j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected MenuItem m3246a(int i, int i2, int i3, CharSequence charSequence) {
        int iM3238f = m3238f(i3);
        C0407j c0407jM3231a = m3231a(i, i2, i3, iM3238f, charSequence, this.f2530p);
        if (this.f2531q != null) {
            c0407jM3231a.m3295a(this.f2531q);
        }
        this.f2524j.add(m3230a(this.f2524j, iM3238f), c0407jM3231a);
        mo208a(true);
        return c0407jM3231a;
    }

    /* JADX INFO: renamed from: a */
    protected String mo3247a() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: a */
    public void m3248a(Bundle bundle) {
        m3236e(bundle);
    }

    /* JADX INFO: renamed from: a */
    public void mo3249a(a aVar) {
        this.f2523i = aVar;
    }

    /* JADX INFO: renamed from: a */
    void m3250a(C0407j c0407j) {
        this.f2526l = true;
        mo208a(true);
    }

    /* JADX INFO: renamed from: a */
    public void m3251a(InterfaceC0412o interfaceC0412o) {
        m3252a(interfaceC0412o, this.f2519e);
    }

    /* JADX INFO: renamed from: a */
    public void m3252a(InterfaceC0412o interfaceC0412o, Context context) {
        this.f2538x.add(new WeakReference<>(interfaceC0412o));
        interfaceC0412o.mo165a(context, this);
        this.f2529o = true;
    }

    /* JADX INFO: renamed from: a */
    void m3253a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2524j.size();
        m3276g();
        for (int i = 0; i < size; i++) {
            C0407j c0407j = this.f2524j.get(i);
            if (c0407j.getGroupId() == groupId && c0407j.m3307g() && c0407j.isCheckable()) {
                c0407j.m3298b(c0407j == menuItem);
            }
        }
        m3277h();
    }

    /* JADX INFO: renamed from: a */
    void m3254a(List<C0407j> list, int i, KeyEvent keyEvent) {
        boolean zMo3263b = mo3263b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2524j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0407j c0407j = this.f2524j.get(i2);
                if (c0407j.hasSubMenu()) {
                    ((C0405h) c0407j.getSubMenu()).m3254a(list, i, keyEvent);
                }
                char alphabeticShortcut = zMo3263b ? c0407j.getAlphabeticShortcut() : c0407j.getNumericShortcut();
                if (((modifiers & 69647) == ((zMo3263b ? c0407j.getAlphabeticModifiers() : c0407j.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zMo3263b && alphabeticShortcut == '\b' && i == 67)) && c0407j.isEnabled())) {
                    list.add(c0407j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo208a(boolean z) {
        if (this.f2532r) {
            this.f2533s = true;
            if (z) {
                this.f2534t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2526l = true;
            this.f2529o = true;
        }
        m3235d(z);
    }

    /* JADX INFO: renamed from: a */
    boolean mo3255a(C0405h c0405h, MenuItem menuItem) {
        return this.f2523i != null && this.f2523i.mo425a(c0405h, menuItem);
    }

    /* JADX INFO: renamed from: a */
    public boolean m3256a(MenuItem menuItem, int i) {
        return m3257a(menuItem, (InterfaceC0412o) null, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m3257a(MenuItem menuItem, InterfaceC0412o interfaceC0412o, int i) {
        C0407j c0407j = (C0407j) menuItem;
        if (c0407j == null || !c0407j.isEnabled()) {
            return false;
        }
        boolean zM3299b = c0407j.m3299b();
        AbstractC0232c abstractC0232cMo1462a = c0407j.mo1462a();
        boolean z = abstractC0232cMo1462a != null && abstractC0232cMo1462a.mo1688e();
        if (c0407j.m3314n()) {
            boolean zExpandActionView = c0407j.expandActionView() | zM3299b;
            if (!zExpandActionView) {
                return zExpandActionView;
            }
            m3262b(true);
            return zExpandActionView;
        }
        if (!c0407j.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                m3262b(true);
            }
            return zM3299b;
        }
        if ((i & 4) == 0) {
            m3262b(false);
        }
        if (!c0407j.hasSubMenu()) {
            c0407j.m3294a(new SubMenuC0418u(m3273e(), this, c0407j));
        }
        SubMenuC0418u subMenuC0418u = (SubMenuC0418u) c0407j.getSubMenu();
        if (z) {
            abstractC0232cMo1462a.mo1683a(subMenuC0418u);
        }
        boolean zM3234a = m3234a(subMenuC0418u, interfaceC0412o) | zM3299b;
        if (zM3234a) {
            return zM3234a;
        }
        m3262b(true);
        return zM3234a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m3246a(0, 0, 0, this.f2520f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m3246a(i, i2, i3, this.f2520f.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m3246a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m3246a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2519e.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2520f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2520f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0407j c0407j = (C0407j) m3246a(i, i2, i3, charSequence);
        SubMenuC0418u subMenuC0418u = new SubMenuC0418u(this.f2519e, this, c0407j);
        c0407j.m3294a(subMenuC0418u);
        return subMenuC0418u;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public int m3258b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2524j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m3259b(Bundle bundle) {
        m3239f(bundle);
    }

    /* JADX INFO: renamed from: b */
    void m3260b(C0407j c0407j) {
        this.f2529o = true;
        mo208a(true);
    }

    /* JADX INFO: renamed from: b */
    public void m3261b(InterfaceC0412o interfaceC0412o) {
        for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
            InterfaceC0412o interfaceC0412o2 = weakReference.get();
            if (interfaceC0412o2 == null || interfaceC0412o2 == interfaceC0412o) {
                this.f2538x.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3262b(boolean z) {
        if (this.f2536v) {
            return;
        }
        this.f2536v = true;
        for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
            InterfaceC0412o interfaceC0412o = weakReference.get();
            if (interfaceC0412o == null) {
                this.f2538x.remove(weakReference);
            } else {
                interfaceC0412o.mo170a(this, z);
            }
        }
        this.f2536v = false;
    }

    /* JADX INFO: renamed from: b */
    boolean mo3263b() {
        return this.f2521g;
    }

    /* JADX INFO: renamed from: c */
    public int m3264c(int i) {
        return m3240a(i, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m3265c(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray<? extends Parcelable> sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray<? extends Parcelable> sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((SubMenuC0418u) item.getSubMenu()).m3265c(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3247a(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3266c(boolean z) {
        this.f2540z = z;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo3267c() {
        return this.f2522h;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo3268c(C0407j c0407j) {
        boolean zMo176a = false;
        if (!this.f2538x.isEmpty()) {
            m3276g();
            Iterator<WeakReference<InterfaceC0412o>> it = this.f2538x.iterator();
            while (true) {
                boolean z = zMo176a;
                if (!it.hasNext()) {
                    zMo176a = z;
                    break;
                }
                WeakReference<InterfaceC0412o> next = it.next();
                InterfaceC0412o interfaceC0412o = next.get();
                if (interfaceC0412o == null) {
                    this.f2538x.remove(next);
                    zMo176a = z;
                } else {
                    zMo176a = interfaceC0412o.mo176a(this, c0407j);
                    if (zMo176a) {
                        break;
                    }
                }
            }
            m3277h();
            if (zMo176a) {
                this.f2539y = c0407j;
            }
        }
        return zMo176a;
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.f2539y != null) {
            mo3272d(this.f2539y);
        }
        this.f2524j.clear();
        mo208a(true);
    }

    public void clearHeader() {
        this.f2517b = null;
        this.f2516a = null;
        this.f2518c = null;
        mo208a(false);
    }

    @Override // android.view.Menu
    public void close() {
        m3262b(true);
    }

    /* JADX INFO: renamed from: d */
    Resources m3269d() {
        return this.f2520f;
    }

    /* JADX INFO: renamed from: d */
    protected C0405h m3270d(int i) {
        m3232a(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m3271d(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo3247a());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0418u) item.getSubMenu()).m3271d(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: d */
    public boolean mo3272d(C0407j c0407j) {
        boolean zMo182b = false;
        if (!this.f2538x.isEmpty() && this.f2539y == c0407j) {
            m3276g();
            Iterator<WeakReference<InterfaceC0412o>> it = this.f2538x.iterator();
            while (true) {
                boolean z = zMo182b;
                if (!it.hasNext()) {
                    zMo182b = z;
                    break;
                }
                WeakReference<InterfaceC0412o> next = it.next();
                InterfaceC0412o interfaceC0412o = next.get();
                if (interfaceC0412o == null) {
                    this.f2538x.remove(next);
                    zMo182b = z;
                } else {
                    zMo182b = interfaceC0412o.mo182b(this, c0407j);
                    if (zMo182b) {
                        break;
                    }
                }
            }
            m3277h();
            if (zMo182b) {
                this.f2539y = null;
            }
        }
        return zMo182b;
    }

    /* JADX INFO: renamed from: e */
    public Context m3273e() {
        return this.f2519e;
    }

    /* JADX INFO: renamed from: e */
    protected C0405h m3274e(int i) {
        m3232a(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m3275f() {
        if (this.f2523i != null) {
            this.f2523i.mo424a(this);
        }
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0407j c0407j = this.f2524j.get(i2);
            if (c0407j.getItemId() == i) {
                return c0407j;
            }
            if (c0407j.hasSubMenu() && (menuItemFindItem = c0407j.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m3276g() {
        if (this.f2532r) {
            return;
        }
        this.f2532r = true;
        this.f2533s = false;
        this.f2534t = false;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f2524j.get(i);
    }

    /* JADX INFO: renamed from: h */
    public void m3277h() {
        this.f2532r = false;
        if (this.f2533s) {
            this.f2533s = false;
            mo208a(this.f2534t);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2540z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2524j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public ArrayList<C0407j> m3278i() {
        if (!this.f2526l) {
            return this.f2525k;
        }
        this.f2525k.clear();
        int size = this.f2524j.size();
        for (int i = 0; i < size; i++) {
            C0407j c0407j = this.f2524j.get(i);
            if (c0407j.isVisible()) {
                this.f2525k.add(c0407j);
            }
        }
        this.f2526l = false;
        this.f2529o = true;
        return this.f2525k;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3245a(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public void m3279j() {
        boolean zMo175a;
        ArrayList<C0407j> arrayListM3278i = m3278i();
        if (this.f2529o) {
            boolean z = false;
            for (WeakReference<InterfaceC0412o> weakReference : this.f2538x) {
                InterfaceC0412o interfaceC0412o = weakReference.get();
                if (interfaceC0412o == null) {
                    this.f2538x.remove(weakReference);
                    zMo175a = z;
                } else {
                    zMo175a = interfaceC0412o.mo175a() | z;
                }
                z = zMo175a;
            }
            if (z) {
                this.f2527m.clear();
                this.f2528n.clear();
                int size = arrayListM3278i.size();
                for (int i = 0; i < size; i++) {
                    C0407j c0407j = arrayListM3278i.get(i);
                    if (c0407j.m3310j()) {
                        this.f2527m.add(c0407j);
                    } else {
                        this.f2528n.add(c0407j);
                    }
                }
            } else {
                this.f2527m.clear();
                this.f2528n.clear();
                this.f2528n.addAll(m3278i());
            }
            this.f2529o = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public ArrayList<C0407j> m3280k() {
        m3279j();
        return this.f2527m;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList<C0407j> m3281l() {
        m3279j();
        return this.f2528n;
    }

    /* JADX INFO: renamed from: m */
    public CharSequence m3282m() {
        return this.f2516a;
    }

    /* JADX INFO: renamed from: n */
    public Drawable m3283n() {
        return this.f2517b;
    }

    /* JADX INFO: renamed from: o */
    public View m3284o() {
        return this.f2518c;
    }

    /* JADX INFO: renamed from: p */
    public C0405h mo3285p() {
        return this;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m3256a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0407j c0407jM3245a = m3245a(i, keyEvent);
        boolean zM3256a = c0407jM3245a != null ? m3256a(c0407jM3245a, i2) : false;
        if ((i2 & 2) != 0) {
            m3262b(true);
        }
        return zM3256a;
    }

    /* JADX INFO: renamed from: q */
    boolean m3286q() {
        return this.f2535u;
    }

    /* JADX INFO: renamed from: r */
    public C0407j m3287r() {
        return this.f2539y;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iM3264c = m3264c(i);
        if (iM3264c >= 0) {
            int size = this.f2524j.size() - iM3264c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f2524j.get(iM3264c).getGroupId() != i) {
                    break;
                }
                m3233a(iM3264c, false);
                i2 = i3;
            }
            mo208a(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m3233a(m3258b(i), true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2524j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0407j c0407j = this.f2524j.get(i2);
            if (c0407j.getGroupId() == i) {
                c0407j.m3296a(z2);
                c0407j.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2524j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0407j c0407j = this.f2524j.get(i2);
            if (c0407j.getGroupId() == i) {
                c0407j.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f2524j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0407j c0407j = this.f2524j.get(i2);
            i2++;
            z2 = (c0407j.getGroupId() == i && c0407j.m3301c(z)) ? true : z2;
        }
        if (z2) {
            mo208a(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2521g = z;
        mo208a(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2524j.size();
    }
}
