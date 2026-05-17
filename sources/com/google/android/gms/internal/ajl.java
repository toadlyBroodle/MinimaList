package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class ajl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6937a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6938b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6939c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ ahk f6940d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ ajk f6941e;

    ajl(ajk ajkVar, String str, String str2, String str3, ahk ahkVar) {
        this.f6941e = ajkVar;
        this.f6937a = str;
        this.f6938b = str2;
        this.f6939c = str3;
        this.f6940d = ahkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        try {
            if (!this.f6941e.f6932a.containsKey(this.f6937a)) {
                this.f6941e.f6932a.put(this.f6937a, this.f6941e.f6934c.m7877a(this.f6937a, this.f6938b, this.f6939c));
            }
        } catch (Throwable th) {
            agw.m7887a("Fail to load container: ", th, this.f6941e.f6936e);
            z = false;
        }
        try {
            if (this.f6940d != null) {
                this.f6940d.mo7930a(z, this.f6937a);
            }
        } catch (RemoteException e) {
            agw.m7887a("Error relaying callback: ", e, this.f6941e.f6936e);
        }
    }
}
