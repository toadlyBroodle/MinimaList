package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bti implements bup {

    /* JADX INFO: renamed from: a */
    private final View f8966a;

    /* JADX INFO: renamed from: b */
    private final C1541eu f8967b;

    public bti(View view, C1541eu c1541eu) {
        this.f8966a = view;
        this.f8967b = c1541eu;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: a */
    public final View mo10239a() {
        return this.f8966a;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: b */
    public final boolean mo10240b() {
        return this.f8967b == null || this.f8966a == null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: c */
    public final bup mo10241c() {
        return this;
    }
}
