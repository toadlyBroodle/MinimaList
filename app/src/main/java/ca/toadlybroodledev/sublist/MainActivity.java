package ca.toadlybroodledev.sublist;

import android.Manifest;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import ca.toadlybroodledev.sublist.iface.HostContract;
import ca.toadlybroodledev.sublist.iface.RowActionListener;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Ported from decompiled ActMain. Sole launcher activity; implements HostContract + RowActionListener.
// Phase 3.3: removed GoogleApiClient, AppInvites, Sign-In (f3695n, f3708r, m4754A, m4757D, mo4766a).
// Phase 3.4: removed AdMob InterstitialAd (f3705o, mo4756C body, mo4758E body).
// Phase 3.5: removed billing/premium wrapper (f3701E, mo4778p).
// Phase 4.5: mo4756C + mo4758E dropped from HostContract; mo4762a dropped (C0556c deleted).
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, HostContract, RowActionListener {

    static OutlineFab f3694m;

    private static boolean f3696w = false;

    private TextView f3697A;
    private ImageView f3698B;
    private ImageView f3699C;
    private OutlineStore f3700D;
    private ArrayList<SublistFragment> f3702F;
    private int f3703G;
    private OutlineRowView f3704H;

    FragmentManager f3706p;

    public ProfileFragment f3707q;
    public SettingsFragment f3709s;
    public SearchSublistFragment f3710t;
    public WelcomeSublistFragment f3711u;

    private final String f3712v = "fuckn" + getClass().getSimpleName();

    private DrawerCustomLayout f3713x;
    private Toolbar f3714y;
    private DrawerToggle f3715z;

    public static float m4749a(Context context, float f) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, f, context.getResources().getDisplayMetrics());
    }

    // Phase 9.2a: load is now async (Room queries must run off the main thread). On callback,
    // selects the previously-visible fragment (mirroring onStart's old logic) since onStart may
    // have run first against an empty f3702F.
    void m4755B() {
        this.f3700D.loadAllFromRepo(saved -> {
            // Guard: the activity may have reached onSaveInstanceState (or been destroyed)
            // by the time the Room background query posts its result back to the main thread
            // (rotation, user backgrounds during first-launch importLegacy). FragmentManager
            // forbids commit() after state save; isStateSaved() catches that window precisely.
            if (isFinishing() || isDestroyed() || this.f3706p.isStateSaved()) return;
            if (saved != null && !saved.isEmpty()) {
                mo4767a(SublistFragment.m4891a(this, saved));
            } else {
                SublistFragment frag = new SublistFragment().m4899a(this, (String) null,
                        (ArrayList<OutlineRow>) null);
                OutlineRowView r1 = new OutlineRowView(this, frag,
                        new OutlineRow(0, getString(R.string.welcome_push_me), false, true, 0L, false));
                OutlineRowView r2 = new OutlineRowView(this, frag,
                        new OutlineRow(1, getString(R.string.welcome_new_minimalist), false, false, 0L, false));
                OutlineRowView r3 = new OutlineRowView(this, frag,
                        new OutlineRow(2, getString(R.string.welcome_make_self_home), false, false, 0L, false));
                frag.mo4849af().m4988a().add(r1);
                frag.mo4849af().m4988a().get(0).f3824g = true;
                frag.mo4849af().m4988a().add(r2);
                frag.mo4849af().m4988a().add(r3);
                ArrayList<SublistFragment> list = new ArrayList<>();
                list.add(frag);
                mo4767a(list);
            }
            int idx = AppSettings.f3941d;
            if (this.f3702F.isEmpty()) {
                return;
            }
            if (idx == -1 || idx >= this.f3702F.size()) {
                mo4764a(this.f3702F.get(0));
            } else {
                mo4764a(this.f3702F.get(idx));
            }
            mo4759F();
        });
    }

    @Override
    public void mo4759F() {
        if (!AppSettings.f3944g) {
            ((NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE)).cancel(78);
            return;
        }
        ArrayList<OutlineRowView> allRows = new ArrayList<>();
        for (SublistFragment sf : this.f3702F) {
            allRows.addAll(sf.mo4849af().m4988a());
        }
        ArrayList<Long> times = new ArrayList<>();
        for (OutlineRowView row : allRows) {
            if (row.f3825h != 0 && !times.contains(Long.valueOf(row.f3825h))) {
                times.add(Long.valueOf(row.f3825h));
            }
        }
        Collections.sort(times);
        ArrayList<String> labels = new ArrayList<>();
        for (Long t : times) {
            for (OutlineRowView row : allRows) {
                if (row.f3825h == t.longValue()) {
                    labels.add(row.f3822e.getText().toString());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times.size(); i++) {
            sb.append(DateTimeUtil.m5011b(times.get(i))).append(" - ").append(labels.get(i)).append("\n");
        }
        String str = sb.length() == 0 ? "None" : sb.toString();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, AppMain.CHANNEL_REMINDERS)
                .setSmallIcon(R.drawable.minimalist_nav_drawer_logo)
                .setContentTitle("Upcoming reminders")
                .setContentText(str)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(str));
        builder.setContentIntent(PendingIntent.getActivity(this, 0,
                new Intent(this, MainActivity.class),
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE));
        Notification notification = builder.build();
        notification.flags |= 34;
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
                || ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                        == PackageManager.PERMISSION_GRANTED) {
            nm.notify(78, notification);
        }
    }

    @Override
    public View mo4760a(Integer num) {
        return findViewById(num.intValue());
    }

    @Override
    public void mo4761a(View view, boolean z) {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            if (z) {
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
            } else {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public void mo4763a(OutlineRowView rowView) {
        if (this.f3704H != null) {
            this.f3704H.f3820c.setBackgroundColor(0);
        }
        if (rowView != null) {
            rowView.f3820c.setBackgroundColor(AppSettings.m4945j());
        } else if (this.f3704H != null) {
            mo4761a((View) this.f3704H.f3822e, false);
        }
        this.f3704H = rowView;
        if (this.f3704H != null) {
            this.f3704H.f3822e.requestFocus();
            SublistFragment sf = mo4787y();
            if (sf != null) {
                sf.m4905an();
            }
        }
    }

    @Override
    public void mo4764a(SublistFragment fragment) {
        mo4763a((OutlineRowView) null);
        if (fragment != null) {
            mo4771b((Fragment) fragment);
            f3694m.m4800a(true, false);
        } else {
            f3694m.m4800a(false, false);
        }
        this.f3703G = this.f3702F.indexOf(fragment);
    }

    @Override
    public void mo4765a(SublistFragment fragment, boolean z) {
        int idx = this.f3702F.indexOf(fragment);
        int i = z ? idx + 1 : idx - 1;
        int size = i < 0 ? 0 : i >= this.f3702F.size() - 1 ? this.f3702F.size() - 1 : i;
        for (SublistFragment f : this.f3702F) {
            this.f3713x.m4799b(f);
        }
        this.f3702F.remove(fragment);
        this.f3702F.add(size, fragment);
        for (SublistFragment f : this.f3702F) {
            this.f3713x.m4798a(f);
        }
        this.f3703G = this.f3702F.indexOf(fragment);
        this.f3700D.saveAllToRepo();
    }

    @Override
    public void mo4767a(ArrayList<SublistFragment> fragments) {
        FragmentTransaction tx = this.f3706p.beginTransaction();
        for (SublistFragment frag : fragments) {
            tx.add(R.id.placeholder_for_fragments, frag, frag.mo4848ae());
            if (!this.f3702F.contains(frag)) {
                this.f3702F.add(frag);
            }
            this.f3713x.m4798a(frag);
        }
        tx.commit();
    }

    @Override
    public void mo4768a(ArrayList<SublistFragment> fragments, boolean z) {
        if (fragments == null || fragments.isEmpty()) {
            return;
        }
        FragmentTransaction tx = this.f3706p.beginTransaction();
        for (SublistFragment frag : fragments) {
            tx.remove(frag);
            this.f3702F.remove(frag);
            this.f3713x.m4799b(frag);
        }
        tx.commit();
        if (!z || this.f3702F.isEmpty()) {
            mo4764a((SublistFragment) null);
        } else {
            mo4764a(this.f3702F.get(0));
        }
    }

    @Override
    public void mo4769a(HashMap<String, ArrayList<OutlineRow>> map) {
        ArrayList<SublistFragment> newFrags = new ArrayList<>();
        for (String key : map.keySet()) {
            newFrags.add(new SublistFragment().m4899a(this, key, map.get(key)));
        }
        mo4768a(this.f3702F, false);
        this.f3702F.clear();
        mo4767a(newFrags);
    }

    @Override
    public String mo4770b(Integer num) {
        return getString(num.intValue());
    }

    @Override
    public void mo4771b(Fragment fragment) {
        if (fragment.getClass() == SublistFragment.class) {
            this.f3697A.setText("");
            AppSettings.f3941d = this.f3702F.indexOf(fragment);
        } else {
            mo4764a((SublistFragment) null);
            String tag = fragment.getTag();
            if (tag != null) {
                this.f3697A.setText(tag);
            }
        }
        try {
            FragmentTransaction tx = this.f3706p.beginTransaction();
            List<Fragment> current = this.f3706p.getFragments();
            if (current != null) {
                for (Fragment f : current) {
                    if (f != null) {
                        tx.detach(f);
                    }
                }
            }
            tx.attach(fragment);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        invalidateOptionsMenu();
    }

    @Override
    public void mo4772b(boolean z) {
        int primary = AppSettings.m4933c();
        int secondary = AppSettings.m4936d();
        int accent = AppSettings.m4939e();
        int highlight = AppSettings.m4945j();
        try {
            this.f3714y.setBackgroundColor(primary);
        } catch (Exception e) {
            Log.d(this.f3712v, e.getMessage());
        }
        try {
            findViewById(R.id.nav_header).setBackgroundColor(primary);
            findViewById(R.id.nav_header_image).setBackgroundColor(0);
            this.f3713x.f3729e.setBackgroundColor(secondary);
        } catch (Exception e2) {
            Log.d(this.f3712v, e2.getMessage());
        }
        try {
            for (SublistFragment sf : this.f3702F) {
                sf.m4903ag().setBackgroundColor(secondary);
                sf.m4904ai().setTextColor(AppSettings.m4943h());
            }
        } catch (Exception e3) {
            Log.d(this.f3712v, e3.getMessage());
        }
        try {
            findViewById(R.id.fab).setBackgroundTintList(new ColorStateList(
                    new int[][]{
                        new int[]{android.R.attr.state_enabled},
                        new int[]{-16842910},
                        new int[]{-16842912},
                        new int[]{android.R.attr.state_pressed}
                    },
                    new int[]{accent, primary, primary, highlight}));
        } catch (Exception e4) {
            Log.d(this.f3712v, e4.getMessage());
        }
        try {
            this.f3709s.f3871a.setBackgroundColor(secondary);
            this.f3709s.f3872ae.setBackgroundColor(accent);
            this.f3709s.f3873af.setBackgroundColor(accent);
            this.f3709s.f3877aj.setBackgroundColor(accent);
            this.f3709s.f3878ak.setBackgroundColor(accent);
            this.f3709s.f3879al.setBackgroundColor(accent);
            this.f3709s.f3874ag.setBackgroundColor(accent);
            this.f3709s.f3875ah.setBackgroundColor(accent);
            this.f3709s.f3876ai.setBackgroundColor(accent);
        } catch (Exception e5) {
            Log.d(this.f3712v, e5.getMessage());
        }
        if (this.f3709s == null || !z) {
            return;
        }
        try {
            FragmentTransaction tx = this.f3706p.beginTransaction();
            tx.remove(this.f3709s);
            this.f3709s = new SettingsFragment();
            tx.add(R.id.placeholder_for_fragments, this.f3709s, getString(R.string.menu_settings));
            tx.attach(this.f3709s);
            tx.commit();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override
    public void mo4773c(int i) {
        // Phase 6.4: external backup now uses getExternalFilesDir; no storage permission needed.
    }

    @Override
    public MainActivity mo4774l() {
        return this;
    }

    @Override
    public Context mo4775m() {
        return this;
    }

    @Override
    public ProfileFragment mo4776n() {
        return this.f3707q;
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        // Phase 3.3: removed App-Invites send-result handler (request code 10101).
    }

    @Override
    public void onBackPressed() {
        if (this.f3703G == -1) {
            if (AppSettings.f3941d != -1) {
                mo4764a(this.f3702F.get(AppSettings.f3941d));
            } else {
                mo4764a(this.f3702F.get(0));
            }
            this.f3713x.closeDrawers();
            return;
        }
        if (SublistFragment.m4893aj() != -1) {
            mo4787y().m4901a((OutlineRowView) null);
            return;
        }
        if (f3696w) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, R.string.toast_back_exit, Toast.LENGTH_SHORT).show();
            f3696w = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    MainActivity.f3696w = false;
                }
            }, 3000L);
        }
    }

    @Override
    public void onClick(View view) {
        SublistFragment sf = mo4787y();
        if (sf == null) {
            return;
        }
        if (view.getId() == R.id.fab) {
            sf.mo4851al();
        }
        sf.mo4852am();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3715z.onConfigurationChanged(configuration);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3700D = new OutlineStore(this);
        setContentView(R.layout.activity_main);
        final View placeholder = findViewById(R.id.placeholder_for_fragments);
        placeholder.getViewTreeObserver().addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        if (placeholder.getRootView().getHeight() - placeholder.getHeight()
                                > MainActivity.m4749a(MainActivity.this.getBaseContext(), 200.0f)) {
                            MainActivity.f3694m.m4800a(false, true);
                        } else if (MainActivity.this.f3703G != -1) {
                            MainActivity.f3694m.m4800a(true, false);
                        }
                    }
                });
        DateTimeUtil.m5009a(this);
        this.f3714y = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.f3714y);
        this.f3713x = (DrawerCustomLayout) findViewById(R.id.drawer_layout);
        this.f3715z = new DrawerToggle(this, this.f3713x, this.f3714y,
                R.string.drawer_open, R.string.drawer_close);
        this.f3715z.setDrawerIndicatorEnabled(false);
        this.f3713x.addDrawerListener(this.f3715z);
        this.f3713x.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        this.f3697A = (TextView) findViewById(R.id.menu_fragment_title);
        this.f3698B = (ImageView) findViewById(R.id.menu_drawer_toggle);
        this.f3699C = (ImageView) findViewById(R.id.menu_back_to_root);
        this.f3698B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.this.f3713x.isDrawerOpen(GravityCompat.START)) {
                    MainActivity.this.f3713x.closeDrawer(GravityCompat.START);
                    MainActivity.this.f3713x.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
                } else {
                    MainActivity.this.f3713x.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
                    MainActivity.this.f3713x.openDrawer(GravityCompat.START);
                }
            }
        });
        this.f3699C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.mo4787y().m4901a((OutlineRowView) null);
            }
        });
        f3694m = (OutlineFab) findViewById(R.id.fab);
        f3694m.setOnClickListener(this);
        String profileTag = getString(R.string.menu_profile);
        String settingsTag = getString(R.string.menu_settings);
        String searchTag = getString(R.string.menu_search);
        String infoTag = getString(R.string.menu_information);
        this.f3706p = getSupportFragmentManager();
        FragmentTransaction tx = this.f3706p.beginTransaction();
        this.f3707q = (ProfileFragment) this.f3706p.findFragmentByTag(profileTag);
        this.f3709s = (SettingsFragment) this.f3706p.findFragmentByTag(settingsTag);
        this.f3710t = (SearchSublistFragment) this.f3706p.findFragmentByTag(searchTag);
        this.f3711u = (WelcomeSublistFragment) this.f3706p.findFragmentByTag(infoTag);
        if (this.f3707q == null) {
            this.f3707q = new ProfileFragment();
            tx.add(R.id.placeholder_for_fragments, this.f3707q, profileTag);
        }
        if (this.f3709s == null) {
            this.f3709s = new SettingsFragment();
            tx.add(R.id.placeholder_for_fragments, this.f3709s, settingsTag);
        }
        if (this.f3710t == null) {
            this.f3710t = new SearchSublistFragment();
            tx.add(R.id.placeholder_for_fragments, this.f3710t, searchTag);
        }
        if (this.f3711u == null) {
            this.f3711u = new WelcomeSublistFragment();
            tx.add(R.id.placeholder_for_fragments, this.f3711u, infoTag);
        }
        tx.commit();
        this.f3702F = new ArrayList<>();
        m4755B();
    }

    @Override
    public void onFragmentInput(View view) {
        // Phase 3.3: removed Sign-In button cases.
        // Phase 3.5: removed purchase premium button case.
        // Phase 3.3: removed share/invite button case.
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f3700D.saveAllToRepo();
        try {
            mo4761a(findViewById(R.id.placeholder_for_fragments), false);
        } catch (Error e) {
        }
        mo4759F();
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f3715z.syncState();
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, R.string.toast_enable_storage_permission, Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // Phase 3.1/3.3: removed Firebase RTDB listener registration.
        // Phase 9.2a: f3702F may still be empty here if the async Room load hasn't completed;
        //             the load callback in m4755B re-runs this selection on completion.
        if (this.f3702F.isEmpty()) {
            return;
        }
        int idx = AppSettings.f3941d;
        if (idx == -1 || idx >= this.f3702F.size()) {
            mo4764a(this.f3702F.get(0));
        } else {
            mo4764a(this.f3702F.get(idx));
        }
        mo4759F();
    }

    @Override
    public void onStop() {
        super.onStop();
        // Phase 3.1/3.3: removed Firebase RTDB listener deregistration.
        mo4764a((SublistFragment) null);
        try {
            OutlineStore.m4962a(this.f3702F.get(AppSettings.f3941d).m4903ag());
        } catch (Throwable t) {
            t.printStackTrace();
        }
        Intent intent = new Intent(this, WidgetProvider.class);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds",
                AppWidgetManager.getInstance(getApplication()).getAppWidgetIds(
                        new ComponentName(getApplication(), WidgetProvider.class)));
        sendBroadcast(intent);
        mo4764a((SublistFragment) null);
    }

    @Override
    public OutlineStore mo4779q() {
        return this.f3700D;
    }

    @Override
    public SettingsFragment mo4780r() {
        return this.f3709s;
    }

    @Override
    public OutlineFab mo4781s() {
        return f3694m;
    }

    @Override
    public DrawerCustomLayout mo4782t() {
        return this.f3713x;
    }

    @Override
    public ImageView mo4783u() {
        return this.f3698B;
    }

    @Override
    public ImageView mo4784v() {
        return this.f3699C;
    }

    @Override
    public FragmentTransaction mo4785w() {
        return this.f3706p.beginTransaction();
    }

    @Override
    public ArrayList<SublistFragment> mo4786x() {
        return this.f3702F;
    }

    @Override
    public SublistFragment mo4787y() {
        if (this.f3703G == -1) {
            return null;
        }
        return this.f3702F.get(this.f3703G);
    }

    @Override
    public OutlineRowView mo4788z() {
        return this.f3704H;
    }
}
