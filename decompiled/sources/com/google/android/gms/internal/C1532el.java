package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.el */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1532el {

    /* JADX INFO: renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f10508a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    private final Object f10509b = new Object();

    /* JADX INFO: renamed from: c */
    private String f10510c = null;

    /* JADX INFO: renamed from: d */
    private AtomicBoolean f10511d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f10512e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f */
    private final AtomicReference<Object> f10513f = new AtomicReference<>(null);

    /* JADX INFO: renamed from: g */
    private final AtomicReference<Object> f10514g = new AtomicReference<>(null);

    /* JADX INFO: renamed from: h */
    private ConcurrentMap<String, Method> f10515h = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: a */
    private static Bundle m11223a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String strValueOf = String.valueOf(str);
            C1560fm.m11611b(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    private final Object m11224a(String str, Context context) {
        if (!m11227a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10513f, true)) {
            return null;
        }
        try {
            return m11230h(context, str).invoke(this.f10513f.get(), new Object[0]);
        } catch (Exception e) {
            m11226a(e, str, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11225a(Context context, String str, Bundle bundle) {
        if (m11236a(context) && m11227a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10513f, true)) {
            try {
                m11232k(context).invoke(this.f10513f.get(), "am", str, bundle);
            } catch (Exception e) {
                m11226a(e, "logEventInternal", true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11226a(Exception exc, String str, boolean z) {
        if (this.f10511d.get()) {
            return;
        }
        C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 30).append("Invoke Firebase method ").append(str).append(" error.").toString());
        if (z) {
            C1560fm.m11615e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f10511d.set(true);
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m11227a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                m11226a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final void m11228b(Context context, String str, String str2) {
        if (m11227a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10513f, true)) {
            try {
                m11229g(context, str2).invoke(this.f10513f.get(), str);
                C1560fm.m11343a(new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length()).append("Invoke Firebase method ").append(str2).append(", Ad Unit Id: ").append(str).toString());
            } catch (Exception e) {
                m11226a(e, str2, false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final Method m11229g(Context context, String str) {
        Method method = this.f10515h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.f10515h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m11226a(e, str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private final Method m11230h(Context context, String str) {
        Method method = this.f10515h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f10515h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m11226a(e, str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private final Method m11231i(Context context, String str) {
        Method method = this.f10515h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.f10515h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m11226a(e, str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private final Method m11232k(Context context) {
        Method method = this.f10515h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.f10515h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m11226a(e, "logEventInternal", true);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11233a(Context context, String str) {
        if (m11236a(context)) {
            m11228b(context, str, "beginAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11234a(Context context, String str, String str2) {
        if (m11236a(context)) {
            m11225a(context, str, m11223a(context, str2, "_ac".equals(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11235a(Context context, String str, String str2, String str3, int i) {
        if (m11236a(context)) {
            Bundle bundleM11223a = m11223a(context, str, false);
            bundleM11223a.putString("_ai", str2);
            bundleM11223a.putString("type", str3);
            bundleM11223a.putInt("value", i);
            m11225a(context, "_ar", bundleM11223a);
            C1560fm.m11343a(new StringBuilder(String.valueOf(str3).length() + 75).append("Log a Firebase reward video event, reward type: ").append(str3).append(", reward value: ").append(i).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11236a(Context context) {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9459af)).booleanValue() || this.f10511d.get()) {
            return false;
        }
        if (this.f10512e.get() == -1) {
            bxm.m10404a();
            if (!C1657jb.m11576c(context)) {
                bxm.m10404a();
                if (C1657jb.m11579f(context)) {
                    C1560fm.m11615e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f10512e.set(0);
                } else {
                    this.f10512e.set(1);
                }
            }
        }
        return this.f10512e.get() == 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m11237b(Context context, String str) {
        if (m11236a(context)) {
            m11228b(context, str, "endAdUnitExposure");
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11238b(Context context) {
        return ((Boolean) bxm.m10409f().m10546a(can.f9460ag)).booleanValue() && m11236a(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m11239c(Context context, String str) {
        if (m11236a(context) && (context instanceof Activity) && m11227a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f10514g, false)) {
            try {
                m11231i(context, "setCurrentScreen").invoke(this.f10514g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e) {
                m11226a(e, "setCurrentScreen", false);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11240c(Context context) {
        return ((Boolean) bxm.m10409f().m10546a(can.f9461ah)).booleanValue() && m11236a(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m11241d(Context context, String str) {
        m11234a(context, "_ac", str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11242d(Context context) {
        return ((Boolean) bxm.m10409f().m10546a(can.f9462ai)).booleanValue() && m11236a(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m11243e(Context context, String str) {
        m11234a(context, "_ai", str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11244e(Context context) {
        return ((Boolean) bxm.m10409f().m10546a(can.f9463aj)).booleanValue() && m11236a(context);
    }

    /* JADX INFO: renamed from: f */
    public final String m11245f(Context context) {
        if (!m11236a(context) || !m11227a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10513f, true)) {
            return "";
        }
        try {
            String str = (String) m11230h(context, "getCurrentScreenName").invoke(this.f10513f.get(), new Object[0]);
            if (str == null) {
                str = (String) m11230h(context, "getCurrentScreenClass").invoke(this.f10513f.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception e) {
            m11226a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11246f(Context context, String str) {
        m11234a(context, "_aq", str);
    }

    /* JADX INFO: renamed from: g */
    public final String m11247g(Context context) {
        String str;
        if (!m11236a(context)) {
            return null;
        }
        synchronized (this.f10509b) {
            if (this.f10510c != null) {
                str = this.f10510c;
            } else {
                this.f10510c = (String) m11224a("getGmpAppId", context);
                str = this.f10510c;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m11248h(final Context context) {
        if (!m11236a(context)) {
            return null;
        }
        long jLongValue = ((Long) bxm.m10409f().m10546a(can.f9469ap)).longValue();
        if (jLongValue < 0) {
            return (String) m11224a("getAppInstanceId", context);
        }
        if (this.f10508a.get() == null) {
            this.f10508a.compareAndSet(null, new ThreadPoolExecutor(((Integer) bxm.m10409f().m10546a(can.f9470aq)).intValue(), ((Integer) bxm.m10409f().m10546a(can.f9470aq)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC1534en(this)));
        }
        Future futureSubmit = this.f10508a.get().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.em

            /* JADX INFO: renamed from: a */
            private final C1532el f10516a;

            /* JADX INFO: renamed from: b */
            private final Context f10517b;

            {
                this.f10516a = this;
                this.f10517b = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10516a.m11250j(this.f10517b);
            }
        });
        try {
            return (String) futureSubmit.get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            futureSubmit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m11249i(Context context) {
        Object objM11224a;
        if (m11236a(context) && (objM11224a = m11224a("generateEventId", context)) != null) {
            return objM11224a.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    final /* synthetic */ String m11250j(Context context) {
        return (String) m11224a("getAppInstanceId", context);
    }
}
