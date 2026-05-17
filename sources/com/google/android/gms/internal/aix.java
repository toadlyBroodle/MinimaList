package com.google.android.gms.internal;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.tagmanager.InterfaceC2128h;
import com.google.android.gms.tagmanager.InterfaceC2137q;
import com.google.android.gms.tagmanager.TagManagerService;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class aix {

    /* JADX INFO: renamed from: b */
    private static volatile aix f6884b;

    /* JADX INFO: renamed from: c */
    private final Context f6886c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2137q f6887d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2128h f6888e;

    /* JADX INFO: renamed from: f */
    private final ajt f6889f;

    /* JADX INFO: renamed from: g */
    private final ExecutorService f6890g;

    /* JADX INFO: renamed from: h */
    private final ScheduledExecutorService f6891h;

    /* JADX INFO: renamed from: i */
    private final aia f6892i;

    /* JADX INFO: renamed from: j */
    private final C1365a f6893j;

    /* JADX INFO: renamed from: l */
    private String f6895l;

    /* JADX INFO: renamed from: m */
    private String f6896m;

    /* JADX INFO: renamed from: a */
    private static final Pattern f6883a = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);

    /* JADX INFO: renamed from: r */
    private static InterfaceC1367c f6885r = new aiy();

    /* JADX INFO: renamed from: k */
    private final Object f6894k = new Object();

    /* JADX INFO: renamed from: n */
    private int f6897n = 1;

    /* JADX INFO: renamed from: o */
    private final Queue<Runnable> f6898o = new LinkedList();

    /* JADX INFO: renamed from: p */
    private volatile boolean f6899p = false;

    /* JADX INFO: renamed from: q */
    private volatile boolean f6900q = false;

    /* JADX INFO: renamed from: com.google.android.gms.internal.aix$a */
    public static class C1365a {

        /* JADX INFO: renamed from: a */
        private final Context f6901a;

        public C1365a(Context context) {
            this.f6901a = context;
        }

        /* JADX INFO: renamed from: a */
        public final String[] m8049a() {
            return this.f6901a.getAssets().list("");
        }

        /* JADX INFO: renamed from: a */
        public final String[] m8050a(String str) {
            return this.f6901a.getAssets().list(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.aix$b */
    class BinderC1366b extends ahl {
        private BinderC1366b() {
        }

        /* synthetic */ BinderC1366b(aix aixVar, aiy aiyVar) {
            this();
        }

        @Override // com.google.android.gms.internal.ahk
        /* JADX INFO: renamed from: a */
        public final void mo7930a(boolean z, String str) {
            aix.this.f6890g.execute(new ajj(this, z, str));
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.aix$c */
    public interface InterfaceC1367c {
        /* JADX INFO: renamed from: a */
        aix mo8051a(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h);
    }

    aix(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h, ajt ajtVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, aia aiaVar, C1365a c1365a) {
        C1221aj.m7065a(context);
        C1221aj.m7065a(interfaceC2137q);
        this.f6886c = context;
        this.f6887d = interfaceC2137q;
        this.f6888e = interfaceC2128h;
        this.f6889f = ajtVar;
        this.f6890g = executorService;
        this.f6891h = scheduledExecutorService;
        this.f6892i = aiaVar;
        this.f6893j = c1365a;
    }

    /* JADX INFO: renamed from: a */
    public static aix m8034a(Context context, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        C1221aj.m7065a(context);
        C1221aj.m7065a(context);
        aix aixVarMo8051a = f6884b;
        if (aixVarMo8051a == null) {
            synchronized (aix.class) {
                aixVarMo8051a = f6884b;
                if (aixVarMo8051a == null) {
                    aixVarMo8051a = f6885r.mo8051a(context, interfaceC2137q, interfaceC2128h);
                    f6884b = aixVarMo8051a;
                }
            }
        }
        return aixVarMo8051a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8035a(Context context, Class<? extends Service> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 4);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m8036a(aix aixVar, boolean z) {
        aixVar.f6899p = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final Pair<String, String> m8037b(String[] strArr) {
        ahs.m7947d("Looking up container asset.");
        if (this.f6895l != null && this.f6896m != null) {
            return Pair.create(this.f6895l, this.f6896m);
        }
        try {
            String[] strArrM8050a = this.f6893j.m8050a("containers");
            boolean z = false;
            for (int i = 0; i < strArrM8050a.length; i++) {
                Matcher matcher = f6883a.matcher(strArrM8050a[i]);
                if (!matcher.matches()) {
                    ahs.m7944b(String.format("Ignoring container asset %s (does not match %s)", strArrM8050a[i], f6883a.pattern()));
                } else if (z) {
                    String strValueOf = String.valueOf(strArrM8050a[i]);
                    ahs.m7944b(strValueOf.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(strValueOf) : new String("Extra container asset found, will not be loaded: "));
                } else {
                    this.f6895l = matcher.group(1);
                    String str = File.separator;
                    String str2 = strArrM8050a[i];
                    this.f6896m = new StringBuilder(String.valueOf("containers").length() + String.valueOf(str).length() + String.valueOf(str2).length()).append("containers").append(str).append(str2).toString();
                    String strValueOf2 = String.valueOf(this.f6895l);
                    ahs.m7947d(strValueOf2.length() != 0 ? "Asset found for container ".concat(strValueOf2) : new String("Asset found for container "));
                    z = true;
                }
            }
            if (!z) {
                ahs.m7944b("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] strArrM8049a = this.f6893j.m8049a();
                    for (int i2 = 0; i2 < strArrM8049a.length; i2++) {
                        Matcher matcher2 = f6883a.matcher(strArrM8049a[i2]);
                        if (matcher2.matches()) {
                            if (z) {
                                String strValueOf3 = String.valueOf(strArrM8049a[i2]);
                                ahs.m7944b(strValueOf3.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(strValueOf3) : new String("Extra container asset found, will not be loaded: "));
                            } else {
                                this.f6895l = matcher2.group(1);
                                this.f6896m = strArrM8049a[i2];
                                String strValueOf4 = String.valueOf(this.f6895l);
                                ahs.m7947d(strValueOf4.length() != 0 ? "Asset found for container ".concat(strValueOf4) : new String("Asset found for container "));
                                ahs.m7944b("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z = true;
                            }
                        }
                    }
                } catch (IOException e) {
                    ahs.m7943a("Failed to enumerate assets.", e);
                    return Pair.create(null, null);
                }
            }
            return Pair.create(this.f6895l, this.f6896m);
        } catch (IOException e2) {
            ahs.m7943a(String.format("Failed to enumerate assets in folder %s", "containers"), e2);
            return Pair.create(null, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8046a() {
        ahs.m7947d("Initializing Tag Manager.");
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f6894k) {
            if (this.f6899p) {
                return;
            }
            try {
                if (!m8035a(this.f6886c, (Class<? extends Service>) TagManagerService.class)) {
                    ahs.m7944b("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                    return;
                }
                Pair<String, String> pairM8037b = m8037b((String[]) null);
                String str = (String) pairM8037b.first;
                String str2 = (String) pairM8037b.second;
                if (str == null || str2 == null) {
                    ahs.m7944b("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                } else {
                    String strValueOf = String.valueOf(str);
                    ahs.m7946c(strValueOf.length() != 0 ? "Loading container ".concat(strValueOf) : new String("Loading container "));
                    this.f6890g.execute(new ajd(this, str, str2, null));
                    this.f6891h.schedule(new aje(this), 5000L, TimeUnit.MILLISECONDS);
                    if (!this.f6900q) {
                        ahs.m7946c("Installing Tag Manager event handler.");
                        this.f6900q = true;
                        try {
                            this.f6887d.mo12817a(new aiz(this));
                        } catch (RemoteException e) {
                            agw.m7887a("Error communicating with measurement proxy: ", e, this.f6886c);
                        }
                        try {
                            this.f6887d.mo12816a(new ajb(this));
                        } catch (RemoteException e2) {
                            agw.m7887a("Error communicating with measurement proxy: ", e2, this.f6886c);
                        }
                        this.f6886c.registerComponentCallbacks(new ajg(this));
                        ahs.m7946c("Tag Manager event handler installed.");
                    }
                }
                this.f6899p = true;
                ahs.m7946c(new StringBuilder(53).append("Tag Manager initilization took ").append(System.currentTimeMillis() - jCurrentTimeMillis).append("ms").toString());
            } finally {
                this.f6899p = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m8047a(Uri uri) {
        this.f6890g.execute(new aji(this, uri));
    }

    /* JADX INFO: renamed from: a */
    public final void m8048a(String[] strArr) {
        ahs.m7947d("Initializing Tag Manager.");
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f6894k) {
            if (this.f6899p) {
                return;
            }
            try {
                if (!m8035a(this.f6886c, (Class<? extends Service>) TagManagerService.class)) {
                    ahs.m7944b("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                    return;
                }
                Pair<String, String> pairM8037b = m8037b((String[]) null);
                String str = (String) pairM8037b.first;
                String str2 = (String) pairM8037b.second;
                if (str == null || str2 == null) {
                    ahs.m7944b("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                } else {
                    String strValueOf = String.valueOf(str);
                    ahs.m7946c(strValueOf.length() != 0 ? "Loading container ".concat(strValueOf) : new String("Loading container "));
                    this.f6890g.execute(new ajd(this, str, str2, null));
                    this.f6891h.schedule(new aje(this), 5000L, TimeUnit.MILLISECONDS);
                    if (!this.f6900q) {
                        ahs.m7946c("Installing Tag Manager event handler.");
                        this.f6900q = true;
                        try {
                            this.f6887d.mo12817a(new aiz(this));
                        } catch (RemoteException e) {
                            agw.m7887a("Error communicating with measurement proxy: ", e, this.f6886c);
                        }
                        try {
                            this.f6887d.mo12816a(new ajb(this));
                        } catch (RemoteException e2) {
                            agw.m7887a("Error communicating with measurement proxy: ", e2, this.f6886c);
                        }
                        this.f6886c.registerComponentCallbacks(new ajg(this));
                        ahs.m7946c("Tag Manager event handler installed.");
                    }
                }
                this.f6899p = true;
                ahs.m7946c(new StringBuilder(53).append("Tag Manager initilization took ").append(System.currentTimeMillis() - jCurrentTimeMillis).append("ms").toString());
            } finally {
                this.f6899p = true;
            }
        }
    }
}
