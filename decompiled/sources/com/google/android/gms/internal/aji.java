package com.google.android.gms.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class aji implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Uri f6927a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aix f6928b;

    aji(aix aixVar, Uri uri) {
        this.f6928b = aixVar;
        this.f6927a = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strValueOf = String.valueOf(this.f6927a);
        ahs.m7947d(new StringBuilder(String.valueOf(strValueOf).length() + 25).append("Preview requested to uri ").append(strValueOf).toString());
        synchronized (this.f6928b.f6894k) {
            if (this.f6928b.f6897n == 2) {
                ahs.m7947d("Still initializing. Defer preview container loading.");
                this.f6928b.f6898o.add(this);
                return;
            }
            String str = (String) this.f6928b.m8037b((String[]) null).first;
            if (str == null) {
                ahs.m7944b("Preview failed (no container found)");
                return;
            }
            if (!this.f6928b.f6892i.m7975a(str, this.f6927a)) {
                String strValueOf2 = String.valueOf(this.f6927a);
                ahs.m7944b(new StringBuilder(String.valueOf(strValueOf2).length() + 73).append("Cannot preview the app with the uri: ").append(strValueOf2).append(". Launching current version instead.").toString());
                return;
            }
            if (!this.f6928b.f6899p) {
                String strValueOf3 = String.valueOf(this.f6927a);
                ahs.m7947d(new StringBuilder(String.valueOf(strValueOf3).length() + 84).append("Deferring container loading for preview uri: ").append(strValueOf3).append("(Tag Manager has not been initialized).").toString());
                return;
            }
            String strValueOf4 = String.valueOf(this.f6927a);
            ahs.m7946c(new StringBuilder(String.valueOf(strValueOf4).length() + 36).append("Starting to load preview container: ").append(strValueOf4).toString());
            if (!this.f6928b.f6889f.m8063a()) {
                ahs.m7944b("Failed to reset TagManager service for preview");
                return;
            }
            aix.m8036a(this.f6928b, false);
            this.f6928b.f6897n = 1;
            this.f6928b.m8046a();
        }
    }
}
