package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.widget.C0481as;
import android.support.v7.widget.InterfaceC0480ar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0402e extends AbstractC0410m implements InterfaceC0412o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    final Handler f2461a;

    /* JADX INFO: renamed from: c */
    View f2463c;

    /* JADX INFO: renamed from: d */
    boolean f2464d;

    /* JADX INFO: renamed from: e */
    private final Context f2465e;

    /* JADX INFO: renamed from: f */
    private final int f2466f;

    /* JADX INFO: renamed from: g */
    private final int f2467g;

    /* JADX INFO: renamed from: h */
    private final int f2468h;

    /* JADX INFO: renamed from: i */
    private final boolean f2469i;

    /* JADX INFO: renamed from: p */
    private View f2476p;

    /* JADX INFO: renamed from: r */
    private boolean f2478r;

    /* JADX INFO: renamed from: s */
    private boolean f2479s;

    /* JADX INFO: renamed from: t */
    private int f2480t;

    /* JADX INFO: renamed from: u */
    private int f2481u;

    /* JADX INFO: renamed from: w */
    private boolean f2483w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0412o.a f2484x;

    /* JADX INFO: renamed from: y */
    private ViewTreeObserver f2485y;

    /* JADX INFO: renamed from: z */
    private PopupWindow.OnDismissListener f2486z;

    /* JADX INFO: renamed from: j */
    private final List<C0405h> f2470j = new LinkedList();

    /* JADX INFO: renamed from: b */
    final List<a> f2462b = new ArrayList();

    /* JADX INFO: renamed from: k */
    private final ViewTreeObserver.OnGlobalLayoutListener f2471k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.e.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0402e.this.mo3214f() || ViewOnKeyListenerC0402e.this.f2462b.size() <= 0 || ViewOnKeyListenerC0402e.this.f2462b.get(0).f2494a.m3964c()) {
                return;
            }
            View view = ViewOnKeyListenerC0402e.this.f2463c;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0402e.this.mo3213e();
                return;
            }
            Iterator<a> it = ViewOnKeyListenerC0402e.this.f2462b.iterator();
            while (it.hasNext()) {
                it.next().f2494a.mo3212d();
            }
        }
    };

    /* JADX INFO: renamed from: l */
    private final View.OnAttachStateChangeListener f2472l = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.e.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (ViewOnKeyListenerC0402e.this.f2485y != null) {
                if (!ViewOnKeyListenerC0402e.this.f2485y.isAlive()) {
                    ViewOnKeyListenerC0402e.this.f2485y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0402e.this.f2485y.removeGlobalOnLayoutListener(ViewOnKeyListenerC0402e.this.f2471k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: m */
    private final InterfaceC0480ar f2473m = new InterfaceC0480ar() { // from class: android.support.v7.view.menu.e.3
        @Override // android.support.v7.widget.InterfaceC0480ar
        /* JADX INFO: renamed from: a */
        public void mo3217a(C0405h c0405h, MenuItem menuItem) {
            ViewOnKeyListenerC0402e.this.f2461a.removeCallbacksAndMessages(c0405h);
        }

        @Override // android.support.v7.widget.InterfaceC0480ar
        /* JADX INFO: renamed from: b */
        public void mo3218b(final C0405h c0405h, final MenuItem menuItem) {
            int i;
            ViewOnKeyListenerC0402e.this.f2461a.removeCallbacksAndMessages(null);
            int i2 = 0;
            int size = ViewOnKeyListenerC0402e.this.f2462b.size();
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                } else {
                    if (c0405h == ViewOnKeyListenerC0402e.this.f2462b.get(i2).f2495b) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            if (i == -1) {
                return;
            }
            int i3 = i + 1;
            final a aVar = i3 < ViewOnKeyListenerC0402e.this.f2462b.size() ? ViewOnKeyListenerC0402e.this.f2462b.get(i3) : null;
            ViewOnKeyListenerC0402e.this.f2461a.postAtTime(new Runnable() { // from class: android.support.v7.view.menu.e.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null) {
                        ViewOnKeyListenerC0402e.this.f2464d = true;
                        aVar.f2495b.m3262b(false);
                        ViewOnKeyListenerC0402e.this.f2464d = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        c0405h.m3256a(menuItem, 4);
                    }
                }
            }, c0405h, SystemClock.uptimeMillis() + 200);
        }
    };

    /* JADX INFO: renamed from: n */
    private int f2474n = 0;

    /* JADX INFO: renamed from: o */
    private int f2475o = 0;

    /* JADX INFO: renamed from: v */
    private boolean f2482v = false;

    /* JADX INFO: renamed from: q */
    private int f2477q = m3203k();

    /* JADX INFO: renamed from: android.support.v7.view.menu.e$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        public final C0481as f2494a;

        /* JADX INFO: renamed from: b */
        public final C0405h f2495b;

        /* JADX INFO: renamed from: c */
        public final int f2496c;

        public a(C0481as c0481as, C0405h c0405h, int i) {
            this.f2494a = c0481as;
            this.f2495b = c0405h;
            this.f2496c = i;
        }

        /* JADX INFO: renamed from: a */
        public ListView m3219a() {
            return this.f2494a.mo3215g();
        }
    }

    public ViewOnKeyListenerC0402e(Context context, View view, int i, int i2, boolean z) {
        this.f2465e = context;
        this.f2476p = view;
        this.f2467g = i;
        this.f2468h = i2;
        this.f2469i = z;
        Resources resources = context.getResources();
        this.f2466f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0333a.d.abc_config_prefDialogWidth));
        this.f2461a = new Handler();
    }

    /* JADX INFO: renamed from: a */
    private MenuItem m3194a(C0405h c0405h, C0405h c0405h2) {
        int size = c0405h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0405h.getItem(i);
            if (item.hasSubMenu() && c0405h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private View m3195a(a aVar, C0405h c0405h) {
        C0404g c0404g;
        int headersCount;
        int i;
        int i2 = 0;
        MenuItem menuItemM3194a = m3194a(aVar.f2495b, c0405h);
        if (menuItemM3194a == null) {
            return null;
        }
        ListView listViewM3219a = aVar.m3219a();
        ListAdapter adapter = listViewM3219a.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0404g = (C0404g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0404g = (C0404g) adapter;
            headersCount = 0;
        }
        int count = c0404g.getCount();
        while (true) {
            if (i2 >= count) {
                i = -1;
                break;
            }
            if (menuItemM3194a == c0404g.getItem(i2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return null;
        }
        int firstVisiblePosition = (i + headersCount) - listViewM3219a.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= listViewM3219a.getChildCount()) {
            return null;
        }
        return listViewM3219a.getChildAt(firstVisiblePosition);
    }

    /* JADX INFO: renamed from: c */
    private void m3199c(C0405h c0405h) {
        View viewM3195a;
        a aVar;
        int i;
        int i2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2465e);
        C0404g c0404g = new C0404g(c0405h, layoutInflaterFrom, this.f2469i);
        if (!mo3214f() && this.f2482v) {
            c0404g.m3228a(true);
        } else if (mo3214f()) {
            c0404g.m3228a(AbstractC0410m.m3320b(c0405h));
        }
        int iA = m3318a(c0404g, null, this.f2465e, this.f2466f);
        C0481as c0481asM3202j = m3202j();
        c0481asM3202j.mo3957a((ListAdapter) c0404g);
        c0481asM3202j.m3968g(iA);
        c0481asM3202j.m3966e(this.f2475o);
        if (this.f2462b.size() > 0) {
            a aVar2 = this.f2462b.get(this.f2462b.size() - 1);
            viewM3195a = m3195a(aVar2, c0405h);
            aVar = aVar2;
        } else {
            viewM3195a = null;
            aVar = null;
        }
        if (viewM3195a != null) {
            c0481asM3202j.m3989c(false);
            c0481asM3202j.m3987a((Object) null);
            int iM3200d = m3200d(iA);
            boolean z = iM3200d == 1;
            this.f2477q = iM3200d;
            if (Build.VERSION.SDK_INT >= 26) {
                c0481asM3202j.m3961b(viewM3195a);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2476p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM3195a.getLocationOnScreen(iArr2);
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            c0481asM3202j.m3963c((this.f2475o & 5) == 5 ? z ? i + iA : i - viewM3195a.getWidth() : z ? viewM3195a.getWidth() + i : i - iA);
            c0481asM3202j.m3962b(true);
            c0481asM3202j.m3965d(i2);
        } else {
            if (this.f2478r) {
                c0481asM3202j.m3963c(this.f2480t);
            }
            if (this.f2479s) {
                c0481asM3202j.m3965d(this.f2481u);
            }
            c0481asM3202j.m3954a(m3322i());
        }
        this.f2462b.add(new a(c0481asM3202j, c0405h, this.f2477q));
        c0481asM3202j.mo3212d();
        ListView listViewG = c0481asM3202j.mo3215g();
        listViewG.setOnKeyListener(this);
        if (aVar == null && this.f2483w && c0405h.m3282m() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0333a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewG, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0405h.m3282m());
            listViewG.addHeaderView(frameLayout, null, false);
            c0481asM3202j.mo3212d();
        }
    }

    /* JADX INFO: renamed from: d */
    private int m3200d(int i) {
        ListView listViewM3219a = this.f2462b.get(this.f2462b.size() - 1).m3219a();
        int[] iArr = new int[2];
        listViewM3219a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2463c.getWindowVisibleDisplayFrame(rect);
        if (this.f2477q == 1) {
            return (listViewM3219a.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    private int m3201d(C0405h c0405h) {
        int size = this.f2462b.size();
        for (int i = 0; i < size; i++) {
            if (c0405h == this.f2462b.get(i).f2495b) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    private C0481as m3202j() {
        C0481as c0481as = new C0481as(this.f2465e, null, this.f2467g, this.f2468h);
        c0481as.m3986a(this.f2473m);
        c0481as.m3956a((AdapterView.OnItemClickListener) this);
        c0481as.m3958a((PopupWindow.OnDismissListener) this);
        c0481as.m3961b(this.f2476p);
        c0481as.m3966e(this.f2475o);
        c0481as.m3959a(true);
        c0481as.m3970h(2);
        return c0481as;
    }

    /* JADX INFO: renamed from: k */
    private int m3203k() {
        return C0246q.m1759e(this.f2476p) == 1 ? 0 : 1;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3204a(int i) {
        if (this.f2474n != i) {
            this.f2474n = i;
            this.f2475o = C0233d.m1692a(i, C0246q.m1759e(this.f2476p));
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo168a(Parcelable parcelable) {
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3205a(C0405h c0405h) {
        c0405h.m3252a(this, this.f2465e);
        if (mo3214f()) {
            m3199c(c0405h);
        } else {
            this.f2470j.add(c0405h);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        int iM3201d = m3201d(c0405h);
        if (iM3201d < 0) {
            return;
        }
        int i = iM3201d + 1;
        if (i < this.f2462b.size()) {
            this.f2462b.get(i).f2495b.m3262b(false);
        }
        a aVarRemove = this.f2462b.remove(iM3201d);
        aVarRemove.f2495b.m3261b(this);
        if (this.f2464d) {
            aVarRemove.f2494a.m3988b((Object) null);
            aVarRemove.f2494a.m3960b(0);
        }
        aVarRemove.f2494a.mo3213e();
        int size = this.f2462b.size();
        if (size > 0) {
            this.f2477q = this.f2462b.get(size - 1).f2496c;
        } else {
            this.f2477q = m3203k();
        }
        if (size != 0) {
            if (z) {
                this.f2462b.get(0).f2495b.m3262b(false);
                return;
            }
            return;
        }
        mo3213e();
        if (this.f2484x != null) {
            this.f2484x.mo2706a(c0405h, true);
        }
        if (this.f2485y != null) {
            if (this.f2485y.isAlive()) {
                this.f2485y.removeGlobalOnLayoutListener(this.f2471k);
            }
            this.f2485y = null;
        }
        this.f2463c.removeOnAttachStateChangeListener(this.f2472l);
        this.f2486z.onDismiss();
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0412o.a aVar) {
        this.f2484x = aVar;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3206a(View view) {
        if (this.f2476p != view) {
            this.f2476p = view;
            this.f2475o = C0233d.m1692a(this.f2474n, C0246q.m1759e(this.f2476p));
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3207a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2486z = onDismissListener;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        Iterator<a> it = this.f2462b.iterator();
        while (it.hasNext()) {
            m3319a(it.next().m3219a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo175a() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo177a(SubMenuC0418u subMenuC0418u) {
        for (a aVar : this.f2462b) {
            if (subMenuC0418u == aVar.f2495b) {
                aVar.m3219a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0418u.hasVisibleItems()) {
            return false;
        }
        mo3205a((C0405h) subMenuC0418u);
        if (this.f2484x != null) {
            this.f2484x.mo2707a(subMenuC0418u);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: b */
    public void mo3208b(int i) {
        this.f2478r = true;
        this.f2480t = i;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: b */
    public void mo3209b(boolean z) {
        this.f2482v = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: c */
    public Parcelable mo183c() {
        return null;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: c */
    public void mo3210c(int i) {
        this.f2479s = true;
        this.f2481u = i;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: c */
    public void mo3211c(boolean z) {
        this.f2483w = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: d */
    public void mo3212d() {
        if (mo3214f()) {
            return;
        }
        Iterator<C0405h> it = this.f2470j.iterator();
        while (it.hasNext()) {
            m3199c(it.next());
        }
        this.f2470j.clear();
        this.f2463c = this.f2476p;
        if (this.f2463c != null) {
            boolean z = this.f2485y == null;
            this.f2485y = this.f2463c.getViewTreeObserver();
            if (z) {
                this.f2485y.addOnGlobalLayoutListener(this.f2471k);
            }
            this.f2463c.addOnAttachStateChangeListener(this.f2472l);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: e */
    public void mo3213e() {
        int size = this.f2462b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.f2462b.toArray(new a[size]);
            for (int i = size - 1; i >= 0; i--) {
                a aVar = aVarArr[i];
                if (aVar.f2494a.mo3214f()) {
                    aVar.f2494a.mo3213e();
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: f */
    public boolean mo3214f() {
        return this.f2462b.size() > 0 && this.f2462b.get(0).f2494a.mo3214f();
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: g */
    public ListView mo3215g() {
        if (this.f2462b.isEmpty()) {
            return null;
        }
        return this.f2462b.get(this.f2462b.size() - 1).m3219a();
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: h */
    protected boolean mo3216h() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        int size = this.f2462b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f2462b.get(i);
            if (!aVar.f2494a.mo3214f()) {
                break;
            } else {
                i++;
            }
        }
        if (aVar != null) {
            aVar.f2495b.m3262b(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3213e();
        return true;
    }
}
