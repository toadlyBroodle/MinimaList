package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class art extends arh<String> {

    /* JADX INFO: renamed from: c */
    private static final Map<String, ajz> f7168c;

    /* JADX INFO: renamed from: b */
    private final String f7169b;

    static {
        HashMap map = new HashMap();
        map.put("charAt", new amr());
        map.put("concat", new ams());
        map.put("hasOwnProperty", amc.f6973a);
        map.put("indexOf", new amu());
        map.put("lastIndexOf", new amv());
        map.put("match", new amw());
        map.put("replace", new amx());
        map.put("search", new amy());
        map.put("slice", new amz());
        map.put("split", new ana());
        map.put("substring", new anb());
        map.put("toLocaleLowerCase", new anc());
        map.put("toLocaleUpperCase", new and());
        map.put("toLowerCase", new ane());
        map.put("toUpperCase", new ang());
        map.put("toString", new anf());
        map.put("trim", new anh());
        f7168c = Collections.unmodifiableMap(map);
    }

    public art(String str) {
        C1221aj.m7065a(str);
        this.f7169b = str;
    }

    /* JADX INFO: renamed from: a */
    public final arh<?> m8223a(int i) {
        return (i < 0 || i >= this.f7169b.length()) ? arn.f7154e : new art(String.valueOf(this.f7169b.charAt(i)));
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: a */
    public final Iterator<arh<?>> mo8204a() {
        return new aru(this);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String mo8208b() {
        return this.f7169b;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7168c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7168c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof art) {
            return this.f7169b.equals(((art) obj).mo8208b());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7169b.toString();
    }
}
