package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class arg {

    /* JADX INFO: renamed from: a */
    private final Integer f7139a;

    /* JADX INFO: renamed from: b */
    private final Object f7140b;

    /* JADX INFO: renamed from: c */
    private final List<Integer> f7141c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private boolean f7142d = false;

    public arg(int i, Object obj) {
        this.f7139a = Integer.valueOf(i);
        this.f7140b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final are m8201a() {
        C1221aj.m7065a(this.f7139a);
        C1221aj.m7065a(this.f7140b);
        return new are(this.f7139a, this.f7140b, this.f7141c, this.f7142d);
    }

    /* JADX INFO: renamed from: a */
    public final arg m8202a(int i) {
        this.f7141c.add(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final arg m8203a(boolean z) {
        this.f7142d = true;
        return this;
    }
}
