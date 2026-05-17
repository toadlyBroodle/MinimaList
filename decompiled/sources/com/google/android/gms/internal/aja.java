package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class aja implements Runnable {

    /* JADX INFO: renamed from: a */
    private boolean f6904a = false;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6905b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Bundle f6906c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6907d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ long f6908e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ String f6909f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ aiz f6910g;

    aja(aiz aizVar, String str, Bundle bundle, String str2, long j, String str3) {
        this.f6910g = aizVar;
        this.f6905b = str;
        this.f6906c = bundle;
        this.f6907d = str2;
        this.f6908e = j;
        this.f6909f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6910g.f6903a.f6897n == 3) {
            this.f6910g.f6903a.f6889f.m8061a(this.f6905b, this.f6906c, this.f6907d, this.f6908e, true);
            return;
        }
        if (this.f6910g.f6903a.f6897n == 4) {
            ahs.m7947d(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", this.f6905b, this.f6907d, this.f6906c));
            try {
                this.f6910g.f6903a.f6887d.mo12818a(this.f6907d, this.f6905b, this.f6906c, this.f6908e);
                return;
            } catch (RemoteException e) {
                agw.m7887a("Error logging event on measurement proxy: ", e, this.f6910g.f6903a.f6886c);
                return;
            }
        }
        if (this.f6910g.f6903a.f6897n != 1 && this.f6910g.f6903a.f6897n != 2) {
            agw.m7888b(new StringBuilder(28).append("Unexpected state:").append(this.f6910g.f6903a.f6897n).toString(), this.f6910g.f6903a.f6886c);
        } else {
            if (this.f6904a) {
                agw.m7888b("Invalid state - not expecting to see a deferredevent during container loading.", this.f6910g.f6903a.f6886c);
                return;
            }
            ahs.m7947d(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", this.f6905b, this.f6909f, this.f6906c));
            this.f6904a = true;
            this.f6910g.f6903a.f6898o.add(this);
        }
    }
}
