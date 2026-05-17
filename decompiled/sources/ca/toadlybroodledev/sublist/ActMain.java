package ca.toadlybroodledev.sublist;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p006a.AbstractC0159o;
import android.support.v4.p006a.AbstractC0164t;
import android.support.v4.p006a.C0134a;
import android.support.v4.p006a.C0136ab;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v7.app.ActivityC0348e;
import android.support.v7.app.DialogInterfaceC0347d;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0550b;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import ca.toadlybroodledev.sublist.p032c.C0556c;
// Phase 3.4 (deferred): com.google.android.gms.ads.{C0657a,C0676c,C0687h} stay until
//                       the 3.4 ad-call-site sweep below.
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0676c;
import com.google.android.gms.ads.C0687h;
// Phase 3.3: removed com.google.android.gms.appinvite.{C0908a,C0910c,C0912e,InterfaceC0911d}
// Phase 3.3: removed com.google.android.gms.auth.api.{C0915a, signin.GoogleSignInOptions}
// Phase 3.3: removed com.google.android.gms.common.C1071a (ConnectionResult)
// Phase 3.3: removed com.google.android.gms.common.api.{AbstractC1079f, InterfaceC1194l}
//            (GoogleApiClient + ResultCallback)
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
// Phase 3.3: removed `, AbstractC1079f.c` (GoogleApiClient.OnConnectionFailedListener)
//            from the implements clause.
public class ActMain extends ActivityC0348e implements View.OnClickListener, InterfaceC0549a, InterfaceC0550b {

    /* JADX INFO: renamed from: m */
    static Fab f3694m;

    // Phase 3.3: removed `static AbstractC1079f f3695n` — GoogleApiClient handle.

    /* JADX INFO: renamed from: w */
    private static boolean f3696w = false;

    /* JADX INFO: renamed from: A */
    private TextView f3697A;

    /* JADX INFO: renamed from: B */
    private ImageView f3698B;

    /* JADX INFO: renamed from: C */
    private ImageView f3699C;

    /* JADX INFO: renamed from: D */
    private C0567n f3700D;

    /* JADX INFO: renamed from: E */
    private C0564k f3701E;

    /* JADX INFO: renamed from: F */
    private ArrayList<C0563j> f3702F;

    /* JADX INFO: renamed from: G */
    private int f3703G;

    /* JADX INFO: renamed from: H */
    private C0557d f3704H;

    /* JADX INFO: renamed from: o */
    C0687h f3705o;

    /* JADX INFO: renamed from: p */
    AbstractC0159o f3706p;

    /* JADX INFO: renamed from: q */
    public ViewOnClickListenerC0558e f3707q;

    // Phase 3.3: removed `public ViewOnClickListenerC0559f f3708r` — handle to the
    //   Sign-In fragment (class file deleted in this phase).

    /* JADX INFO: renamed from: s */
    public ViewOnClickListenerC0562i f3709s;

    /* JADX INFO: renamed from: t */
    public ViewOnClickListenerC0561h f3710t;

    /* JADX INFO: renamed from: u */
    public C0560g f3711u;

    /* JADX INFO: renamed from: v */
    private final String f3712v = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: x */
    private DrawerCustomLayout f3713x;

    /* JADX INFO: renamed from: y */
    private Toolbar f3714y;

    /* JADX INFO: renamed from: z */
    private C0553c f3715z;

    /* JADX INFO: renamed from: a */
    public static float m4749a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    // Phase 3.3: removed void m4754A() — GoogleApiClient init with GoogleSignInOptions
    //   for OAuth2 client id REDACTED_OAUTH_CLIENT_ID
    //   plus AppInvite API. Sole caller (in ActMain.onCreate, line 584-ish) also removed.

    /* JADX INFO: renamed from: B */
    void m4755B() {
        HashMap<String, ArrayList<C0554a>> mapM4977b = this.f3700D.m4977b(false, false);
        if (mapM4977b != null) {
            mo4767a(C0563j.m4891a(this, mapM4977b));
            return;
        }
        C0563j c0563jM4899a = new C0563j().m4899a(this, (String) null, (ArrayList<C0554a>) null);
        C0557d c0557d = new C0557d(this, c0563jM4899a, new C0554a(0, getString(R.string.welcome_push_me), false, true, 0L, false));
        C0557d c0557d2 = new C0557d(this, c0563jM4899a, new C0554a(1, getString(R.string.welcome_new_minimalist), false, false, 0L, false));
        C0557d c0557d3 = new C0557d(this, c0563jM4899a, new C0554a(2, getString(R.string.welcome_make_self_home), false, false, 0L, false));
        c0563jM4899a.mo4849af().m4988a().add(c0557d);
        c0563jM4899a.mo4849af().m4988a().get(0).f3824g = true;
        c0563jM4899a.mo4849af().m4988a().add(c0557d2);
        c0563jM4899a.mo4849af().m4988a().add(c0557d3);
        ArrayList<C0563j> arrayList = new ArrayList<>();
        arrayList.add(c0563jM4899a);
        mo4767a(arrayList);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: C */
    public void mo4756C() {
        if (!C0564k.m4911a() && this.f3705o.m5430a() && C0572s.m5012b()) {
            this.f3705o.m5431b();
        } else {
            mo4758E();
        }
    }

    // Phase 3.3: removed protected void m4757D() — launched the App-Invites send
    //   activity (request code 10101). Deep link `https://jg5ms.app.goo.gl/XktS`
    //   was the Firebase Dynamic Links short-link domain associated with this app,
    //   also deprecated. Sole caller (menu item, line ~704) also removed.

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: E */
    public void mo4758E() {
        if (C0564k.m4911a()) {
            return;
        }
        this.f3705o.m5426a(new C0676c.a().m5394b("B3EEABB8EE11C2BE770B684D95219ECB").m5394b("340881060997B582C0F0D1E4759A61D7").m5393a());
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: F */
    public void mo4759F() {
        if (!C0566m.f3944g) {
            ((NotificationManager) getSystemService("notification")).cancel(78);
            return;
        }
        ArrayList<C0557d> arrayList = new ArrayList();
        Iterator<C0563j> it = this.f3702F.iterator();
        while (it.hasNext()) {
            Iterator<C0557d> it2 = it.next().mo4849af().m4988a().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        for (C0557d c0557d : arrayList) {
            if (c0557d.f3825h != 0 && !arrayList2.contains(Long.valueOf(c0557d.f3825h))) {
                arrayList2.add(Long.valueOf(c0557d.f3825h));
            }
        }
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Long l : arrayList2) {
            for (C0557d c0557d2 : arrayList) {
                if (c0557d2.f3825h == l.longValue()) {
                    arrayList3.add(c0557d2.f3822e.getText().toString());
                }
            }
        }
        String str = "";
        int i = 0;
        while (i < arrayList2.size()) {
            String str2 = str + C0572s.m5011b(((Long) arrayList2.get(i)).longValue()) + " - " + ((String) arrayList3.get(i)) + "\n";
            i++;
            str = str2;
        }
        if (str.length() == 0) {
            str = "None";
        }
        C0136ab.c cVarM782a = new C0136ab.c(this).m778a(R.drawable.minimalist_nav_drawer_logo).m783a((CharSequence) "Upcoming reminders").m788b(str).m782a(new C0136ab.b().m773a(str));
        cVarM782a.m780a(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ActMain.class), 134217728));
        Notification notificationM777a = cVarM782a.m777a();
        notificationM777a.flags |= 34;
        ((NotificationManager) getSystemService("notification")).notify(78, notificationM777a);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public View mo4760a(Integer num) {
        return findViewById(num.intValue());
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4761a(View view, boolean z) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            if (z) {
                inputMethodManager.toggleSoftInput(2, 0);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4762a(C0556c c0556c) {
        this.f3707q.m4864a(c0556c);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4763a(C0557d c0557d) {
        if (this.f3704H != null) {
            this.f3704H.f3820c.setBackgroundColor(0);
        }
        if (c0557d != null) {
            c0557d.f3820c.setBackgroundColor(C0566m.m4945j());
        } else if (this.f3704H != null) {
            mo4761a((View) this.f3704H.f3822e, false);
        }
        this.f3704H = c0557d;
        if (this.f3704H != null) {
            this.f3704H.f3822e.requestFocus();
            C0563j c0563jMo4787y = mo4787y();
            if (c0563jMo4787y != null) {
                c0563jMo4787y.m4905an();
            }
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: a */
    public void mo4764a(C0563j c0563j) {
        mo4763a((C0557d) null);
        if (c0563j != null) {
            mo4771b((ComponentCallbacksC0154j) c0563j);
            f3694m.m4800a(true, false);
        } else {
            f3694m.m4800a(false, false);
        }
        this.f3703G = this.f3702F.indexOf(c0563j);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4765a(C0563j c0563j, boolean z) {
        int iIndexOf = this.f3702F.indexOf(c0563j);
        int i = z ? iIndexOf + 1 : iIndexOf - 1;
        int size = i < 0 ? 0 : i >= this.f3702F.size() + (-1) ? this.f3702F.size() - 1 : i;
        Iterator<C0563j> it = this.f3702F.iterator();
        while (it.hasNext()) {
            this.f3713x.m4799b(it.next());
        }
        this.f3702F.remove(c0563j);
        this.f3702F.add(size, c0563j);
        Iterator<C0563j> it2 = this.f3702F.iterator();
        while (it2.hasNext()) {
            this.f3713x.m4798a(it2.next());
        }
        this.f3703G = this.f3702F.indexOf(c0563j);
        this.f3700D.m4976a(false, false);
    }

    // Phase 3.3: removed @Override public void mo4766a(C1071a c1071a) —
    //   GoogleApiClient.OnConnectionFailedListener implementation; toasted
    //   R.string.play_services_error and logged the connection result.

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: a */
    public void mo4767a(ArrayList<C0563j> arrayList) {
        AbstractC0164t abstractC0164tMo1073a = this.f3706p.mo1073a();
        for (C0563j c0563j : arrayList) {
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, c0563j, c0563j.mo4848ae());
            if (!this.f3702F.contains(c0563j)) {
                this.f3702F.add(c0563j);
            }
            this.f3713x.m4798a(c0563j);
        }
        abstractC0164tMo1073a.mo847b();
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4768a(ArrayList<C0563j> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        AbstractC0164t abstractC0164tMo1073a = this.f3706p.mo1073a();
        for (C0563j c0563j : arrayList) {
            abstractC0164tMo1073a.mo837a(c0563j);
            this.f3702F.remove(c0563j);
            this.f3713x.m4799b(c0563j);
        }
        abstractC0164tMo1073a.mo847b();
        if (!z || this.f3702F.isEmpty()) {
            mo4764a((C0563j) null);
        } else {
            mo4764a(this.f3702F.get(0));
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: a */
    public void mo4769a(HashMap<String, ArrayList<C0554a>> map) {
        ArrayList<C0563j> arrayList = new ArrayList<>();
        for (String str : map.keySet()) {
            arrayList.add(new C0563j().m4899a(this, str, map.get(str)));
        }
        mo4768a(this.f3702F, false);
        this.f3702F.clear();
        mo4767a(arrayList);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: b */
    public String mo4770b(Integer num) {
        return getString(num.intValue());
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: b */
    public void mo4771b(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (componentCallbacksC0154j.getClass() == C0563j.class) {
            this.f3697A.setText("");
            C0567n.f3941d = this.f3702F.indexOf(componentCallbacksC0154j);
        } else {
            mo4764a((C0563j) null);
            String strM961h = componentCallbacksC0154j.m961h();
            if (strM961h != null) {
                this.f3697A.setText(strM961h);
            }
        }
        try {
            AbstractC0164t abstractC0164tMo1073a = this.f3706p.mo1073a();
            List<ComponentCallbacksC0154j> listMo1077c = this.f3706p.mo1077c();
            if (listMo1077c != null) {
                for (ComponentCallbacksC0154j componentCallbacksC0154j2 : listMo1077c) {
                    if (componentCallbacksC0154j2 != null) {
                        abstractC0164tMo1073a.mo849b(componentCallbacksC0154j2);
                    }
                }
            }
            abstractC0164tMo1073a.mo853c(componentCallbacksC0154j);
            abstractC0164tMo1073a.mo847b();
        } catch (Exception e) {
            e.printStackTrace();
        }
        invalidateOptionsMenu();
        if (componentCallbacksC0154j.equals(this.f3709s) || componentCallbacksC0154j.equals(this.f3711u) || componentCallbacksC0154j.equals(this.f3710t)) {
            mo4756C();
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: b */
    public void mo4772b(boolean z) {
        int iM4933c = C0566m.m4933c();
        int iM4936d = C0566m.m4936d();
        int iM4939e = C0566m.m4939e();
        int iM4945j = C0566m.m4945j();
        try {
            this.f3714y.setBackgroundColor(iM4933c);
        } catch (Exception e) {
            Log.d(this.f3712v, e.getMessage());
        }
        try {
            findViewById(R.id.nav_header).setBackgroundColor(iM4933c);
            findViewById(R.id.nav_header_image).setBackgroundColor(0);
            this.f3713x.f3729e.setBackgroundColor(iM4936d);
        } catch (Exception e2) {
            Log.d(this.f3712v, e2.getMessage());
        }
        try {
            for (C0563j c0563j : this.f3702F) {
                c0563j.m4903ag().setBackgroundColor(iM4936d);
                c0563j.m4904ai().setTextColor(C0566m.m4943h());
            }
        } catch (Exception e3) {
            Log.d(this.f3712v, e3.getMessage());
        }
        try {
            findViewById(R.id.fab).setBackgroundTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_pressed}}, new int[]{iM4939e, iM4933c, iM4933c, iM4945j}));
        } catch (Exception e4) {
            Log.d(this.f3712v, e4.getMessage());
        }
        try {
            this.f3709s.f3871a.setBackgroundColor(iM4936d);
            this.f3709s.f3872ae.setBackgroundColor(iM4939e);
            this.f3709s.f3873af.setBackgroundColor(iM4939e);
            this.f3709s.f3877aj.setBackgroundColor(iM4939e);
            this.f3709s.f3878ak.setBackgroundColor(iM4939e);
            this.f3709s.f3879al.setBackgroundColor(iM4939e);
            this.f3709s.f3874ag.setBackgroundColor(iM4939e);
            this.f3709s.f3875ah.setBackgroundColor(iM4939e);
            this.f3709s.f3876ai.setBackgroundColor(iM4939e);
        } catch (Exception e5) {
            Log.d(this.f3712v, e5.getMessage());
        }
        if (this.f3709s == null || !z) {
            return;
        }
        try {
            AbstractC0164t abstractC0164tMo1073a = this.f3706p.mo1073a();
            abstractC0164tMo1073a.mo837a(this.f3709s);
            this.f3709s = new ViewOnClickListenerC0562i();
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, this.f3709s, getString(R.string.menu_settings));
            abstractC0164tMo1073a.mo853c(this.f3709s);
            abstractC0164tMo1073a.mo847b();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: c */
    public void mo4773c(int i) {
        switch (i) {
            case 1:
                C0134a.m760a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                break;
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: l */
    public ActMain mo4774l() {
        return this;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: m */
    public Context mo4775m() {
        return this;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: n */
    public ViewOnClickListenerC0558e mo4776n() {
        return this.f3707q;
    }

    // Phase 3.3: removed @Override public ViewOnClickListenerC0559f mo4777o() —
    //   returned the Sign-In fragment (deleted in this phase). The
    //   InterfaceC0549a contract method itself should be deleted from
    //   p031b/InterfaceC0549a.java during the Phase 4 port (no remaining caller).

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        // Phase 3.3: removed `if (i == 10101)` App-Invites send-result handler block.
        //   Decoded the invite-IDs array via C0910c.m6087a (AppInviteInvitation.getInvitationIds),
        //   wrote it to RTDB via C0567n.m4963b (already removed in this phase), then for each
        //   invitee bumped the profile-fragment's "invites sent" counter via f3707q.m4867ae and
        //   refreshed the fragment via f3707q.mo4868af. Both counter + refresh have local-only
        //   semantics so they can be reused if a future phase reintroduces local invite tracking.
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onBackPressed() {
        if (this.f3703G == -1) {
            if (C0567n.f3941d != -1) {
                mo4764a(this.f3702F.get(C0567n.f3941d));
            } else {
                mo4764a(this.f3702F.get(0));
            }
            this.f3713x.m2411b();
            return;
        }
        if (C0563j.m4893aj() != -1) {
            mo4787y().m4901a((C0557d) null);
            return;
        }
        if (f3696w) {
            finish();
        } else {
            Toast.makeText(this, R.string.toast_back_exit, 0).show();
            f3696w = true;
            new Handler().postDelayed(new Runnable() { // from class: ca.toadlybroodledev.sublist.ActMain.6
                @Override // java.lang.Runnable
                public void run() {
                    boolean unused = ActMain.f3696w = false;
                }
            }, 3000L);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strMo4851al = null;
        C0563j c0563jMo4787y = mo4787y();
        if (c0563jMo4787y == null) {
            return;
        }
        switch (view.getId()) {
            case R.id.fab /* 2131296395 */:
                strMo4851al = c0563jMo4787y.mo4851al();
                break;
        }
        if (strMo4851al != null) {
        }
        c0563jMo4787y.mo4852am();
    }

    @Override // android.support.v7.app.ActivityC0348e, android.support.v4.p006a.ActivityC0155k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3715z.m2574a(configuration);
    }

    @Override // android.support.v7.app.ActivityC0348e, android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3700D = new C0567n(this);
        setContentView(R.layout.activity_main);
        final View viewFindViewById = findViewById(R.id.placeholder_for_fragments);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ca.toadlybroodledev.sublist.ActMain.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (viewFindViewById.getRootView().getHeight() - viewFindViewById.getHeight() > ActMain.m4749a(ActMain.this.getBaseContext(), 200.0f)) {
                    ActMain.f3694m.m4800a(false, true);
                } else if (ActMain.this.f3703G != -1) {
                    ActMain.f3694m.m4800a(true, false);
                }
            }
        });
        C0572s.m5009a(this);
        this.f3701E = new C0564k(this);
        // Phase 3.3: removed `m4754A()` GoogleApiClient init call.
        this.f3705o = new C0687h(this);
        this.f3705o.m5428a("ca-app-pub-1334740097475606/9485517375");
        this.f3705o.m5425a(new C0657a() { // from class: ca.toadlybroodledev.sublist.ActMain.2
            @Override // com.google.android.gms.ads.C0657a
            /* JADX INFO: renamed from: a */
            public void mo4789a() {
                ActMain.this.mo4758E();
            }
        });
        this.f3714y = (Toolbar) findViewById(R.id.toolbar);
        m2608a(this.f3714y);
        this.f3713x = (DrawerCustomLayout) findViewById(R.id.drawer_layout);
        this.f3715z = new C0553c(this, this.f3713x, this.f3714y, R.string.drawer_open, R.string.drawer_close);
        this.f3715z.m2576a(false);
        this.f3713x.m2404a(this.f3715z);
        this.f3713x.setDrawerLockMode(1);
        this.f3697A = (TextView) findViewById(R.id.menu_fragment_title);
        this.f3698B = (ImageView) findViewById(R.id.menu_drawer_toggle);
        this.f3699C = (ImageView) findViewById(R.id.menu_back_to_root);
        this.f3698B.setOnClickListener(new View.OnClickListener() { // from class: ca.toadlybroodledev.sublist.ActMain.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ActMain.this.f3713x.m2427g(8388611)) {
                    ActMain.this.f3713x.m2425f(8388611);
                    ActMain.this.f3713x.setDrawerLockMode(1);
                } else {
                    ActMain.this.f3713x.setDrawerLockMode(0);
                    ActMain.this.f3713x.m2424e(8388611);
                }
            }
        });
        this.f3699C.setOnClickListener(new View.OnClickListener() { // from class: ca.toadlybroodledev.sublist.ActMain.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ActMain.this.mo4787y().m4901a((C0557d) null);
            }
        });
        f3694m = (Fab) findViewById(R.id.fab);
        f3694m.setOnClickListener(this);
        String string = getString(R.string.menu_profile);
        String string2 = getString(R.string.google_title_text);
        String string3 = getString(R.string.menu_settings);
        String string4 = getString(R.string.menu_search);
        String string5 = getString(R.string.menu_information);
        this.f3706p = m1012f();
        AbstractC0164t abstractC0164tMo1073a = this.f3706p.mo1073a();
        this.f3707q = (ViewOnClickListenerC0558e) this.f3706p.mo1072a(string);
        // Phase 3.3: removed `this.f3708r = (ViewOnClickListenerC0559f) ...mo1072a(string2)` — Sign-In fragment lookup.
        this.f3709s = (ViewOnClickListenerC0562i) this.f3706p.mo1072a(string3);
        this.f3710t = (ViewOnClickListenerC0561h) this.f3706p.mo1072a(string4);
        this.f3711u = (C0560g) this.f3706p.mo1072a(string5);
        if (this.f3707q == null) {
            this.f3707q = new ViewOnClickListenerC0558e();
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, this.f3707q, string);
        }
        // Phase 3.3: removed Sign-In fragment construction/attachment for f3708r/string2.
        if (this.f3709s == null) {
            this.f3709s = new ViewOnClickListenerC0562i();
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, this.f3709s, string3);
        }
        if (this.f3710t == null) {
            this.f3710t = new ViewOnClickListenerC0561h();
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, this.f3710t, string4);
        }
        if (this.f3711u == null) {
            this.f3711u = new C0560g();
            abstractC0164tMo1073a.mo836a(R.id.placeholder_for_fragments, this.f3711u, string5);
        }
        abstractC0164tMo1073a.mo847b();
        this.f3702F = new ArrayList<>();
        m4755B();
        // Phase 3.3: removed `C0908a.f4988b.mo6085a(f3695n, this, true)…` AppInvite
        //   deep-link receive handler (AppInvite.AppInviteApi.getInvitation). On a
        //   matching invite for https://jg5ms.app.goo.gl/XktS it set the f3943f
        //   "got-promo" flag in C0566m, popped a welcome dialog (invite_welcome /
        //   invite_promo_text / invite_friends_format strings), and on OK pushed the
        //   Sign-In fragment (f3708r). The f3943f flag may also gate the trial-hours
        //   path in C0567n.m4975z (already removed in 3.1) — safe to drop entirely.
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    public void onFragmentInput(View view) {
        switch (view.getId()) {
            // Phase 3.3: removed cases R.id.base_google_sign_in_button + base_profile_sign_out_button.
            //   Both swapped to the Sign-In fragment (f3708r); the button views themselves
            //   live in res/layout (still present in decompiled/resources/, dropped during
            //   the Phase 1 resource port). The R.id constants stay reserved for now and
            //   the corresponding views should be deleted from the source layouts during
            //   the Phase 1 res import.
            case R.id.profile_purchase_premium_button /* 2131296544 */:
                this.f3701E.m4916d();
                break;
            // Phase 3.3: removed case R.id.profile_share_button calling m4757D() — App-Invites send.
        }
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3700D.m4976a(false, false);
        try {
            mo4761a(findViewById(R.id.placeholder_for_fragments), false);
        } catch (Error e) {
        }
        mo4759F();
    }

    @Override // android.support.v7.app.ActivityC0348e, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f3715z.m2573a();
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity, android.support.v4.p006a.C0134a.a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (iArr.length <= 0 || iArr[0] != 0) {
                    Toast.makeText(this, R.string.toast_enable_storage_permission, 0).show();
                }
                break;
        }
    }

    @Override // android.support.v7.app.ActivityC0348e, android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onStart() {
        super.onStart();
        C0567n.f3972p.m12839a(this.f3700D.f3975q);
        int i = C0567n.f3941d;
        if (i == -1 || i >= this.f3702F.size()) {
            mo4764a(this.f3702F.get(0));
        } else {
            mo4764a(this.f3702F.get(i));
        }
        mo4759F();
    }

    @Override // android.support.v7.app.ActivityC0348e, android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onStop() throws Throwable {
        super.onStop();
        if (this.f3700D.f3975q != null) {
            C0567n.f3972p.m12842b(this.f3700D.f3975q);
        }
        mo4764a((C0563j) null);
        C0567n.m4962a(this.f3702F.get(C0567n.f3941d).m4903ag());
        Intent intent = new Intent(this, (Class<?>) WidgetProvider.class);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", AppWidgetManager.getInstance(getApplication()).getAppWidgetIds(new ComponentName(getApplication(), (Class<?>) WidgetProvider.class)));
        sendBroadcast(intent);
        mo4764a((C0563j) null);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: p */
    public C0564k mo4778p() {
        return this.f3701E;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: q */
    public C0567n mo4779q() {
        return this.f3700D;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: r */
    public ViewOnClickListenerC0562i mo4780r() {
        return this.f3709s;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: s */
    public Fab mo4781s() {
        return f3694m;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: t */
    public DrawerCustomLayout mo4782t() {
        return this.f3713x;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: u */
    public ImageView mo4783u() {
        return this.f3698B;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: v */
    public ImageView mo4784v() {
        return this.f3699C;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: w */
    public AbstractC0164t mo4785w() {
        return this.f3706p.mo1073a();
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a, ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: x */
    public ArrayList<C0563j> mo4786x() {
        return this.f3702F;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a, ca.toadlybroodledev.sublist.p031b.InterfaceC0550b
    /* JADX INFO: renamed from: y */
    public C0563j mo4787y() {
        if (this.f3703G == -1) {
            return null;
        }
        return this.f3702F.get(this.f3703G);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0549a
    /* JADX INFO: renamed from: z */
    public C0557d mo4788z() {
        return this.f3704H;
    }
}
