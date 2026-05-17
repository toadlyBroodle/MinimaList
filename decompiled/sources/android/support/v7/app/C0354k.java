package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AbstractC0351h;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.view.C0392f;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;

/* JADX INFO: renamed from: android.support.v7.app.k */
/* JADX INFO: loaded from: classes.dex */
class C0354k extends C0353j {

    /* JADX INFO: renamed from: t */
    private int f1953t;

    /* JADX INFO: renamed from: u */
    private boolean f1954u;

    /* JADX INFO: renamed from: v */
    private boolean f1955v;

    /* JADX INFO: renamed from: w */
    private b f1956w;

    /* JADX INFO: renamed from: android.support.v7.app.k$a */
    class a extends AbstractC0351h.b {
        a(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: a */
        final ActionMode m2665a(ActionMode.Callback callback) {
            C0392f.a aVar = new C0392f.a(C0354k.this.f1934a, callback);
            AbstractC0388b abstractC0388bB = C0354k.this.m2691b(aVar);
            if (abstractC0388bB != null) {
                return aVar.m3141b(abstractC0388bB);
            }
            return null;
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0354k.this.mo2654p() ? m2665a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.k$b */
    final class b {

        /* JADX INFO: renamed from: b */
        private C0363t f1959b;

        /* JADX INFO: renamed from: c */
        private boolean f1960c;

        /* JADX INFO: renamed from: d */
        private BroadcastReceiver f1961d;

        /* JADX INFO: renamed from: e */
        private IntentFilter f1962e;

        b(C0363t c0363t) {
            this.f1959b = c0363t;
            this.f1960c = c0363t.m2745a();
        }

        /* JADX INFO: renamed from: a */
        final int m2666a() {
            this.f1960c = this.f1959b.m2745a();
            return this.f1960c ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        final void m2667b() {
            boolean zM2745a = this.f1959b.m2745a();
            if (zM2745a != this.f1960c) {
                this.f1960c = zM2745a;
                C0354k.this.mo2643j();
            }
        }

        /* JADX INFO: renamed from: c */
        final void m2668c() {
            m2669d();
            if (this.f1961d == null) {
                this.f1961d = new BroadcastReceiver() { // from class: android.support.v7.app.k.b.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        b.this.m2667b();
                    }
                };
            }
            if (this.f1962e == null) {
                this.f1962e = new IntentFilter();
                this.f1962e.addAction("android.intent.action.TIME_SET");
                this.f1962e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1962e.addAction("android.intent.action.TIME_TICK");
            }
            C0354k.this.f1934a.registerReceiver(this.f1961d, this.f1962e);
        }

        /* JADX INFO: renamed from: d */
        final void m2669d() {
            if (this.f1961d != null) {
                C0354k.this.f1934a.unregisterReceiver(this.f1961d);
                this.f1961d = null;
            }
        }
    }

    C0354k(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        super(context, window, interfaceC0349f);
        this.f1953t = -100;
        this.f1955v = true;
    }

    /* JADX INFO: renamed from: h */
    private boolean m2660h(int i) {
        Resources resources = this.f1934a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2663z()) {
            ((Activity) this.f1934a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, displayMetrics);
            if (Build.VERSION.SDK_INT < 26) {
                C0360q.m2729a(resources);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    private int m2661x() {
        return this.f1953t != -100 ? this.f1953t : m2620k();
    }

    /* JADX INFO: renamed from: y */
    private void m2662y() {
        if (this.f1956w == null) {
            this.f1956w = new b(C0363t.m2741a(this.f1934a));
        }
    }

    /* JADX INFO: renamed from: z */
    private boolean m2663z() {
        if (!this.f1954u || !(this.f1934a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1934a.getPackageManager().getActivityInfo(new ComponentName(this.f1934a, this.f1934a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    Window.Callback mo2645a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.LayoutInflaterFactory2C0356m, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: a */
    public void mo2625a(Bundle bundle) {
        super.mo2625a(bundle);
        if (bundle == null || this.f1953t != -100) {
            return;
        }
        this.f1953t = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: c */
    public void mo2634c() {
        super.mo2634c();
        mo2643j();
    }

    @Override // android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: c */
    public void mo2635c(Bundle bundle) {
        super.mo2635c(bundle);
        if (this.f1953t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f1953t);
        }
    }

    /* JADX INFO: renamed from: d */
    int mo2664d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m2662y();
                return this.f1956w.m2666a();
            default:
                return i;
        }
    }

    @Override // android.support.v7.app.LayoutInflaterFactory2C0356m, android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: d */
    public void mo2637d() {
        super.mo2637d();
        if (this.f1956w != null) {
            this.f1956w.m2669d();
        }
    }

    @Override // android.support.v7.app.LayoutInflaterFactory2C0356m, android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: g */
    public void mo2640g() {
        super.mo2640g();
        if (this.f1956w != null) {
            this.f1956w.m2669d();
        }
    }

    @Override // android.support.v7.app.AbstractC0351h, android.support.v7.app.AbstractC0350g
    /* JADX INFO: renamed from: j */
    public boolean mo2643j() {
        int iM2661x = m2661x();
        int iMo2664d = mo2664d(iM2661x);
        boolean zM2660h = iMo2664d != -1 ? m2660h(iMo2664d) : false;
        if (iM2661x == 0) {
            m2662y();
            this.f1956w.m2668c();
        }
        this.f1954u = true;
        return zM2660h;
    }

    @Override // android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: p */
    public boolean mo2654p() {
        return this.f1955v;
    }
}
