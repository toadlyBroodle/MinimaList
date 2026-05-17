package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aro extends arh<List<arh<?>>> {

    /* JADX INFO: renamed from: c */
    private static final Map<String, ajz> f7158c;

    /* JADX INFO: renamed from: b */
    private final ArrayList<arh<?>> f7159b;

    static {
        HashMap map = new HashMap();
        map.put("concat", new akc());
        map.put("every", new akd());
        map.put("filter", new ake());
        map.put("forEach", new akf());
        map.put("indexOf", new akg());
        map.put("hasOwnProperty", amc.f6973a);
        map.put("join", new akh());
        map.put("lastIndexOf", new aki());
        map.put("map", new akj());
        map.put("pop", new akk());
        map.put("push", new akl());
        map.put("reduce", new akm());
        map.put("reduceRight", new akn());
        map.put("reverse", new ako());
        map.put("shift", new akp());
        map.put("slice", new akq());
        map.put("some", new aks());
        map.put("sort", new akt());
        map.put("splice", new akx());
        map.put("toString", new anf());
        map.put("unshift", new aky());
        f7158c = Collections.unmodifiableMap(map);
    }

    public aro(List<arh<?>> list) {
        C1221aj.m7065a(list);
        this.f7159b = new ArrayList<>(list);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: a */
    public final Iterator<arh<?>> mo8204a() {
        return new arq(this, new arp(this), super.m8209c());
    }

    /* JADX INFO: renamed from: a */
    public final void m8214a(int i) {
        C1221aj.m7075b(i >= 0, "Invalid array length");
        if (this.f7159b.size() == i) {
            return;
        }
        if (this.f7159b.size() >= i) {
            this.f7159b.subList(i, this.f7159b.size()).clear();
            return;
        }
        this.f7159b.ensureCapacity(i);
        for (int size = this.f7159b.size(); size < i; size++) {
            this.f7159b.add(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8215a(int i, arh<?> arhVar) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i >= this.f7159b.size()) {
            m8214a(i + 1);
        }
        this.f7159b.set(i, arhVar);
    }

    /* JADX INFO: renamed from: b */
    public final arh<?> m8216b(int i) {
        if (i < 0 || i >= this.f7159b.size()) {
            return arn.f7154e;
        }
        arh<?> arhVar = this.f7159b.get(i);
        return arhVar == null ? arn.f7154e : arhVar;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List<arh<?>> mo8208b() {
        return this.f7159b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8217c(int i) {
        return i >= 0 && i < this.f7159b.size() && this.f7159b.get(i) != null;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: c */
    public final boolean mo8210c(String str) {
        return f7158c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: d */
    public final ajz mo8211d(String str) {
        if (mo8210c(str)) {
            return f7158c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof aro) {
            List<arh<?>> listMo8208b = ((aro) obj).mo8208b();
            if (this.f7159b.size() == listMo8208b.size()) {
                int i = 0;
                boolean z = true;
                while (true) {
                    if (i >= this.f7159b.size()) {
                        zEquals = z;
                        break;
                    }
                    zEquals = this.f7159b.get(i) == null ? listMo8208b.get(i) == null : this.f7159b.get(i).equals(listMo8208b.get(i));
                    if (!zEquals) {
                        break;
                    }
                    i++;
                    z = zEquals;
                }
                return zEquals;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7159b.toString();
    }
}
