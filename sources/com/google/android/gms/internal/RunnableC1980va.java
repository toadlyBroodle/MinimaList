package com.google.android.gms.internal;

import com.google.android.gms.cast.C0991e;

/* JADX INFO: renamed from: com.google.android.gms.internal.va */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1980va implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1973uu f11777a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f11778b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f11779c;

    RunnableC1980va(BinderC1975uw binderC1975uw, C1973uu c1973uu, String str, String str2) {
        this.f11777a = c1973uu;
        this.f11778b = str;
        this.f11779c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0991e.e eVar;
        synchronized (this.f11777a.f11691h) {
            eVar = (C0991e.e) this.f11777a.f11691h.get(this.f11778b);
        }
        if (eVar != null) {
            eVar.mo6327a(this.f11777a.f11689f, this.f11778b, this.f11779c);
        } else {
            C1973uu.f11687d.m12445a("Discarded message for unknown namespace '%s'", this.f11778b);
        }
    }
}
