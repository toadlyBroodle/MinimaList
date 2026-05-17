package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ark extends arh<Boolean> {

    /* JADX INFO: renamed from: c */
    private static final Map<String, ajz> f7145c;

    /* JADX INFO: renamed from: b */
    private final Boolean f7146b;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", amc.f6973a);
        map.put("toString", new anf());
        f7145c = Collections.unmodifiableMap(map);
    }

    public ark(Boolean bool) {
        C1221aj.m7065a(bool);
        this.f7146b = bool;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Boolean mo8208b() {
        return this.f7146b;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7145c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7145c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 54).append("Native Method ").append(str).append(" is not defined for type BooleanWrapper.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ark) {
            return ((ark) obj).mo8208b() == this.f7146b;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7146b.toString();
    }
}
