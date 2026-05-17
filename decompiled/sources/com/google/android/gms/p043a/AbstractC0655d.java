package com.google.android.gms.p043a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C1319w;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.a.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655d<T> {

    /* JADX INFO: renamed from: a */
    private final String f4336a;

    /* JADX INFO: renamed from: b */
    private T f4337b;

    protected AbstractC0655d(String str) {
        this.f4336a = str;
    }

    /* JADX INFO: renamed from: a */
    protected final T m5331a(Context context) throws C0656e {
        if (this.f4337b == null) {
            C1221aj.m7065a(context);
            Context contextM7316f = C1319w.m7316f(context);
            if (contextM7316f == null) {
                throw new C0656e("Could not get remote context.");
            }
            try {
                this.f4337b = mo5332a((IBinder) contextM7316f.getClassLoader().loadClass(this.f4336a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0656e("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new C0656e("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new C0656e("Could not instantiate creator.", e3);
            }
        }
        return this.f4337b;
    }

    /* JADX INFO: renamed from: a */
    protected abstract T mo5332a(IBinder iBinder);
}
