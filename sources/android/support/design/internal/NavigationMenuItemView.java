package android.support.design.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0025a;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v4.widget.C0329m;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.C0477ao;
import android.support.v7.widget.C0500bk;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends C0027a implements InterfaceC0413p.a {

    /* JADX INFO: renamed from: d */
    private static final int[] f145d = {R.attr.state_checked};

    /* JADX INFO: renamed from: c */
    boolean f146c;

    /* JADX INFO: renamed from: e */
    private final int f147e;

    /* JADX INFO: renamed from: f */
    private boolean f148f;

    /* JADX INFO: renamed from: g */
    private final CheckedTextView f149g;

    /* JADX INFO: renamed from: h */
    private FrameLayout f150h;

    /* JADX INFO: renamed from: i */
    private C0407j f151i;

    /* JADX INFO: renamed from: j */
    private ColorStateList f152j;

    /* JADX INFO: renamed from: k */
    private boolean f153k;

    /* JADX INFO: renamed from: l */
    private Drawable f154l;

    /* JADX INFO: renamed from: m */
    private final C0227b f155m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f155m = new C0227b() { // from class: android.support.design.internal.NavigationMenuItemView.1
            @Override // android.support.v4.p019j.C0227b
            /* JADX INFO: renamed from: a */
            public void mo157a(View view, C0224b c0224b) {
                super.mo157a(view, c0224b);
                c0224b.m1620a(NavigationMenuItemView.this.f146c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0025a.h.design_navigation_menu_item, (ViewGroup) this, true);
        this.f147e = context.getResources().getDimensionPixelSize(C0025a.d.design_navigation_icon_size);
        this.f149g = (CheckedTextView) findViewById(C0025a.f.design_menu_item_text);
        this.f149g.setDuplicateParentStateEnabled(true);
        C0246q.m1745a(this.f149g, this.f155m);
    }

    /* JADX INFO: renamed from: c */
    private boolean m151c() {
        return this.f151i.getTitle() == null && this.f151i.getIcon() == null && this.f151i.getActionView() != null;
    }

    /* JADX INFO: renamed from: d */
    private void m152d() {
        if (m151c()) {
            this.f149g.setVisibility(8);
            if (this.f150h != null) {
                C0477ao.a aVar = (C0477ao.a) this.f150h.getLayoutParams();
                aVar.width = -1;
                this.f150h.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f149g.setVisibility(0);
        if (this.f150h != null) {
            C0477ao.a aVar2 = (C0477ao.a) this.f150h.getLayoutParams();
            aVar2.width = -2;
            this.f150h.setLayoutParams(aVar2);
        }
    }

    /* JADX INFO: renamed from: e */
    private StateListDrawable m153e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0333a.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f145d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f150h == null) {
                this.f150h = (FrameLayout) ((ViewStub) findViewById(C0025a.f.design_menu_item_action_area_stub)).inflate();
            }
            this.f150h.removeAllViews();
            this.f150h.addView(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m154a() {
        if (this.f150h != null) {
            this.f150h.removeAllViews();
        }
        this.f149g.setCompoundDrawables(null, null, null, null);
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: a */
    public void mo155a(C0407j c0407j, int i) {
        this.f151i = c0407j;
        setVisibility(c0407j.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0246q.m1744a(this, m153e());
        }
        setCheckable(c0407j.isCheckable());
        setChecked(c0407j.isChecked());
        setEnabled(c0407j.isEnabled());
        setTitle(c0407j.getTitle());
        setIcon(c0407j.getIcon());
        setActionView(c0407j.getActionView());
        setContentDescription(c0407j.getContentDescription());
        C0500bk.m4540a(this, c0407j.getTooltipText());
        m152d();
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: b */
    public boolean mo156b() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    public C0407j getItemData() {
        return this.f151i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f151i != null && this.f151i.isCheckable() && this.f151i.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f145d);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f146c != z) {
            this.f146c = z;
            this.f155m.m1670a(this.f149g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f149g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f153k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0181a.m1400f(drawable).mutate();
                C0181a.m1390a(drawable, this.f152j);
            }
            drawable.setBounds(0, 0, this.f147e, this.f147e);
        } else if (this.f148f) {
            if (this.f154l == null) {
                this.f154l = C0173b.m1323a(getResources(), C0025a.e.navigation_empty_icon, getContext().getTheme());
                if (this.f154l != null) {
                    this.f154l.setBounds(0, 0, this.f147e, this.f147e);
                }
            }
            drawable = this.f154l;
        }
        C0329m.m2468a(this.f149g, drawable, null, null, null);
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f152j = colorStateList;
        this.f153k = this.f152j != null;
        if (this.f151i != null) {
            setIcon(this.f151i.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f148f = z;
    }

    public void setTextAppearance(int i) {
        C0329m.m2467a(this.f149g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f149g.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f149g.setText(charSequence);
    }
}
