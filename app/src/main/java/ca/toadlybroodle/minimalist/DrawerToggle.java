package ca.toadlybroodle.minimalist;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import ca.toadlybroodle.minimalist.iface.HostContract;

// Ported from decompiled C0553c. Hides FAB on drawer open; re-locks drawer on close.
public class DrawerToggle extends ActionBarDrawerToggle {

    private HostContract f3817c;

    public DrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar,
            int openDesc, int closeDesc) {
        super(activity, drawerLayout, toolbar, openDesc, closeDesc);
        this.f3817c = (HostContract) activity;
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        if (slideOffset > 0.0f) {
            this.f3817c.mo4761a(drawerView, false);
            this.f3817c.mo4781s().m4800a(false, false);
        } else if (this.f3817c.mo4787y() != null) {
            this.f3817c.mo4781s().m4800a(true, false);
            this.f3817c.mo4782t().setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        }
        super.onDrawerSlide(drawerView, slideOffset);
    }
}
