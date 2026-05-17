package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbu;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ai */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0698ai implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4436a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1541eu f4437b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ BinderC0692ac f4438c;

    RunnableC0698ai(BinderC0692ac binderC0692ac, String str, C1541eu c1541eu) {
        this.f4438c = binderC0692ac;
        this.f4436a = str;
        this.f4437b = c1541eu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4438c.f4405e.f4534t.get(this.f4436a).mo10753a((cbu) this.f4437b.f10522B);
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
