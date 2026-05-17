package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cmv implements cmz {

    /* JADX INFO: renamed from: a */
    private static final Object f10393a = new Object();

    /* JADX INFO: renamed from: b */
    private static cmz f10394b = null;

    /* JADX INFO: renamed from: d */
    private final Context f10396d;

    /* JADX INFO: renamed from: g */
    private final C1670jo f10399g;

    /* JADX INFO: renamed from: c */
    private final Object f10395c = new Object();

    /* JADX INFO: renamed from: e */
    private final WeakHashMap<Thread, Boolean> f10397e = new WeakHashMap<>();

    /* JADX INFO: renamed from: f */
    private final ExecutorService f10398f = Executors.newCachedThreadPool();

    private cmv(Context context) {
        this.f10396d = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10399g = C1670jo.m11616a();
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            synchronized (this.f10395c) {
                this.f10397e.put(thread, true);
            }
            thread.setUncaughtExceptionHandler(new cmx(this, thread.getUncaughtExceptionHandler()));
        }
        Thread.setDefaultUncaughtExceptionHandler(new cmw(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* JADX INFO: renamed from: a */
    private final Uri.Builder m11139a(String str, String str2, String str3, int i) {
        boolean zM12557a = false;
        try {
            zM12557a = C2040xg.m12562a(this.f10396d).m12557a();
        } catch (Throwable th) {
            C1668jm.m11611b("Error fetching instant app info", th);
        }
        String packageName = "unknown";
        try {
            packageName = this.f10396d.getPackageName();
        } catch (Throwable th2) {
            C1668jm.m11615e("Cannot obtain package name, proceeding.");
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zM12557a)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str4 = Build.MANUFACTURER;
        String string = Build.MODEL;
        if (!string.startsWith(str4)) {
            string = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(string).length()).append(str4).append(" ").append(string).toString();
        }
        return builderAppendQueryParameter.appendQueryParameter("device", string).appendQueryParameter("js", this.f10399g.f10855a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", can.m10548a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "179146524").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", bxm.m10406c()).appendQueryParameter("sampling_rate", Integer.toString(1)).appendQueryParameter("pb_tm", String.valueOf(bxm.m10409f().m10546a(can.f9547cN)));
    }

    /* JADX INFO: renamed from: a */
    public static cmz m11140a(Context context) {
        synchronized (f10393a) {
            if (f10394b == null) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9480b)).booleanValue()) {
                    f10394b = new cmv(context);
                } else {
                    f10394b = new cna();
                }
            }
        }
        return f10394b;
    }

    /* JADX INFO: renamed from: a */
    private final void m11141a(List<String> list) {
        for (String str : list) {
            this.f10398f.submit(new cmy(this, new C1669jn(), str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void m11142a(Thread thread, Throwable th) {
        boolean z;
        if (th != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    if (C1657jb.m11574b(stackTraceElement.getClassName())) {
                        z3 = true;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        z2 = true;
                    }
                }
            }
            z = z3 && !z2;
        }
        if (!z || C1657jb.m11565a(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        ayg.m8688a(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        if (Math.random() < 1.0d) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m11139a(name, string, "", 1).toString());
            m11141a(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.cmz
    /* JADX INFO: renamed from: a */
    public final void mo11143a(Throwable th, String str) {
        if (C1657jb.m11565a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            ayg.m8688a(th, new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (Math.random() < 1.0d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m11139a(name, string, str, 1).toString());
                m11141a(arrayList);
            }
        }
    }
}
