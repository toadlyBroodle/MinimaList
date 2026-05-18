package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import ca.toadlybroodledev.sublist.iface.RowActionListener;

// Ported from decompiled DrawerCustomLayout. Extends DrawerLayout; manages nav-drawer sublist entries.
// Phase 3.3: removed menu_invite case (App-Invites / m4757D deleted).
public class DrawerCustomLayout extends DrawerLayout {

    MainActivity f3727c;
    RowActionListener f3728d;
    NavigationView f3729e;
    Menu f3730f;
    SubMenu f3731g;

    public DrawerCustomLayout(Context context) {
        super(context);
        m4796a(context);
    }

    public DrawerCustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        m4796a(context);
    }

    public DrawerCustomLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        m4796a(context);
    }

    private void m4796a(Context context) {
        this.f3728d = (RowActionListener) context;
        this.f3727c = this.f3728d.mo4774l();
    }

    static int m4797c(SublistFragment fragment) {
        return fragment.mo4848ae().hashCode();
    }

    void m4798a(SublistFragment fragment) {
        int id = m4797c(fragment);
        this.f3731g.add(0, id, this.f3731g.size() - 1, fragment.mo4848ae());
        this.f3731g.findItem(id).setIcon(R.drawable.ic_action_minimalist_drawer_logo);
    }

    void m4799b(SublistFragment fragment) {
        this.f3731g.removeItem(m4797c(fragment));
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3729e = (NavigationView) findViewById(R.id.nvView);
        this.f3730f = this.f3729e.getMenu();
        this.f3731g = this.f3730f.findItem(R.id.minimalist_submenu_item).getSubMenu();
        this.f3729e.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                // Phase 3.3: removed menu_invite case (App-Invites / m4757D deleted).
                if (id == R.id.menu_instructions) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3711u);
                } else if (id == R.id.menu_profile) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3707q);
                } else if (id == R.id.menu_settings) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3709s);
                } else if (id == R.id.submenu_add_new_list) {
                    new NewSublistDialog().show(
                            DrawerCustomLayout.this.f3727c.getSupportFragmentManager(),
                            "dialog_create_sublist");
                } else if (id == R.id.submenu_search) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3710t);
                }
                for (SublistFragment frag : DrawerCustomLayout.this.f3728d.mo4786x()) {
                    if (frag.mo4848ae() != null
                            && item.getItemId() == frag.mo4848ae().hashCode()) {
                        DrawerCustomLayout.this.f3728d.mo4764a(frag);
                    }
                }
                Menu menu = DrawerCustomLayout.this.f3729e.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    DrawerCustomLayout.this.f3729e.getMenu().getItem(i).setChecked(false);
                }
                item.setChecked(true);
                DrawerCustomLayout.this.closeDrawers();
                return true;
            }
        });
        this.f3727c.mo4772b(false);
    }
}
