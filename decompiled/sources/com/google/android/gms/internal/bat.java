package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.firebase.crash.FirebaseCrash;

/* JADX INFO: loaded from: classes.dex */
public final class bat extends bar {

    /* JADX INFO: renamed from: c */
    private final Throwable f7700c;

    /* JADX INFO: renamed from: d */
    private final bbc f7701d;

    public bat(Context context, FirebaseCrash.InterfaceC2215a interfaceC2215a, Throwable th, bbc bbcVar) {
        super(context, interfaceC2215a);
        this.f7700c = th;
        this.f7701d = bbcVar;
    }

    @Override // com.google.android.gms.internal.bar
    /* JADX INFO: renamed from: a */
    protected final String mo8785a() {
        return "Failed to report uncaught exception";
    }

    @Override // com.google.android.gms.internal.bar
    /* JADX INFO: renamed from: a */
    protected final void mo8786a(baw bawVar) {
        if (this.f7701d != null) {
            this.f7701d.m8798a(true, System.currentTimeMillis());
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                Log.w("FirebaseCrash", "Failed to wait for analytics event to be logged");
                return;
            }
        }
        bawVar.mo8787a(BinderC0654c.m5329a(this.f7700c));
    }

    @Override // com.google.android.gms.internal.bar, java.lang.Runnable
    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
