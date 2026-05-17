package com.google.android.gms.internal;

import com.google.android.gms.internal.aix;

/* JADX INFO: loaded from: classes.dex */
final class ajj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6929a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6930b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ aix.BinderC1366b f6931c;

    ajj(aix.BinderC1366b binderC1366b, boolean z, String str) {
        this.f6931c = binderC1366b;
        this.f6929a = z;
        this.f6930b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (aix.this.f6897n != 2) {
            ahs.m7944b("Container load callback completed after timeout");
            return;
        }
        if (this.f6929a) {
            aix.this.f6897n = 3;
            String str = this.f6930b;
            ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 18).append("Container ").append(str).append(" loaded.").toString());
        } else {
            aix.this.f6897n = 4;
            String strValueOf = String.valueOf(this.f6930b);
            ahs.m7942a(strValueOf.length() != 0 ? "Error loading container:".concat(strValueOf) : new String("Error loading container:"));
        }
        while (!aix.this.f6898o.isEmpty()) {
            aix.this.f6890g.execute((Runnable) aix.this.f6898o.remove());
        }
    }
}
