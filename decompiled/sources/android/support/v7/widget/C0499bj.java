package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0250u;
import android.support.v4.p019j.C0252w;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.menu.C0398a;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: android.support.v7.widget.bj */
/* JADX INFO: loaded from: classes.dex */
public class C0499bj implements InterfaceC0468af {

    /* JADX INFO: renamed from: a */
    Toolbar f3475a;

    /* JADX INFO: renamed from: b */
    CharSequence f3476b;

    /* JADX INFO: renamed from: c */
    Window.Callback f3477c;

    /* JADX INFO: renamed from: d */
    boolean f3478d;

    /* JADX INFO: renamed from: e */
    private int f3479e;

    /* JADX INFO: renamed from: f */
    private View f3480f;

    /* JADX INFO: renamed from: g */
    private View f3481g;

    /* JADX INFO: renamed from: h */
    private Drawable f3482h;

    /* JADX INFO: renamed from: i */
    private Drawable f3483i;

    /* JADX INFO: renamed from: j */
    private Drawable f3484j;

    /* JADX INFO: renamed from: k */
    private boolean f3485k;

    /* JADX INFO: renamed from: l */
    private CharSequence f3486l;

    /* JADX INFO: renamed from: m */
    private CharSequence f3487m;

    /* JADX INFO: renamed from: n */
    private C0508d f3488n;

    /* JADX INFO: renamed from: o */
    private int f3489o;

    /* JADX INFO: renamed from: p */
    private int f3490p;

    /* JADX INFO: renamed from: q */
    private Drawable f3491q;

    public C0499bj(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0333a.h.abc_action_bar_up_description, C0333a.e.abc_ic_ab_back_material);
    }

    public C0499bj(Toolbar toolbar, boolean z, int i, int i2) {
        this.f3489o = 0;
        this.f3490p = 0;
        this.f3475a = toolbar;
        this.f3476b = toolbar.getTitle();
        this.f3486l = toolbar.getSubtitle();
        this.f3485k = this.f3476b != null;
        this.f3484j = toolbar.getNavigationIcon();
        C0498bi c0498biM4510a = C0498bi.m4510a(toolbar.getContext(), null, C0333a.j.ActionBar, C0333a.a.actionBarStyle, 0);
        this.f3491q = c0498biM4510a.m4514a(C0333a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceM4520c = c0498biM4510a.m4520c(C0333a.j.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceM4520c)) {
                m4535b(charSequenceM4520c);
            }
            CharSequence charSequenceM4520c2 = c0498biM4510a.m4520c(C0333a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceM4520c2)) {
                m4537c(charSequenceM4520c2);
            }
            Drawable drawableM4514a = c0498biM4510a.m4514a(C0333a.j.ActionBar_logo);
            if (drawableM4514a != null) {
                m4536c(drawableM4514a);
            }
            Drawable drawableM4514a2 = c0498biM4510a.m4514a(C0333a.j.ActionBar_icon);
            if (drawableM4514a2 != null) {
                mo3815a(drawableM4514a2);
            }
            if (this.f3484j == null && this.f3491q != null) {
                mo3824b(this.f3491q);
            }
            mo3826c(c0498biM4510a.m4512a(C0333a.j.ActionBar_displayOptions, 0));
            int iM4527g = c0498biM4510a.m4527g(C0333a.j.ActionBar_customNavigationLayout, 0);
            if (iM4527g != 0) {
                m4534a(LayoutInflater.from(this.f3475a.getContext()).inflate(iM4527g, (ViewGroup) this.f3475a, false));
                mo3826c(this.f3479e | 16);
            }
            int iM4525f = c0498biM4510a.m4525f(C0333a.j.ActionBar_height, 0);
            if (iM4525f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3475a.getLayoutParams();
                layoutParams.height = iM4525f;
                this.f3475a.setLayoutParams(layoutParams);
            }
            int iM4521d = c0498biM4510a.m4521d(C0333a.j.ActionBar_contentInsetStart, -1);
            int iM4521d2 = c0498biM4510a.m4521d(C0333a.j.ActionBar_contentInsetEnd, -1);
            if (iM4521d >= 0 || iM4521d2 >= 0) {
                this.f3475a.m3716a(Math.max(iM4521d, 0), Math.max(iM4521d2, 0));
            }
            int iM4527g2 = c0498biM4510a.m4527g(C0333a.j.ActionBar_titleTextStyle, 0);
            if (iM4527g2 != 0) {
                this.f3475a.m3717a(this.f3475a.getContext(), iM4527g2);
            }
            int iM4527g3 = c0498biM4510a.m4527g(C0333a.j.ActionBar_subtitleTextStyle, 0);
            if (iM4527g3 != 0) {
                this.f3475a.m3721b(this.f3475a.getContext(), iM4527g3);
            }
            int iM4527g4 = c0498biM4510a.m4527g(C0333a.j.ActionBar_popupTheme, 0);
            if (iM4527g4 != 0) {
                this.f3475a.setPopupTheme(iM4527g4);
            }
        } else {
            this.f3479e = m4530r();
        }
        c0498biM4510a.m4515a();
        m4539f(i);
        this.f3487m = this.f3475a.getNavigationContentDescription();
        this.f3475a.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.bj.1

            /* JADX INFO: renamed from: a */
            final C0398a f3492a;

            {
                this.f3492a = new C0398a(C0499bj.this.f3475a.getContext(), 0, R.id.home, 0, 0, C0499bj.this.f3476b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0499bj.this.f3477c == null || !C0499bj.this.f3478d) {
                    return;
                }
                C0499bj.this.f3477c.onMenuItemSelected(0, this.f3492a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m4529e(CharSequence charSequence) {
        this.f3476b = charSequence;
        if ((this.f3479e & 8) != 0) {
            this.f3475a.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: r */
    private int m4530r() {
        if (this.f3475a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3491q = this.f3475a.getNavigationIcon();
        return 15;
    }

    /* JADX INFO: renamed from: s */
    private void m4531s() {
        Drawable drawable = null;
        if ((this.f3479e & 2) != 0) {
            drawable = ((this.f3479e & 1) == 0 || this.f3483i == null) ? this.f3482h : this.f3483i;
        }
        this.f3475a.setLogo(drawable);
    }

    /* JADX INFO: renamed from: t */
    private void m4532t() {
        if ((this.f3479e & 4) != 0) {
            this.f3475a.setNavigationIcon(this.f3484j != null ? this.f3484j : this.f3491q);
        } else {
            this.f3475a.setNavigationIcon((Drawable) null);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m4533u() {
        if ((this.f3479e & 4) != 0) {
            if (TextUtils.isEmpty(this.f3487m)) {
                this.f3475a.setNavigationContentDescription(this.f3490p);
            } else {
                this.f3475a.setNavigationContentDescription(this.f3487m);
            }
        }
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public C0250u mo3812a(final int i, long j) {
        return C0246q.m1765k(this.f3475a).m1853a(i == 0 ? 1.0f : 0.0f).m1854a(j).m1855a(new C0252w() { // from class: android.support.v7.widget.bj.2

            /* JADX INFO: renamed from: c */
            private boolean f3496c = false;

            @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
            /* JADX INFO: renamed from: a */
            public void mo1862a(View view) {
                C0499bj.this.f3475a.setVisibility(0);
            }

            @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
            /* JADX INFO: renamed from: b */
            public void mo1863b(View view) {
                if (this.f3496c) {
                    return;
                }
                C0499bj.this.f3475a.setVisibility(i);
            }

            @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
            /* JADX INFO: renamed from: c */
            public void mo1864c(View view) {
                this.f3496c = true;
            }
        });
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public ViewGroup mo3813a() {
        return this.f3475a;
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3814a(int i) {
        mo3815a(i != 0 ? C0366b.m2790b(mo3822b(), i) : null);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3815a(Drawable drawable) {
        this.f3482h = drawable;
        m4531s();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3816a(InterfaceC0412o.a aVar, C0405h.a aVar2) {
        this.f3475a.m3719a(aVar, aVar2);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3817a(C0490ba c0490ba) {
        if (this.f3480f != null && this.f3480f.getParent() == this.f3475a) {
            this.f3475a.removeView(this.f3480f);
        }
        this.f3480f = c0490ba;
        if (c0490ba == null || this.f3489o != 2) {
            return;
        }
        this.f3475a.addView(this.f3480f, 0);
        Toolbar.C0458b c0458b = (Toolbar.C0458b) this.f3480f.getLayoutParams();
        c0458b.width = -2;
        c0458b.height = -2;
        c0458b.f1900a = 8388691;
        c0490ba.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3818a(Menu menu, InterfaceC0412o.a aVar) {
        if (this.f3488n == null) {
            this.f3488n = new C0508d(this.f3475a.getContext());
            this.f3488n.m3182a(C0333a.f.action_menu_presenter);
        }
        this.f3488n.mo172a(aVar);
        this.f3475a.m3718a((C0405h) menu, this.f3488n);
    }

    /* JADX INFO: renamed from: a */
    public void m4534a(View view) {
        if (this.f3481g != null && (this.f3479e & 16) != 0) {
            this.f3475a.removeView(this.f3481g);
        }
        this.f3481g = view;
        if (view == null || (this.f3479e & 16) == 0) {
            return;
        }
        this.f3475a.addView(this.f3481g);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3819a(Window.Callback callback) {
        this.f3477c = callback;
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3820a(CharSequence charSequence) {
        if (this.f3485k) {
            return;
        }
        m4529e(charSequence);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: a */
    public void mo3821a(boolean z) {
        this.f3475a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: b */
    public Context mo3822b() {
        return this.f3475a.getContext();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: b */
    public void mo3823b(int i) {
        m4536c(i != 0 ? C0366b.m2790b(mo3822b(), i) : null);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: b */
    public void mo3824b(Drawable drawable) {
        this.f3484j = drawable;
        m4532t();
    }

    /* JADX INFO: renamed from: b */
    public void m4535b(CharSequence charSequence) {
        this.f3485k = true;
        m4529e(charSequence);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: b */
    public void mo3825b(boolean z) {
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: c */
    public void mo3826c(int i) {
        int i2 = this.f3479e ^ i;
        this.f3479e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4533u();
                }
                m4532t();
            }
            if ((i2 & 3) != 0) {
                m4531s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3475a.setTitle(this.f3476b);
                    this.f3475a.setSubtitle(this.f3486l);
                } else {
                    this.f3475a.setTitle((CharSequence) null);
                    this.f3475a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || this.f3481g == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f3475a.addView(this.f3481g);
            } else {
                this.f3475a.removeView(this.f3481g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4536c(Drawable drawable) {
        this.f3483i = drawable;
        m4531s();
    }

    /* JADX INFO: renamed from: c */
    public void m4537c(CharSequence charSequence) {
        this.f3486l = charSequence;
        if ((this.f3479e & 8) != 0) {
            this.f3475a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: c */
    public boolean mo3827c() {
        return this.f3475a.m3727g();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: d */
    public void mo3828d() {
        this.f3475a.m3728h();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: d */
    public void mo3829d(int i) {
        m4538d(i == 0 ? null : mo3822b().getString(i));
    }

    /* JADX INFO: renamed from: d */
    public void m4538d(CharSequence charSequence) {
        this.f3487m = charSequence;
        m4533u();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: e */
    public CharSequence mo3830e() {
        return this.f3475a.getTitle();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: e */
    public void mo3831e(int i) {
        this.f3475a.setVisibility(i);
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: f */
    public void mo3832f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* JADX INFO: renamed from: f */
    public void m4539f(int i) {
        if (i == this.f3490p) {
            return;
        }
        this.f3490p = i;
        if (TextUtils.isEmpty(this.f3475a.getNavigationContentDescription())) {
            mo3829d(this.f3490p);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: g */
    public void mo3833g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: h */
    public boolean mo3834h() {
        return this.f3475a.m3720a();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: i */
    public boolean mo3835i() {
        return this.f3475a.m3722b();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: j */
    public boolean mo3836j() {
        return this.f3475a.m3723c();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: k */
    public boolean mo3837k() {
        return this.f3475a.m3724d();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: l */
    public boolean mo3838l() {
        return this.f3475a.m3725e();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: m */
    public void mo3839m() {
        this.f3478d = true;
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: n */
    public void mo3840n() {
        this.f3475a.m3726f();
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: o */
    public int mo3841o() {
        return this.f3479e;
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: p */
    public int mo3842p() {
        return this.f3489o;
    }

    @Override // android.support.v7.widget.InterfaceC0468af
    /* JADX INFO: renamed from: q */
    public Menu mo3843q() {
        return this.f3475a.getMenu();
    }
}
