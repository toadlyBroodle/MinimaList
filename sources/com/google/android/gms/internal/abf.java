package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abf implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6267a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abd f6268b;

    abf(abd abdVar, String str) {
        this.f6268b = abdVar;
        this.f6267a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        C2083yw c2083ywM12734b = this.f6268b.m7551q().m12734b(this.f6267a);
        if (c2083ywM12734b != null) {
            return c2083ywM12734b.m12627c();
        }
        this.f6268b.m7540f().m7401A().m7412a("App info was null when attempting to get app instance id");
        return null;
    }
}
