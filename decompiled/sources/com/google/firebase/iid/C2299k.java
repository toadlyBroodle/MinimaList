package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p051b.AbstractC0964e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.firebase.iid.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2299k {

    /* JADX INFO: renamed from: a */
    private static C2299k f13019a;

    /* JADX INFO: renamed from: b */
    private final Context f13020b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f13021c;

    /* JADX INFO: renamed from: d */
    private ServiceConnectionC2301m f13022d = new ServiceConnectionC2301m(this);

    /* JADX INFO: renamed from: e */
    private int f13023e = 1;

    private C2299k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f13021c = scheduledExecutorService;
        this.f13020b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private final synchronized int m13081a() {
        int i;
        i = this.f13023e;
        this.f13023e = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized <T> AbstractC0964e<T> m13083a(AbstractC2308t<T> abstractC2308t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(abstractC2308t);
            Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(strValueOf).length() + 9).append("Queueing ").append(strValueOf).toString());
        }
        if (!this.f13022d.m13094a(abstractC2308t)) {
            this.f13022d = new ServiceConnectionC2301m(this);
            this.f13022d.m13094a(abstractC2308t);
        }
        return abstractC2308t.f13038b.m6217a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2299k m13084a(Context context) {
        if (f13019a == null) {
            f13019a = new C2299k(context, Executors.newSingleThreadScheduledExecutor());
        }
        return f13019a;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<Void> m13086a(int i, Bundle bundle) {
        return m13083a(new C2307s(m13081a(), 2, bundle));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0964e<Bundle> m13087b(int i, Bundle bundle) {
        return m13083a(new C2310v(m13081a(), 1, bundle));
    }
}
