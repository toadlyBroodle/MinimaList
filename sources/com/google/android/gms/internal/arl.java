package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class arl extends arh<Double> {

    /* JADX INFO: renamed from: c */
    private static final Map<String, ajz> f7147c;

    /* JADX INFO: renamed from: b */
    private Double f7148b;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", amc.f6973a);
        map.put("toString", new anf());
        f7147c = Collections.unmodifiableMap(map);
    }

    public arl(Double d) {
        C1221aj.m7065a(d);
        this.f7148b = d;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Double mo8208b() {
        return this.f7148b;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7147c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7147c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 53).append("Native Method ").append(str).append(" is not defined for type DoubleWrapper.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arl) {
            return this.f7148b.equals(((arl) obj).mo8208b());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7148b.toString();
    }
}
