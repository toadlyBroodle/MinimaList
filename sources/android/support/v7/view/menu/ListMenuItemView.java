package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.C0498bi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0413p.a {

    /* JADX INFO: renamed from: a */
    private C0407j f2410a;

    /* JADX INFO: renamed from: b */
    private ImageView f2411b;

    /* JADX INFO: renamed from: c */
    private RadioButton f2412c;

    /* JADX INFO: renamed from: d */
    private TextView f2413d;

    /* JADX INFO: renamed from: e */
    private CheckBox f2414e;

    /* JADX INFO: renamed from: f */
    private TextView f2415f;

    /* JADX INFO: renamed from: g */
    private ImageView f2416g;

    /* JADX INFO: renamed from: h */
    private Drawable f2417h;

    /* JADX INFO: renamed from: i */
    private int f2418i;

    /* JADX INFO: renamed from: j */
    private Context f2419j;

    /* JADX INFO: renamed from: k */
    private boolean f2420k;

    /* JADX INFO: renamed from: l */
    private Drawable f2421l;

    /* JADX INFO: renamed from: m */
    private int f2422m;

    /* JADX INFO: renamed from: n */
    private LayoutInflater f2423n;

    /* JADX INFO: renamed from: o */
    private boolean f2424o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0498bi c0498biM4510a = C0498bi.m4510a(getContext(), attributeSet, C0333a.j.MenuView, i, 0);
        this.f2417h = c0498biM4510a.m4514a(C0333a.j.MenuView_android_itemBackground);
        this.f2418i = c0498biM4510a.m4527g(C0333a.j.MenuView_android_itemTextAppearance, -1);
        this.f2420k = c0498biM4510a.m4516a(C0333a.j.MenuView_preserveIconSpacing, false);
        this.f2419j = context;
        this.f2421l = c0498biM4510a.m4514a(C0333a.j.MenuView_subMenuArrow);
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: a */
    private void m3172a() {
        this.f2411b = (ImageView) getInflater().inflate(C0333a.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        addView(this.f2411b, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m3173c() {
        this.f2412c = (RadioButton) getInflater().inflate(C0333a.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.f2412c);
    }

    /* JADX INFO: renamed from: d */
    private void m3174d() {
        this.f2414e = (CheckBox) getInflater().inflate(C0333a.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.f2414e);
    }

    private LayoutInflater getInflater() {
        if (this.f2423n == null) {
            this.f2423n = LayoutInflater.from(getContext());
        }
        return this.f2423n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f2416g != null) {
            this.f2416g.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: a */
    public void mo155a(C0407j c0407j, int i) {
        this.f2410a = c0407j;
        this.f2422m = i;
        setVisibility(c0407j.isVisible() ? 0 : 8);
        setTitle(c0407j.m3293a((InterfaceC0413p.a) this));
        setCheckable(c0407j.isCheckable());
        m3175a(c0407j.m3306f(), c0407j.m3302d());
        setIcon(c0407j.getIcon());
        setEnabled(c0407j.isEnabled());
        setSubMenuArrowVisible(c0407j.hasSubMenu());
        setContentDescription(c0407j.getContentDescription());
    }

    /* JADX INFO: renamed from: a */
    public void m3175a(boolean z, char c) {
        int i = (z && this.f2410a.m3306f()) ? 0 : 8;
        if (i == 0) {
            this.f2415f.setText(this.f2410a.m3304e());
        }
        if (this.f2415f.getVisibility() != i) {
            this.f2415f.setVisibility(i);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: b */
    public boolean mo156b() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    public C0407j getItemData() {
        return this.f2410a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0246q.m1744a(this, this.f2417h);
        this.f2413d = (TextView) findViewById(C0333a.f.title);
        if (this.f2418i != -1) {
            this.f2413d.setTextAppearance(this.f2419j, this.f2418i);
        }
        this.f2415f = (TextView) findViewById(C0333a.f.shortcut);
        this.f2416g = (ImageView) findViewById(C0333a.f.submenuarrow);
        if (this.f2416g != null) {
            this.f2416g.setImageDrawable(this.f2421l);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2411b != null && this.f2420k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2411b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f2412c == null && this.f2414e == null) {
            return;
        }
        if (this.f2410a.m3307g()) {
            if (this.f2412c == null) {
                m3173c();
            }
            compoundButton = this.f2412c;
            compoundButton2 = this.f2414e;
        } else {
            if (this.f2414e == null) {
                m3174d();
            }
            compoundButton = this.f2414e;
            compoundButton2 = this.f2412c;
        }
        if (!z) {
            if (this.f2414e != null) {
                this.f2414e.setVisibility(8);
            }
            if (this.f2412c != null) {
                this.f2412c.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f2410a.isChecked());
        int i = z ? 0 : 8;
        if (compoundButton.getVisibility() != i) {
            compoundButton.setVisibility(i);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2410a.m3307g()) {
            if (this.f2412c == null) {
                m3173c();
            }
            compoundButton = this.f2412c;
        } else {
            if (this.f2414e == null) {
                m3174d();
            }
            compoundButton = this.f2414e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2424o = z;
        this.f2420k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2410a.m3309i() || this.f2424o;
        if (z || this.f2420k) {
            if (this.f2411b == null && drawable == null && !this.f2420k) {
                return;
            }
            if (this.f2411b == null) {
                m3172a();
            }
            if (drawable == null && !this.f2420k) {
                this.f2411b.setVisibility(8);
                return;
            }
            ImageView imageView = this.f2411b;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f2411b.getVisibility() != 0) {
                this.f2411b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2413d.getVisibility() != 8) {
                this.f2413d.setVisibility(8);
            }
        } else {
            this.f2413d.setText(charSequence);
            if (this.f2413d.getVisibility() != 0) {
                this.f2413d.setVisibility(0);
            }
        }
    }
}
