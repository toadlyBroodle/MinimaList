package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.C0322f;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0550b;

/* JADX INFO: loaded from: classes.dex */
public class DrawerCustomLayout extends C0322f {

    /* JADX INFO: renamed from: c */
    ActMain f3727c;

    /* JADX INFO: renamed from: d */
    InterfaceC0550b f3728d;

    /* JADX INFO: renamed from: e */
    NavigationView f3729e;

    /* JADX INFO: renamed from: f */
    Menu f3730f;

    /* JADX INFO: renamed from: g */
    SubMenu f3731g;

    public DrawerCustomLayout(Context context) {
        super(context);
        m4796a(context);
    }

    public DrawerCustomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4796a(context);
    }

    public DrawerCustomLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4796a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m4796a(Context context) {
        this.f3728d = (InterfaceC0550b) context;
        this.f3727c = this.f3728d.mo4774l();
    }

    /* JADX INFO: renamed from: c */
    static int m4797c(C0563j c0563j) {
        return c0563j.mo4848ae().hashCode();
    }

    /* JADX INFO: renamed from: a */
    void m4798a(C0563j c0563j) {
        int iM4797c = m4797c(c0563j);
        this.f3731g.add(0, iM4797c, this.f3731g.size() - 1, c0563j.mo4848ae());
        this.f3731g.findItem(iM4797c).setIcon(R.drawable.ic_action_minimalist_drawer_logo);
    }

    /* JADX INFO: renamed from: b */
    void m4799b(C0563j c0563j) {
        this.f3731g.removeItem(m4797c(c0563j));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3729e = (NavigationView) findViewById(R.id.nvView);
        this.f3730f = this.f3729e.getMenu();
        this.f3731g = this.f3730f.findItem(R.id.minimalist_submenu_item).getSubMenu();
        this.f3729e.setNavigationItemSelectedListener(new NavigationView.InterfaceC0056a() { // from class: ca.toadlybroodledev.sublist.DrawerCustomLayout.1
            @Override // android.support.design.widget.NavigationView.InterfaceC0056a
            /* JADX INFO: renamed from: a */
            public boolean mo426a(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_instructions /* 2131296463 */:
                        DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3711u);
                        break;
                    case R.id.menu_invite /* 2131296464 */:
                        DrawerCustomLayout.this.f3727c.m4757D();
                        break;
                    case R.id.menu_profile /* 2131296471 */:
                        DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3707q);
                        break;
                    case R.id.menu_settings /* 2131296473 */:
                        DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3709s);
                        break;
                    case R.id.submenu_add_new_list /* 2131296620 */:
                        new C0538a().m866a(DrawerCustomLayout.this.f3728d.mo4774l().mo4785w(), "dialog_create_sublist");
                        break;
                    case R.id.submenu_search /* 2131296621 */:
                        DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3710t);
                        break;
                }
                for (C0563j c0563j : DrawerCustomLayout.this.f3728d.mo4786x()) {
                    if (c0563j.mo4848ae() != null && menuItem.getItemId() == c0563j.mo4848ae().hashCode()) {
                        DrawerCustomLayout.this.f3728d.mo4764a(c0563j);
                    }
                }
                Menu menu = DrawerCustomLayout.this.f3729e.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    DrawerCustomLayout.this.f3729e.getMenu().getItem(i).setChecked(false);
                }
                menuItem.setChecked(true);
                DrawerCustomLayout.this.m2411b();
                return true;
            }
        });
        this.f3727c.mo4772b(false);
    }
}
