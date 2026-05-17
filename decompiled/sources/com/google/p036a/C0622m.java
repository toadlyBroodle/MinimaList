package com.google.p036a;

import com.google.p036a.p038b.C0602g;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0622m extends AbstractC0619j {

    /* JADX INFO: renamed from: a */
    private final C0602g<String, AbstractC0619j> f4278a = new C0602g<>();

    /* JADX INFO: renamed from: a */
    public void m5289a(String str, AbstractC0619j abstractC0619j) {
        if (abstractC0619j == null) {
            abstractC0619j = C0621l.f4277a;
        }
        this.f4278a.put(str, abstractC0619j);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0622m) && ((C0622m) obj).f4278a.equals(this.f4278a));
    }

    public int hashCode() {
        return this.f4278a.hashCode();
    }

    /* JADX INFO: renamed from: o */
    public Set<Map.Entry<String, AbstractC0619j>> m5290o() {
        return this.f4278a.entrySet();
    }
}
