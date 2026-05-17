package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class ajc implements Runnable {

    /* JADX INFO: renamed from: a */
    private boolean f6912a = false;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6913b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Bundle f6914c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6915d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ long f6916e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ String f6917f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ ajb f6918g;

    ajc(ajb ajbVar, String str, Bundle bundle, String str2, long j, String str3) {
        this.f6918g = ajbVar;
        this.f6913b = str;
        this.f6914c = bundle;
        this.f6915d = str2;
        this.f6916e = j;
        this.f6917f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6918g.f6911a.f6897n == 3) {
            this.f6918g.f6911a.f6889f.m8061a(this.f6913b, this.f6914c, this.f6915d, this.f6916e, false);
            return;
        }
        if (this.f6918g.f6911a.f6897n != 1 && this.f6918g.f6911a.f6897n != 2) {
            if (this.f6918g.f6911a.f6897n == 4) {
                ahs.m7947d(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", this.f6913b, this.f6917f, this.f6914c));
                return;
            } else {
                agw.m7888b(new StringBuilder(28).append("Unexpected state:").append(this.f6918g.f6911a.f6897n).toString(), this.f6918g.f6911a.f6886c);
                return;
            }
        }
        if (this.f6912a) {
            ahs.m7944b("Invalid state - not expecting to see a deferred event during container loading.");
            return;
        }
        ahs.m7947d(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", this.f6913b, this.f6917f, this.f6914c));
        this.f6912a = true;
        this.f6918g.f6911a.f6898o.add(this);
    }
}
