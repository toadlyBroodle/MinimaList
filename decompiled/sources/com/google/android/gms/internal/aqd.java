package com.google.android.gms.internal;

import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class aqd implements InterfaceC1193k {

    /* JADX INFO: renamed from: a */
    private final Status f7062a;

    /* JADX INFO: renamed from: b */
    private final int f7063b;

    /* JADX INFO: renamed from: c */
    private final aqe f7064c;

    /* JADX INFO: renamed from: d */
    private final arb f7065d;

    public aqd(Status status, int i) {
        this(status, i, null, null);
    }

    public aqd(Status status, int i, aqe aqeVar, arb arbVar) {
        this.f7062a = status;
        this.f7063b = i;
        this.f7064c = aqeVar;
        this.f7065d = arbVar;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public final Status mo6094a() {
        return this.f7062a;
    }

    /* JADX INFO: renamed from: b */
    public final aqe m8140b() {
        return this.f7064c;
    }

    /* JADX INFO: renamed from: c */
    public final arb m8141c() {
        return this.f7065d;
    }

    /* JADX INFO: renamed from: d */
    public final int m8142d() {
        return this.f7063b;
    }

    /* JADX INFO: renamed from: e */
    public final String m8143e() {
        if (this.f7063b == 0) {
            return "Network";
        }
        if (this.f7063b == 1) {
            return "Saved file on disk";
        }
        if (this.f7063b == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
