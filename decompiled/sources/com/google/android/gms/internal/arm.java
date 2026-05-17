package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class arm extends arh<ajz> {

    /* JADX INFO: renamed from: c */
    private static final Map<String, ajz> f7149c;

    /* JADX INFO: renamed from: b */
    private ajz f7150b;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", amc.f6973a);
        f7149c = Collections.unmodifiableMap(map);
    }

    public arm(ajz ajzVar) {
        this.f7150b = ajzVar;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: a */
    public final Iterator<arh<?>> mo8204a() {
        return m8209c();
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ajz mo8208b() {
        return this.f7150b;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7149c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7149c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 60).append("Native Method ").append(str).append(" is not defined for type InstructionReference.").toString());
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7150b.toString();
    }
}
