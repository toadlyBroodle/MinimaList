package ca.toadlybroodle.minimalist;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import ca.toadlybroodle.minimalist.iface.RowActionListener;

// Ported from decompiled DrawerCustomLayout. Extends DrawerLayout; manages nav-drawer sublist entries.
// Phase 3.3: removed menu_invite case (App-Invites / m4757D deleted).
// Phase 10.4: removed menu_profile case (ProfileFragment retired).
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

    static int m4797c(OutlineFragment fragment) {
        return fragment.mo4848ae().hashCode();
    }

    void m4798a(OutlineFragment fragment) {
        int id = m4797c(fragment);
        this.f3731g.add(0, id, this.f3731g.size() - 1, fragment.mo4848ae());
        MenuItem item = this.f3731g.findItem(id);
        item.setIcon(R.drawable.ic_action_minimalist_drawer_logo);
        // NavigationView only reports state_checked for a checkable item, so the
        // accent ColorStateList in applyDrawerAccentColors() never resolves
        // otherwise — the active sublist would stay default white.
        item.setCheckable(true);
    }

    void m4799b(OutlineFragment fragment) {
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
                // Phase 10.4: removed menu_profile case (ProfileFragment retired).
                if (id == R.id.menu_instructions) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3711u);
                } else if (id == R.id.menu_settings) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3709s);
                } else if (id == R.id.submenu_add_new_list) {
                    new NewSublistDialog().show(
                            DrawerCustomLayout.this.f3727c.getSupportFragmentManager(),
                            "dialog_create_sublist");
                } else if (id == R.id.submenu_search) {
                    DrawerCustomLayout.this.f3728d.mo4771b(DrawerCustomLayout.this.f3727c.f3710t);
                }
                for (OutlineFragment frag : DrawerCustomLayout.this.f3728d.mo4786x()) {
                    if (frag.mo4848ae() != null
                            && item.getItemId() == frag.mo4848ae().hashCode()) {
                        DrawerCustomLayout.this.f3728d.mo4764a(frag);
                    }
                }
                Menu menu = DrawerCustomLayout.this.f3729e.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem topItem = menu.getItem(i);
                    topItem.setChecked(false);
                    if (topItem.hasSubMenu()) {
                        SubMenu sub = topItem.getSubMenu();
                        for (int j = 0; j < sub.size(); j++) {
                            sub.getItem(j).setChecked(false);
                        }
                    }
                }
                item.setChecked(true);
                applyDrawerAccentColors();
                DrawerCustomLayout.this.closeDrawers();
                return true;
            }
        });
        this.f3727c.mo4772b(false);
    }

    void applyDrawerAccentColors() {
        int accent = AppSettings.m4939e();
        int onAccent = StringArraySpinnerAdapter.contrastingTextColor(accent);
        int[][] states = new int[][]{ new int[]{android.R.attr.state_checked}, new int[]{} };
        // Text + icon: contrast against the accent background when the row is the
        // active one, light grey-white against the dark drawer otherwise.
        ColorStateList content = new ColorStateList(states, new int[]{ onAccent, 0xFFF4F4F2 });
        // The "you are here" highlight: the active row gets an accent-filled
        // background, every other row stays transparent. This replaces the flat
        // grey NavigationView paints on the checked item by default. NavigationView
        // clones the drawable per item (getConstantState().newDrawable()), so one
        // shared StateListDrawable tracks each row's own checked state correctly.
        StateListDrawable itemBg = new StateListDrawable();
        itemBg.addState(new int[]{android.R.attr.state_checked}, new ColorDrawable(accent));
        itemBg.addState(new int[]{}, new ColorDrawable(0x00000000));
        // Every navigable leaf must be checkable or NavigationView never adds
        // state_checked to its item-view drawable state, so neither the state list
        // nor the state drawable above ever resolves to its checked branch
        // (the Phase 13.4 bug).
        Menu menu = this.f3729e.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            MenuItem topItem = menu.getItem(i);
            if (topItem.hasSubMenu()) {
                SubMenu sub = topItem.getSubMenu();
                for (int j = 0; j < sub.size(); j++) {
                    sub.getItem(j).setCheckable(true);
                }
            } else {
                topItem.setCheckable(true);
            }
        }
        this.f3729e.setItemTextColor(content);
        this.f3729e.setItemIconTintList(content);
        this.f3729e.setItemBackground(itemBg);
    }
}
