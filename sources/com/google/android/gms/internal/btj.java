package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class btj implements bup {

    /* JADX INFO: renamed from: a */
    private final WeakReference<View> f8968a;

    /* JADX INFO: renamed from: b */
    private final WeakReference<C1541eu> f8969b;

    public btj(View view, C1541eu c1541eu) {
        this.f8968a = new WeakReference<>(view);
        this.f8969b = new WeakReference<>(c1541eu);
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: a */
    public final View mo10239a() {
        return this.f8968a.get();
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: b */
    public final boolean mo10240b() {
        return this.f8968a.get() == null || this.f8969b.get() == null;
    }

    @Override // com.google.android.gms.internal.bup
    /* JADX INFO: renamed from: c */
    public final bup mo10241c() {
        return new bti(this.f8968a.get(), this.f8969b.get());
    }
}
