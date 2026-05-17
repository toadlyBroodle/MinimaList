package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cdv;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.aj */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0699aj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cdv f4439a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0692ac f4440b;

    RunnableC0699aj(BinderC0692ac binderC0692ac, cdv cdvVar) {
        this.f4440b = binderC0692ac;
        this.f4439a = cdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4440b.f4405e.f4534t.get(this.f4439a.mo10624l()).mo10753a(this.f4439a);
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
