package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aqw {

    /* JADX INFO: renamed from: a */
    private final Map<String, are> f7106a = new HashMap();

    /* JADX INFO: renamed from: b */
    private are f7107b;

    /* JADX INFO: renamed from: a */
    public final aqu m8173a() {
        return new aqu(this.f7106a, this.f7107b);
    }

    /* JADX INFO: renamed from: a */
    public final aqw m8174a(are areVar) {
        this.f7107b = areVar;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final aqw m8175a(String str, are areVar) {
        this.f7106a.put(str, areVar);
        return this;
    }
}
