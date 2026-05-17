package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ard {

    /* JADX INFO: renamed from: a */
    private List<ajy> f7131a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private String f7132b;

    /* JADX INFO: renamed from: a */
    public final arb m8195a() {
        return new arb(this.f7132b, this.f7131a);
    }

    /* JADX INFO: renamed from: a */
    public final ard m8196a(ajy ajyVar) {
        this.f7131a.add(ajyVar);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final ard m8197a(String str) {
        this.f7132b = str;
        return this;
    }
}
