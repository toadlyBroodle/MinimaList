package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.C0890e;
import com.google.android.gms.internal.C1881rj;
import java.lang.Thread;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.analytics.c */
/* JADX INFO: loaded from: classes.dex */
public class C0888c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private final Thread.UncaughtExceptionHandler f4912a;

    /* JADX INFO: renamed from: b */
    private final C0893h f4913b;

    /* JADX INFO: renamed from: c */
    private final Context f4914c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0887b f4915d;

    /* JADX INFO: renamed from: e */
    private C0889d f4916e;

    public C0888c(C0893h c0893h, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (c0893h == null) {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f4912a = uncaughtExceptionHandler;
        this.f4913b = c0893h;
        this.f4915d = new C0892g(context, new ArrayList());
        this.f4914c = context.getApplicationContext();
        String strValueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
        C1881rj.m12221a(strValueOf.length() != 0 ? "ExceptionReporter created, original handler is ".concat(strValueOf) : new String("ExceptionReporter created, original handler is "));
    }

    /* JADX INFO: renamed from: a */
    final Thread.UncaughtExceptionHandler m5963a() {
        return this.f4912a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String strMo5962a = "UncaughtException";
        if (this.f4915d != null) {
            strMo5962a = this.f4915d.mo5962a(thread != null ? thread.getName() : null, th);
        }
        String strValueOf = String.valueOf(strMo5962a);
        C1881rj.m12221a(strValueOf.length() != 0 ? "Reporting uncaught exception: ".concat(strValueOf) : new String("Reporting uncaught exception: "));
        this.f4913b.m6017a(new C0890e.a().m5982a(strMo5962a).m5983a(true).m5990a());
        if (this.f4916e == null) {
            this.f4916e = C0889d.m5964a(this.f4914c);
        }
        C0889d c0889d = this.f4916e;
        c0889d.m5979f();
        c0889d.m6027g().m12063h().m12012d();
        if (this.f4912a != null) {
            C1881rj.m12221a("Passing exception to the original handler");
            this.f4912a.uncaughtException(thread, th);
        }
    }
}
