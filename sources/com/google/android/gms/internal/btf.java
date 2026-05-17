package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class btf implements bup {

    /* JADX INFO: renamed from: a */
    private WeakReference<cbz> f8963a;

    public btf(cbz cbzVar) {
        this.f8963a = new WeakReference<>(cbzVar);
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: a */
    public final View mo10239a() {
        cbz cbzVar = this.f8963a.get();
        if (cbzVar != null) {
            return cbzVar.mo10685h();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: b */
    public final boolean mo10240b() {
        return this.f8963a.get() == null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: c */
    public final bup mo10241c() {
        return new bth(this.f8963a.get());
    }
}
