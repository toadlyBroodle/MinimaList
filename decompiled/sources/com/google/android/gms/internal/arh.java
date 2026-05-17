package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class arh<T> {

    /* JADX INFO: renamed from: a */
    protected Map<String, arh<?>> f7143a;

    /* JADX INFO: renamed from: a */
    public Iterator<arh<?>> mo8204a() {
        return new arj(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m8205a(String str, arh<?> arhVar) {
        if (this.f7143a == null) {
            this.f7143a = new HashMap();
        }
        this.f7143a.put(str, arhVar);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8206a(String str) {
        return this.f7143a != null && this.f7143a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public arh<?> mo8207b(String str) {
        return this.f7143a != null ? this.f7143a.get(str) : arn.f7154e;
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo8208b();

    /* JADX INFO: renamed from: c */
    protected final Iterator<arh<?>> m8209c() {
        return this.f7143a == null ? new arj(null) : new ari(this, this.f7143a.keySet().iterator());
    }

    /* JADX INFO: renamed from: c */
    public boolean mo8210c(String str) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public ajz mo8211d(String str) {
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 56).append("Attempting to access Native Method ").append(str).append(" on unsupported type.").toString());
    }

    public abstract String toString();
}
