package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bra extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final List<String> f8691a;

    public bra(bqa bqaVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f8691a = null;
    }

    /* JADX INFO: renamed from: a */
    public final bpf m10019a() {
        return new bpf(getMessage());
    }
}
