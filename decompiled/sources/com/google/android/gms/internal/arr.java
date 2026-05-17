package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class arr extends arh<Map<String, arh<?>>> {

    /* JADX INFO: renamed from: b */
    private static final Map<String, ajz> f7164b;

    /* JADX INFO: renamed from: c */
    private boolean f7165c = false;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", amc.f6973a);
        f7164b = Collections.unmodifiableMap(map);
    }

    public arr(Map<String, arh<?>> map) {
        this.f7143a = (Map) C1221aj.m7065a(map);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: a */
    public final Iterator<arh<?>> mo8204a() {
        return m8209c();
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8207b(String str) {
        arh<?> arhVarMo8207b = super.mo8207b(str);
        return arhVarMo8207b == null ? arn.f7154e : arhVarMo8207b;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map<String, arh<?>> mo8208b() {
        return this.f7143a;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7164b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7164b.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m8218d() {
        this.f7165c = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8219e() {
        return this.f7165c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arr) {
            return this.f7143a.entrySet().equals(((arr) obj).mo8208b().entrySet());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7143a.toString();
    }
}
