package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bth implements bup {

    /* JADX INFO: renamed from: a */
    private cbz f8965a;

    public bth(cbz cbzVar) {
        this.f8965a = cbzVar;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: a */
    public final View mo10239a() {
        if (this.f8965a != null) {
            return this.f8965a.mo10685h();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: b */
    public final boolean mo10240b() {
        return this.f8965a == null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: c */
    public final bup mo10241c() {
        return this;
    }
}
