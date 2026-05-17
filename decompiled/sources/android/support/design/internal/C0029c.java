package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0025a;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.view.menu.SubMenuC0418u;
import android.support.v7.widget.C0484av;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.design.internal.c */
/* JADX INFO: loaded from: classes.dex */
public class C0029c implements InterfaceC0412o {

    /* JADX INFO: renamed from: a */
    LinearLayout f167a;

    /* JADX INFO: renamed from: b */
    C0405h f168b;

    /* JADX INFO: renamed from: c */
    b f169c;

    /* JADX INFO: renamed from: d */
    LayoutInflater f170d;

    /* JADX INFO: renamed from: e */
    int f171e;

    /* JADX INFO: renamed from: f */
    boolean f172f;

    /* JADX INFO: renamed from: g */
    ColorStateList f173g;

    /* JADX INFO: renamed from: h */
    ColorStateList f174h;

    /* JADX INFO: renamed from: i */
    Drawable f175i;

    /* JADX INFO: renamed from: j */
    int f176j;

    /* JADX INFO: renamed from: k */
    final View.OnClickListener f177k = new View.OnClickListener() { // from class: android.support.design.internal.c.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0029c.this.m181b(true);
            C0407j itemData = ((NavigationMenuItemView) view).getItemData();
            boolean zM3257a = C0029c.this.f168b.m3257a(itemData, C0029c.this, 0);
            if (itemData != null && itemData.isCheckable() && zM3257a) {
                C0029c.this.f169c.m197a(itemData);
            }
            C0029c.this.m181b(false);
            C0029c.this.mo174a(false);
        }
    };

    /* JADX INFO: renamed from: l */
    private NavigationMenuView f178l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0412o.a f179m;

    /* JADX INFO: renamed from: n */
    private int f180n;

    /* JADX INFO: renamed from: o */
    private int f181o;

    /* JADX INFO: renamed from: android.support.design.internal.c$a */
    private static class a extends j {
        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$b */
    private class b extends C0484av.a<j> {

        /* JADX INFO: renamed from: b */
        private final ArrayList<d> f184b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        private C0407j f185c;

        /* JADX INFO: renamed from: d */
        private boolean f186d;

        b() {
            m190f();
        }

        /* JADX INFO: renamed from: a */
        private void m189a(int i, int i2) {
            while (i < i2) {
                ((f) this.f184b.get(i)).f189a = true;
                i++;
            }
        }

        /* JADX INFO: renamed from: f */
        private void m190f() {
            boolean z;
            int size;
            int i;
            if (this.f186d) {
                return;
            }
            this.f186d = true;
            this.f184b.clear();
            this.f184b.add(new c());
            int i2 = -1;
            int i3 = 0;
            boolean z2 = false;
            int size2 = C0029c.this.f168b.m3278i().size();
            int i4 = 0;
            while (i4 < size2) {
                C0407j c0407j = C0029c.this.f168b.m3278i().get(i4);
                if (c0407j.isChecked()) {
                    m197a(c0407j);
                }
                if (c0407j.isCheckable()) {
                    c0407j.m3296a(false);
                }
                if (c0407j.hasSubMenu()) {
                    SubMenu subMenu = c0407j.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i4 != 0) {
                            this.f184b.add(new e(C0029c.this.f176j, 0));
                        }
                        this.f184b.add(new f(c0407j));
                        boolean z3 = false;
                        int size3 = this.f184b.size();
                        int size4 = subMenu.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            C0407j c0407j2 = (C0407j) subMenu.getItem(i5);
                            if (c0407j2.isVisible()) {
                                if (!z3 && c0407j2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (c0407j2.isCheckable()) {
                                    c0407j2.m3296a(false);
                                }
                                if (c0407j.isChecked()) {
                                    m197a(c0407j);
                                }
                                this.f184b.add(new f(c0407j2));
                            }
                        }
                        if (z3) {
                            m189a(size3, this.f184b.size());
                        }
                    }
                    i = i2;
                } else {
                    int groupId = c0407j.getGroupId();
                    if (groupId != i2) {
                        size = this.f184b.size();
                        z = c0407j.getIcon() != null;
                        if (i4 != 0) {
                            size++;
                            this.f184b.add(new e(C0029c.this.f176j, C0029c.this.f176j));
                        }
                    } else if (z2 || c0407j.getIcon() == null) {
                        z = z2;
                        size = i3;
                    } else {
                        z = true;
                        m189a(i3, this.f184b.size());
                        size = i3;
                    }
                    f fVar = new f(c0407j);
                    fVar.f189a = z;
                    this.f184b.add(fVar);
                    z2 = z;
                    i3 = size;
                    i = groupId;
                }
                i4++;
                i2 = i;
            }
            this.f186d = false;
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: a */
        public int mo191a() {
            return this.f184b.size();
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: a */
        public long mo192a(int i) {
            return i;
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j mo202b(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new g(C0029c.this.f170d, viewGroup, C0029c.this.f177k);
                case 1:
                    return new i(C0029c.this.f170d, viewGroup);
                case 2:
                    return new h(C0029c.this.f170d, viewGroup);
                case 3:
                    return new a(C0029c.this.f167a);
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m194a(Bundle bundle) {
            C0407j c0407jM207a;
            View actionView;
            C0031e c0031e;
            C0407j c0407jM207a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f186d = true;
                int size = this.f184b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    d dVar = this.f184b.get(i2);
                    if ((dVar instanceof f) && (c0407jM207a2 = ((f) dVar).m207a()) != null && c0407jM207a2.getItemId() == i) {
                        m197a(c0407jM207a2);
                        break;
                    }
                    i2++;
                }
                this.f186d = false;
                m190f();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f184b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d dVar2 = this.f184b.get(i3);
                    if ((dVar2 instanceof f) && (c0407jM207a = ((f) dVar2).m207a()) != null && (actionView = c0407jM207a.getActionView()) != null && (c0031e = (C0031e) sparseParcelableArray.get(c0407jM207a.getItemId())) != null) {
                        actionView.restoreHierarchyState(c0031e);
                    }
                }
            }
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo198a(j jVar) {
            if (jVar instanceof g) {
                ((NavigationMenuItemView) jVar.f3381a).m154a();
            }
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo199a(j jVar, int i) {
            switch (mo201b(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.f3381a;
                    navigationMenuItemView.setIconTintList(C0029c.this.f174h);
                    if (C0029c.this.f172f) {
                        navigationMenuItemView.setTextAppearance(C0029c.this.f171e);
                    }
                    if (C0029c.this.f173g != null) {
                        navigationMenuItemView.setTextColor(C0029c.this.f173g);
                    }
                    C0246q.m1744a(navigationMenuItemView, C0029c.this.f175i != null ? C0029c.this.f175i.getConstantState().newDrawable() : null);
                    f fVar = (f) this.f184b.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.f189a);
                    navigationMenuItemView.mo155a(fVar.m207a(), 0);
                    break;
                case 1:
                    ((TextView) jVar.f3381a).setText(((f) this.f184b.get(i)).m207a().getTitle());
                    break;
                case 2:
                    e eVar = (e) this.f184b.get(i);
                    jVar.f3381a.setPadding(0, eVar.m205a(), 0, eVar.m206b());
                    break;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m197a(C0407j c0407j) {
            if (this.f185c == c0407j || !c0407j.isCheckable()) {
                return;
            }
            if (this.f185c != null) {
                this.f185c.setChecked(false);
            }
            this.f185c = c0407j;
            c0407j.setChecked(true);
        }

        /* JADX INFO: renamed from: a */
        public void m200a(boolean z) {
            this.f186d = z;
        }

        @Override // android.support.v7.widget.C0484av.a
        /* JADX INFO: renamed from: b */
        public int mo201b(int i) {
            d dVar = this.f184b.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).m207a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* JADX INFO: renamed from: b */
        public void m203b() {
            m190f();
            m4163e();
        }

        /* JADX INFO: renamed from: c */
        public Bundle m204c() {
            Bundle bundle = new Bundle();
            if (this.f185c != null) {
                bundle.putInt("android:menu:checked", this.f185c.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f184b.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.f184b.get(i);
                if (dVar instanceof f) {
                    C0407j c0407jM207a = ((f) dVar).m207a();
                    View actionView = c0407jM207a != null ? c0407jM207a.getActionView() : null;
                    if (actionView != null) {
                        C0031e c0031e = new C0031e();
                        actionView.saveHierarchyState(c0031e);
                        sparseArray.put(c0407jM207a.getItemId(), c0031e);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$c */
    private static class c implements d {
        c() {
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$d */
    private interface d {
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$e */
    private static class e implements d {

        /* JADX INFO: renamed from: a */
        private final int f187a;

        /* JADX INFO: renamed from: b */
        private final int f188b;

        public e(int i, int i2) {
            this.f187a = i;
            this.f188b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m205a() {
            return this.f187a;
        }

        /* JADX INFO: renamed from: b */
        public int m206b() {
            return this.f188b;
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$f */
    private static class f implements d {

        /* JADX INFO: renamed from: a */
        boolean f189a;

        /* JADX INFO: renamed from: b */
        private final C0407j f190b;

        f(C0407j c0407j) {
            this.f190b = c0407j;
        }

        /* JADX INFO: renamed from: a */
        public C0407j m207a() {
            return this.f190b;
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$g */
    private static class g extends j {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0025a.h.design_navigation_item, viewGroup, false));
            this.f3381a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$h */
    private static class h extends j {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0025a.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$i */
    private static class i extends j {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0025a.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: android.support.design.internal.c$j */
    private static abstract class j extends C0484av.w {
        public j(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0413p m163a(ViewGroup viewGroup) {
        if (this.f178l == null) {
            this.f178l = (NavigationMenuView) this.f170d.inflate(C0025a.h.design_navigation_menu, viewGroup, false);
            if (this.f169c == null) {
                this.f169c = new b();
            }
            this.f167a = (LinearLayout) this.f170d.inflate(C0025a.h.design_navigation_item_header, (ViewGroup) this.f178l, false);
            this.f178l.setAdapter(this.f169c);
        }
        return this.f178l;
    }

    /* JADX INFO: renamed from: a */
    public void m164a(int i2) {
        this.f180n = i2;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo165a(Context context, C0405h c0405h) {
        this.f170d = LayoutInflater.from(context);
        this.f168b = c0405h;
        this.f176j = context.getResources().getDimensionPixelOffset(C0025a.d.design_navigation_separator_vertical_padding);
    }

    /* JADX INFO: renamed from: a */
    public void m166a(ColorStateList colorStateList) {
        this.f174h = colorStateList;
        mo174a(false);
    }

    /* JADX INFO: renamed from: a */
    public void m167a(Drawable drawable) {
        this.f175i = drawable;
        mo174a(false);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo168a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f178l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f169c.m194a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f167a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m169a(C0254y c0254y) {
        int iM1870b = c0254y.m1870b();
        if (this.f181o != iM1870b) {
            this.f181o = iM1870b;
            if (this.f167a.getChildCount() == 0) {
                this.f178l.setPadding(0, this.f181o, 0, this.f178l.getPaddingBottom());
            }
        }
        C0246q.m1752b(this.f167a, c0254y);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        if (this.f179m != null) {
            this.f179m.mo2706a(c0405h, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m171a(C0407j c0407j) {
        this.f169c.m197a(c0407j);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0412o.a aVar) {
        this.f179m = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m173a(View view) {
        this.f167a.addView(view);
        this.f178l.setPadding(0, 0, 0, this.f178l.getPaddingBottom());
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        if (this.f169c != null) {
            this.f169c.m203b();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo175a() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo176a(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo177a(SubMenuC0418u subMenuC0418u) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public int mo178b() {
        return this.f180n;
    }

    /* JADX INFO: renamed from: b */
    public View m179b(int i2) {
        View viewInflate = this.f170d.inflate(i2, (ViewGroup) this.f167a, false);
        m173a(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b */
    public void m180b(ColorStateList colorStateList) {
        this.f173g = colorStateList;
        mo174a(false);
    }

    /* JADX INFO: renamed from: b */
    public void m181b(boolean z) {
        if (this.f169c != null) {
            this.f169c.m200a(z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public boolean mo182b(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: c */
    public Parcelable mo183c() {
        if (Build.VERSION.SDK_INT < 11) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.f178l != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.f178l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f169c != null) {
            bundle.putBundle("android:menu:adapter", this.f169c.m204c());
        }
        if (this.f167a == null) {
            return bundle;
        }
        SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
        this.f167a.saveHierarchyState(sparseArray2);
        bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public void m184c(int i2) {
        this.f171e = i2;
        this.f172f = true;
        mo174a(false);
    }

    /* JADX INFO: renamed from: d */
    public int m185d() {
        return this.f167a.getChildCount();
    }

    /* JADX INFO: renamed from: e */
    public ColorStateList m186e() {
        return this.f174h;
    }

    /* JADX INFO: renamed from: f */
    public ColorStateList m187f() {
        return this.f173g;
    }

    /* JADX INFO: renamed from: g */
    public Drawable m188g() {
        return this.f175i;
    }
}
