package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.C0025a;
import android.support.v4.p007b.C0175b;
import android.support.v4.p018i.C0207a;
import android.support.v4.p018i.C0208b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1153cn;
import com.google.android.gms.common.internal.C1218ag;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1298b;
import com.google.android.gms.common.util.C1312p;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0967h;
import com.google.firebase.auth.C2200n;
import com.google.firebase.p053a.C2149b;
import com.google.firebase.p053a.C2150c;
import com.google.firebase.p053a.C2151d;
import com.google.firebase.p053a.InterfaceC2147a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.firebase.b */
/* JADX INFO: loaded from: classes.dex */
public class C2213b {

    /* JADX INFO: renamed from: h */
    private final Context f12877h;

    /* JADX INFO: renamed from: i */
    private final String f12878i;

    /* JADX INFO: renamed from: j */
    private final C2283e f12879j;

    /* JADX INFO: renamed from: p */
    private InterfaceC2147a f12885p;

    /* JADX INFO: renamed from: b */
    private static final List<String> f12871b = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");

    /* JADX INFO: renamed from: c */
    private static final List<String> f12872c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* JADX INFO: renamed from: d */
    private static final List<String> f12873d = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");

    /* JADX INFO: renamed from: e */
    private static final List<String> f12874e = Arrays.asList(new String[0]);

    /* JADX INFO: renamed from: f */
    private static final Set<String> f12875f = Collections.emptySet();

    /* JADX INFO: renamed from: g */
    private static final Object f12876g = new Object();

    /* JADX INFO: renamed from: a */
    static final Map<String, C2213b> f12870a = new C0207a();

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f12880k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private final AtomicBoolean f12881l = new AtomicBoolean();

    /* JADX INFO: renamed from: m */
    private final List<a> f12882m = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: n */
    private final List<b> f12883n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o */
    private final List<Object> f12884o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: q */
    private c f12886q = new C2149b();

    /* JADX INFO: renamed from: com.google.firebase.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8803a(C2151d c2151d);
    }

    /* JADX INFO: renamed from: com.google.firebase.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo8815a(boolean z);
    }

    /* JADX INFO: renamed from: com.google.firebase.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo12822a(int i);
    }

    /* JADX INFO: renamed from: com.google.firebase.b$d */
    @TargetApi(24)
    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private static AtomicReference<d> f12887a = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        private final Context f12888b;

        private d(Context context) {
            this.f12888b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m12941b(Context context) {
            if (f12887a.get() == null) {
                d dVar = new d(context);
                if (f12887a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (C2213b.f12876g) {
                Iterator<C2213b> it = C2213b.f12870a.values().iterator();
                while (it.hasNext()) {
                    it.next().m12928j();
                }
            }
            this.f12888b.unregisterReceiver(this);
        }
    }

    private C2213b(Context context, String str, C2283e c2283e) {
        this.f12877h = (Context) C1221aj.m7065a(context);
        this.f12878i = C1221aj.m7067a(str);
        this.f12879j = (C2283e) C1221aj.m7065a(c2283e);
    }

    /* JADX INFO: renamed from: a */
    public static C2213b m12916a(Context context) {
        C2213b c2213bM12917a;
        synchronized (f12876g) {
            if (f12870a.containsKey("[DEFAULT]")) {
                c2213bM12917a = m12924d();
            } else {
                C2283e c2283eM13022a = C2283e.m13022a(context);
                c2213bM12917a = c2283eM13022a == null ? null : m12917a(context, c2283eM13022a);
            }
        }
        return c2213bM12917a;
    }

    /* JADX INFO: renamed from: a */
    public static C2213b m12917a(Context context, C2283e c2283e) {
        return m12918a(context, c2283e, "[DEFAULT]");
    }

    /* JADX INFO: renamed from: a */
    public static C2213b m12918a(Context context, C2283e c2283e, String str) {
        C2213b c2213b;
        C2150c.m12824a(context);
        if (context.getApplicationContext() instanceof Application) {
            ComponentCallbacks2C1153cn.m6940a((Application) context.getApplicationContext());
            ComponentCallbacks2C1153cn.m6939a().m6942a(new C2285g());
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f12876g) {
            C1221aj.m7071a(!f12870a.containsKey(strTrim), new StringBuilder(String.valueOf(strTrim).length() + 33).append("FirebaseApp name ").append(strTrim).append(" already exists!").toString());
            C1221aj.m7066a(context, "Application context cannot be null.");
            c2213b = new C2213b(context, strTrim, c2283e);
            f12870a.put(strTrim, c2213b);
        }
        C2150c.m12825a(c2213b);
        c2213b.m12921a((Class<C2213b>) C2213b.class, c2213b, f12871b);
        if (c2213b.m12938e()) {
            c2213b.m12921a((Class<C2213b>) C2213b.class, c2213b, f12872c);
            c2213b.m12921a((Class<Context>) Context.class, c2213b.m12929a(), f12873d);
        }
        return c2213b;
    }

    /* JADX INFO: renamed from: a */
    public static C2213b m12919a(String str) {
        C2213b c2213b;
        String strConcat;
        synchronized (f12876g) {
            c2213b = f12870a.get(str.trim());
            if (c2213b == null) {
                List<String> listM12927i = m12927i();
                if (listM12927i.isEmpty()) {
                    strConcat = "";
                } else {
                    String strValueOf = String.valueOf(TextUtils.join(", ", listM12927i));
                    strConcat = strValueOf.length() != 0 ? "Available app names: ".concat(strValueOf) : new String("Available app names: ");
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, strConcat));
            }
        }
        return c2213b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final <T> void m12921a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean zM1338a = C0175b.m1338a(this.f12877h);
        if (zM1338a) {
            d.m12941b(this.f12877h);
        }
        for (String str : iterable) {
            if (zM1338a) {
                try {
                } catch (ClassNotFoundException e) {
                    if (f12875f.contains(str)) {
                        throw new IllegalStateException(String.valueOf(str).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(str).concat(" is not linked. Skipping initialization."));
                } catch (IllegalAccessException e2) {
                    String strValueOf = String.valueOf(str);
                    Log.wtf("FirebaseApp", strValueOf.length() != 0 ? "Failed to initialize ".concat(strValueOf) : new String("Failed to initialize "), e2);
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(String.valueOf(str).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e4) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e4);
                }
                if (f12874e.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12922a(boolean z) {
        synchronized (f12876g) {
            ArrayList arrayList = new ArrayList(f12870a.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C2213b c2213b = (C2213b) obj;
                if (c2213b.f12880k.get()) {
                    c2213b.m12923c(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m12923c(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f12883n.iterator();
        while (it.hasNext()) {
            it.next().mo8815a(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C2213b m12924d() {
        C2213b c2213b;
        synchronized (f12876g) {
            c2213b = f12870a.get("[DEFAULT]");
            if (c2213b == null) {
                String strM7287a = C1312p.m7287a();
                throw new IllegalStateException(new StringBuilder(String.valueOf(strM7287a).length() + C0025a.j.AppCompatTheme_windowMinWidthMajor).append("Default FirebaseApp is not initialized in this process ").append(strM7287a).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return c2213b;
    }

    /* JADX INFO: renamed from: h */
    private final void m12926h() {
        C1221aj.m7071a(!this.f12881l.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: renamed from: i */
    private static List<String> m12927i() {
        C0208b c0208b = new C0208b();
        synchronized (f12876g) {
            Iterator<C2213b> it = f12870a.values().iterator();
            while (it.hasNext()) {
                c0208b.add(it.next().m12936b());
            }
            if (C2150c.m12823a() != null) {
                c0208b.addAll(C2150c.m12826b());
            }
        }
        ArrayList arrayList = new ArrayList(c0208b);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m12928j() {
        m12921a((Class<C2213b>) C2213b.class, this, f12871b);
        if (m12938e()) {
            m12921a((Class<C2213b>) C2213b.class, this, f12872c);
            m12921a((Class<Context>) Context.class, this.f12877h, f12873d);
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m12929a() {
        m12926h();
        return this.f12877h;
    }

    /* JADX INFO: renamed from: a */
    public final void m12930a(InterfaceC2147a interfaceC2147a) {
        this.f12885p = (InterfaceC2147a) C1221aj.m7065a(interfaceC2147a);
    }

    /* JADX INFO: renamed from: a */
    public final void m12931a(C2151d c2151d) {
        Log.d("FirebaseApp", "Notifying auth state listeners.");
        Iterator<a> it = this.f12882m.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().mo8803a(c2151d);
            i++;
        }
        Log.d("FirebaseApp", String.format("Notified %d auth state listeners.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: a */
    public final void m12932a(a aVar) {
        m12926h();
        C1221aj.m7065a(aVar);
        this.f12882m.add(aVar);
        this.f12886q.mo12822a(this.f12882m.size());
    }

    /* JADX INFO: renamed from: a */
    public final void m12933a(b bVar) {
        m12926h();
        if (this.f12880k.get() && ComponentCallbacks2C1153cn.m6939a().m6944b()) {
            bVar.mo8815a(true);
        }
        this.f12883n.add(bVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m12934a(c cVar) {
        this.f12886q = (c) C1221aj.m7065a(cVar);
        this.f12886q.mo12822a(this.f12882m.size());
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0964e<C2200n> m12935b(boolean z) {
        m12926h();
        return this.f12885p == null ? C0967h.m6222a((Exception) new C2146a("firebase-auth is not linked, please fall back to unauthenticated mode.")) : this.f12885p.mo12821a(z);
    }

    /* JADX INFO: renamed from: b */
    public String m12936b() {
        m12926h();
        return this.f12878i;
    }

    /* JADX INFO: renamed from: c */
    public C2283e m12937c() {
        m12926h();
        return this.f12879j;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12938e() {
        return "[DEFAULT]".equals(m12936b());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2213b) {
            return this.f12878i.equals(((C2213b) obj).m12936b());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m12939f() {
        String strM7250b = C1298b.m7250b(m12936b().getBytes());
        String strM7250b2 = C1298b.m7250b(m12937c().m13024b().getBytes());
        return new StringBuilder(String.valueOf(strM7250b).length() + 1 + String.valueOf(strM7250b2).length()).append(strM7250b).append("+").append(strM7250b2).toString();
    }

    public int hashCode() {
        return this.f12878i.hashCode();
    }

    public String toString() {
        return C1218ag.m7062a(this).m7064a("name", this.f12878i).m7064a("options", this.f12879j).toString();
    }
}
