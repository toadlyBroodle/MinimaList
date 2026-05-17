package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.C0387a;
import android.support.v7.view.menu.AbstractC0399b;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.C0411n;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.view.menu.InterfaceC0416s;
import android.support.v7.view.menu.SubMenuC0418u;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C0508d extends AbstractC0399b implements AbstractC0232c.a {

    /* JADX INFO: renamed from: A */
    private b f3531A;

    /* JADX INFO: renamed from: g */
    d f3532g;

    /* JADX INFO: renamed from: h */
    e f3533h;

    /* JADX INFO: renamed from: i */
    a f3534i;

    /* JADX INFO: renamed from: j */
    c f3535j;

    /* JADX INFO: renamed from: k */
    final f f3536k;

    /* JADX INFO: renamed from: l */
    int f3537l;

    /* JADX INFO: renamed from: m */
    private Drawable f3538m;

    /* JADX INFO: renamed from: n */
    private boolean f3539n;

    /* JADX INFO: renamed from: o */
    private boolean f3540o;

    /* JADX INFO: renamed from: p */
    private boolean f3541p;

    /* JADX INFO: renamed from: q */
    private int f3542q;

    /* JADX INFO: renamed from: r */
    private int f3543r;

    /* JADX INFO: renamed from: s */
    private int f3544s;

    /* JADX INFO: renamed from: t */
    private boolean f3545t;

    /* JADX INFO: renamed from: u */
    private boolean f3546u;

    /* JADX INFO: renamed from: v */
    private boolean f3547v;

    /* JADX INFO: renamed from: w */
    private boolean f3548w;

    /* JADX INFO: renamed from: x */
    private int f3549x;

    /* JADX INFO: renamed from: y */
    private final SparseBooleanArray f3550y;

    /* JADX INFO: renamed from: z */
    private View f3551z;

    /* JADX INFO: renamed from: android.support.v7.widget.d$a */
    private class a extends C0411n {
        public a(Context context, SubMenuC0418u subMenuC0418u, View view) {
            super(context, subMenuC0418u, view, false, C0333a.a.actionOverflowMenuStyle);
            if (!((C0407j) subMenuC0418u.getItem()).m3310j()) {
                m3328a(C0508d.this.f3532g == null ? (View) C0508d.this.f2452f : C0508d.this.f3532g);
            }
            m3327a(C0508d.this.f3536k);
        }

        @Override // android.support.v7.view.menu.C0411n
        /* JADX INFO: renamed from: e */
        protected void mo3335e() {
            C0508d.this.f3534i = null;
            C0508d.this.f3537l = 0;
            super.mo3335e();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$b */
    private class b extends ActionMenuItemView.AbstractC0397b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.AbstractC0397b
        /* JADX INFO: renamed from: a */
        public InterfaceC0416s mo3170a() {
            if (C0508d.this.f3534i != null) {
                return C0508d.this.f3534i.m3332b();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$c */
    private class c implements Runnable {

        /* JADX INFO: renamed from: b */
        private e f3555b;

        public c(e eVar) {
            this.f3555b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0508d.this.f2449c != null) {
                C0508d.this.f2449c.m3275f();
            }
            View view = (View) C0508d.this.f2452f;
            if (view != null && view.getWindowToken() != null && this.f3555b.m3333c()) {
                C0508d.this.f3533h = this.f3555b;
            }
            C0508d.this.f3535j = null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$d */
    private class d extends C0521q implements ActionMenuView.InterfaceC0426a {

        /* JADX INFO: renamed from: b */
        private final float[] f3557b;

        public d(Context context) {
            super(context, null, C0333a.a.actionOverflowButtonStyle);
            this.f3557b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0500bk.m4540a(this, getContentDescription());
            setOnTouchListener(new AbstractViewOnAttachStateChangeListenerC0474al(this) { // from class: android.support.v7.widget.d.d.1
                @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
                /* JADX INFO: renamed from: a */
                public InterfaceC0416s mo3168a() {
                    if (C0508d.this.f3533h == null) {
                        return null;
                    }
                    return C0508d.this.f3533h.m3332b();
                }

                @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
                /* JADX INFO: renamed from: b */
                public boolean mo3169b() {
                    C0508d.this.m4597f();
                    return true;
                }

                @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
                /* JADX INFO: renamed from: c */
                public boolean mo3909c() {
                    if (C0508d.this.f3535j != null) {
                        return false;
                    }
                    C0508d.this.m4598g();
                    return true;
                }
            });
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0426a
        /* JADX INFO: renamed from: c */
        public boolean mo3166c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0426a
        /* JADX INFO: renamed from: d */
        public boolean mo3167d() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                C0508d.this.m4597f();
            }
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0181a.m1389a(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$e */
    private class e extends C0411n {
        public e(Context context, C0405h c0405h, View view, boolean z) {
            super(context, c0405h, view, z, C0333a.a.actionOverflowMenuStyle);
            m3326a(8388613);
            m3327a(C0508d.this.f3536k);
        }

        @Override // android.support.v7.view.menu.C0411n
        /* JADX INFO: renamed from: e */
        protected void mo3335e() {
            if (C0508d.this.f2449c != null) {
                C0508d.this.f2449c.close();
            }
            C0508d.this.f3533h = null;
            super.mo3335e();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$f */
    private class f implements InterfaceC0412o.a {
        f() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public void mo2706a(C0405h c0405h, boolean z) {
            if (c0405h instanceof SubMenuC0418u) {
                c0405h.mo3285p().m3262b(false);
            }
            InterfaceC0412o.a aVarD = C0508d.this.m3188d();
            if (aVarD != null) {
                aVarD.mo2706a(c0405h, z);
            }
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public boolean mo2707a(C0405h c0405h) {
            if (c0405h == null) {
                return false;
            }
            C0508d.this.f3537l = ((SubMenuC0418u) c0405h).getItem().getItemId();
            InterfaceC0412o.a aVarD = C0508d.this.m3188d();
            return aVarD != null ? aVarD.mo2707a(c0405h) : false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: android.support.v7.widget.d.g.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        };

        /* JADX INFO: renamed from: a */
        public int f3562a;

        g() {
        }

        g(Parcel parcel) {
            this.f3562a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3562a);
        }
    }

    public C0508d(Context context) {
        super(context, C0333a.g.abc_action_menu_layout, C0333a.g.abc_action_menu_item_layout);
        this.f3550y = new SparseBooleanArray();
        this.f3536k = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private View m4585a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2452f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0413p.a) && ((InterfaceC0413p.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.AbstractC0399b
    /* JADX INFO: renamed from: a */
    public InterfaceC0413p mo3180a(ViewGroup viewGroup) {
        InterfaceC0413p interfaceC0413p = this.f2452f;
        InterfaceC0413p interfaceC0413pMo3180a = super.mo3180a(viewGroup);
        if (interfaceC0413p != interfaceC0413pMo3180a) {
            ((ActionMenuView) interfaceC0413pMo3180a).setPresenter(this);
        }
        return interfaceC0413pMo3180a;
    }

    @Override // android.support.v7.view.menu.AbstractC0399b
    /* JADX INFO: renamed from: a */
    public View mo3181a(C0407j c0407j, View view, ViewGroup viewGroup) {
        View actionView = c0407j.getActionView();
        if (actionView == null || c0407j.m3314n()) {
            actionView = super.mo3181a(c0407j, view, viewGroup);
        }
        actionView.setVisibility(c0407j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.AbstractC0399b, android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo165a(Context context, C0405h c0405h) {
        super.mo165a(context, c0405h);
        Resources resources = context.getResources();
        C0387a c0387aM3123a = C0387a.m3123a(context);
        if (!this.f3541p) {
            this.f3540o = c0387aM3123a.m3125b();
        }
        if (!this.f3547v) {
            this.f3542q = c0387aM3123a.m3126c();
        }
        if (!this.f3545t) {
            this.f3544s = c0387aM3123a.m3124a();
        }
        int measuredWidth = this.f3542q;
        if (this.f3540o) {
            if (this.f3532g == null) {
                this.f3532g = new d(this.f2447a);
                if (this.f3539n) {
                    this.f3532g.setImageDrawable(this.f3538m);
                    this.f3538m = null;
                    this.f3539n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3532g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3532g.getMeasuredWidth();
        } else {
            this.f3532g = null;
        }
        this.f3543r = measuredWidth;
        this.f3549x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f3551z = null;
    }

    /* JADX INFO: renamed from: a */
    public void m4591a(Configuration configuration) {
        if (!this.f3545t) {
            this.f3544s = C0387a.m3123a(this.f2448b).m3124a();
        }
        if (this.f2449c != null) {
            this.f2449c.mo208a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4592a(Drawable drawable) {
        if (this.f3532g != null) {
            this.f3532g.setImageDrawable(drawable);
        } else {
            this.f3539n = true;
            this.f3538m = drawable;
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo168a(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            if (gVar.f3562a <= 0 || (menuItemFindItem = this.f2449c.findItem(gVar.f3562a)) == null) {
                return;
            }
            mo177a((SubMenuC0418u) menuItemFindItem.getSubMenu());
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0399b, android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        m4599h();
        super.mo170a(c0405h, z);
    }

    @Override // android.support.v7.view.menu.AbstractC0399b
    /* JADX INFO: renamed from: a */
    public void mo3183a(C0407j c0407j, InterfaceC0413p.a aVar) {
        aVar.mo155a(c0407j, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2452f);
        if (this.f3531A == null) {
            this.f3531A = new b();
        }
        actionMenuItemView.setPopupCallback(this.f3531A);
    }

    /* JADX INFO: renamed from: a */
    public void m4593a(ActionMenuView actionMenuView) {
        this.f2452f = actionMenuView;
        actionMenuView.mo158a(this.f2449c);
    }

    @Override // android.support.v7.view.menu.AbstractC0399b, android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        boolean z2 = false;
        super.mo174a(z);
        ((View) this.f2452f).requestLayout();
        if (this.f2449c != null) {
            ArrayList<C0407j> arrayListM3280k = this.f2449c.m3280k();
            int size = arrayListM3280k.size();
            for (int i = 0; i < size; i++) {
                AbstractC0232c abstractC0232cMo1462a = arrayListM3280k.get(i).mo1462a();
                if (abstractC0232cMo1462a != null) {
                    abstractC0232cMo1462a.m1681a(this);
                }
            }
        }
        ArrayList<C0407j> arrayListM3281l = this.f2449c != null ? this.f2449c.m3281l() : null;
        if (this.f3540o && arrayListM3281l != null) {
            int size2 = arrayListM3281l.size();
            z2 = size2 == 1 ? !arrayListM3281l.get(0).isActionViewExpanded() : size2 > 0;
        }
        if (z2) {
            if (this.f3532g == null) {
                this.f3532g = new d(this.f2447a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3532g.getParent();
            if (viewGroup != this.f2452f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3532g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2452f;
                actionMenuView.addView(this.f3532g, actionMenuView.m3387c());
            }
        } else if (this.f3532g != null && this.f3532g.getParent() == this.f2452f) {
            ((ViewGroup) this.f2452f).removeView(this.f3532g);
        }
        ((ActionMenuView) this.f2452f).setOverflowReserved(this.f3540o);
    }

    @Override // android.support.v7.view.menu.AbstractC0399b, android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo175a() {
        int size;
        ArrayList<C0407j> arrayList;
        int i;
        int measuredWidth;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        if (this.f2449c != null) {
            ArrayList<C0407j> arrayListM3278i = this.f2449c.m3278i();
            size = arrayListM3278i.size();
            arrayList = arrayListM3278i;
        } else {
            size = 0;
            arrayList = null;
        }
        int i8 = this.f3544s;
        int i9 = this.f3543r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f2452f;
        int i10 = 0;
        int i11 = 0;
        boolean z3 = false;
        int i12 = 0;
        while (i12 < size) {
            C0407j c0407j = arrayList.get(i12);
            if (c0407j.m3312l()) {
                i10++;
            } else if (c0407j.m3311k()) {
                i11++;
            } else {
                z3 = true;
            }
            i12++;
            i8 = (this.f3548w && c0407j.isActionViewExpanded()) ? 0 : i8;
        }
        if (this.f3540o && (z3 || i10 + i11 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = this.f3550y;
        sparseBooleanArray.clear();
        int i14 = 0;
        if (this.f3546u) {
            i14 = i9 / this.f3549x;
            i = ((i9 % this.f3549x) / i14) + this.f3549x;
        } else {
            i = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int iM3377a = i14;
        while (i15 < size) {
            C0407j c0407j2 = arrayList.get(i15);
            if (c0407j2.m3312l()) {
                View viewMo3181a = mo3181a(c0407j2, this.f3551z, viewGroup);
                if (this.f3551z == null) {
                    this.f3551z = viewMo3181a;
                }
                if (this.f3546u) {
                    iM3377a -= ActionMenuView.m3377a(viewMo3181a, i, iM3377a, iMakeMeasureSpec, 0);
                } else {
                    viewMo3181a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                measuredWidth = viewMo3181a.getMeasuredWidth();
                int i17 = i9 - measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = c0407j2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0407j2.m3303d(true);
                i2 = i17;
                i3 = i13;
            } else if (c0407j2.m3311k()) {
                int groupId2 = c0407j2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i13 > 0 || z4) && i9 > 0 && (!this.f3546u || iM3377a > 0);
                if (z5) {
                    View viewMo3181a2 = mo3181a(c0407j2, this.f3551z, viewGroup);
                    if (this.f3551z == null) {
                        this.f3551z = viewMo3181a2;
                    }
                    if (this.f3546u) {
                        int iM3377a2 = ActionMenuView.m3377a(viewMo3181a2, i, iM3377a, iMakeMeasureSpec, 0);
                        int i18 = iM3377a - iM3377a2;
                        z2 = iM3377a2 == 0 ? false : z5;
                        i7 = i18;
                    } else {
                        viewMo3181a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        boolean z6 = z5;
                        i7 = iM3377a;
                        z2 = z6;
                    }
                    int measuredWidth2 = viewMo3181a2.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    if (this.f3546u) {
                        z = z2 & (i9 >= 0);
                        i4 = i16;
                        i5 = i7;
                    } else {
                        z = z2 & (i9 + i16 > 0);
                        i4 = i16;
                        i5 = i7;
                    }
                } else {
                    z = z5;
                    i4 = i16;
                    i5 = iM3377a;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i6 = i13;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i19 = i13;
                    for (int i20 = 0; i20 < i15; i20++) {
                        C0407j c0407j3 = arrayList.get(i20);
                        if (c0407j3.getGroupId() == groupId2) {
                            if (c0407j3.m3310j()) {
                                i19++;
                            }
                            c0407j3.m3303d(false);
                        }
                    }
                    i6 = i19;
                } else {
                    i6 = i13;
                }
                if (z) {
                    i6--;
                }
                c0407j2.m3303d(z);
                measuredWidth = i4;
                i2 = i9;
                int i21 = i5;
                i3 = i6;
                iM3377a = i21;
            } else {
                c0407j2.m3303d(false);
                measuredWidth = i16;
                i2 = i9;
                i3 = i13;
            }
            i15++;
            i9 = i2;
            i13 = i3;
            i16 = measuredWidth;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0399b
    /* JADX INFO: renamed from: a */
    public boolean mo3185a(int i, C0407j c0407j) {
        return c0407j.m3310j();
    }

    @Override // android.support.v7.view.menu.AbstractC0399b, android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo177a(SubMenuC0418u subMenuC0418u) {
        boolean z;
        if (!subMenuC0418u.hasVisibleItems()) {
            return false;
        }
        SubMenuC0418u subMenuC0418u2 = subMenuC0418u;
        while (subMenuC0418u2.m3344s() != this.f2449c) {
            subMenuC0418u2 = (SubMenuC0418u) subMenuC0418u2.m3344s();
        }
        View viewM4585a = m4585a(subMenuC0418u2.getItem());
        if (viewM4585a == null) {
            return false;
        }
        this.f3537l = subMenuC0418u.getItem().getItemId();
        int size = subMenuC0418u.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            MenuItem item = subMenuC0418u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f3534i = new a(this.f2448b, subMenuC0418u, viewM4585a);
        this.f3534i.m3330a(z);
        this.f3534i.m3325a();
        super.mo177a(subMenuC0418u);
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0399b
    /* JADX INFO: renamed from: a */
    public boolean mo3186a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f3532g) {
            return false;
        }
        return super.mo3186a(viewGroup, i);
    }

    @Override // android.support.v4.p019j.AbstractC0232c.a
    /* JADX INFO: renamed from: b */
    public void mo1690b(boolean z) {
        if (z) {
            super.mo177a((SubMenuC0418u) null);
        } else if (this.f2449c != null) {
            this.f2449c.m3262b(false);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: c */
    public Parcelable mo183c() {
        g gVar = new g();
        gVar.f3562a = this.f3537l;
        return gVar;
    }

    /* JADX INFO: renamed from: c */
    public void m4594c(boolean z) {
        this.f3540o = z;
        this.f3541p = true;
    }

    /* JADX INFO: renamed from: d */
    public void m4595d(boolean z) {
        this.f3548w = z;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m4596e() {
        if (this.f3532g != null) {
            return this.f3532g.getDrawable();
        }
        if (this.f3539n) {
            return this.f3538m;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4597f() {
        if (!this.f3540o || m4601j() || this.f2449c == null || this.f2452f == null || this.f3535j != null || this.f2449c.m3281l().isEmpty()) {
            return false;
        }
        this.f3535j = new c(new e(this.f2448b, this.f2449c, this.f3532g, true));
        ((View) this.f2452f).post(this.f3535j);
        super.mo177a((SubMenuC0418u) null);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4598g() {
        if (this.f3535j != null && this.f2452f != null) {
            ((View) this.f2452f).removeCallbacks(this.f3535j);
            this.f3535j = null;
            return true;
        }
        e eVar = this.f3533h;
        if (eVar == null) {
            return false;
        }
        eVar.m3334d();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4599h() {
        return m4598g() | m4600i();
    }

    /* JADX INFO: renamed from: i */
    public boolean m4600i() {
        if (this.f3534i == null) {
            return false;
        }
        this.f3534i.m3334d();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4601j() {
        return this.f3533h != null && this.f3533h.m3336f();
    }

    /* JADX INFO: renamed from: k */
    public boolean m4602k() {
        return this.f3535j != null || m4601j();
    }
}
