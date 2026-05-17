package android.support.v7.p027d;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v7.d.m */
/* JADX INFO: loaded from: classes.dex */
final class C0382m {

    /* JADX INFO: renamed from: a */
    private final Context f2271a;

    /* JADX INFO: renamed from: b */
    private final a f2272b;

    /* JADX INFO: renamed from: d */
    private final PackageManager f2274d;

    /* JADX INFO: renamed from: f */
    private boolean f2276f;

    /* JADX INFO: renamed from: e */
    private final ArrayList<ServiceConnectionC0381l> f2275e = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private final BroadcastReceiver f2277g = new BroadcastReceiver() { // from class: android.support.v7.d.m.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C0382m.this.m3094b();
        }
    };

    /* JADX INFO: renamed from: h */
    private final Runnable f2278h = new Runnable() { // from class: android.support.v7.d.m.2
        @Override // java.lang.Runnable
        public void run() {
            C0382m.this.m3094b();
        }
    };

    /* JADX INFO: renamed from: c */
    private final Handler f2273c = new Handler();

    /* JADX INFO: renamed from: android.support.v7.d.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2938a(AbstractC0372c abstractC0372c);

        /* JADX INFO: renamed from: b */
        void mo2946b(AbstractC0372c abstractC0372c);
    }

    public C0382m(Context context, a aVar) {
        this.f2271a = context;
        this.f2272b = aVar;
        this.f2274d = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    private int m3092a(String str, String str2) {
        int size = this.f2275e.size();
        for (int i = 0; i < size; i++) {
            if (this.f2275e.get(i).m3067b(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void m3093a() {
        if (this.f2276f) {
            return;
        }
        this.f2276f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.f2271a.registerReceiver(this.f2277g, intentFilter, null, this.f2273c);
        this.f2273c.post(this.f2278h);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m3094b() {
        int i;
        int i2 = 0;
        if (this.f2276f) {
            Iterator<ResolveInfo> it = this.f2274d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (true) {
                i = i2;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo == null) {
                    i2 = i;
                } else {
                    int iM3092a = m3092a(serviceInfo.packageName, serviceInfo.name);
                    if (iM3092a < 0) {
                        ServiceConnectionC0381l serviceConnectionC0381l = new ServiceConnectionC0381l(this.f2271a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        serviceConnectionC0381l.m3068h();
                        i2 = i + 1;
                        this.f2275e.add(i, serviceConnectionC0381l);
                        this.f2272b.mo2938a(serviceConnectionC0381l);
                    } else if (iM3092a >= i) {
                        ServiceConnectionC0381l serviceConnectionC0381l2 = this.f2275e.get(iM3092a);
                        serviceConnectionC0381l2.m3068h();
                        serviceConnectionC0381l2.m3070j();
                        i2 = i + 1;
                        Collections.swap(this.f2275e, iM3092a, i);
                    }
                }
            }
            if (i < this.f2275e.size()) {
                for (int size = this.f2275e.size() - 1; size >= i; size--) {
                    ServiceConnectionC0381l serviceConnectionC0381l3 = this.f2275e.get(size);
                    this.f2272b.mo2946b(serviceConnectionC0381l3);
                    this.f2275e.remove(serviceConnectionC0381l3);
                    serviceConnectionC0381l3.m3069i();
                }
            }
        }
    }
}
