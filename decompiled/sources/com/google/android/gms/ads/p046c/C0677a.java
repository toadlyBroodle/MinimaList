package com.google.android.gms.ads.p046c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.ServiceConnectionC1210i;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1290a;
import com.google.android.gms.internal.bsv;
import com.google.android.gms.internal.bsw;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.ads.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0677a {

    /* JADX INFO: renamed from: a */
    private ServiceConnectionC1210i f4364a;

    /* JADX INFO: renamed from: b */
    private bsv f4365b;

    /* JADX INFO: renamed from: c */
    private boolean f4366c;

    /* JADX INFO: renamed from: d */
    private Object f4367d;

    /* JADX INFO: renamed from: e */
    private b f4368e;

    /* JADX INFO: renamed from: f */
    private final Context f4369f;

    /* JADX INFO: renamed from: g */
    private boolean f4370g;

    /* JADX INFO: renamed from: h */
    private long f4371h;

    /* JADX INFO: renamed from: com.google.android.gms.ads.c.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f4372a;

        /* JADX INFO: renamed from: b */
        private final boolean f4373b;

        public a(String str, boolean z) {
            this.f4372a = str;
            this.f4373b = z;
        }

        /* JADX INFO: renamed from: a */
        public final String m5408a() {
            return this.f4372a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m5409b() {
            return this.f4373b;
        }

        public final String toString() {
            String str = this.f4372a;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.f4373b).toString();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.c.a$b */
    static class b extends Thread {

        /* JADX INFO: renamed from: a */
        CountDownLatch f4374a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b */
        boolean f4375b = false;

        /* JADX INFO: renamed from: c */
        private WeakReference<C0677a> f4376c;

        /* JADX INFO: renamed from: d */
        private long f4377d;

        public b(C0677a c0677a, long j) {
            this.f4376c = new WeakReference<>(c0677a);
            this.f4377d = j;
            start();
        }

        /* JADX INFO: renamed from: a */
        private final void m5410a() {
            C0677a c0677a = this.f4376c.get();
            if (c0677a != null) {
                c0677a.m5407d();
                this.f4375b = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f4374a.await(this.f4377d, TimeUnit.MILLISECONDS)) {
                    return;
                }
                m5410a();
            } catch (InterruptedException e) {
                m5410a();
            }
        }
    }

    public C0677a(Context context) {
        this(context, 30000L, false, false);
    }

    public C0677a(Context context, long j, boolean z, boolean z2) {
        this.f4367d = new Object();
        C1221aj.m7065a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            this.f4369f = applicationContext != null ? applicationContext : context;
        } else {
            this.f4369f = context;
        }
        this.f4366c = false;
        this.f4371h = j;
        this.f4370g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static a m5396a(Context context) {
        C0679c c0679c = new C0679c(context);
        boolean zM5413a = c0679c.m5413a("gads:ad_id_app_context:enabled", false);
        float fM5411a = c0679c.m5411a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strM5412a = c0679c.m5412a("gads:ad_id_use_shared_preference:experiment_id", "");
        C0677a c0677a = new C0677a(context, -1L, zM5413a, c0679c.m5413a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c0677a.m5401b(false);
                a aVarM5405b = c0677a.m5405b();
                c0677a.m5400a(aVarM5405b, zM5413a, fM5411a, SystemClock.elapsedRealtime() - jElapsedRealtime, strM5412a, null);
                return aVarM5405b;
            } finally {
            }
        } finally {
            c0677a.m5407d();
        }
    }

    /* JADX INFO: renamed from: a */
    private static ServiceConnectionC1210i m5397a(Context context, boolean z) throws IOException, C1205d {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (C1283m.m7222b().mo7040a(context)) {
                case 0:
                case 2:
                    String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                    ServiceConnectionC1210i serviceConnectionC1210i = new ServiceConnectionC1210i();
                    Intent intent = new Intent(str);
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (C1290a.m7240a().m7241a(context, intent, serviceConnectionC1210i, 1)) {
                            return serviceConnectionC1210i;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                case 1:
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new C1205d(9);
        }
    }

    /* JADX INFO: renamed from: a */
    private static bsv m5398a(Context context, ServiceConnectionC1210i serviceConnectionC1210i) throws IOException {
        try {
            return bsw.m10191a(serviceConnectionC1210i.m7053a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5399a(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m5400a(a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            map.put("limit_ad_tracking", aVar.m5409b() ? "1" : "0");
        }
        if (aVar != null && aVar.m5408a() != null) {
            map.put("ad_id_size", Integer.toString(aVar.m5408a().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new C0678b(this, map).start();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final void m5401b(boolean z) {
        C1221aj.m7077c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4366c) {
                m5407d();
            }
            this.f4364a = m5397a(this.f4369f, this.f4370g);
            this.f4365b = m5398a(this.f4369f, this.f4364a);
            this.f4366c = true;
            if (z) {
                m5403e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5402b(Context context) {
        C0679c c0679c = new C0679c(context);
        C0677a c0677a = new C0677a(context, -1L, c0679c.m5413a("gads:ad_id_app_context:enabled", false), c0679c.m5413a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            c0677a.m5401b(false);
            return c0677a.m5406c();
        } finally {
            c0677a.m5407d();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m5403e() {
        synchronized (this.f4367d) {
            if (this.f4368e != null) {
                this.f4368e.f4374a.countDown();
                try {
                    this.f4368e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f4371h > 0) {
                this.f4368e = new b(this, this.f4371h);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5404a() {
        m5401b(true);
    }

    /* JADX INFO: renamed from: b */
    public a m5405b() {
        a aVar;
        C1221aj.m7077c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4366c) {
                C1221aj.m7065a(this.f4364a);
                C1221aj.m7065a(this.f4365b);
                aVar = new a(this.f4365b.mo10188a(), this.f4365b.mo10189a(true));
            } else {
                synchronized (this.f4367d) {
                    if (this.f4368e == null || !this.f4368e.f4375b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m5401b(false);
                    if (!this.f4366c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    C1221aj.m7065a(this.f4364a);
                    C1221aj.m7065a(this.f4365b);
                    try {
                        aVar = new a(this.f4365b.mo10188a(), this.f4365b.mo10189a(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        m5403e();
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public boolean m5406c() {
        boolean zMo10190b;
        C1221aj.m7077c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4366c) {
                C1221aj.m7065a(this.f4364a);
                C1221aj.m7065a(this.f4365b);
                zMo10190b = this.f4365b.mo10190b();
            } else {
                synchronized (this.f4367d) {
                    if (this.f4368e == null || !this.f4368e.f4375b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m5401b(false);
                    if (!this.f4366c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    C1221aj.m7065a(this.f4364a);
                    C1221aj.m7065a(this.f4365b);
                    try {
                        zMo10190b = this.f4365b.mo10190b();
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        m5403e();
        return zMo10190b;
    }

    /* JADX INFO: renamed from: d */
    public void m5407d() {
        C1221aj.m7077c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4369f == null || this.f4364a == null) {
                return;
            }
            try {
                if (this.f4366c) {
                    C1290a.m7240a();
                    this.f4369f.unbindService(this.f4364a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f4366c = false;
            this.f4365b = null;
            this.f4364a = null;
        }
    }

    protected void finalize() throws Throwable {
        m5407d();
        super.finalize();
    }
}
