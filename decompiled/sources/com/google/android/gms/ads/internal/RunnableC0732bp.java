package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cdv;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bp */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0732bp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cdv f4574a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0728bl f4575b;

    RunnableC0732bp(BinderC0728bl binderC0728bl, cdv cdvVar) {
        this.f4575b = binderC0728bl;
        this.f4574a = cdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4575b.f4405e.f4534t.get(this.f4574a.mo10624l()).mo10753a(this.f4574a);
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
