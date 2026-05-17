package com.google.android.gms.internal;

import com.google.android.gms.internal.aix;

/* JADX INFO: loaded from: classes.dex */
final class ajd implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6919a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6920b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6921c = null;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ aix f6922d;

    ajd(aix aixVar, String str, String str2, String str3) {
        this.f6922d = aixVar;
        this.f6919a = str;
        this.f6920b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f6919a;
        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 28).append("Starting to load container ").append(str).append(".").toString());
        if (this.f6922d.f6897n != 1) {
            agw.m7888b("Unexpected state - container loading already initiated.", this.f6922d.f6886c);
        } else {
            this.f6922d.f6897n = 2;
            this.f6922d.f6889f.m8062a(this.f6919a, this.f6920b, this.f6921c, new aix.BinderC1366b(this.f6922d, null));
        }
    }
}
