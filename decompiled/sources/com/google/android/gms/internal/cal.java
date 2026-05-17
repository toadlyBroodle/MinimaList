package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.C1319w;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cal {

    /* JADX INFO: renamed from: a */
    private final Object f9394a = new Object();

    /* JADX INFO: renamed from: b */
    private final ConditionVariable f9395b = new ConditionVariable();

    /* JADX INFO: renamed from: c */
    private volatile boolean f9396c = false;

    /* JADX INFO: renamed from: d */
    private SharedPreferences f9397d = null;

    /* JADX INFO: renamed from: e */
    private Context f9398e;

    /* JADX INFO: renamed from: a */
    public final <T> T m10546a(cac<T> cacVar) {
        if (!this.f9395b.block(5000L)) {
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
        if (!this.f9396c || this.f9397d == null) {
            synchronized (this.f9394a) {
                if (!this.f9396c || this.f9397d == null) {
                    return cacVar.m10536b();
                }
            }
        }
        return (T) C1649iu.m11543a(this.f9398e, new cam(this, cacVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m10547a(Context context) {
        if (this.f9396c) {
            return;
        }
        synchronized (this.f9394a) {
            if (this.f9396c) {
                return;
            }
            this.f9398e = context.getApplicationContext() == null ? context : context.getApplicationContext();
            try {
                Context contextM7316f = C1319w.m7316f(context);
                if (contextM7316f != null || context == null) {
                    context = contextM7316f;
                } else {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (context == null) {
                    return;
                }
                bxm.m10407d();
                this.f9397d = context.getSharedPreferences("google_ads_flags", 0);
                this.f9396c = true;
            } finally {
                this.f9395b.open();
            }
        }
    }
}
