package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ara {

    /* JADX INFO: renamed from: a */
    private final List<aqu> f7125a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<aqu> f7126b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<aqu> f7127c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List<aqu> f7128d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final aqy m8189a() {
        return new aqy(this.f7125a, this.f7126b, this.f7127c, this.f7128d);
    }

    /* JADX INFO: renamed from: a */
    public final ara m8190a(aqu aquVar) {
        this.f7125a.add(aquVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ara m8191b(aqu aquVar) {
        this.f7126b.add(aquVar);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ara m8192c(aqu aquVar) {
        this.f7127c.add(aquVar);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ara m8193d(aqu aquVar) {
        this.f7128d.add(aquVar);
        return this;
    }
}
