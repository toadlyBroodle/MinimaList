package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.widget.C0481as;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v7.view.menu.t */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0417t extends AbstractC0410m implements InterfaceC0412o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    final C0481as f2603a;

    /* JADX INFO: renamed from: b */
    View f2604b;

    /* JADX INFO: renamed from: c */
    private final Context f2605c;

    /* JADX INFO: renamed from: d */
    private final C0405h f2606d;

    /* JADX INFO: renamed from: e */
    private final C0404g f2607e;

    /* JADX INFO: renamed from: f */
    private final boolean f2608f;

    /* JADX INFO: renamed from: g */
    private final int f2609g;

    /* JADX INFO: renamed from: h */
    private final int f2610h;

    /* JADX INFO: renamed from: i */
    private final int f2611i;

    /* JADX INFO: renamed from: l */
    private PopupWindow.OnDismissListener f2614l;

    /* JADX INFO: renamed from: m */
    private View f2615m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0412o.a f2616n;

    /* JADX INFO: renamed from: o */
    private ViewTreeObserver f2617o;

    /* JADX INFO: renamed from: p */
    private boolean f2618p;

    /* JADX INFO: renamed from: q */
    private boolean f2619q;

    /* JADX INFO: renamed from: r */
    private int f2620r;

    /* JADX INFO: renamed from: t */
    private boolean f2622t;

    /* JADX INFO: renamed from: j */
    private final ViewTreeObserver.OnGlobalLayoutListener f2612j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.t.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0417t.this.mo3214f() || ViewOnKeyListenerC0417t.this.f2603a.m3964c()) {
                return;
            }
            View view = ViewOnKeyListenerC0417t.this.f2604b;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0417t.this.mo3213e();
            } else {
                ViewOnKeyListenerC0417t.this.f2603a.mo3212d();
            }
        }
    };

    /* JADX INFO: renamed from: k */
    private final View.OnAttachStateChangeListener f2613k = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.t.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (ViewOnKeyListenerC0417t.this.f2617o != null) {
                if (!ViewOnKeyListenerC0417t.this.f2617o.isAlive()) {
                    ViewOnKeyListenerC0417t.this.f2617o = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0417t.this.f2617o.removeGlobalOnLayoutListener(ViewOnKeyListenerC0417t.this.f2612j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: s */
    private int f2621s = 0;

    public ViewOnKeyListenerC0417t(Context context, C0405h c0405h, View view, int i, int i2, boolean z) {
        this.f2605c = context;
        this.f2606d = c0405h;
        this.f2608f = z;
        this.f2607e = new C0404g(c0405h, LayoutInflater.from(context), this.f2608f);
        this.f2610h = i;
        this.f2611i = i2;
        Resources resources = context.getResources();
        this.f2609g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0333a.d.abc_config_prefDialogWidth));
        this.f2615m = view;
        this.f2603a = new C0481as(this.f2605c, null, this.f2610h, this.f2611i);
        c0405h.m3252a(this, context);
    }

    /* JADX INFO: renamed from: j */
    private boolean m3343j() {
        if (mo3214f()) {
            return true;
        }
        if (this.f2618p || this.f2615m == null) {
            return false;
        }
        this.f2604b = this.f2615m;
        this.f2603a.m3958a((PopupWindow.OnDismissListener) this);
        this.f2603a.m3956a((AdapterView.OnItemClickListener) this);
        this.f2603a.m3959a(true);
        View view = this.f2604b;
        boolean z = this.f2617o == null;
        this.f2617o = view.getViewTreeObserver();
        if (z) {
            this.f2617o.addOnGlobalLayoutListener(this.f2612j);
        }
        view.addOnAttachStateChangeListener(this.f2613k);
        this.f2603a.m3961b(view);
        this.f2603a.m3966e(this.f2621s);
        if (!this.f2619q) {
            this.f2620r = m3318a(this.f2607e, null, this.f2605c, this.f2609g);
            this.f2619q = true;
        }
        this.f2603a.m3968g(this.f2620r);
        this.f2603a.m3970h(2);
        this.f2603a.m3954a(m3322i());
        this.f2603a.mo3212d();
        ListView listViewG = this.f2603a.mo3215g();
        listViewG.setOnKeyListener(this);
        if (this.f2622t && this.f2606d.m3282m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2605c).inflate(C0333a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewG, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f2606d.m3282m());
            }
            frameLayout.setEnabled(false);
            listViewG.addHeaderView(frameLayout, null, false);
        }
        this.f2603a.mo3957a((ListAdapter) this.f2607e);
        this.f2603a.mo3212d();
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3204a(int i) {
        this.f2621s = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo168a(Parcelable parcelable) {
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3205a(C0405h c0405h) {
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        if (c0405h != this.f2606d) {
            return;
        }
        mo3213e();
        if (this.f2616n != null) {
            this.f2616n.mo2706a(c0405h, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0412o.a aVar) {
        this.f2616n = aVar;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3206a(View view) {
        this.f2615m = view;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: a */
    public void mo3207a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2614l = onDismissListener;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        this.f2619q = false;
        if (this.f2607e != null) {
            this.f2607e.notifyDataSetChanged();
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
        if (subMenuC0418u.hasVisibleItems()) {
            C0411n c0411n = new C0411n(this.f2605c, subMenuC0418u, this.f2604b, this.f2608f, this.f2610h, this.f2611i);
            c0411n.m3327a(this.f2616n);
            c0411n.m3330a(AbstractC0410m.m3320b(subMenuC0418u));
            c0411n.m3326a(this.f2621s);
            c0411n.m3329a(this.f2614l);
            this.f2614l = null;
            this.f2606d.m3262b(false);
            if (c0411n.m3331a(this.f2603a.m3973j(), this.f2603a.m3974k())) {
                if (this.f2616n != null) {
                    this.f2616n.mo2707a(subMenuC0418u);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: b */
    public void mo3208b(int i) {
        this.f2603a.m3963c(i);
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: b */
    public void mo3209b(boolean z) {
        this.f2607e.m3228a(z);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: c */
    public Parcelable mo183c() {
        return null;
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: c */
    public void mo3210c(int i) {
        this.f2603a.m3965d(i);
    }

    @Override // android.support.v7.view.menu.AbstractC0410m
    /* JADX INFO: renamed from: c */
    public void mo3211c(boolean z) {
        this.f2622t = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: d */
    public void mo3212d() {
        if (!m3343j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: e */
    public void mo3213e() {
        if (mo3214f()) {
            this.f2603a.mo3213e();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: f */
    public boolean mo3214f() {
        return !this.f2618p && this.f2603a.mo3214f();
    }

    @Override // android.support.v7.view.menu.InterfaceC0416s
    /* JADX INFO: renamed from: g */
    public ListView mo3215g() {
        return this.f2603a.mo3215g();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2618p = true;
        this.f2606d.close();
        if (this.f2617o != null) {
            if (!this.f2617o.isAlive()) {
                this.f2617o = this.f2604b.getViewTreeObserver();
            }
            this.f2617o.removeGlobalOnLayoutListener(this.f2612j);
            this.f2617o = null;
        }
        this.f2604b.removeOnAttachStateChangeListener(this.f2613k);
        if (this.f2614l != null) {
            this.f2614l.onDismiss();
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
